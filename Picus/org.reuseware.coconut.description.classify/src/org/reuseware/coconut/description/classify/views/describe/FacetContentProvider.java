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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FragmentDescription;

public class FacetContentProvider implements IStructuredContentProvider {

	private final static Facet[] EMPTY_ARRAY = {};

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	@SuppressWarnings("unchecked")
	public Object[] getElements(Object parent) {
		if (parent == null)
			return EMPTY_ARRAY;

		if (!(parent instanceof FragmentDescription || parent instanceof List))
			return EMPTY_ARRAY;

		EList<Facet> facets = new BasicEList<Facet>();
		
		// provider is used in context of a FragmentDescription
		if (parent instanceof FragmentDescription) {
			facets = ((FragmentDescription) parent).getFacets();
			for (Facet facet : facets) {
				if ((facet.getType() == null) || (facet.getValueNames() == null)
						|| (facet.getValueNames().size() == 0))
					facets.remove(facet);
			}
			return facets.toArray();
		}
		
		// provider's input is simply the list of facets
		if (parent instanceof List) {
			Iterator it = ((List) parent).iterator();
			while (it.hasNext()) {
				try {
					facets.add((Facet) it.next());
				} catch (Exception e) {
					continue;
				}
			}
			return facets.toArray();
		}

		return EMPTY_ARRAY;
	}
}
