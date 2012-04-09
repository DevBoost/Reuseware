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
 * A representation of the literals of the enumeration '<em><b>Range Usable As Type Member1 Base Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getRangeUsableAsTypeMember1BaseItem()
 * @model extendedMetaData="name='range-usable-as_._type_._member_._1_._base_._item'"
 * @generated
 */
public enum RangeUsableAsTypeMember1BaseItem implements Enumerator {
	/**
	 * The '<em><b>Print Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	PRINT_RANGE(0, "printRange", "print-range"),

	/**
	 * The '<em><b>Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILTER(1, "filter", "filter"),

	/**
	 * The '<em><b>Repeat Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT_ROW(2, "repeatRow", "repeat-row"),

	/**
	 * The '<em><b>Repeat Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT_COLUMN(3, "repeatColumn", "repeat-column");

	/**
	 * The '<em><b>Print Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Print Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINT_RANGE
	 * @model name="printRange" literal="print-range"
	 * @generated
	 * @ordered
	 */
	public static final int PRINT_RANGE_VALUE = 0;

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
	public static final int FILTER_VALUE = 1;

	/**
	 * The '<em><b>Repeat Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeat Row</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT_ROW
	 * @model name="repeatRow" literal="repeat-row"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_ROW_VALUE = 2;

	/**
	 * The '<em><b>Repeat Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeat Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT_COLUMN
	 * @model name="repeatColumn" literal="repeat-column"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_COLUMN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Range Usable As Type Member1 Base Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RangeUsableAsTypeMember1BaseItem[] VALUES_ARRAY =
		new RangeUsableAsTypeMember1BaseItem[] {
			PRINT_RANGE,
			FILTER,
			REPEAT_ROW,
			REPEAT_COLUMN,
		};

	/**
	 * A public read-only list of all the '<em><b>Range Usable As Type Member1 Base Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RangeUsableAsTypeMember1BaseItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Range Usable As Type Member1 Base Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeUsableAsTypeMember1BaseItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeUsableAsTypeMember1BaseItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Usable As Type Member1 Base Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeUsableAsTypeMember1BaseItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeUsableAsTypeMember1BaseItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Usable As Type Member1 Base Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeUsableAsTypeMember1BaseItem get(int value) {
		switch (value) {
			case PRINT_RANGE_VALUE: return PRINT_RANGE;
			case FILTER_VALUE: return FILTER;
			case REPEAT_ROW_VALUE: return REPEAT_ROW;
			case REPEAT_COLUMN_VALUE: return REPEAT_COLUMN;
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
	private RangeUsableAsTypeMember1BaseItem(int value, String name, String literal) {
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
	
} //RangeUsableAsTypeMember1BaseItem
