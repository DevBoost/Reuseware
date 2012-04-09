/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index.persister;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.RowUtil;
import org.reuseware.sokan.index.util.SokanConst;

/**
 * The persistency manager is responsible for persisting the indexed meta data
 * and for retrieving it.
 */
public class PersistencyManager {

	private static final String PERSISTER_SOLR = "org.reuseware.sokan.index.solr";
	private static final String PERSISTER_PRINT = "org.reuseware.sokan.index.eg";
	private Persister persister;

	/**
	 * Constructs a persistency manager that automatically finds a persister.
	 */
	public PersistencyManager() {
		this.persister = findPersister();
	}
	
	/**
	 * Constructs a persistency manager that uses the given persister.
	 * 
	 * @param persister the persister to use
	 */
	public PersistencyManager(Persister persister) {
		this.persister = persister;
	}

	/**
	 * Check whether all given IDs belong to indexed artifacts.
	 * 
	 * @param resourceIDs the IDs to check
	 * @return true if all IDs belong to indexed artifacts.
	 */
	public boolean areArtifact(List<ID> resourceIDs) {
		if (resourceIDs == null) {
			return false;
		}
		List<IndexRow> index = null;
		try {
			index = query();
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
		}
		for (ID resID : resourceIDs) {
			if (RowUtil.findRowFor(resID, index) == null) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Commits the given index transaction.
	 * 
	 * @param trans the index transaction
	 * @return true if successful
	 */
	public boolean commit(IndexTransaction trans) {
		if (trans == null) {
			return false;
		}
		if (trans.getAddArtifacts().size() == 0
				&& trans.getUpdateArtifacts().size() == 0
				&& trans.getRemArtifacts().size() == 0) {
			return true;
		}
		if (!checkPersisterExists()) {
			return false;
		}
		return persister.commit(trans);
	}

	/**
	 * @return the size of the index
	 */
	public int getIndexSize() {
		if (!checkPersisterExists()) {
			return 0;
		}
		return persister.getIndexSize();
	}

	/**
	 * Check whether the given ID belong to an indexed artifact.
	 * 
	 * @param resourceID the ID to check
	 * @return true if the ID belong to indexed artifact.
	 */
	public boolean isArtifact(ID resourceID) {
		if (resourceID == null) {
			return false;
		}
		List<ID> ids = new ArrayList<ID>(1);
		ids.add(resourceID);
		return areArtifact(ids);
	}

	/**
	 * @return the complete index
	 */
	public List<IndexRow> query() {
		if (!checkPersisterExists()) {
			return null;
		}
		return persister.queryAll();
	}

	/**
	 * @param request the face request query to execute
	 * 
	 * @return the result of executing the given face request query
	 */
	public FacetedResponse query(FacetedRequest request) {
		if (!checkPersisterExists()) {
			return null;
		}
		return persister.queryAll(request);
	}

	/**
	 * Queries for the index row of the artifact with the given ID.
	 * 
	 * @param artifactID the artifact's ID
	 * @return the artifact's index row
	 */
	public IndexRow query(ID artifactID) {
		if (!checkPersisterExists()) {
			return null;
		}
		return persister.queryArtifact(artifactID);
	}

	/**
	 * Queries for all index rows of the artifacts with the given IDs.
	 * 
	 * @param artifactIDs the artifacts' IDs
	 * @return the artifacts' index rows
	 */
	public List<IndexRow> query(Collection<ID> artifactIDs) {
		if (!checkPersisterExists()) {
			return null;
		}	
		return persister.queryArtifacts(artifactIDs);
	}

	/**
	 * Shutdown the indexing system.
	 */
	public void shutdownServer() {
		if (!checkPersisterExists()) {
			return;
		}
		persister.shutdown();
	}

	private Persister findPersister() {
		if (Platform.isRunning()) {
			IConfigurationElement[] config = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(SokanConst.EXP_INDEX_ID);
			for (IConfigurationElement confElem : config) {
				if (confElem.getName().equals(SokanConst.EXT_PERSISTER)
						&& (confElem.getNamespaceIdentifier().equals(
								PERSISTER_PRINT) || confElem
								.getNamespaceIdentifier()
								.equals(PERSISTER_SOLR))) {
					try {
					return (Persister) confElem
							.createExecutableExtension("class");
					} catch (CoreException e) {
						SokanIndexPlugin.logError("Cannot instantiate persister"
								+ confElem.getAttribute("class"), e);
						return null;
					}
				}
			}
		}
		return null;
	}
	
	private boolean checkPersisterExists() {
		if (persister == null) {
			SokanIndexPlugin.logError("No Persister registered. "
					+ "Index cann't be committed.", null);
			return false;
		}
		return true;
	}
}
