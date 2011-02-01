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
import es.tid.cim.EnumAddressExamined;
import es.tid.cim.NATSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAT Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NATSettingDataImpl#getAddressExamined <em>Address Examined</em>}</li>
 *   <li>{@link es.tid.cim.impl.NATSettingDataImpl#isIsInside <em>Is Inside</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NATSettingDataImpl extends ScopedSettingDataImpl implements NATSettingData {
	/**
	 * The default value of the '{@link #getAddressExamined() <em>Address Examined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressExamined()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAddressExamined ADDRESS_EXAMINED_EDEFAULT = EnumAddressExamined.SOURCE;

	/**
	 * The cached value of the '{@link #getAddressExamined() <em>Address Examined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressExamined()
	 * @generated
	 * @ordered
	 */
	protected EnumAddressExamined addressExamined = ADDRESS_EXAMINED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInside() <em>Is Inside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInside()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INSIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInside() <em>Is Inside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInside()
	 * @generated
	 * @ordered
	 */
	protected boolean isInside = IS_INSIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NATSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNATSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressExamined getAddressExamined() {
		return addressExamined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressExamined(EnumAddressExamined newAddressExamined) {
		EnumAddressExamined oldAddressExamined = addressExamined;
		addressExamined = newAddressExamined == null ? ADDRESS_EXAMINED_EDEFAULT : newAddressExamined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_SETTING_DATA__ADDRESS_EXAMINED, oldAddressExamined, addressExamined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInside() {
		return isInside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInside(boolean newIsInside) {
		boolean oldIsInside = isInside;
		isInside = newIsInside;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_SETTING_DATA__IS_INSIDE, oldIsInside, isInside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NAT_SETTING_DATA__ADDRESS_EXAMINED:
				return getAddressExamined();
			case CimPackage.NAT_SETTING_DATA__IS_INSIDE:
				return isIsInside();
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
			case CimPackage.NAT_SETTING_DATA__ADDRESS_EXAMINED:
				setAddressExamined((EnumAddressExamined)newValue);
				return;
			case CimPackage.NAT_SETTING_DATA__IS_INSIDE:
				setIsInside((Boolean)newValue);
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
			case CimPackage.NAT_SETTING_DATA__ADDRESS_EXAMINED:
				setAddressExamined(ADDRESS_EXAMINED_EDEFAULT);
				return;
			case CimPackage.NAT_SETTING_DATA__IS_INSIDE:
				setIsInside(IS_INSIDE_EDEFAULT);
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
			case CimPackage.NAT_SETTING_DATA__ADDRESS_EXAMINED:
				return addressExamined != ADDRESS_EXAMINED_EDEFAULT;
			case CimPackage.NAT_SETTING_DATA__IS_INSIDE:
				return isInside != IS_INSIDE_EDEFAULT;
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
		result.append(" (addressExamined: ");
		result.append(addressExamined);
		result.append(", isInside: ");
		result.append(isInside);
		result.append(')');
		return result.toString();
	}

} //NATSettingDataImpl
