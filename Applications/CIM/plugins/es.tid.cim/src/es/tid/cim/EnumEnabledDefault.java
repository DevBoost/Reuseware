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
 * A representation of the literals of the enumeration '<em><b>Enum Enabled Default</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumEnabledDefault()
 * @model
 * @generated
 */
public enum EnumEnabledDefault implements Enumerator {
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
	 * The '<em><b>No Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DEFAULT(7, "NoDefault", "No Default"),

	/**
	 * The '<em><b>Quiesce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIESCE_VALUE
	 * @generated
	 * @ordered
	 */
	QUIESCE(9, "Quiesce", "Quiesce");

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
	 * The '<em><b>No Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_DEFAULT
	 * @model name="NoDefault" literal="No Default"
	 * @generated
	 * @ordered
	 */
	public static final int NO_DEFAULT_VALUE = 7;

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
	 * An array of all the '<em><b>Enum Enabled Default</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumEnabledDefault[] VALUES_ARRAY =
		new EnumEnabledDefault[] {
			ENABLED,
			DISABLED,
			NOT_APPLICABLE,
			ENABLEDBUT_OFFLINE,
			NO_DEFAULT,
			QUIESCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Enabled Default</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumEnabledDefault> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Enabled Default</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledDefault get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumEnabledDefault result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Enabled Default</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledDefault getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumEnabledDefault result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Enabled Default</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumEnabledDefault get(int value) {
		switch (value) {
			case ENABLED_VALUE: return ENABLED;
			case DISABLED_VALUE: return DISABLED;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case ENABLEDBUT_OFFLINE_VALUE: return ENABLEDBUT_OFFLINE;
			case NO_DEFAULT_VALUE: return NO_DEFAULT;
			case QUIESCE_VALUE: return QUIESCE;
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
	private EnumEnabledDefault(int value, String name, String literal) {
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
	
} //EnumEnabledDefault
