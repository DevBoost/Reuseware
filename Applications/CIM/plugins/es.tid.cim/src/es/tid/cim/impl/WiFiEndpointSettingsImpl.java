/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumAuthenticationMethod;
import es.tid.cim.EnumBSSType;
import es.tid.cim.EnumEncryptionMethod;
import es.tid.cim.WiFiEndpointSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wi Fi Endpoint Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getKeyIndex <em>Key Index</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getPSKPassPhrase <em>PSK Pass Phrase</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getSSID <em>SSID</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link es.tid.cim.impl.WiFiEndpointSettingsImpl#getPSKValue <em>PSK Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiFiEndpointSettingsImpl extends SettingDataImpl implements WiFiEndpointSettings {
	/**
	 * The default value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAuthenticationMethod AUTHENTICATION_METHOD_EDEFAULT = EnumAuthenticationMethod.OTHER;

	/**
	 * The cached value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected EnumAuthenticationMethod authenticationMethod = AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBSSType() <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSSType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumBSSType BSS_TYPE_EDEFAULT = EnumBSSType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getBSSType() <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSSType()
	 * @generated
	 * @ordered
	 */
	protected EnumBSSType bssType = BSS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EnumEncryptionMethod ENCRYPTION_METHOD_EDEFAULT = EnumEncryptionMethod.OTHER;

	/**
	 * The cached value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected EnumEncryptionMethod encryptionMethod = ENCRYPTION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyIndex() <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeyIndex() <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected int keyIndex = KEY_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAuthenticationMethod() <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AUTHENTICATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAuthenticationMethod() <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherAuthenticationMethod = OTHER_AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEncryptionMethod() <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENCRYPTION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEncryptionMethod() <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherEncryptionMethod = OTHER_ENCRYPTION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPSKPassPhrase() <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected static final String PSK_PASS_PHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPSKPassPhrase() <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected String pskPassPhrase = PSK_PASS_PHRASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;

	/**
	 * The cached value of the '{@link #getPSKValue() <em>PSK Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pskValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiFiEndpointSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getWiFiEndpointSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAuthenticationMethod getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationMethod(EnumAuthenticationMethod newAuthenticationMethod) {
		EnumAuthenticationMethod oldAuthenticationMethod = authenticationMethod;
		authenticationMethod = newAuthenticationMethod == null ? AUTHENTICATION_METHOD_EDEFAULT : newAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBSSType getBSSType() {
		return bssType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBSSType(EnumBSSType newBSSType) {
		EnumBSSType oldBSSType = bssType;
		bssType = newBSSType == null ? BSS_TYPE_EDEFAULT : newBSSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE, oldBSSType, bssType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEncryptionMethod getEncryptionMethod() {
		return encryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionMethod(EnumEncryptionMethod newEncryptionMethod) {
		EnumEncryptionMethod oldEncryptionMethod = encryptionMethod;
		encryptionMethod = newEncryptionMethod == null ? ENCRYPTION_METHOD_EDEFAULT : newEncryptionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD, oldEncryptionMethod, encryptionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeyIndex() {
		return keyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyIndex(int newKeyIndex) {
		int oldKeyIndex = keyIndex;
		keyIndex = newKeyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX, oldKeyIndex, keyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherAuthenticationMethod() {
		return otherAuthenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherAuthenticationMethod(String newOtherAuthenticationMethod) {
		String oldOtherAuthenticationMethod = otherAuthenticationMethod;
		otherAuthenticationMethod = newOtherAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD, oldOtherAuthenticationMethod, otherAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEncryptionMethod() {
		return otherEncryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEncryptionMethod(String newOtherEncryptionMethod) {
		String oldOtherEncryptionMethod = otherEncryptionMethod;
		otherEncryptionMethod = newOtherEncryptionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD, oldOtherEncryptionMethod, otherEncryptionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPSKPassPhrase() {
		return pskPassPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSKPassPhrase(String newPSKPassPhrase) {
		String oldPSKPassPhrase = pskPassPhrase;
		pskPassPhrase = newPSKPassPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE, oldPSKPassPhrase, pskPassPhrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSID() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSID(String newSSID) {
		String oldSSID = ssid;
		ssid = newSSID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID, oldSSID, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeys() {
		if (keys == null) {
			keys = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPSKValue() {
		if (pskValue == null) {
			pskValue = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE);
		}
		return pskValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				return getAuthenticationMethod();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				return getBSSType();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				return getKeyIndex();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				return getOtherAuthenticationMethod();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				return getOtherEncryptionMethod();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				return getPriority();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				return getPSKPassPhrase();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID:
				return getSSID();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS:
				return getKeys();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				return getPSKValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				setAuthenticationMethod((EnumAuthenticationMethod)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				setBSSType((EnumBSSType)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				setEncryptionMethod((EnumEncryptionMethod)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				setKeyIndex((Integer)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod((String)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod((String)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				setPSKPassPhrase((String)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID:
				setSSID((String)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				getPSKValue().clear();
				getPSKValue().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				setAuthenticationMethod(AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				setBSSType(BSS_TYPE_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				setEncryptionMethod(ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				setKeyIndex(KEY_INDEX_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod(OTHER_AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod(OTHER_ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				setPSKPassPhrase(PSK_PASS_PHRASE_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID:
				setSSID(SSID_EDEFAULT);
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS:
				getKeys().clear();
				return;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				getPSKValue().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				return authenticationMethod != AUTHENTICATION_METHOD_EDEFAULT;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				return bssType != BSS_TYPE_EDEFAULT;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				return encryptionMethod != ENCRYPTION_METHOD_EDEFAULT;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				return keyIndex != KEY_INDEX_EDEFAULT;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				return OTHER_AUTHENTICATION_METHOD_EDEFAULT == null ? otherAuthenticationMethod != null : !OTHER_AUTHENTICATION_METHOD_EDEFAULT.equals(otherAuthenticationMethod);
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				return OTHER_ENCRYPTION_METHOD_EDEFAULT == null ? otherEncryptionMethod != null : !OTHER_ENCRYPTION_METHOD_EDEFAULT.equals(otherEncryptionMethod);
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				return PSK_PASS_PHRASE_EDEFAULT == null ? pskPassPhrase != null : !PSK_PASS_PHRASE_EDEFAULT.equals(pskPassPhrase);
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS:
				return keys != null && !keys.isEmpty();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				return pskValue != null && !pskValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (authenticationMethod: ");
		result.append(authenticationMethod);
		result.append(", BSSType: ");
		result.append(bssType);
		result.append(", encryptionMethod: ");
		result.append(encryptionMethod);
		result.append(", keyIndex: ");
		result.append(keyIndex);
		result.append(", otherAuthenticationMethod: ");
		result.append(otherAuthenticationMethod);
		result.append(", otherEncryptionMethod: ");
		result.append(otherEncryptionMethod);
		result.append(", priority: ");
		result.append(priority);
		result.append(", PSKPassPhrase: ");
		result.append(pskPassPhrase);
		result.append(", SSID: ");
		result.append(ssid);
		result.append(", keys: ");
		result.append(keys);
		result.append(", PSKValue: ");
		result.append(pskValue);
		result.append(')');
		return result.toString();
	}

} //WiFiEndpointSettingsImpl
