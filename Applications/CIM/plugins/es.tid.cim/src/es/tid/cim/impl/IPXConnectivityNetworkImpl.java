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
import es.tid.cim.IPXConnectivityNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPX Connectivity Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPXConnectivityNetworkImpl#getNetworkNumber <em>Network Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPXConnectivityNetworkImpl extends ConnectivityCollectionImpl implements IPXConnectivityNetwork {
	/**
	 * The default value of the '{@link #getNetworkNumber() <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkNumber() <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkNumber()
	 * @generated
	 * @ordered
	 */
	protected String networkNumber = NETWORK_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPXConnectivityNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPXConnectivityNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkNumber() {
		return networkNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkNumber(String newNetworkNumber) {
		String oldNetworkNumber = networkNumber;
		networkNumber = newNetworkNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER, oldNetworkNumber, networkNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				return getNetworkNumber();
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
			case CimPackage.IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				setNetworkNumber((String)newValue);
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
			case CimPackage.IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				setNetworkNumber(NETWORK_NUMBER_EDEFAULT);
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
			case CimPackage.IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				return NETWORK_NUMBER_EDEFAULT == null ? networkNumber != null : !NETWORK_NUMBER_EDEFAULT.equals(networkNumber);
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
		result.append(" (networkNumber: ");
		result.append(networkNumber);
		result.append(')');
		return result.toString();
	}

} //IPXConnectivityNetworkImpl
