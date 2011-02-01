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
import es.tid.cim.WirelessPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wireless Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.WirelessPortImpl#getSignalStrength <em>Signal Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WirelessPortImpl extends NetworkPortImpl implements WirelessPort {
	/**
	 * The default value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNAL_STRENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected int signalStrength = SIGNAL_STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WirelessPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getWirelessPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignalStrength() {
		return signalStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalStrength(int newSignalStrength) {
		int oldSignalStrength = signalStrength;
		signalStrength = newSignalStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.WIRELESS_PORT__SIGNAL_STRENGTH, oldSignalStrength, signalStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.WIRELESS_PORT__SIGNAL_STRENGTH:
				return getSignalStrength();
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
			case CimPackage.WIRELESS_PORT__SIGNAL_STRENGTH:
				setSignalStrength((Integer)newValue);
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
			case CimPackage.WIRELESS_PORT__SIGNAL_STRENGTH:
				setSignalStrength(SIGNAL_STRENGTH_EDEFAULT);
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
			case CimPackage.WIRELESS_PORT__SIGNAL_STRENGTH:
				return signalStrength != SIGNAL_STRENGTH_EDEFAULT;
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
		result.append(" (signalStrength: ");
		result.append(signalStrength);
		result.append(')');
		return result.toString();
	}

} //WirelessPortImpl
