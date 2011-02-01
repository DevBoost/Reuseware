/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#isAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#isAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#getHostname <em>Hostname</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#isRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#isUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 *   <li>{@link es.tid.cim.DNSProtocolEndpoint#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint()
 * @model
 * @generated
 */
public interface DNSProtocolEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Append Parent Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append Parent Suffixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #setAppendParentSuffixes(boolean)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_AppendParentSuffixes()
	 * @model
	 * @generated
	 */
	boolean isAppendParentSuffixes();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#isAppendParentSuffixes <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #isAppendParentSuffixes()
	 * @generated
	 */
	void setAppendParentSuffixes(boolean value);

	/**
	 * Returns the value of the '<em><b>Append Primary Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append Primary Suffixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #setAppendPrimarySuffixes(boolean)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_AppendPrimarySuffixes()
	 * @model
	 * @generated
	 */
	boolean isAppendPrimarySuffixes();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#isAppendPrimarySuffixes <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #isAppendPrimarySuffixes()
	 * @generated
	 */
	void setAppendPrimarySuffixes(boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Register This Connections Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register This Connections Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #setRegisterThisConnectionsAddress(boolean)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_RegisterThisConnectionsAddress()
	 * @model
	 * @generated
	 */
	boolean isRegisterThisConnectionsAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#isRegisterThisConnectionsAddress <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #isRegisterThisConnectionsAddress()
	 * @generated
	 */
	void setRegisterThisConnectionsAddress(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Suffix When Registering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Suffix When Registering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #setUseSuffixWhenRegistering(boolean)
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_UseSuffixWhenRegistering()
	 * @model
	 * @generated
	 */
	boolean isUseSuffixWhenRegistering();

	/**
	 * Sets the value of the '{@link es.tid.cim.DNSProtocolEndpoint#isUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #isUseSuffixWhenRegistering()
	 * @generated
	 */
	void setUseSuffixWhenRegistering(boolean value);

	/**
	 * Returns the value of the '<em><b>DHCP Options To Use</b></em>' attribute list.
	 * The list contents are of type {@link es.tid.cim.EnumDHCPOptions}.
	 * The literals are from the enumeration {@link es.tid.cim.EnumDHCPOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DHCP Options To Use</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DHCP Options To Use</em>' attribute list.
	 * @see es.tid.cim.EnumDHCPOptions
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_DHCPOptionsToUse()
	 * @model
	 * @generated
	 */
	EList<EnumDHCPOptions> getDHCPOptionsToUse();

	/**
	 * Returns the value of the '<em><b>DNS Suffixes To Append</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DNS Suffixes To Append</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DNS Suffixes To Append</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getDNSProtocolEndpoint_DNSSuffixesToAppend()
	 * @model
	 * @generated
	 */
	EList<String> getDNSSuffixesToAppend();

} // DNSProtocolEndpoint
