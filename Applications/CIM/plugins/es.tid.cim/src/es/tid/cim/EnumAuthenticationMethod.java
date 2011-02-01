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
 * A representation of the literals of the enumeration '<em><b>Enum Authentication Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumAuthenticationMethod()
 * @model
 * @generated
 */
public enum EnumAuthenticationMethod implements Enumerator {
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
	 * The '<em><b>Open System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SYSTEM(2, "OpenSystem", "Open System"),

	/**
	 * The '<em><b>Shared Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_KEY(3, "SharedKey", "SharedKey"),

	/**
	 * The '<em><b>WPAPSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPAPSK_VALUE
	 * @generated
	 * @ordered
	 */
	WPAPSK(4, "WPAPSK", "WPAPSK"),

	/**
	 * The '<em><b>WPAIEEE802 1x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPAIEEE802_1X_VALUE
	 * @generated
	 * @ordered
	 */
	WPAIEEE802_1X(5, "WPAIEEE802_1x", "WPAIEEE802_1x"),

	/**
	 * The '<em><b>WPA2PSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPA2PSK_VALUE
	 * @generated
	 * @ordered
	 */
	WPA2PSK(6, "WPA2PSK", "WPA2 PSK"),

	/**
	 * The '<em><b>WPA2IEEE802 1x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPA2IEEE802_1X_VALUE
	 * @generated
	 * @ordered
	 */
	WPA2IEEE802_1X(7, "WPA2IEEE802_1x", "WPA2 IEEE 802.1x");

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
	 * The '<em><b>Open System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_SYSTEM
	 * @model name="OpenSystem" literal="Open System"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>Shared Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shared Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHARED_KEY
	 * @model name="SharedKey"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_KEY_VALUE = 3;

	/**
	 * The '<em><b>WPAPSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPAPSK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPAPSK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WPAPSK_VALUE = 4;

	/**
	 * The '<em><b>WPAIEEE802 1x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPAIEEE802 1x</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPAIEEE802_1X
	 * @model name="WPAIEEE802_1x"
	 * @generated
	 * @ordered
	 */
	public static final int WPAIEEE802_1X_VALUE = 5;

	/**
	 * The '<em><b>WPA2PSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPA2PSK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPA2PSK
	 * @model literal="WPA2 PSK"
	 * @generated
	 * @ordered
	 */
	public static final int WPA2PSK_VALUE = 6;

	/**
	 * The '<em><b>WPA2IEEE802 1x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPA2IEEE802 1x</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPA2IEEE802_1X
	 * @model name="WPA2IEEE802_1x" literal="WPA2 IEEE 802.1x"
	 * @generated
	 * @ordered
	 */
	public static final int WPA2IEEE802_1X_VALUE = 7;

	/**
	 * An array of all the '<em><b>Enum Authentication Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumAuthenticationMethod[] VALUES_ARRAY =
		new EnumAuthenticationMethod[] {
			OTHER,
			OPEN_SYSTEM,
			SHARED_KEY,
			WPAPSK,
			WPAIEEE802_1X,
			WPA2PSK,
			WPA2IEEE802_1X,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Authentication Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumAuthenticationMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Authentication Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAuthenticationMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAuthenticationMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Authentication Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAuthenticationMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAuthenticationMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Authentication Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAuthenticationMethod get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case OPEN_SYSTEM_VALUE: return OPEN_SYSTEM;
			case SHARED_KEY_VALUE: return SHARED_KEY;
			case WPAPSK_VALUE: return WPAPSK;
			case WPAIEEE802_1X_VALUE: return WPAIEEE802_1X;
			case WPA2PSK_VALUE: return WPA2PSK;
			case WPA2IEEE802_1X_VALUE: return WPA2IEEE802_1X;
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
	private EnumAuthenticationMethod(int value, String name, String literal) {
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
	
} //EnumAuthenticationMethod
