package org.reuseware.sokan.index.solr;

import java.util.Collection;
import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.persister.Persister;

/**
 * A Sokan persister implementation based on Solr.
 */
public class SolrPersister implements Persister {
	
	private final SolrControler solrController = SolrControler.INSTANCE;
	private SolrServer server;

	/**
	 * The constructor.
	 */
	public SolrPersister() { }

	private void ini() {
		if (server == null) {
			server = solrController.getServer();
		}
	}

	/**
	 * Commits the given transaction to the index.
	 * 
	 * @param indexTransaction the index transaction
	 * @return true if the commit succeeded
	 */
	public boolean commit(IndexTransaction indexTransaction) {
		ini();

		if (indexTransaction == null) {
			return true;
		}

		List<IndexRow> addRows = indexTransaction.getAddArtifacts();
		List<IndexRow> updRows = indexTransaction.getUpdateArtifacts();
		List<ID> oldArtifacts = indexTransaction.getRemArtifacts();
		boolean remove = false;
		boolean add = false;
		boolean update = false;

		try {
			if (oldArtifacts != null && oldArtifacts.size() > 0) {
				remove = true;
				server.deleteById(SolrUtil.toStringList(oldArtifacts));
			}

			if (addRows != null && addRows.size() > 0) {
				add = true;
				server.add(SolrUtil.toSolrDocs(addRows));
			}

			if (updRows != null && updRows.size() > 0) {
				update = true;
				server.add(SolrUtil.toSolrDocs(updRows));
			}

			if (remove || add || update) {
				server.commit();
			}
		} catch (Exception e) {
			SokanIndexPlugin.logError(
					"Something went wrong committing to Solr index.", e);
			return false;
		}

		return true;
	}

	/**
	 * @return the complete index
	 */
	public List<IndexRow> queryAll() {
		ini();

		List<IndexRow> back = solrController.query();
		return back;
	}

	/**
	 * @param request a query on the index as facet request
	 * @return the query result
	 */
	public FacetedResponse queryAll(FacetedRequest request) {
		return FacetedBrowsing.query(request);
	}

	/**
	 * Queries for the index row of the artifact with the given ID.
	 * 
	 * @param artifactID the artifact's ID
	 * @return the artifact's index row
	 */
	public IndexRow queryArtifact(ID artifactID) {
		ini();

		return solrController.query(artifactID);
	}

	/**
	 * Queries for all index rows of the artifacts with the given IDs.
	 * 
	 * @param artifactIDs the artifacts' IDs
	 * @return the artifacts' index rows
	 */
	public List<IndexRow> queryArtifacts(Collection<ID> artifactIDs) {
		ini();

		return solrController.query(artifactIDs);
	}

	/**
	 * Shutdown the Solr server.
	 */
	public void shutdown() {
		ini();

		solrController.stopServer();
	}

	/**
	 * @return the Solr index size.
	 */
	public int getIndexSize() {
		ini();
		
		return solrController.getSize();
	}
}
