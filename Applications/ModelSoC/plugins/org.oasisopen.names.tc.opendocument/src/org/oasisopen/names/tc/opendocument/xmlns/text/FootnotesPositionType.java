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
 * A representation of the literals of the enumeration '<em><b>Footnotes Position Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFootnotesPositionType()
 * @model extendedMetaData="name='footnotes-position_._type'"
 * @generated
 */
public enum FootnotesPositionType implements Enumerator {
	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "text", "text"),

	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(1, "page", "page"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(2, "section", "section"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(3, "document", "document");

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
	public static final int TEXT_VALUE = 0;

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
	public static final int PAGE_VALUE = 1;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Section</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTION
	 * @model name="section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 2;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model name="document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Footnotes Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FootnotesPositionType[] VALUES_ARRAY =
		new FootnotesPositionType[] {
			TEXT,
			PAGE,
			SECTION,
			DOCUMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Footnotes Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FootnotesPositionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Footnotes Position Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FootnotesPositionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FootnotesPositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Footnotes Position Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FootnotesPositionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FootnotesPositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Footnotes Position Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FootnotesPositionType get(int value) {
		switch (value) {
			case TEXT_VALUE: return TEXT;
			case PAGE_VALUE: return PAGE;
			case SECTION_VALUE: return SECTION;
			case DOCUMENT_VALUE: return DOCUMENT;
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
	private FootnotesPositionType(int value, String name, String literal) {
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
	
} //FootnotesPositionType
