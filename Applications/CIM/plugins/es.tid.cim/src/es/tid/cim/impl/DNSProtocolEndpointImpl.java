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
import es.tid.cim.DNSProtocolEndpoint;
import es.tid.cim.EnumDHCPOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#isAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#isAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#isRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#isUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 *   <li>{@link es.tid.cim.impl.DNSProtocolEndpointImpl#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DNSProtocolEndpointImpl extends ProtocolEndpointImpl implements DNSProtocolEndpoint {
	/**
	 * The default value of the '{@link #isAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPEND_PARENT_SUFFIXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected boolean appendParentSuffixes = APPEND_PARENT_SUFFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPEND_PRIMARY_SUFFIXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected boolean appendPrimarySuffixes = APPEND_PRIMARY_SUFFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegisterThisConnectionsAddress() <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisterThisConnectionsAddress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegisterThisConnectionsAddress() <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisterThisConnectionsAddress()
	 * @generated
	 * @ordered
	 */
	protected boolean registerThisConnectionsAddress = REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseSuffixWhenRegistering() <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSuffixWhenRegistering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SUFFIX_WHEN_REGISTERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseSuffixWhenRegistering() <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSuffixWhenRegistering()
	 * @generated
	 * @ordered
	 */
	protected boolean useSuffixWhenRegistering = USE_SUFFIX_WHEN_REGISTERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDHCPOptionsToUse() <em>DHCP Options To Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDHCPOptionsToUse()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumDHCPOptions> dhcpOptionsToUse;

	/**
	 * The cached value of the '{@link #getDNSSuffixesToAppend() <em>DNS Suffixes To Append</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSSuffixesToAppend()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dnsSuffixesToAppend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNSProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDNSProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppendParentSuffixes() {
		return appendParentSuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppendParentSuffixes(boolean newAppendParentSuffixes) {
		boolean oldAppendParentSuffixes = appendParentSuffixes;
		appendParentSuffixes = newAppendParentSuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES, oldAppendParentSuffixes, appendParentSuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppendPrimarySuffixes() {
		return appendPrimarySuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppendPrimarySuffixes(boolean newAppendPrimarySuffixes) {
		boolean oldAppendPrimarySuffixes = appendPrimarySuffixes;
		appendPrimarySuffixes = newAppendPrimarySuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES, oldAppendPrimarySuffixes, appendPrimarySuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegisterThisConnectionsAddress() {
		return registerThisConnectionsAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterThisConnectionsAddress(boolean newRegisterThisConnectionsAddress) {
		boolean oldRegisterThisConnectionsAddress = registerThisConnectionsAddress;
		registerThisConnectionsAddress = newRegisterThisConnectionsAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS, oldRegisterThisConnectionsAddress, registerThisConnectionsAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseSuffixWhenRegistering() {
		return useSuffixWhenRegistering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseSuffixWhenRegistering(boolean newUseSuffixWhenRegistering) {
		boolean oldUseSuffixWhenRegistering = useSuffixWhenRegistering;
		useSuffixWhenRegistering = newUseSuffixWhenRegistering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING, oldUseSuffixWhenRegistering, useSuffixWhenRegistering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumDHCPOptions> getDHCPOptionsToUse() {
		if (dhcpOptionsToUse == null) {
			dhcpOptionsToUse = new EDataTypeUniqueEList<EnumDHCPOptions>(EnumDHCPOptions.class, this, CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE);
		}
		return dhcpOptionsToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDNSSuffixesToAppend() {
		if (dnsSuffixesToAppend == null) {
			dnsSuffixesToAppend = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND);
		}
		return dnsSuffixesToAppend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				return isAppendParentSuffixes();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				return isAppendPrimarySuffixes();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				return getDomainName();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				return getHostname();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return isRegisterThisConnectionsAddress();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				return isUseSuffixWhenRegistering();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				return getDHCPOptionsToUse();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				return getDNSSuffixesToAppend();
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
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes((Boolean)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes((Boolean)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				setHostname((String)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress((Boolean)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering((Boolean)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
				getDHCPOptionsToUse().addAll((Collection<? extends EnumDHCPOptions>)newValue);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
				getDNSSuffixesToAppend().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes(APPEND_PARENT_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes(APPEND_PRIMARY_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress(REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering(USE_SUFFIX_WHEN_REGISTERING_EDEFAULT);
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
				return;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
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
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				return appendParentSuffixes != APPEND_PARENT_SUFFIXES_EDEFAULT;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				return appendPrimarySuffixes != APPEND_PRIMARY_SUFFIXES_EDEFAULT;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return registerThisConnectionsAddress != REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				return useSuffixWhenRegistering != USE_SUFFIX_WHEN_REGISTERING_EDEFAULT;
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				return dhcpOptionsToUse != null && !dhcpOptionsToUse.isEmpty();
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				return dnsSuffixesToAppend != null && !dnsSuffixesToAppend.isEmpty();
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
		result.append(" (appendParentSuffixes: ");
		result.append(appendParentSuffixes);
		result.append(", appendPrimarySuffixes: ");
		result.append(appendPrimarySuffixes);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", registerThisConnectionsAddress: ");
		result.append(registerThisConnectionsAddress);
		result.append(", useSuffixWhenRegistering: ");
		result.append(useSuffixWhenRegistering);
		result.append(", DHCPOptionsToUse: ");
		result.append(dhcpOptionsToUse);
		result.append(", DNSSuffixesToAppend: ");
		result.append(dnsSuffixesToAppend);
		result.append(')');
		return result.toString();
	}

} //DNSProtocolEndpointImpl
