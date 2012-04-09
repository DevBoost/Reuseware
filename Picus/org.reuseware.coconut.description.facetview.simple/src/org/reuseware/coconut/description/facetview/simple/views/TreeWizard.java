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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Composite;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.classify.views.facet.FacetView;

/**
 * This is another very simple example of a FacetView. It's mainly only used to
 * test to extension point.
 * 
 * @author Matthias Schmidt
 * 
 */
public class TreeWizard extends FacetView {

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// int[] array = new int[2];
		// array[3] = 4;
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#fillSelection()
	 */
	@Override
	protected EList<FacetValueDecorator> fillSelection() {
		return new BasicEList<FacetValueDecorator>();
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#print()
	 */
	@Override
	public void print() {
		System.out.println("TreeWizard: " + VIEW_ID);
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#supportReset()
	 */
	@Override
	public void supportReset() {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.FacetView#refreshContext(org.reuseware.coconut.description.FacetTypeDecorator, org.reuseware.coconut.description.Facet)
	 */
	@Override
	public void refreshContext(FacetTypeDecorator context, Facet select) {
		// do nothing
	}
}
