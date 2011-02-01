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
import es.tid.cim.EthernetPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.EthernetPortImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link es.tid.cim.impl.EthernetPortImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.impl.EthernetPortImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.impl.EthernetPortImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.impl.EthernetPortImpl#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EthernetPortImpl extends NetworkPortImpl implements EthernetPort {
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
	 * The default value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String capabilities = CAPABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String capabilityDescriptions = CAPABILITY_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String enabledCapabilities = ENABLED_CAPABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledCapabilities() <em>Other Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledCapabilities() <em>Other Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledCapabilities = OTHER_ENABLED_CAPABILITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getEthernetPort();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ETHERNET_PORT__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(String newCapabilities) {
		String oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ETHERNET_PORT__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapabilityDescriptions() {
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityDescriptions(String newCapabilityDescriptions) {
		String oldCapabilityDescriptions = capabilityDescriptions;
		capabilityDescriptions = newCapabilityDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ETHERNET_PORT__CAPABILITY_DESCRIPTIONS, oldCapabilityDescriptions, capabilityDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnabledCapabilities() {
		return enabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledCapabilities(String newEnabledCapabilities) {
		String oldEnabledCapabilities = enabledCapabilities;
		enabledCapabilities = newEnabledCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ETHERNET_PORT__ENABLED_CAPABILITIES, oldEnabledCapabilities, enabledCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledCapabilities() {
		return otherEnabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledCapabilities(String newOtherEnabledCapabilities) {
		String oldOtherEnabledCapabilities = otherEnabledCapabilities;
		otherEnabledCapabilities = newOtherEnabledCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES, oldOtherEnabledCapabilities, otherEnabledCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ETHERNET_PORT__MAX_DATA_SIZE:
				return getMaxDataSize();
			case CimPackage.ETHERNET_PORT__CAPABILITIES:
				return getCapabilities();
			case CimPackage.ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.ETHERNET_PORT__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case CimPackage.ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				return getOtherEnabledCapabilities();
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
			case CimPackage.ETHERNET_PORT__MAX_DATA_SIZE:
				setMaxDataSize((Integer)newValue);
				return;
			case CimPackage.ETHERNET_PORT__CAPABILITIES:
				setCapabilities((String)newValue);
				return;
			case CimPackage.ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				setCapabilityDescriptions((String)newValue);
				return;
			case CimPackage.ETHERNET_PORT__ENABLED_CAPABILITIES:
				setEnabledCapabilities((String)newValue);
				return;
			case CimPackage.ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				setOtherEnabledCapabilities((String)newValue);
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
			case CimPackage.ETHERNET_PORT__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
				return;
			case CimPackage.ETHERNET_PORT__CAPABILITIES:
				setCapabilities(CAPABILITIES_EDEFAULT);
				return;
			case CimPackage.ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				setCapabilityDescriptions(CAPABILITY_DESCRIPTIONS_EDEFAULT);
				return;
			case CimPackage.ETHERNET_PORT__ENABLED_CAPABILITIES:
				setEnabledCapabilities(ENABLED_CAPABILITIES_EDEFAULT);
				return;
			case CimPackage.ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				setOtherEnabledCapabilities(OTHER_ENABLED_CAPABILITIES_EDEFAULT);
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
			case CimPackage.ETHERNET_PORT__MAX_DATA_SIZE:
				return maxDataSize != MAX_DATA_SIZE_EDEFAULT;
			case CimPackage.ETHERNET_PORT__CAPABILITIES:
				return CAPABILITIES_EDEFAULT == null ? capabilities != null : !CAPABILITIES_EDEFAULT.equals(capabilities);
			case CimPackage.ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				return CAPABILITY_DESCRIPTIONS_EDEFAULT == null ? capabilityDescriptions != null : !CAPABILITY_DESCRIPTIONS_EDEFAULT.equals(capabilityDescriptions);
			case CimPackage.ETHERNET_PORT__ENABLED_CAPABILITIES:
				return ENABLED_CAPABILITIES_EDEFAULT == null ? enabledCapabilities != null : !ENABLED_CAPABILITIES_EDEFAULT.equals(enabledCapabilities);
			case CimPackage.ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				return OTHER_ENABLED_CAPABILITIES_EDEFAULT == null ? otherEnabledCapabilities != null : !OTHER_ENABLED_CAPABILITIES_EDEFAULT.equals(otherEnabledCapabilities);
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
		result.append(" (maxDataSize: ");
		result.append(maxDataSize);
		result.append(", capabilities: ");
		result.append(capabilities);
		result.append(", capabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", enabledCapabilities: ");
		result.append(enabledCapabilities);
		result.append(", otherEnabledCapabilities: ");
		result.append(otherEnabledCapabilities);
		result.append(')');
		return result.toString();
	}

} //EthernetPortImpl
