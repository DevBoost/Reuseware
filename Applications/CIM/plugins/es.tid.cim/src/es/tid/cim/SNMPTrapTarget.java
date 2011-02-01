/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SNMP Trap Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SNMPTrapTarget#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link es.tid.cim.SNMPTrapTarget#getSNMPVersion <em>SNMP Version</em>}</li>
 *   <li>{@link es.tid.cim.SNMPTrapTarget#getCommunityString <em>Community String</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSNMPTrapTarget()
 * @model
 * @generated
 */
public interface SNMPTrapTarget extends RemotePort {
	/**
	 * Returns the value of the '<em><b>Notification Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Message</em>' attribute.
	 * @see #setNotificationMessage(String)
	 * @see es.tid.cim.CimPackage#getSNMPTrapTarget_NotificationMessage()
	 * @model
	 * @generated
	 */
	String getNotificationMessage();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPTrapTarget#getNotificationMessage <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Message</em>' attribute.
	 * @see #getNotificationMessage()
	 * @generated
	 */
	void setNotificationMessage(String value);

	/**
	 * Returns the value of the '<em><b>SNMP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SNMP Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SNMP Version</em>' attribute.
	 * @see #setSNMPVersion(String)
	 * @see es.tid.cim.CimPackage#getSNMPTrapTarget_SNMPVersion()
	 * @model
	 * @generated
	 */
	String getSNMPVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPTrapTarget#getSNMPVersion <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SNMP Version</em>' attribute.
	 * @see #getSNMPVersion()
	 * @generated
	 */
	void setSNMPVersion(String value);

	/**
	 * Returns the value of the '<em><b>Community String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Community String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Community String</em>' attribute.
	 * @see #setCommunityString(String)
	 * @see es.tid.cim.CimPackage#getSNMPTrapTarget_CommunityString()
	 * @model
	 * @generated
	 */
	String getCommunityString();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPTrapTarget#getCommunityString <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Community String</em>' attribute.
	 * @see #getCommunityString()
	 * @generated
	 */
	void setCommunityString(String value);

} // SNMPTrapTarget
