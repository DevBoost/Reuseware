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
 * A representation of the literals of the enumeration '<em><b>Enum Is Maximum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumIsMaximum()
 * @model
 * @generated
 */
public enum EnumIsMaximum implements Enumerator {
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
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(1, "NotApplicable", "Not Applicable"),

	/**
	 * The '<em><b>Is Maximum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MAXIMUM(2, "IsMaximum", "Is Maximum"),

	/**
	 * The '<em><b>Is Not Maximum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOT_MAXIMUM(3, "IsNotMaximum", "Is Not Maximum");

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
	public static final int NOT_APPLICABLE_VALUE = 1;

	/**
	 * The '<em><b>Is Maximum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Maximum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_MAXIMUM
	 * @model name="IsMaximum" literal="Is Maximum"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MAXIMUM_VALUE = 2;

	/**
	 * The '<em><b>Is Not Maximum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Not Maximum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_MAXIMUM
	 * @model name="IsNotMaximum" literal="Is Not Maximum"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOT_MAXIMUM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Is Maximum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumIsMaximum[] VALUES_ARRAY =
		new EnumIsMaximum[] {
			UNKNOWN,
			NOT_APPLICABLE,
			IS_MAXIMUM,
			IS_NOT_MAXIMUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Is Maximum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumIsMaximum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Is Maximum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsMaximum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIsMaximum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Is Maximum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsMaximum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIsMaximum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Is Maximum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsMaximum get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case IS_MAXIMUM_VALUE: return IS_MAXIMUM;
			case IS_NOT_MAXIMUM_VALUE: return IS_NOT_MAXIMUM;
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
	private EnumIsMaximum(int value, String name, String literal) {
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
	
} //EnumIsMaximum
