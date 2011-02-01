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
import es.tid.cim.EnumAddressOrigin;
import es.tid.cim.IPAssignmentSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPAssignmentSettingDataImpl#getAddressOrigin <em>Address Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPAssignmentSettingDataImpl extends SettingDataImpl implements IPAssignmentSettingData {
	/**
	 * The default value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAddressOrigin ADDRESS_ORIGIN_EDEFAULT = EnumAddressOrigin.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected EnumAddressOrigin addressOrigin = ADDRESS_ORIGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAssignmentSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPAssignmentSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressOrigin getAddressOrigin() {
		return addressOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressOrigin(EnumAddressOrigin newAddressOrigin) {
		EnumAddressOrigin oldAddressOrigin = addressOrigin;
		addressOrigin = newAddressOrigin == null ? ADDRESS_ORIGIN_EDEFAULT : newAddressOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN, oldAddressOrigin, addressOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				return getAddressOrigin();
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
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				setAddressOrigin((EnumAddressOrigin)newValue);
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
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				setAddressOrigin(ADDRESS_ORIGIN_EDEFAULT);
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
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				return addressOrigin != ADDRESS_ORIGIN_EDEFAULT;
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
		result.append(" (addressOrigin: ");
		result.append(addressOrigin);
		result.append(')');
		return result.toString();
	}

} //IPAssignmentSettingDataImpl
