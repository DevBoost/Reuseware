/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wireless Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.WirelessPort#getSignalStrength <em>Signal Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getWirelessPort()
 * @model
 * @generated
 */
public interface WirelessPort extends NetworkPort {
	/**
	 * Returns the value of the '<em><b>Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Strength</em>' attribute.
	 * @see #setSignalStrength(int)
	 * @see es.tid.cim.CimPackage#getWirelessPort_SignalStrength()
	 * @model
	 * @generated
	 */
	int getSignalStrength();

	/**
	 * Sets the value of the '{@link es.tid.cim.WirelessPort#getSignalStrength <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Strength</em>' attribute.
	 * @see #getSignalStrength()
	 * @generated
	 */
	void setSignalStrength(int value);

} // WirelessPort
