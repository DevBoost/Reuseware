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
import es.tid.cim.DHCPCapabilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DHCP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DHCPCapabilitiesImpl#getOptionsSupported <em>Options Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DHCPCapabilitiesImpl extends CapabilitiesImpl implements DHCPCapabilities {
	/**
	 * The default value of the '{@link #getOptionsSupported() <em>Options Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final int OPTIONS_SUPPORTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOptionsSupported() <em>Options Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsSupported()
	 * @generated
	 * @ordered
	 */
	protected int optionsSupported = OPTIONS_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DHCPCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDHCPCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptionsSupported() {
		return optionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionsSupported(int newOptionsSupported) {
		int oldOptionsSupported = optionsSupported;
		optionsSupported = newOptionsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DHCP_CAPABILITIES__OPTIONS_SUPPORTED, oldOptionsSupported, optionsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				return getOptionsSupported();
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
			case CimPackage.DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				setOptionsSupported((Integer)newValue);
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
			case CimPackage.DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				setOptionsSupported(OPTIONS_SUPPORTED_EDEFAULT);
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
			case CimPackage.DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				return optionsSupported != OPTIONS_SUPPORTED_EDEFAULT;
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
		result.append(" (optionsSupported: ");
		result.append(optionsSupported);
		result.append(')');
		return result.toString();
	}

} //DHCPCapabilitiesImpl
