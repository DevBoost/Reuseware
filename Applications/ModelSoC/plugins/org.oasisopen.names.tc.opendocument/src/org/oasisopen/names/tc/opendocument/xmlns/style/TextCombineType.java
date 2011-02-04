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
 * A representation of the literals of the enumeration '<em><b>Text Combine Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTextCombineType()
 * @model extendedMetaData="name='text-combine_._type'"
 * @generated
 */
public enum TextCombineType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Letters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTERS_VALUE
	 * @generated
	 * @ordered
	 */
	LETTERS(1, "letters", "letters"),

	/**
	 * The '<em><b>Lines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINES_VALUE
	 * @generated
	 * @ordered
	 */
	LINES(2, "lines", "lines");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Letters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Letters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LETTERS
	 * @model name="letters"
	 * @generated
	 * @ordered
	 */
	public static final int LETTERS_VALUE = 1;

	/**
	 * The '<em><b>Lines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINES
	 * @model name="lines"
	 * @generated
	 * @ordered
	 */
	public static final int LINES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Text Combine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextCombineType[] VALUES_ARRAY =
		new TextCombineType[] {
			NONE,
			LETTERS,
			LINES,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Combine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextCombineType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Combine Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextCombineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextCombineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Combine Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextCombineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextCombineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Combine Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextCombineType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LETTERS_VALUE: return LETTERS;
			case LINES_VALUE: return LINES;
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
	private TextCombineType(int value, String name, String literal) {
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
	
} //TextCombineType