/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import es.tid.cim.CimPackage;
import es.tid.cim.DNSSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DNSSettingDataImpl#getDNSServerAddresses <em>DNS Server Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DNSSettingDataImpl extends IPAssignmentSettingDataImpl implements DNSSettingData {
	/**
	 * The cached value of the '{@link #getDNSServerAddresses() <em>DNS Server Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSServerAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dnsServerAddresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNSSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDNSSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDNSServerAddresses() {
		if (dnsServerAddresses == null) {
			dnsServerAddresses = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.DNS_SETTING_DATA__DNS_SERVER_ADDRESSES);
		}
		return dnsServerAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				return getDNSServerAddresses();
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
			case CimPackage.DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				getDNSServerAddresses().clear();
				getDNSServerAddresses().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				getDNSServerAddresses().clear();
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
			case CimPackage.DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				return dnsServerAddresses != null && !dnsServerAddresses.isEmpty();
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
		result.append(" (DNSServerAddresses: ");
		result.append(dnsServerAddresses);
		result.append(')');
		return result.toString();
	}

} //DNSSettingDataImpl
