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
 * A representation of the literals of the enumeration '<em><b>First Page Number Type Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFirstPageNumberTypeMember1()
 * @model extendedMetaData="name='first-page-number_._type_._member_._1'"
 * @generated
 */
public enum FirstPageNumberTypeMember1 implements Enumerator {
	/**
	 * The '<em><b>Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(0, "continue", "continue");

	/**
	 * The '<em><b>Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model name="continue"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 0;

	/**
	 * An array of all the '<em><b>First Page Number Type Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FirstPageNumberTypeMember1[] VALUES_ARRAY =
		new FirstPageNumberTypeMember1[] {
			CONTINUE,
		};

	/**
	 * A public read-only list of all the '<em><b>First Page Number Type Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FirstPageNumberTypeMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>First Page Number Type Member1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstPageNumberTypeMember1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirstPageNumberTypeMember1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>First Page Number Type Member1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstPageNumberTypeMember1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirstPageNumberTypeMember1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>First Page Number Type Member1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstPageNumberTypeMember1 get(int value) {
		switch (value) {
			case CONTINUE_VALUE: return CONTINUE;
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
	private FirstPageNumberTypeMember1(int value, String name, String literal) {
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
	
} //FirstPageNumberTypeMember1