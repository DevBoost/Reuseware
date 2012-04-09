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
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Writing Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getWritingModeType()
 * @model extendedMetaData="name='writing-mode_._type'"
 * @generated
 */
public enum WritingModeType implements Enumerator {
	/**
	 * The '<em><b>Lr Tb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_TB_VALUE
	 * @generated
	 * @ordered
	 */
	LR_TB(0, "lrTb", "lr-tb"),

	/**
	 * The '<em><b>Rl Tb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RL_TB_VALUE
	 * @generated
	 * @ordered
	 */
	RL_TB(1, "rlTb", "rl-tb"),

	/**
	 * The '<em><b>Tb Rl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TB_RL_VALUE
	 * @generated
	 * @ordered
	 */
	TB_RL(2, "tbRl", "tb-rl"),

	/**
	 * The '<em><b>Tb Lr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TB_LR_VALUE
	 * @generated
	 * @ordered
	 */
	TB_LR(3, "tbLr", "tb-lr"),

	/**
	 * The '<em><b>Lr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_VALUE
	 * @generated
	 * @ordered
	 */
	LR(4, "lr", "lr"),

	/**
	 * The '<em><b>Rl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RL_VALUE
	 * @generated
	 * @ordered
	 */
	RL(5, "rl", "rl"),

	/**
	 * The '<em><b>Tb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TB_VALUE
	 * @generated
	 * @ordered
	 */
	TB(6, "tb", "tb"),

	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(7, "page", "page");

	/**
	 * The '<em><b>Lr Tb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lr Tb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LR_TB
	 * @model name="lrTb" literal="lr-tb"
	 * @generated
	 * @ordered
	 */
	public static final int LR_TB_VALUE = 0;

	/**
	 * The '<em><b>Rl Tb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rl Tb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RL_TB
	 * @model name="rlTb" literal="rl-tb"
	 * @generated
	 * @ordered
	 */
	public static final int RL_TB_VALUE = 1;

	/**
	 * The '<em><b>Tb Rl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tb Rl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TB_RL
	 * @model name="tbRl" literal="tb-rl"
	 * @generated
	 * @ordered
	 */
	public static final int TB_RL_VALUE = 2;

	/**
	 * The '<em><b>Tb Lr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tb Lr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TB_LR
	 * @model name="tbLr" literal="tb-lr"
	 * @generated
	 * @ordered
	 */
	public static final int TB_LR_VALUE = 3;

	/**
	 * The '<em><b>Lr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LR
	 * @model name="lr"
	 * @generated
	 * @ordered
	 */
	public static final int LR_VALUE = 4;

	/**
	 * The '<em><b>Rl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RL
	 * @model name="rl"
	 * @generated
	 * @ordered
	 */
	public static final int RL_VALUE = 5;

	/**
	 * The '<em><b>Tb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TB
	 * @model name="tb"
	 * @generated
	 * @ordered
	 */
	public static final int TB_VALUE = 6;

	/**
	 * The '<em><b>Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE
	 * @model name="page"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Writing Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WritingModeType[] VALUES_ARRAY =
		new WritingModeType[] {
			LR_TB,
			RL_TB,
			TB_RL,
			TB_LR,
			LR,
			RL,
			TB,
			PAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Writing Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WritingModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Writing Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritingModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WritingModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Writing Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritingModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WritingModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Writing Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritingModeType get(int value) {
		switch (value) {
			case LR_TB_VALUE: return LR_TB;
			case RL_TB_VALUE: return RL_TB;
			case TB_RL_VALUE: return TB_RL;
			case TB_LR_VALUE: return TB_LR;
			case LR_VALUE: return LR;
			case RL_VALUE: return RL;
			case TB_VALUE: return TB;
			case PAGE_VALUE: return PAGE;
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
	private WritingModeType(int value, String name, String literal) {
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
	
} //WritingModeType
