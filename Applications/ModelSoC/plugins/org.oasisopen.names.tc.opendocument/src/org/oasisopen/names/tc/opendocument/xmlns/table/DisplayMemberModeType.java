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
 * A representation of the literals of the enumeration '<em><b>Display Member Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDisplayMemberModeType()
 * @model extendedMetaData="name='display-member-mode_._type'"
 * @generated
 */
public enum DisplayMemberModeType implements Enumerator {
	/**
	 * The '<em><b>From Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_TOP(0, "fromTop", "from-top"),

	/**
	 * The '<em><b>From Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_BOTTOM(1, "fromBottom", "from-bottom");

	/**
	 * The '<em><b>From Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_TOP
	 * @model name="fromTop" literal="from-top"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_TOP_VALUE = 0;

	/**
	 * The '<em><b>From Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_BOTTOM
	 * @model name="fromBottom" literal="from-bottom"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_BOTTOM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Display Member Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisplayMemberModeType[] VALUES_ARRAY =
		new DisplayMemberModeType[] {
			FROM_TOP,
			FROM_BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Display Member Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisplayMemberModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Display Member Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DisplayMemberModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayMemberModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Member Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DisplayMemberModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayMemberModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Member Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DisplayMemberModeType get(int value) {
		switch (value) {
			case FROM_TOP_VALUE: return FROM_TOP;
			case FROM_BOTTOM_VALUE: return FROM_BOTTOM;
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
	private DisplayMemberModeType(int value, String name, String literal) {
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
	
} //DisplayMemberModeType
