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
import es.tid.cim.EnumAddressType;
import es.tid.cim.IPConnectivitySubnet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Connectivity Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPConnectivitySubnetImpl#getSubnetNumber <em>Subnet Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPConnectivitySubnetImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPConnectivitySubnetImpl#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPConnectivitySubnetImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPConnectivitySubnetImpl extends ConnectivityCollectionImpl implements IPConnectivitySubnet {
	/**
	 * The default value of the '{@link #getSubnetNumber() <em>Subnet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetNumber() <em>Subnet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetNumber()
	 * @generated
	 * @ordered
	 */
	protected String subnetNumber = SUBNET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected String subnetMask = SUBNET_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final int PREFIX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected int prefixLength = PREFIX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAddressType ADDRESS_TYPE_EDEFAULT = EnumAddressType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected EnumAddressType addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPConnectivitySubnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPConnectivitySubnet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetNumber() {
		return subnetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetNumber(String newSubnetNumber) {
		String oldSubnetNumber = subnetNumber;
		subnetNumber = newSubnetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_NUMBER, oldSubnetNumber, subnetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetMask(String newSubnetMask) {
		String oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrefixLength() {
		return prefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixLength(int newPrefixLength) {
		int oldPrefixLength = prefixLength;
		prefixLength = newPrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_CONNECTIVITY_SUBNET__PREFIX_LENGTH, oldPrefixLength, prefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressType getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressType(EnumAddressType newAddressType) {
		EnumAddressType oldAddressType = addressType;
		addressType = newAddressType == null ? ADDRESS_TYPE_EDEFAULT : newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_CONNECTIVITY_SUBNET__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_NUMBER:
				return getSubnetNumber();
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_MASK:
				return getSubnetMask();
			case CimPackage.IP_CONNECTIVITY_SUBNET__PREFIX_LENGTH:
				return getPrefixLength();
			case CimPackage.IP_CONNECTIVITY_SUBNET__ADDRESS_TYPE:
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
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_NUMBER:
				setSubnetNumber((String)newValue);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__PREFIX_LENGTH:
				setPrefixLength((Integer)newValue);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__ADDRESS_TYPE:
				setAddressType((EnumAddressType)newValue);
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
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_NUMBER:
				setSubnetNumber(SUBNET_NUMBER_EDEFAULT);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__PREFIX_LENGTH:
				setPrefixLength(PREFIX_LENGTH_EDEFAULT);
				return;
			case CimPackage.IP_CONNECTIVITY_SUBNET__ADDRESS_TYPE:
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
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_NUMBER:
				return SUBNET_NUMBER_EDEFAULT == null ? subnetNumber != null : !SUBNET_NUMBER_EDEFAULT.equals(subnetNumber);
			case CimPackage.IP_CONNECTIVITY_SUBNET__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case CimPackage.IP_CONNECTIVITY_SUBNET__PREFIX_LENGTH:
				return prefixLength != PREFIX_LENGTH_EDEFAULT;
			case CimPackage.IP_CONNECTIVITY_SUBNET__ADDRESS_TYPE:
				return addressType != ADDRESS_TYPE_EDEFAULT;
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
		result.append(" (subnetNumber: ");
		result.append(subnetNumber);
		result.append(", subnetMask: ");
		result.append(subnetMask);
		result.append(", prefixLength: ");
		result.append(prefixLength);
		result.append(", addressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //IPConnectivitySubnetImpl
