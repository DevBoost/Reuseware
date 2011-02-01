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
import es.tid.cim.IPProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPProtocolEndpointImpl#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPProtocolEndpointImpl#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPProtocolEndpointImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPProtocolEndpointImpl#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPProtocolEndpointImpl#getPrefixLength <em>Prefix Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPProtocolEndpointImpl extends ProtocolEndpointImpl implements IPProtocolEndpoint {
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
	 * The default value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_ADDRESS_EDEFAULT = "0.0.0.0";

	/**
	 * The cached value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv4Address = IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = "0.0.0.0";

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
	 * The default value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV6_ADDRESS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv6Address = IPV6_ADDRESS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPProtocolEndpoint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN, oldAddressOrigin, addressOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPv4Address() {
		return iPv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPv4Address(String newIPv4Address) {
		String oldIPv4Address = iPv4Address;
		iPv4Address = newIPv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS, oldIPv4Address, iPv4Address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_PROTOCOL_ENDPOINT__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPv6Address() {
		return iPv6Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPv6Address(String newIPv6Address) {
		String oldIPv6Address = iPv6Address;
		iPv6Address = newIPv6Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS, oldIPv6Address, iPv6Address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH, oldPrefixLength, prefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				return getAddressOrigin();
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				return getIPv4Address();
			case CimPackage.IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				return getSubnetMask();
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				return getIPv6Address();
			case CimPackage.IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				return getPrefixLength();
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
			case CimPackage.IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				setAddressOrigin((EnumAddressOrigin)newValue);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				setIPv4Address((String)newValue);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				setIPv6Address((String)newValue);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				setPrefixLength((Integer)newValue);
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
			case CimPackage.IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				setAddressOrigin(ADDRESS_ORIGIN_EDEFAULT);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				setIPv4Address(IPV4_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				setIPv6Address(IPV6_ADDRESS_EDEFAULT);
				return;
			case CimPackage.IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				setPrefixLength(PREFIX_LENGTH_EDEFAULT);
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
			case CimPackage.IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				return addressOrigin != ADDRESS_ORIGIN_EDEFAULT;
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				return IPV4_ADDRESS_EDEFAULT == null ? iPv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(iPv4Address);
			case CimPackage.IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case CimPackage.IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				return IPV6_ADDRESS_EDEFAULT == null ? iPv6Address != null : !IPV6_ADDRESS_EDEFAULT.equals(iPv6Address);
			case CimPackage.IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				return prefixLength != PREFIX_LENGTH_EDEFAULT;
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
		result.append(", IPv4Address: ");
		result.append(iPv4Address);
		result.append(", subnetMask: ");
		result.append(subnetMask);
		result.append(", IPv6Address: ");
		result.append(iPv6Address);
		result.append(", prefixLength: ");
		result.append(prefixLength);
		result.append(')');
		return result.toString();
	}

} //IPProtocolEndpointImpl
