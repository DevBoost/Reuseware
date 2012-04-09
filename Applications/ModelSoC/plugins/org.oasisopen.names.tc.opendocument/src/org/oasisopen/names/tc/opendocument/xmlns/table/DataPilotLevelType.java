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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotMembers <em>Data Pilot Members</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty <em>Show Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType()
 * @model extendedMetaData="name='data-pilot-level_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotLevelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Subtotals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Subtotals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Subtotals</em>' containment reference.
	 * @see #setDataPilotSubtotals(DataPilotSubtotalsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_DataPilotSubtotals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-subtotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotSubtotalsType getDataPilotSubtotals();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Subtotals</em>' containment reference.
	 * @see #getDataPilotSubtotals()
	 * @generated
	 */
	void setDataPilotSubtotals(DataPilotSubtotalsType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Members</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Members</em>' containment reference.
	 * @see #setDataPilotMembers(DataPilotMembersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_DataPilotMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-members' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotMembersType getDataPilotMembers();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotMembers <em>Data Pilot Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Members</em>' containment reference.
	 * @see #getDataPilotMembers()
	 * @generated
	 */
	void setDataPilotMembers(DataPilotMembersType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Display Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Display Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Display Info</em>' containment reference.
	 * @see #setDataPilotDisplayInfo(DataPilotDisplayInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_DataPilotDisplayInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-display-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotDisplayInfoType getDataPilotDisplayInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Display Info</em>' containment reference.
	 * @see #getDataPilotDisplayInfo()
	 * @generated
	 */
	void setDataPilotDisplayInfo(DataPilotDisplayInfoType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Sort Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Sort Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Sort Info</em>' containment reference.
	 * @see #setDataPilotSortInfo(DataPilotSortInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_DataPilotSortInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-sort-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotSortInfoType getDataPilotSortInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Sort Info</em>' containment reference.
	 * @see #getDataPilotSortInfo()
	 * @generated
	 */
	void setDataPilotSortInfo(DataPilotSortInfoType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Layout Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Layout Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Layout Info</em>' containment reference.
	 * @see #setDataPilotLayoutInfo(DataPilotLayoutInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_DataPilotLayoutInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-layout-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotLayoutInfoType getDataPilotLayoutInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Layout Info</em>' containment reference.
	 * @see #getDataPilotLayoutInfo()
	 * @generated
	 */
	void setDataPilotLayoutInfo(DataPilotLayoutInfoType value);

	/**
	 * Returns the value of the '<em><b>Show Empty</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Empty</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEmpty()
	 * @see #unsetShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLevelType_ShowEmpty()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-empty' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEmpty();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Empty</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEmpty()
	 * @see #unsetShowEmpty()
	 * @see #getShowEmpty()
	 * @generated
	 */
	void setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowEmpty()
	 * @see #getShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowEmpty();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty <em>Show Empty</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Empty</em>' attribute is set.
	 * @see #unsetShowEmpty()
	 * @see #getShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowEmpty();

} // DataPilotLevelType
