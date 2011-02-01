package org.reuseware.sokan.index.indexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.CoreUtil;

/**
 * The index sorter is responsible for sorting indexers according
 * to dependencies between them.
 */
public class IndexerSorter {

	/**
	 * Maps indexerID to iConfig.
	 */
	private Map<String, IndexerConfiguration> idMap;

	/**
	 * Maps indexerID to list of in-going indexerIDs <br>
	 * all indexers that this indexer depends on.
	 */
	private HashMap<String, Set<String>> dependIn;

	/**
	 * Maps indexerID to list of out-going indexerIDs <br>
	 * all indexer that depend on this indexer.
	 */
	private Map<String, Set<String>> dependOut;

	/**
	 * Queue of indexerIDs sorted by dependInCount.
	 */
	private List<String> unsorted;

	/**
	 * Queue of sorted indexerIDs to retrieve by method sort()
	 */
	// private Queue<IndexerConfiguration> sorted;

	/**
	 * Linked list of linked list of sorted indexerIDs <br>
	 * every inner list represents one index creation phase after which a commit
	 * is needed.
	 */
	private List<List<IndexerConfiguration>> sortedNew;

	/**
	 * Indexer dependency cycles.
	 */
	private List<TreeSet<String>> cycles;

	private class IndexerComparator<T> implements Comparator<T> {
		public int compare(T obj1, T obj2) {
			if (obj1.equals(obj2)) {
				return 0;
			}
			if (!(obj1 instanceof String) || !(obj2 instanceof String)) {
				return 0;
			}
			String id1 = (String) obj1;
			String id2 = (String) obj2;

			int count1 = getOutCount(id1);
			int count2 = getOutCount(id2);

			if (count1 < count2) {
				return count1 - count2;
			}
			if (count1 > count2) {
				return count1 - count2;
			}
			// return 0;

			if (id1.compareTo(id2) < 0) {
				return -1;
			}
			if (id1.compareTo(id2) > 0) {
				return 1;
			}
			return 0;
		}
	}

	/**
	 * Splits the given list of indexer into chunks according to their dependencies.
	 * Indexers that are grouped into one list, are independent and can be executed together
	 * between two index commits.
	 * 
	 * @param indexerConfigs the indexers to sort
	 * @return the indexrs sorted into sub-lists according to their dependencies
	 */
	public List<List<IndexerConfiguration>> sort(
			List<IndexerConfiguration> indexerConfigs) {

		List<List<IndexerConfiguration>> mySorted = new LinkedList<List<IndexerConfiguration>>();
		if (indexerConfigs == null || indexerConfigs.size() == 0) {
			return mySorted;
		}
		if (indexerConfigs.size() == 1) {
			LinkedList<IndexerConfiguration> singleCommitPhase = new LinkedList<IndexerConfiguration>();
			singleCommitPhase.add(indexerConfigs.get(0));
			mySorted.add(singleCommitPhase);
			return mySorted;
		}

		buildDataStructures(indexerConfigs);

		removeCycles();
		performSort();

		return sortedNew;
	}

	private void buildDataStructures(List<IndexerConfiguration> indexerConfigs) {
		// build idMap
		idMap = new TreeMap<String, IndexerConfiguration>();
		for (IndexerConfiguration iConfig : indexerConfigs) {
			idMap.put(iConfig.getId(), iConfig);
		}
		// build sorted
		// sorted = new LinkedList<IndexerConfiguration>();
		sortedNew = new LinkedList<List<IndexerConfiguration>>();

		dependIn = new HashMap<String, Set<String>>(indexerConfigs.size());
		dependOut = new HashMap<String, Set<String>>(indexerConfigs.size());
		List<String> parentIndexerList;
		Set<String> parents;
		Set<String> children;

		for (Entry<String, IndexerConfiguration> idPair : idMap.entrySet()) {
			// pre-calculations			
			parentIndexerList = new LinkedList<String>();
			for (String dependencyID : idPair.getValue().getDependencies()) {
				parentIndexerList.add(dependencyID);
			}
			
			
			for (String parent : new ArrayList<String>(parentIndexerList)) {
				if (idMap.get(parent) == null) {
					parentIndexerList.remove(parent);
				}
			}
			if (parentIndexerList == null || parentIndexerList.size() == 0) {
				continue;
			}
			parents = new TreeSet<String>();
			parents.addAll(parentIndexerList);

			// build dependOut
			dependOut.put(idPair.getKey(), parents);

			// build dependIn
			for (String parentID : parents) {
				children = dependIn.get(parentID);
				if (children != null) {
					children.add(idPair.getKey());
				} else {
					children = new TreeSet<String>();
					children.add(idPair.getKey());
					dependIn.put(parentID, children);
				}
			}
		}

		// build unsorted
		unsorted = new LinkedList<String>();
		unsorted.addAll(idMap.keySet());
	}

