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
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Face Src Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceUri <em>Font Face Uri</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceName <em>Font Face Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceSrcType()
 * @model extendedMetaData="name='font-face-src_._type' kind='elementOnly'"
 * @generated
 */
public interface FontFaceSrcType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceSrcType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Font Face Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Uri</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceSrcType_FontFaceUri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-uri' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FontFaceUriType> getFontFaceUri();

	/**
	 * Returns the value of the '<em><b>Font Face Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Name</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceSrcType_FontFaceName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FontFaceNameType> getFontFaceName();

} // FontFaceSrcType
