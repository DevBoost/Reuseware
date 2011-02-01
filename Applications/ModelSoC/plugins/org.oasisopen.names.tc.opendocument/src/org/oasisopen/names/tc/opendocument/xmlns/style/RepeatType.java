/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repeat Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getRepeatType()
 * @model extendedMetaData="name='repeat_._type'"
 * @generated
 */
public enum RepeatType implements Enumerator {
	/**
	 * The '<em><b>No Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_REPEAT(0, "noRepeat", "no-repeat"),

	/**
	 * The '<em><b>Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(1, "repeat", "repeat"),

	/**
	 * The '<em><b>Stretch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRETCH_VALUE
	 * @generated
	 * @ordered
	 */
	STRETCH(2, "stretch", "stretch");

	/**
	 * The '<em><b>No Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Repeat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_REPEAT
	 * @model name="noRepeat" literal="no-repeat"
	 * @generated
	 * @ordered
	 */
	public static final int NO_REPEAT_VALUE = 0;

	/**
	 * The '<em><b>Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT
	 * @model name="repeat"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 1;

	/**
	 * The '<em><b>Stretch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stretch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRETCH
	 * @model name="stretch"
	 * @generated
	 * @ordered
	 */
	public static final int STRETCH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Repeat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RepeatType[] VALUES_ARRAY =
		new RepeatType[] {
			NO_REPEAT,
			REPEAT,
			STRETCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Repeat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RepeatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repeat Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepeatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepeatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repeat Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepeatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepeatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repeat Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepeatType get(int value) {
		switch (value) {
			case NO_REPEAT_VALUE: return NO_REPEAT;
			case REPEAT_VALUE: return REPEAT;
			case STRETCH_VALUE: return STRETCH;
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
	private RepeatType(int value, String name, String literal) {
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
	
} //RepeatType
