/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stroke Linejoin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getStrokeLinejoinType()
 * @model extendedMetaData="name='stroke-linejoin_._type'"
 * @generated
 */
public enum StrokeLinejoinType implements Enumerator {
	/**
	 * The '<em><b>Miter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITER_VALUE
	 * @generated
	 * @ordered
	 */
	MITER(0, "miter", "miter"),

	/**
	 * The '<em><b>Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND(1, "round", "round"),

	/**
	 * The '<em><b>Bevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	BEVEL(2, "bevel", "bevel"),

	/**
	 * The '<em><b>Middle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE(3, "middle", "middle"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "none", "none"),

	/**
	 * The '<em><b>Inherit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(5, "inherit", "inherit");

	/**
	 * The '<em><b>Miter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MITER
	 * @model name="miter"
	 * @generated
	 * @ordered
	 */
	public static final int MITER_VALUE = 0;

	/**
	 * The '<em><b>Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND
	 * @model name="round"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_VALUE = 1;

	/**
	 * The '<em><b>Bevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bevel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEVEL
	 * @model name="bevel"
	 * @generated
	 * @ordered
	 */
	public static final int BEVEL_VALUE = 2;

	/**
	 * The '<em><b>Middle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Middle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @model name="middle"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_VALUE = 3;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * The '<em><b>Inherit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inherit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT
	 * @model name="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Stroke Linejoin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StrokeLinejoinType[] VALUES_ARRAY =
		new StrokeLinejoinType[] {
			MITER,
			ROUND,
			BEVEL,
			MIDDLE,
			NONE,
			INHERIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Stroke Linejoin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StrokeLinejoinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stroke Linejoin Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrokeLinejoinType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrokeLinejoinType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stroke Linejoin Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrokeLinejoinType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrokeLinejoinType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stroke Linejoin Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrokeLinejoinType get(int value) {
		switch (value) {
			case MITER_VALUE: return MITER;
			case ROUND_VALUE: return ROUND;
			case BEVEL_VALUE: return BEVEL;
			case MIDDLE_VALUE: return MIDDLE;
			case NONE_VALUE: return NONE;
			case INHERIT_VALUE: return INHERIT;
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
	private StrokeLinejoinType(int value, String name, String literal) {
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
	
} //StrokeLinejoinType
