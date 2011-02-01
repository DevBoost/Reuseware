/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.util.List;

import org.eclipse.emf.common.util.EList;
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
 * A representation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCondStyleName <em>Cond Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType()
 * @model extendedMetaData="name='p_._type' kind='mixed'"
 * @generated
 */
public interface PType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_S()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='s' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SType> getS();

	/**
	 * Returns the value of the '<em><b>Tab</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TabType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Tab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tab' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TabType> getTab();

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_LineBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line-break' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LineBreakType> getLineBreak();

	/**
	 * Returns the value of the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SoftPageBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SoftPageBreakType> getSoftPageBreak();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AType> getA();

	/**
	 * Returns the value of the '<em><b>Bookmark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Bookmark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BookmarkType> getBookmark();

	/**
	 * Returns the value of the '<em><b>Bookmark Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkStartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark Start</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_BookmarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-start' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BookmarkStartType> getBookmarkStart();

	/**
	 * Returns the value of the '<em><b>Bookmark End</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkEndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark End</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_BookmarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-end' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BookmarkEndType> getBookmarkEnd();

	/**
	 * Returns the value of the '<em><b>Reference Mark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ReferenceMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReferenceMarkType> getReferenceMark();

	/**
	 * Returns the value of the '<em><b>Reference Mark Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkStartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark Start</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ReferenceMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-start' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReferenceMarkStartType> getReferenceMarkStart();

	/**
	 * Returns the value of the '<em><b>Reference Mark End</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkEndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mark End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mark End</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ReferenceMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-end' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReferenceMarkEndType> getReferenceMarkEnd();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<NoteType> getNote();

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Ruby()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RubyType> getRuby();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0' group='#group:1'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ChangeMarksGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='change-marks:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getChangeMarksGroup();

	/**
	 * Returns the value of the '<em><b>Change Marks</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ChangeMarks()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-marks' namespace='##targetNamespace' group='change-marks:group'"
	 * @generated
	 */
	EList<ChangeMarksType> getChangeMarks();

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Rect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<RectType> getRect();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Line()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<LineType> getLine();

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Polyline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<PolylineType> getPolyline();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Polygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<PolygonType> getPolygon();

	/**
	 * Returns the value of the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_RegularPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<RegularPolygonType> getRegularPolygon();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Path()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<PathType> getPath();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Circle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<CircleType> getCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Ellipse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<EllipseType> getEllipse();

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_G()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<GType> getG();

	/**
	 * Returns the value of the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Thumbnail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Thumbnail</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageThumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<PageThumbnailType> getPageThumbnail();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Frame()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<FrameType> getFrame();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<MeasureType> getMeasure();

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Caption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<CaptionType> getCaption();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<ControlType> getControl();

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Scene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0' group='#group:1'"
	 * @generated
	 */
	EList<SceneType> getScene();

	/**
	 * Returns the value of the '<em><b>Custom Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Shape</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_CustomShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<CustomShapeType> getCustomShape();

	/**
	 * Returns the value of the '<em><b>A1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_A1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:1'"
	 * @generated
	 */
	EList<org.oasisopen.names.tc.opendocument.xmlns.drawing.AType> getA1();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DateType> getDate();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Time()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TimeType> getTime();

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageNumberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-number' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PageNumberType> getPageNumber();

	/**
	 * Returns the value of the '<em><b>Page Continuation</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Continuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Continuation</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageContinuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-continuation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PageContinuationType> getPageContinuation();

	/**
	 * Returns the value of the '<em><b>Sender Firstname</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderFirstnameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Firstname</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Firstname</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderFirstname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-firstname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderFirstnameType> getSenderFirstname();

	/**
	 * Returns the value of the '<em><b>Sender Lastname</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderLastnameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Lastname</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Lastname</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderLastname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-lastname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderLastnameType> getSenderLastname();

	/**
	 * Returns the value of the '<em><b>Sender Initials</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderInitialsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Initials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Initials</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-initials' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderInitialsType> getSenderInitials();

	/**
	 * Returns the value of the '<em><b>Sender Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderTitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Title</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Title</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-title' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderTitleType> getSenderTitle();

	/**
	 * Returns the value of the '<em><b>Sender Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Position</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderPosition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-position' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderPositionType> getSenderPosition();

	/**
	 * Returns the value of the '<em><b>Sender Email</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderEmailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Email</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Email</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderEmail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-email' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderEmailType> getSenderEmail();

	/**
	 * Returns the value of the '<em><b>Sender Phone Private</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhonePrivateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Phone Private</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Phone Private</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderPhonePrivate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-private' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderPhonePrivateType> getSenderPhonePrivate();

	/**
	 * Returns the value of the '<em><b>Sender Fax</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderFaxType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Fax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Fax</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderFax()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-fax' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderFaxType> getSenderFax();

	/**
	 * Returns the value of the '<em><b>Sender Company</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCompanyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Company</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Company</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderCompany()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-company' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderCompanyType> getSenderCompany();

	/**
	 * Returns the value of the '<em><b>Sender Phone Work</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhoneWorkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Phone Work</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Phone Work</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderPhoneWork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-work' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderPhoneWorkType> getSenderPhoneWork();

	/**
	 * Returns the value of the '<em><b>Sender Street</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderStreetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Street</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Street</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderStreet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-street' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderStreetType> getSenderStreet();

	/**
	 * Returns the value of the '<em><b>Sender City</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender City</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender City</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderCity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-city' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderCityType> getSenderCity();

	/**
	 * Returns the value of the '<em><b>Sender Postal Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPostalCodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Postal Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Postal Code</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderPostalCode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-postal-code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderPostalCodeType> getSenderPostalCode();

	/**
	 * Returns the value of the '<em><b>Sender Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCountryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Country</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderCountry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-country' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderCountryType> getSenderCountry();

	/**
	 * Returns the value of the '<em><b>Sender State Or Province</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderStateOrProvinceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender State Or Province</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender State Or Province</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SenderStateOrProvince()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-state-or-province' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SenderStateOrProvinceType> getSenderStateOrProvince();

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AuthorNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_AuthorName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AuthorNameType> getAuthorName();

	/**
	 * Returns the value of the '<em><b>Author Initials</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AuthorInitialsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Initials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Initials</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_AuthorInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-initials' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AuthorInitialsType> getAuthorInitials();

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ChapterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Chapter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ChapterType> getChapter();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.FileNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_FileName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file-name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FileNameType> getFileName();

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TemplateNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TemplateName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template-name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TemplateNameType> getTemplateName();

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SheetName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sheet-name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getSheetName();

	/**
	 * Returns the value of the '<em><b>Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Set</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_VariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-set' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VariableSetType> getVariableSet();

	/**
	 * Returns the value of the '<em><b>Variable Get</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableGetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Get</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Get</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_VariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-get' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VariableGetType> getVariableGet();

	/**
	 * Returns the value of the '<em><b>Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Input</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_VariableInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-input' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VariableInputType> getVariableInput();

	/**
	 * Returns the value of the '<em><b>User Field Get</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldGetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Get</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Get</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserFieldGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-get' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserFieldGetType> getUserFieldGet();

	/**
	 * Returns the value of the '<em><b>User Field Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Input</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserFieldInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-input' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserFieldInputType> getUserFieldInput();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Sequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SequenceType> getSequence();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Expression()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ExpressionType> getExpression();

	/**
	 * Returns the value of the '<em><b>Text Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Input</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TextInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-input' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TextInputType> getTextInput();

	/**
	 * Returns the value of the '<em><b>Initial Creator</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.InitialCreatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Creator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Creator</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_InitialCreator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initial-creator' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InitialCreatorType> getInitialCreator();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.CreationDateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_CreationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-date' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CreationDateType> getCreationDate();

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.CreationTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_CreationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-time' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CreationTimeType> getCreationTime();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserDefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserDefined()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-defined' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserDefinedType> getUserDefined();

	/**
	 * Returns the value of the '<em><b>Print Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Time</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PrintTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-time' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PrintTimeType> getPrintTime();

	/**
	 * Returns the value of the '<em><b>Print Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintDateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Date</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PrintDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-date' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PrintDateType> getPrintDate();

	/**
	 * Returns the value of the '<em><b>Printed By</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintedByType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printed By</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PrintedBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printed-by' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PrintedByType> getPrintedBy();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SubjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Subject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubjectType> getSubject();

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.KeywordsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Keywords()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywords' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeywordsType> getKeywords();

	/**
	 * Returns the value of the '<em><b>Editing Cycles</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingCyclesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Cycles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Cycles</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_EditingCycles()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-cycles' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EditingCyclesType> getEditingCycles();

	/**
	 * Returns the value of the '<em><b>Editing Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Duration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Duration</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_EditingDuration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-duration' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EditingDurationType> getEditingDuration();

	/**
	 * Returns the value of the '<em><b>Modification Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ModificationTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Time</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ModificationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-time' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModificationTimeType> getModificationTime();

	/**
	 * Returns the value of the '<em><b>Modification Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ModificationDateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ModificationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-date' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModificationDateType> getModificationDate();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.CreatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Creator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CreatorType> getCreator();

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PageCountType> getPageCount();

	/**
	 * Returns the value of the '<em><b>Paragraph Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ParagraphCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ParagraphCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paragraph-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ParagraphCountType> getParagraphCount();

	/**
	 * Returns the value of the '<em><b>Word Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.WordCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_WordCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='word-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<WordCountType> getWordCount();

	/**
	 * Returns the value of the '<em><b>Character Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.CharacterCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_CharacterCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='character-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CharacterCountType> getCharacterCount();

	/**
	 * Returns the value of the '<em><b>Table Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TableCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TableCountType> getTableCount();

	/**
	 * Returns the value of the '<em><b>Image Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ImageCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ImageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImageCountType> getImageCount();

	/**
	 * Returns the value of the '<em><b>Object Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Count</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ObjectCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-count' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ObjectCountType> getObjectCount();

	/**
	 * Returns the value of the '<em><b>Database Display</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseDisplayAttlist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Display</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Display</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DatabaseDisplay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-display' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TextDatabaseDisplayAttlist> getDatabaseDisplay();

	/**
	 * Returns the value of the '<em><b>Database Next</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseNextAttlist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Next</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Next</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DatabaseNext()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-next' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TextDatabaseNextAttlist> getDatabaseNext();

	/**
	 * Returns the value of the '<em><b>Database Row Select</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Row Select</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Row Select</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DatabaseRowSelect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-select' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TextDatabaseRowSelectAttlist> getDatabaseRowSelect();

	/**
	 * Returns the value of the '<em><b>Database Row Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Row Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Row Number</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DatabaseRowNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-number' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DatabaseRowNumberType> getDatabaseRowNumber();

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DatabaseName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DatabaseNameType> getDatabaseName();

	/**
	 * Returns the value of the '<em><b>Page Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Variable Set</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageVariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-set' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PageVariableSetType> getPageVariableSet();

	/**
	 * Returns the value of the '<em><b>Page Variable Get</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableGetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Variable Get</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Variable Get</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_PageVariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-get' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PageVariableGetType> getPageVariableGet();

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Placeholder()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='placeholder' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PlaceholderType> getPlaceholder();

	/**
	 * Returns the value of the '<em><b>Conditional Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Text</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ConditionalText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conditional-text' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ConditionalTextType> getConditionalText();

	/**
	 * Returns the value of the '<em><b>Hidden Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.HiddenTextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Text</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_HiddenText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-text' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<HiddenTextType> getHiddenText();

	/**
	 * Returns the value of the '<em><b>Reference Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Ref</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ReferenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-ref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReferenceRefType> getReferenceRef();

	/**
	 * Returns the value of the '<em><b>Bookmark Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark Ref</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_BookmarkRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-ref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BookmarkRefType> getBookmarkRef();

	/**
	 * Returns the value of the '<em><b>Note Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Ref</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_NoteRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note-ref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<NoteRefType> getNoteRef();

	/**
	 * Returns the value of the '<em><b>Sequence Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Ref</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_SequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence-ref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SequenceRefType> getSequenceRef();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ScriptType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ScriptType> getScript();

	/**
	 * Returns the value of the '<em><b>Execute Macro</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ExecuteMacroType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Macro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Macro</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ExecuteMacro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='execute-macro' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ExecuteMacroType> getExecuteMacro();

	/**
	 * Returns the value of the '<em><b>Hidden Paragraph</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.HiddenParagraphType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Paragraph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Paragraph</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_HiddenParagraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-paragraph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<HiddenParagraphType> getHiddenParagraph();

	/**
	 * Returns the value of the '<em><b>Dde Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Connection</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DdeConnection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dde-connection' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DdeConnectionType> getDdeConnection();

	/**
	 * Returns the value of the '<em><b>Measure1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Measure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType> getMeasure1();

	/**
	 * Returns the value of the '<em><b>Table Formula</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableFormulaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Formula</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Formula</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TableFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-formula' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TableFormulaType> getTableFormula();

	/**
	 * Returns the value of the '<em><b>Toc Mark Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkStartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark Start</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TocMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-start' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TocMarkStartType> getTocMarkStart();

	/**
	 * Returns the value of the '<em><b>Toc Mark End</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkEndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark End</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TocMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-end' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TocMarkEndType> getTocMarkEnd();

	/**
	 * Returns the value of the '<em><b>Toc Mark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc Mark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_TocMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TocMarkType> getTocMark();

	/**
	 * Returns the value of the '<em><b>User Index Mark Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkStartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark Start</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-start' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserIndexMarkStartType> getUserIndexMarkStart();

	/**
	 * Returns the value of the '<em><b>User Index Mark End</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkEndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark End</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-end' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserIndexMarkEndType> getUserIndexMarkEnd();

	/**
	 * Returns the value of the '<em><b>User Index Mark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Mark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_UserIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserIndexMarkType> getUserIndexMark();

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkStartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark Start</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_AlphabeticalIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-start' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AlphabeticalIndexMarkStartType> getAlphabeticalIndexMarkStart();

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark End</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkEndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark End</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_AlphabeticalIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-end' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AlphabeticalIndexMarkEndType> getAlphabeticalIndexMarkEnd();

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Mark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Mark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_AlphabeticalIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AlphabeticalIndexMarkType> getAlphabeticalIndexMark();

	/**
	 * Returns the value of the '<em><b>Bibliography Mark</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyMarkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Mark</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_BibliographyMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography-mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BibliographyMarkType> getBibliographyMark();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Header()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:1'"
	 * @generated
	 */
	EList<HeaderType> getHeader();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Footer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:1'"
	 * @generated
	 */
	EList<FooterType> getFooter();

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_DateTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-time' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:1'"
	 * @generated
	 */
	EList<DateTimeType> getDateTime();

	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute.
	 * @see #setClassNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Cond Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Style Name</em>' attribute.
	 * @see #setCondStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_CondStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CondStyleNameType"
	 *        extendedMetaData="kind='attribute' name='cond-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getCondStyleName <em>Cond Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Style Name</em>' attribute.
	 * @see #getCondStyleName()
	 * @generated
	 */
	void setCondStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType24"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // PType
