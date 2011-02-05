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
package org.reuseware.sokan.resource.build;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.SokanResourcePlugin;

/**
 * A builder that updates the index of all files in the workspace
 * that have been changed according to the current delta. For
 * the index update, this builder calls 
 * <code>IndexUtil.commitIndex()</code>.
 */
public class IndexBuilder extends IncrementalProjectBuilder {

	/**
	 * Builder ID:
	 * <i>org.reuseware.sokan.resource.indexBuilder</i>.
	 */
	public static final String BUILDER_ID = SokanResourcePlugin.PLUGIN_ID + ".indexBuilder";
	
	@Override
	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor)
			throws CoreException {

		if (kind == FULL_BUILD) {
			try {
				fullBuild(monitor);
			} catch (Exception e) {
				SokanIndexPlugin.logError("", e);
			}
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		
		return null;
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		// delete all index entries concerning this project!
		super.clean(monitor);
	}

	private void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			//the project might just have been imported
			// -> find and remember stores in it
			StoreUtil.INSTANCE.getWorkspaceStores().addAll(
					StoreUtil.INSTANCE.getAllStores(getProject()));
			getProject().accept(new StoreSearcher());
		} catch (CoreException e) {
			SokanIndexPlugin.logError(
					"Error in Full Build. Index out of sync now!", e);
		}
		IndexUtil.INSTANCE.commitIndex(monitor);
	}

	private void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		try {
			delta.accept(new StoreDeltaVisitor());
		} catch (CoreException e) {
			SokanIndexPlugin.logError(
					"Error in Incremental Build. Index out of sync now!", e);
		}
		IndexUtil.INSTANCE.commitIndex(monitor);
		
		delta.accept(new StoreRemoveVisitor());
	}
}
