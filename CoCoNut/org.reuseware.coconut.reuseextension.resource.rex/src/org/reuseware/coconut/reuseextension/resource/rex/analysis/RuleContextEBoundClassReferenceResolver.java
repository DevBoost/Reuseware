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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.RuleContext;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolveResult;
import org.reuseware.coconut.reuseextension.resource.rex.IRexReferenceResolver;

/**
 * Finds the EClass for a rule context in the EPackages referenced by the reuse extension.
 */
public class RuleContextEBoundClassReferenceResolver implements 
			IRexReferenceResolver<RuleContext, EClass> {

	/**
	 * Looks for an EClass identified by the given identifier. All packages referenced
	 * in the containing reuse extension are considered. Subpackages are also supported
	 * via '::' notation.
	 * 
	 * @param identifier The identifier for the reference.
	 * @param container The object that contains the reference.
	 * @param reference The reference that points to the target of the reference.
	 * @param position The index of the reference (if it has an upper bound greater than 1).
	 * @param resolveFuzzy return objects that do not match exactly
	 * @param result an object that can be sued to store the result of the resolve operation.
	 */
	public void resolve(String identifier, RuleContext container, EReference reference, int position, boolean resolveFuzzy, IRexReferenceResolveResult<EClass> result) {
		EPackage ePackage = null;
		String eClassName = identifier;
		EObject eo = container;
		
		while (eo != null && !(eo instanceof ReuseExtension)) {
			eo = eo.eContainer();
		}
		if (eo == null) { 
			return;
		}
		ReuseExtension rex = (ReuseExtension) eo;
		
		if (eClassName.contains("::")) {
			//class resides in another package
			String[] namespaces = eClassName.split("::");
			eClassName = namespaces[namespaces.length - 1];
			String rootNsPrefix = namespaces[0];

			for (EPackage ePackageCand : rex.getEPackages()) {
				if (ePackageCand.getNsPrefix() != null) {
					if (ePackageCand.getNsPrefix().equals(rootNsPrefix)) {
						ePackage = (EPackage) ePackageCand;
						break;
					}
					//try name as alternative to nsPrefix
					if (ePackageCand.getName().equals(rootNsPrefix)) {
						ePackage = (EPackage) ePackageCand;
					}
				} 
			}				
			
			if (ePackage == null) {
				result.setErrorMessage("EPackage '" + rootNsPrefix + "' not found");
				return;
			}
			
			//subpackages
			outer : for (int i = 1; i < namespaces.length - 1; i++) {
				for (EPackage subPackage : ePackage.getESubpackages()) {
					if (namespaces[i].equals(subPackage.getNsPrefix())) {
						ePackage = subPackage;
						continue outer;
					}
				}
				for (EPackage subPackage : ePackage.getESubpackages()) {
					//try name as alternative to nsPrefix
					if (namespaces[i].equals(subPackage.getName())) {
						ePackage = subPackage;
						continue outer;
					}
				}
				result.setErrorMessage("Nested EPackage '" + namespaces[i] + "' not found");
				return;
			}
		} else {
			EObject rExtension = container;
			while (!(rExtension instanceof ReuseExtension)) {
				rExtension = rExtension.eContainer();
			}
			ePackage = ((ReuseExtension) rExtension).getEPackages().get(0);
		}

		if (ePackage != null && !ePackage.eIsProxy()) {
			if (resolveFuzzy) {
				for (EPackage subPackage : rex.getEPackages()) {
					collectClassesOfPackage("", subPackage, result);
				}		
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						result.addMapping(eClassifier.getName(), (EClass) eClassifier);
					}
				}
			} else {
				EClassifier eClassifier = ePackage.getEClassifier(eClassName); 
				if (eClassifier instanceof EClass) {
					result.addMapping(identifier, (EClass) eClassifier);
				}
			}
		} else {
			result.setErrorMessage("EClass '" + eClassName + "' not declared");
		}
	}

	private void collectClassesOfPackage(String oldBase, EPackage ePackage,
			IRexReferenceResolveResult<EClass> result) {
		String base = oldBase + ePackage.getNsPrefix() + "::";
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				result.addMapping(base + eClassifier.getName(), (EClass) eClassifier);
			}
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			collectClassesOfPackage(base, subPackage, result);
		}	
	}
	
	/**
	 * Returns the full qualified name of the EClass.
	 * 
	 * @param element The referenced model element.
	 * @param container The object referencing the element.
	 * @param reference The reference that holds the element.
	 * 
	 * @return The identification string for the reference
	 */
	public String deResolve(EClass element, RuleContext container, EReference reference) {
		EObject root = EcoreUtil.getRootContainer(container);
		if (element.getEPackage() == null || !(root instanceof ReuseExtension)) {
			return element.getName();
		}
		
		ReuseExtension reuseExtension = (ReuseExtension) root;
		String fullPackageName = fullPackageName(element.getEPackage(), reuseExtension);
		
		return fullPackageName + element.getName();
	}

	private String fullPackageName(EPackage ePackage, ReuseExtension reuseExtension) {
		String name = "";
		if (ePackage.getESuperPackage() != null) {
			if (!reuseExtension.getEPackages().contains(ePackage)) {
				name = fullPackageName(ePackage.getESuperPackage(), reuseExtension);
			}
		}
		name = name + ePackage.getName() + "::";
		return name;
	}

	/**
	 * @param options not supported
	 */
	public void setOptions(Map<?, ?> options) { }
}
