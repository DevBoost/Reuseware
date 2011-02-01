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

import java.util.Collections;
import java.util.List;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DirectDerivation;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.classify.FacetManager;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentPackage;
import org.reuseware.coconut.reuseextension.util.ocl.EnhancedEcoreEnvironmentFactory;

/**
 * @author Matthias Schmidt
 * 
 */
public class DirectDerivator extends Derivator {
	
	private static final OCL OCL_ENV = OCL.newInstance(new EnhancedEcoreEnvironmentFactory());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.reuseware.coconut.description.classify.derivate.Derivator#derive(
	 * org.reuseware.coconut.fragment.Fragment)
	 */
	@Override
	public Facet derive(Fragment subject, FacetType facetType) {
		if (!(facetType.getDerivationData() instanceof DirectDerivation))
			return null;

		String rule = ((DirectDerivation) facetType.getDerivationData())
				.getRule();
		System.out.println("Rule: " + rule);

		List<FacetValue> values = performDerivation(subject, facetType);

		return buildFacet(facetType, values);
	}

	private List<FacetValue> performDerivation(Fragment subject,
			FacetType facetType) {
		
		DerivationData derivationData = facetType.getDerivationData();
		String valueAsString = null;

		if (derivationData instanceof DirectDerivation) {
			DirectDerivation directDerivation = (DirectDerivation) derivationData;
			String rule = directDerivation.getRule();
			
			OCLExpression oclExpression = parse(rule);
			
			if (oclExpression == null)
				return Collections.emptyList();

			Query query = OCL_ENV.createQuery(oclExpression);
			Object result = null;
			
			try {
				result = query.evaluate(subject);
			} catch (Exception e) {
				e.printStackTrace();
				result = null;
			}

			valueAsString = result.toString();
			
			FacetValue derivedValue = null;
			for(FacetValue value : facetType.getValues()) {
				if (value.getName().equals(valueAsString)) {
					derivedValue = value;
					break;
				}
			}
			
			if (derivedValue == null) {
				derivedValue = FacetManager.buildFacetValue(valueAsString,
							null, null, null);
				facetType.getValues().add(derivedValue);
			}
			
			return Collections.singletonList(derivedValue);
		}
		
		return Collections.emptyList();
	}

	private static OCLExpression parse(String expression) {
		if (expression == null)
			return null;

		OCLExpression oclExpression = null;
		Helper helper = OCL_ENV.createOCLHelper();
		helper.setContext(FragmentPackage.Literals.FRAGMENT);

		try {
			oclExpression = helper.createQuery(expression);
		} catch (ParserException e) {
			System.err.println(e.getLocalizedMessage());
		}
		return oclExpression;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.reuseware.coconut.description.classify.derivate.Derivator#getID()
	 */
	@Override
	public String getID() {
		return DerivationManager.ID_DirectDerivator;
	}

}
