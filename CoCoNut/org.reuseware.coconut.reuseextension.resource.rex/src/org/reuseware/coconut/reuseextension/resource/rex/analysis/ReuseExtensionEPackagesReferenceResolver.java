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

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the EPackage for the metamodel that is extended by a reuse extension.
 * The metamodel is identified by its nsURI with which it is registered in
 * EMF's global registry.
 */
public class ReuseExtensionEPackagesReferenceResolver implements 
			IRexReferenceResolver<ReuseExtension, EPackage> {
	
	/**
	 * Searches EMF's registry for the Ecore metamodel with the given nsURI.
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, ReuseExtension container, EReference reference, int position, boolean resolveFuzzy, IRexReferenceResolveResult<org.eclipse.emf.ecore.EPackage> result) {
		if (resolveFuzzy) {
			for (String nsURI : EPackage.Registry.INSTANCE.keySet()) {
				if ("<".concat(nsURI).startsWith(identifier)) {
					result.addMapping(nsURI, (EPackage) null);
				}
			}
		} else {
			String nsURI = identifier;
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
			if (ePackage != null) {
				result.addMapping(identifier, ePackage);
			}
		}
		
		result.setErrorMessage("EPackage not registered: " + identifier);
	}
	
	/**
	 * Returns the nsURI of the EPackage.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public String deResolve(org.eclipse.emf.ecore.EPackage element, ReuseExtension container, EReference reference) {
		return ((EPackage) element).getNsURI();
	}

	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
