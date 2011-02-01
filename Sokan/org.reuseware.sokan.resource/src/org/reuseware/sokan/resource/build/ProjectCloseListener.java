package org.reuseware.sokan.resource.build;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * A resource change listener that reacts on the closing of projects
 * and removes the stores of the closed project from the index.
 */
public class ProjectCloseListener implements IResourceChangeListener {

	private final StoreUtil storeUtil = StoreUtil.INSTANCE;
	
	/**
	 * Checks if the event is a pre-project-close event and
	 * removes all stores of the corresponding project from 
	 * the index in that case.
	 * 
	 * @param event the resource change event
	 */
	public void resourceChanged(IResourceChangeEvent event) {
		IProject project = (IProject) event.getResource();
		for (IContainer store : storeUtil.getAllStores(project)) {
			try {
				store.accept(new IResourceVisitor() {
					public boolean visit(IResource resource) throws CoreException {
						if (resource instanceof IFile) {
							IndexUtil.INSTANCE.removeArtifact(resource);
							return false;
						}
						return true;
					}
				});
			} catch (CoreException e) {
				SokanIndexPlugin.logError("", e);
			}
		}
		
		IndexUtil.INSTANCE.commitIndex();
		
		//forget stores from this project
		storeUtil.getWorkspaceStores().removeAll(
				storeUtil.getAllStores(project));
	}

}
