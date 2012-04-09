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
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Horizontal Rel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getHorizontalRelType()
 * @model extendedMetaData="name='horizontal-rel_._type'"
 * @generated
 */
public enum HorizontalRelType implements Enumerator {
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
	 * The '<em><b>Page Start Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_START_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_START_MARGIN(2, "pageStartMargin", "page-start-margin"),

	/**
	 * The '<em><b>Page End Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_END_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_END_MARGIN(3, "pageEndMargin", "page-end-margin"),

	/**
	 * The '<em><b>Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME(4, "frame", "frame"),

	/**
	 * The '<em><b>Frame Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_CONTENT(5, "frameContent", "frame-content"),

	/**
	 * The '<em><b>Frame Start Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_START_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_START_MARGIN(6, "frameStartMargin", "frame-start-margin"),

	/**
	 * The '<em><b>Frame End Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_END_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_END_MARGIN(7, "frameEndMargin", "frame-end-margin"),

	/**
	 * The '<em><b>Paragraph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH(8, "paragraph", "paragraph"),

	/**
	 * The '<em><b>Paragraph Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_CONTENT(9, "paragraphContent", "paragraph-content"),

	/**
	 * The '<em><b>Paragraph Start Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_START_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_START_MARGIN(10, "paragraphStartMargin", "paragraph-start-margin"),

	/**
	 * The '<em><b>Paragraph End Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_END_MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_END_MARGIN(11, "paragraphEndMargin", "paragraph-end-margin"),

	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(12, "char", "char");

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
	 * The '<em><b>Page Start Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Start Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_START_MARGIN
	 * @model name="pageStartMargin" literal="page-start-margin"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_START_MARGIN_VALUE = 2;

	/**
	 * The '<em><b>Page End Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page End Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_END_MARGIN
	 * @model name="pageEndMargin" literal="page-end-margin"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_END_MARGIN_VALUE = 3;

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
	public static final int FRAME_VALUE = 4;

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
	public static final int FRAME_CONTENT_VALUE = 5;

	/**
	 * The '<em><b>Frame Start Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Start Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_START_MARGIN
	 * @model name="frameStartMargin" literal="frame-start-margin"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_START_MARGIN_VALUE = 6;

	/**
	 * The '<em><b>Frame End Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame End Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_END_MARGIN
	 * @model name="frameEndMargin" literal="frame-end-margin"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_END_MARGIN_VALUE = 7;

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
	public static final int PARAGRAPH_VALUE = 8;

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
	public static final int PARAGRAPH_CONTENT_VALUE = 9;

	/**
	 * The '<em><b>Paragraph Start Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph Start Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_START_MARGIN
	 * @model name="paragraphStartMargin" literal="paragraph-start-margin"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_START_MARGIN_VALUE = 10;

	/**
	 * The '<em><b>Paragraph End Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph End Margin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_END_MARGIN
	 * @model name="paragraphEndMargin" literal="paragraph-end-margin"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_END_MARGIN_VALUE = 11;

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
	public static final int CHAR_VALUE = 12;

	/**
	 * An array of all the '<em><b>Horizontal Rel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HorizontalRelType[] VALUES_ARRAY =
		new HorizontalRelType[] {
			PAGE,
			PAGE_CONTENT,
			PAGE_START_MARGIN,
			PAGE_END_MARGIN,
			FRAME,
			FRAME_CONTENT,
			FRAME_START_MARGIN,
			FRAME_END_MARGIN,
			PARAGRAPH,
			PARAGRAPH_CONTENT,
			PARAGRAPH_START_MARGIN,
			PARAGRAPH_END_MARGIN,
			CHAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Horizontal Rel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HorizontalRelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Horizontal Rel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalRelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HorizontalRelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Horizontal Rel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalRelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HorizontalRelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Horizontal Rel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalRelType get(int value) {
		switch (value) {
			case PAGE_VALUE: return PAGE;
			case PAGE_CONTENT_VALUE: return PAGE_CONTENT;
			case PAGE_START_MARGIN_VALUE: return PAGE_START_MARGIN;
			case PAGE_END_MARGIN_VALUE: return PAGE_END_MARGIN;
			case FRAME_VALUE: return FRAME;
			case FRAME_CONTENT_VALUE: return FRAME_CONTENT;
			case FRAME_START_MARGIN_VALUE: return FRAME_START_MARGIN;
			case FRAME_END_MARGIN_VALUE: return FRAME_END_MARGIN;
			case PARAGRAPH_VALUE: return PARAGRAPH;
			case PARAGRAPH_CONTENT_VALUE: return PARAGRAPH_CONTENT;
			case PARAGRAPH_START_MARGIN_VALUE: return PARAGRAPH_START_MARGIN;
			case PARAGRAPH_END_MARGIN_VALUE: return PARAGRAPH_END_MARGIN;
			case CHAR_VALUE: return CHAR;
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
	private HorizontalRelType(int value, String name, String literal) {
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
	
} //HorizontalRelType
