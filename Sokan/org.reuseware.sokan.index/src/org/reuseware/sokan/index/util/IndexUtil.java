/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.IndexCache;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.emodeler.EModelerManager;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.indexer.IndexerManager;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.index.notify.IndexNotifier;
import org.reuseware.sokan.index.persister.PersistencyManager;

/**
 * This class provides a number of methods to manipulate and query the index
 * maintained by Sokan. <br>
 * <br>
 * <b>Important Note:</b><br>
 * If you implement your own {@link Indexer} make sure, you don't run into an
 * infinite loop by invoking methods like {@link #getIndex()} or
 * {@link #getFacetedResponse(FacetedRequest)}. <br>
 * See {@link Indexer} for more information on this topic.
 * 
 */
public final class IndexUtil {
	
	/**
	 * The singleton instance.
	 */
	public static final IndexUtil INSTANCE = new IndexUtil();

	/**
	 * Problem marker ID for problem markers produced directly by Sokan.
	 */
	public static final String ID_PROBLEM_MARKER = SokanIndexPlugin.PLUGIN_ID + ".idProblem";

	private IndexerManager indexerManager;
	private PersistencyManager persistencyManager;
	private IndexNotifier notifier;

	private CommitCache comCache;
	private IndexCache indexCache;

	private IndexUtil() {
		persistencyManager = new PersistencyManager();
		indexerManager = new IndexerManager(persistencyManager);
		notifier = new IndexNotifier();

		comCache = new CommitCache();
		indexCache = new IndexCache();
	}

	/**
	 * Registers the artifact with the given URI in the index.
	 * 
	 * @param uri the URI
	 * @param instantUpdate true if the artifact should be instantly indexed
	 */
	public void add(URI uri, boolean instantUpdate) {
		if (uri == null) {
			return;
		}
		if (isArtifact(uri)) {
			if (isArtifact(uri) && !uri.equals(ResourceUtil.uriFrom(ResourceUtil.idFrom(uri)))) {
				return;
			}
		}
		if (!StoreUtil.INSTANCE.isInStore(uri)) {
			return;
		}
		if (instantUpdate) {
			CommitCache cache = new CommitCache();
			cache.getNewResources().add(uri);
			commitIndex(cache, new NullProgressMonitor());
		} else {
			comCache.getNewResources().add(uri);
		}
	}
	
	/**
	 * Registers the artifact with the given URI in the index.
	 * 
	 * @param uri the URI
	 */
	public void addArtifact(URI uri) {
		add(uri, false);
	}

