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
import es.tid.cim.RangeOfIPAddresses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Of IP Addresses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.RangeOfIPAddressesImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.RangeOfIPAddressesImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.RangeOfIPAddressesImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeOfIPAddressesImpl extends SystemSpecificCollectionImpl implements RangeOfIPAddresses {
	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected String startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected String endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected String addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeOfIPAddressesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getRangeOfIPAddresses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(String newStartAddress) {
		String oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.RANGE_OF_IP_ADDRESSES__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(String newEndAddress) {
		String oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.RANGE_OF_IP_ADDRESSES__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressType(String newAddressType) {
		String oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				return getStartAddress();
			case CimPackage.RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				return getEndAddress();
			case CimPackage.RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				return getAddressType();
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
			case CimPackage.RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				setStartAddress((String)newValue);
				return;
			case CimPackage.RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				setEndAddress((String)newValue);
				return;
			case CimPackage.RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				setAddressType((String)newValue);
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
			case CimPackage.RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case CimPackage.RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case CimPackage.RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
			case CimPackage.RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
			case CimPackage.RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
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
		result.append(" (startAddress: ");
		result.append(startAddress);
		result.append(", endAddress: ");
		result.append(endAddress);
		result.append(", addressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //RangeOfIPAddressesImpl
