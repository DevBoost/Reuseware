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
 * A representation of the literals of the enumeration '<em><b>Vertical Rel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getVerticalRelType()
 * @model extendedMetaData="name='vertical-rel_._type'"
 * @generated
 */
public enum VerticalRelType implements Enumerator {
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
	 * The '<em><b>Page Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_CONTENT(1, "pageContent", "page-content"),

	/**
	 * The '<em><b>Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME(2, "frame", "frame"),

	/**
	 * The '<em><b>Frame Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_CONTENT(3, "frameContent", "frame-content"),

	/**
	 * The '<em><b>Paragraph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH(4, "paragraph", "paragraph"),

	/**
	 * The '<em><b>Paragraph Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_CONTENT(5, "paragraphContent", "paragraph-content"),

	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(6, "char", "char"),

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(7, "line", "line"),

	/**
	 * The '<em><b>Baseline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASELINE_VALUE
	 * @generated
	 * @ordered
	 */
	BASELINE(8, "baseline", "baseline"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(9, "text", "text");

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
	 * The '<em><b>Page Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_CONTENT
	 * @model name="pageContent" literal="page-content"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_CONTENT_VALUE = 1;

	/**
	 * The '<em><b>Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME
	 * @model name="frame"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_VALUE = 2;

	/**
	 * The '<em><b>Frame Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_CONTENT
	 * @model name="frameContent" literal="frame-content"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_CONTENT_VALUE = 3;

	/**
	 * The '<em><b>Paragraph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH
	 * @model name="paragraph"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_VALUE = 4;

	/**
	 * The '<em><b>Paragraph Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_CONTENT
	 * @model name="paragraphContent" literal="paragraph-content"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_CONTENT_VALUE = 5;

	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 6;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 7;

	/**
	 * The '<em><b>Baseline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Baseline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASELINE
	 * @model name="baseline"
	 * @generated
	 * @ordered
	 */
	public static final int BASELINE_VALUE = 8;

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
	public static final int TEXT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Vertical Rel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VerticalRelType[] VALUES_ARRAY =
		new VerticalRelType[] {
			PAGE,
			PAGE_CONTENT,
			FRAME,
			FRAME_CONTENT,
			PARAGRAPH,
			PARAGRAPH_CONTENT,
			CHAR,
			LINE,
			BASELINE,
			TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Vertical Rel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VerticalRelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vertical Rel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalRelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalRelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Rel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalRelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalRelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Rel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalRelType get(int value) {
		switch (value) {
			case PAGE_VALUE: return PAGE;
			case PAGE_CONTENT_VALUE: return PAGE_CONTENT;
			case FRAME_VALUE: return FRAME;
			case FRAME_CONTENT_VALUE: return FRAME_CONTENT;
			case PARAGRAPH_VALUE: return PARAGRAPH;
			case PARAGRAPH_CONTENT_VALUE: return PARAGRAPH_CONTENT;
			case CHAR_VALUE: return CHAR;
			case LINE_VALUE: return LINE;
			case BASELINE_VALUE: return BASELINE;
			case TEXT_VALUE: return TEXT;
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
	private VerticalRelType(int value, String name, String literal) {
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
	
} //VerticalRelType
