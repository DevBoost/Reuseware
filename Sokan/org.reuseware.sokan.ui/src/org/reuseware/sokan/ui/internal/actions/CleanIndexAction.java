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
package org.reuseware.sokan.ui.internal.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Index that removes all index rows for artifacts that do no longer exist.
 */
public class CleanIndexAction implements IObjectActionDelegate {

	/**
     * Runs the action.
     *
     * @param action the action proxy that handles the presentation portion of the
     *   action
     */
	public void run(IAction action) {
		for (IndexRow row : IndexUtil.INSTANCE.getIndex()) {
			URI uri = ResourceUtil.uriFrom(row.getPhyURI());
			IFile file = ResourceUtil.fileFor(uri);
			if (file == null || !file.exists()) {
				IndexUtil.INSTANCE.removeArtifact(row);
			}
		}
		IndexUtil.INSTANCE.commitIndex();
	}

	/**
	 * Empty implementation.
     *
     * @param action the action proxy that handles presentation portion of 
     * 		the action
     * @param selection the current selection, or <code>null</code> if there
     * 		is no selection.
     */
	public void selectionChanged(IAction action, ISelection selection) { }

    /**
     * Empty implementation.
     * 
	 * @param action
	 *            the action proxy that handles presentation portion of the
	 *            action; must not be <code>null</code>.
	 * @param targetPart
	 *            the new part target; must not be <code>null</code>.
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) { }
}
