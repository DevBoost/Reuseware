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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Display Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode <em>Display Member Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getMemberCount <em>Member Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotDisplayInfoType()
 * @model extendedMetaData="name='data-pilot-display-info_._type' kind='empty'"
 * @generated
 */
public interface DataPilotDisplayInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' attribute.
	 * @see #setDataField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotDisplayInfoType_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDataField <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' attribute.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(String value);

	/**
	 * Returns the value of the '<em><b>Display Member Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Member Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Member Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see #isSetDisplayMemberMode()
	 * @see #unsetDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotDisplayInfoType_DisplayMemberMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='display-member-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayMemberModeType getDisplayMemberMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Member Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see #isSetDisplayMemberMode()
	 * @see #unsetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @generated
	 */
	void setDisplayMemberMode(DisplayMemberModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @generated
	 */
	void unsetDisplayMemberMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode <em>Display Member Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Member Mode</em>' attribute is set.
	 * @see #unsetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @generated
	 */
	boolean isSetDisplayMemberMode();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotDisplayInfoType_Enabled()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>Member Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Count</em>' attribute.
	 * @see #setMemberCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotDisplayInfoType_MemberCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='member-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMemberCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getMemberCount <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Count</em>' attribute.
	 * @see #getMemberCount()
	 * @generated
	 */
	void setMemberCount(BigInteger value);

} // DataPilotDisplayInfoType
