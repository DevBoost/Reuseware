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
package org.reuseware.coconut.description.browse.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.expressions.Variable;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.GUIState;
import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.views.facet.ZoomListener;
import org.reuseware.coconut.reuseextension.util.ocl.EnhancedEcoreEnvironmentFactory;

/**
 * This singleton class implements the <code>ZoomListener</code> interface to
 * perform a zoom-step using an OCL constrain given by the description meta
 * model.
 * 
 * @author Matthias Schmidt
 * 
 */
public class OCLZoomer extends ZoomListener {

	private int c;
	private static final OCL OCL_ENV = OCL.newInstance(new EnhancedEcoreEnvironmentFactory());
	public static String QUERY = "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif";

	protected OCLZoomer() {
		super();
		c = 0;
	}

	/**
	 * Retrieves the single instance of the <code>OCLZoomer</code>.
	 * 
	 * @return The one and only instance of <code>OCLZoomer</code>.
	 */
	public static ZoomListener getInstance() {
		if (instance == null)
			instance = new OCLZoomer();
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.reuseware.coconut.description.classify.views.util.ZoomListener#zoom
	 * (org.reuseware.coconut.description.FacetType)
	 */
	@Override
	public void zoom(FacetType type, boolean lazy) {
		Facet facet = DescriptionManager.buildFacet(type, new ArrayList<FacetValue>());
		zoom(facet, lazy);
	}

	@Override
	public void zoom(Facet facet, boolean lazy) {
		BrowserStateManager stateManager = MainBrowserManager.getInstance()
				.getBrowserStateManager();
		BrowserState state = stateManager.getState();

		// update state with new selected facet
		for (FacetTypeDecorator tDecor : state.getPresentedFacets()) {
			if (tDecor.getSelection() == null)
				continue;

			if (tDecor.getSelection().getType().equals(facet.getType())) {
				tDecor.setSelection(facet);
				break;
			}
		}

		state = zoomContent(state, facet);
		if (!lazy) {
			state = zoomFacetValues(state, facet);
			state.setGuiState(GUIState.REFRESH_VALUE_COUNTS);
		}

		stateManager.setState(state, lazy);
	}

	/*
	 * (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.views.util.ZoomListener#zoomContent(org.reuseware.coconut.description.BrowserState, org.reuseware.coconut.description.Facet)
	 */
	@Override
	public BrowserState zoomContent(BrowserState state, Facet facet) {
		state.getFilteredContent().clear();
		List<FragmentDescription> filtered = performZoom(state, facet, true);
		state.getFilteredContent().addAll(filtered);

		return state;
	}

	/**
	 * Second refresh the lasting <code>FacetTypeDecorator</code>s which can be
	 * used to perform the next zoom-step. The attribute <code>valueCount</code>
	 * of each <code>FacetValueDecorator</code> of these types need changing
	 * because the content has changed.
	 * 
	 * @param state
	 *            The <code>BrowserState</code> we are working on.
	 * @param facet
	 *            The <code>Facet</code> which describes the current zoom-step.
	 * @return The refreshed <code>BrowserState</code>.
	 */
	private BrowserState zoomFacetValues(BrowserState state, Facet facet) {
		// build list of lasting decorators
		List<FacetTypeDecorator> tDecors = new ArrayList<FacetTypeDecorator>();
		tDecors.addAll(state.getPresentedFacets());
		tDecors.addAll(state.getAdditionalFacets());

		// refresh the value counts
		for (FacetTypeDecorator tDecor : tDecors) {
			calcValueCounts(tDecor, state);
		}

		return state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.reuseware.coconut.description.classify.views.util.ZoomListener#
	 * calcValueCounts(org.reuseware.coconut.description.FacetTypeDecorator,
	 * org.reuseware.coconut.description.BrowserState)
	 */
	@Override
	public FacetTypeDecorator calcValueCounts(FacetTypeDecorator tDecor, BrowserState state) {
		Facet facet;

		// TODO BUG it doesn't calculate values correctly if facets where added
		// later

		for (FacetValueDecorator vDecor : tDecor.getValues()) {
			facet = DescriptionManager.buildFacet(tDecor.getDecoratee(), Collections
					.singletonList(vDecor.getDecoratee()));
			if (state != null) {
				@SuppressWarnings("unchecked")
				List list = performZoom(state, facet, false);
				vDecor.setValueCount(list.size());
				System.out.println();
			} else
				vDecor.setValueCount(0);
		}

		return tDecor;
	}

	private List<FragmentDescription> performZoom(BrowserState state, Facet facet, boolean fresh) {
		List<FragmentDescription> content;
		if (fresh)
			content = DescriptionManager.getRegisteredDescriptions();
		else
			content = state.getFilteredContent();

		// make sure content is completely build
		for (FragmentDescription fDesc : content) {
			DescriptionManager.loadDescription(fDesc);
		}

		// collect the facets which influence the query
		List<Facet> filteringFacets = new ArrayList<Facet>();
		filteringFacets.addAll(state.getSelectedFacets());
		for (FacetTypeDecorator fDecor : state.getPresentedFacets()) {
			if (fDecor.getSelection() != null) {
				if (!fDecor.getSelection().getType().equals(facet.getType()))
					filteringFacets.add(fDecor.getSelection());
			}
		}

		// make sure an empty selected facet has priority over same typed facets
		// Facet badFacet = null;
		// if (facet != null && (facet.getValueNames() == null ||
		// facet.getValueNames().size() == 0)) {
		// for (Facet fac : filteringFacets) {
		// if (fac.getType().equals(facet.getType())) {
		// badFacet = fac;
		// break;
		// }
		// }
		// if (badFacet != null)
		// filteringFacets.remove(badFacet);
		// }
		filteringFacets.add(facet);

		c++;
		System.out.println();
		System.out.println("Zoom! no.: " + c);
		System.out.println("fresh: " + fresh);
		for (Facet fac : filteringFacets) {
			System.out.print(fac.getType().getName() + " = {");
			for (FacetValue value : fac.getValues()) {
				System.out.print(value.getName() + ",");
			}
			System.out.println("}");
		}
		System.out.println();

		List<FragmentDescription> filterContent = new ArrayList<FragmentDescription>(content.size());
		String query;

		for (Facet filterFacet : filteringFacets) {
			if (filterFacet.getValues().size() < 1)
				continue;

			query = filterFacet.getType().getQuery();

			for (FragmentDescription fragmentDescription : content) {
				if (fDescContainsFacet(fragmentDescription, query, filterFacet))
					filterContent.add(fragmentDescription);
			}

			content = filterContent;
			filterContent = new ArrayList<FragmentDescription>(content.size());
		}
		return content;
	}

	public boolean fDescContainsFacet(FragmentDescription context, String expression,
			Facet filterFacet) {
		if (expression == null)
			return true;
		if (expression.equals(""))
			return true;

		if (OCL_ENV.getEnvironment().getVariables().isEmpty()) {
			OCL_ENV.getEnvironment().getVariables().clear();
			Variable<EClassifier, EParameter> var = OCL_ENV.getEnvironment().getOCLFactory()
					.createVariable();
			var.setName("filterFacet");
			var.setType(DescriptionPackage.Literals.FACET);
			OCL_ENV.getEnvironment().addElement(var.getName(), var, true);
		}

		OCLExpression oclExpression = parse(context.eClass(), expression, OCL_ENV);

		if (oclExpression == null)
			return true;

		Query query = OCL_ENV.createQuery(oclExpression);
		query.getEvaluationEnvironment().add("filterFacet", filterFacet);

		Object result = null;
		try {
			result = query.evaluate(context);
		} catch (Exception e) {
			result = null;
		}

		if (result == null) {
			return true;
		}

		if (result instanceof Boolean)
			return ((Boolean) result).booleanValue();

		return true;
	}

	private static OCLExpression parse(EClass context, String expression, OCL env) {
		if (expression == null)
			return null;

		OCLExpression oclExpression = null;
		Helper helper = env.createOCLHelper();
		helper.setContext(context);

		try {
			oclExpression = helper.createQuery(expression);
		} catch (ParserException e) {
			System.err.println(e.getLocalizedMessage());
		}
		return oclExpression;
	}

}
