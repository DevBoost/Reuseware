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
 * A representation of the model object '<em><b>Data Pilot Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getDataPilotGroupMember <em>Data Pilot Group Member</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupType()
 * @model extendedMetaData="name='data-pilot-group_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Group Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Group Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Group Member</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupType_DataPilotGroupMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='data-pilot-group-member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotGroupMemberType> getDataPilotGroupMember();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotGroupType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataPilotGroupType
