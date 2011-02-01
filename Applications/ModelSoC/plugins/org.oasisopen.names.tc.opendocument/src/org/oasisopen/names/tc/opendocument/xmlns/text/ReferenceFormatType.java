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
 * A representation of the literals of the enumeration '<em><b>Reference Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getReferenceFormatType()
 * @model extendedMetaData="name='reference-format_._type'"
 * @generated
 */
public enum ReferenceFormatType implements Enumerator {
	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(0, "page", "page"),

	/**
	 * The '<em><b>Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER(1, "chapter", "chapter"),

	/**
	 * The '<em><b>Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTION(2, "direction", "direction"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(3, "text", "text"),

	/**
	 * The '<em><b>Category And Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_AND_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORY_AND_VALUE(4, "categoryAndValue", "category-and-value"),

	/**
	 * The '<em><b>Caption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CAPTION(5, "caption", "caption"),

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(6, "value", "value");

	/**
	 * The '<em><b>Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE
	 * @model name="page"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_VALUE = 0;

	/**
	 * The '<em><b>Chapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chapter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAPTER
	 * @model name="chapter"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER_VALUE = 1;

	/**
	 * The '<em><b>Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECTION
	 * @model name="direction"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTION_VALUE = 2;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 3;

	/**
	 * The '<em><b>Category And Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Category And Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_AND_VALUE
	 * @model name="categoryAndValue" literal="category-and-value"
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_AND_VALUE_VALUE = 4;

	/**
	 * The '<em><b>Caption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPTION
	 * @model name="caption"
	 * @generated
	 * @ordered
	 */
	public static final int CAPTION_VALUE = 5;

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model name="value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reference Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceFormatType[] VALUES_ARRAY =
		new ReferenceFormatType[] {
			PAGE,
			CHAPTER,
			DIRECTION,
			TEXT,
			CATEGORY_AND_VALUE,
			CAPTION,
			VALUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceFormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceFormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceFormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceFormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceFormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceFormatType get(int value) {
		switch (value) {
			case PAGE_VALUE: return PAGE;
			case CHAPTER_VALUE: return CHAPTER;
			case DIRECTION_VALUE: return DIRECTION;
			case TEXT_VALUE: return TEXT;
			case CATEGORY_AND_VALUE_VALUE: return CATEGORY_AND_VALUE;
			case CAPTION_VALUE: return CAPTION;
			case VALUE_VALUE: return VALUE;
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
	private ReferenceFormatType(int value, String name, String literal) {
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
	
} //ReferenceFormatType
