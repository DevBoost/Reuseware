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
 * A representation of the literals of the enumeration '<em><b>Presentation Effect Directions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPresentationEffectDirections()
 * @model extendedMetaData="name='presentationEffectDirections'"
 * @generated
 */
public enum PresentationEffectDirections implements Enumerator {
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
	 * The '<em><b>From Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_LEFT(1, "fromLeft", "from-left"),

	/**
	 * The '<em><b>From Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_TOP(2, "fromTop", "from-top"),

	/**
	 * The '<em><b>From Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_RIGHT(3, "fromRight", "from-right"),

	/**
	 * The '<em><b>From Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_BOTTOM(4, "fromBottom", "from-bottom"),

	/**
	 * The '<em><b>From Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_CENTER(5, "fromCenter", "from-center"),

	/**
	 * The '<em><b>From Upper Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_UPPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_UPPER_LEFT(6, "fromUpperLeft", "from-upper-left"),

	/**
	 * The '<em><b>From Upper Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_UPPER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_UPPER_RIGHT(7, "fromUpperRight", "from-upper-right"),

	/**
	 * The '<em><b>From Lower Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_LOWER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_LOWER_LEFT(8, "fromLowerLeft", "from-lower-left"),

	/**
	 * The '<em><b>From Lower Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_LOWER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_LOWER_RIGHT(9, "fromLowerRight", "from-lower-right"),

	/**
	 * The '<em><b>To Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_LEFT(10, "toLeft", "to-left"),

	/**
	 * The '<em><b>To Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TO_TOP(11, "toTop", "to-top"),

	/**
	 * The '<em><b>To Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_RIGHT(12, "toRight", "to-right"),

	/**
	 * The '<em><b>To Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BOTTOM(13, "toBottom", "to-bottom"),

	/**
	 * The '<em><b>To Upper Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_UPPER_LEFT(14, "toUpperLeft", "to-upper-left"),

	/**
	 * The '<em><b>To Upper Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_UPPER_RIGHT(15, "toUpperRight", "to-upper-right"),

	/**
	 * The '<em><b>To Lower Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_LOWER_RIGHT(16, "toLowerRight", "to-lower-right"),

	/**
	 * The '<em><b>To Lower Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_LOWER_LEFT(17, "toLowerLeft", "to-lower-left"),

	/**
	 * The '<em><b>Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PATH(18, "path", "path"),

	/**
	 * The '<em><b>Spiral Inward Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_INWARD_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_INWARD_LEFT(19, "spiralInwardLeft", "spiral-inward-left"),

	/**
	 * The '<em><b>Spiral Inward Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_INWARD_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_INWARD_RIGHT(20, "spiralInwardRight", "spiral-inward-right"),

	/**
	 * The '<em><b>Spiral Outward Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_OUTWARD_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_OUTWARD_LEFT(21, "spiralOutwardLeft", "spiral-outward-left"),

	/**
	 * The '<em><b>Spiral Outward Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_OUTWARD_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_OUTWARD_RIGHT(22, "spiralOutwardRight", "spiral-outward-right"),

	/**
	 * The '<em><b>Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL(23, "vertical", "vertical"),

	/**
	 * The '<em><b>Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL(24, "horizontal", "horizontal"),

	/**
	 * The '<em><b>To Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	TO_CENTER(25, "toCenter", "to-center"),

	/**
	 * The '<em><b>Clockwise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCKWISE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCKWISE(26, "clockwise", "clockwise"),

	/**
	 * The '<em><b>Counter Clockwise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTER_CLOCKWISE_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTER_CLOCKWISE(27, "counterClockwise", "counter-clockwise");

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
	 * The '<em><b>From Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_LEFT
	 * @model name="fromLeft" literal="from-left"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_LEFT_VALUE = 1;

	/**
	 * The '<em><b>From Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_TOP
	 * @model name="fromTop" literal="from-top"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_TOP_VALUE = 2;

	/**
	 * The '<em><b>From Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_RIGHT
	 * @model name="fromRight" literal="from-right"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_RIGHT_VALUE = 3;

	/**
	 * The '<em><b>From Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_BOTTOM
	 * @model name="fromBottom" literal="from-bottom"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_BOTTOM_VALUE = 4;

	/**
	 * The '<em><b>From Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_CENTER
	 * @model name="fromCenter" literal="from-center"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_CENTER_VALUE = 5;

	/**
	 * The '<em><b>From Upper Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Upper Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_UPPER_LEFT
	 * @model name="fromUpperLeft" literal="from-upper-left"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_UPPER_LEFT_VALUE = 6;

	/**
	 * The '<em><b>From Upper Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Upper Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_UPPER_RIGHT
	 * @model name="fromUpperRight" literal="from-upper-right"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_UPPER_RIGHT_VALUE = 7;

	/**
	 * The '<em><b>From Lower Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Lower Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_LOWER_LEFT
	 * @model name="fromLowerLeft" literal="from-lower-left"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_LOWER_LEFT_VALUE = 8;

	/**
	 * The '<em><b>From Lower Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Lower Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_LOWER_RIGHT
	 * @model name="fromLowerRight" literal="from-lower-right"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_LOWER_RIGHT_VALUE = 9;

	/**
	 * The '<em><b>To Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_LEFT
	 * @model name="toLeft" literal="to-left"
	 * @generated
	 * @ordered
	 */
	public static final int TO_LEFT_VALUE = 10;

