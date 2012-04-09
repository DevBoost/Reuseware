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
package org.reuseware.coconut.description.browse.views.selectedfacets;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.util.DynamicDecorationManager;
import org.reuseware.coconut.description.browse.util.FacetDragListener;
import org.reuseware.coconut.description.browse.views.AbstractBrowserView;
import org.reuseware.coconut.description.classify.UtilityProvider;
import org.reuseware.coconut.description.classify.views.describe.FacetContentProvider;
import org.reuseware.coconut.description.classify.views.describe.FacetLabelProvider;
import org.reuseware.coconut.description.classify.views.describe.FacetSorter;

/**
 * 
 * @author Matthias Schmidt
 * 
 */
public class SelectedFacetsView extends AbstractBrowserView {

	public static final String VIEW_ID = "org.reuseware.coconut.description.browse.views.selectedfacets.SelectedFacetsView";
	// private static final ImageDescriptor IMG_DELETE =
	// AbstractUIPlugin.imageDescriptorFromPlugin(
	// "org.reuseware.coconut.description.browse", "icons/actions/delete.gif");

	private SelectedFacetsController myController;
	private TableViewer sfViewer;

	private Action aDelete;

	@Override
	public void createPartControl(Composite parent) {
		myController = new SelectedFacetsController(this);
		controller = myController;

		createActions();
		contributeToActionBars();

		// create facet table
		sfViewer = new TableViewer(parent, SWT.SINGLE | SWT.V_SCROLL | SWT.FULL_SELECTION);

		// build table
		String[] head = { "Facet", "Value(s)" };
		int[] widthPercent = { 33, 67 };
		Table table = sfViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		for (int i = 0; i < head.length; i++) {
			TableViewerColumn column = new TableViewerColumn(sfViewer, SWT.LEFT);
			column.getColumn().setText(head[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(false);
		}
		UtilityProvider.addResizeSupportToTable(table, widthPercent, 7);

		sfViewer.setContentProvider(new FacetContentProvider());
		sfViewer.setLabelProvider(new FacetLabelProvider());
		sfViewer.setSorter(new FacetSorter());
		sfViewer.addDoubleClickListener(new IDoubleClickListener() {
			// TODO BUG SelectedFacet double click won't work
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				myController.select((Facet) selection.getFirstElement());
			}
		});
		sfViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) sfViewer.getSelection();
				aDelete.setEnabled(selection.getFirstElement() != null);
			}
		});

		int ops = DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transfers = new Transfer[] { TextTransfer.getInstance() };
		sfViewer.addDragSupport(ops, transfers, new FacetDragListener(sfViewer));

		update();
	}

	private void createActions() {
		aDelete = new Action() {
			public void run() {
				IStructuredSelection selection = (IStructuredSelection) sfViewer.getSelection();
				Facet selected = (Facet) selection.getFirstElement();

				if (selected == null)
					return;

				FacetType type = selected.getType();

				System.out.println("Hallo");

				// update BrowserState
				BrowserStateManager stateManage = MainBrowserManager.getInstance()
						.getBrowserStateManager();
				BrowserState state = stateManage.getState();
				state.getSelectedFacets().remove(selected);
				FacetTypeDecorator tDecor = DynamicDecorationManager.buildFacetTypeDecorator(type);
				state.getAdditionalFacets().add(tDecor);
				stateManage.setState(state, true);

				// perform a zoom
				DynamicDecorationManager.getZoomLister().zoom(type, false);
			}
		};
		aDelete.setText("Delete");
		aDelete.setToolTipText("Detele Facet And Zoom Out");
		aDelete.setEnabled(false);
		aDelete.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(
				ISharedImages.IMG_TOOL_DELETE));
		// aDelete.setImageDescriptor(IMG_DELETE);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		manager.add(aDelete);
	}

	@Override
	public void update() {
		try {
			if (sfViewer.getContentProvider() == null)
				sfViewer.setContentProvider(new FacetContentProvider());

			if (sfViewer.getControl().isDisposed()) {
				return;
			}

			sfViewer.setInput(myController.getSelectedFacets());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
