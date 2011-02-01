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
package org.reuseware.coconut.description.browse.views.selectedfacets;

import java.util.List;

import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.views.AbstractViewController;

public class SelectedFacetsController extends AbstractViewController {

	public SelectedFacetsController(SelectedFacetsView selectedFacetsView) {
		super(selectedFacetsView);
	}

	public List<Facet> getSelectedFacets() {
		return MainBrowserManager.getInstance().getBrowserStateManager().getState()
				.getSelectedFacets();
	}

	public void select(Facet facet) {
		MainBrowserManager.getInstance().openFacetViewFor(facet);
	}
}
