/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.description.classify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.repository.PackageableElement;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.ui.eclipse.resource.WorkspaceFragmentStoreManager;

public class UtilityProvider {

	public static void addResizeSupportToTable(Table table, final int[] ratio,
			final int widthCorrection) {
		table.getParent().addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				if (!(e.getSource() instanceof Composite))
					return;
				Composite parent = (Composite) e.getSource();
				Table table = null;
				for (Control control : parent.getChildren()) {
					if (control instanceof Table) {
						table = (Table) control;
					}
				}
				if (table == null)
					return;

				Rectangle area = parent.getClientArea();
				Point preferredSize = table.computeSize(SWT.DEFAULT, SWT.DEFAULT);
				int width = area.width - 2 * table.getBorderWidth() + widthCorrection;
				if (preferredSize.y > area.height + table.getHeaderHeight()) {
					// Subtract the scrollbar width from the total column width
					// if a vertical scrollbar will be required
					width -= table.getVerticalBar().getSize().x;
				}
				Point oldSize = table.getSize();

				if (oldSize.x > area.width) {
					// table is getting smaller so make the columns
					// smaller first and then resize the table to
					// match the client area width
					for (int i = 0; i < table.getColumns().length; i++) {
						TableColumn column = table.getColumns()[i];
						column.setWidth(width * ratio[i] / 100 - 5);
					}
					table.setSize(area.width, area.height);
				} else {
					// table is getting bigger so make the table
					// bigger first and then make the columns wider
					// to match the client area width
					table.setSize(area.width, area.height);
					for (int i = 0; i < table.getColumns().length; i++) {
						TableColumn column = table.getColumns()[i];
						column.setWidth(width * ratio[i] / 100 - 5);
					}
				}
			}
		});
	}

	@SuppressWarnings("unchecked")
	public static boolean equal(List coll, List otherColl) {
		// trivial checks
		if (coll == null && otherColl == null)
			return true;

		// size checks
		if (coll == null && otherColl != null && otherColl.size() < 1)
			return true;
		if (coll != null && coll.size() < 1 && otherColl == null)
			return true;

		// trivial null check
		if (coll != null && coll.size() > 0 && otherColl == null)
			return false;
		if (coll == null && otherColl != null && otherColl.size() > 0)
			return false;

		// both empty
		if (coll.size() == 0 && otherColl.size() == 0)
			return true;

		List list = new ArrayList<Object>();
		list.addAll(coll);

		List otherList = new ArrayList<Object>();
		otherList.addAll(otherColl);

		if (list == null || list.size() < 1)
			return false;

		if (otherList != null) {
			boolean contains;
			boolean equal = true;
			Object obj;
			for (Object newObj : list) {
				contains = false;
				obj = null;
				for (Object oldObj : otherList) {
					if (newObj.equals(oldObj)) {
						contains = true;
						obj = oldObj;
						break;
					}
				}
				equal = equal && contains;
				if (!equal)
					break;
				otherList.remove(obj);
			}
			for (Object oldObj : otherList) {
				if (!equal)
					break;
				contains = false;
				obj = null;
				for (Object newObj : list) {
					if (oldObj.equals(newObj)) {
						contains = true;
						break;
					}
				}
				equal = equal && contains;
			}
			if (equal)
				return true;
		}
		return false;
	}

	public static boolean save(PackageableElement element, URI uri) {
		ResourceSet rs = ReuseResources.INSTANCE.getResourceSet();
		Resource res = rs.createResource(uri);
		try {
			res.unload();
			res.getContents().add(element);
			res.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static IFile getFragmentFile() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page.getActiveEditor() == null)
			return null;

		IEditorInput input = page.getActiveEditor().getEditorInput();
		IFile file = null;
		if (input instanceof IFileEditorInput) {
			file = ((IFileEditorInput) input).getFile();
		}

		// make sure this file is a fragment
		if (WorkspaceFragmentStoreManager.isFragment(file)) {
			IFile swap = WorkspaceFragmentStoreManager.modelFileForDiagramFile(file);
			if (swap != null)
				file = swap;
		} else
			file = null;

		return file;
	}

	public static boolean isInStore(IFile file) {
		if (file == null) {
			return false;
		}
		IContainer container = file.getParent();
		boolean isStore = false;
		while (!isStore && container != null && container instanceof IFolder) {
			isStore = WorkspaceFragmentStoreManager.isWorkspaceFragmentStore((IFolder) container);
			container = container.getParent();
		}

		return isStore;
	}
}
