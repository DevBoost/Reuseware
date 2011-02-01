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
import es.tid.cim.PowerManagementCapabilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.PowerManagementCapabilitiesImpl#getPowerCapabilities <em>Power Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerManagementCapabilitiesImpl extends CapabilitiesImpl implements PowerManagementCapabilities {
	/**
	 * The default value of the '{@link #getPowerCapabilities() <em>Power Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerCapabilities() <em>Power Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String powerCapabilities = POWER_CAPABILITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getPowerManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerCapabilities() {
		return powerCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerCapabilities(String newPowerCapabilities) {
		String oldPowerCapabilities = powerCapabilities;
		powerCapabilities = newPowerCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES, oldPowerCapabilities, powerCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				return getPowerCapabilities();
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
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				setPowerCapabilities((String)newValue);
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
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				setPowerCapabilities(POWER_CAPABILITIES_EDEFAULT);
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
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				return POWER_CAPABILITIES_EDEFAULT == null ? powerCapabilities != null : !POWER_CAPABILITIES_EDEFAULT.equals(powerCapabilities);
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
		result.append(" (powerCapabilities: ");
		result.append(powerCapabilities);
		result.append(')');
		return result.toString();
	}

} //PowerManagementCapabilitiesImpl
