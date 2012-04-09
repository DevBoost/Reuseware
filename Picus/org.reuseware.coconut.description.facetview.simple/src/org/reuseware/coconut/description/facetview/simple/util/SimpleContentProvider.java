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
package org.reuseware.coconut.description.facetview.simple.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.classify.views.facet.FacetView;
import org.reuseware.coconut.description.classify.views.facet.JFaceFacetView;
import org.reuseware.coconut.description.facetview.simple.views.SimpleFacetView;

/**
 * This ContentProvider defines which {@link FacetValueDecorator} will be
 * included in the {@link SimpleFacetView}'s TreeViewer. If the
 * {@link FacetView} is in browser mode and the decorators valueCount is <1,
 * this class can exclude this decorator from the viewer and present a simpler
 * content in that way. <br>
 * <br>
 * This ContentProvider should also work for tree structured decorators.
 * 
 * @see SimpleFacetView
 * @see FacetView#browserMode
 * @see FacetValueDecorator
 * 
 * @author Matthias Schmidt
 * 
 */
public class SimpleContentProvider implements ITreeContentProvider {

	/**
	 * Simply an empty array if type Object[].
	 */
	private static Object[] EMPTY_ARRAY = new Object[0];
	/**
	 * If <code>true</code>, the viewer will also contain FacetValueDecorator
	 * which have a valueCount < 1.
	 * 
	 * @see FacetValueDecorator
	 * @see SimpleFacetView
	 */
	private boolean showEmptyFacetValues;

	/**
	 * The constructor.
	 * 
	 * @param view
	 *            The view which uses this ContentProvider
	 * @param showEmptyFacetValues
	 *            Whether or not FacetValueDecorator with valueCount <1 should
	 *            be contained in the view.
	 */
	public SimpleContentProvider(JFaceFacetView view, boolean showEmptyFacetValues) {
		this.showEmptyFacetValues = showEmptyFacetValues;
		if (!view.browserMode)
			this.showEmptyFacetValues = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof FacetTypeDecorator) {
			FacetTypeDecorator tDecor = (FacetTypeDecorator) parentElement;

			if (showEmptyFacetValues)
				return tDecor.getValues().toArray();
			else
				return filterChildren(tDecor);
		}
		return EMPTY_ARRAY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object
	 * )
	 */
	public Object getParent(Object element) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * Object)
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof FacetValueDecorator) {
			FacetValueDecorator vDecor = (FacetValueDecorator) element;
			if (vDecor.getChildren() == null)
				return false;

			if (showEmptyFacetValues)
				return vDecor.getChildren().size() > 0;
			else
				return filterChildren(element).length > 0;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * .lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// System.out.println("inputChanged");

	}

	/**
	 * Filters the list of children by FacetValueDecorator's valueCount
	 * attribute.
	 * 
	 * @return Only those children, which have valueCount > 0.
	 */
	private Object[] filterChildren(Object element) {
		List<FacetValueDecorator> vDecors = new LinkedList<FacetValueDecorator>();

		// get the right unfiltered list of children
		if (element instanceof FacetTypeDecorator)
			vDecors = ((FacetTypeDecorator) element).getValues();
		else if (element instanceof FacetValueDecorator)
			vDecors = ((FacetValueDecorator) element).getChildren();
		else
			return EMPTY_ARRAY;

		// filter the list
		List<FacetValueDecorator> back = new ArrayList<FacetValueDecorator>(vDecors.size());
		for (FacetValueDecorator vDecor : vDecors) {
			if (vDecor.getValueCount() > 0)
				back.add(vDecor);
		}

		return back.toArray();
	}
}
