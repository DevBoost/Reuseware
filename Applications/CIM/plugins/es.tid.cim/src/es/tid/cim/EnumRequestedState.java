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
 * A representation of the literals of the enumeration '<em><b>Enum Requested State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumRequestedState()
 * @model
 * @generated
 */
public enum EnumRequestedState implements Enumerator {
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
	 * The '<em><b>Enabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLED(2, "Enabled", "Enabled"),

	/**
	 * The '<em><b>Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(3, "Disabled", "Disabled"),

	/**
	 * The '<em><b>Shut Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SHUT_DOWN(4, "ShutDown", "ShutDown"),

	/**
	 * The '<em><b>Offline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFLINE_VALUE
	 * @generated
	 * @ordered
	 */
	OFFLINE(6, "Offline", "Offline"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(7, "Test", "Test"),

	/**
	 * The '<em><b>Deferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFERRED(8, "Deferred", "Deferred"),

	/**
	 * The '<em><b>Quiesce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIESCE_VALUE
	 * @generated
	 * @ordered
	 */
	QUIESCE(9, "Quiesce", "Quiesce"),

	/**
	 * The '<em><b>Reboot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REBOOT_VALUE
	 * @generated
	 * @ordered
	 */
	REBOOT(10, "Reboot", "Reboot"),

	/**
	 * The '<em><b>Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(11, "Reset", "Reset"),

	/**
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(12, "NotApplicable", "Not Applicable");

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
	 * The '<em><b>Enabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLED
	 * @model name="Enabled"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLED_VALUE = 2;

	/**
	 * The '<em><b>Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model name="Disabled"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 3;

	/**
	 * The '<em><b>Shut Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shut Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN
	 * @model name="ShutDown"
	 * @generated
	 * @ordered
	 */
	public static final int SHUT_DOWN_VALUE = 4;

	/**
	 * The '<em><b>Offline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Offline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFLINE
	 * @model name="Offline"
	 * @generated
	 * @ordered
	 */
	public static final int OFFLINE_VALUE = 6;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 7;

	/**
	 * The '<em><b>Deferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deferred</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFERRED
	 * @model name="Deferred"
	 * @generated
	 * @ordered
	 */
	public static final int DEFERRED_VALUE = 8;

	/**
	 * The '<em><b>Quiesce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quiesce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUIESCE
	 * @model name="Quiesce"
	 * @generated
	 * @ordered
	 */
	public static final int QUIESCE_VALUE = 9;

	/**
	 * The '<em><b>Reboot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reboot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REBOOT
	 * @model name="Reboot"
	 * @generated
	 * @ordered
	 */
	public static final int REBOOT_VALUE = 10;

	/**
	 * The '<em><b>Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model name="Reset"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 11;

	/**
	 * The '<em><b>Not Applicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Applicable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE
	 * @model name="NotApplicable" literal="Not Applicable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 12;

	/**
	 * An array of all the '<em><b>Enum Requested State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumRequestedState[] VALUES_ARRAY =
		new EnumRequestedState[] {
			UNKNOWN,
			ENABLED,
			DISABLED,
			SHUT_DOWN,
			OFFLINE,
			TEST,
			DEFERRED,
			QUIESCE,
			REBOOT,
			RESET,
			NOT_APPLICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Requested State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumRequestedState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Requested State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumRequestedState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumRequestedState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Requested State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumRequestedState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumRequestedState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Requested State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumRequestedState get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case ENABLED_VALUE: return ENABLED;
			case DISABLED_VALUE: return DISABLED;
			case SHUT_DOWN_VALUE: return SHUT_DOWN;
			case OFFLINE_VALUE: return OFFLINE;
			case TEST_VALUE: return TEST;
			case DEFERRED_VALUE: return DEFERRED;
			case QUIESCE_VALUE: return QUIESCE;
			case REBOOT_VALUE: return REBOOT;
			case RESET_VALUE: return RESET;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
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
	private EnumRequestedState(int value, String name, String literal) {
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
	
} //EnumRequestedState
