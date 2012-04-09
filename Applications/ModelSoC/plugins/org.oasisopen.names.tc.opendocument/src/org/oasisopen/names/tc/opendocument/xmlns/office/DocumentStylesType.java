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
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getMasterStyles <em>Master Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType()
 * @model extendedMetaData="name='document-styles_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStylesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Decls</em>' containment reference.
	 * @see #setFontFaceDecls(FontFaceDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType_FontFaceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font-face-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceDeclsType getFontFaceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getFontFaceDecls <em>Font Face Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Decls</em>' containment reference.
	 * @see #getFontFaceDecls()
	 * @generated
	 */
	void setFontFaceDecls(FontFaceDeclsType value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference.
	 * @see #setStyles(StylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType_Styles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='styles' namespace='##targetNamespace'"
	 * @generated
	 */
	StylesType getStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getStyles <em>Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles</em>' containment reference.
	 * @see #getStyles()
	 * @generated
	 */
	void setStyles(StylesType value);

	/**
	 * Returns the value of the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Styles</em>' containment reference.
	 * @see #setAutomaticStyles(AutomaticStylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType_AutomaticStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automatic-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	AutomaticStylesType getAutomaticStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getAutomaticStyles <em>Automatic Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Styles</em>' containment reference.
	 * @see #getAutomaticStyles()
	 * @generated
	 */
	void setAutomaticStyles(AutomaticStylesType value);

	/**
	 * Returns the value of the '<em><b>Master Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Styles</em>' containment reference.
	 * @see #setMasterStyles(MasterStylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType_MasterStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='master-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterStylesType getMasterStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getMasterStyles <em>Master Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Styles</em>' containment reference.
	 * @see #getMasterStyles()
	 * @generated
	 */
	void setMasterStyles(MasterStylesType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentStylesType_Version()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DocumentStylesType
