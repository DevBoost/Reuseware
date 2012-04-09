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
package org.reuseware.coconut.description.browse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.util.DynamicDecorationManager;
import org.reuseware.coconut.description.browse.views.BrowserStateListener;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.FacetManager;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.resource.ReuseResources;

public class BrowserStateManager extends Observable {

	private BrowserState state;

	public BrowserStateManager() {
		iniBrowserState();
		ReuseResources.INSTANCE.getRootPackage().eAdapters().add(new BrowserStateListener(this));
	}

	private void iniBrowserState() {
		// create new instance of BrowserState
		state = DescriptionFactory.eINSTANCE.createBrowserState();

		// set 'filtered' content to all FragmentDescription in the store
		state.getFilteredContent().addAll(DescriptionManager.getRegisteredDescriptions());

		// set presented and additional facets
		updateFacets();
	}

	public BrowserState getState() {
		return state;
	}

	public void setState(BrowserState state) {
		this.state = state;
		refreshPresentedFacets();
		setChanged();
		notifyObservers(state);
	}

	public void setState(BrowserState state, boolean lazy) {
		if (!lazy)
			setState(state);
		else
			this.state = state;

		refreshPresentedFacets();
	}

	public void restart() {
		iniBrowserState();
		setState(state);
		
//		setChanged();
//		notifyObservers(state);
		// this.addObserver(null);
	}

	public BrowserState updateFacets() {
		Set<FacetType> types = FacetManager.getRegisteredTypes();
		List<FacetTypeDecorator> decors = new LinkedList<FacetTypeDecorator>();
		List<FacetTypeDecorator> decorsToShow = new LinkedList<FacetTypeDecorator>();
		state.getAdditionalFacets().clear();
		state.getPresentedFacets().clear();

		// create decorators for each FacetType
		for (FacetType facetType : types)
			decors.add(DynamicDecorationManager.buildFacetTypeDecorator(facetType));

		// fill list of presented facets
		int viewCounter = MainBrowserManager.FACET_VIEW_NUMBER;
		Iterator<FacetTypeDecorator> it = decors.iterator();
		while (viewCounter > 0 && it.hasNext()) {
			FacetTypeDecorator decor = it.next();
			state.getPresentedFacets().add(decor);
			decorsToShow.add(decor);
			viewCounter--;
		}
		decors.removeAll(decorsToShow);

		// rest goes into the list of additional facets
		state.getAdditionalFacets().addAll(decors);

		return state;
	}

	public FacetTypeDecorator getAdditionalFacetBy(ID facetTypeID) {
		List<FacetTypeDecorator> tDecors = state.getAdditionalFacets();

		return findDecorIn(tDecors, facetTypeID);
	}

	public FacetTypeDecorator getDecoratorBy(ID facetTypeID) {
		// fill list with all registered decorators in the state
		List<FacetTypeDecorator> tDecors = new LinkedList<FacetTypeDecorator>();

		tDecors.addAll(state.getAdditionalFacets());
		tDecors.addAll(state.getPresentedFacets());
		for (Facet selectedFacet : state.getSelectedFacets()) {
			tDecors.add(DynamicDecorationManager.buildFacetTypeDecorator(selectedFacet.getType()));
		}

		return findDecorIn(tDecors, facetTypeID);
	}

	private FacetTypeDecorator findDecorIn(List<FacetTypeDecorator> tDecors,
			ID facetTypeID) {
		FacetType fType = FacetManager.getTypeByID(facetTypeID);

		for (FacetTypeDecorator tDecor : tDecors) {
			if (tDecor.getDecoratee().equals(fType))
				return tDecor;
		}

		return null;
	}

	private void refreshPresentedFacets() {
		// there are enough facets presented
		EList<FacetTypeDecorator> presented = state.getPresentedFacets();
		int facetNumber = MainBrowserManager.FACET_VIEW_NUMBER;
		if (presented.size() >= facetNumber)
			return;

		// there are no more additional facets
		EList<FacetTypeDecorator> additionals = state.getAdditionalFacets();
		if (additionals.size() < 1)
			return;

		// move some facets form additional to presented
		for (int i = presented.size(); i < facetNumber; i++) {
			// perform move
			presented.add(additionals.remove(0));
			
			// stop if there are no additional facets
			if (additionals.size() < 1)
				break;
		}
	}
}
