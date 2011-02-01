/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.WirelessLANEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wireless LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.WirelessLANEndpointImpl#getSSID <em>SSID</em>}</li>
 *   <li>{@link es.tid.cim.impl.WirelessLANEndpointImpl#isWEPEnabled <em>WEP Enabled</em>}</li>
 *   <li>{@link es.tid.cim.impl.WirelessLANEndpointImpl#isWEPKeyMixEnabled <em>WEP Key Mix Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WirelessLANEndpointImpl extends ProtocolEndpointImpl implements WirelessLANEndpoint {
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
	 * The default value of the '{@link #isWEPEnabled() <em>WEP Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWEPEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEP_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWEPEnabled() <em>WEP Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWEPEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean wepEnabled = WEP_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isWEPKeyMixEnabled() <em>WEP Key Mix Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWEPKeyMixEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEP_KEY_MIX_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWEPKeyMixEnabled() <em>WEP Key Mix Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWEPKeyMixEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean wepKeyMixEnabled = WEP_KEY_MIX_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WirelessLANEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getWirelessLANEndpoint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WIRELESS_LAN_ENDPOINT__SSID, oldSSID, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWEPEnabled() {
		return wepEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWEPEnabled(boolean newWEPEnabled) {
		boolean oldWEPEnabled = wepEnabled;
		wepEnabled = newWEPEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WIRELESS_LAN_ENDPOINT__WEP_ENABLED, oldWEPEnabled, wepEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWEPKeyMixEnabled() {
		return wepKeyMixEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWEPKeyMixEnabled(boolean newWEPKeyMixEnabled) {
		boolean oldWEPKeyMixEnabled = wepKeyMixEnabled;
		wepKeyMixEnabled = newWEPKeyMixEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WIRELESS_LAN_ENDPOINT__WEP_KEY_MIX_ENABLED, oldWEPKeyMixEnabled, wepKeyMixEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.WIRELESS_LAN_ENDPOINT__SSID:
				return getSSID();
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_ENABLED:
				return isWEPEnabled();
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_KEY_MIX_ENABLED:
				return isWEPKeyMixEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.WIRELESS_LAN_ENDPOINT__SSID:
				setSSID((String)newValue);
				return;
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_ENABLED:
				setWEPEnabled((Boolean)newValue);
				return;
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_KEY_MIX_ENABLED:
				setWEPKeyMixEnabled((Boolean)newValue);
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
			case CimPackage.WIRELESS_LAN_ENDPOINT__SSID:
				setSSID(SSID_EDEFAULT);
				return;
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_ENABLED:
				setWEPEnabled(WEP_ENABLED_EDEFAULT);
				return;
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_KEY_MIX_ENABLED:
				setWEPKeyMixEnabled(WEP_KEY_MIX_ENABLED_EDEFAULT);
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
			case CimPackage.WIRELESS_LAN_ENDPOINT__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_ENABLED:
				return wepEnabled != WEP_ENABLED_EDEFAULT;
			case CimPackage.WIRELESS_LAN_ENDPOINT__WEP_KEY_MIX_ENABLED:
				return wepKeyMixEnabled != WEP_KEY_MIX_ENABLED_EDEFAULT;
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
		result.append(" (SSID: ");
		result.append(ssid);
		result.append(", WEPEnabled: ");
		result.append(wepEnabled);
		result.append(", WEPKeyMixEnabled: ");
		result.append(wepKeyMixEnabled);
		result.append(')');
		return result.toString();
	}

} //WirelessLANEndpointImpl
