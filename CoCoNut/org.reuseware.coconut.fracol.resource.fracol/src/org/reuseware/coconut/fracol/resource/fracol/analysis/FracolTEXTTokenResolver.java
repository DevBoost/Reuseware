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

import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.coconut.fracol.resource.fracol.IFracolTokenResolveResult;
import org.reuseware.coconut.fracol.resource.fracol.mopp.FracolMetaInformation;

/**
 * The default TEXT token resolver extended with an escape mechanism that uses the
 * escape character "_". Furthermore, it adds/removes the file extension to/from the ID.
 */
public class FracolTEXTTokenResolver implements org.reuseware.coconut.fracol.resource.fracol.IFracolTokenResolver {
	
	protected static final FracolMetaInformation META_INFORMATION = 
		new FracolMetaInformation();
	protected static final String ESCAPE_SYMBOL = 
		"_";
	protected static final String FILE_EXTENSION = 
		"." + META_INFORMATION.getSyntaxName();
	
	/**
	 * Prepends "_" if value equals a keyword of the fracol language; removes file extension.
	 * 
	 * @param value the Object to be printed as String
	 * @param feature the corresponding feature (EAttribute)
	 * @param container the container of the object
	 * 
	 * @return the String representation or null if a problem occurred
	 */
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value == null) {
			return "undefined";
		}
		
		String stringValue = (String) value;
		if (stringValue.endsWith(FILE_EXTENSION)) {
			stringValue = stringValue.substring(0,
					stringValue.indexOf(FILE_EXTENSION));
		}

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
	 * Removes leading "_"; adds file extension.
	 * 
	 * @param lexem the text of the parsed token
	 * @param feature the corresponding feature in the meta model
	 * @param result the result of resolving the lexem, can be used to add processing errors
	 */
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, IFracolTokenResolveResult result) {
		if (FracolPackage.Literals.FRAGMENT_COLLABORATION__FRACOL_NAME.equals(feature)) {
			lexem = lexem + FILE_EXTENSION;
		}
		if (lexem.startsWith(ESCAPE_SYMBOL)) {
			lexem = lexem.substring(ESCAPE_SYMBOL.length());
		}
		result.setResolvedToken(lexem);
	}
	
	/**
	 * @param options not supported
	 */
	public void setOptions(java.util.Map<?, ?> options) { }
}
