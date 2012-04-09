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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 * An implementation of the model object '<em><b>Ruby Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyBaseTypeImpl#getDateTime <em>Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubyBaseTypeImpl extends EObjectImpl implements RubyBaseType {
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
	protected RubyBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getRubyBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.RUBY_BASE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SType getS() {
		return (SType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_S(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS(SType newS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_S(), newS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(SType newS) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_S(), newS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabType getTab() {
		return (TabType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Tab(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTab(TabType newTab, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Tab(), newTab, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(TabType newTab) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Tab(), newTab);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType getLineBreak() {
		return (LineBreakType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_LineBreak(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineBreak(LineBreakType newLineBreak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_LineBreak(), newLineBreak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(LineBreakType newLineBreak) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_LineBreak(), newLineBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPageBreakType getSoftPageBreak() {
		return (SoftPageBreakType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SoftPageBreak(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftPageBreak(SoftPageBreakType newSoftPageBreak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SoftPageBreak(), newSoftPageBreak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftPageBreak(SoftPageBreakType newSoftPageBreak) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SoftPageBreak(), newSoftPageBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType getSpan() {
		return (SpanType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Span(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(SpanType newSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Span(), newSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(SpanType newSpan) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Span(), newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType getA() {
		return (AType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_A(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(AType newA, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_A(), newA, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(AType newA) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_A(), newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkType getBookmark() {
		return (BookmarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Bookmark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmark(BookmarkType newBookmark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Bookmark(), newBookmark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmark(BookmarkType newBookmark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Bookmark(), newBookmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkStartType getBookmarkStart() {
		return (BookmarkStartType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_BookmarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkStart(BookmarkStartType newBookmarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_BookmarkStart(), newBookmarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkStart(BookmarkStartType newBookmarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_BookmarkStart(), newBookmarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkEndType getBookmarkEnd() {
		return (BookmarkEndType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_BookmarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkEnd(BookmarkEndType newBookmarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_BookmarkEnd(), newBookmarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkEnd(BookmarkEndType newBookmarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_BookmarkEnd(), newBookmarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkType getReferenceMark() {
		return (ReferenceMarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMark(ReferenceMarkType newReferenceMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMark(), newReferenceMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMark(ReferenceMarkType newReferenceMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMark(), newReferenceMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkStartType getReferenceMarkStart() {
		return (ReferenceMarkStartType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMarkStart(ReferenceMarkStartType newReferenceMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkStart(), newReferenceMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMarkStart(ReferenceMarkStartType newReferenceMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkStart(), newReferenceMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkEndType getReferenceMarkEnd() {
		return (ReferenceMarkEndType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceMarkEnd(ReferenceMarkEndType newReferenceMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkEnd(), newReferenceMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMarkEnd(ReferenceMarkEndType newReferenceMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ReferenceMarkEnd(), newReferenceMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType getNote() {
		return (NoteType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Note(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Note(), newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Note(), newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyType getRuby() {
		return (RubyType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Ruby(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyType newRuby, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Ruby(), newRuby, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuby(RubyType newRuby) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Ruby(), newRuby);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType getAnnotation() {
		return (AnnotationType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Annotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Annotation(), newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(AnnotationType newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Annotation(), newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getRubyBaseType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType getChangeMarks() {
		return (ChangeMarksType)getChangeMarksGroup().get(TextPackage.eINSTANCE.getRubyBaseType_ChangeMarks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeMarks(ChangeMarksType newChangeMarks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getChangeMarksGroup()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ChangeMarks(), newChangeMarks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectType getRect() {
		return (RectType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Rect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRect(RectType newRect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Rect(), newRect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRect(RectType newRect) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Rect(), newRect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLine() {
		return (LineType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Line(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(LineType newLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Line(), newLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(LineType newLine) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Line(), newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineType getPolyline() {
		return (PolylineType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Polyline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyline(PolylineType newPolyline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Polyline(), newPolyline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyline(PolylineType newPolyline) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Polyline(), newPolyline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularPolygonType getRegularPolygon() {
		return (RegularPolygonType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_RegularPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegularPolygon(RegularPolygonType newRegularPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_RegularPolygon(), newRegularPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularPolygon(RegularPolygonType newRegularPolygon) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_RegularPolygon(), newRegularPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType getPath() {
		return (PathType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Path(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathType newPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Path(), newPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(PathType newPath) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Path(), newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleType getCircle() {
		return (CircleType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Circle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircle(CircleType newCircle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Circle(), newCircle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircle(CircleType newCircle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Circle(), newCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseType getEllipse() {
		return (EllipseType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Ellipse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipse(EllipseType newEllipse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Ellipse(), newEllipse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipse(EllipseType newEllipse) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Ellipse(), newEllipse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GType getG() {
		return (GType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_G(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG(GType newG, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_G(), newG, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(GType newG) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_G(), newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageThumbnailType getPageThumbnail() {
		return (PageThumbnailType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageThumbnail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageThumbnail(PageThumbnailType newPageThumbnail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageThumbnail(), newPageThumbnail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageThumbnail(PageThumbnailType newPageThumbnail) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageThumbnail(), newPageThumbnail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType getFrame() {
		return (FrameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Frame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(FrameType newFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Frame(), newFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(FrameType newFrame) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Frame(), newFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionType getCaption() {
		return (CaptionType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Caption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Caption(), newCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(CaptionType newCaption) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Caption(), newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnector() {
		return (ConnectorType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Connector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(ConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Connector(), newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(ConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Connector(), newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType getControl() {
		return (ControlType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Control(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(ControlType newControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Control(), newControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(ControlType newControl) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Control(), newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneType getScene() {
		return (SceneType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Scene(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScene(SceneType newScene, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Scene(), newScene, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScene(SceneType newScene) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Scene(), newScene);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomShapeType getCustomShape() {
		return (CustomShapeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_CustomShape(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomShape(CustomShapeType newCustomShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_CustomShape(), newCustomShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomShape(CustomShapeType newCustomShape) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_CustomShape(), newCustomShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.drawing.AType getA1() {
		return (org.oasisopen.names.tc.opendocument.xmlns.drawing.AType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_A1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA1(org.oasisopen.names.tc.opendocument.xmlns.drawing.AType newA1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_A1(), newA1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA1(org.oasisopen.names.tc.opendocument.xmlns.drawing.AType newA1) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_A1(), newA1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return (DateType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTime() {
		return (TimeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Time(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeType newTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Time(), newTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeType newTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Time(), newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageNumberType getPageNumber() {
		return (PageNumberType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageNumber(PageNumberType newPageNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageNumber(), newPageNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNumber(PageNumberType newPageNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageNumber(), newPageNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageContinuationType getPageContinuation() {
		return (PageContinuationType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageContinuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageContinuation(PageContinuationType newPageContinuation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageContinuation(), newPageContinuation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageContinuation(PageContinuationType newPageContinuation) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageContinuation(), newPageContinuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFirstnameType getSenderFirstname() {
		return (SenderFirstnameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderFirstname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderFirstname(SenderFirstnameType newSenderFirstname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderFirstname(), newSenderFirstname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderFirstname(SenderFirstnameType newSenderFirstname) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderFirstname(), newSenderFirstname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderLastnameType getSenderLastname() {
		return (SenderLastnameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderLastname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderLastname(SenderLastnameType newSenderLastname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderLastname(), newSenderLastname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderLastname(SenderLastnameType newSenderLastname) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderLastname(), newSenderLastname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderInitialsType getSenderInitials() {
		return (SenderInitialsType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderInitials(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderInitials(SenderInitialsType newSenderInitials, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderInitials(), newSenderInitials, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderInitials(SenderInitialsType newSenderInitials) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderInitials(), newSenderInitials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderTitleType getSenderTitle() {
		return (SenderTitleType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderTitle(SenderTitleType newSenderTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderTitle(), newSenderTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderTitle(SenderTitleType newSenderTitle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderTitle(), newSenderTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPositionType getSenderPosition() {
		return (SenderPositionType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPosition(SenderPositionType newSenderPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderPosition(), newSenderPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPosition(SenderPositionType newSenderPosition) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderPosition(), newSenderPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderEmailType getSenderEmail() {
		return (SenderEmailType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderEmail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderEmail(SenderEmailType newSenderEmail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderEmail(), newSenderEmail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderEmail(SenderEmailType newSenderEmail) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderEmail(), newSenderEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhonePrivateType getSenderPhonePrivate() {
		return (SenderPhonePrivateType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderPhonePrivate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPhonePrivate(SenderPhonePrivateType newSenderPhonePrivate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderPhonePrivate(), newSenderPhonePrivate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPhonePrivate(SenderPhonePrivateType newSenderPhonePrivate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderPhonePrivate(), newSenderPhonePrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFaxType getSenderFax() {
		return (SenderFaxType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderFax(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderFax(SenderFaxType newSenderFax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderFax(), newSenderFax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderFax(SenderFaxType newSenderFax) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderFax(), newSenderFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCompanyType getSenderCompany() {
		return (SenderCompanyType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderCompany(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCompany(SenderCompanyType newSenderCompany, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderCompany(), newSenderCompany, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCompany(SenderCompanyType newSenderCompany) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderCompany(), newSenderCompany);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhoneWorkType getSenderPhoneWork() {
		return (SenderPhoneWorkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderPhoneWork(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPhoneWork(SenderPhoneWorkType newSenderPhoneWork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderPhoneWork(), newSenderPhoneWork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPhoneWork(SenderPhoneWorkType newSenderPhoneWork) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderPhoneWork(), newSenderPhoneWork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStreetType getSenderStreet() {
		return (SenderStreetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderStreet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderStreet(SenderStreetType newSenderStreet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderStreet(), newSenderStreet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderStreet(SenderStreetType newSenderStreet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderStreet(), newSenderStreet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCityType getSenderCity() {
		return (SenderCityType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderCity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCity(SenderCityType newSenderCity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderCity(), newSenderCity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCity(SenderCityType newSenderCity) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderCity(), newSenderCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPostalCodeType getSenderPostalCode() {
		return (SenderPostalCodeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderPostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderPostalCode(SenderPostalCodeType newSenderPostalCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderPostalCode(), newSenderPostalCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderPostalCode(SenderPostalCodeType newSenderPostalCode) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderPostalCode(), newSenderPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCountryType getSenderCountry() {
		return (SenderCountryType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderCountry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderCountry(SenderCountryType newSenderCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderCountry(), newSenderCountry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderCountry(SenderCountryType newSenderCountry) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderCountry(), newSenderCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStateOrProvinceType getSenderStateOrProvince() {
		return (SenderStateOrProvinceType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SenderStateOrProvince(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderStateOrProvince(SenderStateOrProvinceType newSenderStateOrProvince, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SenderStateOrProvince(), newSenderStateOrProvince, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderStateOrProvince(SenderStateOrProvinceType newSenderStateOrProvince) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SenderStateOrProvince(), newSenderStateOrProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorNameType getAuthorName() {
		return (AuthorNameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_AuthorName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorName(AuthorNameType newAuthorName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_AuthorName(), newAuthorName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName(AuthorNameType newAuthorName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_AuthorName(), newAuthorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorInitialsType getAuthorInitials() {
		return (AuthorInitialsType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_AuthorInitials(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorInitials(AuthorInitialsType newAuthorInitials, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_AuthorInitials(), newAuthorInitials, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorInitials(AuthorInitialsType newAuthorInitials) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_AuthorInitials(), newAuthorInitials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType getChapter() {
		return (ChapterType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Chapter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapter(ChapterType newChapter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Chapter(), newChapter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChapter(ChapterType newChapter) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Chapter(), newChapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameType getFileName() {
		return (FileNameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_FileName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName(FileNameType newFileName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_FileName(), newFileName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(FileNameType newFileName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_FileName(), newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateNameType getTemplateName() {
		return (TemplateNameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TemplateName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateName(TemplateNameType newTemplateName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TemplateName(), newTemplateName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(TemplateNameType newTemplateName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TemplateName(), newTemplateName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return (String)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SheetName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SheetName(), newSheetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSetType getVariableSet() {
		return (VariableSetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_VariableSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSet(VariableSetType newVariableSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_VariableSet(), newVariableSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSet(VariableSetType newVariableSet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_VariableSet(), newVariableSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGetType getVariableGet() {
		return (VariableGetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_VariableGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableGet(VariableGetType newVariableGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_VariableGet(), newVariableGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableGet(VariableGetType newVariableGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_VariableGet(), newVariableGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInputType getVariableInput() {
		return (VariableInputType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_VariableInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableInput(VariableInputType newVariableInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_VariableInput(), newVariableInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableInput(VariableInputType newVariableInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_VariableInput(), newVariableInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldGetType getUserFieldGet() {
		return (UserFieldGetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserFieldGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldGet(UserFieldGetType newUserFieldGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserFieldGet(), newUserFieldGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldGet(UserFieldGetType newUserFieldGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserFieldGet(), newUserFieldGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldInputType getUserFieldInput() {
		return (UserFieldInputType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserFieldInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldInput(UserFieldInputType newUserFieldInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserFieldInput(), newUserFieldInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldInput(UserFieldInputType newUserFieldInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserFieldInput(), newUserFieldInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType getSequence() {
		return (SequenceType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Sequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(SequenceType newSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Sequence(), newSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(SequenceType newSequence) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Sequence(), newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpression() {
		return (ExpressionType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ExpressionType newExpression) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType getTextInput() {
		return (TextInputType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TextInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextInput(TextInputType newTextInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TextInput(), newTextInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextInput(TextInputType newTextInput) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TextInput(), newTextInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialCreatorType getInitialCreator() {
		return (InitialCreatorType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_InitialCreator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCreator(InitialCreatorType newInitialCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_InitialCreator(), newInitialCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCreator(InitialCreatorType newInitialCreator) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_InitialCreator(), newInitialCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationDateType getCreationDate() {
		return (CreationDateType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_CreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(CreationDateType newCreationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_CreationDate(), newCreationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(CreationDateType newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_CreationDate(), newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType getCreationTime() {
		return (CreationTimeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_CreationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationTime(CreationTimeType newCreationTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_CreationTime(), newCreationTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(CreationTimeType newCreationTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_CreationTime(), newCreationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType getUserDefined() {
		return (UserDefinedType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserDefined(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefined(UserDefinedType newUserDefined, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserDefined(), newUserDefined, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(UserDefinedType newUserDefined) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserDefined(), newUserDefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTimeType getPrintTime() {
		return (PrintTimeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PrintTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintTime(PrintTimeType newPrintTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PrintTime(), newPrintTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintTime(PrintTimeType newPrintTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PrintTime(), newPrintTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintDateType getPrintDate() {
		return (PrintDateType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PrintDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintDate(PrintDateType newPrintDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PrintDate(), newPrintDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintDate(PrintDateType newPrintDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PrintDate(), newPrintDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintedByType getPrintedBy() {
		return (PrintedByType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PrintedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintedBy(PrintedByType newPrintedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PrintedBy(), newPrintedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintedBy(PrintedByType newPrintedBy) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PrintedBy(), newPrintedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectType getSubject() {
		return (SubjectType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectType newSubject) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsType getKeywords() {
		return (KeywordsType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Keywords(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(KeywordsType newKeywords, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Keywords(), newKeywords, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(KeywordsType newKeywords) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Keywords(), newKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingCyclesType getEditingCycles() {
		return (EditingCyclesType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_EditingCycles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditingCycles(EditingCyclesType newEditingCycles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_EditingCycles(), newEditingCycles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingCycles(EditingCyclesType newEditingCycles) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_EditingCycles(), newEditingCycles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDurationType getEditingDuration() {
		return (EditingDurationType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_EditingDuration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditingDuration(EditingDurationType newEditingDuration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_EditingDuration(), newEditingDuration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingDuration(EditingDurationType newEditingDuration) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_EditingDuration(), newEditingDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationTimeType getModificationTime() {
		return (ModificationTimeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ModificationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationTime(ModificationTimeType newModificationTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ModificationTime(), newModificationTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationTime(ModificationTimeType newModificationTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ModificationTime(), newModificationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType getModificationDate() {
		return (ModificationDateType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ModificationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationDate(ModificationDateType newModificationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ModificationDate(), newModificationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(ModificationDateType newModificationDate) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ModificationDate(), newModificationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatorType getCreator() {
		return (CreatorType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Creator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(CreatorType newCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Creator(), newCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(CreatorType newCreator) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Creator(), newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageCountType getPageCount() {
		return (PageCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(PageCountType newPageCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageCount(), newPageCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageCount(PageCountType newPageCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageCount(), newPageCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphCountType getParagraphCount() {
		return (ParagraphCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ParagraphCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphCount(ParagraphCountType newParagraphCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ParagraphCount(), newParagraphCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphCount(ParagraphCountType newParagraphCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ParagraphCount(), newParagraphCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordCountType getWordCount() {
		return (WordCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_WordCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordCount(WordCountType newWordCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_WordCount(), newWordCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordCount(WordCountType newWordCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_WordCount(), newWordCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterCountType getCharacterCount() {
		return (CharacterCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_CharacterCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterCount(CharacterCountType newCharacterCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_CharacterCount(), newCharacterCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterCount(CharacterCountType newCharacterCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_CharacterCount(), newCharacterCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCountType getTableCount() {
		return (TableCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TableCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCount(TableCountType newTableCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TableCount(), newTableCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCount(TableCountType newTableCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TableCount(), newTableCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCountType getImageCount() {
		return (ImageCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ImageCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCount(ImageCountType newImageCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ImageCount(), newImageCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCount(ImageCountType newImageCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ImageCount(), newImageCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCountType getObjectCount() {
		return (ObjectCountType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ObjectCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectCount(ObjectCountType newObjectCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ObjectCount(), newObjectCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectCount(ObjectCountType newObjectCount) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ObjectCount(), newObjectCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseDisplayAttlist getDatabaseDisplay() {
		return (TextDatabaseDisplayAttlist)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DatabaseDisplay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseDisplay(TextDatabaseDisplayAttlist newDatabaseDisplay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DatabaseDisplay(), newDatabaseDisplay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseDisplay(TextDatabaseDisplayAttlist newDatabaseDisplay) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DatabaseDisplay(), newDatabaseDisplay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseNextAttlist getDatabaseNext() {
		return (TextDatabaseNextAttlist)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DatabaseNext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseNext(TextDatabaseNextAttlist newDatabaseNext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DatabaseNext(), newDatabaseNext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseNext(TextDatabaseNextAttlist newDatabaseNext) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DatabaseNext(), newDatabaseNext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseRowSelectAttlist getDatabaseRowSelect() {
		return (TextDatabaseRowSelectAttlist)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowSelect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRowSelect(TextDatabaseRowSelectAttlist newDatabaseRowSelect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowSelect(), newDatabaseRowSelect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRowSelect(TextDatabaseRowSelectAttlist newDatabaseRowSelect) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowSelect(), newDatabaseRowSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRowNumberType getDatabaseRowNumber() {
		return (DatabaseRowNumberType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRowNumber(DatabaseRowNumberType newDatabaseRowNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowNumber(), newDatabaseRowNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRowNumber(DatabaseRowNumberType newDatabaseRowNumber) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DatabaseRowNumber(), newDatabaseRowNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseNameType getDatabaseName() {
		return (DatabaseNameType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DatabaseName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseName(DatabaseNameType newDatabaseName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DatabaseName(), newDatabaseName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(DatabaseNameType newDatabaseName) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DatabaseName(), newDatabaseName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableSetType getPageVariableSet() {
		return (PageVariableSetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageVariableSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageVariableSet(PageVariableSetType newPageVariableSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageVariableSet(), newPageVariableSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageVariableSet(PageVariableSetType newPageVariableSet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageVariableSet(), newPageVariableSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableGetType getPageVariableGet() {
		return (PageVariableGetType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_PageVariableGet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageVariableGet(PageVariableGetType newPageVariableGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_PageVariableGet(), newPageVariableGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageVariableGet(PageVariableGetType newPageVariableGet) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_PageVariableGet(), newPageVariableGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderType getPlaceholder() {
		return (PlaceholderType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Placeholder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlaceholder(PlaceholderType newPlaceholder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Placeholder(), newPlaceholder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(PlaceholderType newPlaceholder) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Placeholder(), newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTextType getConditionalText() {
		return (ConditionalTextType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ConditionalText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalText(ConditionalTextType newConditionalText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ConditionalText(), newConditionalText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalText(ConditionalTextType newConditionalText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ConditionalText(), newConditionalText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenTextType getHiddenText() {
		return (HiddenTextType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_HiddenText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiddenText(HiddenTextType newHiddenText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_HiddenText(), newHiddenText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenText(HiddenTextType newHiddenText) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_HiddenText(), newHiddenText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRefType getReferenceRef() {
		return (ReferenceRefType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ReferenceRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceRef(ReferenceRefType newReferenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ReferenceRef(), newReferenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceRef(ReferenceRefType newReferenceRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ReferenceRef(), newReferenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkRefType getBookmarkRef() {
		return (BookmarkRefType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_BookmarkRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookmarkRef(BookmarkRefType newBookmarkRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_BookmarkRef(), newBookmarkRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmarkRef(BookmarkRefType newBookmarkRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_BookmarkRef(), newBookmarkRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteRefType getNoteRef() {
		return (NoteRefType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_NoteRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteRef(NoteRefType newNoteRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_NoteRef(), newNoteRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteRef(NoteRefType newNoteRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_NoteRef(), newNoteRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRefType getSequenceRef() {
		return (SequenceRefType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_SequenceRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceRef(SequenceRefType newSequenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_SequenceRef(), newSequenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceRef(SequenceRefType newSequenceRef) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_SequenceRef(), newSequenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Script(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Script(), newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Script(), newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteMacroType getExecuteMacro() {
		return (ExecuteMacroType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_ExecuteMacro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecuteMacro(ExecuteMacroType newExecuteMacro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_ExecuteMacro(), newExecuteMacro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteMacro(ExecuteMacroType newExecuteMacro) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_ExecuteMacro(), newExecuteMacro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenParagraphType getHiddenParagraph() {
		return (HiddenParagraphType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_HiddenParagraph(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiddenParagraph(HiddenParagraphType newHiddenParagraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_HiddenParagraph(), newHiddenParagraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenParagraph(HiddenParagraphType newHiddenParagraph) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_HiddenParagraph(), newHiddenParagraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionType getDdeConnection() {
		return (DdeConnectionType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DdeConnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnection(DdeConnectionType newDdeConnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DdeConnection(), newDdeConnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnection(DdeConnectionType newDdeConnection) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DdeConnection(), newDdeConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType getMeasure1() {
		return (org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Measure1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure1(org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType newMeasure1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Measure1(), newMeasure1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure1(org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType newMeasure1) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Measure1(), newMeasure1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFormulaType getTableFormula() {
		return (TableFormulaType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TableFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableFormula(TableFormulaType newTableFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TableFormula(), newTableFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableFormula(TableFormulaType newTableFormula) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TableFormula(), newTableFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkStartType getTocMarkStart() {
		return (TocMarkStartType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TocMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMarkStart(TocMarkStartType newTocMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TocMarkStart(), newTocMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMarkStart(TocMarkStartType newTocMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TocMarkStart(), newTocMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkEndType getTocMarkEnd() {
		return (TocMarkEndType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TocMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMarkEnd(TocMarkEndType newTocMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TocMarkEnd(), newTocMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMarkEnd(TocMarkEndType newTocMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TocMarkEnd(), newTocMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkType getTocMark() {
		return (TocMarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_TocMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocMark(TocMarkType newTocMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_TocMark(), newTocMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocMark(TocMarkType newTocMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_TocMark(), newTocMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkStartType getUserIndexMarkStart() {
		return (UserIndexMarkStartType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMarkStart(UserIndexMarkStartType newUserIndexMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkStart(), newUserIndexMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMarkStart(UserIndexMarkStartType newUserIndexMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkStart(), newUserIndexMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkEndType getUserIndexMarkEnd() {
		return (UserIndexMarkEndType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMarkEnd(UserIndexMarkEndType newUserIndexMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkEnd(), newUserIndexMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMarkEnd(UserIndexMarkEndType newUserIndexMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMarkEnd(), newUserIndexMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkType getUserIndexMark() {
		return (UserIndexMarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIndexMark(UserIndexMarkType newUserIndexMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMark(), newUserIndexMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIndexMark(UserIndexMarkType newUserIndexMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_UserIndexMark(), newUserIndexMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkStartType getAlphabeticalIndexMarkStart() {
		return (AlphabeticalIndexMarkStartType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType newAlphabeticalIndexMarkStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkStart(), newAlphabeticalIndexMarkStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMarkStart(AlphabeticalIndexMarkStartType newAlphabeticalIndexMarkStart) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkStart(), newAlphabeticalIndexMarkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkEndType getAlphabeticalIndexMarkEnd() {
		return (AlphabeticalIndexMarkEndType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType newAlphabeticalIndexMarkEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkEnd(), newAlphabeticalIndexMarkEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMarkEnd(AlphabeticalIndexMarkEndType newAlphabeticalIndexMarkEnd) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMarkEnd(), newAlphabeticalIndexMarkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkType getAlphabeticalIndexMark() {
		return (AlphabeticalIndexMarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexMark(AlphabeticalIndexMarkType newAlphabeticalIndexMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMark(), newAlphabeticalIndexMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexMark(AlphabeticalIndexMarkType newAlphabeticalIndexMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_AlphabeticalIndexMark(), newAlphabeticalIndexMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyMarkType getBibliographyMark() {
		return (BibliographyMarkType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_BibliographyMark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographyMark(BibliographyMarkType newBibliographyMark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_BibliographyMark(), newBibliographyMark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyMark(BibliographyMarkType newBibliographyMark) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_BibliographyMark(), newBibliographyMark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return (HeaderType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Header(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Header(), newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Header(), newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return (FooterType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_Footer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_Footer(), newFooter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_Footer(), newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTime() {
		return (DateTimeType)getMixed().get(TextPackage.eINSTANCE.getRubyBaseType_DateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTimeType newDateTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getRubyBaseType_DateTime(), newDateTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTimeType newDateTime) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getRubyBaseType_DateTime(), newDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.RUBY_BASE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.RUBY_BASE_TYPE__S:
				return basicSetS(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TAB:
				return basicSetTab(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__LINE_BREAK:
				return basicSetLineBreak(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SOFT_PAGE_BREAK:
				return basicSetSoftPageBreak(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SPAN:
				return basicSetSpan(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__A:
				return basicSetA(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK:
				return basicSetBookmark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_START:
				return basicSetBookmarkStart(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_END:
				return basicSetBookmarkEnd(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK:
				return basicSetReferenceMark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_START:
				return basicSetReferenceMarkStart(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_END:
				return basicSetReferenceMarkEnd(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__NOTE:
				return basicSetNote(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__RUBY:
				return basicSetRuby(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS:
				return basicSetChangeMarks(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__RECT:
				return basicSetRect(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__LINE:
				return basicSetLine(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__POLYLINE:
				return basicSetPolyline(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__POLYGON:
				return basicSetPolygon(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__REGULAR_POLYGON:
				return basicSetRegularPolygon(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PATH:
				return basicSetPath(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CIRCLE:
				return basicSetCircle(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__ELLIPSE:
				return basicSetEllipse(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__G:
				return basicSetG(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_THUMBNAIL:
				return basicSetPageThumbnail(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__FRAME:
				return basicSetFrame(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__MEASURE:
				return basicSetMeasure(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CONNECTOR:
				return basicSetConnector(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CONTROL:
				return basicSetControl(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SCENE:
				return basicSetScene(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CUSTOM_SHAPE:
				return basicSetCustomShape(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__A1:
				return basicSetA1(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATE:
				return basicSetDate(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TIME:
				return basicSetTime(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_NUMBER:
				return basicSetPageNumber(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_CONTINUATION:
				return basicSetPageContinuation(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_FIRSTNAME:
				return basicSetSenderFirstname(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_LASTNAME:
				return basicSetSenderLastname(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_INITIALS:
				return basicSetSenderInitials(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_TITLE:
				return basicSetSenderTitle(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSITION:
				return basicSetSenderPosition(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_EMAIL:
				return basicSetSenderEmail(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_PRIVATE:
				return basicSetSenderPhonePrivate(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_FAX:
				return basicSetSenderFax(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_COMPANY:
				return basicSetSenderCompany(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_WORK:
				return basicSetSenderPhoneWork(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_STREET:
				return basicSetSenderStreet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_CITY:
				return basicSetSenderCity(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSTAL_CODE:
				return basicSetSenderPostalCode(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_COUNTRY:
				return basicSetSenderCountry(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SENDER_STATE_OR_PROVINCE:
				return basicSetSenderStateOrProvince(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_NAME:
				return basicSetAuthorName(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_INITIALS:
				return basicSetAuthorInitials(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CHAPTER:
				return basicSetChapter(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__FILE_NAME:
				return basicSetFileName(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TEMPLATE_NAME:
				return basicSetTemplateName(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_SET:
				return basicSetVariableSet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_GET:
				return basicSetVariableGet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_INPUT:
				return basicSetVariableInput(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_GET:
				return basicSetUserFieldGet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_INPUT:
				return basicSetUserFieldInput(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TEXT_INPUT:
				return basicSetTextInput(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__INITIAL_CREATOR:
				return basicSetInitialCreator(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CREATION_TIME:
				return basicSetCreationTime(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_DEFINED:
				return basicSetUserDefined(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PRINT_TIME:
				return basicSetPrintTime(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PRINT_DATE:
				return basicSetPrintDate(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PRINTED_BY:
				return basicSetPrintedBy(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SUBJECT:
				return basicSetSubject(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__EDITING_CYCLES:
				return basicSetEditingCycles(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__EDITING_DURATION:
				return basicSetEditingDuration(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_TIME:
				return basicSetModificationTime(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_DATE:
				return basicSetModificationDate(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CREATOR:
				return basicSetCreator(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PARAGRAPH_COUNT:
				return basicSetParagraphCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__WORD_COUNT:
				return basicSetWordCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CHARACTER_COUNT:
				return basicSetCharacterCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TABLE_COUNT:
				return basicSetTableCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__IMAGE_COUNT:
				return basicSetImageCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__OBJECT_COUNT:
				return basicSetObjectCount(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATABASE_DISPLAY:
				return basicSetDatabaseDisplay(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NEXT:
				return basicSetDatabaseNext(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_SELECT:
				return basicSetDatabaseRowSelect(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_NUMBER:
				return basicSetDatabaseRowNumber(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NAME:
				return basicSetDatabaseName(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_SET:
				return basicSetPageVariableSet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_GET:
				return basicSetPageVariableGet(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__PLACEHOLDER:
				return basicSetPlaceholder(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__CONDITIONAL_TEXT:
				return basicSetConditionalText(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_TEXT:
				return basicSetHiddenText(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_REF:
				return basicSetReferenceRef(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_REF:
				return basicSetBookmarkRef(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__NOTE_REF:
				return basicSetNoteRef(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE_REF:
				return basicSetSequenceRef(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__SCRIPT:
				return basicSetScript(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__EXECUTE_MACRO:
				return basicSetExecuteMacro(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_PARAGRAPH:
				return basicSetHiddenParagraph(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DDE_CONNECTION:
				return basicSetDdeConnection(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__MEASURE1:
				return basicSetMeasure1(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TABLE_FORMULA:
				return basicSetTableFormula(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_START:
				return basicSetTocMarkStart(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_END:
				return basicSetTocMarkEnd(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK:
				return basicSetTocMark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_START:
				return basicSetUserIndexMarkStart(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_END:
				return basicSetUserIndexMarkEnd(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK:
				return basicSetUserIndexMark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return basicSetAlphabeticalIndexMarkStart(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return basicSetAlphabeticalIndexMarkEnd(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK:
				return basicSetAlphabeticalIndexMark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__BIBLIOGRAPHY_MARK:
				return basicSetBibliographyMark(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__FOOTER:
				return basicSetFooter(null, msgs);
			case TextPackage.RUBY_BASE_TYPE__DATE_TIME:
				return basicSetDateTime(null, msgs);
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
			case TextPackage.RUBY_BASE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.RUBY_BASE_TYPE__S:
				return getS();
			case TextPackage.RUBY_BASE_TYPE__TAB:
				return getTab();
			case TextPackage.RUBY_BASE_TYPE__LINE_BREAK:
				return getLineBreak();
			case TextPackage.RUBY_BASE_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.RUBY_BASE_TYPE__SPAN:
				return getSpan();
			case TextPackage.RUBY_BASE_TYPE__A:
				return getA();
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK:
				return getBookmark();
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_START:
				return getBookmarkStart();
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_END:
				return getBookmarkEnd();
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK:
				return getReferenceMark();
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_START:
				return getReferenceMarkStart();
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_END:
				return getReferenceMarkEnd();
			case TextPackage.RUBY_BASE_TYPE__NOTE:
				return getNote();
			case TextPackage.RUBY_BASE_TYPE__RUBY:
				return getRuby();
			case TextPackage.RUBY_BASE_TYPE__ANNOTATION:
				return getAnnotation();
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.RUBY_BASE_TYPE__RECT:
				return getRect();
			case TextPackage.RUBY_BASE_TYPE__LINE:
				return getLine();
			case TextPackage.RUBY_BASE_TYPE__POLYLINE:
				return getPolyline();
			case TextPackage.RUBY_BASE_TYPE__POLYGON:
				return getPolygon();
			case TextPackage.RUBY_BASE_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.RUBY_BASE_TYPE__PATH:
				return getPath();
			case TextPackage.RUBY_BASE_TYPE__CIRCLE:
				return getCircle();
			case TextPackage.RUBY_BASE_TYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.RUBY_BASE_TYPE__G:
				return getG();
			case TextPackage.RUBY_BASE_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.RUBY_BASE_TYPE__FRAME:
				return getFrame();
			case TextPackage.RUBY_BASE_TYPE__MEASURE:
				return getMeasure();
			case TextPackage.RUBY_BASE_TYPE__CAPTION:
				return getCaption();
			case TextPackage.RUBY_BASE_TYPE__CONNECTOR:
				return getConnector();
			case TextPackage.RUBY_BASE_TYPE__CONTROL:
				return getControl();
			case TextPackage.RUBY_BASE_TYPE__SCENE:
				return getScene();
			case TextPackage.RUBY_BASE_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.RUBY_BASE_TYPE__A1:
				return getA1();
			case TextPackage.RUBY_BASE_TYPE__DATE:
				return getDate();
			case TextPackage.RUBY_BASE_TYPE__TIME:
				return getTime();
			case TextPackage.RUBY_BASE_TYPE__PAGE_NUMBER:
				return getPageNumber();
			case TextPackage.RUBY_BASE_TYPE__PAGE_CONTINUATION:
				return getPageContinuation();
			case TextPackage.RUBY_BASE_TYPE__SENDER_FIRSTNAME:
				return getSenderFirstname();
			case TextPackage.RUBY_BASE_TYPE__SENDER_LASTNAME:
				return getSenderLastname();
			case TextPackage.RUBY_BASE_TYPE__SENDER_INITIALS:
				return getSenderInitials();
			case TextPackage.RUBY_BASE_TYPE__SENDER_TITLE:
				return getSenderTitle();
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSITION:
				return getSenderPosition();
			case TextPackage.RUBY_BASE_TYPE__SENDER_EMAIL:
				return getSenderEmail();
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate();
			case TextPackage.RUBY_BASE_TYPE__SENDER_FAX:
				return getSenderFax();
			case TextPackage.RUBY_BASE_TYPE__SENDER_COMPANY:
				return getSenderCompany();
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_WORK:
				return getSenderPhoneWork();
			case TextPackage.RUBY_BASE_TYPE__SENDER_STREET:
				return getSenderStreet();
			case TextPackage.RUBY_BASE_TYPE__SENDER_CITY:
				return getSenderCity();
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSTAL_CODE:
				return getSenderPostalCode();
			case TextPackage.RUBY_BASE_TYPE__SENDER_COUNTRY:
				return getSenderCountry();
			case TextPackage.RUBY_BASE_TYPE__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince();
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_NAME:
				return getAuthorName();
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_INITIALS:
				return getAuthorInitials();
			case TextPackage.RUBY_BASE_TYPE__CHAPTER:
				return getChapter();
			case TextPackage.RUBY_BASE_TYPE__FILE_NAME:
				return getFileName();
			case TextPackage.RUBY_BASE_TYPE__TEMPLATE_NAME:
				return getTemplateName();
			case TextPackage.RUBY_BASE_TYPE__SHEET_NAME:
				return getSheetName();
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_SET:
				return getVariableSet();
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_GET:
				return getVariableGet();
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_INPUT:
				return getVariableInput();
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_GET:
				return getUserFieldGet();
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_INPUT:
				return getUserFieldInput();
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE:
				return getSequence();
			case TextPackage.RUBY_BASE_TYPE__EXPRESSION:
				return getExpression();
			case TextPackage.RUBY_BASE_TYPE__TEXT_INPUT:
				return getTextInput();
			case TextPackage.RUBY_BASE_TYPE__INITIAL_CREATOR:
				return getInitialCreator();
			case TextPackage.RUBY_BASE_TYPE__CREATION_DATE:
				return getCreationDate();
			case TextPackage.RUBY_BASE_TYPE__CREATION_TIME:
				return getCreationTime();
			case TextPackage.RUBY_BASE_TYPE__DESCRIPTION:
				return getDescription();
			case TextPackage.RUBY_BASE_TYPE__USER_DEFINED:
				return getUserDefined();
			case TextPackage.RUBY_BASE_TYPE__PRINT_TIME:
				return getPrintTime();
			case TextPackage.RUBY_BASE_TYPE__PRINT_DATE:
				return getPrintDate();
			case TextPackage.RUBY_BASE_TYPE__PRINTED_BY:
				return getPrintedBy();
			case TextPackage.RUBY_BASE_TYPE__TITLE:
				return getTitle();
			case TextPackage.RUBY_BASE_TYPE__SUBJECT:
				return getSubject();
			case TextPackage.RUBY_BASE_TYPE__KEYWORDS:
				return getKeywords();
			case TextPackage.RUBY_BASE_TYPE__EDITING_CYCLES:
				return getEditingCycles();
			case TextPackage.RUBY_BASE_TYPE__EDITING_DURATION:
				return getEditingDuration();
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_TIME:
				return getModificationTime();
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_DATE:
				return getModificationDate();
			case TextPackage.RUBY_BASE_TYPE__CREATOR:
				return getCreator();
			case TextPackage.RUBY_BASE_TYPE__PAGE_COUNT:
				return getPageCount();
			case TextPackage.RUBY_BASE_TYPE__PARAGRAPH_COUNT:
				return getParagraphCount();
			case TextPackage.RUBY_BASE_TYPE__WORD_COUNT:
				return getWordCount();
			case TextPackage.RUBY_BASE_TYPE__CHARACTER_COUNT:
				return getCharacterCount();
			case TextPackage.RUBY_BASE_TYPE__TABLE_COUNT:
				return getTableCount();
			case TextPackage.RUBY_BASE_TYPE__IMAGE_COUNT:
				return getImageCount();
			case TextPackage.RUBY_BASE_TYPE__OBJECT_COUNT:
				return getObjectCount();
			case TextPackage.RUBY_BASE_TYPE__DATABASE_DISPLAY:
				return getDatabaseDisplay();
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NEXT:
				return getDatabaseNext();
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect();
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber();
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_SET:
				return getPageVariableSet();
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_GET:
				return getPageVariableGet();
			case TextPackage.RUBY_BASE_TYPE__PLACEHOLDER:
				return getPlaceholder();
			case TextPackage.RUBY_BASE_TYPE__CONDITIONAL_TEXT:
				return getConditionalText();
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_TEXT:
				return getHiddenText();
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_REF:
				return getReferenceRef();
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_REF:
				return getBookmarkRef();
			case TextPackage.RUBY_BASE_TYPE__NOTE_REF:
				return getNoteRef();
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE_REF:
				return getSequenceRef();
			case TextPackage.RUBY_BASE_TYPE__SCRIPT:
				return getScript();
			case TextPackage.RUBY_BASE_TYPE__EXECUTE_MACRO:
				return getExecuteMacro();
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_PARAGRAPH:
				return getHiddenParagraph();
			case TextPackage.RUBY_BASE_TYPE__DDE_CONNECTION:
				return getDdeConnection();
			case TextPackage.RUBY_BASE_TYPE__MEASURE1:
				return getMeasure1();
			case TextPackage.RUBY_BASE_TYPE__TABLE_FORMULA:
				return getTableFormula();
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_START:
				return getTocMarkStart();
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_END:
				return getTocMarkEnd();
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK:
				return getTocMark();
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_START:
				return getUserIndexMarkStart();
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd();
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK:
				return getUserIndexMark();
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart();
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd();
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark();
			case TextPackage.RUBY_BASE_TYPE__BIBLIOGRAPHY_MARK:
				return getBibliographyMark();
			case TextPackage.RUBY_BASE_TYPE__HEADER:
				return getHeader();
			case TextPackage.RUBY_BASE_TYPE__FOOTER:
				return getFooter();
			case TextPackage.RUBY_BASE_TYPE__DATE_TIME:
				return getDateTime();
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
			case TextPackage.RUBY_BASE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__S:
				setS((SType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TAB:
				setTab((TabType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__LINE_BREAK:
				setLineBreak((LineBreakType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SOFT_PAGE_BREAK:
				setSoftPageBreak((SoftPageBreakType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SPAN:
				setSpan((SpanType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__A:
				setA((AType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK:
				setBookmark((BookmarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_START:
				setBookmarkStart((BookmarkStartType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_END:
				setBookmarkEnd((BookmarkEndType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK:
				setReferenceMark((ReferenceMarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_START:
				setReferenceMarkStart((ReferenceMarkStartType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_END:
				setReferenceMarkEnd((ReferenceMarkEndType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__NOTE:
				setNote((NoteType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__RUBY:
				setRuby((RubyType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__RECT:
				setRect((RectType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__LINE:
				setLine((LineType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__POLYLINE:
				setPolyline((PolylineType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__REGULAR_POLYGON:
				setRegularPolygon((RegularPolygonType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PATH:
				setPath((PathType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CIRCLE:
				setCircle((CircleType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__ELLIPSE:
				setEllipse((EllipseType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__G:
				setG((GType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_THUMBNAIL:
				setPageThumbnail((PageThumbnailType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__FRAME:
				setFrame((FrameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONNECTOR:
				setConnector((ConnectorType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONTROL:
				setControl((ControlType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SCENE:
				setScene((SceneType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CUSTOM_SHAPE:
				setCustomShape((CustomShapeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__A1:
				setA1((org.oasisopen.names.tc.opendocument.xmlns.drawing.AType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATE:
				setDate((DateType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TIME:
				setTime((TimeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_NUMBER:
				setPageNumber((PageNumberType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_CONTINUATION:
				setPageContinuation((PageContinuationType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FIRSTNAME:
				setSenderFirstname((SenderFirstnameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_LASTNAME:
				setSenderLastname((SenderLastnameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_INITIALS:
				setSenderInitials((SenderInitialsType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_TITLE:
				setSenderTitle((SenderTitleType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSITION:
				setSenderPosition((SenderPositionType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_EMAIL:
				setSenderEmail((SenderEmailType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_PRIVATE:
				setSenderPhonePrivate((SenderPhonePrivateType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FAX:
				setSenderFax((SenderFaxType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COMPANY:
				setSenderCompany((SenderCompanyType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_WORK:
				setSenderPhoneWork((SenderPhoneWorkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STREET:
				setSenderStreet((SenderStreetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_CITY:
				setSenderCity((SenderCityType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSTAL_CODE:
				setSenderPostalCode((SenderPostalCodeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COUNTRY:
				setSenderCountry((SenderCountryType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STATE_OR_PROVINCE:
				setSenderStateOrProvince((SenderStateOrProvinceType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_NAME:
				setAuthorName((AuthorNameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_INITIALS:
				setAuthorInitials((AuthorInitialsType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHAPTER:
				setChapter((ChapterType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__FILE_NAME:
				setFileName((FileNameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TEMPLATE_NAME:
				setTemplateName((TemplateNameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SHEET_NAME:
				setSheetName((String)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_SET:
				setVariableSet((VariableSetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_GET:
				setVariableGet((VariableGetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_INPUT:
				setVariableInput((VariableInputType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_GET:
				setUserFieldGet((UserFieldGetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_INPUT:
				setUserFieldInput((UserFieldInputType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__EXPRESSION:
				setExpression((ExpressionType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TEXT_INPUT:
				setTextInput((TextInputType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__INITIAL_CREATOR:
				setInitialCreator((InitialCreatorType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATION_DATE:
				setCreationDate((CreationDateType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATION_TIME:
				setCreationTime((CreationTimeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_DEFINED:
				setUserDefined((UserDefinedType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINT_TIME:
				setPrintTime((PrintTimeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINT_DATE:
				setPrintDate((PrintDateType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINTED_BY:
				setPrintedBy((PrintedByType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SUBJECT:
				setSubject((SubjectType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__KEYWORDS:
				setKeywords((KeywordsType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__EDITING_CYCLES:
				setEditingCycles((EditingCyclesType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__EDITING_DURATION:
				setEditingDuration((EditingDurationType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_TIME:
				setModificationTime((ModificationTimeType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATOR:
				setCreator((CreatorType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PARAGRAPH_COUNT:
				setParagraphCount((ParagraphCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__WORD_COUNT:
				setWordCount((WordCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHARACTER_COUNT:
				setCharacterCount((CharacterCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TABLE_COUNT:
				setTableCount((TableCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__IMAGE_COUNT:
				setImageCount((ImageCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__OBJECT_COUNT:
				setObjectCount((ObjectCountType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_DISPLAY:
				setDatabaseDisplay((TextDatabaseDisplayAttlist)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NEXT:
				setDatabaseNext((TextDatabaseNextAttlist)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_SELECT:
				setDatabaseRowSelect((TextDatabaseRowSelectAttlist)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_NUMBER:
				setDatabaseRowNumber((DatabaseRowNumberType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NAME:
				setDatabaseName((DatabaseNameType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_SET:
				setPageVariableSet((PageVariableSetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_GET:
				setPageVariableGet((PageVariableGetType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__PLACEHOLDER:
				setPlaceholder((PlaceholderType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONDITIONAL_TEXT:
				setConditionalText((ConditionalTextType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_TEXT:
				setHiddenText((HiddenTextType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_REF:
				setReferenceRef((ReferenceRefType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_REF:
				setBookmarkRef((BookmarkRefType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__NOTE_REF:
				setNoteRef((NoteRefType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE_REF:
				setSequenceRef((SequenceRefType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__EXECUTE_MACRO:
				setExecuteMacro((ExecuteMacroType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_PARAGRAPH:
				setHiddenParagraph((HiddenParagraphType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DDE_CONNECTION:
				setDdeConnection((DdeConnectionType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__MEASURE1:
				setMeasure1((org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TABLE_FORMULA:
				setTableFormula((TableFormulaType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_START:
				setTocMarkStart((TocMarkStartType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_END:
				setTocMarkEnd((TocMarkEndType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK:
				setTocMark((TocMarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_START:
				setUserIndexMarkStart((UserIndexMarkStartType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_END:
				setUserIndexMarkEnd((UserIndexMarkEndType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK:
				setUserIndexMark((UserIndexMarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_START:
				setAlphabeticalIndexMarkStart((AlphabeticalIndexMarkStartType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_END:
				setAlphabeticalIndexMarkEnd((AlphabeticalIndexMarkEndType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK:
				setAlphabeticalIndexMark((AlphabeticalIndexMarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__BIBLIOGRAPHY_MARK:
				setBibliographyMark((BibliographyMarkType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATE_TIME:
				setDateTime((DateTimeType)newValue);
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
			case TextPackage.RUBY_BASE_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.RUBY_BASE_TYPE__S:
				setS((SType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TAB:
				setTab((TabType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__LINE_BREAK:
				setLineBreak((LineBreakType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SOFT_PAGE_BREAK:
				setSoftPageBreak((SoftPageBreakType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SPAN:
				setSpan((SpanType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__A:
				setA((AType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK:
				setBookmark((BookmarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_START:
				setBookmarkStart((BookmarkStartType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_END:
				setBookmarkEnd((BookmarkEndType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK:
				setReferenceMark((ReferenceMarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_START:
				setReferenceMarkStart((ReferenceMarkStartType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_END:
				setReferenceMarkEnd((ReferenceMarkEndType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__NOTE:
				setNote((NoteType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__RUBY:
				setRuby((RubyType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.RUBY_BASE_TYPE__RECT:
				setRect((RectType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__LINE:
				setLine((LineType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__POLYLINE:
				setPolyline((PolylineType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__REGULAR_POLYGON:
				setRegularPolygon((RegularPolygonType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PATH:
				setPath((PathType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CIRCLE:
				setCircle((CircleType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__ELLIPSE:
				setEllipse((EllipseType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__G:
				setG((GType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_THUMBNAIL:
				setPageThumbnail((PageThumbnailType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__FRAME:
				setFrame((FrameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONNECTOR:
				setConnector((ConnectorType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONTROL:
				setControl((ControlType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SCENE:
				setScene((SceneType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CUSTOM_SHAPE:
				setCustomShape((CustomShapeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__A1:
				setA1((org.oasisopen.names.tc.opendocument.xmlns.drawing.AType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATE:
				setDate((DateType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TIME:
				setTime((TimeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_NUMBER:
				setPageNumber((PageNumberType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_CONTINUATION:
				setPageContinuation((PageContinuationType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FIRSTNAME:
				setSenderFirstname((SenderFirstnameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_LASTNAME:
				setSenderLastname((SenderLastnameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_INITIALS:
				setSenderInitials((SenderInitialsType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_TITLE:
				setSenderTitle((SenderTitleType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSITION:
				setSenderPosition((SenderPositionType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_EMAIL:
				setSenderEmail((SenderEmailType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_PRIVATE:
				setSenderPhonePrivate((SenderPhonePrivateType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FAX:
				setSenderFax((SenderFaxType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COMPANY:
				setSenderCompany((SenderCompanyType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_WORK:
				setSenderPhoneWork((SenderPhoneWorkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STREET:
				setSenderStreet((SenderStreetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_CITY:
				setSenderCity((SenderCityType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSTAL_CODE:
				setSenderPostalCode((SenderPostalCodeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COUNTRY:
				setSenderCountry((SenderCountryType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STATE_OR_PROVINCE:
				setSenderStateOrProvince((SenderStateOrProvinceType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_NAME:
				setAuthorName((AuthorNameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_INITIALS:
				setAuthorInitials((AuthorInitialsType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHAPTER:
				setChapter((ChapterType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__FILE_NAME:
				setFileName((FileNameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TEMPLATE_NAME:
				setTemplateName((TemplateNameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_SET:
				setVariableSet((VariableSetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_GET:
				setVariableGet((VariableGetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_INPUT:
				setVariableInput((VariableInputType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_GET:
				setUserFieldGet((UserFieldGetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_INPUT:
				setUserFieldInput((UserFieldInputType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE:
				setSequence((SequenceType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__EXPRESSION:
				setExpression((ExpressionType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TEXT_INPUT:
				setTextInput((TextInputType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__INITIAL_CREATOR:
				setInitialCreator((InitialCreatorType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATION_DATE:
				setCreationDate((CreationDateType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATION_TIME:
				setCreationTime((CreationTimeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_DEFINED:
				setUserDefined((UserDefinedType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINT_TIME:
				setPrintTime((PrintTimeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINT_DATE:
				setPrintDate((PrintDateType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PRINTED_BY:
				setPrintedBy((PrintedByType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SUBJECT:
				setSubject((SubjectType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__KEYWORDS:
				setKeywords((KeywordsType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__EDITING_CYCLES:
				setEditingCycles((EditingCyclesType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__EDITING_DURATION:
				setEditingDuration((EditingDurationType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_TIME:
				setModificationTime((ModificationTimeType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CREATOR:
				setCreator((CreatorType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PARAGRAPH_COUNT:
				setParagraphCount((ParagraphCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__WORD_COUNT:
				setWordCount((WordCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CHARACTER_COUNT:
				setCharacterCount((CharacterCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TABLE_COUNT:
				setTableCount((TableCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__IMAGE_COUNT:
				setImageCount((ImageCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__OBJECT_COUNT:
				setObjectCount((ObjectCountType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_DISPLAY:
				setDatabaseDisplay((TextDatabaseDisplayAttlist)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NEXT:
				setDatabaseNext((TextDatabaseNextAttlist)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_SELECT:
				setDatabaseRowSelect((TextDatabaseRowSelectAttlist)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_NUMBER:
				setDatabaseRowNumber((DatabaseRowNumberType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NAME:
				setDatabaseName((DatabaseNameType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_SET:
				setPageVariableSet((PageVariableSetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_GET:
				setPageVariableGet((PageVariableGetType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__PLACEHOLDER:
				setPlaceholder((PlaceholderType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__CONDITIONAL_TEXT:
				setConditionalText((ConditionalTextType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_TEXT:
				setHiddenText((HiddenTextType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_REF:
				setReferenceRef((ReferenceRefType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_REF:
				setBookmarkRef((BookmarkRefType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__NOTE_REF:
				setNoteRef((NoteRefType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE_REF:
				setSequenceRef((SequenceRefType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__SCRIPT:
				setScript((ScriptType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__EXECUTE_MACRO:
				setExecuteMacro((ExecuteMacroType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_PARAGRAPH:
				setHiddenParagraph((HiddenParagraphType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DDE_CONNECTION:
				setDdeConnection((DdeConnectionType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__MEASURE1:
				setMeasure1((org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TABLE_FORMULA:
				setTableFormula((TableFormulaType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_START:
				setTocMarkStart((TocMarkStartType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_END:
				setTocMarkEnd((TocMarkEndType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK:
				setTocMark((TocMarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_START:
				setUserIndexMarkStart((UserIndexMarkStartType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_END:
				setUserIndexMarkEnd((UserIndexMarkEndType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK:
				setUserIndexMark((UserIndexMarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_START:
				setAlphabeticalIndexMarkStart((AlphabeticalIndexMarkStartType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_END:
				setAlphabeticalIndexMarkEnd((AlphabeticalIndexMarkEndType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK:
				setAlphabeticalIndexMark((AlphabeticalIndexMarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__BIBLIOGRAPHY_MARK:
				setBibliographyMark((BibliographyMarkType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__HEADER:
				setHeader((HeaderType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__FOOTER:
				setFooter((FooterType)null);
				return;
			case TextPackage.RUBY_BASE_TYPE__DATE_TIME:
				setDateTime((DateTimeType)null);
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
			case TextPackage.RUBY_BASE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.RUBY_BASE_TYPE__S:
				return getS() != null;
			case TextPackage.RUBY_BASE_TYPE__TAB:
				return getTab() != null;
			case TextPackage.RUBY_BASE_TYPE__LINE_BREAK:
				return getLineBreak() != null;
			case TextPackage.RUBY_BASE_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak() != null;
			case TextPackage.RUBY_BASE_TYPE__SPAN:
				return getSpan() != null;
			case TextPackage.RUBY_BASE_TYPE__A:
				return getA() != null;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK:
				return getBookmark() != null;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_START:
				return getBookmarkStart() != null;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_END:
				return getBookmarkEnd() != null;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK:
				return getReferenceMark() != null;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_START:
				return getReferenceMarkStart() != null;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_MARK_END:
				return getReferenceMarkEnd() != null;
			case TextPackage.RUBY_BASE_TYPE__NOTE:
				return getNote() != null;
			case TextPackage.RUBY_BASE_TYPE__RUBY:
				return getRuby() != null;
			case TextPackage.RUBY_BASE_TYPE__ANNOTATION:
				return getAnnotation() != null;
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.RUBY_BASE_TYPE__CHANGE_MARKS:
				return getChangeMarks() != null;
			case TextPackage.RUBY_BASE_TYPE__RECT:
				return getRect() != null;
			case TextPackage.RUBY_BASE_TYPE__LINE:
				return getLine() != null;
			case TextPackage.RUBY_BASE_TYPE__POLYLINE:
				return getPolyline() != null;
			case TextPackage.RUBY_BASE_TYPE__POLYGON:
				return getPolygon() != null;
			case TextPackage.RUBY_BASE_TYPE__REGULAR_POLYGON:
				return getRegularPolygon() != null;
			case TextPackage.RUBY_BASE_TYPE__PATH:
				return getPath() != null;
			case TextPackage.RUBY_BASE_TYPE__CIRCLE:
				return getCircle() != null;
			case TextPackage.RUBY_BASE_TYPE__ELLIPSE:
				return getEllipse() != null;
			case TextPackage.RUBY_BASE_TYPE__G:
				return getG() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail() != null;
			case TextPackage.RUBY_BASE_TYPE__FRAME:
				return getFrame() != null;
			case TextPackage.RUBY_BASE_TYPE__MEASURE:
				return getMeasure() != null;
			case TextPackage.RUBY_BASE_TYPE__CAPTION:
				return getCaption() != null;
			case TextPackage.RUBY_BASE_TYPE__CONNECTOR:
				return getConnector() != null;
			case TextPackage.RUBY_BASE_TYPE__CONTROL:
				return getControl() != null;
			case TextPackage.RUBY_BASE_TYPE__SCENE:
				return getScene() != null;
			case TextPackage.RUBY_BASE_TYPE__CUSTOM_SHAPE:
				return getCustomShape() != null;
			case TextPackage.RUBY_BASE_TYPE__A1:
				return getA1() != null;
			case TextPackage.RUBY_BASE_TYPE__DATE:
				return getDate() != null;
			case TextPackage.RUBY_BASE_TYPE__TIME:
				return getTime() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_NUMBER:
				return getPageNumber() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_CONTINUATION:
				return getPageContinuation() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FIRSTNAME:
				return getSenderFirstname() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_LASTNAME:
				return getSenderLastname() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_INITIALS:
				return getSenderInitials() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_TITLE:
				return getSenderTitle() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSITION:
				return getSenderPosition() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_EMAIL:
				return getSenderEmail() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_FAX:
				return getSenderFax() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COMPANY:
				return getSenderCompany() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_PHONE_WORK:
				return getSenderPhoneWork() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STREET:
				return getSenderStreet() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_CITY:
				return getSenderCity() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_POSTAL_CODE:
				return getSenderPostalCode() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_COUNTRY:
				return getSenderCountry() != null;
			case TextPackage.RUBY_BASE_TYPE__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince() != null;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_NAME:
				return getAuthorName() != null;
			case TextPackage.RUBY_BASE_TYPE__AUTHOR_INITIALS:
				return getAuthorInitials() != null;
			case TextPackage.RUBY_BASE_TYPE__CHAPTER:
				return getChapter() != null;
			case TextPackage.RUBY_BASE_TYPE__FILE_NAME:
				return getFileName() != null;
			case TextPackage.RUBY_BASE_TYPE__TEMPLATE_NAME:
				return getTemplateName() != null;
			case TextPackage.RUBY_BASE_TYPE__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? getSheetName() != null : !SHEET_NAME_EDEFAULT.equals(getSheetName());
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_SET:
				return getVariableSet() != null;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_GET:
				return getVariableGet() != null;
			case TextPackage.RUBY_BASE_TYPE__VARIABLE_INPUT:
				return getVariableInput() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_GET:
				return getUserFieldGet() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_FIELD_INPUT:
				return getUserFieldInput() != null;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE:
				return getSequence() != null;
			case TextPackage.RUBY_BASE_TYPE__EXPRESSION:
				return getExpression() != null;
			case TextPackage.RUBY_BASE_TYPE__TEXT_INPUT:
				return getTextInput() != null;
			case TextPackage.RUBY_BASE_TYPE__INITIAL_CREATOR:
				return getInitialCreator() != null;
			case TextPackage.RUBY_BASE_TYPE__CREATION_DATE:
				return getCreationDate() != null;
			case TextPackage.RUBY_BASE_TYPE__CREATION_TIME:
				return getCreationTime() != null;
			case TextPackage.RUBY_BASE_TYPE__DESCRIPTION:
				return getDescription() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_DEFINED:
				return getUserDefined() != null;
			case TextPackage.RUBY_BASE_TYPE__PRINT_TIME:
				return getPrintTime() != null;
			case TextPackage.RUBY_BASE_TYPE__PRINT_DATE:
				return getPrintDate() != null;
			case TextPackage.RUBY_BASE_TYPE__PRINTED_BY:
				return getPrintedBy() != null;
			case TextPackage.RUBY_BASE_TYPE__TITLE:
				return getTitle() != null;
			case TextPackage.RUBY_BASE_TYPE__SUBJECT:
				return getSubject() != null;
			case TextPackage.RUBY_BASE_TYPE__KEYWORDS:
				return getKeywords() != null;
			case TextPackage.RUBY_BASE_TYPE__EDITING_CYCLES:
				return getEditingCycles() != null;
			case TextPackage.RUBY_BASE_TYPE__EDITING_DURATION:
				return getEditingDuration() != null;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_TIME:
				return getModificationTime() != null;
			case TextPackage.RUBY_BASE_TYPE__MODIFICATION_DATE:
				return getModificationDate() != null;
			case TextPackage.RUBY_BASE_TYPE__CREATOR:
				return getCreator() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_COUNT:
				return getPageCount() != null;
			case TextPackage.RUBY_BASE_TYPE__PARAGRAPH_COUNT:
				return getParagraphCount() != null;
			case TextPackage.RUBY_BASE_TYPE__WORD_COUNT:
				return getWordCount() != null;
			case TextPackage.RUBY_BASE_TYPE__CHARACTER_COUNT:
				return getCharacterCount() != null;
			case TextPackage.RUBY_BASE_TYPE__TABLE_COUNT:
				return getTableCount() != null;
			case TextPackage.RUBY_BASE_TYPE__IMAGE_COUNT:
				return getImageCount() != null;
			case TextPackage.RUBY_BASE_TYPE__OBJECT_COUNT:
				return getObjectCount() != null;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_DISPLAY:
				return getDatabaseDisplay() != null;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NEXT:
				return getDatabaseNext() != null;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect() != null;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber() != null;
			case TextPackage.RUBY_BASE_TYPE__DATABASE_NAME:
				return getDatabaseName() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_SET:
				return getPageVariableSet() != null;
			case TextPackage.RUBY_BASE_TYPE__PAGE_VARIABLE_GET:
				return getPageVariableGet() != null;
			case TextPackage.RUBY_BASE_TYPE__PLACEHOLDER:
				return getPlaceholder() != null;
			case TextPackage.RUBY_BASE_TYPE__CONDITIONAL_TEXT:
				return getConditionalText() != null;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_TEXT:
				return getHiddenText() != null;
			case TextPackage.RUBY_BASE_TYPE__REFERENCE_REF:
				return getReferenceRef() != null;
			case TextPackage.RUBY_BASE_TYPE__BOOKMARK_REF:
				return getBookmarkRef() != null;
			case TextPackage.RUBY_BASE_TYPE__NOTE_REF:
				return getNoteRef() != null;
			case TextPackage.RUBY_BASE_TYPE__SEQUENCE_REF:
				return getSequenceRef() != null;
			case TextPackage.RUBY_BASE_TYPE__SCRIPT:
				return getScript() != null;
			case TextPackage.RUBY_BASE_TYPE__EXECUTE_MACRO:
				return getExecuteMacro() != null;
			case TextPackage.RUBY_BASE_TYPE__HIDDEN_PARAGRAPH:
				return getHiddenParagraph() != null;
			case TextPackage.RUBY_BASE_TYPE__DDE_CONNECTION:
				return getDdeConnection() != null;
			case TextPackage.RUBY_BASE_TYPE__MEASURE1:
				return getMeasure1() != null;
			case TextPackage.RUBY_BASE_TYPE__TABLE_FORMULA:
				return getTableFormula() != null;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_START:
				return getTocMarkStart() != null;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK_END:
				return getTocMarkEnd() != null;
			case TextPackage.RUBY_BASE_TYPE__TOC_MARK:
				return getTocMark() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_START:
				return getUserIndexMarkStart() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd() != null;
			case TextPackage.RUBY_BASE_TYPE__USER_INDEX_MARK:
				return getUserIndexMark() != null;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart() != null;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd() != null;
			case TextPackage.RUBY_BASE_TYPE__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark() != null;
			case TextPackage.RUBY_BASE_TYPE__BIBLIOGRAPHY_MARK:
				return getBibliographyMark() != null;
			case TextPackage.RUBY_BASE_TYPE__HEADER:
				return getHeader() != null;
			case TextPackage.RUBY_BASE_TYPE__FOOTER:
				return getFooter() != null;
			case TextPackage.RUBY_BASE_TYPE__DATE_TIME:
				return getDateTime() != null;
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

} //RubyBaseTypeImpl
