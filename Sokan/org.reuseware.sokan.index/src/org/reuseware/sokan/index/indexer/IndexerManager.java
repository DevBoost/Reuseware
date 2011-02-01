package org.reuseware.sokan.index.indexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.persister.PersistencyManager;
import org.reuseware.sokan.index.util.CoreUtil;

/**
 * The index manager manages the registration of indexers.
 */
public class IndexerManager {

	private MetaDataManager metaDataManager;
	private DependencyManager depManager;
	private IndexerSorter indexerSorter;
	private MultiPhaseCommit multiPhase;

	private Map<String, Indexer> allNormalIndexers = null;
	private Map<String, Indexer> allCalledIndexers = null;
	private Map<String, IndexerConfiguration> allIndexerConfigs;

	private Map<String, Object> loadOptions = null;

	/**
	 * Creates a new index manager that uses the given
	 * persistency manager for index access.
	 * 
	 * @param persistencyManager the persistency manager
	 */
	public IndexerManager(PersistencyManager persistencyManager) {
		initIndexers();
		initLoadOptions();
		
		indexerSorter = new IndexerSorter();
		metaDataManager = new MetaDataManager(getIndexers(null, false));
		depManager = new DependencyManager(this);
		multiPhase = new MultiPhaseCommit(depManager, metaDataManager,
				persistencyManager, this);
	}
	
	/**
	 * Set a load option that will be used for loading and
	 * saving resources. 
	 * 
	 * @param option the option to set
	 * @param value the value of the option
	 */
	public void addLoadOption(String option, boolean value) {
		loadOptions.put(option, value);
	}
	
	/**
	 * Registers a new indexer.
	 * 
	 * @param indexerConfiguration the index configuration that contains 
	 *                             the indexer with its dependencies
	 */
	public void addIndexer(IndexerConfiguration indexerConfiguration) {
		String indexerID = indexerConfiguration.getId();
		Indexer indexer = indexerConfiguration.getIndexer();
		allIndexerConfigs.put(indexerID, indexerConfiguration);
		if (indexer instanceof CalledIndexer) {
			allCalledIndexers.put(indexerID, indexer);
		} else {
			allNormalIndexers.put(indexerID, indexer);
		}
	}
	
	/**
	 * @return all registered indexers
	 */
	public List<IndexerConfiguration> getIndexerConfigurations() {
		return new ArrayList<IndexerConfiguration>(allIndexerConfigs.values());
	}
	
	/**
	 * Commits the given index cache to the index.
	 * 
	 * @param cache the index cache
	 * @param monitor a monitor to record progress
	 * 
	 * @return the IDs of all artifacts that have been updated in this commit
	 */
	public Set<ID> performCommit(CommitCache cache, IProgressMonitor monitor) {
		ResourceSet resourceSet = createNewResourceSet();
		int durationEstimation = cache.extractAllIDs().size() * getIndexerConfigurations().size() * 4;
		monitor.beginTask("Indexing Workspace", durationEstimation);
		Set<ID> delta = multiPhase.start(cache, resourceSet, 0, monitor);
		monitor.done();
		return delta;
	}

	private void initIndexers() {
		if (allNormalIndexers == null) {
			allNormalIndexers = new LinkedHashMap<String, Indexer>();
			allCalledIndexers = new LinkedHashMap<String, Indexer>();
			allIndexerConfigs = new LinkedHashMap<String, IndexerConfiguration>();
			
			List<IndexerConfiguration> configs = CoreUtil.findIndexer();

			Indexer indexer;
			String indexerID;
			for (IndexerConfiguration elem : configs) {
				indexerID = elem.getId();
				indexer = elem.getIndexer();
				allIndexerConfigs.put(indexerID, elem);
				if (indexer instanceof CalledIndexer) {
					allCalledIndexers.put(indexerID, indexer);
				} else {
					allNormalIndexers.put(indexerID, indexer);
				}
			}
		}
	}
	
	private void initLoadOptions() {
		if (loadOptions == null) {
			loadOptions = CoreUtil.findLoadOptions();
		}
	}

