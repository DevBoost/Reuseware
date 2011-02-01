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
 * A representation of the literals of the enumeration '<em><b>Enum Protocol IF Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumProtocolIFType()
 * @model
 * @generated
 */
public enum EnumProtocolIFType implements Enumerator {
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
	 * The '<em><b>IPv4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4(4096, "IPv4", "IPv4"),

	/**
	 * The '<em><b>IPv6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6(4097, "IPv6", "IPv6"),

	/**
	 * The '<em><b>IPv4v6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4V6_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4V6(4098, "IPv4v6", "IPv4/v6"),

	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(4396, "HTTP", "HTTP"),

	/**
	 * The '<em><b>HTTPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPS(4405, "HTTPS", "HTTPS"),

	/**
	 * The '<em><b>IEEE802 11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE802_11(71, "IEEE802_11", "IEEE 802.11"),

	/**
	 * The '<em><b>TCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_VALUE
	 * @generated
	 * @ordered
	 */
	TCP(4111, "TCP", "TCP"),

	/**
	 * The '<em><b>802 11 a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11_A_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11_A(4112, "_802_11_a", "802.11a"),

	/**
	 * The '<em><b>802 11b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11B_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11B(4113, "_802_11b", "_802_11b"),

	/**
	 * The '<em><b>802 11g</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11G_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11G(4114, "_802_11g", "_802_11g"),

	/**
	 * The '<em><b>802 11h</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11H_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11H(4115, "_802_11h", "_802_11h");

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
	 * The '<em><b>IPv4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4
	 * @model name="IPv4"
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_VALUE = 4096;

	/**
	 * The '<em><b>IPv6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6
	 * @model name="IPv6"
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_VALUE = 4097;

	/**
	 * The '<em><b>IPv4v6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPv4v6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4V6
	 * @model name="IPv4v6" literal="IPv4/v6"
	 * @generated
	 * @ordered
	 */
	public static final int IPV4V6_VALUE = 4098;

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 4396;

	/**
	 * The '<em><b>HTTPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTTPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPS_VALUE = 4405;

	/**
	 * The '<em><b>IEEE802 11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IEEE802 11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11
	 * @model literal="IEEE 802.11"
	 * @generated
	 * @ordered
	 */
	public static final int IEEE802_11_VALUE = 71;

	/**
	 * The '<em><b>TCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCP_VALUE = 4111;

	/**
	 * The '<em><b>802 11 a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11 a</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11_A
	 * @model name="_802_11_a" literal="802.11a"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11_A_VALUE = 4112;

	/**
	 * The '<em><b>802 11b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11b</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11B
	 * @model name="_802_11b"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11B_VALUE = 4113;

	/**
	 * The '<em><b>802 11g</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11g</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11G
	 * @model name="_802_11g"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11G_VALUE = 4114;

	/**
	 * The '<em><b>802 11h</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11h</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11H
	 * @model name="_802_11h"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11H_VALUE = 4115;

	/**
	 * An array of all the '<em><b>Enum Protocol IF Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumProtocolIFType[] VALUES_ARRAY =
		new EnumProtocolIFType[] {
			UNKNOWN,
			OTHER,
			IPV4,
			IPV6,
			IPV4V6,
			HTTP,
			HTTPS,
			IEEE802_11,
			TCP,
			_802_11_A,
			_802_11B,
			_802_11G,
			_802_11H,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Protocol IF Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumProtocolIFType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Protocol IF Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolIFType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumProtocolIFType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Protocol IF Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolIFType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumProtocolIFType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Protocol IF Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolIFType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case IPV4_VALUE: return IPV4;
			case IPV6_VALUE: return IPV6;
			case IPV4V6_VALUE: return IPV4V6;
			case HTTP_VALUE: return HTTP;
			case HTTPS_VALUE: return HTTPS;
			case IEEE802_11_VALUE: return IEEE802_11;
			case TCP_VALUE: return TCP;
			case _802_11_A_VALUE: return _802_11_A;
			case _802_11B_VALUE: return _802_11B;
			case _802_11G_VALUE: return _802_11G;
			case _802_11H_VALUE: return _802_11H;
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
	private EnumProtocolIFType(int value, String name, String literal) {
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
	
} //EnumProtocolIFType
