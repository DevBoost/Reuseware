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
package org.reuseware.coconut.fracol.resource.fracol.analysis;

import org.reuseware.coconut.fracol.CompositionAssociation;
import org.reuseware.coconut.fracol.FragmentRole;
import org.reuseware.coconut.fracol.resource.fracol.analysis.helper.CompositionAssociationEndReferenceResolver;

/**
 * Specific resolver for composition association end 1.
 */
public class CompositionAssociationEnd1ReferenceResolver implements org.reuseware.coconut.fracol.resource.fracol.IFracolReferenceResolver<org.reuseware.coconut.fracol.CompositionAssociation, org.reuseware.coconut.fracol.PortType> {
	
	private CompositionAssociationEndReferenceResolver delegate = new CompositionAssociationEndReferenceResolver() {

		@Override
		protected FragmentRole getRole(CompositionAssociation container) {
			return container.getEnd1Role();
		}
		
	};
	
	/**
	 * Attempts to find the port type with the given name.
	 * 
	 * @param identifier The name for the port type.
	 * @param container The composition association that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater
	 * than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve
	 * operation.
	 */
	public void resolve(String identifier, org.reuseware.coconut.fracol.CompositionAssociation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.reuseware.coconut.fracol.resource.fracol.IFracolReferenceResolveResult<org.reuseware.coconut.fracol.PortType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	/**
	 * @param element the port type
	 * @param container the composition association
	 * @param reference reference The reference that points at the port type
	 * 
	 * @return name of the port type
	 */
	public String deResolve(org.reuseware.coconut.fracol.PortType element, org.reuseware.coconut.fracol.CompositionAssociation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(java.util.Map<?, ?> options) { }
}
