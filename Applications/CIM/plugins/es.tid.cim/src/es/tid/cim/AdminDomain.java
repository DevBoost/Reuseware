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
 * A representation of the model object '<em><b>Admin Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.AdminDomain#getContainedDomain <em>Contained Domain</em>}</li>
 *   <li>{@link es.tid.cim.AdminDomain#getNetworksInAdminDomain <em>Networks In Admin Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getAdminDomain()
 * @model
 * @generated
 */
public interface AdminDomain extends es.tid.cim.System {
	/**
	 * Returns the value of the '<em><b>Contained Domain</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.AdminDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Domain</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getAdminDomain_ContainedDomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdminDomain> getContainedDomain();

	/**
	 * Returns the value of the '<em><b>Networks In Admin Domain</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.LogicalNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks In Admin Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks In Admin Domain</em>' reference list.
	 * @see es.tid.cim.CimPackage#getAdminDomain_NetworksInAdminDomain()
	 * @model
	 * @generated
	 */
	EList<LogicalNetwork> getNetworksInAdminDomain();

} // AdminDomain
