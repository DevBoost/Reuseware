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
package org.reuseware.coconut.description.facetview.simple.views;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.browse.util.FacetDropListener;
import org.reuseware.coconut.description.classify.DecorationManager;
import org.reuseware.coconut.description.classify.views.facet.JFaceFacetView;
import org.reuseware.coconut.description.facetview.simple.util.SimpleContentProvider;
import org.reuseware.coconut.description.facetview.simple.util.SimpleLabelProvider;

/**
 * This class implements a simple view to present all FacetTypeDecorator which
 * decorate: TreeFacet, ListFacet, DateFacet, RangeFacet and FreeTextFacet. It
 * simply uses a jFace TreeViewer to present the values.
 * 
 * @author Matthias Schmidt
 * 
 */
public class SimpleFacetView extends JFaceFacetView {

	/**
	 * The viewer which presents the tree of FacetValueDecorator.
	 */
	private TreeViewer treeViewer;
	/**
	 * If <code>true</code>, the view will also show FacetValueDecorator which
	 * have a valueCount < 1. These values will be presented in another way and
	 * won't have any zoom effect when clicked.
	 * 
	 * @see FacetValueDecorator
	 * @see SimpleContentProvider
	 */
	private final static boolean SHOW_EMPTY_FACET_VALUES = true;

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.JFaceFacetView#buildViewer(boolean)
	 */
	@Override
	protected ContentViewer buildViewer(boolean isMultiValue) {
		if (treeViewer != null) {
			treeViewer.getControl().dispose();
			treeViewer = null;
		}

		if (isMultiValue || this.browserMode)
			treeViewer = new TreeViewer(compViewer, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		else
			treeViewer = new TreeViewer(compViewer, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);

		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setLinesVisible(false);
		tree.setHeaderVisible(false);
		for (int i = 0; i < tree.getColumnCount(); i++)
			tree.getColumn(i).pack();

		treeViewer.setContentProvider(new SimpleContentProvider(this, SHOW_EMPTY_FACET_VALUES));
		treeViewer.setLabelProvider(new SimpleLabelProvider(this));

		// treeViewer.setContentProvider(new
		// AdapterFactoryContentProvider(rsItemPAdapterFac));
		// ILabelDecorator decorator =
		// PlatformUI.getWorkbench().getDecoratorManager()
		// .getLabelDecorator();
		// treeViewer.setLabelProvider(new DecoratingLabelProvider(new
		// AdapterFactoryLabelProvider(
		// rsItemPAdapterFac) {
		// @SuppressWarnings("unused")
		// public Image getImage(FacetType object) {
		// Image image = super.getImage(object);
		// if (image != null)
		// return image;
		//
		// return PlatformUI.getWorkbench().getSharedImages().getImage(
		// ISharedImages.IMG_OBJ_ELEMENT);
		// }
		// }, decorator));

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				handleSetButton();
			}
		});
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();

				// make sure all selected values have a valueCount > 0!
				Object[] elements = selection.toArray();
				boolean zoom = true;
				for (Object obj : elements) {
					zoom &= !(((FacetValueDecorator) obj).getValueCount() < 1);
					if (!zoom)
						return;
				}

				performZoom();
			}
		});

		int ops = DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transfers = new Transfer[] { TextTransfer.getInstance() };
		treeViewer.addDropSupport(ops, transfers, new FacetDropListener(this));

		treeViewer.setInput(null);

		return treeViewer;
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#fillSelection()
	 */
	@Override
	protected EList<FacetValueDecorator> fillSelection() {
		EList<FacetValueDecorator> values = new BasicEList<FacetValueDecorator>();
		for (TreeItem item : treeViewer.getTree().getSelection()) {
			if (item.getData() instanceof FacetValueDecorator)
				values.add((FacetValueDecorator) item.getData());
		}
		return values;
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#supportEdit(org.reuseware.coconut.description.Facet)
	 */
	@Override
	public void supportEdit(Facet facet) {
		List<TreeItem> selectedItems = new LinkedList<TreeItem>();
		FacetValueDecorator vDecor;
		FacetValueDecorator itemDecor;
		for (FacetValue value : facet.getValues()) {
			for (TreeItem item : treeViewer.getTree().getItems()) {
				vDecor = DecorationManager.buildFacetValueDecorator(value);
				itemDecor = (FacetValueDecorator) item.getData();
				if (itemDecor.getDecoratee().equals(vDecor.getDecoratee())) {
					selectedItems.add(item);
					break;
				}
			}
		}
		treeViewer.getTree().setSelection(selectedItems.toArray(new TreeItem[] {}));

		super.supportEdit(facet);
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#supportReset()
	 */
	@Override
	public void supportReset() {
		treeViewer.setSelection(null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#print()
	 */
	@Override
	public void print() {
		System.out.println("Hello FacetTreeView: " + VIEW_ID);
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.JFaceFacetView#setContentProvider(boolean)
	 */
	@Override
	protected void setContentProvider(boolean isMultiValue) {
		if (treeViewer == null || treeViewer.getTree().isDisposed())
			buildViewer(isMultiValue);

		treeViewer.setContentProvider(new SimpleContentProvider(this, SHOW_EMPTY_FACET_VALUES));
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.JFaceFacetView#getViewer()
	 */
	@Override
	protected ContentViewer getViewer() {
		return treeViewer;
	}

}
