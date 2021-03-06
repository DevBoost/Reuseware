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

/**
 * A default generated token resolver for quoted tokens (not modified).
 */
public class RexQUOTED_36_36TokenResolver implements org.reuseware.coconut.reuseextension.resource.rex.IRexTokenResolver {
	
	private org.reuseware.coconut.reuseextension.resource.rex.analysis.RexDefaultTokenResolver defaultTokenResolver = new org.reuseware.coconut.reuseextension.resource.rex.analysis.RexDefaultTokenResolver();
	
	/**
	 * @param value the Object to be printed as String
	 * @param feature the corresponding feature (EAttribute)
	 * @param container the container of the object
	 * 
	 * @return the String representation or null if a problem occurred
	 */
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		result += "$";
		result = "$" + result;
		return result;
	}
	
	/**
	 * @param lexem the text of the parsed token
	 * @param feature the corresponding feature in the meta model
	 * @param result the result of resolving the lexem, can be used to add processing
	 * errors
	 */
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.reuseware.coconut.reuseextension.resource.rex.IRexTokenResolveResult result) {
		lexem = lexem.substring(1);
		lexem = lexem.substring(0, lexem.length() - 1);
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(java.util.Map<?, ?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
