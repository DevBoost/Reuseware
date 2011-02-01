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
 * A representation of the literals of the enumeration '<em><b>Table Visibility Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableVisibilityValue()
 * @model extendedMetaData="name='table-visibility-value'"
 * @generated
 */
public enum TableVisibilityValue implements Enumerator {
	/**
	 * The '<em><b>Visible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VISIBLE(0, "visible", "visible"),

	/**
	 * The '<em><b>Collapse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLAPSE(1, "collapse", "collapse"),

	/**
	 * The '<em><b>Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILTER(2, "filter", "filter");

	/**
	 * The '<em><b>Visible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIBLE
	 * @model name="visible"
	 * @generated
	 * @ordered
	 */
	public static final int VISIBLE_VALUE = 0;

	/**
	 * The '<em><b>Collapse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collapse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE
	 * @model name="collapse"
	 * @generated
	 * @ordered
	 */
	public static final int COLLAPSE_VALUE = 1;

	/**
	 * The '<em><b>Filter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILTER
	 * @model name="filter"
	 * @generated
	 * @ordered
	 */
	public static final int FILTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Table Visibility Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TableVisibilityValue[] VALUES_ARRAY =
		new TableVisibilityValue[] {
			VISIBLE,
			COLLAPSE,
			FILTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Table Visibility Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TableVisibilityValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Table Visibility Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableVisibilityValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TableVisibilityValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Table Visibility Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableVisibilityValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TableVisibilityValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Table Visibility Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableVisibilityValue get(int value) {
		switch (value) {
			case VISIBLE_VALUE: return VISIBLE;
			case COLLAPSE_VALUE: return COLLAPSE;
			case FILTER_VALUE: return FILTER;
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
	private TableVisibilityValue(int value, String name, String literal) {
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
	
} //TableVisibilityValue
