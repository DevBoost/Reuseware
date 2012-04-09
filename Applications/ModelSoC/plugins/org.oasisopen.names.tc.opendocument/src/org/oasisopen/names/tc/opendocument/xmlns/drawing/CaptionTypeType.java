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
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Caption Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getCaptionTypeType()
 * @model extendedMetaData="name='caption-type_._type'"
 * @generated
 */
public enum CaptionTypeType implements Enumerator {
	/**
	 * The '<em><b>Straight Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_LINE(0, "straightLine", "straight-line"),

	/**
	 * The '<em><b>Angled Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGLED_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	ANGLED_LINE(1, "angledLine", "angled-line"),

	/**
	 * The '<em><b>Angled Connector Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGLED_CONNECTOR_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	ANGLED_CONNECTOR_LINE(2, "angledConnectorLine", "angled-connector-line");

	/**
	 * The '<em><b>Straight Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Straight Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LINE
	 * @model name="straightLine" literal="straight-line"
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_LINE_VALUE = 0;

	/**
	 * The '<em><b>Angled Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Angled Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANGLED_LINE
	 * @model name="angledLine" literal="angled-line"
	 * @generated
	 * @ordered
	 */
	public static final int ANGLED_LINE_VALUE = 1;

	/**
	 * The '<em><b>Angled Connector Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Angled Connector Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANGLED_CONNECTOR_LINE
	 * @model name="angledConnectorLine" literal="angled-connector-line"
	 * @generated
	 * @ordered
	 */
	public static final int ANGLED_CONNECTOR_LINE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Caption Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CaptionTypeType[] VALUES_ARRAY =
		new CaptionTypeType[] {
			STRAIGHT_LINE,
			ANGLED_LINE,
			ANGLED_CONNECTOR_LINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Caption Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CaptionTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Caption Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaptionTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Caption Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaptionTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Caption Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionTypeType get(int value) {
		switch (value) {
			case STRAIGHT_LINE_VALUE: return STRAIGHT_LINE;
			case ANGLED_LINE_VALUE: return ANGLED_LINE;
			case ANGLED_CONNECTOR_LINE_VALUE: return ANGLED_CONNECTOR_LINE;
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
	private CaptionTypeType(int value, String name, String literal) {
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
	
} //CaptionTypeType
