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
 * A representation of the model object '<em><b>Data Pilot Members Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType#getDataPilotMember <em>Data Pilot Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotMembersType()
 * @model extendedMetaData="name='data-pilot-members_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotMembersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Member</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotMembersType_DataPilotMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotMemberType> getDataPilotMember();

} // DataPilotMembersType
