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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office Body Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent#getOfficeBodyContentGroup <em>Office Body Content Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent#getOfficeBodyContent <em>Office Body Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeBodyContent()
 * @model extendedMetaData="name='office-body-content' kind='elementOnly'"
 * @generated
 */
public interface OfficeBodyContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Office Body Content Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office Body Content Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office Body Content Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeBodyContent_OfficeBodyContentGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='office-body-content:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOfficeBodyContentGroup();

	/**
	 * Returns the value of the '<em><b>Office Body Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office Body Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office Body Content</em>' containment reference.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeBodyContent_OfficeBodyContent()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='office-body-content' namespace='##targetNamespace' group='office-body-content:group'"
	 * @generated
	 */
	EObject getOfficeBodyContent();

} // OfficeBodyContent
