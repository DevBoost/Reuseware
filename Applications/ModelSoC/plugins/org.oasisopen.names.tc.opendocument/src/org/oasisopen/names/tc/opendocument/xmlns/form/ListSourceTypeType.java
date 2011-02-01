/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>List Source Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListSourceTypeType()
 * @model extendedMetaData="name='list-source-type_._type'"
 * @generated
 */
public enum ListSourceTypeType implements Enumerator {
	/**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(0, "table", "table"),

	/**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(1, "query", "query"),

	/**
	 * The '<em><b>Sql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_VALUE
	 * @generated
	 * @ordered
	 */
	SQL(2, "sql", "sql"),

	/**
	 * The '<em><b>Sql Pass Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_PASS_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	SQL_PASS_THROUGH(3, "sqlPassThrough", "sql-pass-through"),

	/**
	 * The '<em><b>Value List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_LIST(4, "valueList", "value-list"),

	/**
	 * The '<em><b>Table Fields</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_FIELDS_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_FIELDS(5, "tableFields", "table-fields");

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 0;

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model name="query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 1;

	/**
	 * The '<em><b>Sql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL
	 * @model name="sql"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_VALUE = 2;

	/**
	 * The '<em><b>Sql Pass Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sql Pass Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL_PASS_THROUGH
	 * @model name="sqlPassThrough" literal="sql-pass-through"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_PASS_THROUGH_VALUE = 3;

	/**
	 * The '<em><b>Value List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_LIST
	 * @model name="valueList" literal="value-list"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_LIST_VALUE = 4;

	/**
	 * The '<em><b>Table Fields</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Fields</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_FIELDS
	 * @model name="tableFields" literal="table-fields"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_FIELDS_VALUE = 5;

	/**
	 * An array of all the '<em><b>List Source Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListSourceTypeType[] VALUES_ARRAY =
		new ListSourceTypeType[] {
			TABLE,
			QUERY,
			SQL,
			SQL_PASS_THROUGH,
			VALUE_LIST,
			TABLE_FIELDS,
		};

	/**
	 * A public read-only list of all the '<em><b>List Source Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListSourceTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>List Source Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListSourceTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListSourceTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Source Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListSourceTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListSourceTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Source Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListSourceTypeType get(int value) {
		switch (value) {
			case TABLE_VALUE: return TABLE;
			case QUERY_VALUE: return QUERY;
			case SQL_VALUE: return SQL;
			case SQL_PASS_THROUGH_VALUE: return SQL_PASS_THROUGH;
			case VALUE_LIST_VALUE: return VALUE_LIST;
			case TABLE_FIELDS_VALUE: return TABLE_FIELDS;
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
	private ListSourceTypeType(int value, String name, String literal) {
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
	
} //ListSourceTypeType
