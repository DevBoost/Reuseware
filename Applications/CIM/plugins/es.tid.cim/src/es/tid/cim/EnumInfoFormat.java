/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Info Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumInfoFormat()
 * @model
 * @generated
 */
public enum EnumInfoFormat implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "Other", "Other"),

	/**
	 * The '<em><b>Host Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_NAME(2, "HostName", "Host Name"),

	/**
	 * The '<em><b>IPv4 Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4_ADDRESS(3, "IPv4Address", "IPv4 Address"),

	/**
	 * The '<em><b>IPv6 Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_ADDRESS(4, "IPv6Address", "IPv6 Address"),

	/**
	 * The '<em><b>IPX Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPX_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IPX_ADDRESS(5, "IPXAddress", "IPX Address"),

	/**
	 * The '<em><b>DE Cnet Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_CNET_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	DE_CNET_ADDRESS(6, "DECnetAddress", "DECnet Address"),

	/**
	 * The '<em><b>SNA Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNA_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	SNA_ADDRESS(7, "SNAAddress", "SNA Address"),

	/**
	 * The '<em><b>Autonomous System Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_SYSTEM_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONOMOUS_SYSTEM_NUMBER(8, "AutonomousSystemNumber", "Autonomous System Number"),

	/**
	 * The '<em><b>MPLS Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPLS_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	MPLS_LABEL(9, "MPLSLabel", "MPLS Label"),

	/**
	 * The '<em><b>IPv4 Subnet Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_SUBNET_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4_SUBNET_ADDRESS(10, "IPv4SubnetAddress", "IPv4 Subnet Address"),

	/**
	 * The '<em><b>IPv6 Subnet Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_SUBNET_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_SUBNET_ADDRESS(11, "IPv6SubnetAddress", "IPv6 Subnet Address"),

	/**
	 * The '<em><b>IPv4 Address Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_ADDRESS_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4_ADDRESS_RANGE(12, "IPv4AddressRange", "IPv4 Address Range"),

	/**
	 * The '<em><b>IPv6 Address Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_ADDRESS_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_ADDRESS_RANGE(13, "IPv6AddressRange", "IPv6 Address Range"),

	/**
	 * The '<em><b>Dial String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAL_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DIAL_STRING(100, "DialString", "Dial String"),

	/**
	 * The '<em><b>Ethernet Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET_ADDRESS(101, "EthernetAddress", "Ethernet Address"),

	/**
	 * The '<em><b>Token Ring Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_RING_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_RING_ADDRESS(102, "TokenRingAddress", "Token Ring Address"),

	/**
	 * The '<em><b>ATM Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATM_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ATM_ADDRESS(103, "ATMAddress", "ATM Address"),

	/**
	 * The '<em><b>Frame Relay Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_RELAY_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_RELAY_ADDRESS(104, "FrameRelayAddress", "Frame Relay Address"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(200, "URL", "URL"),

	/**
	 * The '<em><b>FQDN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FQDN_VALUE
	 * @generated
	 * @ordered
	 */
	FQDN(201, "FQDN", "FQDN"),

	/**
	 * The '<em><b>User FQDN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_FQDN_VALUE
	 * @generated
	 * @ordered
	 */
	USER_FQDN(202, "UserFQDN", "User FQDN"),

	/**
	 * The '<em><b>DERASN1DN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERASN1DN_VALUE
	 * @generated
	 * @ordered
	 */
	DERASN1DN(203, "DERASN1DN", "DER ASN1 DN"),

	/**
	 * The '<em><b>DERASN1GN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERASN1GN_VALUE
	 * @generated
	 * @ordered
	 */
	DERASN1GN(204, "DERASN1GN", "DER ASN1 GN"),

	/**
	 * The '<em><b>Key ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_ID_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_ID(205, "KeyID", "Key ID");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Host Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Host Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOST_NAME
	 * @model name="HostName" literal="Host Name"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_NAME_VALUE = 2;

	/**
	 * The '<em><b>IPv4 Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv4 Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4_ADDRESS
	 * @model name="IPv4Address" literal="IPv4 Address"
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_ADDRESS_VALUE = 3;

	/**
	 * The '<em><b>IPv6 Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv6 Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_ADDRESS
	 * @model name="IPv6Address" literal="IPv6 Address"
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_ADDRESS_VALUE = 4;

	/**
	 * The '<em><b>IPX Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPX Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPX_ADDRESS
	 * @model name="IPXAddress" literal="IPX Address"
	 * @generated
	 * @ordered
	 */
	public static final int IPX_ADDRESS_VALUE = 5;

	/**
	 * The '<em><b>DE Cnet Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DE Cnet Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DE_CNET_ADDRESS
	 * @model name="DECnetAddress" literal="DECnet Address"
	 * @generated
	 * @ordered
	 */
	public static final int DE_CNET_ADDRESS_VALUE = 6;

	/**
	 * The '<em><b>SNA Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNA Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNA_ADDRESS
	 * @model name="SNAAddress" literal="SNA Address"
	 * @generated
	 * @ordered
	 */
	public static final int SNA_ADDRESS_VALUE = 7;

	/**
	 * The '<em><b>Autonomous System Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autonomous System Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_SYSTEM_NUMBER
	 * @model name="AutonomousSystemNumber" literal="Autonomous System Number"
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMOUS_SYSTEM_NUMBER_VALUE = 8;

	/**
	 * The '<em><b>MPLS Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPLS Label</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPLS_LABEL
	 * @model name="MPLSLabel" literal="MPLS Label"
	 * @generated
	 * @ordered
	 */
	public static final int MPLS_LABEL_VALUE = 9;

	/**
	 * The '<em><b>IPv4 Subnet Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv4 Subnet Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4_SUBNET_ADDRESS
	 * @model name="IPv4SubnetAddress" literal="IPv4 Subnet Address"
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_SUBNET_ADDRESS_VALUE = 10;

	/**
	 * The '<em><b>IPv6 Subnet Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv6 Subnet Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_SUBNET_ADDRESS
	 * @model name="IPv6SubnetAddress" literal="IPv6 Subnet Address"
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_SUBNET_ADDRESS_VALUE = 11;

	/**
	 * The '<em><b>IPv4 Address Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv4 Address Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4_ADDRESS_RANGE
	 * @model name="IPv4AddressRange" literal="IPv4 Address Range"
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_ADDRESS_RANGE_VALUE = 12;

	/**
	 * The '<em><b>IPv6 Address Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv6 Address Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_ADDRESS_RANGE
	 * @model name="IPv6AddressRange" literal="IPv6 Address Range"
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_ADDRESS_RANGE_VALUE = 13;

	/**
	 * The '<em><b>Dial String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dial String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAL_STRING
	 * @model name="DialString" literal="Dial String"
	 * @generated
	 * @ordered
	 */
	public static final int DIAL_STRING_VALUE = 100;

	/**
	 * The '<em><b>Ethernet Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_ADDRESS
	 * @model name="EthernetAddress" literal="Ethernet Address"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_ADDRESS_VALUE = 101;

	/**
	 * The '<em><b>Token Ring Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Ring Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_RING_ADDRESS
	 * @model name="TokenRingAddress" literal="Token Ring Address"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_RING_ADDRESS_VALUE = 102;

	/**
	 * The '<em><b>ATM Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATM Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATM_ADDRESS
	 * @model name="ATMAddress" literal="ATM Address"
	 * @generated
	 * @ordered
	 */
	public static final int ATM_ADDRESS_VALUE = 103;

	/**
	 * The '<em><b>Frame Relay Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Relay Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_RELAY_ADDRESS
	 * @model name="FrameRelayAddress" literal="Frame Relay Address"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_RELAY_ADDRESS_VALUE = 104;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 200;

	/**
	 * The '<em><b>FQDN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FQDN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FQDN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FQDN_VALUE = 201;

	/**
	 * The '<em><b>User FQDN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User FQDN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_FQDN
	 * @model name="UserFQDN" literal="User FQDN"
	 * @generated
	 * @ordered
	 */
	public static final int USER_FQDN_VALUE = 202;

	/**
	 * The '<em><b>DERASN1DN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERASN1DN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERASN1DN
	 * @model literal="DER ASN1 DN"
	 * @generated
	 * @ordered
	 */
	public static final int DERASN1DN_VALUE = 203;

	/**
	 * The '<em><b>DERASN1GN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERASN1GN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERASN1GN
	 * @model literal="DER ASN1 GN"
	 * @generated
	 * @ordered
	 */
	public static final int DERASN1GN_VALUE = 204;

	/**
	 * The '<em><b>Key ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Key ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY_ID
	 * @model name="KeyID" literal="Key ID"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_ID_VALUE = 205;

	/**
	 * An array of all the '<em><b>Enum Info Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumInfoFormat[] VALUES_ARRAY =
		new EnumInfoFormat[] {
			OTHER,
			HOST_NAME,
			IPV4_ADDRESS,
			IPV6_ADDRESS,
			IPX_ADDRESS,
			DE_CNET_ADDRESS,
			SNA_ADDRESS,
			AUTONOMOUS_SYSTEM_NUMBER,
			MPLS_LABEL,
			IPV4_SUBNET_ADDRESS,
			IPV6_SUBNET_ADDRESS,
			IPV4_ADDRESS_RANGE,
			IPV6_ADDRESS_RANGE,
			DIAL_STRING,
			ETHERNET_ADDRESS,
			TOKEN_RING_ADDRESS,
			ATM_ADDRESS,
			FRAME_RELAY_ADDRESS,
			URL,
			FQDN,
			USER_FQDN,
			DERASN1DN,
			DERASN1GN,
			KEY_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Info Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumInfoFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Info Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumInfoFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumInfoFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Info Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumInfoFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumInfoFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Info Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumInfoFormat get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case HOST_NAME_VALUE: return HOST_NAME;
			case IPV4_ADDRESS_VALUE: return IPV4_ADDRESS;
			case IPV6_ADDRESS_VALUE: return IPV6_ADDRESS;
			case IPX_ADDRESS_VALUE: return IPX_ADDRESS;
			case DE_CNET_ADDRESS_VALUE: return DE_CNET_ADDRESS;
			case SNA_ADDRESS_VALUE: return SNA_ADDRESS;
			case AUTONOMOUS_SYSTEM_NUMBER_VALUE: return AUTONOMOUS_SYSTEM_NUMBER;
			case MPLS_LABEL_VALUE: return MPLS_LABEL;
			case IPV4_SUBNET_ADDRESS_VALUE: return IPV4_SUBNET_ADDRESS;
			case IPV6_SUBNET_ADDRESS_VALUE: return IPV6_SUBNET_ADDRESS;
			case IPV4_ADDRESS_RANGE_VALUE: return IPV4_ADDRESS_RANGE;
			case IPV6_ADDRESS_RANGE_VALUE: return IPV6_ADDRESS_RANGE;
			case DIAL_STRING_VALUE: return DIAL_STRING;
			case ETHERNET_ADDRESS_VALUE: return ETHERNET_ADDRESS;
			case TOKEN_RING_ADDRESS_VALUE: return TOKEN_RING_ADDRESS;
			case ATM_ADDRESS_VALUE: return ATM_ADDRESS;
			case FRAME_RELAY_ADDRESS_VALUE: return FRAME_RELAY_ADDRESS;
			case URL_VALUE: return URL;
			case FQDN_VALUE: return FQDN;
			case USER_FQDN_VALUE: return USER_FQDN;
			case DERASN1DN_VALUE: return DERASN1DN;
			case DERASN1GN_VALUE: return DERASN1GN;
			case KEY_ID_VALUE: return KEY_ID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumInfoFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnumInfoFormat
