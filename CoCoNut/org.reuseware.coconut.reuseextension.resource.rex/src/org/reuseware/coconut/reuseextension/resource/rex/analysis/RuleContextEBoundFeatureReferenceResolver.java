/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.reuseextension.resource.rex.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.reuseware.coconut.reuseextension.HookDerivationRule;
import org.reuseware.coconut.reuseextension.RuleContext;
import org.reuseware.coconut.reuseextension.SlotDerivationRule;
import org.reuseware.coconut.reuseextension.ValueHookDerivationRule;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the EStructuralFeature for a rule context in the EClass referenced by the rule context.
 */
public class RuleContextEBoundFeatureReferenceResolver implements 
			IRexReferenceResolver<RuleContext, EStructuralFeature> {
	
	/**
	 * Finds an EStructuralFeature in the EClass referenced by the given rule context.
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, RuleContext container, EReference reference, int position, boolean resolveFuzzy, IRexReferenceResolveResult<EStructuralFeature> result) {
		
		boolean isChangeableAddressablePoint = 
			(container instanceof SlotDerivationRule)
			|| (container instanceof HookDerivationRule)
			|| (container instanceof ValueHookDerivationRule);

		String featureName = identifier;
		EClass eClass = container.getEBoundClass();

		if (eClass == null || eClass.eIsProxy()) {
			return;
		}
		
		//Default error
		result.setErrorMessage("Feature '" + featureName + "'not declared");

		if (resolveFuzzy) {
			for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
				if (feature.isChangeable() || !isChangeableAddressablePoint) {
					result.addMapping(feature.getName(), feature);
				}
			}
		} else {
			EStructuralFeature feature = eClass.getEStructuralFeature(featureName);
			if (feature != null) {
				if (isChangeableAddressablePoint && !feature.isChangeable()) {
					result.setErrorMessage("Unchangeable reference '" + featureName + "' can not be declared as variation point");
				} else {
					result.addMapping(featureName, feature);
				}
			}
		}
	}
	
	/**
	 * Returns the name of the feature.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public String deResolve(EStructuralFeature element, RuleContext container, EReference reference) {
		return element.getName();
	}

	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
