/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DNSSettingData#getDNSServerAddresses <em>DNS Server Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDNSSettingData()
 * @model
 * @generated
 */
public interface DNSSettingData extends IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>DNS Server Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DNS Server Addresses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DNS Server Addresses</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getDNSSettingData_DNSServerAddresses()
	 * @model
	 * @generated
	 */
	EList<String> getDNSServerAddresses();

} // DNSSettingData
