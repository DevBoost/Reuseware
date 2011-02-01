/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SNMP Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SNMPService#getTrapSourceForSNMPService <em>Trap Source For SNMP Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSNMPService()
 * @model
 * @generated
 */
public interface SNMPService extends Service {
	/**
	 * Returns the value of the '<em><b>Trap Source For SNMP Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trap Source For SNMP Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trap Source For SNMP Service</em>' reference.
	 * @see #setTrapSourceForSNMPService(ProtocolEndpoint)
	 * @see es.tid.cim.CimPackage#getSNMPService_TrapSourceForSNMPService()
	 * @model
	 * @generated
	 */
	ProtocolEndpoint getTrapSourceForSNMPService();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPService#getTrapSourceForSNMPService <em>Trap Source For SNMP Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trap Source For SNMP Service</em>' reference.
	 * @see #getTrapSourceForSNMPService()
	 * @generated
	 */
	void setTrapSourceForSNMPService(ProtocolEndpoint value);

} // SNMPService
