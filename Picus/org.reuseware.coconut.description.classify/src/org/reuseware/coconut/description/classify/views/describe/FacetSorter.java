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
package org.reuseware.coconut.description.classify.views.describe;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.classify.DescriptionManager;

public class FacetSorter extends ViewerSorter {
	@SuppressWarnings("unused")
	private static final int ASCENDING = 0;
	private static final int DESCENDING = 1;

	private int propertyIndex;
	private int direction;

	public FacetSorter() {
		this.propertyIndex = 0;
		direction = DESCENDING;
	}

	public void setColumn(int column) {
		if (column == this.propertyIndex) {
			// Same column as last sort; toggle the direction
			direction = 1 - direction;
		} else {
			// New column; do an ascending sort
			this.propertyIndex = column;
			direction = DESCENDING;
		}
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		Facet facet1 = (Facet) e1;
		Facet facet2 = (Facet) e2;
		int rc = 0;

		switch (propertyIndex) {
		case 0:
			rc = facet2.getType().getName().compareTo(
					facet1.getType().getName());
			break;

		default:
			rc = 0;
			break;
		}

		// If descending order, flip the direction
		if (direction == DESCENDING)
			rc = -rc;
		
		if (DescriptionManager.isDummyFacet(facet1))
			rc = 99;
		else if (DescriptionManager.isDummyFacet(facet2))
			rc = -99;

		return rc;
	}
}
