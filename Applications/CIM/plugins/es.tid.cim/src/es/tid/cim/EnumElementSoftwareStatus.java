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
 * A representation of the literals of the enumeration '<em><b>Enum Element Software Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumElementSoftwareStatus()
 * @model
 * @generated
 */
public enum EnumElementSoftwareStatus implements Enumerator {
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
	 * The '<em><b>Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(2, "Current", "Current"),

	/**
	 * The '<em><b>Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT(3, "Next", "Next"),

	/**
	 * The '<em><b>Fall Back</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALL_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	FALL_BACK(4, "FallBack", "FallBack"),

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(5, "Default", "Default"),

	/**
	 * The '<em><b>Installed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLED(6, "Installed", "Installed"),

	/**
	 * The '<em><b>Single Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_USE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_USE(7, "SingleUse", "SingleUse"),

	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABLE(8, "Available", "Available"),

	/**
	 * The '<em><b>Supports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTS(9, "Supports", "Supports");

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
	 * The '<em><b>Current</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Current</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENT
	 * @model name="Current"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_VALUE = 2;

	/**
	 * The '<em><b>Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT
	 * @model name="Next"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_VALUE = 3;

	/**
	 * The '<em><b>Fall Back</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fall Back</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FALL_BACK
	 * @model name="FallBack"
	 * @generated
	 * @ordered
	 */
	public static final int FALL_BACK_VALUE = 4;

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 5;

	/**
	 * The '<em><b>Installed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Installed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALLED
	 * @model name="Installed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLED_VALUE = 6;

	/**
	 * The '<em><b>Single Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_USE
	 * @model name="SingleUse"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_USE_VALUE = 7;

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Available</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE
	 * @model name="Available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE_VALUE = 8;

	/**
	 * The '<em><b>Supports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORTS
	 * @model name="Supports"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTS_VALUE = 9;

	/**
	 * An array of all the '<em><b>Enum Element Software Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumElementSoftwareStatus[] VALUES_ARRAY =
		new EnumElementSoftwareStatus[] {
			UNKNOWN,
			CURRENT,
			NEXT,
			FALL_BACK,
			DEFAULT,
			INSTALLED,
			SINGLE_USE,
			AVAILABLE,
			SUPPORTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Element Software Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumElementSoftwareStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Element Software Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumElementSoftwareStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumElementSoftwareStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Element Software Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumElementSoftwareStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumElementSoftwareStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Element Software Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumElementSoftwareStatus get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case CURRENT_VALUE: return CURRENT;
			case NEXT_VALUE: return NEXT;
			case FALL_BACK_VALUE: return FALL_BACK;
			case DEFAULT_VALUE: return DEFAULT;
			case INSTALLED_VALUE: return INSTALLED;
			case SINGLE_USE_VALUE: return SINGLE_USE;
			case AVAILABLE_VALUE: return AVAILABLE;
			case SUPPORTS_VALUE: return SUPPORTS;
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
	private EnumElementSoftwareStatus(int value, String name, String literal) {
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
	
} //EnumElementSoftwareStatus
