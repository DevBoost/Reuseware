/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
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
 * A representation of the literals of the enumeration '<em><b>GUI State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.description.DescriptionPackage#getGUIState()
 * @model
 * @generated
 */
public enum GUIState implements Enumerator {
	/**
	 * The '<em><b>REFRESH ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_ALL(0, "REFRESH_ALL", "REFRESH_ALL"),

	/**
	 * The '<em><b>REFRESH VALUE COUNTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_VALUE_COUNTS_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH_VALUE_COUNTS(0, "REFRESH_VALUE_COUNTS", "REFRESH_VALUE_COUNTS"),

	/**
	 * The '<em><b>UP TO DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_TO_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	UP_TO_DATE(0, "UP_TO_DATE", "UP_TO_DATE");

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
	public static final int REFRESH_ALL_VALUE = 0;

	/**
	 * The '<em><b>REFRESH VALUE COUNTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH VALUE COUNTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_VALUE_COUNTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_VALUE_COUNTS_VALUE = 0;

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
	public static final int UP_TO_DATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>GUI State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GUIState[] VALUES_ARRAY =
		new GUIState[] {
			REFRESH_ALL,
			REFRESH_VALUE_COUNTS,
			UP_TO_DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>GUI State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GUIState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GUI State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GUIState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GUIState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GUI State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GUIState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GUIState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GUI State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GUIState get(int value) {
		switch (value) {
			case REFRESH_ALL_VALUE: return REFRESH_ALL;
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
	private GUIState(int value, String name, String literal) {
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
	
} //GUIState
