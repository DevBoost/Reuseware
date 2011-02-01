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
 * A representation of the literals of the enumeration '<em><b>Enum DHCP Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumDHCPOptions()
 * @model
 * @generated
 */
public enum EnumDHCPOptions implements Enumerator {
	/**
	 * The '<em><b>Domain Name Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_NAME_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_NAME_SERVER(8, "DomainNameServer", "Domain Name Server"),

	/**
	 * The '<em><b>Host Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_NAME(14, "HostName", "HostName"),

	/**
	 * The '<em><b>Domain Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_NAME(17, "DomainName", "Domain Name");

	/**
	 * The '<em><b>Domain Name Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domain Name Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_NAME_SERVER
	 * @model name="DomainNameServer" literal="Domain Name Server"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_NAME_SERVER_VALUE = 8;

	/**
	 * The '<em><b>Host Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Host Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOST_NAME
	 * @model name="HostName"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_NAME_VALUE = 14;

	/**
	 * The '<em><b>Domain Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domain Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_NAME
	 * @model name="DomainName" literal="Domain Name"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_NAME_VALUE = 17;

	/**
	 * An array of all the '<em><b>Enum DHCP Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDHCPOptions[] VALUES_ARRAY =
		new EnumDHCPOptions[] {
			DOMAIN_NAME_SERVER,
			HOST_NAME,
			DOMAIN_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum DHCP Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumDHCPOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum DHCP Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDHCPOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDHCPOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum DHCP Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDHCPOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDHCPOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum DHCP Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDHCPOptions get(int value) {
		switch (value) {
			case DOMAIN_NAME_SERVER_VALUE: return DOMAIN_NAME_SERVER;
			case HOST_NAME_VALUE: return HOST_NAME;
			case DOMAIN_NAME_VALUE: return DOMAIN_NAME;
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
	private EnumDHCPOptions(int value, String name, String literal) {
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
	
} //EnumDHCPOptions
