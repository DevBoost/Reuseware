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
 * A representation of the literals of the enumeration '<em><b>Wrap Influence On Position Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getWrapInfluenceOnPositionType()
 * @model extendedMetaData="name='wrap-influence-on-position_._type'"
 * @generated
 */
public enum WrapInfluenceOnPositionType implements Enumerator {
	/**
	 * The '<em><b>Iterative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ITERATIVE(0, "iterative", "iterative"),

	/**
	 * The '<em><b>Once Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE_CONCURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	ONCE_CONCURRENT(1, "onceConcurrent", "once-concurrent"),

	/**
	 * The '<em><b>Once Successive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE_SUCCESSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ONCE_SUCCESSIVE(2, "onceSuccessive", "once-successive");

	/**
	 * The '<em><b>Iterative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iterative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITERATIVE
	 * @model name="iterative"
	 * @generated
	 * @ordered
	 */
	public static final int ITERATIVE_VALUE = 0;

	/**
	 * The '<em><b>Once Concurrent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Once Concurrent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCE_CONCURRENT
	 * @model name="onceConcurrent" literal="once-concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int ONCE_CONCURRENT_VALUE = 1;

	/**
	 * The '<em><b>Once Successive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Once Successive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCE_SUCCESSIVE
	 * @model name="onceSuccessive" literal="once-successive"
	 * @generated
	 * @ordered
	 */
	public static final int ONCE_SUCCESSIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Wrap Influence On Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WrapInfluenceOnPositionType[] VALUES_ARRAY =
		new WrapInfluenceOnPositionType[] {
			ITERATIVE,
			ONCE_CONCURRENT,
			ONCE_SUCCESSIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Wrap Influence On Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WrapInfluenceOnPositionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wrap Influence On Position Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapInfluenceOnPositionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WrapInfluenceOnPositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wrap Influence On Position Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapInfluenceOnPositionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WrapInfluenceOnPositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wrap Influence On Position Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapInfluenceOnPositionType get(int value) {
		switch (value) {
			case ITERATIVE_VALUE: return ITERATIVE;
			case ONCE_CONCURRENT_VALUE: return ONCE_CONCURRENT;
			case ONCE_SUCCESSIVE_VALUE: return ONCE_SUCCESSIVE;
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
	private WrapInfluenceOnPositionType(int value, String name, String literal) {
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
	
} //WrapInfluenceOnPositionType
