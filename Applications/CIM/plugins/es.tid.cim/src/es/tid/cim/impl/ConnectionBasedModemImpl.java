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
import es.tid.cim.ConnectionBasedModem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Based Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ConnectionBasedModemImpl#getVendorId <em>Vendor Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectionBasedModemImpl extends ModemImpl implements ConnectionBasedModem {
	/**
	 * The default value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected String vendorId = VENDOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionBasedModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getConnectionBasedModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendorId() {
		return vendorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorId(String newVendorId) {
		String oldVendorId = vendorId;
		vendorId = newVendorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CONNECTION_BASED_MODEM__VENDOR_ID, oldVendorId, vendorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CONNECTION_BASED_MODEM__VENDOR_ID:
				return getVendorId();
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
			case CimPackage.CONNECTION_BASED_MODEM__VENDOR_ID:
				setVendorId((String)newValue);
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
			case CimPackage.CONNECTION_BASED_MODEM__VENDOR_ID:
				setVendorId(VENDOR_ID_EDEFAULT);
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
			case CimPackage.CONNECTION_BASED_MODEM__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorId != null : !VENDOR_ID_EDEFAULT.equals(vendorId);
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
		result.append(" (vendorId: ");
		result.append(vendorId);
		result.append(')');
		return result.toString();
	}

} //ConnectionBasedModemImpl
