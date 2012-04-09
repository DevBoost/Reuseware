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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Groups Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDataPilotGroup <em>Data Pilot Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType()
 * @model extendedMetaData="name='data-pilot-groups_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotGroupsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Group</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_DataPilotGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='data-pilot-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotGroupType> getDataPilotGroup();

	/**
	 * Returns the value of the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date End</em>' attribute.
	 * @see #setDateEnd(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_DateEnd()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DateEndType"
	 *        extendedMetaData="kind='attribute' name='date-end' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateEnd <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date End</em>' attribute.
	 * @see #getDateEnd()
	 * @generated
	 */
	void setDateEnd(Object value);

	/**
	 * Returns the value of the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Start</em>' attribute.
	 * @see #setDateStart(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_DateStart()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DateStartType"
	 *        extendedMetaData="kind='attribute' name='date-start' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateStart <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Start</em>' attribute.
	 * @see #getDateStart()
	 * @generated
	 */
	void setDateStart(Object value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.EndType"
	 *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Object value);

	/**
	 * Returns the value of the '<em><b>Grouped By</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped By</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see #isSetGroupedBy()
	 * @see #unsetGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_GroupedBy()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='grouped-by' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupedByType getGroupedBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouped By</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see #isSetGroupedBy()
	 * @see #unsetGroupedBy()
	 * @see #getGroupedBy()
	 * @generated
	 */
	void setGroupedBy(GroupedByType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupedBy()
	 * @see #getGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @generated
	 */
	void unsetGroupedBy();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy <em>Grouped By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouped By</em>' attribute is set.
	 * @see #unsetGroupedBy()
	 * @see #getGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @generated
	 */
	boolean isSetGroupedBy();

	/**
	 * Returns the value of the '<em><b>Source Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Field Name</em>' attribute.
	 * @see #setSourceFieldName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_SourceFieldName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='source-field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceFieldName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getSourceFieldName <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Field Name</em>' attribute.
	 * @see #getSourceFieldName()
	 * @generated
	 */
	void setSourceFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_Start()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StartType"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Object value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #setStep(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupsType_Step()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	void unsetStep();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep <em>Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step</em>' attribute is set.
	 * @see #unsetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	boolean isSetStep();

} // DataPilotGroupsType
