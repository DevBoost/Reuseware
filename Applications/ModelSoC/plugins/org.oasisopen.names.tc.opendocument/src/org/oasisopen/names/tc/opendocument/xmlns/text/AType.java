/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.ShowType2;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTargetFrameName <em>Target Frame Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getVisitedStyleName <em>Visited Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType()
 * @model extendedMetaData="name='a_._type' kind='mixed'"
 * @generated
 */
public interface AType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference.
	 * @see #setEventListeners(EventListenersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_EventListeners()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event-listeners' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	EventListenersType getEventListeners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getEventListeners <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listeners</em>' containment reference.
	 * @see #getEventListeners()
	 * @generated
	 */
	void setEventListeners(EventListenersType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_S()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='s' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Tab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tab' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_LineBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line-break' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SoftPageBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Bookmark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_BookmarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-start' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_BookmarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-end' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ReferenceMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ReferenceMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-start' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ReferenceMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-mark-end' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Ruby()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ChangeMarksGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='change-marks:group' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ChangeMarks()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Rect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Line()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Polyline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Polygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_RegularPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Path()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Circle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Ellipse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_G()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageThumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Frame()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Caption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Scene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_CustomShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_A1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Time()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-number' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageContinuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-continuation' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderFirstname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-firstname' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderLastname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-lastname' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-initials' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-title' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderPosition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-position' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderEmail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-email' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderPhonePrivate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-private' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderFax()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-fax' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderCompany()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-company' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderPhoneWork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-phone-work' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderStreet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-street' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderCity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-city' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderPostalCode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-postal-code' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderCountry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-country' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SenderStateOrProvince()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sender-state-or-province' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_AuthorName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-name' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_AuthorInitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-initials' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Chapter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_FileName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file-name' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TemplateName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template-name' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SheetName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sheet-name' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_VariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-set' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_VariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-get' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_VariableInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable-input' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserFieldGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-get' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserFieldInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-field-input' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Sequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Expression()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TextInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-input' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_InitialCreator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initial-creator' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_CreationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-date' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_CreationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-time' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserDefined()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-defined' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PrintTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-time' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PrintDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-date' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PrintedBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printed-by' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Subject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Keywords()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywords' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_EditingCycles()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-cycles' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_EditingDuration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-duration' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ModificationTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-time' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ModificationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modification-date' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Creator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ParagraphCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paragraph-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_WordCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='word-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_CharacterCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='character-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TableCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ImageCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ObjectCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-count' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DatabaseDisplay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-display' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DatabaseNext()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-next' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DatabaseRowSelect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-select' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DatabaseRowNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-row-number' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DatabaseName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-name' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageVariableSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-set' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_PageVariableGet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-variable-get' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Placeholder()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='placeholder' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ConditionalText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conditional-text' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_HiddenText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-text' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ReferenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference-ref' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_BookmarkRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookmark-ref' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_NoteRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note-ref' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_SequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence-ref' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_ExecuteMacro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='execute-macro' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_HiddenParagraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden-paragraph' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DdeConnection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dde-connection' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Measure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TableFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-formula' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TocMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-start' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TocMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark-end' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TocMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc-mark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-start' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark-end' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_UserIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index-mark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_AlphabeticalIndexMarkStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-start' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_AlphabeticalIndexMarkEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark-end' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_AlphabeticalIndexMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-mark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_BibliographyMark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography-mark' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Header()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Footer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:2'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_DateTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-time' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:2'"
	 * @generated
	 */
	EList<DateTimeType> getDateTime();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType1 getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ShowType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType2
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType2)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Show()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType2 getShow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType2
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType2 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType2)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType2)
	 * @generated
	 */
	boolean isSetShow();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Frame Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Frame Name</em>' attribute.
	 * @see #setTargetFrameName(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_TargetFrameName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TargetFrameName"
	 *        extendedMetaData="kind='attribute' name='target-frame-name' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	Object getTargetFrameName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTargetFrameName <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Frame Name</em>' attribute.
	 * @see #getTargetFrameName()
	 * @generated
	 */
	void setTargetFrameName(Object value);

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' attribute.
	 * @see #setTitle1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Title1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getTitle1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getTitle1 <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title1</em>' attribute.
	 * @see #getTitle1()
	 * @generated
	 */
	void setTitle1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Visited Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited Style Name</em>' attribute.
	 * @see #setVisitedStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAType_VisitedStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.VisitedStyleNameType"
	 *        extendedMetaData="kind='attribute' name='visited-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisitedStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType#getVisitedStyleName <em>Visited Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited Style Name</em>' attribute.
	 * @see #getVisitedStyleName()
	 * @generated
	 */
	void setVisitedStyleName(String value);

} // AType
