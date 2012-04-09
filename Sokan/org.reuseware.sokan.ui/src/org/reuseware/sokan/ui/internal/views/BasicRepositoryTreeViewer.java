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
package org.reuseware.sokan.ui.internal.views;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Widget;
import org.reuseware.sokan.ui.model.sokanui.Container;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Tree viewer that returns the <code>IFile</code> representation
 * for selected elements (instead of the <code>EObject</code>
 * representation). This allows other views to better interact with
 * the selection -- in particular the problem view.
 */
public class BasicRepositoryTreeViewer extends TreeViewer {

	private BasicRepositoryView basicRepositoryView;
	
	/**
	 * Constructs a new tree viewer.
	 * 
	 * @param view the repository view
	 * @param parent the parent control
	 */
	public BasicRepositoryTreeViewer(BasicRepositoryView view, Composite parent) {
		super(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		basicRepositoryView = view;
	}

	/**
	 * Modified to return the file that contains a 
	 * packaged element instead of the packaged element
	 * itself. This way, markers on the file are shown in
	 * the standard problems view.
	 * 
	 * @return the modified selection
	 */
	public ISelection getSelection() {
		Control control = getControl();
		if (control == null || control.isDisposed()) {
			return TreeSelection.EMPTY;
		}
		Widget[] items = getSelection(getControl());
		ArrayList<TreePath> list = new ArrayList<TreePath>(items.length);
		for (int i = 0; i < items.length; i++) {
			Widget item = items[i];
			TreePath path = getTreePathFromItem((Item) item);
			if (item.getData() != null) {
				//modification: replace packaged element with corresponding file
				if (item.getData() instanceof EObject) {
					EObject element = (EObject) item.getData();
					IResource resource = null;
					if (element instanceof Container) {
						resource = getIContainerForContainer((Container) element);
					} else if (path.getParentPath().getLastSegment() instanceof Container) {
						resource = basicRepositoryView.getFileForElement(element);
					}
					if (resource != null) {
						basicRepositoryView.addResource2EObjectMapping(resource, element);
						item.setData(resource);
						path = getTreePathFromItem((Item) item);
						item.setData(element);
					}
				}
				//----
				list.add(path);
			}
		}
		return new TreeSelection((TreePath[]) list.toArray(new TreePath[list.size()]), getComparer());
	}
	
	private IContainer getIContainerForContainer(Container container) {
		if (!container.areElementsLoaded()) {
			return null;
		}
		for (EObject child : container.getElements()) {
			IFile file = basicRepositoryView.getFileForElement(child);
			if (file != null) {
				return file.getParent();
			}
		}
		return null;
	}
}
