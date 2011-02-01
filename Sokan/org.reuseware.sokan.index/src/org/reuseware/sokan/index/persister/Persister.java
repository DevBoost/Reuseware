package org.reuseware.sokan.index.persister;

import java.util.Collection;
import java.util.List;

import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;

/**
 * A persister is responsible for persisting index transaction
 * in a physical index and to query that index.
 */
public interface Persister {

	/**
	 * Commits the given transaction to the index.
	 * 
	 * @param indexTransaction the index transaction
	 * @return true if the commit succeeded
	 */
	boolean commit(IndexTransaction indexTransaction);

	/**
	 * @return the complete index
	 */
	List<IndexRow> queryAll();

	/**
	 * @param request a query on the index as facet request
	 * @return the query result
	 */
	FacetedResponse queryAll(FacetedRequest request);

	/**
	 * Queries for the index row of the artifact with the given ID.
	 * 
	 * @param artifactID the artifact's ID
	 * @return the artifact's index row
	 */
	IndexRow queryArtifact(ID artifactID);

	/**
	 * Queries for all index rows of the artifacts with the given IDs.
	 * 
	 * @param artifactIDs the artifacts' IDs
	 * @return the artifacts' index rows
	 */
	List<IndexRow> queryArtifacts(Collection<ID> artifactIDs);

	/**
	 * Shutdown the indexing system.
	 */
	void shutdown();

	/**
	 * @return the index size.
	 */
	int getIndexSize();
}
