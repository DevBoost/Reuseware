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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layout Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLayoutModeType()
 * @model extendedMetaData="name='layout-mode_._type'"
 * @generated
 */
public enum LayoutModeType implements Enumerator {
	/**
	 * The '<em><b>Tabular Layout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR_LAYOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TABULAR_LAYOUT(0, "tabularLayout", "tabular-layout"),

	/**
	 * The '<em><b>Outline Subtotals Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_SUBTOTALS_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	OUTLINE_SUBTOTALS_TOP(1, "outlineSubtotalsTop", "outline-subtotals-top"),

	/**
	 * The '<em><b>Outline Subtotals Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_SUBTOTALS_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	OUTLINE_SUBTOTALS_BOTTOM(2, "outlineSubtotalsBottom", "outline-subtotals-bottom");

	/**
	 * The '<em><b>Tabular Layout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tabular Layout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABULAR_LAYOUT
	 * @model name="tabularLayout" literal="tabular-layout"
	 * @generated
	 * @ordered
	 */
	public static final int TABULAR_LAYOUT_VALUE = 0;

	/**
	 * The '<em><b>Outline Subtotals Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outline Subtotals Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_SUBTOTALS_TOP
	 * @model name="outlineSubtotalsTop" literal="outline-subtotals-top"
	 * @generated
	 * @ordered
	 */
	public static final int OUTLINE_SUBTOTALS_TOP_VALUE = 1;

	/**
	 * The '<em><b>Outline Subtotals Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outline Subtotals Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_SUBTOTALS_BOTTOM
	 * @model name="outlineSubtotalsBottom" literal="outline-subtotals-bottom"
	 * @generated
	 * @ordered
	 */
	public static final int OUTLINE_SUBTOTALS_BOTTOM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Layout Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LayoutModeType[] VALUES_ARRAY =
		new LayoutModeType[] {
			TABULAR_LAYOUT,
			OUTLINE_SUBTOTALS_TOP,
			OUTLINE_SUBTOTALS_BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Layout Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LayoutModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layout Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutModeType get(int value) {
		switch (value) {
			case TABULAR_LAYOUT_VALUE: return TABULAR_LAYOUT;
			case OUTLINE_SUBTOTALS_TOP_VALUE: return OUTLINE_SUBTOTALS_TOP;
			case OUTLINE_SUBTOTALS_BOTTOM_VALUE: return OUTLINE_SUBTOTALS_BOTTOM;
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
	private LayoutModeType(int value, String name, String literal) {
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
	
} //LayoutModeType
