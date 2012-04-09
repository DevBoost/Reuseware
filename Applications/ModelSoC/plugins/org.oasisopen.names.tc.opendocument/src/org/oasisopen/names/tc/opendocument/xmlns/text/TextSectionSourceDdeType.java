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
import org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Source Dde Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getAutomaticUpdate <em>Automatic Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getConversionMode <em>Conversion Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeApplication <em>Dde Application</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeItem <em>Dde Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeTopic <em>Dde Topic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType()
 * @model extendedMetaData="name='text-section-source-dde_._type' kind='empty'"
 * @generated
 */
public interface TextSectionSourceDdeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatic Update</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticUpdate()
	 * @see #unsetAutomaticUpdate()
	 * @see #setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_AutomaticUpdate()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-update' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticUpdate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getAutomaticUpdate <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticUpdate()
	 * @see #unsetAutomaticUpdate()
	 * @see #getAutomaticUpdate()
	 * @generated
	 */
	void setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getAutomaticUpdate <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticUpdate()
	 * @see #getAutomaticUpdate()
	 * @see #setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticUpdate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getAutomaticUpdate <em>Automatic Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Update</em>' attribute is set.
	 * @see #unsetAutomaticUpdate()
	 * @see #getAutomaticUpdate()
	 * @see #setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticUpdate();

	/**
	 * Returns the value of the '<em><b>Conversion Mode</b></em>' attribute.
	 * The default value is <code>"into-default-style-data-style"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @see #isSetConversionMode()
	 * @see #unsetConversionMode()
	 * @see #setConversionMode(ConversionModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_ConversionMode()
	 * @model default="into-default-style-data-style" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conversion-mode' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ConversionModeType getConversionMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getConversionMode <em>Conversion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @see #isSetConversionMode()
	 * @see #unsetConversionMode()
	 * @see #getConversionMode()
	 * @generated
	 */
	void setConversionMode(ConversionModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getConversionMode <em>Conversion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConversionMode()
	 * @see #getConversionMode()
	 * @see #setConversionMode(ConversionModeType)
	 * @generated
	 */
	void unsetConversionMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getConversionMode <em>Conversion Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conversion Mode</em>' attribute is set.
	 * @see #unsetConversionMode()
	 * @see #getConversionMode()
	 * @see #setConversionMode(ConversionModeType)
	 * @generated
	 */
	boolean isSetConversionMode();

	/**
	 * Returns the value of the '<em><b>Dde Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Application</em>' attribute.
	 * @see #setDdeApplication(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_DdeApplication()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='dde-application' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getDdeApplication();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeApplication <em>Dde Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Application</em>' attribute.
	 * @see #getDdeApplication()
	 * @generated
	 */
	void setDdeApplication(String value);

	/**
	 * Returns the value of the '<em><b>Dde Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Item</em>' attribute.
	 * @see #setDdeItem(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_DdeItem()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='dde-item' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getDdeItem();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeItem <em>Dde Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Item</em>' attribute.
	 * @see #getDdeItem()
	 * @generated
	 */
	void setDdeItem(String value);

	/**
	 * Returns the value of the '<em><b>Dde Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Topic</em>' attribute.
	 * @see #setDdeTopic(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_DdeTopic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='dde-topic' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getDdeTopic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getDdeTopic <em>Dde Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Topic</em>' attribute.
	 * @see #getDdeTopic()
	 * @generated
	 */
	void setDdeTopic(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextSectionSourceDdeType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TextSectionSourceDdeType
