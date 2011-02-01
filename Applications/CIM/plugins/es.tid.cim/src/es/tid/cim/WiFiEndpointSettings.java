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
 * A representation of the model object '<em><b>Wi Fi Endpoint Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getKeyIndex <em>Key Index</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getPSKPassPhrase <em>PSK Pass Phrase</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getSSID <em>SSID</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getKeys <em>Keys</em>}</li>
 *   <li>{@link es.tid.cim.WiFiEndpointSettings#getPSKValue <em>PSK Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings()
 * @model
 * @generated
 */
public interface WiFiEndpointSettings extends SettingData {
	/**
	 * Returns the value of the '<em><b>Authentication Method</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAuthenticationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see es.tid.cim.EnumAuthenticationMethod
	 * @see #setAuthenticationMethod(EnumAuthenticationMethod)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_AuthenticationMethod()
	 * @model
	 * @generated
	 */
	EnumAuthenticationMethod getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Method</em>' attribute.
	 * @see es.tid.cim.EnumAuthenticationMethod
	 * @see #getAuthenticationMethod()
	 * @generated
	 */
	void setAuthenticationMethod(EnumAuthenticationMethod value);

	/**
	 * Returns the value of the '<em><b>BSS Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumBSSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BSS Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSS Type</em>' attribute.
	 * @see es.tid.cim.EnumBSSType
	 * @see #setBSSType(EnumBSSType)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_BSSType()
	 * @model
	 * @generated
	 */
	EnumBSSType getBSSType();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getBSSType <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSS Type</em>' attribute.
	 * @see es.tid.cim.EnumBSSType
	 * @see #getBSSType()
	 * @generated
	 */
	void setBSSType(EnumBSSType value);

	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumEncryptionMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Method</em>' attribute.
	 * @see es.tid.cim.EnumEncryptionMethod
	 * @see #setEncryptionMethod(EnumEncryptionMethod)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_EncryptionMethod()
	 * @model
	 * @generated
	 */
	EnumEncryptionMethod getEncryptionMethod();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getEncryptionMethod <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Method</em>' attribute.
	 * @see es.tid.cim.EnumEncryptionMethod
	 * @see #getEncryptionMethod()
	 * @generated
	 */
	void setEncryptionMethod(EnumEncryptionMethod value);

	/**
	 * Returns the value of the '<em><b>Key Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Index</em>' attribute.
	 * @see #setKeyIndex(int)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_KeyIndex()
	 * @model
	 * @generated
	 */
	int getKeyIndex();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getKeyIndex <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Index</em>' attribute.
	 * @see #getKeyIndex()
	 * @generated
	 */
	void setKeyIndex(int value);

	/**
	 * Returns the value of the '<em><b>Other Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Authentication Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #setOtherAuthenticationMethod(String)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_OtherAuthenticationMethod()
	 * @model
	 * @generated
	 */
	String getOtherAuthenticationMethod();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getOtherAuthenticationMethod <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 */
	void setOtherAuthenticationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Other Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Encryption Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Encryption Method</em>' attribute.
	 * @see #setOtherEncryptionMethod(String)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_OtherEncryptionMethod()
	 * @model
	 * @generated
	 */
	String getOtherEncryptionMethod();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getOtherEncryptionMethod <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encryption Method</em>' attribute.
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 */
	void setOtherEncryptionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>PSK Pass Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSK Pass Phrase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSK Pass Phrase</em>' attribute.
	 * @see #setPSKPassPhrase(String)
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_PSKPassPhrase()
	 * @model
	 * @generated
	 */
	String getPSKPassPhrase();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getPSKPassPhrase <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSK Pass Phrase</em>' attribute.
	 * @see #getPSKPassPhrase()
	 * @generated
	 */
	void setPSKPassPhrase(String value);

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
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_SSID()
	 * @model
	 * @generated
	 */
	String getSSID();

	/**
	 * Sets the value of the '{@link es.tid.cim.WiFiEndpointSettings#getSSID <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID</em>' attribute.
	 * @see #getSSID()
	 * @generated
	 */
	void setSSID(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_Keys()
	 * @model
	 * @generated
	 */
	EList<String> getKeys();

	/**
	 * Returns the value of the '<em><b>PSK Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSK Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSK Value</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getWiFiEndpointSettings_PSKValue()
	 * @model
	 * @generated
	 */
	EList<Integer> getPSKValue();

} // WiFiEndpointSettings
