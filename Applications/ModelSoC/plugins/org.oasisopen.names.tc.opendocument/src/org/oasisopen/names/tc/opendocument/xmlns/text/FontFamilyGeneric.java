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
 * A representation of the literals of the enumeration '<em><b>Font Family Generic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFontFamilyGeneric()
 * @model extendedMetaData="name='fontFamilyGeneric'"
 * @generated
 */
public enum FontFamilyGeneric implements Enumerator {
	/**
	 * The '<em><b>Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	ROMAN(0, "roman", "roman"),

	/**
	 * The '<em><b>Swiss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWISS_VALUE
	 * @generated
	 * @ordered
	 */
	SWISS(1, "swiss", "swiss"),

	/**
	 * The '<em><b>Modern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERN_VALUE
	 * @generated
	 * @ordered
	 */
	MODERN(2, "modern", "modern"),

	/**
	 * The '<em><b>Decorative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DECORATIVE(3, "decorative", "decorative"),

	/**
	 * The '<em><b>Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(4, "script", "script"),

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(5, "system", "system");

	/**
	 * The '<em><b>Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Roman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROMAN
	 * @model name="roman"
	 * @generated
	 * @ordered
	 */
	public static final int ROMAN_VALUE = 0;

	/**
	 * The '<em><b>Swiss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swiss</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWISS
	 * @model name="swiss"
	 * @generated
	 * @ordered
	 */
	public static final int SWISS_VALUE = 1;

	/**
	 * The '<em><b>Modern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modern</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODERN
	 * @model name="modern"
	 * @generated
	 * @ordered
	 */
	public static final int MODERN_VALUE = 2;

	/**
	 * The '<em><b>Decorative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decorative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECORATIVE
	 * @model name="decorative"
	 * @generated
	 * @ordered
	 */
	public static final int DECORATIVE_VALUE = 3;

	/**
	 * The '<em><b>Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRIPT
	 * @model name="script"
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 4;

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model name="system"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 5;

	/**
	 * An array of all the '<em><b>Font Family Generic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontFamilyGeneric[] VALUES_ARRAY =
		new FontFamilyGeneric[] {
			ROMAN,
			SWISS,
			MODERN,
			DECORATIVE,
			SCRIPT,
			SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Family Generic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontFamilyGeneric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Family Generic</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontFamilyGeneric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamilyGeneric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family Generic</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontFamilyGeneric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamilyGeneric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family Generic</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontFamilyGeneric get(int value) {
		switch (value) {
			case ROMAN_VALUE: return ROMAN;
			case SWISS_VALUE: return SWISS;
			case MODERN_VALUE: return MODERN;
			case DECORATIVE_VALUE: return DECORATIVE;
			case SCRIPT_VALUE: return SCRIPT;
			case SYSTEM_VALUE: return SYSTEM;
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
	private FontFamilyGeneric(int value, String name, String literal) {
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
	
} //FontFamilyGeneric
