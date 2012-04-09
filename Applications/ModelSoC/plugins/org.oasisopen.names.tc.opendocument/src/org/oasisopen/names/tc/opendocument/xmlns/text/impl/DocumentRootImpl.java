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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexEntryTemplate <em>Alphabetical Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAlphabeticalIndexSource <em>Alphabetical Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAnimationElement <em>Animation Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAnyNumber <em>Any Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getOfficeMetaData <em>Office Meta Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBibliographyConfiguration <em>Bibliography Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBibliographyEntryTemplate <em>Bibliography Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBibliographySource <em>Bibliography Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChange <em>Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChangedRegion <em>Changed Region</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChangeEnd <em>Change End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChangeStart <em>Change Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getOfficeChartContentMain <em>Office Chart Content Main</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getOfficeBodyContent <em>Office Body Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getColumnControls <em>Column Controls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getShapes3d <em>Shapes3d</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPresentationDecl <em>Presentation Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDdeConnectionDecl <em>Dde Connection Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTextSectionSourceDde <em>Text Section Source Dde</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTextChangedRegionContent <em>Text Changed Region Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPresentationAnimationElements <em>Presentation Animation Elements</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getFormatChange <em>Format Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getFormProperty <em>Form Property</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIllustrationIndexEntryTemplate <em>Illustration Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIllustrationIndexSource <em>Illustration Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexBody <em>Index Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryBibliography <em>Index Entry Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryChapter <em>Index Entry Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTextTableOfContentChildren <em>Text Table Of Content Children</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryLinkEnd <em>Index Entry Link End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryLinkStart <em>Index Entry Link Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryPageNumber <em>Index Entry Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexEntryText <em>Index Entry Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexSourceStyle <em>Index Source Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexSourceStyles <em>Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexTitle <em>Index Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getLinenumberingConfiguration <em>Linenumbering Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getLinenumberingSeparator <em>Linenumbering Separator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListHeader <em>List Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListItem <em>List Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListLevelStyleBullet <em>List Level Style Bullet</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTextListStyleContent <em>Text List Style Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListLevelStyleImage <em>List Level Style Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListLevelStyleNumber <em>List Level Style Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNoteBody <em>Note Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNoteCitation <em>Note Citation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNoteContinuationNoticeBackward <em>Note Continuation Notice Backward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNoteContinuationNoticeForward <em>Note Continuation Notice Forward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNotesConfiguration <em>Notes Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getObjectIndexEntryTemplate <em>Object Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getObjectIndexSource <em>Object Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getOutlineLevelStyle <em>Outline Level Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getOutlineStyle <em>Outline Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageSequence <em>Page Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getRubyBase <em>Ruby Base</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getRubyText <em>Ruby Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSectionSource <em>Section Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSequenceDecl <em>Sequence Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableIndexEntryTemplate <em>Table Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableIndexSource <em>Table Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableOfContentEntryTemplate <em>Table Of Content Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTableOfContentSource <em>Table Of Content Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserFieldDecl <em>User Field Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndexEntryTemplate <em>User Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getUserIndexSource <em>User Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getVariableDecl <em>Variable Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DocumentRootImpl#getWordCount <em>Word Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getNoteContinuationNoticeBackward() <em>Note Continuation Notice Backward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteContinuationNoticeBackward()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_CONTINUATION_NOTICE_BACKWARD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNoteContinuationNoticeForward() <em>Note Continuation Notice Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteContinuationNoticeForward()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_CONTINUATION_NOTICE_FORWARD_EDEFAULT = null;

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
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType getA() {
		return (AType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_A(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(AType newA, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_A(), newA, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(AType newA) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_A(), newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexType getAlphabeticalIndex() {
		return (AlphabeticalIndexType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndex(AlphabeticalIndexType newAlphabeticalIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndex(), newAlphabeticalIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndex(AlphabeticalIndexType newAlphabeticalIndex) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndex(), newAlphabeticalIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile() {
		return (AlphabeticalIndexAutoMarkFileType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexAutoMarkFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexAutoMarkFile(), newAlphabeticalIndexAutoMarkFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexAutoMarkFile(), newAlphabeticalIndexAutoMarkFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexEntryTemplateType getAlphabeticalIndexEntryTemplate() {
		return (AlphabeticalIndexEntryTemplateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexEntryTemplate(AlphabeticalIndexEntryTemplateType newAlphabeticalIndexEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexEntryTemplate(), newAlphabeticalIndexEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexEntryTemplate(AlphabeticalIndexEntryTemplateType newAlphabeticalIndexEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexEntryTemplate(), newAlphabeticalIndexEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkType getAlphabeticalIndexMark() {
		return (AlphabeticalIndexMarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMark(AlphabeticalIndexMarkType newAlphabeticalIndexMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMark(), newAlphabeticalIndexMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMark(AlphabeticalIndexMarkType newAlphabeticalIndexMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMark(), newAlphabeticalIndexMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkEndType getAlphabeticalIndexMarkEnd() {
		return (AlphabeticalIndexMarkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType newAlphabeticalIndexMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkEnd(), newAlphabeticalIndexMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType newAlphabeticalIndexMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkEnd(), newAlphabeticalIndexMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkStartType getAlphabeticalIndexMarkStart() {
		return (AlphabeticalIndexMarkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType newAlphabeticalIndexMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkStart(), newAlphabeticalIndexMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType newAlphabeticalIndexMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexMarkStart(), newAlphabeticalIndexMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexSourceType getAlphabeticalIndexSource() {
		return (AlphabeticalIndexSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexSource(AlphabeticalIndexSourceType newAlphabeticalIndexSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexSource(), newAlphabeticalIndexSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexSource(AlphabeticalIndexSourceType newAlphabeticalIndexSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AlphabeticalIndexSource(), newAlphabeticalIndexSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnimationElement() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AnimationElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimationElement(EObject newAnimationElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AnimationElement(), newAnimationElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnyNumber() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AnyNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyNumber(EObject newAnyNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AnyNumber(), newAnyNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorInitialsType getAuthorInitials() {
		return (AuthorInitialsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AuthorInitials(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorInitials(AuthorInitialsType newAuthorInitials, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AuthorInitials(), newAuthorInitials, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorInitials(AuthorInitialsType newAuthorInitials) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AuthorInitials(), newAuthorInitials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorNameType getAuthorName() {
		return (AuthorNameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_AuthorName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorName(AuthorNameType newAuthorName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_AuthorName(), newAuthorName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName(AuthorNameType newAuthorName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_AuthorName(), newAuthorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOfficeMetaData() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_OfficeMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfficeMetaData(EObject newOfficeMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_OfficeMetaData(), newOfficeMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyType getBibliography() {
		return (BibliographyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Bibliography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliography(BibliographyType newBibliography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Bibliography(), newBibliography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliography(BibliographyType newBibliography) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Bibliography(), newBibliography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyConfigurationType getBibliographyConfiguration() {
		return (BibliographyConfigurationType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BibliographyConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographyConfiguration(BibliographyConfigurationType newBibliographyConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BibliographyConfiguration(), newBibliographyConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyConfiguration(BibliographyConfigurationType newBibliographyConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BibliographyConfiguration(), newBibliographyConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyEntryTemplateType getBibliographyEntryTemplate() {
		return (BibliographyEntryTemplateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BibliographyEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographyEntryTemplate(BibliographyEntryTemplateType newBibliographyEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BibliographyEntryTemplate(), newBibliographyEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyEntryTemplate(BibliographyEntryTemplateType newBibliographyEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BibliographyEntryTemplate(), newBibliographyEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyMarkType getBibliographyMark() {
		return (BibliographyMarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BibliographyMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographyMark(BibliographyMarkType newBibliographyMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BibliographyMark(), newBibliographyMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyMark(BibliographyMarkType newBibliographyMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BibliographyMark(), newBibliographyMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographySourceType getBibliographySource() {
		return (BibliographySourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BibliographySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographySource(BibliographySourceType newBibliographySource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BibliographySource(), newBibliographySource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographySource(BibliographySourceType newBibliographySource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BibliographySource(), newBibliographySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkType getBookmark() {
		return (BookmarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Bookmark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmark(BookmarkType newBookmark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Bookmark(), newBookmark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmark(BookmarkType newBookmark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Bookmark(), newBookmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkEndType getBookmarkEnd() {
		return (BookmarkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BookmarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkEnd(BookmarkEndType newBookmarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BookmarkEnd(), newBookmarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkEnd(BookmarkEndType newBookmarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BookmarkEnd(), newBookmarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkRefType getBookmarkRef() {
		return (BookmarkRefType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BookmarkRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkRef(BookmarkRefType newBookmarkRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BookmarkRef(), newBookmarkRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkRef(BookmarkRefType newBookmarkRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BookmarkRef(), newBookmarkRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkStartType getBookmarkStart() {
		return (BookmarkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_BookmarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkStart(BookmarkStartType newBookmarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_BookmarkStart(), newBookmarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkStart(BookmarkStartType newBookmarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_BookmarkStart(), newBookmarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getControls() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Controls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControls(EObject newControls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Controls(), newControls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType getChange() {
		return (ChangeMarksType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Change(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ChangeMarksType newChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Change(), newChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(ChangeMarksType newChange) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Change(), newChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType getChangeMarks() {
		return (ChangeMarksType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ChangeMarks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeMarks(ChangeMarksType newChangeMarks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ChangeMarks(), newChangeMarks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangedRegionType getChangedRegion() {
		return (ChangedRegionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ChangedRegion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangedRegion(ChangedRegionType newChangedRegion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ChangedRegion(), newChangedRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangedRegion(ChangedRegionType newChangedRegion) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ChangedRegion(), newChangedRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType getChangeEnd() {
		return (ChangeMarksType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ChangeEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeEnd(ChangeMarksType newChangeEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ChangeEnd(), newChangeEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeEnd(ChangeMarksType newChangeEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ChangeEnd(), newChangeEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType getChangeStart() {
		return (ChangeMarksType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ChangeStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeStart(ChangeMarksType newChangeStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ChangeStart(), newChangeStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeStart(ChangeMarksType newChangeStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ChangeStart(), newChangeStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType getChapter() {
		return (ChapterType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Chapter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapter(ChapterType newChapter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Chapter(), newChapter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChapter(ChapterType newChapter) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Chapter(), newChapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterCountType getCharacterCount() {
		return (CharacterCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_CharacterCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterCount(CharacterCountType newCharacterCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_CharacterCount(), newCharacterCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterCount(CharacterCountType newCharacterCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_CharacterCount(), newCharacterCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeChartContentMainType getOfficeChartContentMain() {
		return (OfficeChartContentMainType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_OfficeChartContentMain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfficeChartContentMain(OfficeChartContentMainType newOfficeChartContentMain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_OfficeChartContentMain(), newOfficeChartContentMain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOfficeBodyContent() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_OfficeBodyContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfficeBodyContent(EObject newOfficeBodyContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_OfficeBodyContent(), newOfficeBodyContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getColumnControls() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ColumnControls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnControls(EObject newColumnControls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ColumnControls(), newColumnControls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTextType getConditionalText() {
		return (ConditionalTextType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ConditionalText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalText(ConditionalTextType newConditionalText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ConditionalText(), newConditionalText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalText(ConditionalTextType newConditionalText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ConditionalText(), newConditionalText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationDateType getCreationDate() {
		return (CreationDateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_CreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(CreationDateType newCreationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_CreationDate(), newCreationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(CreationDateType newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_CreationDate(), newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType getCreationTime() {
		return (CreationTimeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_CreationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationTime(CreationTimeType newCreationTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_CreationTime(), newCreationTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(CreationTimeType newCreationTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_CreationTime(), newCreationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatorType getCreator() {
		return (CreatorType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Creator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(CreatorType newCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Creator(), newCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(CreatorType newCreator) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Creator(), newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getShapes3d() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Shapes3d(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes3d(EObject newShapes3d, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Shapes3d(), newShapes3d, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseDisplayAttlist getDatabaseDisplay() {
		return (TextDatabaseDisplayAttlist)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DatabaseDisplay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseDisplay(TextDatabaseDisplayAttlist newDatabaseDisplay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DatabaseDisplay(), newDatabaseDisplay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseDisplay(TextDatabaseDisplayAttlist newDatabaseDisplay) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DatabaseDisplay(), newDatabaseDisplay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseNameType getDatabaseName() {
		return (DatabaseNameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DatabaseName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseName(DatabaseNameType newDatabaseName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DatabaseName(), newDatabaseName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(DatabaseNameType newDatabaseName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DatabaseName(), newDatabaseName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseNextAttlist getDatabaseNext() {
		return (TextDatabaseNextAttlist)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DatabaseNext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseNext(TextDatabaseNextAttlist newDatabaseNext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DatabaseNext(), newDatabaseNext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseNext(TextDatabaseNextAttlist newDatabaseNext) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DatabaseNext(), newDatabaseNext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRowNumberType getDatabaseRowNumber() {
		return (DatabaseRowNumberType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRowNumber(DatabaseRowNumberType newDatabaseRowNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowNumber(), newDatabaseRowNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRowNumber(DatabaseRowNumberType newDatabaseRowNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowNumber(), newDatabaseRowNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseRowSelectAttlist getDatabaseRowSelect() {
		return (TextDatabaseRowSelectAttlist)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowSelect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRowSelect(TextDatabaseRowSelectAttlist newDatabaseRowSelect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowSelect(), newDatabaseRowSelect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRowSelect(TextDatabaseRowSelectAttlist newDatabaseRowSelect) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DatabaseRowSelect(), newDatabaseRowSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return (DateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPresentationDecl() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PresentationDecl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationDecl(EObject newPresentationDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PresentationDecl(), newPresentationDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionType getDdeConnection() {
		return (DdeConnectionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DdeConnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnection(DdeConnectionType newDdeConnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DdeConnection(), newDdeConnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnection(DdeConnectionType newDdeConnection) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DdeConnection(), newDdeConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclType getDdeConnectionDecl() {
		return (DdeConnectionDeclType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnectionDecl(DdeConnectionDeclType newDdeConnectionDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecl(), newDdeConnectionDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnectionDecl(DdeConnectionDeclType newDdeConnectionDecl) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecl(), newDdeConnectionDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclsType getDdeConnectionDecls() {
		return (DdeConnectionDeclsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecls(), newDdeConnectionDecls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_DdeConnectionDecls(), newDdeConnectionDecls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType getTextSectionSourceDde() {
		return (TextSectionSourceDdeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TextSectionSourceDde(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextSectionSourceDde(TextSectionSourceDdeType newTextSectionSourceDde, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TextSectionSourceDde(), newTextSectionSourceDde, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionType getDeletion() {
		return (DeletionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Deletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletion(DeletionType newDeletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Deletion(), newDeletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletion(DeletionType newDeletion) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Deletion(), newDeletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTextChangedRegionContent() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TextChangedRegionContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextChangedRegionContent(EObject newTextChangedRegionContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TextChangedRegionContent(), newTextChangedRegionContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPresentationAnimationElements() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PresentationAnimationElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationAnimationElements(EObject newPresentationAnimationElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PresentationAnimationElements(), newPresentationAnimationElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingCyclesType getEditingCycles() {
		return (EditingCyclesType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_EditingCycles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditingCycles(EditingCyclesType newEditingCycles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_EditingCycles(), newEditingCycles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingCycles(EditingCyclesType newEditingCycles) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_EditingCycles(), newEditingCycles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDurationType getEditingDuration() {
		return (EditingDurationType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_EditingDuration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditingDuration(EditingDurationType newEditingDuration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_EditingDuration(), newEditingDuration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingDuration(EditingDurationType newEditingDuration) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_EditingDuration(), newEditingDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteMacroType getExecuteMacro() {
		return (ExecuteMacroType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ExecuteMacro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecuteMacro(ExecuteMacroType newExecuteMacro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ExecuteMacro(), newExecuteMacro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteMacro(ExecuteMacroType newExecuteMacro) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ExecuteMacro(), newExecuteMacro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpression() {
		return (ExpressionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ExpressionType newExpression) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameType getFileName() {
		return (FileNameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_FileName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName(FileNameType newFileName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_FileName(), newFileName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(FileNameType newFileName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_FileName(), newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatChangeType getFormatChange() {
		return (FormatChangeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_FormatChange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormatChange(FormatChangeType newFormatChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_FormatChange(), newFormatChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatChange(FormatChangeType newFormatChange) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_FormatChange(), newFormatChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFormProperty() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_FormProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormProperty(EObject newFormProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_FormProperty(), newFormProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HType getH() {
		return (HType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_H(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH(HType newH, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_H(), newH, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(HType newH) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_H(), newH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenParagraphType getHiddenParagraph() {
		return (HiddenParagraphType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_HiddenParagraph(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiddenParagraph(HiddenParagraphType newHiddenParagraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_HiddenParagraph(), newHiddenParagraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenParagraph(HiddenParagraphType newHiddenParagraph) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_HiddenParagraph(), newHiddenParagraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenTextType getHiddenText() {
		return (HiddenTextType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_HiddenText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiddenText(HiddenTextType newHiddenText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_HiddenText(), newHiddenText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenText(HiddenTextType newHiddenText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_HiddenText(), newHiddenText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllustrationIndexType getIllustrationIndex() {
		return (IllustrationIndexType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIllustrationIndex(IllustrationIndexType newIllustrationIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndex(), newIllustrationIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIllustrationIndex(IllustrationIndexType newIllustrationIndex) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndex(), newIllustrationIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent getIllustrationIndexEntryTemplate() {
		return (TextIllustrationIndexEntryContent)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent newIllustrationIndexEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexEntryTemplate(), newIllustrationIndexEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent newIllustrationIndexEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexEntryTemplate(), newIllustrationIndexEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllustrationIndexSourceType getIllustrationIndexSource() {
		return (IllustrationIndexSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIllustrationIndexSource(IllustrationIndexSourceType newIllustrationIndexSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexSource(), newIllustrationIndexSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIllustrationIndexSource(IllustrationIndexSourceType newIllustrationIndexSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IllustrationIndexSource(), newIllustrationIndexSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCountType getImageCount() {
		return (ImageCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ImageCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCount(ImageCountType newImageCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ImageCount(), newImageCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCount(ImageCountType newImageCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ImageCount(), newImageCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexBodyType getIndexBody() {
		return (IndexBodyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexBody(IndexBodyType newIndexBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexBody(), newIndexBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexBody(IndexBodyType newIndexBody) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexBody(), newIndexBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryBibliographyType getIndexEntryBibliography() {
		return (IndexEntryBibliographyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryBibliography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryBibliography(IndexEntryBibliographyType newIndexEntryBibliography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryBibliography(), newIndexEntryBibliography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryBibliography(IndexEntryBibliographyType newIndexEntryBibliography) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryBibliography(), newIndexEntryBibliography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryChapterType getIndexEntryChapter() {
		return (IndexEntryChapterType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryChapter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryChapter(IndexEntryChapterType newIndexEntryChapter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryChapter(), newIndexEntryChapter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryChapter(IndexEntryChapterType newIndexEntryChapter) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryChapter(), newIndexEntryChapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTextTableOfContentChildren() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TextTableOfContentChildren(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextTableOfContentChildren(EObject newTextTableOfContentChildren, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TextTableOfContentChildren(), newTextTableOfContentChildren, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryLinkEndType getIndexEntryLinkEnd() {
		return (IndexEntryLinkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryLinkEnd(IndexEntryLinkEndType newIndexEntryLinkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkEnd(), newIndexEntryLinkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryLinkEnd(IndexEntryLinkEndType newIndexEntryLinkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkEnd(), newIndexEntryLinkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryLinkStartType getIndexEntryLinkStart() {
		return (IndexEntryLinkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryLinkStart(IndexEntryLinkStartType newIndexEntryLinkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkStart(), newIndexEntryLinkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryLinkStart(IndexEntryLinkStartType newIndexEntryLinkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryLinkStart(), newIndexEntryLinkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryPageNumberType getIndexEntryPageNumber() {
		return (IndexEntryPageNumberType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryPageNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryPageNumber(IndexEntryPageNumberType newIndexEntryPageNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryPageNumber(), newIndexEntryPageNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryPageNumber(IndexEntryPageNumberType newIndexEntryPageNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryPageNumber(), newIndexEntryPageNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntrySpanType getIndexEntrySpan() {
		return (IndexEntrySpanType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntrySpan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntrySpan(IndexEntrySpanType newIndexEntrySpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntrySpan(), newIndexEntrySpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntrySpan(IndexEntrySpanType newIndexEntrySpan) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntrySpan(), newIndexEntrySpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryTabStopType getIndexEntryTabStop() {
		return (IndexEntryTabStopType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryTabStop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryTabStop(IndexEntryTabStopType newIndexEntryTabStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryTabStop(), newIndexEntryTabStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryTabStop(IndexEntryTabStopType newIndexEntryTabStop) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryTabStop(), newIndexEntryTabStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryTextType getIndexEntryText() {
		return (IndexEntryTextType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexEntryText(IndexEntryTextType newIndexEntryText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryText(), newIndexEntryText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexEntryText(IndexEntryTextType newIndexEntryText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexEntryText(), newIndexEntryText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSourceStyleType getIndexSourceStyle() {
		return (IndexSourceStyleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexSourceStyle(IndexSourceStyleType newIndexSourceStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyle(), newIndexSourceStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexSourceStyle(IndexSourceStyleType newIndexSourceStyle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyle(), newIndexSourceStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSourceStylesType getIndexSourceStyles() {
		return (IndexSourceStylesType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexSourceStyles(IndexSourceStylesType newIndexSourceStyles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyles(), newIndexSourceStyles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexSourceStyles(IndexSourceStylesType newIndexSourceStyles) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexSourceStyles(), newIndexSourceStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleType getIndexTitle() {
		return (IndexTitleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTitle(IndexTitleType newIndexTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexTitle(), newIndexTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexTitle(IndexTitleType newIndexTitle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexTitle(), newIndexTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleTemplateType getIndexTitleTemplate() {
		return (IndexTitleTemplateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_IndexTitleTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_IndexTitleTemplate(), newIndexTitleTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_IndexTitleTemplate(), newIndexTitleTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialCreatorType getInitialCreator() {
		return (InitialCreatorType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_InitialCreator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCreator(InitialCreatorType newInitialCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_InitialCreator(), newInitialCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCreator(InitialCreatorType newInitialCreator) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_InitialCreator(), newInitialCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionType getInsertion() {
		return (InsertionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Insertion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertion(InsertionType newInsertion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Insertion(), newInsertion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertion(InsertionType newInsertion) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Insertion(), newInsertion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsType getKeywords() {
		return (KeywordsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Keywords(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(KeywordsType newKeywords, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Keywords(), newKeywords, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(KeywordsType newKeywords) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Keywords(), newKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType getLineBreak() {
		return (LineBreakType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_LineBreak(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineBreak(LineBreakType newLineBreak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_LineBreak(), newLineBreak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(LineBreakType newLineBreak) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_LineBreak(), newLineBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingConfigurationType getLinenumberingConfiguration() {
		return (LinenumberingConfigurationType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinenumberingConfiguration(LinenumberingConfigurationType newLinenumberingConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingConfiguration(), newLinenumberingConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinenumberingConfiguration(LinenumberingConfigurationType newLinenumberingConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingConfiguration(), newLinenumberingConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingSeparatorType getLinenumberingSeparator() {
		return (LinenumberingSeparatorType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingSeparator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinenumberingSeparator(LinenumberingSeparatorType newLinenumberingSeparator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingSeparator(), newLinenumberingSeparator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinenumberingSeparator(LinenumberingSeparatorType newLinenumberingSeparator) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_LinenumberingSeparator(), newLinenumberingSeparator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType getList() {
		return (ListType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListItemContent getListHeader() {
		return (TextListItemContent)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListHeader(TextListItemContent newListHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListHeader(), newListHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListHeader(TextListItemContent newListHeader) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListHeader(), newListHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemType getListItem() {
		return (ListItemType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListItem(ListItemType newListItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListItem(), newListItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListItem(ListItemType newListItem) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListItem(), newListItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleBulletType getListLevelStyleBullet() {
		return (ListLevelStyleBulletType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleBullet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListLevelStyleBullet(ListLevelStyleBulletType newListLevelStyleBullet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleBullet(), newListLevelStyleBullet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListLevelStyleBullet(ListLevelStyleBulletType newListLevelStyleBullet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleBullet(), newListLevelStyleBullet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTextListStyleContent() {
		return (EObject)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TextListStyleContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextListStyleContent(EObject newTextListStyleContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TextListStyleContent(), newTextListStyleContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleImageType getListLevelStyleImage() {
		return (ListLevelStyleImageType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleImage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListLevelStyleImage(ListLevelStyleImageType newListLevelStyleImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleImage(), newListLevelStyleImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListLevelStyleImage(ListLevelStyleImageType newListLevelStyleImage) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleImage(), newListLevelStyleImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleNumberType getListLevelStyleNumber() {
		return (ListLevelStyleNumberType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListLevelStyleNumber(ListLevelStyleNumberType newListLevelStyleNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleNumber(), newListLevelStyleNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListLevelStyleNumber(ListLevelStyleNumberType newListLevelStyleNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListLevelStyleNumber(), newListLevelStyleNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleType getListStyle() {
		return (ListStyleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ListStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(ListStyleType newListStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ListStyle(), newListStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyle(ListStyleType newListStyle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ListStyle(), newListStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType getModificationDate() {
		return (ModificationDateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ModificationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationDate(ModificationDateType newModificationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ModificationDate(), newModificationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(ModificationDateType newModificationDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ModificationDate(), newModificationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationTimeType getModificationTime() {
		return (ModificationTimeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ModificationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationTime(ModificationTimeType newModificationTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ModificationTime(), newModificationTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationTime(ModificationTimeType newModificationTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ModificationTime(), newModificationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType getNote() {
		return (NoteType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Note(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Note(), newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Note(), newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteBodyType getNoteBody() {
		return (NoteBodyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NoteBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteBody(NoteBodyType newNoteBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_NoteBody(), newNoteBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteBody(NoteBodyType newNoteBody) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NoteBody(), newNoteBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteCitationType getNoteCitation() {
		return (NoteCitationType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NoteCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteCitation(NoteCitationType newNoteCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_NoteCitation(), newNoteCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteCitation(NoteCitationType newNoteCitation) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NoteCitation(), newNoteCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoteContinuationNoticeBackward() {
		return (String)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NoteContinuationNoticeBackward(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteContinuationNoticeBackward(String newNoteContinuationNoticeBackward) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NoteContinuationNoticeBackward(), newNoteContinuationNoticeBackward);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoteContinuationNoticeForward() {
		return (String)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NoteContinuationNoticeForward(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteContinuationNoticeForward(String newNoteContinuationNoticeForward) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NoteContinuationNoticeForward(), newNoteContinuationNoticeForward);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteRefType getNoteRef() {
		return (NoteRefType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NoteRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteRef(NoteRefType newNoteRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_NoteRef(), newNoteRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteRef(NoteRefType newNoteRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NoteRef(), newNoteRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextNotesConfigurationContent getNotesConfiguration() {
		return (TextNotesConfigurationContent)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NotesConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotesConfiguration(TextNotesConfigurationContent newNotesConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_NotesConfiguration(), newNotesConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotesConfiguration(TextNotesConfigurationContent newNotesConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NotesConfiguration(), newNotesConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return (String)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Number(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Number(), newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberedParagraphType getNumberedParagraph() {
		return (NumberedParagraphType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_NumberedParagraph(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberedParagraph(NumberedParagraphType newNumberedParagraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_NumberedParagraph(), newNumberedParagraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberedParagraph(NumberedParagraphType newNumberedParagraph) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_NumberedParagraph(), newNumberedParagraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCountType getObjectCount() {
		return (ObjectCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ObjectCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectCount(ObjectCountType newObjectCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ObjectCount(), newObjectCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectCount(ObjectCountType newObjectCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ObjectCount(), newObjectCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIndexType getObjectIndex() {
		return (ObjectIndexType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIndex(ObjectIndexType newObjectIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndex(), newObjectIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIndex(ObjectIndexType newObjectIndex) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndex(), newObjectIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent getObjectIndexEntryTemplate() {
		return (TextIllustrationIndexEntryContent)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIndexEntryTemplate(TextIllustrationIndexEntryContent newObjectIndexEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexEntryTemplate(), newObjectIndexEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIndexEntryTemplate(TextIllustrationIndexEntryContent newObjectIndexEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexEntryTemplate(), newObjectIndexEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIndexSourceType getObjectIndexSource() {
		return (ObjectIndexSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIndexSource(ObjectIndexSourceType newObjectIndexSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexSource(), newObjectIndexSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIndexSource(ObjectIndexSourceType newObjectIndexSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ObjectIndexSource(), newObjectIndexSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineLevelStyleType getOutlineLevelStyle() {
		return (OutlineLevelStyleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_OutlineLevelStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutlineLevelStyle(OutlineLevelStyleType newOutlineLevelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_OutlineLevelStyle(), newOutlineLevelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevelStyle(OutlineLevelStyleType newOutlineLevelStyle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_OutlineLevelStyle(), newOutlineLevelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineStyleType getOutlineStyle() {
		return (OutlineStyleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_OutlineStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutlineStyle(OutlineStyleType newOutlineStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_OutlineStyle(), newOutlineStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineStyle(OutlineStyleType newOutlineStyle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_OutlineStyle(), newOutlineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType getP() {
		return (PType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_P(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PType newP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_P(), newP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(PType newP) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_P(), newP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType getPage() {
		return (PageType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Page(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(PageType newPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Page(), newPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(PageType newPage) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Page(), newPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageContinuationType getPageContinuation() {
		return (PageContinuationType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageContinuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageContinuation(PageContinuationType newPageContinuation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageContinuation(), newPageContinuation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageContinuation(PageContinuationType newPageContinuation) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageContinuation(), newPageContinuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageCountType getPageCount() {
		return (PageCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(PageCountType newPageCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageCount(), newPageCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageCount(PageCountType newPageCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageCount(), newPageCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageNumberType getPageNumber() {
		return (PageNumberType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageNumber(PageNumberType newPageNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageNumber(), newPageNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNumber(PageNumberType newPageNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageNumber(), newPageNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageSequenceType getPageSequence() {
		return (PageSequenceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageSequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageSequence(PageSequenceType newPageSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageSequence(), newPageSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageSequence(PageSequenceType newPageSequence) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageSequence(), newPageSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableGetType getPageVariableGet() {
		return (PageVariableGetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageVariableGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageVariableGet(PageVariableGetType newPageVariableGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageVariableGet(), newPageVariableGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageVariableGet(PageVariableGetType newPageVariableGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageVariableGet(), newPageVariableGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableSetType getPageVariableSet() {
		return (PageVariableSetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PageVariableSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageVariableSet(PageVariableSetType newPageVariableSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PageVariableSet(), newPageVariableSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageVariableSet(PageVariableSetType newPageVariableSet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PageVariableSet(), newPageVariableSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphCountType getParagraphCount() {
		return (ParagraphCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ParagraphCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphCount(ParagraphCountType newParagraphCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ParagraphCount(), newParagraphCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphCount(ParagraphCountType newParagraphCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ParagraphCount(), newParagraphCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderType getPlaceholder() {
		return (PlaceholderType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Placeholder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlaceholder(PlaceholderType newPlaceholder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Placeholder(), newPlaceholder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(PlaceholderType newPlaceholder) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Placeholder(), newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintDateType getPrintDate() {
		return (PrintDateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PrintDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintDate(PrintDateType newPrintDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PrintDate(), newPrintDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintDate(PrintDateType newPrintDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PrintDate(), newPrintDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintedByType getPrintedBy() {
		return (PrintedByType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PrintedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintedBy(PrintedByType newPrintedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PrintedBy(), newPrintedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintedBy(PrintedByType newPrintedBy) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PrintedBy(), newPrintedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTimeType getPrintTime() {
		return (PrintTimeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_PrintTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintTime(PrintTimeType newPrintTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_PrintTime(), newPrintTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintTime(PrintTimeType newPrintTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_PrintTime(), newPrintTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkType getReferenceMark() {
		return (ReferenceMarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMark(ReferenceMarkType newReferenceMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMark(), newReferenceMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMark(ReferenceMarkType newReferenceMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMark(), newReferenceMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkEndType getReferenceMarkEnd() {
		return (ReferenceMarkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMarkEnd(ReferenceMarkEndType newReferenceMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkEnd(), newReferenceMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMarkEnd(ReferenceMarkEndType newReferenceMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkEnd(), newReferenceMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkStartType getReferenceMarkStart() {
		return (ReferenceMarkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMarkStart(ReferenceMarkStartType newReferenceMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkStart(), newReferenceMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMarkStart(ReferenceMarkStartType newReferenceMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ReferenceMarkStart(), newReferenceMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRefType getReferenceRef() {
		return (ReferenceRefType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_ReferenceRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceRef(ReferenceRefType newReferenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_ReferenceRef(), newReferenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceRef(ReferenceRefType newReferenceRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_ReferenceRef(), newReferenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyType getRuby() {
		return (RubyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Ruby(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyType newRuby, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Ruby(), newRuby, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuby(RubyType newRuby) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Ruby(), newRuby);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyBaseType getRubyBase() {
		return (RubyBaseType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_RubyBase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyBase(RubyBaseType newRubyBase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_RubyBase(), newRubyBase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyBase(RubyBaseType newRubyBase) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_RubyBase(), newRubyBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType getRubyText() {
		return (RubyTextType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_RubyText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyText(RubyTextType newRubyText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_RubyText(), newRubyText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyText(RubyTextType newRubyText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_RubyText(), newRubyText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SType getS() {
		return (SType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_S(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS(SType newS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_S(), newS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(SType newS) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_S(), newS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Script(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Script(), newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Script(), newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionType getSection() {
		return (SectionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Section(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSection(SectionType newSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Section(), newSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(SectionType newSection) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Section(), newSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionSourceType getSectionSource() {
		return (SectionSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SectionSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionSource(SectionSourceType newSectionSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SectionSource(), newSectionSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionSource(SectionSourceType newSectionSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SectionSource(), newSectionSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCityType getSenderCity() {
		return (SenderCityType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderCity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCity(SenderCityType newSenderCity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderCity(), newSenderCity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCity(SenderCityType newSenderCity) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderCity(), newSenderCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCompanyType getSenderCompany() {
		return (SenderCompanyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderCompany(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCompany(SenderCompanyType newSenderCompany, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderCompany(), newSenderCompany, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCompany(SenderCompanyType newSenderCompany) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderCompany(), newSenderCompany);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCountryType getSenderCountry() {
		return (SenderCountryType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderCountry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCountry(SenderCountryType newSenderCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderCountry(), newSenderCountry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCountry(SenderCountryType newSenderCountry) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderCountry(), newSenderCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderEmailType getSenderEmail() {
		return (SenderEmailType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderEmail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderEmail(SenderEmailType newSenderEmail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderEmail(), newSenderEmail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderEmail(SenderEmailType newSenderEmail) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderEmail(), newSenderEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFaxType getSenderFax() {
		return (SenderFaxType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderFax(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderFax(SenderFaxType newSenderFax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderFax(), newSenderFax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderFax(SenderFaxType newSenderFax) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderFax(), newSenderFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFirstnameType getSenderFirstname() {
		return (SenderFirstnameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderFirstname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderFirstname(SenderFirstnameType newSenderFirstname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderFirstname(), newSenderFirstname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderFirstname(SenderFirstnameType newSenderFirstname) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderFirstname(), newSenderFirstname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderInitialsType getSenderInitials() {
		return (SenderInitialsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderInitials(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderInitials(SenderInitialsType newSenderInitials, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderInitials(), newSenderInitials, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderInitials(SenderInitialsType newSenderInitials) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderInitials(), newSenderInitials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderLastnameType getSenderLastname() {
		return (SenderLastnameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderLastname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderLastname(SenderLastnameType newSenderLastname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderLastname(), newSenderLastname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderLastname(SenderLastnameType newSenderLastname) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderLastname(), newSenderLastname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhonePrivateType getSenderPhonePrivate() {
		return (SenderPhonePrivateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderPhonePrivate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPhonePrivate(SenderPhonePrivateType newSenderPhonePrivate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderPhonePrivate(), newSenderPhonePrivate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPhonePrivate(SenderPhonePrivateType newSenderPhonePrivate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderPhonePrivate(), newSenderPhonePrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhoneWorkType getSenderPhoneWork() {
		return (SenderPhoneWorkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderPhoneWork(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPhoneWork(SenderPhoneWorkType newSenderPhoneWork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderPhoneWork(), newSenderPhoneWork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPhoneWork(SenderPhoneWorkType newSenderPhoneWork) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderPhoneWork(), newSenderPhoneWork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPositionType getSenderPosition() {
		return (SenderPositionType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPosition(SenderPositionType newSenderPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderPosition(), newSenderPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPosition(SenderPositionType newSenderPosition) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderPosition(), newSenderPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPostalCodeType getSenderPostalCode() {
		return (SenderPostalCodeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderPostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPostalCode(SenderPostalCodeType newSenderPostalCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderPostalCode(), newSenderPostalCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPostalCode(SenderPostalCodeType newSenderPostalCode) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderPostalCode(), newSenderPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStateOrProvinceType getSenderStateOrProvince() {
		return (SenderStateOrProvinceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderStateOrProvince(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderStateOrProvince(SenderStateOrProvinceType newSenderStateOrProvince, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderStateOrProvince(), newSenderStateOrProvince, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderStateOrProvince(SenderStateOrProvinceType newSenderStateOrProvince) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderStateOrProvince(), newSenderStateOrProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStreetType getSenderStreet() {
		return (SenderStreetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderStreet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderStreet(SenderStreetType newSenderStreet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderStreet(), newSenderStreet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderStreet(SenderStreetType newSenderStreet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderStreet(), newSenderStreet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderTitleType getSenderTitle() {
		return (SenderTitleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SenderTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderTitle(SenderTitleType newSenderTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SenderTitle(), newSenderTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderTitle(SenderTitleType newSenderTitle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SenderTitle(), newSenderTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType getSequence() {
		return (SequenceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Sequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(SequenceType newSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Sequence(), newSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(SequenceType newSequence) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Sequence(), newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclType getSequenceDecl() {
		return (SequenceDeclType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDecl(SequenceDeclType newSequenceDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecl(), newSequenceDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDecl(SequenceDeclType newSequenceDecl) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecl(), newSequenceDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclsType getSequenceDecls() {
		return (SequenceDeclsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDecls(SequenceDeclsType newSequenceDecls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecls(), newSequenceDecls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDecls(SequenceDeclsType newSequenceDecls) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SequenceDecls(), newSequenceDecls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRefType getSequenceRef() {
		return (SequenceRefType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SequenceRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceRef(SequenceRefType newSequenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SequenceRef(), newSequenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceRef(SequenceRefType newSequenceRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SequenceRef(), newSequenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return (String)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SheetName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SheetName(), newSheetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPageBreakType getSoftPageBreak() {
		return (SoftPageBreakType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SoftPageBreak(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftPageBreak(SoftPageBreakType newSoftPageBreak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SoftPageBreak(), newSoftPageBreak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftPageBreak(SoftPageBreakType newSoftPageBreak) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SoftPageBreak(), newSoftPageBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortKeyType getSortKey() {
		return (SortKeyType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_SortKey(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortKey(SortKeyType newSortKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_SortKey(), newSortKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(SortKeyType newSortKey) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_SortKey(), newSortKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType getSpan() {
		return (SpanType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Span(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(SpanType newSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Span(), newSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(SpanType newSpan) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Span(), newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectType getSubject() {
		return (SubjectType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectType newSubject) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabType getTab() {
		return (TabType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Tab(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTab(TabType newTab, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Tab(), newTab, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(TabType newTab) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Tab(), newTab);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCountType getTableCount() {
		return (TableCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCount(TableCountType newTableCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableCount(), newTableCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCount(TableCountType newTableCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableCount(), newTableCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFormulaType getTableFormula() {
		return (TableFormulaType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableFormula(TableFormulaType newTableFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableFormula(), newTableFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableFormula(TableFormulaType newTableFormula) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableFormula(), newTableFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIndexType getTableIndex() {
		return (TableIndexType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableIndex(TableIndexType newTableIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableIndex(), newTableIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableIndex(TableIndexType newTableIndex) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableIndex(), newTableIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent getTableIndexEntryTemplate() {
		return (TextIllustrationIndexEntryContent)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableIndexEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableIndexEntryTemplate(TextIllustrationIndexEntryContent newTableIndexEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableIndexEntryTemplate(), newTableIndexEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableIndexEntryTemplate(TextIllustrationIndexEntryContent newTableIndexEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableIndexEntryTemplate(), newTableIndexEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIndexSourceType getTableIndexSource() {
		return (TableIndexSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableIndexSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableIndexSource(TableIndexSourceType newTableIndexSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableIndexSource(), newTableIndexSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableIndexSource(TableIndexSourceType newTableIndexSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableIndexSource(), newTableIndexSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentType getTableOfContent() {
		return (TableOfContentType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableOfContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContent(TableOfContentType newTableOfContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableOfContent(), newTableOfContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfContent(TableOfContentType newTableOfContent) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableOfContent(), newTableOfContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentEntryTemplateType getTableOfContentEntryTemplate() {
		return (TableOfContentEntryTemplateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContentEntryTemplate(TableOfContentEntryTemplateType newTableOfContentEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentEntryTemplate(), newTableOfContentEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfContentEntryTemplate(TableOfContentEntryTemplateType newTableOfContentEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentEntryTemplate(), newTableOfContentEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentSourceType getTableOfContentSource() {
		return (TableOfContentSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContentSource(TableOfContentSourceType newTableOfContentSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentSource(), newTableOfContentSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfContentSource(TableOfContentSourceType newTableOfContentSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TableOfContentSource(), newTableOfContentSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateNameType getTemplateName() {
		return (TemplateNameType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TemplateName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateName(TemplateNameType newTemplateName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TemplateName(), newTemplateName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(TemplateNameType newTemplateName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TemplateName(), newTemplateName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType getTextInput() {
		return (TextInputType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TextInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextInput(TextInputType newTextInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TextInput(), newTextInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextInput(TextInputType newTextInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TextInput(), newTextInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTime() {
		return (TimeType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Time(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeType newTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Time(), newTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeType newTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Time(), newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkType getTocMark() {
		return (TocMarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TocMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMark(TocMarkType newTocMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TocMark(), newTocMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMark(TocMarkType newTocMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TocMark(), newTocMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkEndType getTocMarkEnd() {
		return (TocMarkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TocMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMarkEnd(TocMarkEndType newTocMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TocMarkEnd(), newTocMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMarkEnd(TocMarkEndType newTocMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TocMarkEnd(), newTocMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkStartType getTocMarkStart() {
		return (TocMarkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TocMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMarkStart(TocMarkStartType newTocMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TocMarkStart(), newTocMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMarkStart(TocMarkStartType newTocMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TocMarkStart(), newTocMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType getTrackedChanges() {
		return (TrackedChangesType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_TrackedChanges(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackedChanges(TrackedChangesType newTrackedChanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_TrackedChanges(), newTrackedChanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedChanges(TrackedChangesType newTrackedChanges) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_TrackedChanges(), newTrackedChanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType getUserDefined() {
		return (UserDefinedType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserDefined(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefined(UserDefinedType newUserDefined, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserDefined(), newUserDefined, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(UserDefinedType newUserDefined) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserDefined(), newUserDefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclType getUserFieldDecl() {
		return (UserFieldDeclType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldDecl(UserFieldDeclType newUserFieldDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecl(), newUserFieldDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldDecl(UserFieldDeclType newUserFieldDecl) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecl(), newUserFieldDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclsType getUserFieldDecls() {
		return (UserFieldDeclsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldDecls(UserFieldDeclsType newUserFieldDecls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecls(), newUserFieldDecls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldDecls(UserFieldDeclsType newUserFieldDecls) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserFieldDecls(), newUserFieldDecls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldGetType getUserFieldGet() {
		return (UserFieldGetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserFieldGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldGet(UserFieldGetType newUserFieldGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserFieldGet(), newUserFieldGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldGet(UserFieldGetType newUserFieldGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserFieldGet(), newUserFieldGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldInputType getUserFieldInput() {
		return (UserFieldInputType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserFieldInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldInput(UserFieldInputType newUserFieldInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserFieldInput(), newUserFieldInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldInput(UserFieldInputType newUserFieldInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserFieldInput(), newUserFieldInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexType getUserIndex() {
		return (UserIndexType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndex(UserIndexType newUserIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndex(), newUserIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndex(UserIndexType newUserIndex) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndex(), newUserIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexEntryTemplateType getUserIndexEntryTemplate() {
		return (UserIndexEntryTemplateType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndexEntryTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexEntryTemplate(UserIndexEntryTemplateType newUserIndexEntryTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndexEntryTemplate(), newUserIndexEntryTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexEntryTemplate(UserIndexEntryTemplateType newUserIndexEntryTemplate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndexEntryTemplate(), newUserIndexEntryTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkType getUserIndexMark() {
		return (UserIndexMarkType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMark(UserIndexMarkType newUserIndexMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMark(), newUserIndexMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMark(UserIndexMarkType newUserIndexMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMark(), newUserIndexMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkEndType getUserIndexMarkEnd() {
		return (UserIndexMarkEndType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMarkEnd(UserIndexMarkEndType newUserIndexMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkEnd(), newUserIndexMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMarkEnd(UserIndexMarkEndType newUserIndexMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkEnd(), newUserIndexMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkStartType getUserIndexMarkStart() {
		return (UserIndexMarkStartType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMarkStart(UserIndexMarkStartType newUserIndexMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkStart(), newUserIndexMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMarkStart(UserIndexMarkStartType newUserIndexMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndexMarkStart(), newUserIndexMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexSourceType getUserIndexSource() {
		return (UserIndexSourceType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_UserIndexSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexSource(UserIndexSourceType newUserIndexSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_UserIndexSource(), newUserIndexSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexSource(UserIndexSourceType newUserIndexSource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_UserIndexSource(), newUserIndexSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclType getVariableDecl() {
		return (VariableDeclType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_VariableDecl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDecl(VariableDeclType newVariableDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_VariableDecl(), newVariableDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDecl(VariableDeclType newVariableDecl) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_VariableDecl(), newVariableDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclsType getVariableDecls() {
		return (VariableDeclsType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_VariableDecls(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDecls(VariableDeclsType newVariableDecls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_VariableDecls(), newVariableDecls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDecls(VariableDeclsType newVariableDecls) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_VariableDecls(), newVariableDecls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGetType getVariableGet() {
		return (VariableGetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_VariableGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableGet(VariableGetType newVariableGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_VariableGet(), newVariableGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableGet(VariableGetType newVariableGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_VariableGet(), newVariableGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInputType getVariableInput() {
		return (VariableInputType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_VariableInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableInput(VariableInputType newVariableInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_VariableInput(), newVariableInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableInput(VariableInputType newVariableInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_VariableInput(), newVariableInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSetType getVariableSet() {
		return (VariableSetType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_VariableSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSet(VariableSetType newVariableSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_VariableSet(), newVariableSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSet(VariableSetType newVariableSet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_VariableSet(), newVariableSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordCountType getWordCount() {
		return (WordCountType)getMixed().get(TextPackage.eINSTANCE.getDocumentRoot_WordCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordCount(WordCountType newWordCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDocumentRoot_WordCount(), newWordCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordCount(WordCountType newWordCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDocumentRoot_WordCount(), newWordCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TextPackage.DOCUMENT_ROOT__A:
				return basicSetA(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX:
				return basicSetAlphabeticalIndex(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return basicSetAlphabeticalIndexAutoMarkFile(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return basicSetAlphabeticalIndexEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK:
				return basicSetAlphabeticalIndexMark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_END:
				return basicSetAlphabeticalIndexMarkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_START:
				return basicSetAlphabeticalIndexMarkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_SOURCE:
				return basicSetAlphabeticalIndexSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ANIMATION_ELEMENT:
				return basicSetAnimationElement(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ANY_NUMBER:
				return basicSetAnyNumber(null, msgs);
			case TextPackage.DOCUMENT_ROOT__AUTHOR_INITIALS:
				return basicSetAuthorInitials(null, msgs);
			case TextPackage.DOCUMENT_ROOT__AUTHOR_NAME:
				return basicSetAuthorName(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OFFICE_META_DATA:
				return basicSetOfficeMetaData(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return basicSetBibliography(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_CONFIGURATION:
				return basicSetBibliographyConfiguration(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_ENTRY_TEMPLATE:
				return basicSetBibliographyEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_MARK:
				return basicSetBibliographyMark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_SOURCE:
				return basicSetBibliographySource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BOOKMARK:
				return basicSetBookmark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_END:
				return basicSetBookmarkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_REF:
				return basicSetBookmarkRef(null, msgs);
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_START:
				return basicSetBookmarkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CONTROLS:
				return basicSetControls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHANGE:
				return basicSetChange(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHANGE_MARKS:
				return basicSetChangeMarks(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHANGED_REGION:
				return basicSetChangedRegion(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHANGE_END:
				return basicSetChangeEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHANGE_START:
				return basicSetChangeStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHAPTER:
				return basicSetChapter(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CHARACTER_COUNT:
				return basicSetCharacterCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OFFICE_CHART_CONTENT_MAIN:
				return basicSetOfficeChartContentMain(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OFFICE_BODY_CONTENT:
				return basicSetOfficeBodyContent(null, msgs);
			case TextPackage.DOCUMENT_ROOT__COLUMN_CONTROLS:
				return basicSetColumnControls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CONDITIONAL_TEXT:
				return basicSetConditionalText(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CREATION_TIME:
				return basicSetCreationTime(null, msgs);
			case TextPackage.DOCUMENT_ROOT__CREATOR:
				return basicSetCreator(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SHAPES3D:
				return basicSetShapes3d(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATABASE_DISPLAY:
				return basicSetDatabaseDisplay(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATABASE_NAME:
				return basicSetDatabaseName(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATABASE_NEXT:
				return basicSetDatabaseNext(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_NUMBER:
				return basicSetDatabaseRowNumber(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_SELECT:
				return basicSetDatabaseRowSelect(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_DECL:
				return basicSetPresentationDecl(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION:
				return basicSetDdeConnection(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECL:
				return basicSetDdeConnectionDecl(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECLS:
				return basicSetDdeConnectionDecls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEXT_SECTION_SOURCE_DDE:
				return basicSetTextSectionSourceDde(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DELETION:
				return basicSetDeletion(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEXT_CHANGED_REGION_CONTENT:
				return basicSetTextChangedRegionContent(null, msgs);
			case TextPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_ANIMATION_ELEMENTS:
				return basicSetPresentationAnimationElements(null, msgs);
			case TextPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				return basicSetEditingCycles(null, msgs);
			case TextPackage.DOCUMENT_ROOT__EDITING_DURATION:
				return basicSetEditingDuration(null, msgs);
			case TextPackage.DOCUMENT_ROOT__EXECUTE_MACRO:
				return basicSetExecuteMacro(null, msgs);
			case TextPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case TextPackage.DOCUMENT_ROOT__FILE_NAME:
				return basicSetFileName(null, msgs);
			case TextPackage.DOCUMENT_ROOT__FORMAT_CHANGE:
				return basicSetFormatChange(null, msgs);
			case TextPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return basicSetFormProperty(null, msgs);
			case TextPackage.DOCUMENT_ROOT__H:
				return basicSetH(null, msgs);
			case TextPackage.DOCUMENT_ROOT__HIDDEN_PARAGRAPH:
				return basicSetHiddenParagraph(null, msgs);
			case TextPackage.DOCUMENT_ROOT__HIDDEN_TEXT:
				return basicSetHiddenText(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX:
				return basicSetIllustrationIndex(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return basicSetIllustrationIndexEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_SOURCE:
				return basicSetIllustrationIndexSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__IMAGE_COUNT:
				return basicSetImageCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_BODY:
				return basicSetIndexBody(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_BIBLIOGRAPHY:
				return basicSetIndexEntryBibliography(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_CHAPTER:
				return basicSetIndexEntryChapter(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return basicSetTextTableOfContentChildren(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_END:
				return basicSetIndexEntryLinkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_START:
				return basicSetIndexEntryLinkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_PAGE_NUMBER:
				return basicSetIndexEntryPageNumber(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_SPAN:
				return basicSetIndexEntrySpan(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TAB_STOP:
				return basicSetIndexEntryTabStop(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TEXT:
				return basicSetIndexEntryText(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLE:
				return basicSetIndexSourceStyle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLES:
				return basicSetIndexSourceStyles(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE:
				return basicSetIndexTitle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				return basicSetInitialCreator(null, msgs);
			case TextPackage.DOCUMENT_ROOT__INSERTION:
				return basicSetInsertion(null, msgs);
			case TextPackage.DOCUMENT_ROOT__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LINE_BREAK:
				return basicSetLineBreak(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_CONFIGURATION:
				return basicSetLinenumberingConfiguration(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_SEPARATOR:
				return basicSetLinenumberingSeparator(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_HEADER:
				return basicSetListHeader(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_ITEM:
				return basicSetListItem(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_BULLET:
				return basicSetListLevelStyleBullet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEXT_LIST_STYLE_CONTENT:
				return basicSetTextListStyleContent(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_IMAGE:
				return basicSetListLevelStyleImage(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_NUMBER:
				return basicSetListLevelStyleNumber(null, msgs);
			case TextPackage.DOCUMENT_ROOT__LIST_STYLE:
				return basicSetListStyle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_DATE:
				return basicSetModificationDate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_TIME:
				return basicSetModificationTime(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NOTE_BODY:
				return basicSetNoteBody(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NOTE_CITATION:
				return basicSetNoteCitation(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NOTE_REF:
				return basicSetNoteRef(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NOTES_CONFIGURATION:
				return basicSetNotesConfiguration(null, msgs);
			case TextPackage.DOCUMENT_ROOT__NUMBERED_PARAGRAPH:
				return basicSetNumberedParagraph(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OBJECT_COUNT:
				return basicSetObjectCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX:
				return basicSetObjectIndex(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_ENTRY_TEMPLATE:
				return basicSetObjectIndexEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_SOURCE:
				return basicSetObjectIndexSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OUTLINE_LEVEL_STYLE:
				return basicSetOutlineLevelStyle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__OUTLINE_STYLE:
				return basicSetOutlineStyle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__P:
				return basicSetP(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE:
				return basicSetPage(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_CONTINUATION:
				return basicSetPageContinuation(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return basicSetPageNumber(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_SEQUENCE:
				return basicSetPageSequence(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_GET:
				return basicSetPageVariableGet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_SET:
				return basicSetPageVariableSet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PARAGRAPH_COUNT:
				return basicSetParagraphCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return basicSetPlaceholder(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PRINT_DATE:
				return basicSetPrintDate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PRINTED_BY:
				return basicSetPrintedBy(null, msgs);
			case TextPackage.DOCUMENT_ROOT__PRINT_TIME:
				return basicSetPrintTime(null, msgs);
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK:
				return basicSetReferenceMark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_END:
				return basicSetReferenceMarkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_START:
				return basicSetReferenceMarkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__REFERENCE_REF:
				return basicSetReferenceRef(null, msgs);
			case TextPackage.DOCUMENT_ROOT__RUBY:
				return basicSetRuby(null, msgs);
			case TextPackage.DOCUMENT_ROOT__RUBY_BASE:
				return basicSetRubyBase(null, msgs);
			case TextPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return basicSetRubyText(null, msgs);
			case TextPackage.DOCUMENT_ROOT__S:
				return basicSetS(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SECTION:
				return basicSetSection(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SECTION_SOURCE:
				return basicSetSectionSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_CITY:
				return basicSetSenderCity(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_COMPANY:
				return basicSetSenderCompany(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_COUNTRY:
				return basicSetSenderCountry(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_EMAIL:
				return basicSetSenderEmail(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_FAX:
				return basicSetSenderFax(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_FIRSTNAME:
				return basicSetSenderFirstname(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_INITIALS:
				return basicSetSenderInitials(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_LASTNAME:
				return basicSetSenderLastname(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_PRIVATE:
				return basicSetSenderPhonePrivate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_WORK:
				return basicSetSenderPhoneWork(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_POSITION:
				return basicSetSenderPosition(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_POSTAL_CODE:
				return basicSetSenderPostalCode(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_STATE_OR_PROVINCE:
				return basicSetSenderStateOrProvince(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_STREET:
				return basicSetSenderStreet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SENDER_TITLE:
				return basicSetSenderTitle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECL:
				return basicSetSequenceDecl(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECLS:
				return basicSetSequenceDecls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_REF:
				return basicSetSequenceRef(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SOFT_PAGE_BREAK:
				return basicSetSoftPageBreak(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SORT_KEY:
				return basicSetSortKey(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SPAN:
				return basicSetSpan(null, msgs);
			case TextPackage.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TAB:
				return basicSetTab(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_COUNT:
				return basicSetTableCount(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_FORMULA:
				return basicSetTableFormula(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX:
				return basicSetTableIndex(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_ENTRY_TEMPLATE:
				return basicSetTableIndexEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_SOURCE:
				return basicSetTableIndexSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT:
				return basicSetTableOfContent(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return basicSetTableOfContentEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_SOURCE:
				return basicSetTableOfContentSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEMPLATE_NAME:
				return basicSetTemplateName(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TEXT_INPUT:
				return basicSetTextInput(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TIME:
				return basicSetTime(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TOC_MARK:
				return basicSetTocMark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_END:
				return basicSetTocMarkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_START:
				return basicSetTocMarkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return basicSetTrackedChanges(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_DEFINED:
				return basicSetUserDefined(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECL:
				return basicSetUserFieldDecl(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECLS:
				return basicSetUserFieldDecls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_GET:
				return basicSetUserFieldGet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_INPUT:
				return basicSetUserFieldInput(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX:
				return basicSetUserIndex(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_ENTRY_TEMPLATE:
				return basicSetUserIndexEntryTemplate(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK:
				return basicSetUserIndexMark(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_END:
				return basicSetUserIndexMarkEnd(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_START:
				return basicSetUserIndexMarkStart(null, msgs);
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_SOURCE:
				return basicSetUserIndexSource(null, msgs);
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECL:
				return basicSetVariableDecl(null, msgs);
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECLS:
				return basicSetVariableDecls(null, msgs);
			case TextPackage.DOCUMENT_ROOT__VARIABLE_GET:
				return basicSetVariableGet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__VARIABLE_INPUT:
				return basicSetVariableInput(null, msgs);
			case TextPackage.DOCUMENT_ROOT__VARIABLE_SET:
				return basicSetVariableSet(null, msgs);
			case TextPackage.DOCUMENT_ROOT__WORD_COUNT:
				return basicSetWordCount(null, msgs);
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
			case TextPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TextPackage.DOCUMENT_ROOT__A:
				return getA();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return getAlphabeticalIndexAutoMarkFile();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return getAlphabeticalIndexEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart();
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_SOURCE:
				return getAlphabeticalIndexSource();
			case TextPackage.DOCUMENT_ROOT__ANIMATION_ELEMENT:
				return getAnimationElement();
			case TextPackage.DOCUMENT_ROOT__ANY_NUMBER:
				return getAnyNumber();
			case TextPackage.DOCUMENT_ROOT__AUTHOR_INITIALS:
				return getAuthorInitials();
			case TextPackage.DOCUMENT_ROOT__AUTHOR_NAME:
				return getAuthorName();
			case TextPackage.DOCUMENT_ROOT__OFFICE_META_DATA:
				return getOfficeMetaData();
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_CONFIGURATION:
				return getBibliographyConfiguration();
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_ENTRY_TEMPLATE:
				return getBibliographyEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_MARK:
				return getBibliographyMark();
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_SOURCE:
				return getBibliographySource();
			case TextPackage.DOCUMENT_ROOT__BOOKMARK:
				return getBookmark();
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_END:
				return getBookmarkEnd();
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_REF:
				return getBookmarkRef();
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_START:
				return getBookmarkStart();
			case TextPackage.DOCUMENT_ROOT__CONTROLS:
				return getControls();
			case TextPackage.DOCUMENT_ROOT__CHANGE:
				return getChange();
			case TextPackage.DOCUMENT_ROOT__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.DOCUMENT_ROOT__CHANGED_REGION:
				return getChangedRegion();
			case TextPackage.DOCUMENT_ROOT__CHANGE_END:
				return getChangeEnd();
			case TextPackage.DOCUMENT_ROOT__CHANGE_START:
				return getChangeStart();
			case TextPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter();
			case TextPackage.DOCUMENT_ROOT__CHARACTER_COUNT:
				return getCharacterCount();
			case TextPackage.DOCUMENT_ROOT__OFFICE_CHART_CONTENT_MAIN:
				return getOfficeChartContentMain();
			case TextPackage.DOCUMENT_ROOT__OFFICE_BODY_CONTENT:
				return getOfficeBodyContent();
			case TextPackage.DOCUMENT_ROOT__COLUMN_CONTROLS:
				return getColumnControls();
			case TextPackage.DOCUMENT_ROOT__CONDITIONAL_TEXT:
				return getConditionalText();
			case TextPackage.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate();
			case TextPackage.DOCUMENT_ROOT__CREATION_TIME:
				return getCreationTime();
			case TextPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator();
			case TextPackage.DOCUMENT_ROOT__SHAPES3D:
				return getShapes3d();
			case TextPackage.DOCUMENT_ROOT__DATABASE_DISPLAY:
				return getDatabaseDisplay();
			case TextPackage.DOCUMENT_ROOT__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.DOCUMENT_ROOT__DATABASE_NEXT:
				return getDatabaseNext();
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber();
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect();
			case TextPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_DECL:
				return getPresentationDecl();
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION:
				return getDdeConnection();
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECL:
				return getDdeConnectionDecl();
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECLS:
				return getDdeConnectionDecls();
			case TextPackage.DOCUMENT_ROOT__TEXT_SECTION_SOURCE_DDE:
				return getTextSectionSourceDde();
			case TextPackage.DOCUMENT_ROOT__DELETION:
				return getDeletion();
			case TextPackage.DOCUMENT_ROOT__TEXT_CHANGED_REGION_CONTENT:
				return getTextChangedRegionContent();
			case TextPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_ANIMATION_ELEMENTS:
				return getPresentationAnimationElements();
			case TextPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				return getEditingCycles();
			case TextPackage.DOCUMENT_ROOT__EDITING_DURATION:
				return getEditingDuration();
			case TextPackage.DOCUMENT_ROOT__EXECUTE_MACRO:
				return getExecuteMacro();
			case TextPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case TextPackage.DOCUMENT_ROOT__FILE_NAME:
				return getFileName();
			case TextPackage.DOCUMENT_ROOT__FORMAT_CHANGE:
				return getFormatChange();
			case TextPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return getFormProperty();
			case TextPackage.DOCUMENT_ROOT__H:
				return getH();
			case TextPackage.DOCUMENT_ROOT__HIDDEN_PARAGRAPH:
				return getHiddenParagraph();
			case TextPackage.DOCUMENT_ROOT__HIDDEN_TEXT:
				return getHiddenText();
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return getIllustrationIndexEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_SOURCE:
				return getIllustrationIndexSource();
			case TextPackage.DOCUMENT_ROOT__IMAGE_COUNT:
				return getImageCount();
			case TextPackage.DOCUMENT_ROOT__INDEX_BODY:
				return getIndexBody();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_BIBLIOGRAPHY:
				return getIndexEntryBibliography();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_CHAPTER:
				return getIndexEntryChapter();
			case TextPackage.DOCUMENT_ROOT__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return getTextTableOfContentChildren();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_END:
				return getIndexEntryLinkEnd();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_START:
				return getIndexEntryLinkStart();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_PAGE_NUMBER:
				return getIndexEntryPageNumber();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_SPAN:
				return getIndexEntrySpan();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TAB_STOP:
				return getIndexEntryTabStop();
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TEXT:
				return getIndexEntryText();
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLE:
				return getIndexSourceStyle();
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLES:
				return getIndexSourceStyles();
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE:
				return getIndexTitle();
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				return getInitialCreator();
			case TextPackage.DOCUMENT_ROOT__INSERTION:
				return getInsertion();
			case TextPackage.DOCUMENT_ROOT__KEYWORDS:
				return getKeywords();
			case TextPackage.DOCUMENT_ROOT__LINE_BREAK:
				return getLineBreak();
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_CONFIGURATION:
				return getLinenumberingConfiguration();
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_SEPARATOR:
				return getLinenumberingSeparator();
			case TextPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case TextPackage.DOCUMENT_ROOT__LIST_HEADER:
				return getListHeader();
			case TextPackage.DOCUMENT_ROOT__LIST_ITEM:
				return getListItem();
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_BULLET:
				return getListLevelStyleBullet();
			case TextPackage.DOCUMENT_ROOT__TEXT_LIST_STYLE_CONTENT:
				return getTextListStyleContent();
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_IMAGE:
				return getListLevelStyleImage();
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_NUMBER:
				return getListLevelStyleNumber();
			case TextPackage.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle();
			case TextPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_DATE:
				return getModificationDate();
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_TIME:
				return getModificationTime();
			case TextPackage.DOCUMENT_ROOT__NOTE:
				return getNote();
			case TextPackage.DOCUMENT_ROOT__NOTE_BODY:
				return getNoteBody();
			case TextPackage.DOCUMENT_ROOT__NOTE_CITATION:
				return getNoteCitation();
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				return getNoteContinuationNoticeBackward();
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_FORWARD:
				return getNoteContinuationNoticeForward();
			case TextPackage.DOCUMENT_ROOT__NOTE_REF:
				return getNoteRef();
			case TextPackage.DOCUMENT_ROOT__NOTES_CONFIGURATION:
				return getNotesConfiguration();
			case TextPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber();
			case TextPackage.DOCUMENT_ROOT__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case TextPackage.DOCUMENT_ROOT__OBJECT_COUNT:
				return getObjectCount();
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_ENTRY_TEMPLATE:
				return getObjectIndexEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_SOURCE:
				return getObjectIndexSource();
			case TextPackage.DOCUMENT_ROOT__OUTLINE_LEVEL_STYLE:
				return getOutlineLevelStyle();
			case TextPackage.DOCUMENT_ROOT__OUTLINE_STYLE:
				return getOutlineStyle();
			case TextPackage.DOCUMENT_ROOT__P:
				return getP();
			case TextPackage.DOCUMENT_ROOT__PAGE:
				return getPage();
			case TextPackage.DOCUMENT_ROOT__PAGE_CONTINUATION:
				return getPageContinuation();
			case TextPackage.DOCUMENT_ROOT__PAGE_COUNT:
				return getPageCount();
			case TextPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return getPageNumber();
			case TextPackage.DOCUMENT_ROOT__PAGE_SEQUENCE:
				return getPageSequence();
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_GET:
				return getPageVariableGet();
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_SET:
				return getPageVariableSet();
			case TextPackage.DOCUMENT_ROOT__PARAGRAPH_COUNT:
				return getParagraphCount();
			case TextPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return getPlaceholder();
			case TextPackage.DOCUMENT_ROOT__PRINT_DATE:
				return getPrintDate();
			case TextPackage.DOCUMENT_ROOT__PRINTED_BY:
				return getPrintedBy();
			case TextPackage.DOCUMENT_ROOT__PRINT_TIME:
				return getPrintTime();
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK:
				return getReferenceMark();
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_END:
				return getReferenceMarkEnd();
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_START:
				return getReferenceMarkStart();
			case TextPackage.DOCUMENT_ROOT__REFERENCE_REF:
				return getReferenceRef();
			case TextPackage.DOCUMENT_ROOT__RUBY:
				return getRuby();
			case TextPackage.DOCUMENT_ROOT__RUBY_BASE:
				return getRubyBase();
			case TextPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return getRubyText();
			case TextPackage.DOCUMENT_ROOT__S:
				return getS();
			case TextPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case TextPackage.DOCUMENT_ROOT__SECTION:
				return getSection();
			case TextPackage.DOCUMENT_ROOT__SECTION_SOURCE:
				return getSectionSource();
			case TextPackage.DOCUMENT_ROOT__SENDER_CITY:
				return getSenderCity();
			case TextPackage.DOCUMENT_ROOT__SENDER_COMPANY:
				return getSenderCompany();
			case TextPackage.DOCUMENT_ROOT__SENDER_COUNTRY:
				return getSenderCountry();
			case TextPackage.DOCUMENT_ROOT__SENDER_EMAIL:
				return getSenderEmail();
			case TextPackage.DOCUMENT_ROOT__SENDER_FAX:
				return getSenderFax();
			case TextPackage.DOCUMENT_ROOT__SENDER_FIRSTNAME:
				return getSenderFirstname();
			case TextPackage.DOCUMENT_ROOT__SENDER_INITIALS:
				return getSenderInitials();
			case TextPackage.DOCUMENT_ROOT__SENDER_LASTNAME:
				return getSenderLastname();
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate();
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_WORK:
				return getSenderPhoneWork();
			case TextPackage.DOCUMENT_ROOT__SENDER_POSITION:
				return getSenderPosition();
			case TextPackage.DOCUMENT_ROOT__SENDER_POSTAL_CODE:
				return getSenderPostalCode();
			case TextPackage.DOCUMENT_ROOT__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince();
			case TextPackage.DOCUMENT_ROOT__SENDER_STREET:
				return getSenderStreet();
			case TextPackage.DOCUMENT_ROOT__SENDER_TITLE:
				return getSenderTitle();
			case TextPackage.DOCUMENT_ROOT__SEQUENCE:
				return getSequence();
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECL:
				return getSequenceDecl();
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECLS:
				return getSequenceDecls();
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_REF:
				return getSequenceRef();
			case TextPackage.DOCUMENT_ROOT__SHEET_NAME:
				return getSheetName();
			case TextPackage.DOCUMENT_ROOT__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.DOCUMENT_ROOT__SORT_KEY:
				return getSortKey();
			case TextPackage.DOCUMENT_ROOT__SPAN:
				return getSpan();
			case TextPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case TextPackage.DOCUMENT_ROOT__TAB:
				return getTab();
			case TextPackage.DOCUMENT_ROOT__TABLE_COUNT:
				return getTableCount();
			case TextPackage.DOCUMENT_ROOT__TABLE_FORMULA:
				return getTableFormula();
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_ENTRY_TEMPLATE:
				return getTableIndexEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_SOURCE:
				return getTableIndexSource();
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return getTableOfContentEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_SOURCE:
				return getTableOfContentSource();
			case TextPackage.DOCUMENT_ROOT__TEMPLATE_NAME:
				return getTemplateName();
			case TextPackage.DOCUMENT_ROOT__TEXT_INPUT:
				return getTextInput();
			case TextPackage.DOCUMENT_ROOT__TIME:
				return getTime();
			case TextPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case TextPackage.DOCUMENT_ROOT__TOC_MARK:
				return getTocMark();
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_END:
				return getTocMarkEnd();
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_START:
				return getTocMarkStart();
			case TextPackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return getTrackedChanges();
			case TextPackage.DOCUMENT_ROOT__USER_DEFINED:
				return getUserDefined();
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECL:
				return getUserFieldDecl();
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECLS:
				return getUserFieldDecls();
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_GET:
				return getUserFieldGet();
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_INPUT:
				return getUserFieldInput();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX:
				return getUserIndex();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_ENTRY_TEMPLATE:
				return getUserIndexEntryTemplate();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK:
				return getUserIndexMark();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_START:
				return getUserIndexMarkStart();
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_SOURCE:
				return getUserIndexSource();
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECL:
				return getVariableDecl();
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECLS:
				return getVariableDecls();
			case TextPackage.DOCUMENT_ROOT__VARIABLE_GET:
				return getVariableGet();
			case TextPackage.DOCUMENT_ROOT__VARIABLE_INPUT:
				return getVariableInput();
			case TextPackage.DOCUMENT_ROOT__VARIABLE_SET:
				return getVariableSet();
			case TextPackage.DOCUMENT_ROOT__WORD_COUNT:
				return getWordCount();
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
			case TextPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__A:
				setA((AType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX:
				setAlphabeticalIndex((AlphabeticalIndexType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				setAlphabeticalIndexEntryTemplate((AlphabeticalIndexEntryTemplateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK:
				setAlphabeticalIndexMark((AlphabeticalIndexMarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_END:
				setAlphabeticalIndexMarkEnd((AlphabeticalIndexMarkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_START:
				setAlphabeticalIndexMarkStart((AlphabeticalIndexMarkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_SOURCE:
				setAlphabeticalIndexSource((AlphabeticalIndexSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_INITIALS:
				setAuthorInitials((AuthorInitialsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_NAME:
				setAuthorName((AuthorNameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography((BibliographyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_CONFIGURATION:
				setBibliographyConfiguration((BibliographyConfigurationType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_ENTRY_TEMPLATE:
				setBibliographyEntryTemplate((BibliographyEntryTemplateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_MARK:
				setBibliographyMark((BibliographyMarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_SOURCE:
				setBibliographySource((BibliographySourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK:
				setBookmark((BookmarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_END:
				setBookmarkEnd((BookmarkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_REF:
				setBookmarkRef((BookmarkRefType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_START:
				setBookmarkStart((BookmarkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE:
				setChange((ChangeMarksType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGED_REGION:
				setChangedRegion((ChangedRegionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE_END:
				setChangeEnd((ChangeMarksType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE_START:
				setChangeStart((ChangeMarksType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CHARACTER_COUNT:
				setCharacterCount((CharacterCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CONDITIONAL_TEXT:
				setConditionalText((ConditionalTextType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((CreationDateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATION_TIME:
				setCreationTime((CreationTimeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((CreatorType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_DISPLAY:
				setDatabaseDisplay((TextDatabaseDisplayAttlist)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NAME:
				setDatabaseName((DatabaseNameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NEXT:
				setDatabaseNext((TextDatabaseNextAttlist)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_NUMBER:
				setDatabaseRowNumber((DatabaseRowNumberType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_SELECT:
				setDatabaseRowSelect((TextDatabaseRowSelectAttlist)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION:
				setDdeConnection((DdeConnectionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECL:
				setDdeConnectionDecl((DdeConnectionDeclType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DELETION:
				setDeletion((DeletionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				setEditingCycles((EditingCyclesType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__EDITING_DURATION:
				setEditingDuration((EditingDurationType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__EXECUTE_MACRO:
				setExecuteMacro((ExecuteMacroType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__FILE_NAME:
				setFileName((FileNameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__FORMAT_CHANGE:
				setFormatChange((FormatChangeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__H:
				setH((HType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_PARAGRAPH:
				setHiddenParagraph((HiddenParagraphType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_TEXT:
				setHiddenText((HiddenTextType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX:
				setIllustrationIndex((IllustrationIndexType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				setIllustrationIndexEntryTemplate((TextIllustrationIndexEntryContent)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_SOURCE:
				setIllustrationIndexSource((IllustrationIndexSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__IMAGE_COUNT:
				setImageCount((ImageCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_BODY:
				setIndexBody((IndexBodyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_BIBLIOGRAPHY:
				setIndexEntryBibliography((IndexEntryBibliographyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_CHAPTER:
				setIndexEntryChapter((IndexEntryChapterType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_END:
				setIndexEntryLinkEnd((IndexEntryLinkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_START:
				setIndexEntryLinkStart((IndexEntryLinkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_PAGE_NUMBER:
				setIndexEntryPageNumber((IndexEntryPageNumberType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_SPAN:
				setIndexEntrySpan((IndexEntrySpanType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TAB_STOP:
				setIndexEntryTabStop((IndexEntryTabStopType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TEXT:
				setIndexEntryText((IndexEntryTextType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLE:
				setIndexSourceStyle((IndexSourceStyleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLES:
				setIndexSourceStyles((IndexSourceStylesType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE:
				setIndexTitle((IndexTitleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				setInitialCreator((InitialCreatorType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__INSERTION:
				setInsertion((InsertionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__KEYWORDS:
				setKeywords((KeywordsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LINE_BREAK:
				setLineBreak((LineBreakType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_CONFIGURATION:
				setLinenumberingConfiguration((LinenumberingConfigurationType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_SEPARATOR:
				setLinenumberingSeparator((LinenumberingSeparatorType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST:
				setList((ListType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_HEADER:
				setListHeader((TextListItemContent)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_ITEM:
				setListItem((ListItemType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_BULLET:
				setListLevelStyleBullet((ListLevelStyleBulletType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_IMAGE:
				setListLevelStyleImage((ListLevelStyleImageType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_NUMBER:
				setListLevelStyleNumber((ListLevelStyleNumberType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_TIME:
				setModificationTime((ModificationTimeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_BODY:
				setNoteBody((NoteBodyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CITATION:
				setNoteCitation((NoteCitationType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				setNoteContinuationNoticeBackward((String)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_FORWARD:
				setNoteContinuationNoticeForward((String)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_REF:
				setNoteRef((NoteRefType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTES_CONFIGURATION:
				setNotesConfiguration((TextNotesConfigurationContent)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((String)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__NUMBERED_PARAGRAPH:
				setNumberedParagraph((NumberedParagraphType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_COUNT:
				setObjectCount((ObjectCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX:
				setObjectIndex((ObjectIndexType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_ENTRY_TEMPLATE:
				setObjectIndexEntryTemplate((TextIllustrationIndexEntryContent)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_SOURCE:
				setObjectIndexSource((ObjectIndexSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_LEVEL_STYLE:
				setOutlineLevelStyle((OutlineLevelStyleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_STYLE:
				setOutlineStyle((OutlineStyleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__P:
				setP((PType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE:
				setPage((PageType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_CONTINUATION:
				setPageContinuation((PageContinuationType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_COUNT:
				setPageCount((PageCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber((PageNumberType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_SEQUENCE:
				setPageSequence((PageSequenceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_GET:
				setPageVariableGet((PageVariableGetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_SET:
				setPageVariableSet((PageVariableSetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PARAGRAPH_COUNT:
				setParagraphCount((ParagraphCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PLACEHOLDER:
				setPlaceholder((PlaceholderType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINT_DATE:
				setPrintDate((PrintDateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINTED_BY:
				setPrintedBy((PrintedByType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINT_TIME:
				setPrintTime((PrintTimeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK:
				setReferenceMark((ReferenceMarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_END:
				setReferenceMarkEnd((ReferenceMarkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_START:
				setReferenceMarkStart((ReferenceMarkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_REF:
				setReferenceRef((ReferenceRefType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY_BASE:
				setRubyBase((RubyBaseType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY_TEXT:
				setRubyText((RubyTextType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__S:
				setS((SType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SECTION_SOURCE:
				setSectionSource((SectionSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_CITY:
				setSenderCity((SenderCityType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_COMPANY:
				setSenderCompany((SenderCompanyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_COUNTRY:
				setSenderCountry((SenderCountryType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_EMAIL:
				setSenderEmail((SenderEmailType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_FAX:
				setSenderFax((SenderFaxType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_FIRSTNAME:
				setSenderFirstname((SenderFirstnameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_INITIALS:
				setSenderInitials((SenderInitialsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_LASTNAME:
				setSenderLastname((SenderLastnameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_PRIVATE:
				setSenderPhonePrivate((SenderPhonePrivateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_WORK:
				setSenderPhoneWork((SenderPhoneWorkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSITION:
				setSenderPosition((SenderPositionType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSTAL_CODE:
				setSenderPostalCode((SenderPostalCodeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_STATE_OR_PROVINCE:
				setSenderStateOrProvince((SenderStateOrProvinceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_STREET:
				setSenderStreet((SenderStreetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_TITLE:
				setSenderTitle((SenderTitleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE:
				setSequence((SequenceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECL:
				setSequenceDecl((SequenceDeclType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_REF:
				setSequenceRef((SequenceRefType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SHEET_NAME:
				setSheetName((String)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SOFT_PAGE_BREAK:
				setSoftPageBreak((SoftPageBreakType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SORT_KEY:
				setSortKey((SortKeyType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TAB:
				setTab((TabType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_COUNT:
				setTableCount((TableCountType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_FORMULA:
				setTableFormula((TableFormulaType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX:
				setTableIndex((TableIndexType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_ENTRY_TEMPLATE:
				setTableIndexEntryTemplate((TextIllustrationIndexEntryContent)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_SOURCE:
				setTableIndexSource((TableIndexSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT:
				setTableOfContent((TableOfContentType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				setTableOfContentEntryTemplate((TableOfContentEntryTemplateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_SOURCE:
				setTableOfContentSource((TableOfContentSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TEMPLATE_NAME:
				setTemplateName((TemplateNameType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TEXT_INPUT:
				setTextInput((TextInputType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TIME:
				setTime((TimeType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK:
				setTocMark((TocMarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_END:
				setTocMarkEnd((TocMarkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_START:
				setTocMarkStart((TocMarkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_DEFINED:
				setUserDefined((UserDefinedType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECL:
				setUserFieldDecl((UserFieldDeclType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_GET:
				setUserFieldGet((UserFieldGetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_INPUT:
				setUserFieldInput((UserFieldInputType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX:
				setUserIndex((UserIndexType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_ENTRY_TEMPLATE:
				setUserIndexEntryTemplate((UserIndexEntryTemplateType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK:
				setUserIndexMark((UserIndexMarkType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_END:
				setUserIndexMarkEnd((UserIndexMarkEndType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_START:
				setUserIndexMarkStart((UserIndexMarkStartType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_SOURCE:
				setUserIndexSource((UserIndexSourceType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECL:
				setVariableDecl((VariableDeclType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_GET:
				setVariableGet((VariableGetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_INPUT:
				setVariableInput((VariableInputType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_SET:
				setVariableSet((VariableSetType)newValue);
				return;
			case TextPackage.DOCUMENT_ROOT__WORD_COUNT:
				setWordCount((WordCountType)newValue);
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
			case TextPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TextPackage.DOCUMENT_ROOT__A:
				setA((AType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX:
				setAlphabeticalIndex((AlphabeticalIndexType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				setAlphabeticalIndexEntryTemplate((AlphabeticalIndexEntryTemplateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK:
				setAlphabeticalIndexMark((AlphabeticalIndexMarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_END:
				setAlphabeticalIndexMarkEnd((AlphabeticalIndexMarkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_START:
				setAlphabeticalIndexMarkStart((AlphabeticalIndexMarkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_SOURCE:
				setAlphabeticalIndexSource((AlphabeticalIndexSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_INITIALS:
				setAuthorInitials((AuthorInitialsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_NAME:
				setAuthorName((AuthorNameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography((BibliographyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_CONFIGURATION:
				setBibliographyConfiguration((BibliographyConfigurationType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_ENTRY_TEMPLATE:
				setBibliographyEntryTemplate((BibliographyEntryTemplateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_MARK:
				setBibliographyMark((BibliographyMarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_SOURCE:
				setBibliographySource((BibliographySourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK:
				setBookmark((BookmarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_END:
				setBookmarkEnd((BookmarkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_REF:
				setBookmarkRef((BookmarkRefType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_START:
				setBookmarkStart((BookmarkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE:
				setChange((ChangeMarksType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGED_REGION:
				setChangedRegion((ChangedRegionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE_END:
				setChangeEnd((ChangeMarksType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHANGE_START:
				setChangeStart((ChangeMarksType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CHARACTER_COUNT:
				setCharacterCount((CharacterCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CONDITIONAL_TEXT:
				setConditionalText((ConditionalTextType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((CreationDateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATION_TIME:
				setCreationTime((CreationTimeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((CreatorType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_DISPLAY:
				setDatabaseDisplay((TextDatabaseDisplayAttlist)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NAME:
				setDatabaseName((DatabaseNameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NEXT:
				setDatabaseNext((TextDatabaseNextAttlist)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_NUMBER:
				setDatabaseRowNumber((DatabaseRowNumberType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_SELECT:
				setDatabaseRowSelect((TextDatabaseRowSelectAttlist)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION:
				setDdeConnection((DdeConnectionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECL:
				setDdeConnectionDecl((DdeConnectionDeclType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DELETION:
				setDeletion((DeletionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				setEditingCycles((EditingCyclesType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__EDITING_DURATION:
				setEditingDuration((EditingDurationType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__EXECUTE_MACRO:
				setExecuteMacro((ExecuteMacroType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__FILE_NAME:
				setFileName((FileNameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__FORMAT_CHANGE:
				setFormatChange((FormatChangeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__H:
				setH((HType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_PARAGRAPH:
				setHiddenParagraph((HiddenParagraphType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_TEXT:
				setHiddenText((HiddenTextType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX:
				setIllustrationIndex((IllustrationIndexType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				setIllustrationIndexEntryTemplate((TextIllustrationIndexEntryContent)null);
				return;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_SOURCE:
				setIllustrationIndexSource((IllustrationIndexSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__IMAGE_COUNT:
				setImageCount((ImageCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_BODY:
				setIndexBody((IndexBodyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_BIBLIOGRAPHY:
				setIndexEntryBibliography((IndexEntryBibliographyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_CHAPTER:
				setIndexEntryChapter((IndexEntryChapterType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_END:
				setIndexEntryLinkEnd((IndexEntryLinkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_START:
				setIndexEntryLinkStart((IndexEntryLinkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_PAGE_NUMBER:
				setIndexEntryPageNumber((IndexEntryPageNumberType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_SPAN:
				setIndexEntrySpan((IndexEntrySpanType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TAB_STOP:
				setIndexEntryTabStop((IndexEntryTabStopType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TEXT:
				setIndexEntryText((IndexEntryTextType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLE:
				setIndexSourceStyle((IndexSourceStyleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLES:
				setIndexSourceStyles((IndexSourceStylesType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE:
				setIndexTitle((IndexTitleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				setInitialCreator((InitialCreatorType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__INSERTION:
				setInsertion((InsertionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__KEYWORDS:
				setKeywords((KeywordsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LINE_BREAK:
				setLineBreak((LineBreakType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_CONFIGURATION:
				setLinenumberingConfiguration((LinenumberingConfigurationType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_SEPARATOR:
				setLinenumberingSeparator((LinenumberingSeparatorType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST:
				setList((ListType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_HEADER:
				setListHeader((TextListItemContent)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_ITEM:
				setListItem((ListItemType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_BULLET:
				setListLevelStyleBullet((ListLevelStyleBulletType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_IMAGE:
				setListLevelStyleImage((ListLevelStyleImageType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_NUMBER:
				setListLevelStyleNumber((ListLevelStyleNumberType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_TIME:
				setModificationTime((ModificationTimeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_BODY:
				setNoteBody((NoteBodyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CITATION:
				setNoteCitation((NoteCitationType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				setNoteContinuationNoticeBackward(NOTE_CONTINUATION_NOTICE_BACKWARD_EDEFAULT);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_FORWARD:
				setNoteContinuationNoticeForward(NOTE_CONTINUATION_NOTICE_FORWARD_EDEFAULT);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTE_REF:
				setNoteRef((NoteRefType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NOTES_CONFIGURATION:
				setNotesConfiguration((TextNotesConfigurationContent)null);
				return;
			case TextPackage.DOCUMENT_ROOT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TextPackage.DOCUMENT_ROOT__NUMBERED_PARAGRAPH:
				setNumberedParagraph((NumberedParagraphType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_COUNT:
				setObjectCount((ObjectCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX:
				setObjectIndex((ObjectIndexType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_ENTRY_TEMPLATE:
				setObjectIndexEntryTemplate((TextIllustrationIndexEntryContent)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_SOURCE:
				setObjectIndexSource((ObjectIndexSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_LEVEL_STYLE:
				setOutlineLevelStyle((OutlineLevelStyleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_STYLE:
				setOutlineStyle((OutlineStyleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__P:
				setP((PType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE:
				setPage((PageType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_CONTINUATION:
				setPageContinuation((PageContinuationType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_COUNT:
				setPageCount((PageCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber((PageNumberType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_SEQUENCE:
				setPageSequence((PageSequenceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_GET:
				setPageVariableGet((PageVariableGetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_SET:
				setPageVariableSet((PageVariableSetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PARAGRAPH_COUNT:
				setParagraphCount((ParagraphCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PLACEHOLDER:
				setPlaceholder((PlaceholderType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINT_DATE:
				setPrintDate((PrintDateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINTED_BY:
				setPrintedBy((PrintedByType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__PRINT_TIME:
				setPrintTime((PrintTimeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK:
				setReferenceMark((ReferenceMarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_END:
				setReferenceMarkEnd((ReferenceMarkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_START:
				setReferenceMarkStart((ReferenceMarkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_REF:
				setReferenceRef((ReferenceRefType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY_BASE:
				setRubyBase((RubyBaseType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__RUBY_TEXT:
				setRubyText((RubyTextType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__S:
				setS((SType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SECTION_SOURCE:
				setSectionSource((SectionSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_CITY:
				setSenderCity((SenderCityType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_COMPANY:
				setSenderCompany((SenderCompanyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_COUNTRY:
				setSenderCountry((SenderCountryType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_EMAIL:
				setSenderEmail((SenderEmailType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_FAX:
				setSenderFax((SenderFaxType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_FIRSTNAME:
				setSenderFirstname((SenderFirstnameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_INITIALS:
				setSenderInitials((SenderInitialsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_LASTNAME:
				setSenderLastname((SenderLastnameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_PRIVATE:
				setSenderPhonePrivate((SenderPhonePrivateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_WORK:
				setSenderPhoneWork((SenderPhoneWorkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSITION:
				setSenderPosition((SenderPositionType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSTAL_CODE:
				setSenderPostalCode((SenderPostalCodeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_STATE_OR_PROVINCE:
				setSenderStateOrProvince((SenderStateOrProvinceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_STREET:
				setSenderStreet((SenderStreetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SENDER_TITLE:
				setSenderTitle((SenderTitleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE:
				setSequence((SequenceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECL:
				setSequenceDecl((SequenceDeclType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_REF:
				setSequenceRef((SequenceRefType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
				return;
			case TextPackage.DOCUMENT_ROOT__SOFT_PAGE_BREAK:
				setSoftPageBreak((SoftPageBreakType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SORT_KEY:
				setSortKey((SortKeyType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TAB:
				setTab((TabType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_COUNT:
				setTableCount((TableCountType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_FORMULA:
				setTableFormula((TableFormulaType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX:
				setTableIndex((TableIndexType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_ENTRY_TEMPLATE:
				setTableIndexEntryTemplate((TextIllustrationIndexEntryContent)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_SOURCE:
				setTableIndexSource((TableIndexSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT:
				setTableOfContent((TableOfContentType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				setTableOfContentEntryTemplate((TableOfContentEntryTemplateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_SOURCE:
				setTableOfContentSource((TableOfContentSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TEMPLATE_NAME:
				setTemplateName((TemplateNameType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TEXT_INPUT:
				setTextInput((TextInputType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TIME:
				setTime((TimeType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK:
				setTocMark((TocMarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_END:
				setTocMarkEnd((TocMarkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_START:
				setTocMarkStart((TocMarkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_DEFINED:
				setUserDefined((UserDefinedType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECL:
				setUserFieldDecl((UserFieldDeclType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_GET:
				setUserFieldGet((UserFieldGetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_INPUT:
				setUserFieldInput((UserFieldInputType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX:
				setUserIndex((UserIndexType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_ENTRY_TEMPLATE:
				setUserIndexEntryTemplate((UserIndexEntryTemplateType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK:
				setUserIndexMark((UserIndexMarkType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_END:
				setUserIndexMarkEnd((UserIndexMarkEndType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_START:
				setUserIndexMarkStart((UserIndexMarkStartType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_SOURCE:
				setUserIndexSource((UserIndexSourceType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECL:
				setVariableDecl((VariableDeclType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_GET:
				setVariableGet((VariableGetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_INPUT:
				setVariableInput((VariableInputType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_SET:
				setVariableSet((VariableSetType)null);
				return;
			case TextPackage.DOCUMENT_ROOT__WORD_COUNT:
				setWordCount((WordCountType)null);
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
			case TextPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TextPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TextPackage.DOCUMENT_ROOT__A:
				return getA() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return getAlphabeticalIndexAutoMarkFile() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return getAlphabeticalIndexEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart() != null;
			case TextPackage.DOCUMENT_ROOT__ALPHABETICAL_INDEX_SOURCE:
				return getAlphabeticalIndexSource() != null;
			case TextPackage.DOCUMENT_ROOT__ANIMATION_ELEMENT:
				return getAnimationElement() != null;
			case TextPackage.DOCUMENT_ROOT__ANY_NUMBER:
				return getAnyNumber() != null;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_INITIALS:
				return getAuthorInitials() != null;
			case TextPackage.DOCUMENT_ROOT__AUTHOR_NAME:
				return getAuthorName() != null;
			case TextPackage.DOCUMENT_ROOT__OFFICE_META_DATA:
				return getOfficeMetaData() != null;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return getBibliography() != null;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_CONFIGURATION:
				return getBibliographyConfiguration() != null;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_ENTRY_TEMPLATE:
				return getBibliographyEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_MARK:
				return getBibliographyMark() != null;
			case TextPackage.DOCUMENT_ROOT__BIBLIOGRAPHY_SOURCE:
				return getBibliographySource() != null;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK:
				return getBookmark() != null;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_END:
				return getBookmarkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_REF:
				return getBookmarkRef() != null;
			case TextPackage.DOCUMENT_ROOT__BOOKMARK_START:
				return getBookmarkStart() != null;
			case TextPackage.DOCUMENT_ROOT__CONTROLS:
				return getControls() != null;
			case TextPackage.DOCUMENT_ROOT__CHANGE:
				return getChange() != null;
			case TextPackage.DOCUMENT_ROOT__CHANGE_MARKS:
				return getChangeMarks() != null;
			case TextPackage.DOCUMENT_ROOT__CHANGED_REGION:
				return getChangedRegion() != null;
			case TextPackage.DOCUMENT_ROOT__CHANGE_END:
				return getChangeEnd() != null;
			case TextPackage.DOCUMENT_ROOT__CHANGE_START:
				return getChangeStart() != null;
			case TextPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter() != null;
			case TextPackage.DOCUMENT_ROOT__CHARACTER_COUNT:
				return getCharacterCount() != null;
			case TextPackage.DOCUMENT_ROOT__OFFICE_CHART_CONTENT_MAIN:
				return getOfficeChartContentMain() != null;
			case TextPackage.DOCUMENT_ROOT__OFFICE_BODY_CONTENT:
				return getOfficeBodyContent() != null;
			case TextPackage.DOCUMENT_ROOT__COLUMN_CONTROLS:
				return getColumnControls() != null;
			case TextPackage.DOCUMENT_ROOT__CONDITIONAL_TEXT:
				return getConditionalText() != null;
			case TextPackage.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate() != null;
			case TextPackage.DOCUMENT_ROOT__CREATION_TIME:
				return getCreationTime() != null;
			case TextPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator() != null;
			case TextPackage.DOCUMENT_ROOT__SHAPES3D:
				return getShapes3d() != null;
			case TextPackage.DOCUMENT_ROOT__DATABASE_DISPLAY:
				return getDatabaseDisplay() != null;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NAME:
				return getDatabaseName() != null;
			case TextPackage.DOCUMENT_ROOT__DATABASE_NEXT:
				return getDatabaseNext() != null;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber() != null;
			case TextPackage.DOCUMENT_ROOT__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect() != null;
			case TextPackage.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_DECL:
				return getPresentationDecl() != null;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION:
				return getDdeConnection() != null;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECL:
				return getDdeConnectionDecl() != null;
			case TextPackage.DOCUMENT_ROOT__DDE_CONNECTION_DECLS:
				return getDdeConnectionDecls() != null;
			case TextPackage.DOCUMENT_ROOT__TEXT_SECTION_SOURCE_DDE:
				return getTextSectionSourceDde() != null;
			case TextPackage.DOCUMENT_ROOT__DELETION:
				return getDeletion() != null;
			case TextPackage.DOCUMENT_ROOT__TEXT_CHANGED_REGION_CONTENT:
				return getTextChangedRegionContent() != null;
			case TextPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case TextPackage.DOCUMENT_ROOT__PRESENTATION_ANIMATION_ELEMENTS:
				return getPresentationAnimationElements() != null;
			case TextPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				return getEditingCycles() != null;
			case TextPackage.DOCUMENT_ROOT__EDITING_DURATION:
				return getEditingDuration() != null;
			case TextPackage.DOCUMENT_ROOT__EXECUTE_MACRO:
				return getExecuteMacro() != null;
			case TextPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case TextPackage.DOCUMENT_ROOT__FILE_NAME:
				return getFileName() != null;
			case TextPackage.DOCUMENT_ROOT__FORMAT_CHANGE:
				return getFormatChange() != null;
			case TextPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return getFormProperty() != null;
			case TextPackage.DOCUMENT_ROOT__H:
				return getH() != null;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_PARAGRAPH:
				return getHiddenParagraph() != null;
			case TextPackage.DOCUMENT_ROOT__HIDDEN_TEXT:
				return getHiddenText() != null;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX:
				return getIllustrationIndex() != null;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return getIllustrationIndexEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__ILLUSTRATION_INDEX_SOURCE:
				return getIllustrationIndexSource() != null;
			case TextPackage.DOCUMENT_ROOT__IMAGE_COUNT:
				return getImageCount() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_BODY:
				return getIndexBody() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_BIBLIOGRAPHY:
				return getIndexEntryBibliography() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_CHAPTER:
				return getIndexEntryChapter() != null;
			case TextPackage.DOCUMENT_ROOT__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return getTextTableOfContentChildren() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_END:
				return getIndexEntryLinkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_LINK_START:
				return getIndexEntryLinkStart() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_PAGE_NUMBER:
				return getIndexEntryPageNumber() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_SPAN:
				return getIndexEntrySpan() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TAB_STOP:
				return getIndexEntryTabStop() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_ENTRY_TEXT:
				return getIndexEntryText() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLE:
				return getIndexSourceStyle() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_SOURCE_STYLES:
				return getIndexSourceStyles() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE:
				return getIndexTitle() != null;
			case TextPackage.DOCUMENT_ROOT__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				return getInitialCreator() != null;
			case TextPackage.DOCUMENT_ROOT__INSERTION:
				return getInsertion() != null;
			case TextPackage.DOCUMENT_ROOT__KEYWORDS:
				return getKeywords() != null;
			case TextPackage.DOCUMENT_ROOT__LINE_BREAK:
				return getLineBreak() != null;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_CONFIGURATION:
				return getLinenumberingConfiguration() != null;
			case TextPackage.DOCUMENT_ROOT__LINENUMBERING_SEPARATOR:
				return getLinenumberingSeparator() != null;
			case TextPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_HEADER:
				return getListHeader() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_ITEM:
				return getListItem() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_BULLET:
				return getListLevelStyleBullet() != null;
			case TextPackage.DOCUMENT_ROOT__TEXT_LIST_STYLE_CONTENT:
				return getTextListStyleContent() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_IMAGE:
				return getListLevelStyleImage() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_LEVEL_STYLE_NUMBER:
				return getListLevelStyleNumber() != null;
			case TextPackage.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle() != null;
			case TextPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_DATE:
				return getModificationDate() != null;
			case TextPackage.DOCUMENT_ROOT__MODIFICATION_TIME:
				return getModificationTime() != null;
			case TextPackage.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case TextPackage.DOCUMENT_ROOT__NOTE_BODY:
				return getNoteBody() != null;
			case TextPackage.DOCUMENT_ROOT__NOTE_CITATION:
				return getNoteCitation() != null;
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				return NOTE_CONTINUATION_NOTICE_BACKWARD_EDEFAULT == null ? getNoteContinuationNoticeBackward() != null : !NOTE_CONTINUATION_NOTICE_BACKWARD_EDEFAULT.equals(getNoteContinuationNoticeBackward());
			case TextPackage.DOCUMENT_ROOT__NOTE_CONTINUATION_NOTICE_FORWARD:
				return NOTE_CONTINUATION_NOTICE_FORWARD_EDEFAULT == null ? getNoteContinuationNoticeForward() != null : !NOTE_CONTINUATION_NOTICE_FORWARD_EDEFAULT.equals(getNoteContinuationNoticeForward());
			case TextPackage.DOCUMENT_ROOT__NOTE_REF:
				return getNoteRef() != null;
			case TextPackage.DOCUMENT_ROOT__NOTES_CONFIGURATION:
				return getNotesConfiguration() != null;
			case TextPackage.DOCUMENT_ROOT__NUMBER:
				return NUMBER_EDEFAULT == null ? getNumber() != null : !NUMBER_EDEFAULT.equals(getNumber());
			case TextPackage.DOCUMENT_ROOT__NUMBERED_PARAGRAPH:
				return getNumberedParagraph() != null;
			case TextPackage.DOCUMENT_ROOT__OBJECT_COUNT:
				return getObjectCount() != null;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX:
				return getObjectIndex() != null;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_ENTRY_TEMPLATE:
				return getObjectIndexEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__OBJECT_INDEX_SOURCE:
				return getObjectIndexSource() != null;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_LEVEL_STYLE:
				return getOutlineLevelStyle() != null;
			case TextPackage.DOCUMENT_ROOT__OUTLINE_STYLE:
				return getOutlineStyle() != null;
			case TextPackage.DOCUMENT_ROOT__P:
				return getP() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE:
				return getPage() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_CONTINUATION:
				return getPageContinuation() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_COUNT:
				return getPageCount() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return getPageNumber() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_SEQUENCE:
				return getPageSequence() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_GET:
				return getPageVariableGet() != null;
			case TextPackage.DOCUMENT_ROOT__PAGE_VARIABLE_SET:
				return getPageVariableSet() != null;
			case TextPackage.DOCUMENT_ROOT__PARAGRAPH_COUNT:
				return getParagraphCount() != null;
			case TextPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return getPlaceholder() != null;
			case TextPackage.DOCUMENT_ROOT__PRINT_DATE:
				return getPrintDate() != null;
			case TextPackage.DOCUMENT_ROOT__PRINTED_BY:
				return getPrintedBy() != null;
			case TextPackage.DOCUMENT_ROOT__PRINT_TIME:
				return getPrintTime() != null;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK:
				return getReferenceMark() != null;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_END:
				return getReferenceMarkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_MARK_START:
				return getReferenceMarkStart() != null;
			case TextPackage.DOCUMENT_ROOT__REFERENCE_REF:
				return getReferenceRef() != null;
			case TextPackage.DOCUMENT_ROOT__RUBY:
				return getRuby() != null;
			case TextPackage.DOCUMENT_ROOT__RUBY_BASE:
				return getRubyBase() != null;
			case TextPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return getRubyText() != null;
			case TextPackage.DOCUMENT_ROOT__S:
				return getS() != null;
			case TextPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case TextPackage.DOCUMENT_ROOT__SECTION:
				return getSection() != null;
			case TextPackage.DOCUMENT_ROOT__SECTION_SOURCE:
				return getSectionSource() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_CITY:
				return getSenderCity() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_COMPANY:
				return getSenderCompany() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_COUNTRY:
				return getSenderCountry() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_EMAIL:
				return getSenderEmail() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_FAX:
				return getSenderFax() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_FIRSTNAME:
				return getSenderFirstname() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_INITIALS:
				return getSenderInitials() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_LASTNAME:
				return getSenderLastname() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_PHONE_WORK:
				return getSenderPhoneWork() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSITION:
				return getSenderPosition() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_POSTAL_CODE:
				return getSenderPostalCode() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_STREET:
				return getSenderStreet() != null;
			case TextPackage.DOCUMENT_ROOT__SENDER_TITLE:
				return getSenderTitle() != null;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE:
				return getSequence() != null;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECL:
				return getSequenceDecl() != null;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_DECLS:
				return getSequenceDecls() != null;
			case TextPackage.DOCUMENT_ROOT__SEQUENCE_REF:
				return getSequenceRef() != null;
			case TextPackage.DOCUMENT_ROOT__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? getSheetName() != null : !SHEET_NAME_EDEFAULT.equals(getSheetName());
			case TextPackage.DOCUMENT_ROOT__SOFT_PAGE_BREAK:
				return getSoftPageBreak() != null;
			case TextPackage.DOCUMENT_ROOT__SORT_KEY:
				return getSortKey() != null;
			case TextPackage.DOCUMENT_ROOT__SPAN:
				return getSpan() != null;
			case TextPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case TextPackage.DOCUMENT_ROOT__TAB:
				return getTab() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_COUNT:
				return getTableCount() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_FORMULA:
				return getTableFormula() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX:
				return getTableIndex() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_ENTRY_TEMPLATE:
				return getTableIndexEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_INDEX_SOURCE:
				return getTableIndexSource() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT:
				return getTableOfContent() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return getTableOfContentEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__TABLE_OF_CONTENT_SOURCE:
				return getTableOfContentSource() != null;
			case TextPackage.DOCUMENT_ROOT__TEMPLATE_NAME:
				return getTemplateName() != null;
			case TextPackage.DOCUMENT_ROOT__TEXT_INPUT:
				return getTextInput() != null;
			case TextPackage.DOCUMENT_ROOT__TIME:
				return getTime() != null;
			case TextPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK:
				return getTocMark() != null;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_END:
				return getTocMarkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__TOC_MARK_START:
				return getTocMarkStart() != null;
			case TextPackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return getTrackedChanges() != null;
			case TextPackage.DOCUMENT_ROOT__USER_DEFINED:
				return getUserDefined() != null;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECL:
				return getUserFieldDecl() != null;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_DECLS:
				return getUserFieldDecls() != null;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_GET:
				return getUserFieldGet() != null;
			case TextPackage.DOCUMENT_ROOT__USER_FIELD_INPUT:
				return getUserFieldInput() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX:
				return getUserIndex() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_ENTRY_TEMPLATE:
				return getUserIndexEntryTemplate() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK:
				return getUserIndexMark() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_MARK_START:
				return getUserIndexMarkStart() != null;
			case TextPackage.DOCUMENT_ROOT__USER_INDEX_SOURCE:
				return getUserIndexSource() != null;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECL:
				return getVariableDecl() != null;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_DECLS:
				return getVariableDecls() != null;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_GET:
				return getVariableGet() != null;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_INPUT:
				return getVariableInput() != null;
			case TextPackage.DOCUMENT_ROOT__VARIABLE_SET:
				return getVariableSet() != null;
			case TextPackage.DOCUMENT_ROOT__WORD_COUNT:
				return getWordCount() != null;
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
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
