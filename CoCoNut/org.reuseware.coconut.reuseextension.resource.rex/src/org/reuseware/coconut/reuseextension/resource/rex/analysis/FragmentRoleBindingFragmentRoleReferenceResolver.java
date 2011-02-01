/*******************************************************************************
 * Copyright (c) 2006-2010
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
package org.reuseware.coconut.reuseextension.resource.rex.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.fracol.FragmentRole;
import org.reuseware.coconut.reuseextension.FragmentRoleBinding;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the fragment role referenced by a fragment role binding in 
 * the corresponding Fracol.
 */
public class FragmentRoleBindingFragmentRoleReferenceResolver implements
			IRexReferenceResolver<FragmentRoleBinding, FragmentRole> {

	/**
	 * Searches the Fracol referenced by the reuse extension for the bound fragment role (by name).
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, FragmentRoleBinding container, EReference reference, int position, boolean resolveFuzzy, IRexReferenceResolveResult<FragmentRole> result) {
		FragmentCollaboration fracol = ((ReuseExtension) container.eContainer()).getFracol();

		if (fracol != null && !fracol.eIsProxy()) {
			if (!resolveFuzzy) {
				FragmentRole role = fracol.getFragmentRole(identifier);
				if (role != null) {
					result.addMapping(identifier, role);
				}	
			} else {
				for (FragmentRole cand : fracol.getFragmentRoles()) {
					if (cand.getName().startsWith(identifier)) {
						result.addMapping(cand.getName(), cand);
					}
				}
			}
		}
		
		result.setErrorMessage("The role '" + identifier + "' is not defined");
	}


	/**
	 * Returns the name of the fragment role.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public String deResolve(FragmentRole element, FragmentRoleBinding container, EReference reference) {
		return element.getName();
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
