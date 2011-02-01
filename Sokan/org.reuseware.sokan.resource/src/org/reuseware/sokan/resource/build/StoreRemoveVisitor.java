package org.reuseware.sokan.resource.build;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Visitor that removes complete stores from the index if
 * a store folder was unmarked by the user.
 */
public class StoreRemoveVisitor implements IResourceDeltaVisitor {

	private final StoreUtil storeUtil = StoreUtil.INSTANCE;
	
	/**
	 * If the current resource represents a removed store, the store
	 * is completely removed from the index.
	 * 
	 * @param delta the resource delta
	 * 
	 * @return false if the current resource is a removed store 
	 * 
	 * @throws CoreException if the visit fails for some reason.
	 */
	public boolean visit(IResourceDelta delta) throws CoreException {
		for (IResourceDelta childDelta : delta.getAffectedChildren()) {
			if (storeUtil.isStoreFile(childDelta.getResource())) {
				if (childDelta.getKind() == IResourceDelta.REMOVED) {
					if (delta.getResource() instanceof IContainer) {
						IContainer store = (IContainer) delta.getResource();
						storeUtil.removeDeletedStores(store);
					}
				}
				return false;
			}
		}
		return true;
	}

}
