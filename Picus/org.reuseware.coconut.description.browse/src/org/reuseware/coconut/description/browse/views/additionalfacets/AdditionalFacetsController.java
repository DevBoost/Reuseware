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

import java.util.HashSet;
import java.util.Set;

import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.views.AbstractViewController;

public class AdditionalFacetsController extends AbstractViewController {

	public AdditionalFacetsController(AdditionalFacetsView availableFacetsView) {
		super(availableFacetsView);
	}

	public Set<FacetTypeDecorator> getAdditionalFacets() {
		BrowserState state = stateManager.getState();
		HashSet<FacetTypeDecorator> set = new HashSet<FacetTypeDecorator>();
		set.addAll(state.getAdditionalFacets());
		return set;
	}

	public void select(FacetTypeDecorator fDecor) {
		MainBrowserManager.getInstance().openFacetViewFor(fDecor);
	}
}