	/**
	 * Registers the artifact represented by the given Eclipse resource in the index.
	 * 
	 * @param resource the Eclipse resource
	 */
	public void addArtifact(IResource resource) {
		try {
			resource.deleteMarkers(ID_PROBLEM_MARKER, false, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
		}
		if (isArtifact(resource) && !ResourceUtil.uriFrom(resource).equals(ResourceUtil.uriFrom(ResourceUtil.idFrom(resource)))) {
			reportIDAlreadyTakenError(resource);
			return;
		}
		add(ResourceUtil.uriFrom(resource), false);
	}
	
	/**
	 * Retrieves <code>true</code> if each of the given <code>ID</code>s
	 * represent an artifact in the index.
	 * 
	 * @param resourceIDs
	 *            A list of artifact identifiers build from resources.
	 * @return <code>true</code> if all resourceIDs are artifactIDs.
	 */
	public boolean areArtifactsID(List<ID> resourceIDs) {
		if (resourceIDs == null) {
			return false;
		}
		return persistencyManager.areArtifact(resourceIDs);
	}

	/**
	 * Retrieves <code>true</code> if each of the given <code>IResource</code>s
	 * is located in a Store and indexed.
	 * 
	 * @param resources
	 *            A list of resources.
	 * @return <code>true</code> if all resources are in a Store and indexed.
	 */
	public boolean areArtifactsRes(List<? extends IResource> resources) {
		if (resources == null || resources.isEmpty()) {
			return false;
		}
		List<ID> resIDs = new ArrayList<ID>(resources.size());
		for (IResource res : resources) {
			if (!StoreUtil.INSTANCE.isInStore(res)) {
				return false;
			}
			resIDs.add(ResourceUtil.idFrom(res));
		}

		return areArtifactsID(resIDs);
	}

	/**
	 * Retrieves the complete index.
	 * 
	 * @return A list of all index rows. 
	 */
	public List<IndexRow> getIndex() {
		List<IndexRow> rows;
		String lastCommit = indexerManager.getTimeStamp();

		rows = indexCache.getAll(lastCommit);
		if (rows == null) {
			rows = persistencyManager.query();
			indexCache.putAll(lastCommit, rows);
		}
		
		return rows;
	}

	/**
	 * Retrieves the part of the index that fulfills the {@link FacetedRequest}.
	 * 
	 * @param request
	 *            A faceted request to filter the index.
	 * @return A list of all clean index rows that are filtered by the faceted
	 *         request.
	 */
	public List<IndexRow> getIndex(FacetedRequest request) {
		if (request == null) {
			new LinkedList<IndexRow>();
		}
		FacetedResponse response = getFacetedResponse(request);
		if (response == null) {
			return new LinkedList<IndexRow>();
		}
		return response.getContent();
	}
	
	/**
	 * Retrieves the clean index row of this artifact.
	 * 
	 * @param artifactID
	 *            The artifact's identifier.
	 * @return The artifact's clean index row.
	 * @queryIndex
	 */
	public IndexRow getIndex(ID artifactID) {
		IndexRow row;
		String lastCommit = indexerManager.getTimeStamp();

		row = indexCache.getIndex(lastCommit, artifactID);
		if (row == null) {
			row = persistencyManager.query(artifactID);
			indexCache.putIndex(lastCommit, artifactID, row);
		}
		return row;
	}

	/**
	 * Retrieves the clean index rows of the given artifacts.
	 * 
	 * @param artifactIDs
	 *            The artifacts' IDs.
	 * @return The artifact's clean index row.
	 * @queryIndex
	 */
	public List<IndexRow> getIndex(Collection<ID> artifactIDs) {
		List<IndexRow> rows;
		String lastCommit = indexerManager.getTimeStamp();

		rows = indexCache.getIndex(lastCommit, artifactIDs);
		if (rows == null) {
			rows = persistencyManager.query(artifactIDs);
			indexCache.putIndex(lastCommit, artifactIDs, rows);
		}
		
		return rows;
	}
	
	/**
	 * Check if indexing is currently in progress.
	 * 
	 * @return <code>true</code>if indexing is currently in progress.
	 */
	public boolean isIndexing() {
		return indexerManager.isIndexing();
	}

	/**
	 * Retrieves a list of <code>EObject</code>s of the given
	 * <code>EClass</code> or <code>null</code> if no adequate {@link EModeler}
	 * is registered.
	 * 
	 * @see EModeler#createMetaDataModel(IndexRow)
	 * 
	 * @param artifactID
	 *            The artifact's identifier.
	 * @param eClass
	 *            The <code>EClass</code> <code>EObject</code>s are needed for.
	 * @param resourceSet the resource set to use
	 * @return the created model
	 */
	public List<EObject> getEModel(ID artifactID, EClass eClass,
			ResourceSet resourceSet) {
		IndexRow row = getIndex(artifactID);
		if (row == null) {
			return null;
		}
		return EModelerManager.createModel(eClass, row, resourceSet);
	}

	/**
	 * Retrieves a list of <code>EObject</code>s of the given
	 * <code>EClass</code> or <code>null</code> if no adequate {@link EModeler}
	 * is registered.
	 * 
	 * @see EModeler#createMetaDataModel(IndexRow)
	 * 
	 * @param row
	 *            The index row containing data to create the new
	 *            <code>EObjects</code>.
	 * @param eClass
	 *            The <code>EClass</code> <code>EObject</code>s are needed for.
	 * @param resourceSet the resource set to use
	 * @return the created model
	 */
	public List<EObject> getEModel(IndexRow row, EClass eClass,
			ResourceSet resourceSet) {
		if (row == null || eClass == null) {
			return null;
		}
		return EModelerManager.createModel(eClass, row, resourceSet);
	}

	/**
	 * Retrieves a clean {@link FacetedResponse} as a result of a
	 * {@link FacetedRequest}. This response contains the request along with
	 * other information needed by faceted browsers.
	 * 
	 * @param request
	 *            A faceted request to filter the index.
	 * @return A faceted response. If clean is <code>true</code> the response is
	 *         up-to-date, else some of the index rows might be out-of-date
	 *         making the whole response not representing the current state.
	 */
	public FacetedResponse getFacetedResponse(FacetedRequest request) {
		if (request == null) {
			return null;
		}
		FacetedResponse rsp;
		String lastCommit = indexerManager.getTimeStamp();

		rsp = indexCache.getResponse(lastCommit, request);
		if (rsp == null) {
			rsp = persistencyManager.query(request);
			indexCache.putResponse(lastCommit, request, rsp);
		}
		return rsp;
	}

	/**
	 * Removes the artifact with the given URI from the index.
	 * 
	 * @param uri the URI
	 * @param instantUpdate true if the artifact should be instantly removed
	 */
	public void remove(URI uri, boolean instantUpdate) {
		if (uri == null) {
			return;
		}
		// was this artifact indexed and not another one with the expected id
		if (!uri.equals(ResourceUtil.uriFrom(ResourceUtil.idFrom(uri)))) {
			return;
		}
		if (instantUpdate) {
			CommitCache cache = new CommitCache();
			cache.getDeletedResources().add(uri);
			commitIndex(cache, new NullProgressMonitor());
		} else {
			comCache.getDeletedResources().add(uri);
		}
	}

	/**
	 * Removes the artifact with the given URI from the index.
	 * 
	 * @param uri the URI
	 */
	public void removeArtifact(URI uri) {
		remove(uri, false);
	}
	
	/**
	 * Removes the artifact represented by the given Eclipse resource from the index.
	 * 
	 * @param resource the Eclipse resource
	 */
	public void removeArtifact(IResource resource) {
		remove(ResourceUtil.uriFrom(resource), false);
	}
	
	/**
	 * Removes the artifact represented by the given index row from the index.
	 * 
	 * @param row the index row
	 */
	public void removeArtifact(IndexRow row) {
		if (row == null) {
			return;
		}
		URI uri = ResourceUtil.uriFrom(row.getPhyURI());
		if (uri == null) {
			return;
		}
		comCache.getDeletedResources().add(uri);
	}

	/**
	 * Shutdown the index system.
	 */
	public void shutdownIndexServer() {
		persistencyManager.shutdownServer();
	}
	
	/**
	 * Updates the artifact with the given URI in the index.
	 * 
	 * @param uri the URI
	 * @param instantUpdate true if the artifact should be instantly re-indexed
	 */
	public void update(URI uri, boolean instantUpdate) {
		if (uri == null) {
			return;
		}
		if (instantUpdate) {
			CommitCache cache = new CommitCache();
			cache.getUpdatedResources().add(uri);
			commitIndex(cache, new NullProgressMonitor());
		} else {
			comCache.getUpdatedResources().add(uri);
		}
	}
	
	/**
	 * Updates the artifact with the given URI in the index.
	 * 
	 * @param uri the URI
	 */
	public void updateArtifact(URI uri) {
		update(uri, false);
	}

	/**
	 * Updates the artifact represented by the given Eclipse resource in the index.
	 * 
	 * @param resource the Eclipse resource
	 */
	public void updateArtifact(IResource resource) {
		if (IndexUtil.INSTANCE.isGenerated(resource)) {
			return;
		}
		
		update(ResourceUtil.uriFrom(resource), false);
	}

	/**
	 * Updates the index of the artifact with the given ID using the given indexers.
	 * 
	 * @param id the artifact's ID
	 * @param indexerIDs the IDs of the idexers to call
	 */
	public void updateArtifact(ID id, List<String> indexerIDs) {
		comCache.getUpdateMap().put(id, 
				indexerManager.getIndexers(indexerIDs, true));
	}

	/**
	 * Commit the complete index.
	 */
	public void commitIndex() {
		if (commitIndex(comCache, new NullProgressMonitor())) {
			comCache = new CommitCache();
		}
	}
	
	/**
	 * Commit the complete index.
	 * 
	 * @param monitor a monitor to record the indexing progress
	 */
	public void commitIndex(IProgressMonitor monitor) {
		if (commitIndex(comCache, monitor)) {
			comCache = new CommitCache();
		}
	}

	/**
	 * Retrieves the current number of rows in the index.
	 * 
	 * @return The index's size.
	 */
	public int getSize() {
		return persistencyManager.getIndexSize();
	}

	/**
	 * Retrieves <code>true</code> if the given <code>ID</code> represents an
	 * artifact in the index.
	 * 
	 * @param resourceID
	 *            An artifact identifier build from a resource.
	 * @return <code>true</code> if the resourceID is an artifactID.
	 */
	public boolean isArtifact(ID resourceID) {
		if (resourceID == null) {
			return false;
		}
		Boolean isArt = null;
		String lastCommit = indexerManager.getTimeStamp();

		isArt = indexCache.isArtifact(lastCommit, resourceID);
		if (isArt == null) {
			isArt = persistencyManager.isArtifact(resourceID);
			indexCache.putIsArtifact(lastCommit, resourceID, isArt);
		}

		return isArt;
	}

	/**
	 * Retrieves <code>true</code> if the given <code>IResource</code> represents an
	 * artifact in the index.
	 * 
	 * @param resource the Eclipse resource
	 * @return <code>true</code> if the resource is an artifact
	 */
	public boolean isArtifact(IResource resource) {
		if (resource == null) {
			return false;
		}
		if (!StoreUtil.INSTANCE.isInStore(resource)) {
			return false;
		}
		ID resID = ResourceUtil.idFrom(resource);
		return isArtifact(resID);
	}
	
	/**
	 * @param uri an URI
	 * @return true if the artifact with the given URI is indexed
	 */
	public boolean isArtifact(URI uri) {
		if (uri == null) {
			return false;
		}
		ID resID = ResourceUtil.idFrom(uri);
		return isArtifact(resID);
	}

	/**
	 * @param resource an Eclipse resource
	 * @return true if the resource was generated by Sokan
	 */
	public boolean isGenerated(IResource resource) {
		if (resource == null || !(resource instanceof IFile)) {
			return false;
		}
		if (!StoreUtil.INSTANCE.isInStore(resource)) {
			return false;
		}
		ID resID = ResourceUtil.idFrom(resource);
		if (resID == null) {
			return false;
		}
		IndexRow row = getIndex(resID);
		if (row == null) {
			return false;
		}
		return row.isGenerated();
	}

	/**
	 * Commit the given index cache.
	 * 
	 * @param cache the cache
	 * @param monitor a monitor to record the commit's progress
	 * @return true if successful
	 */
	public boolean commitIndex(CommitCache cache, IProgressMonitor monitor) {
		Set<ID> delta = indexerManager.performCommit(cache, monitor);
		if (delta == null) {
			return false;
		}
		notifier.notifyListeners(delta);
		return true;
	}

	/**
	 * Registers the given index listener.
	 * 
	 * @param listener the index listener
	 */
	public void addListener(IndexListener listener) {
		notifier.add(listener);
	}

	/**
	 * Unregisters the given index listener.
	 * 
	 * @param listener the index listener
	 */
	public void removeListener(IndexListener listener) {
		notifier.remove(listener);
	}
	
	/**
	 * Report an error that the ID that would be assigned to the artifact
	 * represented by the given Eclipse resource is already in use.
	 * 
	 * @param resource the resource
	 */
	public void reportIDAlreadyTakenError(IResource resource) {
		ID id = ResourceUtil.idFrom(resource);
		URI indexedArtifactURI = ResourceUtil.uriFrom(id);

		String msg = "Cannot index: ID " + id.getSegments()
			+ " already taken by artifact '" + indexedArtifactURI + "'";
		
		try {
			IMarker marker = resource.createMarker(ID_PROBLEM_MARKER);
			marker.setAttribute(IMarker.MESSAGE, msg);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		} catch (CoreException e) {
			SokanIndexPlugin.logError(resource + ": " + msg, e);
		}
	}
	
	/**
	 * Report an error that the ID that would be assigned to the artifact
	 * with the given URI is already in use.
	 * 
	 * @param uri the artifact's URI
	 */
	public void reportIDAlreadyTakenError(URI uri) {
		ID id = ResourceUtil.idFrom(uri);
		URI indexedArtifactURI = ResourceUtil.uriFrom(id);

		String msg = "Cannot index: ID " + id.getSegments()
			+ " already taken by artifact '" + indexedArtifactURI + "'";

		SokanIndexPlugin.logError(uri + ": " + msg, null);
	}
	
	/**
	 * Registers a new load option.
	 * 
	 * @param key the option's key
	 * @param value the option's value
	 */
	public void addLoadOption(String key, Object value) {
		indexerManager.addLoadOption(key, value);
	}
	
	/**
	 * Initializes a new resource set with the registered
	 * load options.
	 * 
	 * @return the new resource set
	 */
	public ResourceSet createNewResourceSet() {
		return indexerManager.createNewResourceSet();
	}

	/**
	 * Registers a new indexer.
	 * 
	 * @param indexerConfiguration the index configuration that contains 
	 *                             the indexer with its dependencies
	 */
	public void addIndexer(IndexerConfiguration indexerConfiguration) {
		indexerManager.addIndexer(indexerConfiguration);
	}

	/**
	 * @return all registered indexers
	 */
	public List<IndexerConfiguration> getIndexerConfigurations() {
		return indexerManager.getIndexerConfigurations();
	}
	
	/**
	 * Use the specified persistency manager.
	 * 
	 * @param persistencyManager the persistency manager
	 */
	public void setPersistencyManager(PersistencyManager persistencyManager) {
		this.persistencyManager = persistencyManager;
		this.indexerManager = new IndexerManager(persistencyManager);
	}

}