	/**
	 * The '<em><b>To Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_TOP
	 * @model name="toTop" literal="to-top"
	 * @generated
	 * @ordered
	 */
	public static final int TO_TOP_VALUE = 11;

	/**
	 * The '<em><b>To Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_RIGHT
	 * @model name="toRight" literal="to-right"
	 * @generated
	 * @ordered
	 */
	public static final int TO_RIGHT_VALUE = 12;

	/**
	 * The '<em><b>To Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_BOTTOM
	 * @model name="toBottom" literal="to-bottom"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BOTTOM_VALUE = 13;

	/**
	 * The '<em><b>To Upper Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Upper Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_LEFT
	 * @model name="toUpperLeft" literal="to-upper-left"
	 * @generated
	 * @ordered
	 */
	public static final int TO_UPPER_LEFT_VALUE = 14;

	/**
	 * The '<em><b>To Upper Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Upper Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_RIGHT
	 * @model name="toUpperRight" literal="to-upper-right"
	 * @generated
	 * @ordered
	 */
	public static final int TO_UPPER_RIGHT_VALUE = 15;

	/**
	 * The '<em><b>To Lower Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Lower Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_RIGHT
	 * @model name="toLowerRight" literal="to-lower-right"
	 * @generated
	 * @ordered
	 */
	public static final int TO_LOWER_RIGHT_VALUE = 16;

	/**
	 * The '<em><b>To Lower Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Lower Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_LEFT
	 * @model name="toLowerLeft" literal="to-lower-left"
	 * @generated
	 * @ordered
	 */
	public static final int TO_LOWER_LEFT_VALUE = 17;

	/**
	 * The '<em><b>Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Path</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH
	 * @model name="path"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_VALUE = 18;

	/**
	 * The '<em><b>Spiral Inward Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spiral Inward Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_INWARD_LEFT
	 * @model name="spiralInwardLeft" literal="spiral-inward-left"
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_INWARD_LEFT_VALUE = 19;

	/**
	 * The '<em><b>Spiral Inward Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spiral Inward Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_INWARD_RIGHT
	 * @model name="spiralInwardRight" literal="spiral-inward-right"
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_INWARD_RIGHT_VALUE = 20;

	/**
	 * The '<em><b>Spiral Outward Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spiral Outward Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_OUTWARD_LEFT
	 * @model name="spiralOutwardLeft" literal="spiral-outward-left"
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_OUTWARD_LEFT_VALUE = 21;

	/**
	 * The '<em><b>Spiral Outward Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spiral Outward Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_OUTWARD_RIGHT
	 * @model name="spiralOutwardRight" literal="spiral-outward-right"
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_OUTWARD_RIGHT_VALUE = 22;

	/**
	 * The '<em><b>Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL
	 * @model name="vertical"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_VALUE = 23;

	/**
	 * The '<em><b>Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL
	 * @model name="horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_VALUE = 24;

	/**
	 * The '<em><b>To Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_CENTER
	 * @model name="toCenter" literal="to-center"
	 * @generated
	 * @ordered
	 */
	public static final int TO_CENTER_VALUE = 25;

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
	public static final int CLOCKWISE_VALUE = 26;

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
	public static final int COUNTER_CLOCKWISE_VALUE = 27;

