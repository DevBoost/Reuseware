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
/**
 * 
 */
package org.reuseware.coconut.description.classify.derive;

import java.util.List;

import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.fragment.Fragment;

/**
 * @author Matthias Schmidt
 * 
 */
public abstract class Derivator {

	/**
	 * This method takes a <code>FacetType</code> and a <code>Fragment</code>
	 * and derives a <code>Facet</code> with some <code>FacetValue</code>s
	 * already set. The <code>Fragment</code>'s inner information and structure
	 * is used to fill the <code>Facet</code> with values.
	 * 
	 * @param subject
	 *            The <code>Fragment</code> where the information is extracted
	 *            to fill the facet.
	 * @param facetType
	 *            The type of the <code>Facet</code> which should be derived.
	 * @return A derived <code>Facet</code>.
	 */
	public abstract Facet derive(Fragment subject, FacetType facetType);

	/**
	 * Simply returns the identifier which is used in the facet definition to
	 * address the derivator.
	 * 
	 * @return The <code>Derivator</code>'s identifier.
	 */
	public abstract String getID();

	/**
	 * Builds the <code>Facet</code> after it's values were derived.
	 * 
	 * @param facetType
	 *            The <code>Facet</code>'s type.
	 * @param values
	 *            The <code>Facet</code>'s values.
	 * @return The new created <code>Facet</code>;
	 */
	protected Facet buildFacet(FacetType facetType, List<FacetValue> values) {
		// first add values to the type!
		// facetType.getValues().addAll(values);

		// then build the facet
		Facet result = DescriptionManager.buildFacet(facetType, values);

		if (result.getValues().size() < 1)
			return null;
		else
			return result;
	}
}
