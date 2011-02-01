package org.reuseware.sokan.resource.build;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.ui.StoreDecorator;
import org.reuseware.sokan.resource.util.BuildUtil;
import org.reuseware.sokan.resource.util.FilterUtil;

/**
 * A resource visitor used by the <code>IndexBuilder</code> to 
 * visit and index artifacts that have changed in the workspace.
 */
public class StoreDeltaVisitor implements IResourceDeltaVisitor {

	private final StoreUtil storeUtil = StoreUtil.INSTANCE;
	private List<URI> storeURIs;
	private boolean isFirstVisit;

	/**
	 * Constructs a new StoreDeltaVisitor.
	 */
	public StoreDeltaVisitor() {
		storeURIs = storeUtil.getAllStoreURIs();
		isFirstVisit = true;
	}

	/** 
	 * Visits the given resource delta to update the index for
	 * all artifacts in the delta.
	 * 
	 * @param delta the resource delta
	 * 
	 * @return true if a folder inside a store is visited (to visit its children)
	 * 
	 * @throws CoreException if the visit fails for some reason.
	 */
	public boolean visit(IResourceDelta delta) throws CoreException {
		if (isFirstVisit) {
			isFirstVisit = false;
			// CoreUtil.print(delta, 0);
			// we need deleted stores for later calculations in StoreUtil
			handleStoreMarkerFiles(delta);
		}

		// is delta's resource relevant?
		IResource res = delta.getResource();
		URI resURI = ResourceUtil.uriFrom(res);
		boolean isRelevant = false;
		String resStr = resURI.toString();
		String storeStr;
		for (URI storeURI : storeURIs) {
			storeStr = storeURI.toString();
			if (storeStr.startsWith(resStr) || resStr.startsWith(storeStr)) {
				isRelevant = true;
				break;
			}
		}
		if (!isRelevant) {
			return false;
		}
		// if complete store changed: handle separately
		if (isRelevantStoreContainer(res)) {
			for (IResourceDelta childDelta : delta.getAffectedChildren()) {
				if (storeUtil.isStoreFile(childDelta.getResource())) {
					handleCompleteStore(delta);
					return false;
				}
			}
		}

		// if no file, go on
		if (!(res instanceof IFile)) {
			return true;
		}
		// check file is INSIDE a store
		IFile file = (IFile) res;
		if (!isInRelevantStore(resStr)) {
			return false;
		}
		// check file meets filterPattern
		String filterPattern = storeUtil.acquireFilterPattern(file);
		if (!FilterUtil.isArtifact(file, filterPattern)) {
			return false;
		}
		// we found an artifact to handle in index
		handleArtifact(delta);
		return false;
	}

	private boolean isInRelevantStore(String resStr) {
		boolean isRelevant = false;
		String storeStr;
		for (URI storeURI : storeURIs) {
			storeStr = storeURI.toString();
			if (resStr.startsWith(storeStr)) {
				isRelevant = true;
				break;
			}
		}
		return isRelevant;
	}

	private boolean isRelevantStoreContainer(IResource res) {
		if (!(res instanceof IContainer)) {
			return false;
		}
		URI uri = ResourceUtil.uriFrom(res);
		return storeURIs.contains(uri);
	}

	private void handleStoreMarkerFiles(IResourceDelta delta) {
		IResource res = delta.getResource();

		if (storeUtil.isStoreFile(res)) {
			if (delta.getKind() == IResourceDelta.REMOVED) {
				if (res.getParent() instanceof IContainer) {
					IContainer store = (IContainer) res.getParent();
					if (!storeUtil.wasStore(store)) {
						//file has been manually deleted, we have to reconstruct a store object
						storeUtil.getDeletedStores().add(StoreUtil.INSTANCE.buildStore(
								Collections.singletonList("*.*"), store));
						storeUtil.getWorkspaceStores().remove(store);
						StoreDecorator.refresh(store);
					}
					storeURIs.add(ResourceUtil.uriFrom(store));
				}
				return;
			}
			if (delta.getKind() == IResourceDelta.ADDED) {
				if (res.getParent() instanceof IContainer) {
					IContainer store = (IContainer) res.getParent();
					storeUtil.getWorkspaceStores().add(store);
					storeURIs.add(ResourceUtil.uriFrom(store));
					StoreDecorator.refresh(store);
				}
				return;
			}
		}

		IResourceDelta[] children = delta.getAffectedChildren();
		for (IResourceDelta childDelta : children) {
			handleStoreMarkerFiles(childDelta);
		}
	}

	private void handleArtifact(IResourceDelta delta) {
		if (!(delta.getResource() instanceof IFile)) {
			return;
		}
		IFile artifact = (IFile) delta.getResource();
		
		// Do not index hidden files
		if (artifact.getName().startsWith(".")) {
			return;
		}
		
		switch (delta.getKind()) {

		case IResourceDelta.ADDED:
			IndexUtil.INSTANCE.addArtifact(artifact);
			break;

		case IResourceDelta.REMOVED:
			IndexUtil.INSTANCE.removeArtifact(artifact);
			break;

		case IResourceDelta.CHANGED:
			if (IndexUtil.INSTANCE.isArtifact(artifact)) {
				IndexUtil.INSTANCE.updateArtifact(artifact);
			} else {
				IndexUtil.INSTANCE.addArtifact(artifact);
			}
			break;

		default:
			SokanIndexPlugin.logError(
					"Unknown delta kind while handling artifact ("
					+ "File: " + artifact + ", "
					+ "Kind: " + delta.getKind() + ")", null);
			break;
		}
	}

	private void handleCompleteStore(IResourceDelta delta) {
		if (!(delta.getResource() instanceof IContainer)) {
			return;
		}
		IContainer store = (IContainer) delta.getResource();
		IResourceDelta delStoreFile = null;
		for (IResourceDelta childDelta : delta.getAffectedChildren()) {
			if (storeUtil.isStoreFile(childDelta.getResource())) {
				delStoreFile = childDelta;
				break;
			}
		}
		if (delStoreFile == null) {
			return;
		}
		switch (delStoreFile.getKind()) {

		case IResourceDelta.ADDED:
			handleCompleteStore(store, true);
			break;

		case IResourceDelta.REMOVED:
			handleCompleteStore(store, false);
			break;

		case IResourceDelta.CHANGED:
			updateCompleteStore(store);
			break;

		default:
			SokanIndexPlugin.logError(
					"Unknown delta kind while handling complete store ("
					+ "Store: " + store + ", "
					+ "Kind: " + delStoreFile.getKind() + ")", null);
			break;
		}
	}

	private void handleCompleteStore(IContainer store, boolean addMode) {
		String pattern = storeUtil.acquireFilterPattern(store);
		BuildUtil.visitStore(store, pattern, addMode);
	}

	
	//TODO #1470: check if this can be implemented more efficiently than just re-adding the store
	private void updateCompleteStore(IContainer store) {
		// needed when content of .store files changes => filterPattern
		// hence, adds and removes single artifacts

		// think about following scenario:
		// .store gets updated, relevant artifact gets deleted
		
		handleCompleteStore(store, false);
		handleCompleteStore(store, true);
	}
}