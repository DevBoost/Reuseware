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
 * A representation of the literals of the enumeration '<em><b>Measure Align Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getMeasureAlignType()
 * @model extendedMetaData="name='measure-align_._type'"
 * @generated
 */
public enum MeasureAlignType implements Enumerator {
	/**
	 * The '<em><b>Automatic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC(0, "automatic", "automatic"),

	/**
	 * The '<em><b>Left Outside</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_OUTSIDE(1, "leftOutside", "left-outside"),

	/**
	 * The '<em><b>Inside</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE(2, "inside", "inside"),

	/**
	 * The '<em><b>Right Outside</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_OUTSIDE(3, "rightOutside", "right-outside");

	/**
	 * The '<em><b>Automatic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC
	 * @model name="automatic"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_VALUE = 0;

	/**
	 * The '<em><b>Left Outside</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Outside</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTSIDE
	 * @model name="leftOutside" literal="left-outside"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_OUTSIDE_VALUE = 1;

	/**
	 * The '<em><b>Inside</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inside</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSIDE
	 * @model name="inside"
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_VALUE = 2;

	/**
	 * The '<em><b>Right Outside</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Outside</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTSIDE
	 * @model name="rightOutside" literal="right-outside"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_OUTSIDE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Measure Align Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasureAlignType[] VALUES_ARRAY =
		new MeasureAlignType[] {
			AUTOMATIC,
			LEFT_OUTSIDE,
			INSIDE,
			RIGHT_OUTSIDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Align Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasureAlignType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Align Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasureAlignType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureAlignType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Align Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasureAlignType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureAlignType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Align Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasureAlignType get(int value) {
		switch (value) {
			case AUTOMATIC_VALUE: return AUTOMATIC;
			case LEFT_OUTSIDE_VALUE: return LEFT_OUTSIDE;
			case INSIDE_VALUE: return INSIDE;
			case RIGHT_OUTSIDE_VALUE: return RIGHT_OUTSIDE;
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
	private MeasureAlignType(int value, String name, String literal) {
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
	
} //MeasureAlignType
