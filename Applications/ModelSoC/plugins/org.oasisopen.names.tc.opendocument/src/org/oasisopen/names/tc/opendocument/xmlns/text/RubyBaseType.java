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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruby Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDateTime <em>Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType()
 * @model extendedMetaData="name='ruby-base_._type' kind='mixed'"
 * @generated
 */
public interface RubyBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference.
	 * @see #setS(SType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_S()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='s' namespace='##targetNamespace'"
	 * @generated
	 */
	SType getS();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(SType value);

	/**
	 * Returns the value of the '<em><b>Tab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' containment reference.
	 * @see #setTab(TabType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Tab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tab' namespace='##targetNamespace'"
	 * @generated
	 */
	TabType getTab();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTab <em>Tab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' containment reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(TabType value);

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' containment reference.
	 * @see #setLineBreak(LineBreakType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_LineBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line-break' namespace='##targetNamespace'"
	 * @generated
	 */
	LineBreakType getLineBreak();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getLineBreak <em>Line Break</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Break</em>' containment reference.
	 * @see #getLineBreak()
	 * @generated
	 */
	void setLineBreak(LineBreakType value);

	/**
	 * Returns the value of the '<em><b>Soft Page Break</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break</em>' containment reference.
	 * @see #setSoftPageBreak(SoftPageBreakType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SoftPageBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftPageBreakType getSoftPageBreak();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSoftPageBreak <em>Soft Page Break</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Page Break</em>' containment reference.
	 * @see #getSoftPageBreak()
	 * @generated
	 */
	void setSoftPageBreak(SoftPageBreakType value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference.
	 * @see #setSpan(SpanType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace'"
	 * @generated
	 */
	SpanType getSpan();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSpan <em>Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' containment reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(SpanType value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(AType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	AType getA();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(AType value);

	/**
	 * Returns the value of the '<em><b>Bookmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark</em>' containment reference.
	 * @see #setBookmark(BookmarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Bookmark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark' namespace='##targetNamespace'"
	 * @generated
	 */
	BookmarkType getBookmark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmark <em>Bookmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookmark</em>' containment reference.
	 * @see #getBookmark()
	 * @generated
	 */
	void setBookmark(BookmarkType value);

	/**
	 * Returns the value of the '<em><b>Bookmark Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark Start</em>' containment reference.
	 * @see #setBookmarkStart(BookmarkStartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_BookmarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-start' namespace='##targetNamespace'"
	 * @generated
	 */
	BookmarkStartType getBookmarkStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkStart <em>Bookmark Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookmark Start</em>' containment reference.
	 * @see #getBookmarkStart()
	 * @generated
	 */
	void setBookmarkStart(BookmarkStartType value);

	/**
	 * Returns the value of the '<em><b>Bookmark End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark End</em>' containment reference.
	 * @see #setBookmarkEnd(BookmarkEndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_BookmarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-end' namespace='##targetNamespace'"
	 * @generated
	 */
	BookmarkEndType getBookmarkEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkEnd <em>Bookmark End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookmark End</em>' containment reference.
	 * @see #getBookmarkEnd()
	 * @generated
	 */
	void setBookmarkEnd(BookmarkEndType value);

	/**
	 * Returns the value of the '<em><b>Reference Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark</em>' containment reference.
	 * @see #setReferenceMark(ReferenceMarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ReferenceMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceMarkType getReferenceMark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMark <em>Reference Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mark</em>' containment reference.
	 * @see #getReferenceMark()
	 * @generated
	 */
	void setReferenceMark(ReferenceMarkType value);

	/**
	 * Returns the value of the '<em><b>Reference Mark Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark Start</em>' containment reference.
	 * @see #setReferenceMarkStart(ReferenceMarkStartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ReferenceMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-start' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceMarkStartType getReferenceMarkStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMarkStart <em>Reference Mark Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mark Start</em>' containment reference.
	 * @see #getReferenceMarkStart()
	 * @generated
	 */
	void setReferenceMarkStart(ReferenceMarkStartType value);

	/**
	 * Returns the value of the '<em><b>Reference Mark End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark End</em>' containment reference.
	 * @see #setReferenceMarkEnd(ReferenceMarkEndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ReferenceMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-end' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceMarkEndType getReferenceMarkEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceMarkEnd <em>Reference Mark End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mark End</em>' containment reference.
	 * @see #getReferenceMarkEnd()
	 * @generated
	 */
	void setReferenceMarkEnd(ReferenceMarkEndType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference.
	 * @see #setRuby(RubyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Ruby()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyType getRuby();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRuby <em>Ruby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby</em>' containment reference.
	 * @see #getRuby()
	 * @generated
	 */
	void setRuby(RubyType value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(AnnotationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	AnnotationType getAnnotation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Change Marks Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ChangeMarksGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='change-marks:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getChangeMarksGroup();

	/**
	 * Returns the value of the '<em><b>Change Marks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks</em>' containment reference.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ChangeMarks()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-marks' namespace='##targetNamespace' group='change-marks:group'"
	 * @generated
	 */
	ChangeMarksType getChangeMarks();

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference.
	 * @see #setRect(RectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Rect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	RectType getRect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRect <em>Rect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rect</em>' containment reference.
	 * @see #getRect()
	 * @generated
	 */
	void setRect(RectType value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Line()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	LineType getLine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineType value);

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference.
	 * @see #setPolyline(PolylineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Polyline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	PolylineType getPolyline();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPolyline <em>Polyline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline</em>' containment reference.
	 * @see #getPolyline()
	 * @generated
	 */
	void setPolyline(PolylineType value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Polygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Regular Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Polygon</em>' containment reference.
	 * @see #setRegularPolygon(RegularPolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_RegularPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	RegularPolygonType getRegularPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getRegularPolygon <em>Regular Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Polygon</em>' containment reference.
	 * @see #getRegularPolygon()
	 * @generated
	 */
	void setRegularPolygon(RegularPolygonType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Path()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	PathType getPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference.
	 * @see #setCircle(CircleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Circle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	CircleType getCircle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCircle <em>Circle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle</em>' containment reference.
	 * @see #getCircle()
	 * @generated
	 */
	void setCircle(CircleType value);

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference.
	 * @see #setEllipse(EllipseType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Ellipse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	EllipseType getEllipse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEllipse <em>Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse</em>' containment reference.
	 * @see #getEllipse()
	 * @generated
	 */
	void setEllipse(EllipseType value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference.
	 * @see #setG(GType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_G()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	GType getG();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getG <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' containment reference.
	 * @see #getG()
	 * @generated
	 */
	void setG(GType value);

	/**
	 * Returns the value of the '<em><b>Page Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Thumbnail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Thumbnail</em>' containment reference.
	 * @see #setPageThumbnail(PageThumbnailType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageThumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	PageThumbnailType getPageThumbnail();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageThumbnail <em>Page Thumbnail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Thumbnail</em>' containment reference.
	 * @see #getPageThumbnail()
	 * @generated
	 */
	void setPageThumbnail(PageThumbnailType value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(FrameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Frame()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	MeasureType getMeasure();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Caption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(ConnectorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	ConnectorType getConnector();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(ControlType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	ControlType getControl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlType value);

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference.
	 * @see #setScene(SceneType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Scene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	SceneType getScene();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getScene <em>Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' containment reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(SceneType value);

	/**
	 * Returns the value of the '<em><b>Custom Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Shape</em>' containment reference.
	 * @see #setCustomShape(CustomShapeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_CustomShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	CustomShapeType getCustomShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCustomShape <em>Custom Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Shape</em>' containment reference.
	 * @see #getCustomShape()
	 * @generated
	 */
	void setCustomShape(CustomShapeType value);

	/**
	 * Returns the value of the '<em><b>A1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A1</em>' containment reference.
	 * @see #setA1(org.oasisopen.names.tc.opendocument.xmlns.drawing.AType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_A1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.drawing.AType getA1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getA1 <em>A1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A1</em>' containment reference.
	 * @see #getA1()
	 * @generated
	 */
	void setA1(org.oasisopen.names.tc.opendocument.xmlns.drawing.AType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Time()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeType getTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeType value);

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' containment reference.
	 * @see #setPageNumber(PageNumberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-number' namespace='##targetNamespace'"
	 * @generated
	 */
	PageNumberType getPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageNumber <em>Page Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Number</em>' containment reference.
	 * @see #getPageNumber()
	 * @generated
	 */
	void setPageNumber(PageNumberType value);

	/**
	 * Returns the value of the '<em><b>Page Continuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Continuation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Continuation</em>' containment reference.
	 * @see #setPageContinuation(PageContinuationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageContinuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-continuation' namespace='##targetNamespace'"
	 * @generated
	 */
	PageContinuationType getPageContinuation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageContinuation <em>Page Continuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Continuation</em>' containment reference.
	 * @see #getPageContinuation()
	 * @generated
	 */
	void setPageContinuation(PageContinuationType value);

	/**
	 * Returns the value of the '<em><b>Sender Firstname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Firstname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Firstname</em>' containment reference.
	 * @see #setSenderFirstname(SenderFirstnameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderFirstname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderFirstnameType getSenderFirstname();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderFirstname <em>Sender Firstname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Firstname</em>' containment reference.
	 * @see #getSenderFirstname()
	 * @generated
	 */
	void setSenderFirstname(SenderFirstnameType value);

	/**
	 * Returns the value of the '<em><b>Sender Lastname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Lastname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Lastname</em>' containment reference.
	 * @see #setSenderLastname(SenderLastnameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderLastname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-lastname' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderLastnameType getSenderLastname();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderLastname <em>Sender Lastname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Lastname</em>' containment reference.
	 * @see #getSenderLastname()
	 * @generated
	 */
	void setSenderLastname(SenderLastnameType value);

	/**
	 * Returns the value of the '<em><b>Sender Initials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Initials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Initials</em>' containment reference.
	 * @see #setSenderInitials(SenderInitialsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-initials' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderInitialsType getSenderInitials();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderInitials <em>Sender Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Initials</em>' containment reference.
	 * @see #getSenderInitials()
	 * @generated
	 */
	void setSenderInitials(SenderInitialsType value);

	/**
	 * Returns the value of the '<em><b>Sender Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Title</em>' containment reference.
	 * @see #setSenderTitle(SenderTitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-title' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderTitleType getSenderTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderTitle <em>Sender Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Title</em>' containment reference.
	 * @see #getSenderTitle()
	 * @generated
	 */
	void setSenderTitle(SenderTitleType value);

	/**
	 * Returns the value of the '<em><b>Sender Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Position</em>' containment reference.
	 * @see #setSenderPosition(SenderPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderPosition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-position' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderPositionType getSenderPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPosition <em>Sender Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Position</em>' containment reference.
	 * @see #getSenderPosition()
	 * @generated
	 */
	void setSenderPosition(SenderPositionType value);

	/**
	 * Returns the value of the '<em><b>Sender Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Email</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Email</em>' containment reference.
	 * @see #setSenderEmail(SenderEmailType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderEmail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-email' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderEmailType getSenderEmail();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderEmail <em>Sender Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Email</em>' containment reference.
	 * @see #getSenderEmail()
	 * @generated
	 */
	void setSenderEmail(SenderEmailType value);

	/**
	 * Returns the value of the '<em><b>Sender Phone Private</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Phone Private</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Phone Private</em>' containment reference.
	 * @see #setSenderPhonePrivate(SenderPhonePrivateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderPhonePrivate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-private' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderPhonePrivateType getSenderPhonePrivate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPhonePrivate <em>Sender Phone Private</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Phone Private</em>' containment reference.
	 * @see #getSenderPhonePrivate()
	 * @generated
	 */
	void setSenderPhonePrivate(SenderPhonePrivateType value);

	/**
	 * Returns the value of the '<em><b>Sender Fax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Fax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Fax</em>' containment reference.
	 * @see #setSenderFax(SenderFaxType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderFax()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-fax' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderFaxType getSenderFax();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderFax <em>Sender Fax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Fax</em>' containment reference.
	 * @see #getSenderFax()
	 * @generated
	 */
	void setSenderFax(SenderFaxType value);

	/**
	 * Returns the value of the '<em><b>Sender Company</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Company</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Company</em>' containment reference.
	 * @see #setSenderCompany(SenderCompanyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderCompany()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-company' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderCompanyType getSenderCompany();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCompany <em>Sender Company</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Company</em>' containment reference.
	 * @see #getSenderCompany()
	 * @generated
	 */
	void setSenderCompany(SenderCompanyType value);

	/**
	 * Returns the value of the '<em><b>Sender Phone Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Phone Work</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Phone Work</em>' containment reference.
	 * @see #setSenderPhoneWork(SenderPhoneWorkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderPhoneWork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-work' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderPhoneWorkType getSenderPhoneWork();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPhoneWork <em>Sender Phone Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Phone Work</em>' containment reference.
	 * @see #getSenderPhoneWork()
	 * @generated
	 */
	void setSenderPhoneWork(SenderPhoneWorkType value);

	/**
	 * Returns the value of the '<em><b>Sender Street</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Street</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Street</em>' containment reference.
	 * @see #setSenderStreet(SenderStreetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderStreet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-street' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderStreetType getSenderStreet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderStreet <em>Sender Street</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Street</em>' containment reference.
	 * @see #getSenderStreet()
	 * @generated
	 */
	void setSenderStreet(SenderStreetType value);

	/**
	 * Returns the value of the '<em><b>Sender City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender City</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender City</em>' containment reference.
	 * @see #setSenderCity(SenderCityType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderCity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-city' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderCityType getSenderCity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCity <em>Sender City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender City</em>' containment reference.
	 * @see #getSenderCity()
	 * @generated
	 */
	void setSenderCity(SenderCityType value);

	/**
	 * Returns the value of the '<em><b>Sender Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Postal Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Postal Code</em>' containment reference.
	 * @see #setSenderPostalCode(SenderPostalCodeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderPostalCode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-postal-code' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderPostalCodeType getSenderPostalCode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderPostalCode <em>Sender Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Postal Code</em>' containment reference.
	 * @see #getSenderPostalCode()
	 * @generated
	 */
	void setSenderPostalCode(SenderPostalCodeType value);

	/**
	 * Returns the value of the '<em><b>Sender Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Country</em>' containment reference.
	 * @see #setSenderCountry(SenderCountryType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderCountry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-country' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderCountryType getSenderCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderCountry <em>Sender Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Country</em>' containment reference.
	 * @see #getSenderCountry()
	 * @generated
	 */
	void setSenderCountry(SenderCountryType value);

	/**
	 * Returns the value of the '<em><b>Sender State Or Province</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender State Or Province</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender State Or Province</em>' containment reference.
	 * @see #setSenderStateOrProvince(SenderStateOrProvinceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SenderStateOrProvince()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-state-or-province' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderStateOrProvinceType getSenderStateOrProvince();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSenderStateOrProvince <em>Sender State Or Province</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender State Or Province</em>' containment reference.
	 * @see #getSenderStateOrProvince()
	 * @generated
	 */
	void setSenderStateOrProvince(SenderStateOrProvinceType value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' containment reference.
	 * @see #setAuthorName(AuthorNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_AuthorName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-name' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorNameType getAuthorName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAuthorName <em>Author Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' containment reference.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(AuthorNameType value);

	/**
	 * Returns the value of the '<em><b>Author Initials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Initials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Initials</em>' containment reference.
	 * @see #setAuthorInitials(AuthorInitialsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_AuthorInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-initials' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorInitialsType getAuthorInitials();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAuthorInitials <em>Author Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Initials</em>' containment reference.
	 * @see #getAuthorInitials()
	 * @generated
	 */
	void setAuthorInitials(AuthorInitialsType value);

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' containment reference.
	 * @see #setChapter(ChapterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Chapter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
	 * @generated
	 */
	ChapterType getChapter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getChapter <em>Chapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter</em>' containment reference.
	 * @see #getChapter()
	 * @generated
	 */
	void setChapter(ChapterType value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference.
	 * @see #setFileName(FileNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_FileName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file-name' namespace='##targetNamespace'"
	 * @generated
	 */
	FileNameType getFileName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameType value);

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' containment reference.
	 * @see #setTemplateName(TemplateNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TemplateName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template-name' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplateNameType getTemplateName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTemplateName <em>Template Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' containment reference.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(TemplateNameType value);

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SheetName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sheet-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Set</em>' containment reference.
	 * @see #setVariableSet(VariableSetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_VariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-set' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableSetType getVariableSet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableSet <em>Variable Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Set</em>' containment reference.
	 * @see #getVariableSet()
	 * @generated
	 */
	void setVariableSet(VariableSetType value);

	/**
	 * Returns the value of the '<em><b>Variable Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Get</em>' containment reference.
	 * @see #setVariableGet(VariableGetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_VariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-get' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableGetType getVariableGet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableGet <em>Variable Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Get</em>' containment reference.
	 * @see #getVariableGet()
	 * @generated
	 */
	void setVariableGet(VariableGetType value);

	/**
	 * Returns the value of the '<em><b>Variable Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Input</em>' containment reference.
	 * @see #setVariableInput(VariableInputType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_VariableInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-input' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableInputType getVariableInput();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getVariableInput <em>Variable Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Input</em>' containment reference.
	 * @see #getVariableInput()
	 * @generated
	 */
	void setVariableInput(VariableInputType value);

	/**
	 * Returns the value of the '<em><b>User Field Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Get</em>' containment reference.
	 * @see #setUserFieldGet(UserFieldGetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserFieldGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-get' namespace='##targetNamespace'"
	 * @generated
	 */
	UserFieldGetType getUserFieldGet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserFieldGet <em>User Field Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Field Get</em>' containment reference.
	 * @see #getUserFieldGet()
	 * @generated
	 */
	void setUserFieldGet(UserFieldGetType value);

	/**
	 * Returns the value of the '<em><b>User Field Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Input</em>' containment reference.
	 * @see #setUserFieldInput(UserFieldInputType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserFieldInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-input' namespace='##targetNamespace'"
	 * @generated
	 */
	UserFieldInputType getUserFieldInput();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserFieldInput <em>User Field Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Field Input</em>' containment reference.
	 * @see #getUserFieldInput()
	 * @generated
	 */
	void setUserFieldInput(UserFieldInputType value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(SequenceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Sequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Expression()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getExpression();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionType value);

	/**
	 * Returns the value of the '<em><b>Text Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Input</em>' containment reference.
	 * @see #setTextInput(TextInputType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TextInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-input' namespace='##targetNamespace'"
	 * @generated
	 */
	TextInputType getTextInput();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTextInput <em>Text Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Input</em>' containment reference.
	 * @see #getTextInput()
	 * @generated
	 */
	void setTextInput(TextInputType value);

	/**
	 * Returns the value of the '<em><b>Initial Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Creator</em>' containment reference.
	 * @see #setInitialCreator(InitialCreatorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_InitialCreator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initial-creator' namespace='##targetNamespace'"
	 * @generated
	 */
	InitialCreatorType getInitialCreator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getInitialCreator <em>Initial Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Creator</em>' containment reference.
	 * @see #getInitialCreator()
	 * @generated
	 */
	void setInitialCreator(InitialCreatorType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference.
	 * @see #setCreationDate(CreationDateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_CreationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-date' namespace='##targetNamespace'"
	 * @generated
	 */
	CreationDateType getCreationDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreationDate <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' containment reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(CreationDateType value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' containment reference.
	 * @see #setCreationTime(CreationTimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_CreationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-time' namespace='##targetNamespace'"
	 * @generated
	 */
	CreationTimeType getCreationTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreationTime <em>Creation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' containment reference.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(CreationTimeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined</em>' containment reference.
	 * @see #setUserDefined(UserDefinedType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserDefined()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-defined' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDefinedType getUserDefined();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserDefined <em>User Defined</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' containment reference.
	 * @see #getUserDefined()
	 * @generated
	 */
	void setUserDefined(UserDefinedType value);

	/**
	 * Returns the value of the '<em><b>Print Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Time</em>' containment reference.
	 * @see #setPrintTime(PrintTimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PrintTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-time' namespace='##targetNamespace'"
	 * @generated
	 */
	PrintTimeType getPrintTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintTime <em>Print Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Time</em>' containment reference.
	 * @see #getPrintTime()
	 * @generated
	 */
	void setPrintTime(PrintTimeType value);

	/**
	 * Returns the value of the '<em><b>Print Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Date</em>' containment reference.
	 * @see #setPrintDate(PrintDateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PrintDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-date' namespace='##targetNamespace'"
	 * @generated
	 */
	PrintDateType getPrintDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintDate <em>Print Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Date</em>' containment reference.
	 * @see #getPrintDate()
	 * @generated
	 */
	void setPrintDate(PrintDateType value);

	/**
	 * Returns the value of the '<em><b>Printed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printed By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printed By</em>' containment reference.
	 * @see #setPrintedBy(PrintedByType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PrintedBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printed-by' namespace='##targetNamespace'"
	 * @generated
	 */
	PrintedByType getPrintedBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPrintedBy <em>Printed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printed By</em>' containment reference.
	 * @see #getPrintedBy()
	 * @generated
	 */
	void setPrintedBy(PrintedByType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Subject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectType getSubject();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectType value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference.
	 * @see #setKeywords(KeywordsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Keywords()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywords' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordsType getKeywords();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getKeywords <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' containment reference.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(KeywordsType value);

	/**
	 * Returns the value of the '<em><b>Editing Cycles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Cycles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Cycles</em>' containment reference.
	 * @see #setEditingCycles(EditingCyclesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_EditingCycles()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-cycles' namespace='##targetNamespace'"
	 * @generated
	 */
	EditingCyclesType getEditingCycles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEditingCycles <em>Editing Cycles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Cycles</em>' containment reference.
	 * @see #getEditingCycles()
	 * @generated
	 */
	void setEditingCycles(EditingCyclesType value);

	/**
	 * Returns the value of the '<em><b>Editing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Duration</em>' containment reference.
	 * @see #setEditingDuration(EditingDurationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_EditingDuration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-duration' namespace='##targetNamespace'"
	 * @generated
	 */
	EditingDurationType getEditingDuration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getEditingDuration <em>Editing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Duration</em>' containment reference.
	 * @see #getEditingDuration()
	 * @generated
	 */
	void setEditingDuration(EditingDurationType value);

	/**
	 * Returns the value of the '<em><b>Modification Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Time</em>' containment reference.
	 * @see #setModificationTime(ModificationTimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ModificationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-time' namespace='##targetNamespace'"
	 * @generated
	 */
	ModificationTimeType getModificationTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getModificationTime <em>Modification Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Time</em>' containment reference.
	 * @see #getModificationTime()
	 * @generated
	 */
	void setModificationTime(ModificationTimeType value);

	/**
	 * Returns the value of the '<em><b>Modification Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date</em>' containment reference.
	 * @see #setModificationDate(ModificationDateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ModificationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-date' namespace='##targetNamespace'"
	 * @generated
	 */
	ModificationDateType getModificationDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getModificationDate <em>Modification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date</em>' containment reference.
	 * @see #getModificationDate()
	 * @generated
	 */
	void setModificationDate(ModificationDateType value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(CreatorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Creator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	CreatorType getCreator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(CreatorType value);

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Count</em>' containment reference.
	 * @see #setPageCount(PageCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace'"
	 * @generated
	 */
	PageCountType getPageCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageCount <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' containment reference.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(PageCountType value);

	/**
	 * Returns the value of the '<em><b>Paragraph Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Count</em>' containment reference.
	 * @see #setParagraphCount(ParagraphCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ParagraphCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paragraph-count' namespace='##targetNamespace'"
	 * @generated
	 */
	ParagraphCountType getParagraphCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getParagraphCount <em>Paragraph Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Count</em>' containment reference.
	 * @see #getParagraphCount()
	 * @generated
	 */
	void setParagraphCount(ParagraphCountType value);

	/**
	 * Returns the value of the '<em><b>Word Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Count</em>' containment reference.
	 * @see #setWordCount(WordCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_WordCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='word-count' namespace='##targetNamespace'"
	 * @generated
	 */
	WordCountType getWordCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getWordCount <em>Word Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Count</em>' containment reference.
	 * @see #getWordCount()
	 * @generated
	 */
	void setWordCount(WordCountType value);

	/**
	 * Returns the value of the '<em><b>Character Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Count</em>' containment reference.
	 * @see #setCharacterCount(CharacterCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_CharacterCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='character-count' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterCountType getCharacterCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getCharacterCount <em>Character Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Count</em>' containment reference.
	 * @see #getCharacterCount()
	 * @generated
	 */
	void setCharacterCount(CharacterCountType value);

	/**
	 * Returns the value of the '<em><b>Table Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Count</em>' containment reference.
	 * @see #setTableCount(TableCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TableCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-count' namespace='##targetNamespace'"
	 * @generated
	 */
	TableCountType getTableCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTableCount <em>Table Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Count</em>' containment reference.
	 * @see #getTableCount()
	 * @generated
	 */
	void setTableCount(TableCountType value);

	/**
	 * Returns the value of the '<em><b>Image Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Count</em>' containment reference.
	 * @see #setImageCount(ImageCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ImageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image-count' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageCountType getImageCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getImageCount <em>Image Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Count</em>' containment reference.
	 * @see #getImageCount()
	 * @generated
	 */
	void setImageCount(ImageCountType value);

	/**
	 * Returns the value of the '<em><b>Object Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Count</em>' containment reference.
	 * @see #setObjectCount(ObjectCountType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ObjectCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-count' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectCountType getObjectCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getObjectCount <em>Object Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Count</em>' containment reference.
	 * @see #getObjectCount()
	 * @generated
	 */
	void setObjectCount(ObjectCountType value);

	/**
	 * Returns the value of the '<em><b>Database Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Display</em>' containment reference.
	 * @see #setDatabaseDisplay(TextDatabaseDisplayAttlist)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DatabaseDisplay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-display' namespace='##targetNamespace'"
	 * @generated
	 */
	TextDatabaseDisplayAttlist getDatabaseDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseDisplay <em>Database Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Display</em>' containment reference.
	 * @see #getDatabaseDisplay()
	 * @generated
	 */
	void setDatabaseDisplay(TextDatabaseDisplayAttlist value);

	/**
	 * Returns the value of the '<em><b>Database Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Next</em>' containment reference.
	 * @see #setDatabaseNext(TextDatabaseNextAttlist)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DatabaseNext()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-next' namespace='##targetNamespace'"
	 * @generated
	 */
	TextDatabaseNextAttlist getDatabaseNext();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseNext <em>Database Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Next</em>' containment reference.
	 * @see #getDatabaseNext()
	 * @generated
	 */
	void setDatabaseNext(TextDatabaseNextAttlist value);

	/**
	 * Returns the value of the '<em><b>Database Row Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Row Select</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Row Select</em>' containment reference.
	 * @see #setDatabaseRowSelect(TextDatabaseRowSelectAttlist)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DatabaseRowSelect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-select' namespace='##targetNamespace'"
	 * @generated
	 */
	TextDatabaseRowSelectAttlist getDatabaseRowSelect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseRowSelect <em>Database Row Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Row Select</em>' containment reference.
	 * @see #getDatabaseRowSelect()
	 * @generated
	 */
	void setDatabaseRowSelect(TextDatabaseRowSelectAttlist value);

	/**
	 * Returns the value of the '<em><b>Database Row Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Row Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Row Number</em>' containment reference.
	 * @see #setDatabaseRowNumber(DatabaseRowNumberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DatabaseRowNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-number' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseRowNumberType getDatabaseRowNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseRowNumber <em>Database Row Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Row Number</em>' containment reference.
	 * @see #getDatabaseRowNumber()
	 * @generated
	 */
	void setDatabaseRowNumber(DatabaseRowNumberType value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' containment reference.
	 * @see #setDatabaseName(DatabaseNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DatabaseName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseNameType getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDatabaseName <em>Database Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' containment reference.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(DatabaseNameType value);

	/**
	 * Returns the value of the '<em><b>Page Variable Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Variable Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Variable Set</em>' containment reference.
	 * @see #setPageVariableSet(PageVariableSetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageVariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-set' namespace='##targetNamespace'"
	 * @generated
	 */
	PageVariableSetType getPageVariableSet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageVariableSet <em>Page Variable Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Variable Set</em>' containment reference.
	 * @see #getPageVariableSet()
	 * @generated
	 */
	void setPageVariableSet(PageVariableSetType value);

	/**
	 * Returns the value of the '<em><b>Page Variable Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Variable Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Variable Get</em>' containment reference.
	 * @see #setPageVariableGet(PageVariableGetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_PageVariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-get' namespace='##targetNamespace'"
	 * @generated
	 */
	PageVariableGetType getPageVariableGet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPageVariableGet <em>Page Variable Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Variable Get</em>' containment reference.
	 * @see #getPageVariableGet()
	 * @generated
	 */
	void setPageVariableGet(PageVariableGetType value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' containment reference.
	 * @see #setPlaceholder(PlaceholderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Placeholder()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='placeholder' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaceholderType getPlaceholder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getPlaceholder <em>Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' containment reference.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(PlaceholderType value);

	/**
	 * Returns the value of the '<em><b>Conditional Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Text</em>' containment reference.
	 * @see #setConditionalText(ConditionalTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ConditionalText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conditional-text' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionalTextType getConditionalText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getConditionalText <em>Conditional Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Text</em>' containment reference.
	 * @see #getConditionalText()
	 * @generated
	 */
	void setConditionalText(ConditionalTextType value);

	/**
	 * Returns the value of the '<em><b>Hidden Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Text</em>' containment reference.
	 * @see #setHiddenText(HiddenTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_HiddenText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-text' namespace='##targetNamespace'"
	 * @generated
	 */
	HiddenTextType getHiddenText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHiddenText <em>Hidden Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Text</em>' containment reference.
	 * @see #getHiddenText()
	 * @generated
	 */
	void setHiddenText(HiddenTextType value);

	/**
	 * Returns the value of the '<em><b>Reference Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Ref</em>' containment reference.
	 * @see #setReferenceRef(ReferenceRefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ReferenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceRefType getReferenceRef();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getReferenceRef <em>Reference Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Ref</em>' containment reference.
	 * @see #getReferenceRef()
	 * @generated
	 */
	void setReferenceRef(ReferenceRefType value);

	/**
	 * Returns the value of the '<em><b>Bookmark Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark Ref</em>' containment reference.
	 * @see #setBookmarkRef(BookmarkRefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_BookmarkRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	BookmarkRefType getBookmarkRef();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBookmarkRef <em>Bookmark Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookmark Ref</em>' containment reference.
	 * @see #getBookmarkRef()
	 * @generated
	 */
	void setBookmarkRef(BookmarkRefType value);

	/**
	 * Returns the value of the '<em><b>Note Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Ref</em>' containment reference.
	 * @see #setNoteRef(NoteRefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_NoteRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteRefType getNoteRef();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getNoteRef <em>Note Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Ref</em>' containment reference.
	 * @see #getNoteRef()
	 * @generated
	 */
	void setNoteRef(NoteRefType value);

	/**
	 * Returns the value of the '<em><b>Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Ref</em>' containment reference.
	 * @see #setSequenceRef(SequenceRefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_SequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceRefType getSequenceRef();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getSequenceRef <em>Sequence Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Ref</em>' containment reference.
	 * @see #getSequenceRef()
	 * @generated
	 */
	void setSequenceRef(SequenceRefType value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(ScriptType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptType getScript();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptType value);

	/**
	 * Returns the value of the '<em><b>Execute Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Macro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Macro</em>' containment reference.
	 * @see #setExecuteMacro(ExecuteMacroType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_ExecuteMacro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='execute-macro' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecuteMacroType getExecuteMacro();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getExecuteMacro <em>Execute Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Macro</em>' containment reference.
	 * @see #getExecuteMacro()
	 * @generated
	 */
	void setExecuteMacro(ExecuteMacroType value);

	/**
	 * Returns the value of the '<em><b>Hidden Paragraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Paragraph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Paragraph</em>' containment reference.
	 * @see #setHiddenParagraph(HiddenParagraphType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_HiddenParagraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-paragraph' namespace='##targetNamespace'"
	 * @generated
	 */
	HiddenParagraphType getHiddenParagraph();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHiddenParagraph <em>Hidden Paragraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Paragraph</em>' containment reference.
	 * @see #getHiddenParagraph()
	 * @generated
	 */
	void setHiddenParagraph(HiddenParagraphType value);

	/**
	 * Returns the value of the '<em><b>Dde Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Connection</em>' containment reference.
	 * @see #setDdeConnection(DdeConnectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DdeConnection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dde-connection' namespace='##targetNamespace'"
	 * @generated
	 */
	DdeConnectionType getDdeConnection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDdeConnection <em>Dde Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Connection</em>' containment reference.
	 * @see #getDdeConnection()
	 * @generated
	 */
	void setDdeConnection(DdeConnectionType value);

	/**
	 * Returns the value of the '<em><b>Measure1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure1</em>' containment reference.
	 * @see #setMeasure1(org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Measure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType getMeasure1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getMeasure1 <em>Measure1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure1</em>' containment reference.
	 * @see #getMeasure1()
	 * @generated
	 */
	void setMeasure1(org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType value);

	/**
	 * Returns the value of the '<em><b>Table Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Formula</em>' containment reference.
	 * @see #setTableFormula(TableFormulaType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TableFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-formula' namespace='##targetNamespace'"
	 * @generated
	 */
	TableFormulaType getTableFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTableFormula <em>Table Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Formula</em>' containment reference.
	 * @see #getTableFormula()
	 * @generated
	 */
	void setTableFormula(TableFormulaType value);

	/**
	 * Returns the value of the '<em><b>Toc Mark Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark Start</em>' containment reference.
	 * @see #setTocMarkStart(TocMarkStartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TocMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-start' namespace='##targetNamespace'"
	 * @generated
	 */
	TocMarkStartType getTocMarkStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMarkStart <em>Toc Mark Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toc Mark Start</em>' containment reference.
	 * @see #getTocMarkStart()
	 * @generated
	 */
	void setTocMarkStart(TocMarkStartType value);

	/**
	 * Returns the value of the '<em><b>Toc Mark End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark End</em>' containment reference.
	 * @see #setTocMarkEnd(TocMarkEndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TocMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-end' namespace='##targetNamespace'"
	 * @generated
	 */
	TocMarkEndType getTocMarkEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMarkEnd <em>Toc Mark End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toc Mark End</em>' containment reference.
	 * @see #getTocMarkEnd()
	 * @generated
	 */
	void setTocMarkEnd(TocMarkEndType value);

	/**
	 * Returns the value of the '<em><b>Toc Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark</em>' containment reference.
	 * @see #setTocMark(TocMarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_TocMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark' namespace='##targetNamespace'"
	 * @generated
	 */
	TocMarkType getTocMark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getTocMark <em>Toc Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toc Mark</em>' containment reference.
	 * @see #getTocMark()
	 * @generated
	 */
	void setTocMark(TocMarkType value);

	/**
	 * Returns the value of the '<em><b>User Index Mark Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark Start</em>' containment reference.
	 * @see #setUserIndexMarkStart(UserIndexMarkStartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-start' namespace='##targetNamespace'"
	 * @generated
	 */
	UserIndexMarkStartType getUserIndexMarkStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMarkStart <em>User Index Mark Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Index Mark Start</em>' containment reference.
	 * @see #getUserIndexMarkStart()
	 * @generated
	 */
	void setUserIndexMarkStart(UserIndexMarkStartType value);

	/**
	 * Returns the value of the '<em><b>User Index Mark End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark End</em>' containment reference.
	 * @see #setUserIndexMarkEnd(UserIndexMarkEndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-end' namespace='##targetNamespace'"
	 * @generated
	 */
	UserIndexMarkEndType getUserIndexMarkEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMarkEnd <em>User Index Mark End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Index Mark End</em>' containment reference.
	 * @see #getUserIndexMarkEnd()
	 * @generated
	 */
	void setUserIndexMarkEnd(UserIndexMarkEndType value);

	/**
	 * Returns the value of the '<em><b>User Index Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark</em>' containment reference.
	 * @see #setUserIndexMark(UserIndexMarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_UserIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark' namespace='##targetNamespace'"
	 * @generated
	 */
	UserIndexMarkType getUserIndexMark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getUserIndexMark <em>User Index Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Index Mark</em>' containment reference.
	 * @see #getUserIndexMark()
	 * @generated
	 */
	void setUserIndexMark(UserIndexMarkType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark Start</em>' containment reference.
	 * @see #setAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_AlphabeticalIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-start' namespace='##targetNamespace'"
	 * @generated
	 */
	AlphabeticalIndexMarkStartType getAlphabeticalIndexMarkStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Mark Start</em>' containment reference.
	 * @see #getAlphabeticalIndexMarkStart()
	 * @generated
	 */
	void setAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark End</em>' containment reference.
	 * @see #setAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_AlphabeticalIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-end' namespace='##targetNamespace'"
	 * @generated
	 */
	AlphabeticalIndexMarkEndType getAlphabeticalIndexMarkEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Mark End</em>' containment reference.
	 * @see #getAlphabeticalIndexMarkEnd()
	 * @generated
	 */
	void setAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark</em>' containment reference.
	 * @see #setAlphabeticalIndexMark(AlphabeticalIndexMarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_AlphabeticalIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark' namespace='##targetNamespace'"
	 * @generated
	 */
	AlphabeticalIndexMarkType getAlphabeticalIndexMark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Mark</em>' containment reference.
	 * @see #getAlphabeticalIndexMark()
	 * @generated
	 */
	void setAlphabeticalIndexMark(AlphabeticalIndexMarkType value);

	/**
	 * Returns the value of the '<em><b>Bibliography Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Mark</em>' containment reference.
	 * @see #setBibliographyMark(BibliographyMarkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_BibliographyMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography-mark' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliographyMarkType getBibliographyMark();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getBibliographyMark <em>Bibliography Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliography Mark</em>' containment reference.
	 * @see #getBibliographyMark()
	 * @generated
	 */
	void setBibliographyMark(BibliographyMarkType value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Header()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(FooterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_Footer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	FooterType getFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(FooterType value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyBaseType_DateTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-time' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	DateTimeType getDateTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTimeType value);

} // RubyBaseType
