package org.reuseware.sokan.index.indexer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.util.IndexUtil;

/**
 * The dependency manager is responsible for calculating the dependencies
 * between all indexers registered with an indexer manager.
 */
public class DependencyManager {
	
	private IndexerManager indexerManager;

	/**
	 * Create a new dependency manager for the given index manager.
	 * 
	 * @param indexerManager the index manager
	 */
	public DependencyManager(IndexerManager indexerManager) {
		this.indexerManager = indexerManager;
	}
	
	/**
	 * Calculate the dependencies of indexers in the
	 * context of the given commit cache. This method
	 * expands the commit cache with the calculated result.
	 * 
	 * @param indexers list of indexers of interest
	 * @param cache the commit cache
	 */
	public void calculateDependenciesOfUpdatedArtifacts(
			List<Indexer> indexers,
			CommitCache cache) {

		// System.out.println("=== DEPENDENCIES ===");

		List<ID> toConsider = new ArrayList<ID>();
		toConsider.addAll(cache.getUpdateMap().keySet());
		Set<ID> deletedIDs = cache.extractDeletedIDs();
		toConsider.addAll(deletedIDs);
		
		for (ID artifactID : toConsider) {
			IndexRow oldRow = IndexUtil.INSTANCE.getIndex(artifactID);
			if (oldRow == null) {
				//this is a new artifact and there can not be old dependencies
				continue;
			}
			
			List<Indexer> indexersToAsk = new ArrayList<Indexer>();
			if (cache.getUpdateMap().containsKey(artifactID)) {
				Iterator<Indexer> i = cache.getUpdateMap().get(artifactID).iterator();
				while (i.hasNext()) {
					Indexer next = i.next();
					if (indexers.contains(next)) {
						indexersToAsk.add(next);
					}
				}	
			} else if (deletedIDs.contains(artifactID)) {
				indexersToAsk.addAll(indexers);
			}
			Map<ID, List<Indexer>> newDependencies = 
				getDependencies(artifactID, indexersToAsk);
			
			//add new dependencies to cache
			for (Entry<ID, List<Indexer>> newEntry : newDependencies.entrySet()) {
				ID id = newEntry.getKey();
				List<Indexer> newIndexers = newEntry.getValue();
				List<Indexer> cacheIndexers = cache.getUpdateMap().get(id);
				
				if (cacheIndexers == null) {
					cache.getUpdateMap().put(id, newIndexers);	
				} else {
					for (Indexer indexer : newEntry.getValue()) {
						if (!cacheIndexers.contains(indexer)) {
							cacheIndexers.add(indexer);
						} else {
							if (indexers.contains(indexer)) {
								System.err.println("ERROR: Indexer dependency in same phase " + indexer.getClass().getSimpleName());
							}
						}
					}
				}

			}
		}

		// System.out.println("====================");
		// System.out.println();
	}
	
	private Map<ID, List<Indexer>> getDependencies(ID artifactID, List<Indexer> indexers) {

		Map<ID, List<Indexer>> directDependentArtifacts = new LinkedHashMap<ID, List<Indexer>>();
		DependencyMap newDeps;

		for (Indexer indexer : indexers) {
			newDeps = new DependencyMap();

			State.setCalcDep();
			indexer.getDependent(artifactID, newDeps);
			
			//if (!newDeps.isEmpty()) {
				// System.out.println("- " + indexer.getClass().getSimpleName() + ":" + artifactID + ": " 
				//		+ "(" +  newDeps.getDependencies().size() + ") " +  newDeps.getDependencies());
			//}
			
			State.unsetCalcDep();

			if (newDeps.isEmpty()) {
				continue;
			}

			for (Entry<ID, Set<String>> newDep : newDeps.getDependencies().entrySet()) {
				ID key = newDep.getKey();

				if (directDependentArtifacts.containsKey(key)) {
					// try to add indexer id to Set<String>
					directDependentArtifacts.get(key).addAll(
							indexerManager.getIndexers(newDep.getValue(), true));
				} else {
					// add complete mapping ID,List<String> to dependents-Map
					directDependentArtifacts.put(
							key, indexerManager.getIndexers(newDep.getValue(), true));
				}
			}
		}

		return directDependentArtifacts;
	}
}
