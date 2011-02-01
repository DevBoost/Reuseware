/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Calendar Type Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getCalendarTypeMember1()
 * @model extendedMetaData="name='calendar_._type_._member_._1'"
 * @generated
 */
public enum CalendarTypeMember1 implements Enumerator {
	/**
	 * The '<em><b>Gregorian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREGORIAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREGORIAN(0, "gregorian", "gregorian");

	/**
	 * The '<em><b>Gregorian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gregorian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREGORIAN
	 * @model name="gregorian"
	 * @generated
	 * @ordered
	 */
	public static final int GREGORIAN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Calendar Type Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CalendarTypeMember1[] VALUES_ARRAY =
		new CalendarTypeMember1[] {
			GREGORIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Calendar Type Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CalendarTypeMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Calendar Type Member1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalendarTypeMember1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CalendarTypeMember1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Calendar Type Member1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalendarTypeMember1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CalendarTypeMember1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Calendar Type Member1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalendarTypeMember1 get(int value) {
		switch (value) {
			case GREGORIAN_VALUE: return GREGORIAN;
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
	private CalendarTypeMember1(int value, String name, String literal) {
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
	
} //CalendarTypeMember1