	private void removeCycles() {
		this.cycles = new LinkedList<TreeSet<String>>();

		// detect cycles
		List<String> visited = new LinkedList<String>();
		List<String> idCache;

		Collections.sort(unsorted, new IndexerComparator<String>());
		Collections.reverse(unsorted);
		for (String id : unsorted) {

			if (visited.contains(id)) {
				continue;
			}
			idCache = new LinkedList<String>();
			idCache.add(id);
			visited.add(id);

			split(idCache, visited, dependOut.get(id));
		}

		// cut cycles
		for (TreeSet<String> cycle : cycles) {
			cutOutGoingConnection(cycle.first(), new ArrayList<String>(cycle));
		}

		// refresh sorting
		Collections.sort(unsorted, new IndexerComparator<String>());
	}

	private void performSort() {
		if (idMap == null) {
			return;
		}
		LinkedList<String> commitPhase = new LinkedList<String>();
		String focusID;
		int outCount;
		Set<String> children;
		Set<String> parents;

		while (unsorted.size() > 0 || commitPhase.size() > 0) {
			focusID = unsorted.size() == 0 ? null : unsorted.get(0);
			outCount = getOutCount(focusID);

			if (outCount == 0) {
				commitPhase.add(focusID);
				unsorted.remove(0);
				continue;
			}

			// cut dependOut of children
			for (String id : commitPhase) {
				children = dependIn.get(id);
				if (children != null) {
					for (String childID : children) {
						parents = dependOut.get(childID);
						parents.remove(id);
					}
				}
			}
			if (unsorted.size() > 1) {
				Collections.sort(unsorted, new IndexerComparator<String>());
			}
			// add commitPhase to sorted
			sortedNew.add(adapt(commitPhase));

			// create new commitPhase
			commitPhase = new LinkedList<String>();

			// check for cycle
			if (unsorted.size() > 0 && getOutCount(unsorted.get(0)) > 0) {
				SokanIndexPlugin.logError(
						"Cycle in indexer dependencies detected - "
						+ "check extensions for 'org.reuseware.sokan.index'", null);
				break;
			}
		}
	}

	private void split(List<String> idCache, List<String> visited,
			Set<String> parents) {
		if (parents == null) {
			return;
		}
		for (String parent : parents) {
			// check for cycle
			if (idCache.contains(parent)) {
				idCache.add(parent);
				handleCycle(idCache);
				idCache.remove(idCache.size() - 1);
				continue;
			}

			// split idCache
			List<String> newIDCache = new LinkedList<String>();
			newIDCache.addAll(idCache);
			newIDCache.add(parent);

			// add to visited and next split
			visited.add(parent);
			split(newIDCache, visited, dependOut.get(parent));
		}
	}

	private void handleCycle(List<String> newCycle) {
		if (newCycle == null || newCycle.size() == 0) {
			return;
		}
		List<String> myCycle = new LinkedList<String>();
		myCycle.addAll(newCycle);

		String first = myCycle.get(0);
		String last = myCycle.get(myCycle.size() - 1);
		while (!first.equals(last)) {
			myCycle.remove(0);
			first = myCycle.get(0);
		}

		TreeSet<String> cycleSet = new TreeSet<String>();
		cycleSet.addAll(myCycle);

		for (TreeSet<String> oldCycle : cycles) {
			if (CoreUtil.equal(oldCycle, cycleSet)) {
				return;
			}
		}

		cycles.add(cycleSet);
	}

	private int getOutCount(String id) {
		if (id == null) {
			return -1;
		}
		Set<String> parents = dependOut.get(id);
		if (parents == null) {
			return 0;
		}
		return parents.size();
	}

	private void cutOutGoingConnection(String indexerID,
			List<String> allowedParents) {

		Set<String> parents = dependOut.get(indexerID);
		String parentID = null;
		for (String parent : parents) {
			if (allowedParents == null) {
				parentID = parent;
				break;
			}
			if (allowedParents.contains(parent)) {
				parentID = parent;
				break;
			}
		}
		if (parentID == null) {
			return;
		}
		parents.remove(parentID);

		Set<String> children = dependIn.get(parentID);
		children.remove(indexerID);
	}

	private LinkedList<IndexerConfiguration> adapt(LinkedList<String> idList) {
		if (idList == null) {
			return null;
		}
		LinkedList<IndexerConfiguration> configList = new LinkedList<IndexerConfiguration>();
		for (String id : idList) {
			configList.add(idMap.get(id));
		}

		return configList;
	}
}
