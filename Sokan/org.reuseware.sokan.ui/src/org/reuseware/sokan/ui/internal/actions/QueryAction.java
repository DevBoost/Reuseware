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
package org.reuseware.sokan.ui.internal.actions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Action to query the index for information about the selected artifact.
 */
public class QueryAction implements IObjectActionDelegate {
	private final IndexUtil indexUtil = IndexUtil.INSTANCE;
	private List<ID> ids;
	private ISelection selection;

	/**
	 * Constructs a new query action.
	 */
	public QueryAction() {
		ids = new LinkedList<ID>();
	}

	/**
	 * This implementation does nothing.
	 * 
	 * @param action
	 *            the action proxy that handles presentation portion of the
	 *            action; must not be <code>null</code>.
	 * @param targetPart
	 *            the new part target; must not be <code>null</code>.
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) { }

	/**
	 * Activates this action if the selected artifact is indexed.
     *
     * @param action the action proxy that handles presentation portion of 
     * 		the action
     * @param selection the current selection, or <code>null</code> if there
     * 		is no selection.
     */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		ids.clear();

		List<IFile> files = acquireSelectedFiles();
		boolean areArtifact = indexUtil.areArtifactsRes(files);
		action.setEnabled(areArtifact);

		if (areArtifact) {
			for (IFile iFile : files) {
				ids.add(ResourceUtil.idFrom((IResource) iFile));
			}
		}
	}

	/**
     * Runs the action.
     *
     * @param action the action proxy that handles the presentation portion of the
     *   action
     */
	public void run(IAction action) {
		List<IndexRow> rows = indexUtil.getIndex(ids);
		for (IndexRow row : rows) {
			String message = CoreUtil.print(row);
			MessageDialog.openInformation(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
					"Sokan query result", message);
		}
	}

	private List<IFile> acquireSelectedFiles() {
		if (!(selection instanceof IStructuredSelection)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		List<Object> selected = ((IStructuredSelection) selection).toList();
		List<IFile> back = new ArrayList<IFile>(selected.size());
		IFile file = null;

		for (Object object : selected) {
			if (object instanceof IContainer) {
				file = (IFile) object;
			} else if (object instanceof IAdaptable) {
				file = (IFile) ((IAdaptable) object).getAdapter(IFile.class);
			}

			if (file != null) {
				back.add(file);
			}
		}

		return back;
	}
}
