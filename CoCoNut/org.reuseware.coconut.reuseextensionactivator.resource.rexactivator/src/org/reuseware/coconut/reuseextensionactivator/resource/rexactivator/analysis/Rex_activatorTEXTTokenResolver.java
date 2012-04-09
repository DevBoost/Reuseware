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
package org.reuseware.coconut.reuseextensionactivator.resource.rexactivator.analysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.reuseware.coconut.reuseextensionactivator.resource.rexactivator.IRex_activatorTokenResolveResult;
import org.reuseware.coconut.reuseextensionactivator.resource.rexactivator.IRex_activatorTokenResolver;
import org.reuseware.coconut.reuseextensionactivator.resource.rexactivator.mopp.Rex_activatorMetaInformation;

/**
 * The default TEXT token resolver extended with an escape mechanism that uses the
 * escape character "_".
 */
public class Rex_activatorTEXTTokenResolver implements IRex_activatorTokenResolver {
	
	protected static final Rex_activatorMetaInformation META_INFORMATION = 
		new Rex_activatorMetaInformation();
	protected static final String ESCAPE_SYMBOL = 
		"_";
	
	/**
	 * Removes leading "_".
	 * 
	 * @param lexem the text of the parsed token
	 * @param feature the corresponding feature in the meta model
	 * @param result the result of resolving the lexem, can be used to add processing errors
	 */
	public void resolve(String lexem, EStructuralFeature feature, IRex_activatorTokenResolveResult result) {
		if (lexem.startsWith(ESCAPE_SYMBOL)) {
			lexem = lexem.substring(ESCAPE_SYMBOL.length());
		}
		
		result.setResolvedToken(lexem);
	}
	
	/**
	 * Prepends "_" if value equals a keyword of the rex_activator language.
	 * 
	 * @param value the Object to be printed as String
	 * @param feature the corresponding feature (EAttribute)
	 * @param container the container of the object
	 * 
	 * @return the String representation or null if a problem occurred
	 */
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		if (value == null) {
			return "undefined";
		}
		
		String stringValue = (String) value;
		if (stringValue.startsWith(ESCAPE_SYMBOL)) {
			stringValue = ESCAPE_SYMBOL + stringValue;
		} else {
			for (String token : META_INFORMATION.getTokenNames()) {
				if (token.equals("'" + stringValue + "'")) {
					stringValue = ESCAPE_SYMBOL + stringValue;
				}
			}
		}
		
		return stringValue;
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(java.util.Map<?, ?> options) { }
	
}
