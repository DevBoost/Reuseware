package org.reuseware.sokan.index.indexer;

import java.util.List;

/**
 * Configuration of an indexer and its dependencies.
 */
public class IndexerConfiguration {
	
	private Indexer indexer;
	private String iD;
	private List<String> dependencies;
	
	/**
	 * Create a new index configuration for the given indexer, id, and dependencies.
	 * 
	 * @param indexer the indexer
	 * @param iD the indexer's ID
	 * @param dependencies the indexer's dependencies (as IDs)
	 */
	public IndexerConfiguration(
			Indexer indexer, String iD, List<String> dependencies) {
		this.indexer = indexer;
		this.iD = iD;
		this.dependencies = dependencies;
	}

	/**
	 * @return the indexer
	 */
	public Indexer getIndexer() {
		return indexer;
	}

	/**
	 * @return the ID
	 */
	public String getId() {
		return iD;
	}

	/**
	 * @return list of dependencies (as IDs)
	 */
	public List<String> getDependencies() {
		return dependencies;
	}

	
}
