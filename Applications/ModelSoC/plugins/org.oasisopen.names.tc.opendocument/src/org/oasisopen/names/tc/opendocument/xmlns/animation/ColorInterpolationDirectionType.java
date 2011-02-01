/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Interpolation Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getColorInterpolationDirectionType()
 * @model extendedMetaData="name='color-interpolation-direction_._type'"
 * @generated
 */
public enum ColorInterpolationDirectionType implements Enumerator {
	/**
	 * The '<em><b>Clockwise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCKWISE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCKWISE(0, "clockwise", "clockwise"),

	/**
	 * The '<em><b>Counter Clockwise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTER_CLOCKWISE_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTER_CLOCKWISE(1, "counterClockwise", "counter-clockwise");

	/**
	 * The '<em><b>Clockwise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clockwise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOCKWISE
	 * @model name="clockwise"
	 * @generated
	 * @ordered
	 */
	public static final int CLOCKWISE_VALUE = 0;

	/**
	 * The '<em><b>Counter Clockwise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Counter Clockwise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTER_CLOCKWISE
	 * @model name="counterClockwise" literal="counter-clockwise"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTER_CLOCKWISE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Color Interpolation Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorInterpolationDirectionType[] VALUES_ARRAY =
		new ColorInterpolationDirectionType[] {
			CLOCKWISE,
			COUNTER_CLOCKWISE,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Interpolation Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorInterpolationDirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Interpolation Direction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorInterpolationDirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorInterpolationDirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Interpolation Direction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorInterpolationDirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorInterpolationDirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Interpolation Direction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorInterpolationDirectionType get(int value) {
		switch (value) {
			case CLOCKWISE_VALUE: return CLOCKWISE;
			case COUNTER_CLOCKWISE_VALUE: return COUNTER_CLOCKWISE;
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
	private ColorInterpolationDirectionType(int value, String name, String literal) {
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
	
} //ColorInterpolationDirectionType
