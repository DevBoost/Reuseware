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
 * A representation of the model object '<em><b>Data Pilot Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotLevel <em>Data Pilot Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotGroups <em>Data Pilot Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField <em>Is Data Layout Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSelectedPage <em>Selected Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy <em>Used Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType()
 * @model extendedMetaData="name='data-pilot-field_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Level</em>' containment reference.
	 * @see #setDataPilotLevel(DataPilotLevelType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_DataPilotLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-level' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotLevelType getDataPilotLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotLevel <em>Data Pilot Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Level</em>' containment reference.
	 * @see #getDataPilotLevel()
	 * @generated
	 */
	void setDataPilotLevel(DataPilotLevelType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Field Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Field Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Field Reference</em>' containment reference.
	 * @see #setDataPilotFieldReference(DataPilotFieldReferenceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_DataPilotFieldReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-field-reference' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotFieldReferenceType getDataPilotFieldReference();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Field Reference</em>' containment reference.
	 * @see #getDataPilotFieldReference()
	 * @generated
	 */
	void setDataPilotFieldReference(DataPilotFieldReferenceType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Groups</em>' containment reference.
	 * @see #setDataPilotGroups(DataPilotGroupsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_DataPilotGroups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-groups' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotGroupsType getDataPilotGroups();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotGroups <em>Data Pilot Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Groups</em>' containment reference.
	 * @see #getDataPilotGroups()
	 * @generated
	 */
	void setDataPilotGroups(DataPilotGroupsType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_Function()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionType"
	 *        extendedMetaData="kind='attribute' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFunction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Object value);

	/**
	 * Returns the value of the '<em><b>Is Data Layout Field</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Data Layout Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Layout Field</em>' attribute.
	 * @see #isSetIsDataLayoutField()
	 * @see #unsetIsDataLayoutField()
	 * @see #setIsDataLayoutField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_IsDataLayoutField()
	 * @model default="false" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='is-data-layout-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsDataLayoutField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Layout Field</em>' attribute.
	 * @see #isSetIsDataLayoutField()
	 * @see #unsetIsDataLayoutField()
	 * @see #getIsDataLayoutField()
	 * @generated
	 */
	void setIsDataLayoutField(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDataLayoutField()
	 * @see #getIsDataLayoutField()
	 * @see #setIsDataLayoutField(String)
	 * @generated
	 */
	void unsetIsDataLayoutField();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField <em>Is Data Layout Field</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Data Layout Field</em>' attribute is set.
	 * @see #unsetIsDataLayoutField()
	 * @see #getIsDataLayoutField()
	 * @see #setIsDataLayoutField(String)
	 * @generated
	 */
	boolean isSetIsDataLayoutField();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_Orientation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Selected Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Page</em>' attribute.
	 * @see #setSelectedPage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_SelectedPage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='selected-page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSelectedPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSelectedPage <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Page</em>' attribute.
	 * @see #getSelectedPage()
	 * @generated
	 */
	void setSelectedPage(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_SourceFieldName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='source-field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceFieldName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSourceFieldName <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Field Name</em>' attribute.
	 * @see #getSourceFieldName()
	 * @generated
	 */
	void setSourceFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Used Hierarchy</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Hierarchy</em>' attribute.
	 * @see #isSetUsedHierarchy()
	 * @see #unsetUsedHierarchy()
	 * @see #setUsedHierarchy(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotFieldType_UsedHierarchy()
	 * @model default="-1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='used-hierarchy' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUsedHierarchy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Hierarchy</em>' attribute.
	 * @see #isSetUsedHierarchy()
	 * @see #unsetUsedHierarchy()
	 * @see #getUsedHierarchy()
	 * @generated
	 */
	void setUsedHierarchy(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsedHierarchy()
	 * @see #getUsedHierarchy()
	 * @see #setUsedHierarchy(BigInteger)
	 * @generated
	 */
	void unsetUsedHierarchy();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy <em>Used Hierarchy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Used Hierarchy</em>' attribute is set.
	 * @see #unsetUsedHierarchy()
	 * @see #getUsedHierarchy()
	 * @see #setUsedHierarchy(BigInteger)
	 * @generated
	 */
	boolean isSetUsedHierarchy();

} // DataPilotFieldType
