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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getHeaderStyleType()
 * @model extendedMetaData="name='header-style_._type' kind='elementOnly'"
 * @generated
 */
public interface HeaderStyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Footer Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #setHeaderFooterProperties(StyleHeaderFooterPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getHeaderStyleType_HeaderFooterProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header-footer-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleHeaderFooterPropertiesContent getHeaderFooterProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #getHeaderFooterProperties()
	 * @generated
	 */
	void setHeaderFooterProperties(StyleHeaderFooterPropertiesContent value);

} // HeaderStyleType
