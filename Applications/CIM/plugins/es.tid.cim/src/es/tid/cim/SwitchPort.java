/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SwitchPort#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSwitchPort()
 * @model
 * @generated
 */
public interface SwitchPort extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see es.tid.cim.CimPackage#getSwitchPort_PortNumber()
	 * @model
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SwitchPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

} // SwitchPort