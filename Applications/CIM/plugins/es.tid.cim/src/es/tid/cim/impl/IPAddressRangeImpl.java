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
import es.tid.cim.IPAddressRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Address Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPAddressRangeImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPAddressRangeImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPAddressRangeImpl#getTypeOfAddress <em>Type Of Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPAddressRangeImpl#getAllocationRange <em>Allocation Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPAddressRangeImpl extends CollectionOfMSEsImpl implements IPAddressRange {
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
	 * The default value of the '{@link #getTypeOfAddress() <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OF_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfAddress() <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAddress()
	 * @generated
	 * @ordered
	 */
	protected String typeOfAddress = TYPE_OF_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocationRange() <em>Allocation Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationRange()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOCATION_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationRange() <em>Allocation Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationRange()
	 * @generated
	 * @ordered
	 */
	protected String allocationRange = ALLOCATION_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAddressRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPAddressRange();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ADDRESS_RANGE__START_ADDRESS, oldStartAddress, startAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ADDRESS_RANGE__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOfAddress() {
		return typeOfAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfAddress(String newTypeOfAddress) {
		String oldTypeOfAddress = typeOfAddress;
		typeOfAddress = newTypeOfAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ADDRESS_RANGE__TYPE_OF_ADDRESS, oldTypeOfAddress, typeOfAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllocationRange() {
		return allocationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationRange(String newAllocationRange) {
		String oldAllocationRange = allocationRange;
		allocationRange = newAllocationRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ADDRESS_RANGE__ALLOCATION_RANGE, oldAllocationRange, allocationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_ADDRESS_RANGE__START_ADDRESS:
				return getStartAddress();
			case CimPackage.IP_ADDRESS_RANGE__END_ADDRESS:
				return getEndAddress();
			case CimPackage.IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				return getTypeOfAddress();
			case CimPackage.IP_ADDRESS_RANGE__ALLOCATION_RANGE:
				return getAllocationRange();
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
			case CimPackage.IP_ADDRESS_RANGE__START_ADDRESS:
				setStartAddress((String)newValue);
				return;
			case CimPackage.IP_ADDRESS_RANGE__END_ADDRESS:
				setEndAddress((String)newValue);
				return;
			case CimPackage.IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				setTypeOfAddress((String)newValue);
				return;
			case CimPackage.IP_ADDRESS_RANGE__ALLOCATION_RANGE:
				setAllocationRange((String)newValue);
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
			case CimPackage.IP_ADDRESS_RANGE__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_ADDRESS_RANGE__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				setTypeOfAddress(TYPE_OF_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_ADDRESS_RANGE__ALLOCATION_RANGE:
				setAllocationRange(ALLOCATION_RANGE_EDEFAULT);
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
			case CimPackage.IP_ADDRESS_RANGE__START_ADDRESS:
				return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
			case CimPackage.IP_ADDRESS_RANGE__END_ADDRESS:
				return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
			case CimPackage.IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				return TYPE_OF_ADDRESS_EDEFAULT == null ? typeOfAddress != null : !TYPE_OF_ADDRESS_EDEFAULT.equals(typeOfAddress);
			case CimPackage.IP_ADDRESS_RANGE__ALLOCATION_RANGE:
				return ALLOCATION_RANGE_EDEFAULT == null ? allocationRange != null : !ALLOCATION_RANGE_EDEFAULT.equals(allocationRange);
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
		result.append(", typeOfAddress: ");
		result.append(typeOfAddress);
		result.append(", allocationRange: ");
		result.append(allocationRange);
		result.append(')');
		return result.toString();
	}

} //IPAddressRangeImpl
