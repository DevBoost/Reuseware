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
 * A representation of the literals of the enumeration '<em><b>Family Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFamilyType()
 * @model extendedMetaData="name='family_._type'"
 * @generated
 */
public enum FamilyType implements Enumerator {
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
	 * The '<em><b>Paragraph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH(1, "paragraph", "paragraph"),

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
	 * The '<em><b>Ruby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY(3, "ruby", "ruby"),

	/**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(4, "table", "table"),

	/**
	 * The '<em><b>Table Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_COLUMN(5, "tableColumn", "table-column"),

	/**
	 * The '<em><b>Table Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_ROW(6, "tableRow", "table-row"),

	/**
	 * The '<em><b>Table Cell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_CELL_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_CELL(7, "tableCell", "table-cell"),

	/**
	 * The '<em><b>Graphic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHIC(8, "graphic", "graphic"),

	/**
	 * The '<em><b>Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTATION(9, "presentation", "presentation"),

	/**
	 * The '<em><b>Drawing Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAWING_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DRAWING_PAGE(10, "drawingPage", "drawing-page"),

	/**
	 * The '<em><b>Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHART_VALUE
	 * @generated
	 * @ordered
	 */
	CHART(11, "chart", "chart");

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
	public static final int PARAGRAPH_VALUE = 1;

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
	 * The '<em><b>Ruby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ruby</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUBY
	 * @model name="ruby"
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_VALUE = 3;

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 4;

	/**
	 * The '<em><b>Table Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_COLUMN
	 * @model name="tableColumn" literal="table-column"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_COLUMN_VALUE = 5;

	/**
	 * The '<em><b>Table Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Row</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_ROW
	 * @model name="tableRow" literal="table-row"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_ROW_VALUE = 6;

	/**
	 * The '<em><b>Table Cell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Cell</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_CELL
	 * @model name="tableCell" literal="table-cell"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_CELL_VALUE = 7;

	/**
	 * The '<em><b>Graphic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graphic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC
	 * @model name="graphic"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHIC_VALUE = 8;

	/**
	 * The '<em><b>Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Presentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION
	 * @model name="presentation"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTATION_VALUE = 9;

	/**
	 * The '<em><b>Drawing Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drawing Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAWING_PAGE
	 * @model name="drawingPage" literal="drawing-page"
	 * @generated
	 * @ordered
	 */
	public static final int DRAWING_PAGE_VALUE = 10;

	/**
	 * The '<em><b>Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHART
	 * @model name="chart"
	 * @generated
	 * @ordered
	 */
	public static final int CHART_VALUE = 11;

	/**
	 * An array of all the '<em><b>Family Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FamilyType[] VALUES_ARRAY =
		new FamilyType[] {
			TEXT,
			PARAGRAPH,
			SECTION,
			RUBY,
			TABLE,
			TABLE_COLUMN,
			TABLE_ROW,
			TABLE_CELL,
			GRAPHIC,
			PRESENTATION,
			DRAWING_PAGE,
			CHART,
		};

	/**
	 * A public read-only list of all the '<em><b>Family Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FamilyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Family Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FamilyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Family Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FamilyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Family Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyType get(int value) {
		switch (value) {
			case TEXT_VALUE: return TEXT;
			case PARAGRAPH_VALUE: return PARAGRAPH;
			case SECTION_VALUE: return SECTION;
			case RUBY_VALUE: return RUBY;
			case TABLE_VALUE: return TABLE;
			case TABLE_COLUMN_VALUE: return TABLE_COLUMN;
			case TABLE_ROW_VALUE: return TABLE_ROW;
			case TABLE_CELL_VALUE: return TABLE_CELL;
			case GRAPHIC_VALUE: return GRAPHIC;
			case PRESENTATION_VALUE: return PRESENTATION;
			case DRAWING_PAGE_VALUE: return DRAWING_PAGE;
			case CHART_VALUE: return CHART;
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
	private FamilyType(int value, String name, String literal) {
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
	
} //FamilyType
