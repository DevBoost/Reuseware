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
/**
 * 
 */
package org.reuseware.coconut.description.classify.derive;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.classify.FacetManager;

/**
 * @author Matthias Schmidt
 * 
 */
public class DerivationManager {

	public final static String ID_DirectDerivator = "OCL";

	private static DerivationManager instance;

	private DerivationManager() {
	}

	public static DerivationManager getInstance() {
		if (instance == null)
			instance = new DerivationManager();
		return instance;
	}

	public FragmentDescription derive(FragmentDescription desc) {
		System.out.println();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("Derive!");
		System.out.println("subject: " + desc.getSubject());

		if (desc.getSubject() == null)
			return desc;

		List<FacetType> derivableTypes = getAllDerivableFacets();

		Facet derivedFacet = null;
		Derivator derivator;
		for (FacetType type : derivableTypes) {
			// find the right derivator
			derivator = findDerivator(type);
			if (derivator == null)
				continue;

			// try to derive the facet
			try {
				derivedFacet = derivator.derive(desc.getSubject(), type);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// if everything went well: add it to the description
			if (derivedFacet != null)
				desc.getFacets().add(derivedFacet);
		}

		System.out.println("++++++++++++++++++++++++++");
		System.out.println();

		return desc;
	}

	private List<FacetType> getAllDerivableFacets() {
		Set<FacetType> allTypes = FacetManager.getRegisteredTypes();
		List<FacetType> derivableTypes = new ArrayList<FacetType>();

		for (FacetType facetType : allTypes) {
			if (FacetManager.isDerivableType(facetType))
				derivableTypes.add(facetType);
		}

		return derivableTypes;
	}

	private Derivator findDerivator(FacetType type) {
		DerivationData info = type.getDerivationData();

		if (info == null)
			return null;

		if (info.getDerivatorID().equals(ID_DirectDerivator))
			return new DirectDerivator();

		return null;
	}
}
