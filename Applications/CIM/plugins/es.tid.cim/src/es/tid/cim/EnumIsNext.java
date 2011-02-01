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
 * A representation of the literals of the enumeration '<em><b>Enum Is Next</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumIsNext()
 * @model
 * @generated
 */
public enum EnumIsNext implements Enumerator {
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
	 * The '<em><b>Is Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NEXT(1, "IsNext", "Is Next"),

	/**
	 * The '<em><b>Is Not Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOT_NEXT(2, "IsNotNext", "Is Not Next"),

	/**
	 * The '<em><b>Is Next For Single Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NEXT_FOR_SINGLE_USE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NEXT_FOR_SINGLE_USE(3, "IsNextForSingleUse", "Is Next For Single Use");

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
	 * The '<em><b>Is Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Next</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NEXT
	 * @model name="IsNext" literal="Is Next"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NEXT_VALUE = 1;

	/**
	 * The '<em><b>Is Not Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Not Next</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_NEXT
	 * @model name="IsNotNext" literal="Is Not Next"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOT_NEXT_VALUE = 2;

	/**
	 * The '<em><b>Is Next For Single Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Next For Single Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NEXT_FOR_SINGLE_USE
	 * @model name="IsNextForSingleUse" literal="Is Next For Single Use"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NEXT_FOR_SINGLE_USE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Is Next</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumIsNext[] VALUES_ARRAY =
		new EnumIsNext[] {
			UNKNOWN,
			IS_NEXT,
			IS_NOT_NEXT,
			IS_NEXT_FOR_SINGLE_USE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Is Next</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumIsNext> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Is Next</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsNext get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIsNext result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Is Next</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsNext getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIsNext result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Is Next</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIsNext get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case IS_NEXT_VALUE: return IS_NEXT;
			case IS_NOT_NEXT_VALUE: return IS_NOT_NEXT;
			case IS_NEXT_FOR_SINGLE_USE_VALUE: return IS_NEXT_FOR_SINGLE_USE;
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
	private EnumIsNext(int value, String name, String literal) {
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
	
} //EnumIsNext
