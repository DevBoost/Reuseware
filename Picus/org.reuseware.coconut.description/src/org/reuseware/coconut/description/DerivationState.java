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
package org.reuseware.coconut.description;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.description.DescriptionPackage#getDerivationState()
 * @model
 * @generated
 */
public enum DerivationState implements Enumerator {
	/**
	 * The '<em><b>REFRESH ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_ALL(1, "REFRESH_ALL", "REFRESH_ALL"),

	/**
	 * The '<em><b>REFRESH DIRECT FACETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_DIRECT_FACETS_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_DIRECT_FACETS(2, "REFRESH_DIRECT_FACETS", "REFRESH_DIRECT_FACETS"),

	/**
	 * The '<em><b>REFRESH LANG INDE FACETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_LANG_INDE_FACETS_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_LANG_INDE_FACETS(4, "REFRESH_LANG_INDE_FACETS", "REFRESH_LANG_INDE_FACETS"), /**
	 * The '<em><b>REFRESH MAPPING FACETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_MAPPING_FACETS_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_MAPPING_FACETS(8, "REFRESH_MAPPING_FACETS", "REFRESH_MAPPING_FACETS"), /**
	 * The '<em><b>UP TO DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_TO_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	UP_TO_DATE(16, "UP_TO_DATE", "UP_TO_DATE");

	/**
	 * The '<em><b>REFRESH ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_ALL_VALUE = 1;

	/**
	 * The '<em><b>REFRESH DIRECT FACETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH DIRECT FACETS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_DIRECT_FACETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_DIRECT_FACETS_VALUE = 2;

	/**
	 * The '<em><b>REFRESH LANG INDE FACETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH LANG INDE FACETS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_LANG_INDE_FACETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_LANG_INDE_FACETS_VALUE = 4;

	/**
	 * The '<em><b>REFRESH MAPPING FACETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH MAPPING FACETS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_MAPPING_FACETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_MAPPING_FACETS_VALUE = 8;

	/**
	 * The '<em><b>UP TO DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UP TO DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP_TO_DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP_TO_DATE_VALUE = 16;

	/**
	 * An array of all the '<em><b>Derivation State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DerivationState[] VALUES_ARRAY =
		new DerivationState[] {
			REFRESH_ALL,
			REFRESH_DIRECT_FACETS,
			REFRESH_LANG_INDE_FACETS,
			REFRESH_MAPPING_FACETS,
			UP_TO_DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Derivation State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DerivationState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationState get(int value) {
		switch (value) {
			case REFRESH_ALL_VALUE: return REFRESH_ALL;
			case REFRESH_DIRECT_FACETS_VALUE: return REFRESH_DIRECT_FACETS;
			case REFRESH_LANG_INDE_FACETS_VALUE: return REFRESH_LANG_INDE_FACETS;
			case REFRESH_MAPPING_FACETS_VALUE: return REFRESH_MAPPING_FACETS;
			case UP_TO_DATE_VALUE: return UP_TO_DATE;
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
	private DerivationState(int value, String name, String literal) {
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
	
} //DerivationState
