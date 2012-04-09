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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bibliography Data Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyDataFieldType()
 * @model extendedMetaData="name='bibliography-data-field_._type'"
 * @generated
 */
public enum BibliographyDataFieldType implements Enumerator {
	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(0, "address", "address"),

	/**
	 * The '<em><b>Annote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTE_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTE(1, "annote", "annote"),

	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(2, "author", "author"),

	/**
	 * The '<em><b>Bibliography Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIBLIOGRAPHY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BIBLIOGRAPHY_TYPE(3, "bibliographyType", "bibliography-type"),

	/**
	 * The '<em><b>Booktitle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKTITLE_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKTITLE(4, "booktitle", "booktitle"),

	/**
	 * The '<em><b>Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER(5, "chapter", "chapter"),

	/**
	 * The '<em><b>Custom1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM1_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM1(6, "custom1", "custom1"),

	/**
	 * The '<em><b>Custom2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM2_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM2(7, "custom2", "custom2"),

	/**
	 * The '<em><b>Custom3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM3_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM3(8, "custom3", "custom3"),

	/**
	 * The '<em><b>Custom4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM4_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM4(9, "custom4", "custom4"),

	/**
	 * The '<em><b>Custom5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM5_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM5(10, "custom5", "custom5"),

	/**
	 * The '<em><b>Edition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITION_VALUE
	 * @generated
	 * @ordered
	 */
	EDITION(11, "edition", "edition"),

	/**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(12, "editor", "editor"),

	/**
	 * The '<em><b>Howpublished</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOWPUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	HOWPUBLISHED(13, "howpublished", "howpublished"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(14, "identifier", "identifier"),

	/**
	 * The '<em><b>Institution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTITUTION(15, "institution", "institution"),

	/**
	 * The '<em><b>Isbn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN_VALUE
	 * @generated
	 * @ordered
	 */
	ISBN(16, "isbn", "isbn"),

	/**
	 * The '<em><b>Issn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSN_VALUE
	 * @generated
	 * @ordered
	 */
	ISSN(17, "issn", "issn"),

	/**
	 * The '<em><b>Journal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNAL_VALUE
	 * @generated
	 * @ordered
	 */
	JOURNAL(18, "journal", "journal"),

	/**
	 * The '<em><b>Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(19, "month", "month"),

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(20, "note", "note"),

	/**
	 * The '<em><b>Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(21, "number", "number"),

	/**
	 * The '<em><b>Organizations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATIONS(22, "organizations", "organizations"),

	/**
	 * The '<em><b>Pages</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGES_VALUE
	 * @generated
	 * @ordered
	 */
	PAGES(23, "pages", "pages"),

	/**
	 * The '<em><b>Publisher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHER_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHER(24, "publisher", "publisher"),

	/**
	 * The '<em><b>Report Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_TYPE(25, "reportType", "report-type"),

	/**
	 * The '<em><b>School</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL(26, "school", "school"),

	/**
	 * The '<em><b>Series</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIES_VALUE
	 * @generated
	 * @ordered
	 */
	SERIES(27, "series", "series"),

	/**
	 * The '<em><b>Title</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(28, "title", "title"),

	/**
	 * The '<em><b>Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(29, "url", "url"),

	/**
	 * The '<em><b>Volume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUME(30, "volume", "volume"),

	/**
	 * The '<em><b>Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(31, "year", "year");

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDRESS
	 * @model name="address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 0;

	/**
	 * The '<em><b>Annote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Annote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANNOTE
	 * @model name="annote"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTE_VALUE = 1;

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Author</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 2;

	/**
	 * The '<em><b>Bibliography Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bibliography Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIBLIOGRAPHY_TYPE
	 * @model name="bibliographyType" literal="bibliography-type"
	 * @generated
	 * @ordered
	 */
	public static final int BIBLIOGRAPHY_TYPE_VALUE = 3;

	/**
	 * The '<em><b>Booktitle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Booktitle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOKTITLE
	 * @model name="booktitle"
	 * @generated
	 * @ordered
	 */
	public static final int BOOKTITLE_VALUE = 4;

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
	public static final int CHAPTER_VALUE = 5;

	/**
	 * The '<em><b>Custom1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM1
	 * @model name="custom1"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM1_VALUE = 6;

	/**
	 * The '<em><b>Custom2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM2
	 * @model name="custom2"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM2_VALUE = 7;

	/**
	 * The '<em><b>Custom3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM3
	 * @model name="custom3"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM3_VALUE = 8;

	/**
	 * The '<em><b>Custom4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM4
	 * @model name="custom4"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM4_VALUE = 9;

	/**
	 * The '<em><b>Custom5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM5
	 * @model name="custom5"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM5_VALUE = 10;

	/**
	 * The '<em><b>Edition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Edition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDITION
	 * @model name="edition"
	 * @generated
	 * @ordered
	 */
	public static final int EDITION_VALUE = 11;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Editor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model name="editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 12;

	/**
	 * The '<em><b>Howpublished</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Howpublished</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOWPUBLISHED
	 * @model name="howpublished"
	 * @generated
	 * @ordered
	 */
	public static final int HOWPUBLISHED_VALUE = 13;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER
	 * @model name="identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 14;

