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
 * A representation of the literals of the enumeration '<em><b>Enum Enabled State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumEnabledState()
 * @model
 * @generated
 */
public enum EnumEnabledState implements Enumerator {
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
	 * The '<em><b>Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(3, "Disabled", "Disabled"),

	/**
	 * The '<em><b>Shutting Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTING_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTING_DOWN(4, "ShuttingDown", "Shutting Down"),

	/**
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(5, "NotApplicable", "Not Applicable"),

	/**
	 * The '<em><b>Enabledbut Offline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLEDBUT_OFFLINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLEDBUT_OFFLINE(6, "EnabledbutOffline", "Enabled but Offline"),

	/**
	 * The '<em><b>In Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	IN_TEST(7, "InTest", "In Test"),

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
	 * The '<em><b>Starting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	STARTING(10, "Starting", "Starting");

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
	 * The '<em><b>Shutting Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shutting Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUTTING_DOWN
	 * @model name="ShuttingDown" literal="Shutting Down"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTING_DOWN_VALUE = 4;

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
	public static final int NOT_APPLICABLE_VALUE = 5;

	/**
	 * The '<em><b>Enabledbut Offline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enabledbut Offline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLEDBUT_OFFLINE
	 * @model name="EnabledbutOffline" literal="Enabled but Offline"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLEDBUT_OFFLINE_VALUE = 6;

	/**
	 * The '<em><b>In Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_TEST
	 * @model name="InTest" literal="In Test"
	 * @generated
	 * @ordered
	 */
	public static final int IN_TEST_VALUE = 7;

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
	 * The '<em><b>Starting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Starting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTING
	 * @model name="Starting"
	 * @generated
	 * @ordered
	 */
	public static final int STARTING_VALUE = 10;

	/**
	 * An array of all the '<em><b>Enum Enabled State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumEnabledState[] VALUES_ARRAY =
		new EnumEnabledState[] {
			ENABLED,
			UNKNOWN,
			OTHER,
			DISABLED,
			SHUTTING_DOWN,
			NOT_APPLICABLE,
			ENABLEDBUT_OFFLINE,
			IN_TEST,
			DEFERRED,
			QUIESCE,
			STARTING,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Enabled State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumEnabledState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Enabled State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumEnabledState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Enabled State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumEnabledState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Enabled State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledState get(int value) {
		switch (value) {
			case ENABLED_VALUE: return ENABLED;
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case DISABLED_VALUE: return DISABLED;
			case SHUTTING_DOWN_VALUE: return SHUTTING_DOWN;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case ENABLEDBUT_OFFLINE_VALUE: return ENABLEDBUT_OFFLINE;
			case IN_TEST_VALUE: return IN_TEST;
			case DEFERRED_VALUE: return DEFERRED;
			case QUIESCE_VALUE: return QUIESCE;
			case STARTING_VALUE: return STARTING;
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
	private EnumEnabledState(int value, String name, String literal) {
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
	
} //EnumEnabledState
