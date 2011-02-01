/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumLinkTechnology;
import es.tid.cim.NetworkPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getLinkTechnology <em>Link Technology</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getOtherLinktechnology <em>Other Linktechnology</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#isFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#isAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkPortImpl#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkPortImpl extends LogicalPortImpl implements NetworkPort {
	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLinkTechnology LINK_TECHNOLOGY_EDEFAULT = EnumLinkTechnology.UNKNOWN;

	/**
	 * The cached value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected EnumLinkTechnology linkTechnology = LINK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLinktechnology() <em>Other Linktechnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLinktechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LINKTECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLinktechnology() <em>Other Linktechnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLinktechnology()
	 * @generated
	 * @ordered
	 */
	protected String otherLinktechnology = OTHER_LINKTECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkAddresses() <em>Network Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networkAddresses;

	/**
	 * The default value of the '{@link #isFullDuplex() <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullDuplex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULL_DUPLEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFullDuplex() <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullDuplex()
	 * @generated
	 * @ordered
	 */
	protected boolean fullDuplex = FULL_DUPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoSense() <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_SENSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoSense() <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSense()
	 * @generated
	 * @ordered
	 */
	protected boolean autoSense = AUTO_SENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportedMaximumTransmissionUnit() <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSupportedMaximumTransmissionUnit() <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected int supportedMaximumTransmissionUnit = SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermanentAddress() <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanentAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMANENT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermanentAddress() <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanentAddress()
	 * @generated
	 * @ordered
	 */
	protected String permanentAddress = PERMANENT_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveMaximumTransmissionUnit() <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActiveMaximumTransmissionUnit() <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected int activeMaximumTransmissionUnit = ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNetworkPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLinkTechnology getLinkTechnology() {
		return linkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkTechnology(EnumLinkTechnology newLinkTechnology) {
		EnumLinkTechnology oldLinkTechnology = linkTechnology;
		linkTechnology = newLinkTechnology == null ? LINK_TECHNOLOGY_EDEFAULT : newLinkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__LINK_TECHNOLOGY, oldLinkTechnology, linkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherLinktechnology() {
		return otherLinktechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherLinktechnology(String newOtherLinktechnology) {
		String oldOtherLinktechnology = otherLinktechnology;
		otherLinktechnology = newOtherLinktechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY, oldOtherLinktechnology, otherLinktechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNetworkAddresses() {
		if (networkAddresses == null) {
			networkAddresses = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.NETWORK_PORT__NETWORK_ADDRESSES);
		}
		return networkAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFullDuplex() {
		return fullDuplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullDuplex(boolean newFullDuplex) {
		boolean oldFullDuplex = fullDuplex;
		fullDuplex = newFullDuplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__FULL_DUPLEX, oldFullDuplex, fullDuplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoSense() {
		return autoSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoSense(boolean newAutoSense) {
		boolean oldAutoSense = autoSense;
		autoSense = newAutoSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__AUTO_SENSE, oldAutoSense, autoSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupportedMaximumTransmissionUnit() {
		return supportedMaximumTransmissionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedMaximumTransmissionUnit(int newSupportedMaximumTransmissionUnit) {
		int oldSupportedMaximumTransmissionUnit = supportedMaximumTransmissionUnit;
		supportedMaximumTransmissionUnit = newSupportedMaximumTransmissionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT, oldSupportedMaximumTransmissionUnit, supportedMaximumTransmissionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermanentAddress() {
		return permanentAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermanentAddress(String newPermanentAddress) {
		String oldPermanentAddress = permanentAddress;
		permanentAddress = newPermanentAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__PERMANENT_ADDRESS, oldPermanentAddress, permanentAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActiveMaximumTransmissionUnit() {
		return activeMaximumTransmissionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveMaximumTransmissionUnit(int newActiveMaximumTransmissionUnit) {
		int oldActiveMaximumTransmissionUnit = activeMaximumTransmissionUnit;
		activeMaximumTransmissionUnit = newActiveMaximumTransmissionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT, oldActiveMaximumTransmissionUnit, activeMaximumTransmissionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NETWORK_PORT__PORT_NUMBER:
				return getPortNumber();
			case CimPackage.NETWORK_PORT__LINK_TECHNOLOGY:
				return getLinkTechnology();
			case CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY:
				return getOtherLinktechnology();
			case CimPackage.NETWORK_PORT__NETWORK_ADDRESSES:
				return getNetworkAddresses();
			case CimPackage.NETWORK_PORT__FULL_DUPLEX:
				return isFullDuplex();
			case CimPackage.NETWORK_PORT__AUTO_SENSE:
				return isAutoSense();
			case CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				return getSupportedMaximumTransmissionUnit();
			case CimPackage.NETWORK_PORT__PERMANENT_ADDRESS:
				return getPermanentAddress();
			case CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				return getActiveMaximumTransmissionUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.NETWORK_PORT__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case CimPackage.NETWORK_PORT__LINK_TECHNOLOGY:
				setLinkTechnology((EnumLinkTechnology)newValue);
				return;
			case CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY:
				setOtherLinktechnology((String)newValue);
				return;
			case CimPackage.NETWORK_PORT__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				getNetworkAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.NETWORK_PORT__FULL_DUPLEX:
				setFullDuplex((Boolean)newValue);
				return;
			case CimPackage.NETWORK_PORT__AUTO_SENSE:
				setAutoSense((Boolean)newValue);
				return;
			case CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				setSupportedMaximumTransmissionUnit((Integer)newValue);
				return;
			case CimPackage.NETWORK_PORT__PERMANENT_ADDRESS:
				setPermanentAddress((String)newValue);
				return;
			case CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				setActiveMaximumTransmissionUnit((Integer)newValue);
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
			case CimPackage.NETWORK_PORT__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__LINK_TECHNOLOGY:
				setLinkTechnology(LINK_TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY:
				setOtherLinktechnology(OTHER_LINKTECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				return;
			case CimPackage.NETWORK_PORT__FULL_DUPLEX:
				setFullDuplex(FULL_DUPLEX_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__AUTO_SENSE:
				setAutoSense(AUTO_SENSE_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				setSupportedMaximumTransmissionUnit(SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__PERMANENT_ADDRESS:
				setPermanentAddress(PERMANENT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				setActiveMaximumTransmissionUnit(ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT);
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
			case CimPackage.NETWORK_PORT__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
			case CimPackage.NETWORK_PORT__LINK_TECHNOLOGY:
				return linkTechnology != LINK_TECHNOLOGY_EDEFAULT;
			case CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY:
				return OTHER_LINKTECHNOLOGY_EDEFAULT == null ? otherLinktechnology != null : !OTHER_LINKTECHNOLOGY_EDEFAULT.equals(otherLinktechnology);
			case CimPackage.NETWORK_PORT__NETWORK_ADDRESSES:
				return networkAddresses != null && !networkAddresses.isEmpty();
			case CimPackage.NETWORK_PORT__FULL_DUPLEX:
				return fullDuplex != FULL_DUPLEX_EDEFAULT;
			case CimPackage.NETWORK_PORT__AUTO_SENSE:
				return autoSense != AUTO_SENSE_EDEFAULT;
			case CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				return supportedMaximumTransmissionUnit != SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;
			case CimPackage.NETWORK_PORT__PERMANENT_ADDRESS:
				return PERMANENT_ADDRESS_EDEFAULT == null ? permanentAddress != null : !PERMANENT_ADDRESS_EDEFAULT.equals(permanentAddress);
			case CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				return activeMaximumTransmissionUnit != ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;
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
		result.append(" (portNumber: ");
		result.append(portNumber);
		result.append(", linkTechnology: ");
		result.append(linkTechnology);
		result.append(", otherLinktechnology: ");
		result.append(otherLinktechnology);
		result.append(", networkAddresses: ");
		result.append(networkAddresses);
		result.append(", fullDuplex: ");
		result.append(fullDuplex);
		result.append(", autoSense: ");
		result.append(autoSense);
		result.append(", supportedMaximumTransmissionUnit: ");
		result.append(supportedMaximumTransmissionUnit);
		result.append(", permanentAddress: ");
		result.append(permanentAddress);
		result.append(", activeMaximumTransmissionUnit: ");
		result.append(activeMaximumTransmissionUnit);
		result.append(')');
		return result.toString();
	}

} //NetworkPortImpl