	/**
	 * The '<em><b>Institution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Institution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTITUTION
	 * @model name="institution"
	 * @generated
	 * @ordered
	 */
	public static final int INSTITUTION_VALUE = 15;

	/**
	 * The '<em><b>Isbn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Isbn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISBN
	 * @model name="isbn"
	 * @generated
	 * @ordered
	 */
	public static final int ISBN_VALUE = 16;

	/**
	 * The '<em><b>Issn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Issn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISSN
	 * @model name="issn"
	 * @generated
	 * @ordered
	 */
	public static final int ISSN_VALUE = 17;

	/**
	 * The '<em><b>Journal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Journal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOURNAL
	 * @model name="journal"
	 * @generated
	 * @ordered
	 */
	public static final int JOURNAL_VALUE = 18;

	/**
	 * The '<em><b>Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model name="month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 19;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Note</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model name="note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 20;

	/**
	 * The '<em><b>Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model name="number"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 21;

	/**
	 * The '<em><b>Organizations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organizations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONS
	 * @model name="organizations"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATIONS_VALUE = 22;

	/**
	 * The '<em><b>Pages</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pages</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGES
	 * @model name="pages"
	 * @generated
	 * @ordered
	 */
	public static final int PAGES_VALUE = 23;

	/**
	 * The '<em><b>Publisher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publisher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISHER
	 * @model name="publisher"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHER_VALUE = 24;

	/**
	 * The '<em><b>Report Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Report Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORT_TYPE
	 * @model name="reportType" literal="report-type"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_TYPE_VALUE = 25;

	/**
	 * The '<em><b>School</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>School</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHOOL
	 * @model name="school"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_VALUE = 26;

	/**
	 * The '<em><b>Series</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Series</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIES
	 * @model name="series"
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_VALUE = 27;

	/**
	 * The '<em><b>Title</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Title</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model name="title"
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 28;

	/**
	 * The '<em><b>Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Url</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model name="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 29;

	/**
	 * The '<em><b>Volume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Volume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLUME
	 * @model name="volume"
	 * @generated
	 * @ordered
	 */
	public static final int VOLUME_VALUE = 30;

	/**
	 * The '<em><b>Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model name="year"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 31;

	/**
	 * An array of all the '<em><b>Bibliography Data Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BibliographyDataFieldType[] VALUES_ARRAY =
		new BibliographyDataFieldType[] {
			ADDRESS,
			ANNOTE,
			AUTHOR,
			BIBLIOGRAPHY_TYPE,
			BOOKTITLE,
			CHAPTER,
			CUSTOM1,
			CUSTOM2,
			CUSTOM3,
			CUSTOM4,
			CUSTOM5,
			EDITION,
			EDITOR,
			HOWPUBLISHED,
			IDENTIFIER,
			INSTITUTION,
			ISBN,
			ISSN,
			JOURNAL,
			MONTH,
			NOTE,
			NUMBER,
			ORGANIZATIONS,
			PAGES,
			PUBLISHER,
			REPORT_TYPE,
			SCHOOL,
			SERIES,
			TITLE,
			URL,
			VOLUME,
			YEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Bibliography Data Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BibliographyDataFieldType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bibliography Data Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BibliographyDataFieldType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BibliographyDataFieldType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bibliography Data Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BibliographyDataFieldType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BibliographyDataFieldType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bibliography Data Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BibliographyDataFieldType get(int value) {
		switch (value) {
			case ADDRESS_VALUE: return ADDRESS;
			case ANNOTE_VALUE: return ANNOTE;
			case AUTHOR_VALUE: return AUTHOR;
			case BIBLIOGRAPHY_TYPE_VALUE: return BIBLIOGRAPHY_TYPE;
			case BOOKTITLE_VALUE: return BOOKTITLE;
			case CHAPTER_VALUE: return CHAPTER;
			case CUSTOM1_VALUE: return CUSTOM1;
			case CUSTOM2_VALUE: return CUSTOM2;
			case CUSTOM3_VALUE: return CUSTOM3;
			case CUSTOM4_VALUE: return CUSTOM4;
			case CUSTOM5_VALUE: return CUSTOM5;
			case EDITION_VALUE: return EDITION;
			case EDITOR_VALUE: return EDITOR;
			case HOWPUBLISHED_VALUE: return HOWPUBLISHED;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case INSTITUTION_VALUE: return INSTITUTION;
			case ISBN_VALUE: return ISBN;
			case ISSN_VALUE: return ISSN;
			case JOURNAL_VALUE: return JOURNAL;
			case MONTH_VALUE: return MONTH;
			case NOTE_VALUE: return NOTE;
			case NUMBER_VALUE: return NUMBER;
			case ORGANIZATIONS_VALUE: return ORGANIZATIONS;
			case PAGES_VALUE: return PAGES;
			case PUBLISHER_VALUE: return PUBLISHER;
			case REPORT_TYPE_VALUE: return REPORT_TYPE;
			case SCHOOL_VALUE: return SCHOOL;
			case SERIES_VALUE: return SERIES;
			case TITLE_VALUE: return TITLE;
			case URL_VALUE: return URL;
			case VOLUME_VALUE: return VOLUME;
			case YEAR_VALUE: return YEAR;
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
	private BibliographyDataFieldType(int value, String name, String literal) {
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
	
} //BibliographyDataFieldType
