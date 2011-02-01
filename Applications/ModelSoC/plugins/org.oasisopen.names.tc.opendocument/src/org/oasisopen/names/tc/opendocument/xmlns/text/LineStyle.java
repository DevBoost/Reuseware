/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Line Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLineStyle()
 * @model extendedMetaData="name='lineStyle'"
 * @generated
 */
public enum LineStyle implements Enumerator {
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
	 * The '<em><b>Solid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	SOLID(1, "solid", "solid"),

	/**
	 * The '<em><b>Dotted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTTED_VALUE
	 * @generated
	 * @ordered
	 */
	DOTTED(2, "dotted", "dotted"),

	/**
	 * The '<em><b>Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH_VALUE
	 * @generated
	 * @ordered
	 */
	DASH(3, "dash", "dash"),

	/**
	 * The '<em><b>Long Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_DASH_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_DASH(4, "longDash", "long-dash"),

	/**
	 * The '<em><b>Dot Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_DASH_VALUE
	 * @generated
	 * @ordered
	 */
	DOT_DASH(5, "dotDash", "dot-dash"),

	/**
	 * The '<em><b>Dot Dot Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_DOT_DASH_VALUE
	 * @generated
	 * @ordered
	 */
	DOT_DOT_DASH(6, "dotDotDash", "dot-dot-dash"),

	/**
	 * The '<em><b>Wave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE(7, "wave", "wave");

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
	 * The '<em><b>Solid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @model name="solid"
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_VALUE = 1;

	/**
	 * The '<em><b>Dotted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dotted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOTTED
	 * @model name="dotted"
	 * @generated
	 * @ordered
	 */
	public static final int DOTTED_VALUE = 2;

	/**
	 * The '<em><b>Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASH
	 * @model name="dash"
	 * @generated
	 * @ordered
	 */
	public static final int DASH_VALUE = 3;

	/**
	 * The '<em><b>Long Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long Dash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_DASH
	 * @model name="longDash" literal="long-dash"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_DASH_VALUE = 4;

	/**
	 * The '<em><b>Dot Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot Dash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_DASH
	 * @model name="dotDash" literal="dot-dash"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_DASH_VALUE = 5;

	/**
	 * The '<em><b>Dot Dot Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot Dot Dash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_DOT_DASH
	 * @model name="dotDotDash" literal="dot-dot-dash"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_DOT_DASH_VALUE = 6;

	/**
	 * The '<em><b>Wave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVE
	 * @model name="wave"
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Line Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LineStyle[] VALUES_ARRAY =
		new LineStyle[] {
			NONE,
			SOLID,
			DOTTED,
			DASH,
			LONG_DASH,
			DOT_DASH,
			DOT_DOT_DASH,
			WAVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Line Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LineStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineStyle get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SOLID_VALUE: return SOLID;
			case DOTTED_VALUE: return DOTTED;
			case DASH_VALUE: return DASH;
			case LONG_DASH_VALUE: return LONG_DASH;
			case DOT_DASH_VALUE: return DOT_DASH;
			case DOT_DOT_DASH_VALUE: return DOT_DOT_DASH;
			case WAVE_VALUE: return WAVE;
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
	private LineStyle(int value, String name, String literal) {
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
	
} //LineStyle
