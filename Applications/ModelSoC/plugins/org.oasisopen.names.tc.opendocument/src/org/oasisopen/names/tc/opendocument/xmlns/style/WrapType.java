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
 * A representation of the literals of the enumeration '<em><b>Wrap Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getWrapType()
 * @model extendedMetaData="name='wrap_._type'"
 * @generated
 */
public enum WrapType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(1, "left", "left"),

	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(2, "right", "right"),

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(3, "parallel", "parallel"),

	/**
	 * The '<em><b>Dynamic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC(4, "dynamic", "dynamic"),

	/**
	 * The '<em><b>Run Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	RUN_THROUGH(5, "runThrough", "run-through"),

	/**
	 * The '<em><b>Biggest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGGEST_VALUE
	 * @generated
	 * @ordered
	 */
	BIGGEST(6, "biggest", "biggest");

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
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model name="left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 1;

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model name="right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 3;

	/**
	 * The '<em><b>Dynamic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC
	 * @model name="dynamic"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_VALUE = 4;

	/**
	 * The '<em><b>Run Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Run Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUN_THROUGH
	 * @model name="runThrough" literal="run-through"
	 * @generated
	 * @ordered
	 */
	public static final int RUN_THROUGH_VALUE = 5;

	/**
	 * The '<em><b>Biggest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biggest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGGEST
	 * @model name="biggest"
	 * @generated
	 * @ordered
	 */
	public static final int BIGGEST_VALUE = 6;

	/**
	 * An array of all the '<em><b>Wrap Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WrapType[] VALUES_ARRAY =
		new WrapType[] {
			NONE,
			LEFT,
			RIGHT,
			PARALLEL,
			DYNAMIC,
			RUN_THROUGH,
			BIGGEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Wrap Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WrapType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wrap Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WrapType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wrap Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WrapType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wrap Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LEFT_VALUE: return LEFT;
			case RIGHT_VALUE: return RIGHT;
			case PARALLEL_VALUE: return PARALLEL;
			case DYNAMIC_VALUE: return DYNAMIC;
			case RUN_THROUGH_VALUE: return RUN_THROUGH;
			case BIGGEST_VALUE: return BIGGEST;
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
	private WrapType(int value, String name, String literal) {
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
	
} //WrapType
