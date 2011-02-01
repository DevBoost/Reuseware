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
 * A representation of the literals of the enumeration '<em><b>Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDirectionType()
 * @model extendedMetaData="name='direction_._type'"
 * @generated
 */
public enum DirectionType implements Enumerator {
	/**
	 * The '<em><b>From Another Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_ANOTHER_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_ANOTHER_TABLE(0, "fromAnotherTable", "from-another-table"),

	/**
	 * The '<em><b>To Another Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_ANOTHER_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_ANOTHER_TABLE(1, "toAnotherTable", "to-another-table"),

	/**
	 * The '<em><b>From Same Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SAME_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_SAME_TABLE(2, "fromSameTable", "from-same-table");

	/**
	 * The '<em><b>From Another Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Another Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_ANOTHER_TABLE
	 * @model name="fromAnotherTable" literal="from-another-table"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_ANOTHER_TABLE_VALUE = 0;

	/**
	 * The '<em><b>To Another Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Another Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_ANOTHER_TABLE
	 * @model name="toAnotherTable" literal="to-another-table"
	 * @generated
	 * @ordered
	 */
	public static final int TO_ANOTHER_TABLE_VALUE = 1;

	/**
	 * The '<em><b>From Same Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Same Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_SAME_TABLE
	 * @model name="fromSameTable" literal="from-same-table"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_SAME_TABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirectionType[] VALUES_ARRAY =
		new DirectionType[] {
			FROM_ANOTHER_TABLE,
			TO_ANOTHER_TABLE,
			FROM_SAME_TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionType get(int value) {
		switch (value) {
			case FROM_ANOTHER_TABLE_VALUE: return FROM_ANOTHER_TABLE;
			case TO_ANOTHER_TABLE_VALUE: return TO_ANOTHER_TABLE;
			case FROM_SAME_TABLE_VALUE: return FROM_SAME_TABLE;
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
	private DirectionType(int value, String name, String literal) {
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
	
} //DirectionType
