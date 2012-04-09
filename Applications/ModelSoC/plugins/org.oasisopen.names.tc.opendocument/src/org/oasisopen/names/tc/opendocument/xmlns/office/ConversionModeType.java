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
package org.oasisopen.names.tc.opendocument.xmlns.office;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conversion Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getConversionModeType()
 * @model extendedMetaData="name='conversion-mode_._type'"
 * @generated
 */
public enum ConversionModeType implements Enumerator {
	/**
	 * The '<em><b>Into Default Style Data Style</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTO_DEFAULT_STYLE_DATA_STYLE_VALUE
	 * @generated
	 * @ordered
	 */
	INTO_DEFAULT_STYLE_DATA_STYLE(0, "intoDefaultStyleDataStyle", "into-default-style-data-style"),

	/**
	 * The '<em><b>Into English Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTO_ENGLISH_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	INTO_ENGLISH_NUMBER(1, "intoEnglishNumber", "into-english-number"),

	/**
	 * The '<em><b>Keep Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_TEXT(2, "keepText", "keep-text");

	/**
	 * The '<em><b>Into Default Style Data Style</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Into Default Style Data Style</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTO_DEFAULT_STYLE_DATA_STYLE
	 * @model name="intoDefaultStyleDataStyle" literal="into-default-style-data-style"
	 * @generated
	 * @ordered
	 */
	public static final int INTO_DEFAULT_STYLE_DATA_STYLE_VALUE = 0;

	/**
	 * The '<em><b>Into English Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Into English Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTO_ENGLISH_NUMBER
	 * @model name="intoEnglishNumber" literal="into-english-number"
	 * @generated
	 * @ordered
	 */
	public static final int INTO_ENGLISH_NUMBER_VALUE = 1;

	/**
	 * The '<em><b>Keep Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keep Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEEP_TEXT
	 * @model name="keepText" literal="keep-text"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_TEXT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Conversion Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConversionModeType[] VALUES_ARRAY =
		new ConversionModeType[] {
			INTO_DEFAULT_STYLE_DATA_STYLE,
			INTO_ENGLISH_NUMBER,
			KEEP_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Conversion Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConversionModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conversion Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConversionModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConversionModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConversionModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConversionModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConversionModeType get(int value) {
		switch (value) {
			case INTO_DEFAULT_STYLE_DATA_STYLE_VALUE: return INTO_DEFAULT_STYLE_DATA_STYLE;
			case INTO_ENGLISH_NUMBER_VALUE: return INTO_ENGLISH_NUMBER;
			case KEEP_TEXT_VALUE: return KEEP_TEXT;
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
	private ConversionModeType(int value, String name, String literal) {
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
	
} //ConversionModeType
