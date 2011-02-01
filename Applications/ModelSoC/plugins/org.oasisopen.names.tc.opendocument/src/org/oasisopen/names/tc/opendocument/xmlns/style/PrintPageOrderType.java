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
 * A representation of the literals of the enumeration '<em><b>Print Page Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPrintPageOrderType()
 * @model extendedMetaData="name='print-page-order_._type'"
 * @generated
 */
public enum PrintPageOrderType implements Enumerator {
	/**
	 * The '<em><b>Ttb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTB_VALUE
	 * @generated
	 * @ordered
	 */
	TTB(0, "ttb", "ttb"),

	/**
	 * The '<em><b>Ltr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTR_VALUE
	 * @generated
	 * @ordered
	 */
	LTR(1, "ltr", "ltr");

	/**
	 * The '<em><b>Ttb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ttb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TTB
	 * @model name="ttb"
	 * @generated
	 * @ordered
	 */
	public static final int TTB_VALUE = 0;

	/**
	 * The '<em><b>Ltr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ltr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LTR
	 * @model name="ltr"
	 * @generated
	 * @ordered
	 */
	public static final int LTR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Print Page Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrintPageOrderType[] VALUES_ARRAY =
		new PrintPageOrderType[] {
			TTB,
			LTR,
		};

	/**
	 * A public read-only list of all the '<em><b>Print Page Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrintPageOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Print Page Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrintPageOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrintPageOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Print Page Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrintPageOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrintPageOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Print Page Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrintPageOrderType get(int value) {
		switch (value) {
			case TTB_VALUE: return TTB;
			case LTR_VALUE: return LTR;
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
	private PrintPageOrderType(int value, String name, String literal) {
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
	
} //PrintPageOrderType
