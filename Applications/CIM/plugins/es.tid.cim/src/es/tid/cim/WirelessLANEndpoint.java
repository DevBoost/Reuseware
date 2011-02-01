/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wireless LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.WirelessLANEndpoint#getSSID <em>SSID</em>}</li>
 *   <li>{@link es.tid.cim.WirelessLANEndpoint#isWEPEnabled <em>WEP Enabled</em>}</li>
 *   <li>{@link es.tid.cim.WirelessLANEndpoint#isWEPKeyMixEnabled <em>WEP Key Mix Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getWirelessLANEndpoint()
 * @model
 * @generated
 */
public interface WirelessLANEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>SSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSID</em>' attribute.
	 * @see #setSSID(String)
	 * @see es.tid.cim.CimPackage#getWirelessLANEndpoint_SSID()
	 * @model
	 * @generated
	 */
	String getSSID();

	/**
	 * Sets the value of the '{@link es.tid.cim.WirelessLANEndpoint#getSSID <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID</em>' attribute.
	 * @see #getSSID()
	 * @generated
	 */
	void setSSID(String value);

	/**
	 * Returns the value of the '<em><b>WEP Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WEP Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WEP Enabled</em>' attribute.
	 * @see #setWEPEnabled(boolean)
	 * @see es.tid.cim.CimPackage#getWirelessLANEndpoint_WEPEnabled()
	 * @model
	 * @generated
	 */
	boolean isWEPEnabled();

	/**
	 * Sets the value of the '{@link es.tid.cim.WirelessLANEndpoint#isWEPEnabled <em>WEP Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WEP Enabled</em>' attribute.
	 * @see #isWEPEnabled()
	 * @generated
	 */
	void setWEPEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>WEP Key Mix Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WEP Key Mix Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WEP Key Mix Enabled</em>' attribute.
	 * @see #setWEPKeyMixEnabled(boolean)
	 * @see es.tid.cim.CimPackage#getWirelessLANEndpoint_WEPKeyMixEnabled()
	 * @model
	 * @generated
	 */
	boolean isWEPKeyMixEnabled();

	/**
	 * Sets the value of the '{@link es.tid.cim.WirelessLANEndpoint#isWEPKeyMixEnabled <em>WEP Key Mix Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WEP Key Mix Enabled</em>' attribute.
	 * @see #isWEPKeyMixEnabled()
	 * @generated
	 */
	void setWEPKeyMixEnabled(boolean value);

} // WirelessLANEndpoint
