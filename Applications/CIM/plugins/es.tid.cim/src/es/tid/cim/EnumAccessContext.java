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
 * A representation of the literals of the enumeration '<em><b>Enum Access Context</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumAccessContext()
 * @model
 * @generated
 */
public enum EnumAccessContext implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

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
	 * The '<em><b>Default Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_GATEWAY(2, "DefaultGateway", "Default Gateway"),

	/**
	 * The '<em><b>DNS Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNS_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	DNS_SERVER(3, "DNSServer", "DNS Server"),

	/**
	 * The '<em><b>SNMP Trap Destination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNMP_TRAP_DESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	SNMP_TRAP_DESTINATION(4, "SNMPTrapDestination", "SNMP Trap Destination"),

	/**
	 * The '<em><b>MPLS Tunnel Destination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPLS_TUNNEL_DESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	MPLS_TUNNEL_DESTINATION(5, "MPLSTunnelDestination", "MPLS Tunnel Destination"),

	/**
	 * The '<em><b>DHCP Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHCP_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	DHCP_SERVER(6, "DHCPServer", "DHCP Server"),

	/**
	 * The '<em><b>SMTP Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMTP_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SMTP_SERVER(7, "SMTPServer", "SMTP Server"),

	/**
	 * The '<em><b>LDAP Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDAP_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	LDAP_SERVER(8, "LDAPServer", "LDAP Server");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

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
	 * The '<em><b>Default Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Gateway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GATEWAY
	 * @model name="DefaultGateway" literal="Default Gateway"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_GATEWAY_VALUE = 2;

	/**
	 * The '<em><b>DNS Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DNS Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DNS_SERVER
	 * @model name="DNSServer" literal="DNS Server"
	 * @generated
	 * @ordered
	 */
	public static final int DNS_SERVER_VALUE = 3;

	/**
	 * The '<em><b>SNMP Trap Destination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNMP Trap Destination</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNMP_TRAP_DESTINATION
	 * @model name="SNMPTrapDestination" literal="SNMP Trap Destination"
	 * @generated
	 * @ordered
	 */
	public static final int SNMP_TRAP_DESTINATION_VALUE = 4;

	/**
	 * The '<em><b>MPLS Tunnel Destination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPLS Tunnel Destination</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPLS_TUNNEL_DESTINATION
	 * @model name="MPLSTunnelDestination" literal="MPLS Tunnel Destination"
	 * @generated
	 * @ordered
	 */
	public static final int MPLS_TUNNEL_DESTINATION_VALUE = 5;

	/**
	 * The '<em><b>DHCP Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DHCP Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DHCP_SERVER
	 * @model name="DHCPServer" literal="DHCP Server"
	 * @generated
	 * @ordered
	 */
	public static final int DHCP_SERVER_VALUE = 6;

	/**
	 * The '<em><b>SMTP Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMTP Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMTP_SERVER
	 * @model name="SMTPServer" literal="SMTP Server"
	 * @generated
	 * @ordered
	 */
	public static final int SMTP_SERVER_VALUE = 7;

	/**
	 * The '<em><b>LDAP Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LDAP Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LDAP_SERVER
	 * @model name="LDAPServer" literal="LDAP Server"
	 * @generated
	 * @ordered
	 */
	public static final int LDAP_SERVER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Enum Access Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumAccessContext[] VALUES_ARRAY =
		new EnumAccessContext[] {
			UNKNOWN,
			OTHER,
			DEFAULT_GATEWAY,
			DNS_SERVER,
			SNMP_TRAP_DESTINATION,
			MPLS_TUNNEL_DESTINATION,
			DHCP_SERVER,
			SMTP_SERVER,
			LDAP_SERVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Access Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumAccessContext> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Access Context</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAccessContext get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAccessContext result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Access Context</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAccessContext getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAccessContext result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Access Context</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAccessContext get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case DEFAULT_GATEWAY_VALUE: return DEFAULT_GATEWAY;
			case DNS_SERVER_VALUE: return DNS_SERVER;
			case SNMP_TRAP_DESTINATION_VALUE: return SNMP_TRAP_DESTINATION;
			case MPLS_TUNNEL_DESTINATION_VALUE: return MPLS_TUNNEL_DESTINATION;
			case DHCP_SERVER_VALUE: return DHCP_SERVER;
			case SMTP_SERVER_VALUE: return SMTP_SERVER;
			case LDAP_SERVER_VALUE: return LDAP_SERVER;
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
	private EnumAccessContext(int value, String name, String literal) {
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
	
} //EnumAccessContext
