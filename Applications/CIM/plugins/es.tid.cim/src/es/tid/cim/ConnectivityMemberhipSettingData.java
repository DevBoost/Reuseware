/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Memberhip Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ConnectivityMemberhipSettingData#getConnectivityMembershipType <em>Connectivity Membership Type</em>}</li>
 *   <li>{@link es.tid.cim.ConnectivityMemberhipSettingData#getOtherConnectivityMembershipType <em>Other Connectivity Membership Type</em>}</li>
 *   <li>{@link es.tid.cim.ConnectivityMemberhipSettingData#getConnectivityMembershipID <em>Connectivity Membership ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getConnectivityMemberhipSettingData()
 * @model
 * @generated
 */
public interface ConnectivityMemberhipSettingData extends SettingData {
	/**
	 * Returns the value of the '<em><b>Connectivity Membership Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Membership Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Membership Type</em>' attribute.
	 * @see #setConnectivityMembershipType(String)
	 * @see es.tid.cim.CimPackage#getConnectivityMemberhipSettingData_ConnectivityMembershipType()
	 * @model
	 * @generated
	 */
	String getConnectivityMembershipType();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConnectivityMemberhipSettingData#getConnectivityMembershipType <em>Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Membership Type</em>' attribute.
	 * @see #getConnectivityMembershipType()
	 * @generated
	 */
	void setConnectivityMembershipType(String value);

	/**
	 * Returns the value of the '<em><b>Other Connectivity Membership Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Connectivity Membership Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Connectivity Membership Type</em>' attribute.
	 * @see #setOtherConnectivityMembershipType(String)
	 * @see es.tid.cim.CimPackage#getConnectivityMemberhipSettingData_OtherConnectivityMembershipType()
	 * @model
	 * @generated
	 */
	String getOtherConnectivityMembershipType();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConnectivityMemberhipSettingData#getOtherConnectivityMembershipType <em>Other Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Connectivity Membership Type</em>' attribute.
	 * @see #getOtherConnectivityMembershipType()
	 * @generated
	 */
	void setOtherConnectivityMembershipType(String value);

	/**
	 * Returns the value of the '<em><b>Connectivity Membership ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Membership ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Membership ID</em>' attribute.
	 * @see #setConnectivityMembershipID(String)
	 * @see es.tid.cim.CimPackage#getConnectivityMemberhipSettingData_ConnectivityMembershipID()
	 * @model
	 * @generated
	 */
	String getConnectivityMembershipID();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConnectivityMemberhipSettingData#getConnectivityMembershipID <em>Connectivity Membership ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Membership ID</em>' attribute.
	 * @see #getConnectivityMembershipID()
	 * @generated
	 */
	void setConnectivityMembershipID(String value);

} // ConnectivityMemberhipSettingData
