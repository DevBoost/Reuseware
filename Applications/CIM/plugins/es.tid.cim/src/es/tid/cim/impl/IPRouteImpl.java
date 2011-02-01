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
import es.tid.cim.IPRoute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPRouteImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPRouteImpl#getIPDestinationAddress <em>IP Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPRouteImpl#getIPDestinationMask <em>IP Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPRouteImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IPRouteImpl extends NextHopRoutingImpl implements IPRoute {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPDestinationAddress() <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPDestinationAddress() <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipDestinationAddress = IP_DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPDestinationMask() <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_DESTINATION_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPDestinationMask() <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected String ipDestinationMask = IP_DESTINATION_MASK_EDEFAULT;

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
	protected IPRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ROUTE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPDestinationAddress() {
		return ipDestinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPDestinationAddress(String newIPDestinationAddress) {
		String oldIPDestinationAddress = ipDestinationAddress;
		ipDestinationAddress = newIPDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ROUTE__IP_DESTINATION_ADDRESS, oldIPDestinationAddress, ipDestinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPDestinationMask() {
		return ipDestinationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPDestinationMask(String newIPDestinationMask) {
		String oldIPDestinationMask = ipDestinationMask;
		ipDestinationMask = newIPDestinationMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ROUTE__IP_DESTINATION_MASK, oldIPDestinationMask, ipDestinationMask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_ROUTE__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_ROUTE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.IP_ROUTE__IP_DESTINATION_ADDRESS:
				return getIPDestinationAddress();
			case CimPackage.IP_ROUTE__IP_DESTINATION_MASK:
				return getIPDestinationMask();
			case CimPackage.IP_ROUTE__ADDRESS_TYPE:
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
			case CimPackage.IP_ROUTE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.IP_ROUTE__IP_DESTINATION_ADDRESS:
				setIPDestinationAddress((String)newValue);
				return;
			case CimPackage.IP_ROUTE__IP_DESTINATION_MASK:
				setIPDestinationMask((String)newValue);
				return;
			case CimPackage.IP_ROUTE__ADDRESS_TYPE:
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
			case CimPackage.IP_ROUTE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.IP_ROUTE__IP_DESTINATION_ADDRESS:
				setIPDestinationAddress(IP_DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_ROUTE__IP_DESTINATION_MASK:
				setIPDestinationMask(IP_DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.IP_ROUTE__ADDRESS_TYPE:
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
			case CimPackage.IP_ROUTE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.IP_ROUTE__IP_DESTINATION_ADDRESS:
				return IP_DESTINATION_ADDRESS_EDEFAULT == null ? ipDestinationAddress != null : !IP_DESTINATION_ADDRESS_EDEFAULT.equals(ipDestinationAddress);
			case CimPackage.IP_ROUTE__IP_DESTINATION_MASK:
				return IP_DESTINATION_MASK_EDEFAULT == null ? ipDestinationMask != null : !IP_DESTINATION_MASK_EDEFAULT.equals(ipDestinationMask);
			case CimPackage.IP_ROUTE__ADDRESS_TYPE:
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
		result.append(" (creationClassName: ");
		result.append(creationClassName);
		result.append(", IPDestinationAddress: ");
		result.append(ipDestinationAddress);
		result.append(", IPDestinationMask: ");
		result.append(ipDestinationMask);
		result.append(", addressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //IPRouteImpl
