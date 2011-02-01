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
import es.tid.cim.LANEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getMACAddress <em>MAC Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getAliasAddress <em>Alias Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getGroupAddresses <em>Group Addresses</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANEndpointImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LANEndpointImpl extends ProtocolEndpointImpl implements LANEndpoint {
	/**
	 * The default value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected String lanid = LANID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected String lanType = LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected String otherLANType = OTHER_LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasAddress() <em>Alias Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasAddress() <em>Alias Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasAddress()
	 * @generated
	 * @ordered
	 */
	protected String aliasAddress = ALIAS_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupAddresses() <em>Group Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddresses()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ADDRESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupAddresses() <em>Group Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddresses()
	 * @generated
	 * @ordered
	 */
	protected String groupAddresses = GROUP_ADDRESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DATA_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected int maxDataSize = MAX_DATA_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LANEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLANEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLANID() {
		return lanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLANID(String newLANID) {
		String oldLANID = lanid;
		lanid = newLANID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLANType() {
		return lanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLANType(String newLANType) {
		String oldLANType = lanType;
		lanType = newLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__LAN_TYPE, oldLANType, lanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherLANType() {
		return otherLANType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherLANType(String newOtherLANType) {
		String oldOtherLANType = otherLANType;
		otherLANType = newOtherLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__OTHER_LAN_TYPE, oldOtherLANType, otherLANType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMACAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMACAddress(String newMACAddress) {
		String oldMACAddress = macAddress;
		macAddress = newMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__MAC_ADDRESS, oldMACAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasAddress() {
		return aliasAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasAddress(String newAliasAddress) {
		String oldAliasAddress = aliasAddress;
		aliasAddress = newAliasAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__ALIAS_ADDRESS, oldAliasAddress, aliasAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupAddresses() {
		return groupAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupAddresses(String newGroupAddresses) {
		String oldGroupAddresses = groupAddresses;
		groupAddresses = newGroupAddresses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__GROUP_ADDRESSES, oldGroupAddresses, groupAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxDataSize() {
		return maxDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDataSize(int newMaxDataSize) {
		int oldMaxDataSize = maxDataSize;
		maxDataSize = newMaxDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_ENDPOINT__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.LAN_ENDPOINT__LANID:
				return getLANID();
			case CimPackage.LAN_ENDPOINT__LAN_TYPE:
				return getLANType();
			case CimPackage.LAN_ENDPOINT__OTHER_LAN_TYPE:
				return getOtherLANType();
			case CimPackage.LAN_ENDPOINT__MAC_ADDRESS:
				return getMACAddress();
			case CimPackage.LAN_ENDPOINT__ALIAS_ADDRESS:
				return getAliasAddress();
			case CimPackage.LAN_ENDPOINT__GROUP_ADDRESSES:
				return getGroupAddresses();
			case CimPackage.LAN_ENDPOINT__MAX_DATA_SIZE:
				return getMaxDataSize();
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
			case CimPackage.LAN_ENDPOINT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__LAN_TYPE:
				setLANType((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__OTHER_LAN_TYPE:
				setOtherLANType((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__MAC_ADDRESS:
				setMACAddress((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__ALIAS_ADDRESS:
				setAliasAddress((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__GROUP_ADDRESSES:
				setGroupAddresses((String)newValue);
				return;
			case CimPackage.LAN_ENDPOINT__MAX_DATA_SIZE:
				setMaxDataSize((Integer)newValue);
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
			case CimPackage.LAN_ENDPOINT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__LAN_TYPE:
				setLANType(LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__OTHER_LAN_TYPE:
				setOtherLANType(OTHER_LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__MAC_ADDRESS:
				setMACAddress(MAC_ADDRESS_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__ALIAS_ADDRESS:
				setAliasAddress(ALIAS_ADDRESS_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__GROUP_ADDRESSES:
				setGroupAddresses(GROUP_ADDRESSES_EDEFAULT);
				return;
			case CimPackage.LAN_ENDPOINT__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
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
			case CimPackage.LAN_ENDPOINT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.LAN_ENDPOINT__LAN_TYPE:
				return LAN_TYPE_EDEFAULT == null ? lanType != null : !LAN_TYPE_EDEFAULT.equals(lanType);
			case CimPackage.LAN_ENDPOINT__OTHER_LAN_TYPE:
				return OTHER_LAN_TYPE_EDEFAULT == null ? otherLANType != null : !OTHER_LAN_TYPE_EDEFAULT.equals(otherLANType);
			case CimPackage.LAN_ENDPOINT__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
			case CimPackage.LAN_ENDPOINT__ALIAS_ADDRESS:
				return ALIAS_ADDRESS_EDEFAULT == null ? aliasAddress != null : !ALIAS_ADDRESS_EDEFAULT.equals(aliasAddress);
			case CimPackage.LAN_ENDPOINT__GROUP_ADDRESSES:
				return GROUP_ADDRESSES_EDEFAULT == null ? groupAddresses != null : !GROUP_ADDRESSES_EDEFAULT.equals(groupAddresses);
			case CimPackage.LAN_ENDPOINT__MAX_DATA_SIZE:
				return maxDataSize != MAX_DATA_SIZE_EDEFAULT;
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
		result.append(" (LANID: ");
		result.append(lanid);
		result.append(", LANType: ");
		result.append(lanType);
		result.append(", otherLANType: ");
		result.append(otherLANType);
		result.append(", MACAddress: ");
		result.append(macAddress);
		result.append(", aliasAddress: ");
		result.append(aliasAddress);
		result.append(", groupAddresses: ");
		result.append(groupAddresses);
		result.append(", maxDataSize: ");
		result.append(maxDataSize);
		result.append(')');
		return result.toString();
	}

} //LANEndpointImpl
