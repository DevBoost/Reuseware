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
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyMarkType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextBibliographyTypes;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibliography Mark Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getAnnote <em>Annote</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getBibliographyType <em>Bibliography Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getCustom1 <em>Custom1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getCustom2 <em>Custom2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getCustom3 <em>Custom3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getCustom4 <em>Custom4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getCustom5 <em>Custom5</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getHowpublished <em>Howpublished</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getReportType <em>Report Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getSchool <em>School</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyMarkTypeImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliographyMarkTypeImpl extends EObjectImpl implements BibliographyMarkType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnote() <em>Annote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnote()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnote() <em>Annote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnote()
	 * @generated
	 * @ordered
	 */
	protected String annote = ANNOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBibliographyType() <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyType()
	 * @generated
	 * @ordered
	 */
	protected static final TextBibliographyTypes BIBLIOGRAPHY_TYPE_EDEFAULT = TextBibliographyTypes.ARTICLE;

	/**
	 * The cached value of the '{@link #getBibliographyType() <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyType()
	 * @generated
	 * @ordered
	 */
	protected TextBibliographyTypes bibliographyType = BIBLIOGRAPHY_TYPE_EDEFAULT;

	/**
	 * This is true if the Bibliography Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliographyTypeESet;

	/**
	 * The default value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected String booktitle = BOOKTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapter()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapter()
	 * @generated
	 * @ordered
	 */
	protected String chapter = CHAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom1() <em>Custom1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom1()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom1() <em>Custom1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom1()
	 * @generated
	 * @ordered
	 */
	protected String custom1 = CUSTOM1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom2() <em>Custom2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom2()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom2() <em>Custom2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom2()
	 * @generated
	 * @ordered
	 */
	protected String custom2 = CUSTOM2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom3() <em>Custom3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom3()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom3() <em>Custom3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom3()
	 * @generated
	 * @ordered
	 */
	protected String custom3 = CUSTOM3_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom4() <em>Custom4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom4()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom4() <em>Custom4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom4()
	 * @generated
	 * @ordered
	 */
	protected String custom4 = CUSTOM4_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom5() <em>Custom5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom5()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom5() <em>Custom5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom5()
	 * @generated
	 * @ordered
	 */
	protected String custom5 = CUSTOM5_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition = EDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected String editor = EDITOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHowpublished() <em>Howpublished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowpublished()
	 * @generated
	 * @ordered
	 */
	protected static final String HOWPUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowpublished() <em>Howpublished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowpublished()
	 * @generated
	 * @ordered
	 */
	protected String howpublished = HOWPUBLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected static final String ISBN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected String isbn = ISBN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssn() <em>Issn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected String issn = ISSN_EDEFAULT;

	/**
	 * The default value of the '{@link #getJournal() <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournal() <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected String journal = JOURNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected String month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizations() <em>Organizations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected String organizations = ORGANIZATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected String pages = PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportType()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportType()
	 * @generated
	 * @ordered
	 */
	protected String reportType = REPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchool() <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected String school = SCHOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeries() <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected String series = SERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliographyMarkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getBibliographyMarkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnote() {
		return annote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnote(String newAnnote) {
		String oldAnnote = annote;
		annote = newAnnote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__ANNOTE, oldAnnote, annote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBibliographyTypes getBibliographyType() {
		return bibliographyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyType(TextBibliographyTypes newBibliographyType) {
		TextBibliographyTypes oldBibliographyType = bibliographyType;
		bibliographyType = newBibliographyType == null ? BIBLIOGRAPHY_TYPE_EDEFAULT : newBibliographyType;
		boolean oldBibliographyTypeESet = bibliographyTypeESet;
		bibliographyTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE, oldBibliographyType, bibliographyType, !oldBibliographyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBibliographyType() {
		TextBibliographyTypes oldBibliographyType = bibliographyType;
		boolean oldBibliographyTypeESet = bibliographyTypeESet;
		bibliographyType = BIBLIOGRAPHY_TYPE_EDEFAULT;
		bibliographyTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE, oldBibliographyType, BIBLIOGRAPHY_TYPE_EDEFAULT, oldBibliographyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBibliographyType() {
		return bibliographyTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooktitle() {
		return booktitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooktitle(String newBooktitle) {
		String oldBooktitle = booktitle;
		booktitle = newBooktitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__BOOKTITLE, oldBooktitle, booktitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChapter() {
		return chapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChapter(String newChapter) {
		String oldChapter = chapter;
		chapter = newChapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CHAPTER, oldChapter, chapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom1() {
		return custom1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom1(String newCustom1) {
		String oldCustom1 = custom1;
		custom1 = newCustom1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM1, oldCustom1, custom1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom2() {
		return custom2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom2(String newCustom2) {
		String oldCustom2 = custom2;
		custom2 = newCustom2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM2, oldCustom2, custom2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom3() {
		return custom3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom3(String newCustom3) {
		String oldCustom3 = custom3;
		custom3 = newCustom3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM3, oldCustom3, custom3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom4() {
		return custom4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom4(String newCustom4) {
		String oldCustom4 = custom4;
		custom4 = newCustom4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM4, oldCustom4, custom4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom5() {
		return custom5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom5(String newCustom5) {
		String oldCustom5 = custom5;
		custom5 = newCustom5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM5, oldCustom5, custom5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(String newEditor) {
		String oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITOR, oldEditor, editor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHowpublished() {
		return howpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHowpublished(String newHowpublished) {
		String oldHowpublished = howpublished;
		howpublished = newHowpublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__HOWPUBLISHED, oldHowpublished, howpublished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsbn(String newIsbn) {
		String oldIsbn = isbn;
		isbn = newIsbn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISBN, oldIsbn, isbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssn() {
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssn(String newIssn) {
		String oldIssn = issn;
		issn = newIssn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISSN, oldIssn, issn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJournal() {
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJournal(String newJournal) {
		String oldJournal = journal;
		journal = newJournal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__JOURNAL, oldJournal, journal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(String newMonth) {
		String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizations() {
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizations(String newOrganizations) {
		String oldOrganizations = organizations;
		organizations = newOrganizations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__ORGANIZATIONS, oldOrganizations, organizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(String newPages) {
		String oldPages = pages;
		pages = newPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__PAGES, oldPages, pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportType(String newReportType) {
		String oldReportType = reportType;
		reportType = newReportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__REPORT_TYPE, oldReportType, reportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(String newSchool) {
		String oldSchool = school;
		school = newSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__SCHOOL, oldSchool, school));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(String newSeries) {
		String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__SERIES, oldSeries, series));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_MARK_TYPE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ADDRESS:
				return getAddress();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ANNOTE:
				return getAnnote();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__AUTHOR:
				return getAuthor();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE:
				return getBibliographyType();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BOOKTITLE:
				return getBooktitle();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CHAPTER:
				return getChapter();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM1:
				return getCustom1();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM2:
				return getCustom2();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM3:
				return getCustom3();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM4:
				return getCustom4();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM5:
				return getCustom5();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITION:
				return getEdition();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITOR:
				return getEditor();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__HOWPUBLISHED:
				return getHowpublished();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__IDENTIFIER:
				return getIdentifier();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__INSTITUTION:
				return getInstitution();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISBN:
				return getIsbn();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISSN:
				return getIssn();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__JOURNAL:
				return getJournal();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MONTH:
				return getMonth();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NOTE:
				return getNote();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NUMBER:
				return getNumber();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ORGANIZATIONS:
				return getOrganizations();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PAGES:
				return getPages();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PUBLISHER:
				return getPublisher();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__REPORT_TYPE:
				return getReportType();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SCHOOL:
				return getSchool();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SERIES:
				return getSeries();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__TITLE:
				return getTitle();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__URL:
				return getUrl();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__VOLUME:
				return getVolume();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ANNOTE:
				setAnnote((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE:
				setBibliographyType((TextBibliographyTypes)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BOOKTITLE:
				setBooktitle((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CHAPTER:
				setChapter((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM1:
				setCustom1((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM2:
				setCustom2((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM3:
				setCustom3((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM4:
				setCustom4((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM5:
				setCustom5((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITION:
				setEdition((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITOR:
				setEditor((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__HOWPUBLISHED:
				setHowpublished((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISBN:
				setIsbn((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISSN:
				setIssn((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__JOURNAL:
				setJournal((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MONTH:
				setMonth((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NOTE:
				setNote((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NUMBER:
				setNumber((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ORGANIZATIONS:
				setOrganizations((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PAGES:
				setPages((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__REPORT_TYPE:
				setReportType((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SCHOOL:
				setSchool((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SERIES:
				setSeries((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__URL:
				setUrl((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__VOLUME:
				setVolume((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__YEAR:
				setYear((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ANNOTE:
				setAnnote(ANNOTE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE:
				unsetBibliographyType();
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BOOKTITLE:
				setBooktitle(BOOKTITLE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CHAPTER:
				setChapter(CHAPTER_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM1:
				setCustom1(CUSTOM1_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM2:
				setCustom2(CUSTOM2_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM3:
				setCustom3(CUSTOM3_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM4:
				setCustom4(CUSTOM4_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM5:
				setCustom5(CUSTOM5_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITION:
				setEdition(EDITION_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITOR:
				setEditor(EDITOR_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__HOWPUBLISHED:
				setHowpublished(HOWPUBLISHED_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISBN:
				setIsbn(ISBN_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISSN:
				setIssn(ISSN_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__JOURNAL:
				setJournal(JOURNAL_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ORGANIZATIONS:
				setOrganizations(ORGANIZATIONS_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PAGES:
				setPages(PAGES_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__REPORT_TYPE:
				setReportType(REPORT_TYPE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SCHOOL:
				setSchool(SCHOOL_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SERIES:
				setSeries(SERIES_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ANNOTE:
				return ANNOTE_EDEFAULT == null ? annote != null : !ANNOTE_EDEFAULT.equals(annote);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BIBLIOGRAPHY_TYPE:
				return isSetBibliographyType();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__BOOKTITLE:
				return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CHAPTER:
				return CHAPTER_EDEFAULT == null ? chapter != null : !CHAPTER_EDEFAULT.equals(chapter);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM1:
				return CUSTOM1_EDEFAULT == null ? custom1 != null : !CUSTOM1_EDEFAULT.equals(custom1);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM2:
				return CUSTOM2_EDEFAULT == null ? custom2 != null : !CUSTOM2_EDEFAULT.equals(custom2);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM3:
				return CUSTOM3_EDEFAULT == null ? custom3 != null : !CUSTOM3_EDEFAULT.equals(custom3);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM4:
				return CUSTOM4_EDEFAULT == null ? custom4 != null : !CUSTOM4_EDEFAULT.equals(custom4);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__CUSTOM5:
				return CUSTOM5_EDEFAULT == null ? custom5 != null : !CUSTOM5_EDEFAULT.equals(custom5);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITION:
				return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__EDITOR:
				return EDITOR_EDEFAULT == null ? editor != null : !EDITOR_EDEFAULT.equals(editor);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__HOWPUBLISHED:
				return HOWPUBLISHED_EDEFAULT == null ? howpublished != null : !HOWPUBLISHED_EDEFAULT.equals(howpublished);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISBN:
				return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ISSN:
				return ISSN_EDEFAULT == null ? issn != null : !ISSN_EDEFAULT.equals(issn);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__JOURNAL:
				return JOURNAL_EDEFAULT == null ? journal != null : !JOURNAL_EDEFAULT.equals(journal);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__ORGANIZATIONS:
				return ORGANIZATIONS_EDEFAULT == null ? organizations != null : !ORGANIZATIONS_EDEFAULT.equals(organizations);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PAGES:
				return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__REPORT_TYPE:
				return REPORT_TYPE_EDEFAULT == null ? reportType != null : !REPORT_TYPE_EDEFAULT.equals(reportType);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SCHOOL:
				return SCHOOL_EDEFAULT == null ? school != null : !SCHOOL_EDEFAULT.equals(school);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__SERIES:
				return SERIES_EDEFAULT == null ? series != null : !SERIES_EDEFAULT.equals(series);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", address: ");
		result.append(address);
		result.append(", annote: ");
		result.append(annote);
		result.append(", author: ");
		result.append(author);
		result.append(", bibliographyType: ");
		if (bibliographyTypeESet) result.append(bibliographyType); else result.append("<unset>");
		result.append(", booktitle: ");
		result.append(booktitle);
		result.append(", chapter: ");
		result.append(chapter);
		result.append(", custom1: ");
		result.append(custom1);
		result.append(", custom2: ");
		result.append(custom2);
		result.append(", custom3: ");
		result.append(custom3);
		result.append(", custom4: ");
		result.append(custom4);
		result.append(", custom5: ");
		result.append(custom5);
		result.append(", edition: ");
		result.append(edition);
		result.append(", editor: ");
		result.append(editor);
		result.append(", howpublished: ");
		result.append(howpublished);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", institution: ");
		result.append(institution);
		result.append(", isbn: ");
		result.append(isbn);
		result.append(", issn: ");
		result.append(issn);
		result.append(", journal: ");
		result.append(journal);
		result.append(", month: ");
		result.append(month);
		result.append(", note: ");
		result.append(note);
		result.append(", number: ");
		result.append(number);
		result.append(", organizations: ");
		result.append(organizations);
		result.append(", pages: ");
		result.append(pages);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(", reportType: ");
		result.append(reportType);
		result.append(", school: ");
		result.append(school);
		result.append(", series: ");
		result.append(series);
		result.append(", title: ");
		result.append(title);
		result.append(", url: ");
		result.append(url);
		result.append(", volume: ");
		result.append(volume);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //BibliographyMarkTypeImpl