	/**
	 * Finds the indexers with the given IDs.
	 * 
	 * @param indexerIDs the indexers' IDs
	 * @param includeCalledIndexers true if called indexers should be included
	 * @return the indexers with the given IDs
	 */
	public List<Indexer> getIndexers(Collection<String> indexerIDs, boolean includeCalledIndexers) {
		boolean allIndexersWanted = (indexerIDs == null || indexerIDs.size() == 0);
		if (allIndexersWanted && !includeCalledIndexers) {
			return new ArrayList<Indexer>(allNormalIndexers.values());
		}
		
		Map<String, Indexer> allIndexers = new LinkedHashMap<String, Indexer>();
		allIndexers.putAll(allNormalIndexers);
		allIndexers.putAll(allCalledIndexers);
		if (allIndexersWanted) {
			return new ArrayList<Indexer>(allIndexers.values());
		}

		List<Indexer> myIndexers = new ArrayList<Indexer>();
		Indexer indexer;
		for (String indexerID : indexerIDs) {
			indexer = allIndexers.get(indexerID);
			if (indexer != null) {
				myIndexers.add(indexer);
			}
		}
		
		return myIndexers;
	}
	
	/**
	 * Finds the indexer with the given IDs.
	 * 
	 * @param indexerID the indexer's IDs
	 * @return the indexer with the given ID
	 */
	public Indexer getIndexer(String indexerID) {
		Indexer indexer = allNormalIndexers.get(indexerID);
		if (indexer != null) {
			return indexer;
		}
		indexer = allCalledIndexers.get(indexerID);
		return indexer;
	}
	
	/**
	 * @param indexer the indexer
	 * @return ID of the indexer
	 */
	public String getIndexerID(Indexer indexer) {
		for (String indexerID : allNormalIndexers.keySet()) {
			if (allNormalIndexers.get(indexerID).equals(indexer)) {
				return indexerID;
			}
		}
		for (String indexerID : allCalledIndexers.keySet()) {
			if (allCalledIndexers.get(indexerID).equals(indexer)) {
				return indexerID;
			}
		}
		return null;
	}
	
	/**
	 * @return time stamp of the current commit
	 */
	public String getTimeStamp() {
		return multiPhase.getCommitTimeStamp();
	}

	/**
	 * Sorts the given list of indexers according to commit phases.
	 * 
	 * @param indexerList list of indexers
	 * @return sorted list of index sub-lists
	 */
	public List<List<Indexer>> sortByPhases(List<Indexer> indexerList) {
		if (indexerList == null) {
			return null;
		}
		List<IndexerConfiguration> cofigList = 
			getIndexerConfigurations(indexerList);
		
		List<List<IndexerConfiguration>> sortedConfigs = 
			indexerSorter.sort(cofigList);

		List<List<Indexer>> sortedIndexer;
		sortedIndexer = new ArrayList<List<Indexer>>();
		List<String> commitPhaseIDs;

		for (List<IndexerConfiguration> phase : sortedConfigs) {
			commitPhaseIDs = new ArrayList<String>();
			for (IndexerConfiguration iConfig : phase) {
				String indexerID = iConfig.getId();
				commitPhaseIDs.add(indexerID);
			}
			sortedIndexer.add(new LinkedList<Indexer>(
					getIndexers(commitPhaseIDs, false)));
		}

		return sortedIndexer;
	}

	private List<IndexerConfiguration> getIndexerConfigurations(
			Collection<Indexer> indexers) {
		boolean allIndexersWanted = (indexers == null || indexers.size() == 0);
		if (allIndexersWanted) {
			return new ArrayList<IndexerConfiguration>(allIndexerConfigs.values());
		}
		List<IndexerConfiguration> indexerConfigs = new ArrayList<IndexerConfiguration>();
		IndexerConfiguration cofig;
		for (Indexer indexer : indexers) {
			cofig = allIndexerConfigs.get(getIndexerID(indexer));
			if (cofig != null) {
				indexerConfigs.add(cofig);
			}
		}

		return indexerConfigs;
	}

	/**
	 * @return the depManager
	 */
	public DependencyManager getDepManager() {
		return depManager;
	}

	/**
	 * @return true if indexing is in progress
	 */
	public boolean isIndexing() {
		return State.isCreating();
	}

	/**
	 * @return true if dependency calculation is in progress
	 */
	public boolean isCalculatingDependencies() {
		return State.isCalculatingDependencies();
	}
	
	/**
	 * Registers a new load option.
	 * 
	 * @param key the option's key
	 * @param value the option's value
	 */
	public void addLoadOption(String key, Object value) {
		loadOptions.put(key, value);
	}
	
	/**
	 * Initializes a new resource set with the registered
	 * load options.
	 * 
	 * @return the new resource set
	 */
	public ResourceSet createNewResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(loadOptions);
		return resourceSet;
	}
}
