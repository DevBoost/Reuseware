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
import es.tid.cim.NATStaticSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAT Static Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NATStaticSettingsImpl#getInsideAddress <em>Inside Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.NATStaticSettingsImpl#getOutsideAddress <em>Outside Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NATStaticSettingsImpl extends NATSettingDataImpl implements NATStaticSettings {
	/**
	 * The default value of the '{@link #getInsideAddress() <em>Inside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String INSIDE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsideAddress() <em>Inside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideAddress()
	 * @generated
	 * @ordered
	 */
	protected String insideAddress = INSIDE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutsideAddress() <em>Outside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTSIDE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutsideAddress() <em>Outside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideAddress()
	 * @generated
	 * @ordered
	 */
	protected String outsideAddress = OUTSIDE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NATStaticSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNATStaticSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsideAddress() {
		return insideAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsideAddress(String newInsideAddress) {
		String oldInsideAddress = insideAddress;
		insideAddress = newInsideAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_STATIC_SETTINGS__INSIDE_ADDRESS, oldInsideAddress, insideAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutsideAddress() {
		return outsideAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideAddress(String newOutsideAddress) {
		String oldOutsideAddress = outsideAddress;
		outsideAddress = newOutsideAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_STATIC_SETTINGS__OUTSIDE_ADDRESS, oldOutsideAddress, outsideAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NAT_STATIC_SETTINGS__INSIDE_ADDRESS:
				return getInsideAddress();
			case CimPackage.NAT_STATIC_SETTINGS__OUTSIDE_ADDRESS:
				return getOutsideAddress();
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
			case CimPackage.NAT_STATIC_SETTINGS__INSIDE_ADDRESS:
				setInsideAddress((String)newValue);
				return;
			case CimPackage.NAT_STATIC_SETTINGS__OUTSIDE_ADDRESS:
				setOutsideAddress((String)newValue);
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
			case CimPackage.NAT_STATIC_SETTINGS__INSIDE_ADDRESS:
				setInsideAddress(INSIDE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.NAT_STATIC_SETTINGS__OUTSIDE_ADDRESS:
				setOutsideAddress(OUTSIDE_ADDRESS_EDEFAULT);
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
			case CimPackage.NAT_STATIC_SETTINGS__INSIDE_ADDRESS:
				return INSIDE_ADDRESS_EDEFAULT == null ? insideAddress != null : !INSIDE_ADDRESS_EDEFAULT.equals(insideAddress);
			case CimPackage.NAT_STATIC_SETTINGS__OUTSIDE_ADDRESS:
				return OUTSIDE_ADDRESS_EDEFAULT == null ? outsideAddress != null : !OUTSIDE_ADDRESS_EDEFAULT.equals(outsideAddress);
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
		result.append(" (insideAddress: ");
		result.append(insideAddress);
		result.append(", outsideAddress: ");
		result.append(outsideAddress);
		result.append(')');
		return result.toString();
	}

} //NATStaticSettingsImpl
