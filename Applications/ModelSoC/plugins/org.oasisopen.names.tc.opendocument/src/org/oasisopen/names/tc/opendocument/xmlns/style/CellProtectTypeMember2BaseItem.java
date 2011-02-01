/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cell Protect Type Member2 Base Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getCellProtectTypeMember2BaseItem()
 * @model extendedMetaData="name='cell-protect_._type_._member_._2_._base_._item'"
 * @generated
 */
public enum CellProtectTypeMember2BaseItem implements Enumerator {
	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED(0, "protected", "protected"),

	/**
	 * The '<em><b>Formula Hidden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULA_HIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULA_HIDDEN(1, "formulaHidden", "formula-hidden");

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @model name="protected"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_VALUE = 0;

	/**
	 * The '<em><b>Formula Hidden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formula Hidden</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULA_HIDDEN
	 * @model name="formulaHidden" literal="formula-hidden"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULA_HIDDEN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cell Protect Type Member2 Base Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CellProtectTypeMember2BaseItem[] VALUES_ARRAY =
		new CellProtectTypeMember2BaseItem[] {
			PROTECTED,
			FORMULA_HIDDEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Cell Protect Type Member2 Base Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CellProtectTypeMember2BaseItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Protect Type Member2 Base Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellProtectTypeMember2BaseItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellProtectTypeMember2BaseItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Protect Type Member2 Base Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellProtectTypeMember2BaseItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellProtectTypeMember2BaseItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Protect Type Member2 Base Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellProtectTypeMember2BaseItem get(int value) {
		switch (value) {
			case PROTECTED_VALUE: return PROTECTED;
			case FORMULA_HIDDEN_VALUE: return FORMULA_HIDDEN;
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
	private CellProtectTypeMember2BaseItem(int value, String name, String literal) {
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
	
} //CellProtectTypeMember2BaseItem
