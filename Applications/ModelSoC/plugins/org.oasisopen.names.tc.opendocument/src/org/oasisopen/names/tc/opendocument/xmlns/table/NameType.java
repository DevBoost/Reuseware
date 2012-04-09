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
 * A representation of the literals of the enumeration '<em><b>Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNameType()
 * @model extendedMetaData="name='name_._type'"
 * @generated
 */
public enum NameType implements Enumerator {
	/**
	 * The '<em><b>Trace Dependents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_DEPENDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE_DEPENDENTS(0, "traceDependents", "trace-dependents"),

	/**
	 * The '<em><b>Remove Dependents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_DEPENDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_DEPENDENTS(1, "removeDependents", "remove-dependents"),

	/**
	 * The '<em><b>Trace Precedents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_PRECEDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE_PRECEDENTS(2, "tracePrecedents", "trace-precedents"),

	/**
	 * The '<em><b>Remove Precedents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_PRECEDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_PRECEDENTS(3, "removePrecedents", "remove-precedents"),

	/**
	 * The '<em><b>Trace Errors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_ERRORS_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE_ERRORS(4, "traceErrors", "trace-errors");

	/**
	 * The '<em><b>Trace Dependents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trace Dependents</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE_DEPENDENTS
	 * @model name="traceDependents" literal="trace-dependents"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_DEPENDENTS_VALUE = 0;

	/**
	 * The '<em><b>Remove Dependents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Dependents</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_DEPENDENTS
	 * @model name="removeDependents" literal="remove-dependents"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_DEPENDENTS_VALUE = 1;

	/**
	 * The '<em><b>Trace Precedents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trace Precedents</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE_PRECEDENTS
	 * @model name="tracePrecedents" literal="trace-precedents"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_PRECEDENTS_VALUE = 2;

	/**
	 * The '<em><b>Remove Precedents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Precedents</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_PRECEDENTS
	 * @model name="removePrecedents" literal="remove-precedents"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_PRECEDENTS_VALUE = 3;

	/**
	 * The '<em><b>Trace Errors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trace Errors</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE_ERRORS
	 * @model name="traceErrors" literal="trace-errors"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_ERRORS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameType[] VALUES_ARRAY =
		new NameType[] {
			TRACE_DEPENDENTS,
			REMOVE_DEPENDENTS,
			TRACE_PRECEDENTS,
			REMOVE_PRECEDENTS,
			TRACE_ERRORS,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NameType get(int value) {
		switch (value) {
			case TRACE_DEPENDENTS_VALUE: return TRACE_DEPENDENTS;
			case REMOVE_DEPENDENTS_VALUE: return REMOVE_DEPENDENTS;
			case TRACE_PRECEDENTS_VALUE: return TRACE_PRECEDENTS;
			case REMOVE_PRECEDENTS_VALUE: return REMOVE_PRECEDENTS;
			case TRACE_ERRORS_VALUE: return TRACE_ERRORS;
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
	private NameType(int value, String name, String literal) {
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
	
} //NameType
