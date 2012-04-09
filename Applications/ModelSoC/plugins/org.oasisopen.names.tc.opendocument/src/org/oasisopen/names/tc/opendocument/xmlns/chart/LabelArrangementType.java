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
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label Arrangement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLabelArrangementType()
 * @model extendedMetaData="name='label-arrangement_._type'"
 * @generated
 */
public enum LabelArrangementType implements Enumerator {
	/**
	 * The '<em><b>Side By Side</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDE_BY_SIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SIDE_BY_SIDE(0, "sideBySide", "side-by-side"),

	/**
	 * The '<em><b>Stagger Even</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAGGER_EVEN_VALUE
	 * @generated
	 * @ordered
	 */
	STAGGER_EVEN(1, "staggerEven", "stagger-even"),

	/**
	 * The '<em><b>Stagger Odd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAGGER_ODD_VALUE
	 * @generated
	 * @ordered
	 */
	STAGGER_ODD(2, "staggerOdd", "stagger-odd");

	/**
	 * The '<em><b>Side By Side</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Side By Side</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIDE_BY_SIDE
	 * @model name="sideBySide" literal="side-by-side"
	 * @generated
	 * @ordered
	 */
	public static final int SIDE_BY_SIDE_VALUE = 0;

	/**
	 * The '<em><b>Stagger Even</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stagger Even</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAGGER_EVEN
	 * @model name="staggerEven" literal="stagger-even"
	 * @generated
	 * @ordered
	 */
	public static final int STAGGER_EVEN_VALUE = 1;

	/**
	 * The '<em><b>Stagger Odd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stagger Odd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAGGER_ODD
	 * @model name="staggerOdd" literal="stagger-odd"
	 * @generated
	 * @ordered
	 */
	public static final int STAGGER_ODD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Label Arrangement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelArrangementType[] VALUES_ARRAY =
		new LabelArrangementType[] {
			SIDE_BY_SIDE,
			STAGGER_EVEN,
			STAGGER_ODD,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Arrangement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LabelArrangementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Arrangement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelArrangementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelArrangementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Arrangement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelArrangementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelArrangementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Arrangement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelArrangementType get(int value) {
		switch (value) {
			case SIDE_BY_SIDE_VALUE: return SIDE_BY_SIDE;
			case STAGGER_EVEN_VALUE: return STAGGER_EVEN;
			case STAGGER_ODD_VALUE: return STAGGER_ODD;
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
	private LabelArrangementType(int value, String name, String literal) {
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
	
} //LabelArrangementType