	/**
	 * An array of all the '<em><b>Presentation Effect Directions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PresentationEffectDirections[] VALUES_ARRAY =
		new PresentationEffectDirections[] {
			NONE,
			FROM_LEFT,
			FROM_TOP,
			FROM_RIGHT,
			FROM_BOTTOM,
			FROM_CENTER,
			FROM_UPPER_LEFT,
			FROM_UPPER_RIGHT,
			FROM_LOWER_LEFT,
			FROM_LOWER_RIGHT,
			TO_LEFT,
			TO_TOP,
			TO_RIGHT,
			TO_BOTTOM,
			TO_UPPER_LEFT,
			TO_UPPER_RIGHT,
			TO_LOWER_RIGHT,
			TO_LOWER_LEFT,
			PATH,
			SPIRAL_INWARD_LEFT,
			SPIRAL_INWARD_RIGHT,
			SPIRAL_OUTWARD_LEFT,
			SPIRAL_OUTWARD_RIGHT,
			VERTICAL,
			HORIZONTAL,
			TO_CENTER,
			CLOCKWISE,
			COUNTER_CLOCKWISE,
		};

	/**
	 * A public read-only list of all the '<em><b>Presentation Effect Directions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PresentationEffectDirections> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Presentation Effect Directions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationEffectDirections get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationEffectDirections result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Effect Directions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationEffectDirections getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationEffectDirections result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Effect Directions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationEffectDirections get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case FROM_LEFT_VALUE: return FROM_LEFT;
			case FROM_TOP_VALUE: return FROM_TOP;
			case FROM_RIGHT_VALUE: return FROM_RIGHT;
			case FROM_BOTTOM_VALUE: return FROM_BOTTOM;
			case FROM_CENTER_VALUE: return FROM_CENTER;
			case FROM_UPPER_LEFT_VALUE: return FROM_UPPER_LEFT;
			case FROM_UPPER_RIGHT_VALUE: return FROM_UPPER_RIGHT;
			case FROM_LOWER_LEFT_VALUE: return FROM_LOWER_LEFT;
			case FROM_LOWER_RIGHT_VALUE: return FROM_LOWER_RIGHT;
			case TO_LEFT_VALUE: return TO_LEFT;
			case TO_TOP_VALUE: return TO_TOP;
			case TO_RIGHT_VALUE: return TO_RIGHT;
			case TO_BOTTOM_VALUE: return TO_BOTTOM;
			case TO_UPPER_LEFT_VALUE: return TO_UPPER_LEFT;
			case TO_UPPER_RIGHT_VALUE: return TO_UPPER_RIGHT;
			case TO_LOWER_RIGHT_VALUE: return TO_LOWER_RIGHT;
			case TO_LOWER_LEFT_VALUE: return TO_LOWER_LEFT;
			case PATH_VALUE: return PATH;
			case SPIRAL_INWARD_LEFT_VALUE: return SPIRAL_INWARD_LEFT;
			case SPIRAL_INWARD_RIGHT_VALUE: return SPIRAL_INWARD_RIGHT;
			case SPIRAL_OUTWARD_LEFT_VALUE: return SPIRAL_OUTWARD_LEFT;
			case SPIRAL_OUTWARD_RIGHT_VALUE: return SPIRAL_OUTWARD_RIGHT;
			case VERTICAL_VALUE: return VERTICAL;
			case HORIZONTAL_VALUE: return HORIZONTAL;
			case TO_CENTER_VALUE: return TO_CENTER;
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
	private PresentationEffectDirections(int value, String name, String literal) {
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
	
} //PresentationEffectDirections
