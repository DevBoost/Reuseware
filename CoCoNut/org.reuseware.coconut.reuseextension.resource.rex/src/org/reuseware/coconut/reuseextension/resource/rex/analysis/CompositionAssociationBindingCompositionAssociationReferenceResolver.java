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
package org.reuseware.coconut.reuseextension.resource.rex.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.reuseware.coconut.fracol.CompositionAssociation;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.reuseextension.CompositionAssociation2CompositionLinkBinding;
import org.reuseware.coconut.reuseextension.CompositionAssociationBinding;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the composition association referenced by a composition association binding in 
 * the corresponding Fracol.
 */
public class CompositionAssociationBindingCompositionAssociationReferenceResolver implements 
				IRexReferenceResolver<CompositionAssociationBinding, CompositionAssociation> {
	
	/**
	 * Searches the Fracol referenced by the reuse extension for the bound composition association (by name).
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, CompositionAssociationBinding container, EReference reference, int position, boolean resolveFuzzy, IRexReferenceResolveResult<CompositionAssociation> result) {
		if (!(container instanceof CompositionAssociation2CompositionLinkBinding)) {
			return;
		}
		
		FragmentCollaboration fracol = ((CompositionAssociation2CompositionLinkBinding) container)
			.getCompositionLanguageSpecification().getFracol();

		if (fracol != null && !fracol.eIsProxy()) {
			if (!resolveFuzzy) {
				CompositionAssociation assoc = fracol.getCompositionAssociation(identifier);
				if (assoc != null) {
					result.addMapping(identifier, assoc);
				}	
			} else {
				for (CompositionAssociation cand : fracol.getCompositionAssociations()) {
					if (cand.getName().startsWith(identifier)) {
						result.addMapping(cand.getName(), cand);
					}
				}
			}
		}
		
		result.setErrorMessage("The association '" + identifier + "' is not defined");
	}
	
	/**
	 * Returns the name of the composition association.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public java.lang.String deResolve(CompositionAssociation element, CompositionAssociationBinding container, EReference reference) {
		return element.getName();
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
