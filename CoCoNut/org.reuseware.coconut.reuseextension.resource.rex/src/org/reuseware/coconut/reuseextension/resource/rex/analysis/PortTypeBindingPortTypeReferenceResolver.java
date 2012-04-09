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
import org.reuseware.coconut.fracol.FragmentRole;
import org.reuseware.coconut.fracol.PortType;
import org.reuseware.coconut.reuseextension.FragmentRoleBinding;
import org.reuseware.coconut.reuseextension.PortTypeBinding;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the port referenced by a port type binding in 
 * the corresponding Fracol.
 */
public class PortTypeBindingPortTypeReferenceResolver implements
		IRexReferenceResolver<PortTypeBinding, PortType> {

	/**
	 * Uses the fragment role referenced by the fragment role binding that is the container of the
	 * given port type binding. 
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, PortTypeBinding container,
			EReference reference, int position, boolean resolveFuzzy,
			IRexReferenceResolveResult<PortType> result) {
		
		FragmentRole role = ((FragmentRoleBinding) container.eContainer()).getFragmentRole();

		if (role != null && !role.eIsProxy()) {
			if (!resolveFuzzy) {
				PortType portType = role.getPortType(identifier);
				if (portType != null) {
					result.addMapping(identifier, portType);
				}
			} else {
				for (PortType cand : role.getPortTypes()) {
					if (cand.getName().startsWith(identifier)) {
						result.addMapping(cand.getName(), cand);
					}
				}
			}
		}
		
		result.setErrorMessage("The port type '" + identifier + "' is not defined");
	}
	
	/**
	 * Returns the name of the port type.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public String deResolve(PortType element, PortTypeBinding container, EReference reference) {
		return element.getName();
	}

	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
