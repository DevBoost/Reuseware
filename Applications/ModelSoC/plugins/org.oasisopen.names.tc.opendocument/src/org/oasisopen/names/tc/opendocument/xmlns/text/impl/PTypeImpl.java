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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getCondStyleName <em>Cond Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTypeImpl extends EObjectImpl implements PType {
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
	 * The default value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected List<String> classNames = CLASS_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondStyleName() <em>Cond Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String COND_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondStyleName() <em>Cond Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondStyleName()
	 * @generated
	 * @ordered
	 */
	protected String condStyleName = COND_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.PTYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getPType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SType> getS() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_S());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabType> getTab() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Tab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineBreakType> getLineBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_LineBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkType> getBookmark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Bookmark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkStartType> getBookmarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_BookmarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkEndType> getBookmarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_BookmarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkType> getReferenceMark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ReferenceMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkStartType> getReferenceMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ReferenceMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkEndType> getReferenceMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ReferenceMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RubyType> getRuby() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getPType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getPType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.drawing.AType> getA1() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_A1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDate() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeType> getTime() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Time());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageNumberType> getPageNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContinuationType> getPageContinuation() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageContinuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFirstnameType> getSenderFirstname() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderFirstname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderLastnameType> getSenderLastname() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderLastname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderInitialsType> getSenderInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderTitleType> getSenderTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPositionType> getSenderPosition() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderEmailType> getSenderEmail() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderEmail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhonePrivateType> getSenderPhonePrivate() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderPhonePrivate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFaxType> getSenderFax() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderFax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCompanyType> getSenderCompany() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderCompany());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhoneWorkType> getSenderPhoneWork() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderPhoneWork());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStreetType> getSenderStreet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderStreet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCityType> getSenderCity() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderCity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPostalCodeType> getSenderPostalCode() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderPostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCountryType> getSenderCountry() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStateOrProvinceType> getSenderStateOrProvince() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SenderStateOrProvince());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorNameType> getAuthorName() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_AuthorName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorInitialsType> getAuthorInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_AuthorInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChapterType> getChapter() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Chapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileNameType> getFileName() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_FileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateNameType> getTemplateName() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TemplateName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSheetName() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SheetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableSetType> getVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_VariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableGetType> getVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_VariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableInputType> getVariableInput() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_VariableInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldGetType> getUserFieldGet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserFieldGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldInputType> getUserFieldInput() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserFieldInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequence() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Sequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionType> getExpression() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Expression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextInputType> getTextInput() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TextInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialCreatorType> getInitialCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_InitialCreator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationDateType> getCreationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_CreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationTimeType> getCreationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_CreationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserDefinedType> getUserDefined() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserDefined());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintTimeType> getPrintTime() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PrintTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintDateType> getPrintDate() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PrintDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintedByType> getPrintedBy() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PrintedBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectType> getSubject() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordsType> getKeywords() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Keywords());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingCyclesType> getEditingCycles() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_EditingCycles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingDurationType> getEditingDuration() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_EditingDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationTimeType> getModificationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ModificationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationDateType> getModificationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ModificationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreatorType> getCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Creator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageCountType> getPageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParagraphCountType> getParagraphCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ParagraphCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WordCountType> getWordCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_WordCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacterCountType> getCharacterCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_CharacterCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCountType> getTableCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TableCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageCountType> getImageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ImageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectCountType> getObjectCount() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ObjectCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseDisplayAttlist> getDatabaseDisplay() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DatabaseDisplay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseNextAttlist> getDatabaseNext() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DatabaseNext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseRowSelectAttlist> getDatabaseRowSelect() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DatabaseRowSelect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseRowNumberType> getDatabaseRowNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DatabaseRowNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseNameType> getDatabaseName() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DatabaseName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableSetType> getPageVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageVariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableGetType> getPageVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_PageVariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceholderType> getPlaceholder() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Placeholder());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalTextType> getConditionalText() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ConditionalText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenTextType> getHiddenText() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_HiddenText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRefType> getReferenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ReferenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkRefType> getBookmarkRef() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_BookmarkRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteRefType> getNoteRef() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_NoteRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRefType> getSequenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_SequenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteMacroType> getExecuteMacro() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_ExecuteMacro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenParagraphType> getHiddenParagraph() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_HiddenParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdeConnectionType> getDdeConnection() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DdeConnection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType> getMeasure1() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Measure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableFormulaType> getTableFormula() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TableFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkStartType> getTocMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TocMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkEndType> getTocMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TocMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkType> getTocMark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_TocMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkStartType> getUserIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkEndType> getUserIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkType> getUserIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_UserIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkStartType> getAlphabeticalIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_AlphabeticalIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkEndType> getAlphabeticalIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_AlphabeticalIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkType> getAlphabeticalIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_AlphabeticalIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyMarkType> getBibliographyMark() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_BibliographyMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderType> getHeader() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Header());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FooterType> getFooter() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_Footer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTimeType> getDateTime() {
		return getGroup().list(TextPackage.eINSTANCE.getPType_DateTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClassNames() {
		return classNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNames(List<String> newClassNames) {
		List<String> oldClassNames = classNames;
		classNames = newClassNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PTYPE__CLASS_NAMES, oldClassNames, classNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondStyleName() {
		return condStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondStyleName(String newCondStyleName) {
		String oldCondStyleName = condStyleName;
		condStyleName = newCondStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PTYPE__COND_STYLE_NAME, oldCondStyleName, condStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PTYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PTYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.PTYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TAB:
				return ((InternalEList<?>)getTab()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__LINE_BREAK:
				return ((InternalEList<?>)getLineBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__BOOKMARK:
				return ((InternalEList<?>)getBookmark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__BOOKMARK_START:
				return ((InternalEList<?>)getBookmarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__BOOKMARK_END:
				return ((InternalEList<?>)getBookmarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__REFERENCE_MARK:
				return ((InternalEList<?>)getReferenceMark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__REFERENCE_MARK_START:
				return ((InternalEList<?>)getReferenceMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__REFERENCE_MARK_END:
				return ((InternalEList<?>)getReferenceMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__A1:
				return ((InternalEList<?>)getA1()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_NUMBER:
				return ((InternalEList<?>)getPageNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_CONTINUATION:
				return ((InternalEList<?>)getPageContinuation()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_FIRSTNAME:
				return ((InternalEList<?>)getSenderFirstname()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_LASTNAME:
				return ((InternalEList<?>)getSenderLastname()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_INITIALS:
				return ((InternalEList<?>)getSenderInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_TITLE:
				return ((InternalEList<?>)getSenderTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_POSITION:
				return ((InternalEList<?>)getSenderPosition()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_EMAIL:
				return ((InternalEList<?>)getSenderEmail()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_PHONE_PRIVATE:
				return ((InternalEList<?>)getSenderPhonePrivate()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_FAX:
				return ((InternalEList<?>)getSenderFax()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_COMPANY:
				return ((InternalEList<?>)getSenderCompany()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_PHONE_WORK:
				return ((InternalEList<?>)getSenderPhoneWork()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_STREET:
				return ((InternalEList<?>)getSenderStreet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_CITY:
				return ((InternalEList<?>)getSenderCity()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_POSTAL_CODE:
				return ((InternalEList<?>)getSenderPostalCode()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_COUNTRY:
				return ((InternalEList<?>)getSenderCountry()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SENDER_STATE_OR_PROVINCE:
				return ((InternalEList<?>)getSenderStateOrProvince()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__AUTHOR_NAME:
				return ((InternalEList<?>)getAuthorName()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__AUTHOR_INITIALS:
				return ((InternalEList<?>)getAuthorInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CHAPTER:
				return ((InternalEList<?>)getChapter()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__FILE_NAME:
				return ((InternalEList<?>)getFileName()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TEMPLATE_NAME:
				return ((InternalEList<?>)getTemplateName()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__VARIABLE_SET:
				return ((InternalEList<?>)getVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__VARIABLE_GET:
				return ((InternalEList<?>)getVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__VARIABLE_INPUT:
				return ((InternalEList<?>)getVariableInput()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_FIELD_GET:
				return ((InternalEList<?>)getUserFieldGet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_FIELD_INPUT:
				return ((InternalEList<?>)getUserFieldInput()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TEXT_INPUT:
				return ((InternalEList<?>)getTextInput()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__INITIAL_CREATOR:
				return ((InternalEList<?>)getInitialCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CREATION_DATE:
				return ((InternalEList<?>)getCreationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CREATION_TIME:
				return ((InternalEList<?>)getCreationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_DEFINED:
				return ((InternalEList<?>)getUserDefined()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PRINT_TIME:
				return ((InternalEList<?>)getPrintTime()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PRINT_DATE:
				return ((InternalEList<?>)getPrintDate()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PRINTED_BY:
				return ((InternalEList<?>)getPrintedBy()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__KEYWORDS:
				return ((InternalEList<?>)getKeywords()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__EDITING_CYCLES:
				return ((InternalEList<?>)getEditingCycles()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__EDITING_DURATION:
				return ((InternalEList<?>)getEditingDuration()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__MODIFICATION_TIME:
				return ((InternalEList<?>)getModificationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__MODIFICATION_DATE:
				return ((InternalEList<?>)getModificationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CREATOR:
				return ((InternalEList<?>)getCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_COUNT:
				return ((InternalEList<?>)getPageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PARAGRAPH_COUNT:
				return ((InternalEList<?>)getParagraphCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__WORD_COUNT:
				return ((InternalEList<?>)getWordCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CHARACTER_COUNT:
				return ((InternalEList<?>)getCharacterCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TABLE_COUNT:
				return ((InternalEList<?>)getTableCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__IMAGE_COUNT:
				return ((InternalEList<?>)getImageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__OBJECT_COUNT:
				return ((InternalEList<?>)getObjectCount()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATABASE_DISPLAY:
				return ((InternalEList<?>)getDatabaseDisplay()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATABASE_NEXT:
				return ((InternalEList<?>)getDatabaseNext()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATABASE_ROW_SELECT:
				return ((InternalEList<?>)getDatabaseRowSelect()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATABASE_ROW_NUMBER:
				return ((InternalEList<?>)getDatabaseRowNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATABASE_NAME:
				return ((InternalEList<?>)getDatabaseName()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_VARIABLE_SET:
				return ((InternalEList<?>)getPageVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PAGE_VARIABLE_GET:
				return ((InternalEList<?>)getPageVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__PLACEHOLDER:
				return ((InternalEList<?>)getPlaceholder()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__CONDITIONAL_TEXT:
				return ((InternalEList<?>)getConditionalText()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__HIDDEN_TEXT:
				return ((InternalEList<?>)getHiddenText()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__REFERENCE_REF:
				return ((InternalEList<?>)getReferenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__BOOKMARK_REF:
				return ((InternalEList<?>)getBookmarkRef()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__NOTE_REF:
				return ((InternalEList<?>)getNoteRef()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SEQUENCE_REF:
				return ((InternalEList<?>)getSequenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__EXECUTE_MACRO:
				return ((InternalEList<?>)getExecuteMacro()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__HIDDEN_PARAGRAPH:
				return ((InternalEList<?>)getHiddenParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DDE_CONNECTION:
				return ((InternalEList<?>)getDdeConnection()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__MEASURE1:
				return ((InternalEList<?>)getMeasure1()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TABLE_FORMULA:
				return ((InternalEList<?>)getTableFormula()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TOC_MARK_START:
				return ((InternalEList<?>)getTocMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TOC_MARK_END:
				return ((InternalEList<?>)getTocMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__TOC_MARK:
				return ((InternalEList<?>)getTocMark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_INDEX_MARK_START:
				return ((InternalEList<?>)getUserIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_INDEX_MARK_END:
				return ((InternalEList<?>)getUserIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__USER_INDEX_MARK:
				return ((InternalEList<?>)getUserIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_START:
				return ((InternalEList<?>)getAlphabeticalIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_END:
				return ((InternalEList<?>)getAlphabeticalIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK:
				return ((InternalEList<?>)getAlphabeticalIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__BIBLIOGRAPHY_MARK:
				return ((InternalEList<?>)getBibliographyMark()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
			case TextPackage.PTYPE__DATE_TIME:
				return ((InternalEList<?>)getDateTime()).basicRemove(otherEnd, msgs);
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
			case TextPackage.PTYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.PTYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.PTYPE__S:
				return getS();
			case TextPackage.PTYPE__TAB:
				return getTab();
			case TextPackage.PTYPE__LINE_BREAK:
				return getLineBreak();
			case TextPackage.PTYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.PTYPE__SPAN:
				return getSpan();
			case TextPackage.PTYPE__A:
				return getA();
			case TextPackage.PTYPE__BOOKMARK:
				return getBookmark();
			case TextPackage.PTYPE__BOOKMARK_START:
				return getBookmarkStart();
			case TextPackage.PTYPE__BOOKMARK_END:
				return getBookmarkEnd();
			case TextPackage.PTYPE__REFERENCE_MARK:
				return getReferenceMark();
			case TextPackage.PTYPE__REFERENCE_MARK_START:
				return getReferenceMarkStart();
			case TextPackage.PTYPE__REFERENCE_MARK_END:
				return getReferenceMarkEnd();
			case TextPackage.PTYPE__NOTE:
				return getNote();
			case TextPackage.PTYPE__RUBY:
				return getRuby();
			case TextPackage.PTYPE__ANNOTATION:
				return getAnnotation();
			case TextPackage.PTYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.PTYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.PTYPE__RECT:
				return getRect();
			case TextPackage.PTYPE__LINE:
				return getLine();
			case TextPackage.PTYPE__POLYLINE:
				return getPolyline();
			case TextPackage.PTYPE__POLYGON:
				return getPolygon();
			case TextPackage.PTYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.PTYPE__PATH:
				return getPath();
			case TextPackage.PTYPE__CIRCLE:
				return getCircle();
			case TextPackage.PTYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.PTYPE__G:
				return getG();
			case TextPackage.PTYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.PTYPE__FRAME:
				return getFrame();
			case TextPackage.PTYPE__MEASURE:
				return getMeasure();
			case TextPackage.PTYPE__CAPTION:
				return getCaption();
			case TextPackage.PTYPE__CONNECTOR:
				return getConnector();
			case TextPackage.PTYPE__CONTROL:
				return getControl();
			case TextPackage.PTYPE__SCENE:
				return getScene();
			case TextPackage.PTYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.PTYPE__A1:
				return getA1();
			case TextPackage.PTYPE__DATE:
				return getDate();
			case TextPackage.PTYPE__TIME:
				return getTime();
			case TextPackage.PTYPE__PAGE_NUMBER:
				return getPageNumber();
			case TextPackage.PTYPE__PAGE_CONTINUATION:
				return getPageContinuation();
			case TextPackage.PTYPE__SENDER_FIRSTNAME:
				return getSenderFirstname();
			case TextPackage.PTYPE__SENDER_LASTNAME:
				return getSenderLastname();
			case TextPackage.PTYPE__SENDER_INITIALS:
				return getSenderInitials();
			case TextPackage.PTYPE__SENDER_TITLE:
				return getSenderTitle();
			case TextPackage.PTYPE__SENDER_POSITION:
				return getSenderPosition();
			case TextPackage.PTYPE__SENDER_EMAIL:
				return getSenderEmail();
			case TextPackage.PTYPE__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate();
			case TextPackage.PTYPE__SENDER_FAX:
				return getSenderFax();
			case TextPackage.PTYPE__SENDER_COMPANY:
				return getSenderCompany();
			case TextPackage.PTYPE__SENDER_PHONE_WORK:
				return getSenderPhoneWork();
			case TextPackage.PTYPE__SENDER_STREET:
				return getSenderStreet();
			case TextPackage.PTYPE__SENDER_CITY:
				return getSenderCity();
			case TextPackage.PTYPE__SENDER_POSTAL_CODE:
				return getSenderPostalCode();
			case TextPackage.PTYPE__SENDER_COUNTRY:
				return getSenderCountry();
			case TextPackage.PTYPE__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince();
			case TextPackage.PTYPE__AUTHOR_NAME:
				return getAuthorName();
			case TextPackage.PTYPE__AUTHOR_INITIALS:
				return getAuthorInitials();
			case TextPackage.PTYPE__CHAPTER:
				return getChapter();
			case TextPackage.PTYPE__FILE_NAME:
				return getFileName();
			case TextPackage.PTYPE__TEMPLATE_NAME:
				return getTemplateName();
			case TextPackage.PTYPE__SHEET_NAME:
				return getSheetName();
			case TextPackage.PTYPE__VARIABLE_SET:
				return getVariableSet();
			case TextPackage.PTYPE__VARIABLE_GET:
				return getVariableGet();
			case TextPackage.PTYPE__VARIABLE_INPUT:
				return getVariableInput();
			case TextPackage.PTYPE__USER_FIELD_GET:
				return getUserFieldGet();
			case TextPackage.PTYPE__USER_FIELD_INPUT:
				return getUserFieldInput();
			case TextPackage.PTYPE__SEQUENCE:
				return getSequence();
			case TextPackage.PTYPE__EXPRESSION:
				return getExpression();
			case TextPackage.PTYPE__TEXT_INPUT:
				return getTextInput();
			case TextPackage.PTYPE__INITIAL_CREATOR:
				return getInitialCreator();
			case TextPackage.PTYPE__CREATION_DATE:
				return getCreationDate();
			case TextPackage.PTYPE__CREATION_TIME:
				return getCreationTime();
			case TextPackage.PTYPE__DESCRIPTION:
				return getDescription();
			case TextPackage.PTYPE__USER_DEFINED:
				return getUserDefined();
			case TextPackage.PTYPE__PRINT_TIME:
				return getPrintTime();
			case TextPackage.PTYPE__PRINT_DATE:
				return getPrintDate();
			case TextPackage.PTYPE__PRINTED_BY:
				return getPrintedBy();
			case TextPackage.PTYPE__TITLE:
				return getTitle();
			case TextPackage.PTYPE__SUBJECT:
				return getSubject();
			case TextPackage.PTYPE__KEYWORDS:
				return getKeywords();
			case TextPackage.PTYPE__EDITING_CYCLES:
				return getEditingCycles();
			case TextPackage.PTYPE__EDITING_DURATION:
				return getEditingDuration();
			case TextPackage.PTYPE__MODIFICATION_TIME:
				return getModificationTime();
			case TextPackage.PTYPE__MODIFICATION_DATE:
				return getModificationDate();
			case TextPackage.PTYPE__CREATOR:
				return getCreator();
			case TextPackage.PTYPE__PAGE_COUNT:
				return getPageCount();
			case TextPackage.PTYPE__PARAGRAPH_COUNT:
				return getParagraphCount();
			case TextPackage.PTYPE__WORD_COUNT:
				return getWordCount();
			case TextPackage.PTYPE__CHARACTER_COUNT:
				return getCharacterCount();
			case TextPackage.PTYPE__TABLE_COUNT:
				return getTableCount();
			case TextPackage.PTYPE__IMAGE_COUNT:
				return getImageCount();
			case TextPackage.PTYPE__OBJECT_COUNT:
				return getObjectCount();
			case TextPackage.PTYPE__DATABASE_DISPLAY:
				return getDatabaseDisplay();
			case TextPackage.PTYPE__DATABASE_NEXT:
				return getDatabaseNext();
			case TextPackage.PTYPE__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect();
			case TextPackage.PTYPE__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber();
			case TextPackage.PTYPE__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.PTYPE__PAGE_VARIABLE_SET:
				return getPageVariableSet();
			case TextPackage.PTYPE__PAGE_VARIABLE_GET:
				return getPageVariableGet();
			case TextPackage.PTYPE__PLACEHOLDER:
				return getPlaceholder();
			case TextPackage.PTYPE__CONDITIONAL_TEXT:
				return getConditionalText();
			case TextPackage.PTYPE__HIDDEN_TEXT:
				return getHiddenText();
			case TextPackage.PTYPE__REFERENCE_REF:
				return getReferenceRef();
			case TextPackage.PTYPE__BOOKMARK_REF:
				return getBookmarkRef();
			case TextPackage.PTYPE__NOTE_REF:
				return getNoteRef();
			case TextPackage.PTYPE__SEQUENCE_REF:
				return getSequenceRef();
			case TextPackage.PTYPE__SCRIPT:
				return getScript();
			case TextPackage.PTYPE__EXECUTE_MACRO:
				return getExecuteMacro();
			case TextPackage.PTYPE__HIDDEN_PARAGRAPH:
				return getHiddenParagraph();
			case TextPackage.PTYPE__DDE_CONNECTION:
				return getDdeConnection();
			case TextPackage.PTYPE__MEASURE1:
				return getMeasure1();
			case TextPackage.PTYPE__TABLE_FORMULA:
				return getTableFormula();
			case TextPackage.PTYPE__TOC_MARK_START:
				return getTocMarkStart();
			case TextPackage.PTYPE__TOC_MARK_END:
				return getTocMarkEnd();
			case TextPackage.PTYPE__TOC_MARK:
				return getTocMark();
			case TextPackage.PTYPE__USER_INDEX_MARK_START:
				return getUserIndexMarkStart();
			case TextPackage.PTYPE__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd();
			case TextPackage.PTYPE__USER_INDEX_MARK:
				return getUserIndexMark();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark();
			case TextPackage.PTYPE__BIBLIOGRAPHY_MARK:
				return getBibliographyMark();
			case TextPackage.PTYPE__HEADER:
				return getHeader();
			case TextPackage.PTYPE__FOOTER:
				return getFooter();
			case TextPackage.PTYPE__DATE_TIME:
				return getDateTime();
			case TextPackage.PTYPE__CLASS_NAMES:
				return getClassNames();
			case TextPackage.PTYPE__COND_STYLE_NAME:
				return getCondStyleName();
			case TextPackage.PTYPE__ID:
				return getId();
			case TextPackage.PTYPE__STYLE_NAME:
				return getStyleName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.PTYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.PTYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.PTYPE__S:
				getS().clear();
				getS().addAll((Collection<? extends SType>)newValue);
				return;
			case TextPackage.PTYPE__TAB:
				getTab().clear();
				getTab().addAll((Collection<? extends TabType>)newValue);
				return;
			case TextPackage.PTYPE__LINE_BREAK:
				getLineBreak().clear();
				getLineBreak().addAll((Collection<? extends LineBreakType>)newValue);
				return;
			case TextPackage.PTYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.PTYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case TextPackage.PTYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.PTYPE__BOOKMARK:
				getBookmark().clear();
				getBookmark().addAll((Collection<? extends BookmarkType>)newValue);
				return;
			case TextPackage.PTYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				getBookmarkStart().addAll((Collection<? extends BookmarkStartType>)newValue);
				return;
			case TextPackage.PTYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				getBookmarkEnd().addAll((Collection<? extends BookmarkEndType>)newValue);
				return;
			case TextPackage.PTYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				getReferenceMark().addAll((Collection<? extends ReferenceMarkType>)newValue);
				return;
			case TextPackage.PTYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				getReferenceMarkStart().addAll((Collection<? extends ReferenceMarkStartType>)newValue);
				return;
			case TextPackage.PTYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				getReferenceMarkEnd().addAll((Collection<? extends ReferenceMarkEndType>)newValue);
				return;
			case TextPackage.PTYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case TextPackage.PTYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case TextPackage.PTYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case TextPackage.PTYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.PTYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.PTYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.PTYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.PTYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.PTYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.PTYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.PTYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.PTYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.PTYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.PTYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.PTYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.PTYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.PTYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.PTYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.PTYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.PTYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.PTYPE__A1:
				getA1().clear();
				getA1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.drawing.AType>)newValue);
				return;
			case TextPackage.PTYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case TextPackage.PTYPE__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends TimeType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_NUMBER:
				getPageNumber().clear();
				getPageNumber().addAll((Collection<? extends PageNumberType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				getPageContinuation().addAll((Collection<? extends PageContinuationType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				getSenderFirstname().addAll((Collection<? extends SenderFirstnameType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				getSenderLastname().addAll((Collection<? extends SenderLastnameType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				getSenderInitials().addAll((Collection<? extends SenderInitialsType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_TITLE:
				getSenderTitle().clear();
				getSenderTitle().addAll((Collection<? extends SenderTitleType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_POSITION:
				getSenderPosition().clear();
				getSenderPosition().addAll((Collection<? extends SenderPositionType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				getSenderEmail().addAll((Collection<? extends SenderEmailType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				getSenderPhonePrivate().addAll((Collection<? extends SenderPhonePrivateType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_FAX:
				getSenderFax().clear();
				getSenderFax().addAll((Collection<? extends SenderFaxType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				getSenderCompany().addAll((Collection<? extends SenderCompanyType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				getSenderPhoneWork().addAll((Collection<? extends SenderPhoneWorkType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_STREET:
				getSenderStreet().clear();
				getSenderStreet().addAll((Collection<? extends SenderStreetType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_CITY:
				getSenderCity().clear();
				getSenderCity().addAll((Collection<? extends SenderCityType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				getSenderPostalCode().addAll((Collection<? extends SenderPostalCodeType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				getSenderCountry().addAll((Collection<? extends SenderCountryType>)newValue);
				return;
			case TextPackage.PTYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				getSenderStateOrProvince().addAll((Collection<? extends SenderStateOrProvinceType>)newValue);
				return;
			case TextPackage.PTYPE__AUTHOR_NAME:
				getAuthorName().clear();
				getAuthorName().addAll((Collection<? extends AuthorNameType>)newValue);
				return;
			case TextPackage.PTYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				getAuthorInitials().addAll((Collection<? extends AuthorInitialsType>)newValue);
				return;
			case TextPackage.PTYPE__CHAPTER:
				getChapter().clear();
				getChapter().addAll((Collection<? extends ChapterType>)newValue);
				return;
			case TextPackage.PTYPE__FILE_NAME:
				getFileName().clear();
				getFileName().addAll((Collection<? extends FileNameType>)newValue);
				return;
			case TextPackage.PTYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				getTemplateName().addAll((Collection<? extends TemplateNameType>)newValue);
				return;
			case TextPackage.PTYPE__SHEET_NAME:
				getSheetName().clear();
				getSheetName().addAll((Collection<? extends String>)newValue);
				return;
			case TextPackage.PTYPE__VARIABLE_SET:
				getVariableSet().clear();
				getVariableSet().addAll((Collection<? extends VariableSetType>)newValue);
				return;
			case TextPackage.PTYPE__VARIABLE_GET:
				getVariableGet().clear();
				getVariableGet().addAll((Collection<? extends VariableGetType>)newValue);
				return;
			case TextPackage.PTYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				getVariableInput().addAll((Collection<? extends VariableInputType>)newValue);
				return;
			case TextPackage.PTYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				getUserFieldGet().addAll((Collection<? extends UserFieldGetType>)newValue);
				return;
			case TextPackage.PTYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				getUserFieldInput().addAll((Collection<? extends UserFieldInputType>)newValue);
				return;
			case TextPackage.PTYPE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case TextPackage.PTYPE__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ExpressionType>)newValue);
				return;
			case TextPackage.PTYPE__TEXT_INPUT:
				getTextInput().clear();
				getTextInput().addAll((Collection<? extends TextInputType>)newValue);
				return;
			case TextPackage.PTYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				getInitialCreator().addAll((Collection<? extends InitialCreatorType>)newValue);
				return;
			case TextPackage.PTYPE__CREATION_DATE:
				getCreationDate().clear();
				getCreationDate().addAll((Collection<? extends CreationDateType>)newValue);
				return;
			case TextPackage.PTYPE__CREATION_TIME:
				getCreationTime().clear();
				getCreationTime().addAll((Collection<? extends CreationTimeType>)newValue);
				return;
			case TextPackage.PTYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case TextPackage.PTYPE__USER_DEFINED:
				getUserDefined().clear();
				getUserDefined().addAll((Collection<? extends UserDefinedType>)newValue);
				return;
			case TextPackage.PTYPE__PRINT_TIME:
				getPrintTime().clear();
				getPrintTime().addAll((Collection<? extends PrintTimeType>)newValue);
				return;
			case TextPackage.PTYPE__PRINT_DATE:
				getPrintDate().clear();
				getPrintDate().addAll((Collection<? extends PrintDateType>)newValue);
				return;
			case TextPackage.PTYPE__PRINTED_BY:
				getPrintedBy().clear();
				getPrintedBy().addAll((Collection<? extends PrintedByType>)newValue);
				return;
			case TextPackage.PTYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case TextPackage.PTYPE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectType>)newValue);
				return;
			case TextPackage.PTYPE__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends KeywordsType>)newValue);
				return;
			case TextPackage.PTYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				getEditingCycles().addAll((Collection<? extends EditingCyclesType>)newValue);
				return;
			case TextPackage.PTYPE__EDITING_DURATION:
				getEditingDuration().clear();
				getEditingDuration().addAll((Collection<? extends EditingDurationType>)newValue);
				return;
			case TextPackage.PTYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				getModificationTime().addAll((Collection<? extends ModificationTimeType>)newValue);
				return;
			case TextPackage.PTYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				getModificationDate().addAll((Collection<? extends ModificationDateType>)newValue);
				return;
			case TextPackage.PTYPE__CREATOR:
				getCreator().clear();
				getCreator().addAll((Collection<? extends CreatorType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_COUNT:
				getPageCount().clear();
				getPageCount().addAll((Collection<? extends PageCountType>)newValue);
				return;
			case TextPackage.PTYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				getParagraphCount().addAll((Collection<? extends ParagraphCountType>)newValue);
				return;
			case TextPackage.PTYPE__WORD_COUNT:
				getWordCount().clear();
				getWordCount().addAll((Collection<? extends WordCountType>)newValue);
				return;
			case TextPackage.PTYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				getCharacterCount().addAll((Collection<? extends CharacterCountType>)newValue);
				return;
			case TextPackage.PTYPE__TABLE_COUNT:
				getTableCount().clear();
				getTableCount().addAll((Collection<? extends TableCountType>)newValue);
				return;
			case TextPackage.PTYPE__IMAGE_COUNT:
				getImageCount().clear();
				getImageCount().addAll((Collection<? extends ImageCountType>)newValue);
				return;
			case TextPackage.PTYPE__OBJECT_COUNT:
				getObjectCount().clear();
				getObjectCount().addAll((Collection<? extends ObjectCountType>)newValue);
				return;
			case TextPackage.PTYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				getDatabaseDisplay().addAll((Collection<? extends TextDatabaseDisplayAttlist>)newValue);
				return;
			case TextPackage.PTYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				getDatabaseNext().addAll((Collection<? extends TextDatabaseNextAttlist>)newValue);
				return;
			case TextPackage.PTYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				getDatabaseRowSelect().addAll((Collection<? extends TextDatabaseRowSelectAttlist>)newValue);
				return;
			case TextPackage.PTYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				getDatabaseRowNumber().addAll((Collection<? extends DatabaseRowNumberType>)newValue);
				return;
			case TextPackage.PTYPE__DATABASE_NAME:
				getDatabaseName().clear();
				getDatabaseName().addAll((Collection<? extends DatabaseNameType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				getPageVariableSet().addAll((Collection<? extends PageVariableSetType>)newValue);
				return;
			case TextPackage.PTYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				getPageVariableGet().addAll((Collection<? extends PageVariableGetType>)newValue);
				return;
			case TextPackage.PTYPE__PLACEHOLDER:
				getPlaceholder().clear();
				getPlaceholder().addAll((Collection<? extends PlaceholderType>)newValue);
				return;
			case TextPackage.PTYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				getConditionalText().addAll((Collection<? extends ConditionalTextType>)newValue);
				return;
			case TextPackage.PTYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				getHiddenText().addAll((Collection<? extends HiddenTextType>)newValue);
				return;
			case TextPackage.PTYPE__REFERENCE_REF:
				getReferenceRef().clear();
				getReferenceRef().addAll((Collection<? extends ReferenceRefType>)newValue);
				return;
			case TextPackage.PTYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				getBookmarkRef().addAll((Collection<? extends BookmarkRefType>)newValue);
				return;
			case TextPackage.PTYPE__NOTE_REF:
				getNoteRef().clear();
				getNoteRef().addAll((Collection<? extends NoteRefType>)newValue);
				return;
			case TextPackage.PTYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				getSequenceRef().addAll((Collection<? extends SequenceRefType>)newValue);
				return;
			case TextPackage.PTYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case TextPackage.PTYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				getExecuteMacro().addAll((Collection<? extends ExecuteMacroType>)newValue);
				return;
			case TextPackage.PTYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				getHiddenParagraph().addAll((Collection<? extends HiddenParagraphType>)newValue);
				return;
			case TextPackage.PTYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				getDdeConnection().addAll((Collection<? extends DdeConnectionType>)newValue);
				return;
			case TextPackage.PTYPE__MEASURE1:
				getMeasure1().clear();
				getMeasure1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType>)newValue);
				return;
			case TextPackage.PTYPE__TABLE_FORMULA:
				getTableFormula().clear();
				getTableFormula().addAll((Collection<? extends TableFormulaType>)newValue);
				return;
			case TextPackage.PTYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				getTocMarkStart().addAll((Collection<? extends TocMarkStartType>)newValue);
				return;
			case TextPackage.PTYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				getTocMarkEnd().addAll((Collection<? extends TocMarkEndType>)newValue);
				return;
			case TextPackage.PTYPE__TOC_MARK:
				getTocMark().clear();
				getTocMark().addAll((Collection<? extends TocMarkType>)newValue);
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				getUserIndexMarkStart().addAll((Collection<? extends UserIndexMarkStartType>)newValue);
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				getUserIndexMarkEnd().addAll((Collection<? extends UserIndexMarkEndType>)newValue);
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				getUserIndexMark().addAll((Collection<? extends UserIndexMarkType>)newValue);
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				getAlphabeticalIndexMarkStart().addAll((Collection<? extends AlphabeticalIndexMarkStartType>)newValue);
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				getAlphabeticalIndexMarkEnd().addAll((Collection<? extends AlphabeticalIndexMarkEndType>)newValue);
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				getAlphabeticalIndexMark().addAll((Collection<? extends AlphabeticalIndexMarkType>)newValue);
				return;
			case TextPackage.PTYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				getBibliographyMark().addAll((Collection<? extends BibliographyMarkType>)newValue);
				return;
			case TextPackage.PTYPE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends HeaderType>)newValue);
				return;
			case TextPackage.PTYPE__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends FooterType>)newValue);
				return;
			case TextPackage.PTYPE__DATE_TIME:
				getDateTime().clear();
				getDateTime().addAll((Collection<? extends DateTimeType>)newValue);
				return;
			case TextPackage.PTYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case TextPackage.PTYPE__COND_STYLE_NAME:
				setCondStyleName((String)newValue);
				return;
			case TextPackage.PTYPE__ID:
				setId((String)newValue);
				return;
			case TextPackage.PTYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.PTYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.PTYPE__GROUP:
				getGroup().clear();
				return;
			case TextPackage.PTYPE__S:
				getS().clear();
				return;
			case TextPackage.PTYPE__TAB:
				getTab().clear();
				return;
			case TextPackage.PTYPE__LINE_BREAK:
				getLineBreak().clear();
				return;
			case TextPackage.PTYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.PTYPE__SPAN:
				getSpan().clear();
				return;
			case TextPackage.PTYPE__A:
				getA().clear();
				return;
			case TextPackage.PTYPE__BOOKMARK:
				getBookmark().clear();
				return;
			case TextPackage.PTYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				return;
			case TextPackage.PTYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				return;
			case TextPackage.PTYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				return;
			case TextPackage.PTYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				return;
			case TextPackage.PTYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				return;
			case TextPackage.PTYPE__NOTE:
				getNote().clear();
				return;
			case TextPackage.PTYPE__RUBY:
				getRuby().clear();
				return;
			case TextPackage.PTYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case TextPackage.PTYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.PTYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.PTYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.PTYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.PTYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.PTYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.PTYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.PTYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.PTYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.PTYPE__G:
				getG().clear();
				return;
			case TextPackage.PTYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.PTYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.PTYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.PTYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.PTYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.PTYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.PTYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.PTYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.PTYPE__A1:
				getA1().clear();
				return;
			case TextPackage.PTYPE__DATE:
				getDate().clear();
				return;
			case TextPackage.PTYPE__TIME:
				getTime().clear();
				return;
			case TextPackage.PTYPE__PAGE_NUMBER:
				getPageNumber().clear();
				return;
			case TextPackage.PTYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				return;
			case TextPackage.PTYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				return;
			case TextPackage.PTYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				return;
			case TextPackage.PTYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				return;
			case TextPackage.PTYPE__SENDER_TITLE:
				getSenderTitle().clear();
				return;
			case TextPackage.PTYPE__SENDER_POSITION:
				getSenderPosition().clear();
				return;
			case TextPackage.PTYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				return;
			case TextPackage.PTYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				return;
			case TextPackage.PTYPE__SENDER_FAX:
				getSenderFax().clear();
				return;
			case TextPackage.PTYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				return;
			case TextPackage.PTYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				return;
			case TextPackage.PTYPE__SENDER_STREET:
				getSenderStreet().clear();
				return;
			case TextPackage.PTYPE__SENDER_CITY:
				getSenderCity().clear();
				return;
			case TextPackage.PTYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				return;
			case TextPackage.PTYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				return;
			case TextPackage.PTYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				return;
			case TextPackage.PTYPE__AUTHOR_NAME:
				getAuthorName().clear();
				return;
			case TextPackage.PTYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				return;
			case TextPackage.PTYPE__CHAPTER:
				getChapter().clear();
				return;
			case TextPackage.PTYPE__FILE_NAME:
				getFileName().clear();
				return;
			case TextPackage.PTYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				return;
			case TextPackage.PTYPE__SHEET_NAME:
				getSheetName().clear();
				return;
			case TextPackage.PTYPE__VARIABLE_SET:
				getVariableSet().clear();
				return;
			case TextPackage.PTYPE__VARIABLE_GET:
				getVariableGet().clear();
				return;
			case TextPackage.PTYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				return;
			case TextPackage.PTYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				return;
			case TextPackage.PTYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				return;
			case TextPackage.PTYPE__SEQUENCE:
				getSequence().clear();
				return;
			case TextPackage.PTYPE__EXPRESSION:
				getExpression().clear();
				return;
			case TextPackage.PTYPE__TEXT_INPUT:
				getTextInput().clear();
				return;
			case TextPackage.PTYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				return;
			case TextPackage.PTYPE__CREATION_DATE:
				getCreationDate().clear();
				return;
			case TextPackage.PTYPE__CREATION_TIME:
				getCreationTime().clear();
				return;
			case TextPackage.PTYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case TextPackage.PTYPE__USER_DEFINED:
				getUserDefined().clear();
				return;
			case TextPackage.PTYPE__PRINT_TIME:
				getPrintTime().clear();
				return;
			case TextPackage.PTYPE__PRINT_DATE:
				getPrintDate().clear();
				return;
			case TextPackage.PTYPE__PRINTED_BY:
				getPrintedBy().clear();
				return;
			case TextPackage.PTYPE__TITLE:
				getTitle().clear();
				return;
			case TextPackage.PTYPE__SUBJECT:
				getSubject().clear();
				return;
			case TextPackage.PTYPE__KEYWORDS:
				getKeywords().clear();
				return;
			case TextPackage.PTYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				return;
			case TextPackage.PTYPE__EDITING_DURATION:
				getEditingDuration().clear();
				return;
			case TextPackage.PTYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				return;
			case TextPackage.PTYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				return;
			case TextPackage.PTYPE__CREATOR:
				getCreator().clear();
				return;
			case TextPackage.PTYPE__PAGE_COUNT:
				getPageCount().clear();
				return;
			case TextPackage.PTYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				return;
			case TextPackage.PTYPE__WORD_COUNT:
				getWordCount().clear();
				return;
			case TextPackage.PTYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				return;
			case TextPackage.PTYPE__TABLE_COUNT:
				getTableCount().clear();
				return;
			case TextPackage.PTYPE__IMAGE_COUNT:
				getImageCount().clear();
				return;
			case TextPackage.PTYPE__OBJECT_COUNT:
				getObjectCount().clear();
				return;
			case TextPackage.PTYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				return;
			case TextPackage.PTYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				return;
			case TextPackage.PTYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				return;
			case TextPackage.PTYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				return;
			case TextPackage.PTYPE__DATABASE_NAME:
				getDatabaseName().clear();
				return;
			case TextPackage.PTYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				return;
			case TextPackage.PTYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				return;
			case TextPackage.PTYPE__PLACEHOLDER:
				getPlaceholder().clear();
				return;
			case TextPackage.PTYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				return;
			case TextPackage.PTYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				return;
			case TextPackage.PTYPE__REFERENCE_REF:
				getReferenceRef().clear();
				return;
			case TextPackage.PTYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				return;
			case TextPackage.PTYPE__NOTE_REF:
				getNoteRef().clear();
				return;
			case TextPackage.PTYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				return;
			case TextPackage.PTYPE__SCRIPT:
				getScript().clear();
				return;
			case TextPackage.PTYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				return;
			case TextPackage.PTYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				return;
			case TextPackage.PTYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				return;
			case TextPackage.PTYPE__MEASURE1:
				getMeasure1().clear();
				return;
			case TextPackage.PTYPE__TABLE_FORMULA:
				getTableFormula().clear();
				return;
			case TextPackage.PTYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				return;
			case TextPackage.PTYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				return;
			case TextPackage.PTYPE__TOC_MARK:
				getTocMark().clear();
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				return;
			case TextPackage.PTYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				return;
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				return;
			case TextPackage.PTYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				return;
			case TextPackage.PTYPE__HEADER:
				getHeader().clear();
				return;
			case TextPackage.PTYPE__FOOTER:
				getFooter().clear();
				return;
			case TextPackage.PTYPE__DATE_TIME:
				getDateTime().clear();
				return;
			case TextPackage.PTYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case TextPackage.PTYPE__COND_STYLE_NAME:
				setCondStyleName(COND_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.PTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case TextPackage.PTYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.PTYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.PTYPE__GROUP:
				return !getGroup().isEmpty();
			case TextPackage.PTYPE__S:
				return !getS().isEmpty();
			case TextPackage.PTYPE__TAB:
				return !getTab().isEmpty();
			case TextPackage.PTYPE__LINE_BREAK:
				return !getLineBreak().isEmpty();
			case TextPackage.PTYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.PTYPE__SPAN:
				return !getSpan().isEmpty();
			case TextPackage.PTYPE__A:
				return !getA().isEmpty();
			case TextPackage.PTYPE__BOOKMARK:
				return !getBookmark().isEmpty();
			case TextPackage.PTYPE__BOOKMARK_START:
				return !getBookmarkStart().isEmpty();
			case TextPackage.PTYPE__BOOKMARK_END:
				return !getBookmarkEnd().isEmpty();
			case TextPackage.PTYPE__REFERENCE_MARK:
				return !getReferenceMark().isEmpty();
			case TextPackage.PTYPE__REFERENCE_MARK_START:
				return !getReferenceMarkStart().isEmpty();
			case TextPackage.PTYPE__REFERENCE_MARK_END:
				return !getReferenceMarkEnd().isEmpty();
			case TextPackage.PTYPE__NOTE:
				return !getNote().isEmpty();
			case TextPackage.PTYPE__RUBY:
				return !getRuby().isEmpty();
			case TextPackage.PTYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case TextPackage.PTYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.PTYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.PTYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.PTYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.PTYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.PTYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.PTYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.PTYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.PTYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.PTYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.PTYPE__G:
				return !getG().isEmpty();
			case TextPackage.PTYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.PTYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.PTYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.PTYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.PTYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.PTYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.PTYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.PTYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.PTYPE__A1:
				return !getA1().isEmpty();
			case TextPackage.PTYPE__DATE:
				return !getDate().isEmpty();
			case TextPackage.PTYPE__TIME:
				return !getTime().isEmpty();
			case TextPackage.PTYPE__PAGE_NUMBER:
				return !getPageNumber().isEmpty();
			case TextPackage.PTYPE__PAGE_CONTINUATION:
				return !getPageContinuation().isEmpty();
			case TextPackage.PTYPE__SENDER_FIRSTNAME:
				return !getSenderFirstname().isEmpty();
			case TextPackage.PTYPE__SENDER_LASTNAME:
				return !getSenderLastname().isEmpty();
			case TextPackage.PTYPE__SENDER_INITIALS:
				return !getSenderInitials().isEmpty();
			case TextPackage.PTYPE__SENDER_TITLE:
				return !getSenderTitle().isEmpty();
			case TextPackage.PTYPE__SENDER_POSITION:
				return !getSenderPosition().isEmpty();
			case TextPackage.PTYPE__SENDER_EMAIL:
				return !getSenderEmail().isEmpty();
			case TextPackage.PTYPE__SENDER_PHONE_PRIVATE:
				return !getSenderPhonePrivate().isEmpty();
			case TextPackage.PTYPE__SENDER_FAX:
				return !getSenderFax().isEmpty();
			case TextPackage.PTYPE__SENDER_COMPANY:
				return !getSenderCompany().isEmpty();
			case TextPackage.PTYPE__SENDER_PHONE_WORK:
				return !getSenderPhoneWork().isEmpty();
			case TextPackage.PTYPE__SENDER_STREET:
				return !getSenderStreet().isEmpty();
			case TextPackage.PTYPE__SENDER_CITY:
				return !getSenderCity().isEmpty();
			case TextPackage.PTYPE__SENDER_POSTAL_CODE:
				return !getSenderPostalCode().isEmpty();
			case TextPackage.PTYPE__SENDER_COUNTRY:
				return !getSenderCountry().isEmpty();
			case TextPackage.PTYPE__SENDER_STATE_OR_PROVINCE:
				return !getSenderStateOrProvince().isEmpty();
			case TextPackage.PTYPE__AUTHOR_NAME:
				return !getAuthorName().isEmpty();
			case TextPackage.PTYPE__AUTHOR_INITIALS:
				return !getAuthorInitials().isEmpty();
			case TextPackage.PTYPE__CHAPTER:
				return !getChapter().isEmpty();
			case TextPackage.PTYPE__FILE_NAME:
				return !getFileName().isEmpty();
			case TextPackage.PTYPE__TEMPLATE_NAME:
				return !getTemplateName().isEmpty();
			case TextPackage.PTYPE__SHEET_NAME:
				return !getSheetName().isEmpty();
			case TextPackage.PTYPE__VARIABLE_SET:
				return !getVariableSet().isEmpty();
			case TextPackage.PTYPE__VARIABLE_GET:
				return !getVariableGet().isEmpty();
			case TextPackage.PTYPE__VARIABLE_INPUT:
				return !getVariableInput().isEmpty();
			case TextPackage.PTYPE__USER_FIELD_GET:
				return !getUserFieldGet().isEmpty();
			case TextPackage.PTYPE__USER_FIELD_INPUT:
				return !getUserFieldInput().isEmpty();
			case TextPackage.PTYPE__SEQUENCE:
				return !getSequence().isEmpty();
			case TextPackage.PTYPE__EXPRESSION:
				return !getExpression().isEmpty();
			case TextPackage.PTYPE__TEXT_INPUT:
				return !getTextInput().isEmpty();
			case TextPackage.PTYPE__INITIAL_CREATOR:
				return !getInitialCreator().isEmpty();
			case TextPackage.PTYPE__CREATION_DATE:
				return !getCreationDate().isEmpty();
			case TextPackage.PTYPE__CREATION_TIME:
				return !getCreationTime().isEmpty();
			case TextPackage.PTYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case TextPackage.PTYPE__USER_DEFINED:
				return !getUserDefined().isEmpty();
			case TextPackage.PTYPE__PRINT_TIME:
				return !getPrintTime().isEmpty();
			case TextPackage.PTYPE__PRINT_DATE:
				return !getPrintDate().isEmpty();
			case TextPackage.PTYPE__PRINTED_BY:
				return !getPrintedBy().isEmpty();
			case TextPackage.PTYPE__TITLE:
				return !getTitle().isEmpty();
			case TextPackage.PTYPE__SUBJECT:
				return !getSubject().isEmpty();
			case TextPackage.PTYPE__KEYWORDS:
				return !getKeywords().isEmpty();
			case TextPackage.PTYPE__EDITING_CYCLES:
				return !getEditingCycles().isEmpty();
			case TextPackage.PTYPE__EDITING_DURATION:
				return !getEditingDuration().isEmpty();
			case TextPackage.PTYPE__MODIFICATION_TIME:
				return !getModificationTime().isEmpty();
			case TextPackage.PTYPE__MODIFICATION_DATE:
				return !getModificationDate().isEmpty();
			case TextPackage.PTYPE__CREATOR:
				return !getCreator().isEmpty();
			case TextPackage.PTYPE__PAGE_COUNT:
				return !getPageCount().isEmpty();
			case TextPackage.PTYPE__PARAGRAPH_COUNT:
				return !getParagraphCount().isEmpty();
			case TextPackage.PTYPE__WORD_COUNT:
				return !getWordCount().isEmpty();
			case TextPackage.PTYPE__CHARACTER_COUNT:
				return !getCharacterCount().isEmpty();
			case TextPackage.PTYPE__TABLE_COUNT:
				return !getTableCount().isEmpty();
			case TextPackage.PTYPE__IMAGE_COUNT:
				return !getImageCount().isEmpty();
			case TextPackage.PTYPE__OBJECT_COUNT:
				return !getObjectCount().isEmpty();
			case TextPackage.PTYPE__DATABASE_DISPLAY:
				return !getDatabaseDisplay().isEmpty();
			case TextPackage.PTYPE__DATABASE_NEXT:
				return !getDatabaseNext().isEmpty();
			case TextPackage.PTYPE__DATABASE_ROW_SELECT:
				return !getDatabaseRowSelect().isEmpty();
			case TextPackage.PTYPE__DATABASE_ROW_NUMBER:
				return !getDatabaseRowNumber().isEmpty();
			case TextPackage.PTYPE__DATABASE_NAME:
				return !getDatabaseName().isEmpty();
			case TextPackage.PTYPE__PAGE_VARIABLE_SET:
				return !getPageVariableSet().isEmpty();
			case TextPackage.PTYPE__PAGE_VARIABLE_GET:
				return !getPageVariableGet().isEmpty();
			case TextPackage.PTYPE__PLACEHOLDER:
				return !getPlaceholder().isEmpty();
			case TextPackage.PTYPE__CONDITIONAL_TEXT:
				return !getConditionalText().isEmpty();
			case TextPackage.PTYPE__HIDDEN_TEXT:
				return !getHiddenText().isEmpty();
			case TextPackage.PTYPE__REFERENCE_REF:
				return !getReferenceRef().isEmpty();
			case TextPackage.PTYPE__BOOKMARK_REF:
				return !getBookmarkRef().isEmpty();
			case TextPackage.PTYPE__NOTE_REF:
				return !getNoteRef().isEmpty();
			case TextPackage.PTYPE__SEQUENCE_REF:
				return !getSequenceRef().isEmpty();
			case TextPackage.PTYPE__SCRIPT:
				return !getScript().isEmpty();
			case TextPackage.PTYPE__EXECUTE_MACRO:
				return !getExecuteMacro().isEmpty();
			case TextPackage.PTYPE__HIDDEN_PARAGRAPH:
				return !getHiddenParagraph().isEmpty();
			case TextPackage.PTYPE__DDE_CONNECTION:
				return !getDdeConnection().isEmpty();
			case TextPackage.PTYPE__MEASURE1:
				return !getMeasure1().isEmpty();
			case TextPackage.PTYPE__TABLE_FORMULA:
				return !getTableFormula().isEmpty();
			case TextPackage.PTYPE__TOC_MARK_START:
				return !getTocMarkStart().isEmpty();
			case TextPackage.PTYPE__TOC_MARK_END:
				return !getTocMarkEnd().isEmpty();
			case TextPackage.PTYPE__TOC_MARK:
				return !getTocMark().isEmpty();
			case TextPackage.PTYPE__USER_INDEX_MARK_START:
				return !getUserIndexMarkStart().isEmpty();
			case TextPackage.PTYPE__USER_INDEX_MARK_END:
				return !getUserIndexMarkEnd().isEmpty();
			case TextPackage.PTYPE__USER_INDEX_MARK:
				return !getUserIndexMark().isEmpty();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_START:
				return !getAlphabeticalIndexMarkStart().isEmpty();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK_END:
				return !getAlphabeticalIndexMarkEnd().isEmpty();
			case TextPackage.PTYPE__ALPHABETICAL_INDEX_MARK:
				return !getAlphabeticalIndexMark().isEmpty();
			case TextPackage.PTYPE__BIBLIOGRAPHY_MARK:
				return !getBibliographyMark().isEmpty();
			case TextPackage.PTYPE__HEADER:
				return !getHeader().isEmpty();
			case TextPackage.PTYPE__FOOTER:
				return !getFooter().isEmpty();
			case TextPackage.PTYPE__DATE_TIME:
				return !getDateTime().isEmpty();
			case TextPackage.PTYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case TextPackage.PTYPE__COND_STYLE_NAME:
				return COND_STYLE_NAME_EDEFAULT == null ? condStyleName != null : !COND_STYLE_NAME_EDEFAULT.equals(condStyleName);
			case TextPackage.PTYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TextPackage.PTYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(", classNames: ");
		result.append(classNames);
		result.append(", condStyleName: ");
		result.append(condStyleName);
		result.append(", id: ");
		result.append(id);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //PTypeImpl
