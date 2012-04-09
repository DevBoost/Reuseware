/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
 * A representation of the literals of the enumeration '<em><b>Gradient Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getGradientStyle()
 * @model extendedMetaData="name='gradient-style'"
 * @generated
 */
public enum GradientStyle implements Enumerator {
	/**
	 * The '<em><b>Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(0, "linear", "linear"),

	/**
	 * The '<em><b>Axial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AXIAL_VALUE
	 * @generated
	 * @ordered
	 */
	AXIAL(1, "axial", "axial"),

	/**
	 * The '<em><b>Radial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RADIAL(2, "radial", "radial"),

	/**
	 * The '<em><b>Ellipsoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSOID_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSOID(3, "ellipsoid", "ellipsoid"),

	/**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(4, "square", "square"),

	/**
	 * The '<em><b>Rectangular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	RECTANGULAR(5, "rectangular", "rectangular");

	/**
	 * The '<em><b>Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model name="linear"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 0;

	/**
	 * The '<em><b>Axial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Axial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AXIAL
	 * @model name="axial"
	 * @generated
	 * @ordered
	 */
	public static final int AXIAL_VALUE = 1;

	/**
	 * The '<em><b>Radial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIAL
	 * @model name="radial"
	 * @generated
	 * @ordered
	 */
	public static final int RADIAL_VALUE = 2;

	/**
	 * The '<em><b>Ellipsoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ellipsoid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELLIPSOID
	 * @model name="ellipsoid"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSOID_VALUE = 3;

	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model name="square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 4;

	/**
	 * The '<em><b>Rectangular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rectangular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTANGULAR
	 * @model name="rectangular"
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGULAR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Gradient Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GradientStyle[] VALUES_ARRAY =
		new GradientStyle[] {
			LINEAR,
			AXIAL,
			RADIAL,
			ELLIPSOID,
			SQUARE,
			RECTANGULAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Gradient Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GradientStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gradient Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GradientStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GradientStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gradient Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GradientStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GradientStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gradient Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GradientStyle get(int value) {
		switch (value) {
			case LINEAR_VALUE: return LINEAR;
			case AXIAL_VALUE: return AXIAL;
			case RADIAL_VALUE: return RADIAL;
			case ELLIPSOID_VALUE: return ELLIPSOID;
			case SQUARE_VALUE: return SQUARE;
			case RECTANGULAR_VALUE: return RECTANGULAR;
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
	private GradientStyle(int value, String name, String literal) {
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
	
} //GradientStyle
