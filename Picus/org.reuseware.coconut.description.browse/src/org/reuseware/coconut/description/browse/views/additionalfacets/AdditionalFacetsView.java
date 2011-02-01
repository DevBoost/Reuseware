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
package org.reuseware.coconut.description.browse.views.additionalfacets;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.util.FacetDragListener;
import org.reuseware.coconut.description.browse.views.AbstractBrowserView;
import org.reuseware.coconut.description.classify.UtilityProvider;

public class AdditionalFacetsView extends AbstractBrowserView {

	public static final String VIEW_ID = "org.reuseware.coconut.description.browse.views.additionalfacets.AdditionalFacetsView";

	private AdditionalFacetsController myController;
	private TableViewer afViewer;

	class NameSorter extends ViewerSorter {
	}

	@Override
	public void createPartControl(Composite parent) {
		myController = new AdditionalFacetsController(this);
		controller = myController;

		// create facet table
		afViewer = new TableViewer(parent, SWT.SINGLE | SWT.V_SCROLL | SWT.FULL_SELECTION);

		// build table
		String[] head = { "Name", "Description" };
		int[] widthPercent = { 33, 67 };
		Table table = afViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		for (int i = 0; i < head.length; i++) {
			TableViewerColumn column = new TableViewerColumn(afViewer, SWT.LEFT);
			column.getColumn().setText(head[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(false);
		}
		UtilityProvider.addResizeSupportToTable(table, widthPercent, 7);

		afViewer.setContentProvider(new AddContentProvider());
		afViewer.setLabelProvider(new AddLabelProvider());
		afViewer.setSorter(new NameSorter());
		afViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				myController.select((FacetTypeDecorator) selection.getFirstElement());
			}
		});

		int ops = DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transfers = new Transfer[] { TextTransfer.getInstance() };
		afViewer.addDragSupport(ops, transfers, new FacetDragListener(afViewer));

		update();
	}

	@Override
	public void update() {
		if (afViewer.getContentProvider() == null)
			afViewer.setContentProvider(new AddContentProvider());

		if (afViewer.getControl().isDisposed()) {
			return;
		}

		afViewer.setInput(myController.getAdditionalFacets());
	}
}
