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
 * A representation of the model object '<em><b>Network Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NetworkPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getLinkTechnology <em>Link Technology</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getOtherLinktechnology <em>Other Linktechnology</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#isFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#isAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link es.tid.cim.NetworkPort#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNetworkPort()
 * @model
 * @generated
 */
public interface NetworkPort extends LogicalPort {
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
	 * @see es.tid.cim.CimPackage#getNetworkPort_PortNumber()
	 * @model
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

	/**
	 * Returns the value of the '<em><b>Link Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumLinkTechnology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Technology</em>' attribute.
	 * @see es.tid.cim.EnumLinkTechnology
	 * @see #setLinkTechnology(EnumLinkTechnology)
	 * @see es.tid.cim.CimPackage#getNetworkPort_LinkTechnology()
	 * @model
	 * @generated
	 */
	EnumLinkTechnology getLinkTechnology();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getLinkTechnology <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Technology</em>' attribute.
	 * @see es.tid.cim.EnumLinkTechnology
	 * @see #getLinkTechnology()
	 * @generated
	 */
	void setLinkTechnology(EnumLinkTechnology value);

	/**
	 * Returns the value of the '<em><b>Other Linktechnology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Linktechnology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Linktechnology</em>' attribute.
	 * @see #setOtherLinktechnology(String)
	 * @see es.tid.cim.CimPackage#getNetworkPort_OtherLinktechnology()
	 * @model
	 * @generated
	 */
	String getOtherLinktechnology();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getOtherLinktechnology <em>Other Linktechnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Linktechnology</em>' attribute.
	 * @see #getOtherLinktechnology()
	 * @generated
	 */
	void setOtherLinktechnology(String value);

	/**
	 * Returns the value of the '<em><b>Network Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Addresses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Addresses</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getNetworkPort_NetworkAddresses()
	 * @model
	 * @generated
	 */
	EList<String> getNetworkAddresses();

	/**
	 * Returns the value of the '<em><b>Full Duplex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Duplex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Duplex</em>' attribute.
	 * @see #setFullDuplex(boolean)
	 * @see es.tid.cim.CimPackage#getNetworkPort_FullDuplex()
	 * @model
	 * @generated
	 */
	boolean isFullDuplex();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#isFullDuplex <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Duplex</em>' attribute.
	 * @see #isFullDuplex()
	 * @generated
	 */
	void setFullDuplex(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Sense</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Sense</em>' attribute.
	 * @see #setAutoSense(boolean)
	 * @see es.tid.cim.CimPackage#getNetworkPort_AutoSense()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoSense();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#isAutoSense <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Sense</em>' attribute.
	 * @see #isAutoSense()
	 * @generated
	 */
	void setAutoSense(boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Maximum Transmission Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Maximum Transmission Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Maximum Transmission Unit</em>' attribute.
	 * @see #setSupportedMaximumTransmissionUnit(int)
	 * @see es.tid.cim.CimPackage#getNetworkPort_SupportedMaximumTransmissionUnit()
	 * @model
	 * @generated
	 */
	int getSupportedMaximumTransmissionUnit();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Maximum Transmission Unit</em>' attribute.
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 */
	void setSupportedMaximumTransmissionUnit(int value);

	/**
	 * Returns the value of the '<em><b>Permanent Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permanent Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permanent Address</em>' attribute.
	 * @see #setPermanentAddress(String)
	 * @see es.tid.cim.CimPackage#getNetworkPort_PermanentAddress()
	 * @model
	 * @generated
	 */
	String getPermanentAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getPermanentAddress <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent Address</em>' attribute.
	 * @see #getPermanentAddress()
	 * @generated
	 */
	void setPermanentAddress(String value);

	/**
	 * Returns the value of the '<em><b>Active Maximum Transmission Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Maximum Transmission Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Maximum Transmission Unit</em>' attribute.
	 * @see #setActiveMaximumTransmissionUnit(int)
	 * @see es.tid.cim.CimPackage#getNetworkPort_ActiveMaximumTransmissionUnit()
	 * @model
	 * @generated
	 */
	int getActiveMaximumTransmissionUnit();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkPort#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Maximum Transmission Unit</em>' attribute.
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 */
	void setActiveMaximumTransmissionUnit(int value);

} // NetworkPort
