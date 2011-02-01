/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.ShowType2;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTargetFrameName <em>Target Frame Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ATypeImpl#getVisitedStyleName <em>Visited Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATypeImpl extends EObjectImpl implements AType {
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
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType1 ACTUATE_EDEFAULT = ActuateType1.ON_REQUEST;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType1 actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType2 SHOW_EDEFAULT = ShowType2.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType2 show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

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
	 * The default value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_FRAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected Object targetFrameName = TARGET_FRAME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected String title1 = TITLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getVisitedStyleName() <em>Visited Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String VISITED_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitedStyleName() <em>Visited Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedStyleName()
	 * @generated
	 * @ordered
	 */
	protected String visitedStyleName = VISITED_STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.ATYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType getEventListeners() {
		return (EventListenersType)getMixed().get(TextPackage.eINSTANCE.getAType_EventListeners(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListeners(EventListenersType newEventListeners, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getAType_EventListeners(), newEventListeners, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListeners(EventListenersType newEventListeners) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getAType_EventListeners(), newEventListeners);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getAType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SType> getS() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_S());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabType> getTab() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Tab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineBreakType> getLineBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_LineBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkType> getBookmark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Bookmark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkStartType> getBookmarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_BookmarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkEndType> getBookmarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_BookmarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkType> getReferenceMark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ReferenceMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkStartType> getReferenceMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ReferenceMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkEndType> getReferenceMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ReferenceMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RubyType> getRuby() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getAType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getAType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.drawing.AType> getA1() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_A1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDate() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeType> getTime() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Time());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageNumberType> getPageNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContinuationType> getPageContinuation() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageContinuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFirstnameType> getSenderFirstname() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderFirstname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderLastnameType> getSenderLastname() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderLastname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderInitialsType> getSenderInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderTitleType> getSenderTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPositionType> getSenderPosition() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderEmailType> getSenderEmail() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderEmail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhonePrivateType> getSenderPhonePrivate() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderPhonePrivate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFaxType> getSenderFax() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderFax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCompanyType> getSenderCompany() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderCompany());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhoneWorkType> getSenderPhoneWork() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderPhoneWork());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStreetType> getSenderStreet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderStreet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCityType> getSenderCity() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderCity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPostalCodeType> getSenderPostalCode() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderPostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCountryType> getSenderCountry() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStateOrProvinceType> getSenderStateOrProvince() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SenderStateOrProvince());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorNameType> getAuthorName() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_AuthorName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorInitialsType> getAuthorInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_AuthorInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChapterType> getChapter() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Chapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileNameType> getFileName() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_FileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateNameType> getTemplateName() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TemplateName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSheetName() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SheetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableSetType> getVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_VariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableGetType> getVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_VariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableInputType> getVariableInput() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_VariableInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldGetType> getUserFieldGet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserFieldGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldInputType> getUserFieldInput() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserFieldInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequence() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Sequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionType> getExpression() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Expression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextInputType> getTextInput() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TextInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialCreatorType> getInitialCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_InitialCreator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationDateType> getCreationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_CreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationTimeType> getCreationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_CreationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserDefinedType> getUserDefined() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserDefined());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintTimeType> getPrintTime() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PrintTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintDateType> getPrintDate() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PrintDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintedByType> getPrintedBy() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PrintedBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectType> getSubject() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordsType> getKeywords() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Keywords());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingCyclesType> getEditingCycles() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_EditingCycles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingDurationType> getEditingDuration() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_EditingDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationTimeType> getModificationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ModificationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationDateType> getModificationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ModificationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreatorType> getCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Creator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageCountType> getPageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParagraphCountType> getParagraphCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ParagraphCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WordCountType> getWordCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_WordCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacterCountType> getCharacterCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_CharacterCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCountType> getTableCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TableCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageCountType> getImageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ImageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectCountType> getObjectCount() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ObjectCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseDisplayAttlist> getDatabaseDisplay() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DatabaseDisplay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseNextAttlist> getDatabaseNext() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DatabaseNext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseRowSelectAttlist> getDatabaseRowSelect() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DatabaseRowSelect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseRowNumberType> getDatabaseRowNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DatabaseRowNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseNameType> getDatabaseName() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DatabaseName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableSetType> getPageVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageVariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableGetType> getPageVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_PageVariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceholderType> getPlaceholder() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Placeholder());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalTextType> getConditionalText() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ConditionalText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenTextType> getHiddenText() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_HiddenText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRefType> getReferenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ReferenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkRefType> getBookmarkRef() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_BookmarkRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteRefType> getNoteRef() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_NoteRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRefType> getSequenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_SequenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteMacroType> getExecuteMacro() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_ExecuteMacro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenParagraphType> getHiddenParagraph() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_HiddenParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdeConnectionType> getDdeConnection() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DdeConnection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType> getMeasure1() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Measure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableFormulaType> getTableFormula() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TableFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkStartType> getTocMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TocMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkEndType> getTocMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TocMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkType> getTocMark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_TocMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkStartType> getUserIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkEndType> getUserIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkType> getUserIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_UserIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkStartType> getAlphabeticalIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_AlphabeticalIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkEndType> getAlphabeticalIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_AlphabeticalIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkType> getAlphabeticalIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_AlphabeticalIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyMarkType> getBibliographyMark() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_BibliographyMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderType> getHeader() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Header());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FooterType> getFooter() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_Footer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTimeType> getDateTime() {
		return getGroup().list(TextPackage.eINSTANCE.getAType_DateTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType1 newActuate) {
		ActuateType1 oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType1 oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ATYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__HREF, oldHref, href));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType2 getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType2 newShow) {
		ShowType2 oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType2 oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ATYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetFrameName() {
		return targetFrameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrameName(Object newTargetFrameName) {
		Object oldTargetFrameName = targetFrameName;
		targetFrameName = newTargetFrameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__TARGET_FRAME_NAME, oldTargetFrameName, targetFrameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle1(String newTitle1) {
		String oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ATYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisitedStyleName() {
		return visitedStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitedStyleName(String newVisitedStyleName) {
		String oldVisitedStyleName = visitedStyleName;
		visitedStyleName = newVisitedStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ATYPE__VISITED_STYLE_NAME, oldVisitedStyleName, visitedStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.ATYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
			case TextPackage.ATYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TAB:
				return ((InternalEList<?>)getTab()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__LINE_BREAK:
				return ((InternalEList<?>)getLineBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__BOOKMARK:
				return ((InternalEList<?>)getBookmark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__BOOKMARK_START:
				return ((InternalEList<?>)getBookmarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__BOOKMARK_END:
				return ((InternalEList<?>)getBookmarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__REFERENCE_MARK:
				return ((InternalEList<?>)getReferenceMark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__REFERENCE_MARK_START:
				return ((InternalEList<?>)getReferenceMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__REFERENCE_MARK_END:
				return ((InternalEList<?>)getReferenceMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__A1:
				return ((InternalEList<?>)getA1()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_NUMBER:
				return ((InternalEList<?>)getPageNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_CONTINUATION:
				return ((InternalEList<?>)getPageContinuation()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_FIRSTNAME:
				return ((InternalEList<?>)getSenderFirstname()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_LASTNAME:
				return ((InternalEList<?>)getSenderLastname()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_INITIALS:
				return ((InternalEList<?>)getSenderInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_TITLE:
				return ((InternalEList<?>)getSenderTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_POSITION:
				return ((InternalEList<?>)getSenderPosition()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_EMAIL:
				return ((InternalEList<?>)getSenderEmail()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_PHONE_PRIVATE:
				return ((InternalEList<?>)getSenderPhonePrivate()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_FAX:
				return ((InternalEList<?>)getSenderFax()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_COMPANY:
				return ((InternalEList<?>)getSenderCompany()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_PHONE_WORK:
				return ((InternalEList<?>)getSenderPhoneWork()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_STREET:
				return ((InternalEList<?>)getSenderStreet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_CITY:
				return ((InternalEList<?>)getSenderCity()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_POSTAL_CODE:
				return ((InternalEList<?>)getSenderPostalCode()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_COUNTRY:
				return ((InternalEList<?>)getSenderCountry()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SENDER_STATE_OR_PROVINCE:
				return ((InternalEList<?>)getSenderStateOrProvince()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__AUTHOR_NAME:
				return ((InternalEList<?>)getAuthorName()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__AUTHOR_INITIALS:
				return ((InternalEList<?>)getAuthorInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CHAPTER:
				return ((InternalEList<?>)getChapter()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__FILE_NAME:
				return ((InternalEList<?>)getFileName()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TEMPLATE_NAME:
				return ((InternalEList<?>)getTemplateName()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__VARIABLE_SET:
				return ((InternalEList<?>)getVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__VARIABLE_GET:
				return ((InternalEList<?>)getVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__VARIABLE_INPUT:
				return ((InternalEList<?>)getVariableInput()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_FIELD_GET:
				return ((InternalEList<?>)getUserFieldGet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_FIELD_INPUT:
				return ((InternalEList<?>)getUserFieldInput()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TEXT_INPUT:
				return ((InternalEList<?>)getTextInput()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__INITIAL_CREATOR:
				return ((InternalEList<?>)getInitialCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CREATION_DATE:
				return ((InternalEList<?>)getCreationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CREATION_TIME:
				return ((InternalEList<?>)getCreationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_DEFINED:
				return ((InternalEList<?>)getUserDefined()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PRINT_TIME:
				return ((InternalEList<?>)getPrintTime()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PRINT_DATE:
				return ((InternalEList<?>)getPrintDate()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PRINTED_BY:
				return ((InternalEList<?>)getPrintedBy()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__KEYWORDS:
				return ((InternalEList<?>)getKeywords()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__EDITING_CYCLES:
				return ((InternalEList<?>)getEditingCycles()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__EDITING_DURATION:
				return ((InternalEList<?>)getEditingDuration()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__MODIFICATION_TIME:
				return ((InternalEList<?>)getModificationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__MODIFICATION_DATE:
				return ((InternalEList<?>)getModificationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CREATOR:
				return ((InternalEList<?>)getCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_COUNT:
				return ((InternalEList<?>)getPageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PARAGRAPH_COUNT:
				return ((InternalEList<?>)getParagraphCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__WORD_COUNT:
				return ((InternalEList<?>)getWordCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CHARACTER_COUNT:
				return ((InternalEList<?>)getCharacterCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TABLE_COUNT:
				return ((InternalEList<?>)getTableCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__IMAGE_COUNT:
				return ((InternalEList<?>)getImageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__OBJECT_COUNT:
				return ((InternalEList<?>)getObjectCount()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATABASE_DISPLAY:
				return ((InternalEList<?>)getDatabaseDisplay()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATABASE_NEXT:
				return ((InternalEList<?>)getDatabaseNext()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATABASE_ROW_SELECT:
				return ((InternalEList<?>)getDatabaseRowSelect()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATABASE_ROW_NUMBER:
				return ((InternalEList<?>)getDatabaseRowNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATABASE_NAME:
				return ((InternalEList<?>)getDatabaseName()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_VARIABLE_SET:
				return ((InternalEList<?>)getPageVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PAGE_VARIABLE_GET:
				return ((InternalEList<?>)getPageVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__PLACEHOLDER:
				return ((InternalEList<?>)getPlaceholder()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__CONDITIONAL_TEXT:
				return ((InternalEList<?>)getConditionalText()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__HIDDEN_TEXT:
				return ((InternalEList<?>)getHiddenText()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__REFERENCE_REF:
				return ((InternalEList<?>)getReferenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__BOOKMARK_REF:
				return ((InternalEList<?>)getBookmarkRef()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__NOTE_REF:
				return ((InternalEList<?>)getNoteRef()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SEQUENCE_REF:
				return ((InternalEList<?>)getSequenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__EXECUTE_MACRO:
				return ((InternalEList<?>)getExecuteMacro()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__HIDDEN_PARAGRAPH:
				return ((InternalEList<?>)getHiddenParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DDE_CONNECTION:
				return ((InternalEList<?>)getDdeConnection()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__MEASURE1:
				return ((InternalEList<?>)getMeasure1()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TABLE_FORMULA:
				return ((InternalEList<?>)getTableFormula()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TOC_MARK_START:
				return ((InternalEList<?>)getTocMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TOC_MARK_END:
				return ((InternalEList<?>)getTocMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__TOC_MARK:
				return ((InternalEList<?>)getTocMark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_INDEX_MARK_START:
				return ((InternalEList<?>)getUserIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_INDEX_MARK_END:
				return ((InternalEList<?>)getUserIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__USER_INDEX_MARK:
				return ((InternalEList<?>)getUserIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_START:
				return ((InternalEList<?>)getAlphabeticalIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_END:
				return ((InternalEList<?>)getAlphabeticalIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK:
				return ((InternalEList<?>)getAlphabeticalIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__BIBLIOGRAPHY_MARK:
				return ((InternalEList<?>)getBibliographyMark()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
			case TextPackage.ATYPE__DATE_TIME:
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
			case TextPackage.ATYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.ATYPE__EVENT_LISTENERS:
				return getEventListeners();
			case TextPackage.ATYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.ATYPE__S:
				return getS();
			case TextPackage.ATYPE__TAB:
				return getTab();
			case TextPackage.ATYPE__LINE_BREAK:
				return getLineBreak();
			case TextPackage.ATYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.ATYPE__SPAN:
				return getSpan();
			case TextPackage.ATYPE__A:
				return getA();
			case TextPackage.ATYPE__BOOKMARK:
				return getBookmark();
			case TextPackage.ATYPE__BOOKMARK_START:
				return getBookmarkStart();
			case TextPackage.ATYPE__BOOKMARK_END:
				return getBookmarkEnd();
			case TextPackage.ATYPE__REFERENCE_MARK:
				return getReferenceMark();
			case TextPackage.ATYPE__REFERENCE_MARK_START:
				return getReferenceMarkStart();
			case TextPackage.ATYPE__REFERENCE_MARK_END:
				return getReferenceMarkEnd();
			case TextPackage.ATYPE__NOTE:
				return getNote();
			case TextPackage.ATYPE__RUBY:
				return getRuby();
			case TextPackage.ATYPE__ANNOTATION:
				return getAnnotation();
			case TextPackage.ATYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.ATYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.ATYPE__RECT:
				return getRect();
			case TextPackage.ATYPE__LINE:
				return getLine();
			case TextPackage.ATYPE__POLYLINE:
				return getPolyline();
			case TextPackage.ATYPE__POLYGON:
				return getPolygon();
			case TextPackage.ATYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.ATYPE__PATH:
				return getPath();
			case TextPackage.ATYPE__CIRCLE:
				return getCircle();
			case TextPackage.ATYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.ATYPE__G:
				return getG();
			case TextPackage.ATYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.ATYPE__FRAME:
				return getFrame();
			case TextPackage.ATYPE__MEASURE:
				return getMeasure();
			case TextPackage.ATYPE__CAPTION:
				return getCaption();
			case TextPackage.ATYPE__CONNECTOR:
				return getConnector();
			case TextPackage.ATYPE__CONTROL:
				return getControl();
			case TextPackage.ATYPE__SCENE:
				return getScene();
			case TextPackage.ATYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.ATYPE__A1:
				return getA1();
			case TextPackage.ATYPE__DATE:
				return getDate();
			case TextPackage.ATYPE__TIME:
				return getTime();
			case TextPackage.ATYPE__PAGE_NUMBER:
				return getPageNumber();
			case TextPackage.ATYPE__PAGE_CONTINUATION:
				return getPageContinuation();
			case TextPackage.ATYPE__SENDER_FIRSTNAME:
				return getSenderFirstname();
			case TextPackage.ATYPE__SENDER_LASTNAME:
				return getSenderLastname();
			case TextPackage.ATYPE__SENDER_INITIALS:
				return getSenderInitials();
			case TextPackage.ATYPE__SENDER_TITLE:
				return getSenderTitle();
			case TextPackage.ATYPE__SENDER_POSITION:
				return getSenderPosition();
			case TextPackage.ATYPE__SENDER_EMAIL:
				return getSenderEmail();
			case TextPackage.ATYPE__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate();
			case TextPackage.ATYPE__SENDER_FAX:
				return getSenderFax();
			case TextPackage.ATYPE__SENDER_COMPANY:
				return getSenderCompany();
			case TextPackage.ATYPE__SENDER_PHONE_WORK:
				return getSenderPhoneWork();
			case TextPackage.ATYPE__SENDER_STREET:
				return getSenderStreet();
			case TextPackage.ATYPE__SENDER_CITY:
				return getSenderCity();
			case TextPackage.ATYPE__SENDER_POSTAL_CODE:
				return getSenderPostalCode();
			case TextPackage.ATYPE__SENDER_COUNTRY:
				return getSenderCountry();
			case TextPackage.ATYPE__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince();
			case TextPackage.ATYPE__AUTHOR_NAME:
				return getAuthorName();
			case TextPackage.ATYPE__AUTHOR_INITIALS:
				return getAuthorInitials();
			case TextPackage.ATYPE__CHAPTER:
				return getChapter();
			case TextPackage.ATYPE__FILE_NAME:
				return getFileName();
			case TextPackage.ATYPE__TEMPLATE_NAME:
				return getTemplateName();
			case TextPackage.ATYPE__SHEET_NAME:
				return getSheetName();
			case TextPackage.ATYPE__VARIABLE_SET:
				return getVariableSet();
			case TextPackage.ATYPE__VARIABLE_GET:
				return getVariableGet();
			case TextPackage.ATYPE__VARIABLE_INPUT:
				return getVariableInput();
			case TextPackage.ATYPE__USER_FIELD_GET:
				return getUserFieldGet();
			case TextPackage.ATYPE__USER_FIELD_INPUT:
				return getUserFieldInput();
			case TextPackage.ATYPE__SEQUENCE:
				return getSequence();
			case TextPackage.ATYPE__EXPRESSION:
				return getExpression();
			case TextPackage.ATYPE__TEXT_INPUT:
				return getTextInput();
			case TextPackage.ATYPE__INITIAL_CREATOR:
				return getInitialCreator();
			case TextPackage.ATYPE__CREATION_DATE:
				return getCreationDate();
			case TextPackage.ATYPE__CREATION_TIME:
				return getCreationTime();
			case TextPackage.ATYPE__DESCRIPTION:
				return getDescription();
			case TextPackage.ATYPE__USER_DEFINED:
				return getUserDefined();
			case TextPackage.ATYPE__PRINT_TIME:
				return getPrintTime();
			case TextPackage.ATYPE__PRINT_DATE:
				return getPrintDate();
			case TextPackage.ATYPE__PRINTED_BY:
				return getPrintedBy();
			case TextPackage.ATYPE__TITLE:
				return getTitle();
			case TextPackage.ATYPE__SUBJECT:
				return getSubject();
			case TextPackage.ATYPE__KEYWORDS:
				return getKeywords();
			case TextPackage.ATYPE__EDITING_CYCLES:
				return getEditingCycles();
			case TextPackage.ATYPE__EDITING_DURATION:
				return getEditingDuration();
			case TextPackage.ATYPE__MODIFICATION_TIME:
				return getModificationTime();
			case TextPackage.ATYPE__MODIFICATION_DATE:
				return getModificationDate();
			case TextPackage.ATYPE__CREATOR:
				return getCreator();
			case TextPackage.ATYPE__PAGE_COUNT:
				return getPageCount();
			case TextPackage.ATYPE__PARAGRAPH_COUNT:
				return getParagraphCount();
			case TextPackage.ATYPE__WORD_COUNT:
				return getWordCount();
			case TextPackage.ATYPE__CHARACTER_COUNT:
				return getCharacterCount();
			case TextPackage.ATYPE__TABLE_COUNT:
				return getTableCount();
			case TextPackage.ATYPE__IMAGE_COUNT:
				return getImageCount();
			case TextPackage.ATYPE__OBJECT_COUNT:
				return getObjectCount();
			case TextPackage.ATYPE__DATABASE_DISPLAY:
				return getDatabaseDisplay();
			case TextPackage.ATYPE__DATABASE_NEXT:
				return getDatabaseNext();
			case TextPackage.ATYPE__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect();
			case TextPackage.ATYPE__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber();
			case TextPackage.ATYPE__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.ATYPE__PAGE_VARIABLE_SET:
				return getPageVariableSet();
			case TextPackage.ATYPE__PAGE_VARIABLE_GET:
				return getPageVariableGet();
			case TextPackage.ATYPE__PLACEHOLDER:
				return getPlaceholder();
			case TextPackage.ATYPE__CONDITIONAL_TEXT:
				return getConditionalText();
			case TextPackage.ATYPE__HIDDEN_TEXT:
				return getHiddenText();
			case TextPackage.ATYPE__REFERENCE_REF:
				return getReferenceRef();
			case TextPackage.ATYPE__BOOKMARK_REF:
				return getBookmarkRef();
			case TextPackage.ATYPE__NOTE_REF:
				return getNoteRef();
			case TextPackage.ATYPE__SEQUENCE_REF:
				return getSequenceRef();
			case TextPackage.ATYPE__SCRIPT:
				return getScript();
			case TextPackage.ATYPE__EXECUTE_MACRO:
				return getExecuteMacro();
			case TextPackage.ATYPE__HIDDEN_PARAGRAPH:
				return getHiddenParagraph();
			case TextPackage.ATYPE__DDE_CONNECTION:
				return getDdeConnection();
			case TextPackage.ATYPE__MEASURE1:
				return getMeasure1();
			case TextPackage.ATYPE__TABLE_FORMULA:
				return getTableFormula();
			case TextPackage.ATYPE__TOC_MARK_START:
				return getTocMarkStart();
			case TextPackage.ATYPE__TOC_MARK_END:
				return getTocMarkEnd();
			case TextPackage.ATYPE__TOC_MARK:
				return getTocMark();
			case TextPackage.ATYPE__USER_INDEX_MARK_START:
				return getUserIndexMarkStart();
			case TextPackage.ATYPE__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd();
			case TextPackage.ATYPE__USER_INDEX_MARK:
				return getUserIndexMark();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark();
			case TextPackage.ATYPE__BIBLIOGRAPHY_MARK:
				return getBibliographyMark();
			case TextPackage.ATYPE__HEADER:
				return getHeader();
			case TextPackage.ATYPE__FOOTER:
				return getFooter();
			case TextPackage.ATYPE__DATE_TIME:
				return getDateTime();
			case TextPackage.ATYPE__ACTUATE:
				return getActuate();
			case TextPackage.ATYPE__HREF:
				return getHref();
			case TextPackage.ATYPE__NAME:
				return getName();
			case TextPackage.ATYPE__SHOW:
				return getShow();
			case TextPackage.ATYPE__STYLE_NAME:
				return getStyleName();
			case TextPackage.ATYPE__TARGET_FRAME_NAME:
				return getTargetFrameName();
			case TextPackage.ATYPE__TITLE1:
				return getTitle1();
			case TextPackage.ATYPE__TYPE:
				return getType();
			case TextPackage.ATYPE__VISITED_STYLE_NAME:
				return getVisitedStyleName();
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
			case TextPackage.ATYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.ATYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case TextPackage.ATYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.ATYPE__S:
				getS().clear();
				getS().addAll((Collection<? extends SType>)newValue);
				return;
			case TextPackage.ATYPE__TAB:
				getTab().clear();
				getTab().addAll((Collection<? extends TabType>)newValue);
				return;
			case TextPackage.ATYPE__LINE_BREAK:
				getLineBreak().clear();
				getLineBreak().addAll((Collection<? extends LineBreakType>)newValue);
				return;
			case TextPackage.ATYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.ATYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case TextPackage.ATYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.ATYPE__BOOKMARK:
				getBookmark().clear();
				getBookmark().addAll((Collection<? extends BookmarkType>)newValue);
				return;
			case TextPackage.ATYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				getBookmarkStart().addAll((Collection<? extends BookmarkStartType>)newValue);
				return;
			case TextPackage.ATYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				getBookmarkEnd().addAll((Collection<? extends BookmarkEndType>)newValue);
				return;
			case TextPackage.ATYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				getReferenceMark().addAll((Collection<? extends ReferenceMarkType>)newValue);
				return;
			case TextPackage.ATYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				getReferenceMarkStart().addAll((Collection<? extends ReferenceMarkStartType>)newValue);
				return;
			case TextPackage.ATYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				getReferenceMarkEnd().addAll((Collection<? extends ReferenceMarkEndType>)newValue);
				return;
			case TextPackage.ATYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case TextPackage.ATYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case TextPackage.ATYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case TextPackage.ATYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.ATYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.ATYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.ATYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.ATYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.ATYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.ATYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.ATYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.ATYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.ATYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.ATYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.ATYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.ATYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.ATYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.ATYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.ATYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.ATYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.ATYPE__A1:
				getA1().clear();
				getA1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.drawing.AType>)newValue);
				return;
			case TextPackage.ATYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case TextPackage.ATYPE__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends TimeType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_NUMBER:
				getPageNumber().clear();
				getPageNumber().addAll((Collection<? extends PageNumberType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				getPageContinuation().addAll((Collection<? extends PageContinuationType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				getSenderFirstname().addAll((Collection<? extends SenderFirstnameType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				getSenderLastname().addAll((Collection<? extends SenderLastnameType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				getSenderInitials().addAll((Collection<? extends SenderInitialsType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_TITLE:
				getSenderTitle().clear();
				getSenderTitle().addAll((Collection<? extends SenderTitleType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_POSITION:
				getSenderPosition().clear();
				getSenderPosition().addAll((Collection<? extends SenderPositionType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				getSenderEmail().addAll((Collection<? extends SenderEmailType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				getSenderPhonePrivate().addAll((Collection<? extends SenderPhonePrivateType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_FAX:
				getSenderFax().clear();
				getSenderFax().addAll((Collection<? extends SenderFaxType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				getSenderCompany().addAll((Collection<? extends SenderCompanyType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				getSenderPhoneWork().addAll((Collection<? extends SenderPhoneWorkType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_STREET:
				getSenderStreet().clear();
				getSenderStreet().addAll((Collection<? extends SenderStreetType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_CITY:
				getSenderCity().clear();
				getSenderCity().addAll((Collection<? extends SenderCityType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				getSenderPostalCode().addAll((Collection<? extends SenderPostalCodeType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				getSenderCountry().addAll((Collection<? extends SenderCountryType>)newValue);
				return;
			case TextPackage.ATYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				getSenderStateOrProvince().addAll((Collection<? extends SenderStateOrProvinceType>)newValue);
				return;
			case TextPackage.ATYPE__AUTHOR_NAME:
				getAuthorName().clear();
				getAuthorName().addAll((Collection<? extends AuthorNameType>)newValue);
				return;
			case TextPackage.ATYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				getAuthorInitials().addAll((Collection<? extends AuthorInitialsType>)newValue);
				return;
			case TextPackage.ATYPE__CHAPTER:
				getChapter().clear();
				getChapter().addAll((Collection<? extends ChapterType>)newValue);
				return;
			case TextPackage.ATYPE__FILE_NAME:
				getFileName().clear();
				getFileName().addAll((Collection<? extends FileNameType>)newValue);
				return;
			case TextPackage.ATYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				getTemplateName().addAll((Collection<? extends TemplateNameType>)newValue);
				return;
			case TextPackage.ATYPE__SHEET_NAME:
				getSheetName().clear();
				getSheetName().addAll((Collection<? extends String>)newValue);
				return;
			case TextPackage.ATYPE__VARIABLE_SET:
				getVariableSet().clear();
				getVariableSet().addAll((Collection<? extends VariableSetType>)newValue);
				return;
			case TextPackage.ATYPE__VARIABLE_GET:
				getVariableGet().clear();
				getVariableGet().addAll((Collection<? extends VariableGetType>)newValue);
				return;
			case TextPackage.ATYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				getVariableInput().addAll((Collection<? extends VariableInputType>)newValue);
				return;
			case TextPackage.ATYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				getUserFieldGet().addAll((Collection<? extends UserFieldGetType>)newValue);
				return;
			case TextPackage.ATYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				getUserFieldInput().addAll((Collection<? extends UserFieldInputType>)newValue);
				return;
			case TextPackage.ATYPE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case TextPackage.ATYPE__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ExpressionType>)newValue);
				return;
			case TextPackage.ATYPE__TEXT_INPUT:
				getTextInput().clear();
				getTextInput().addAll((Collection<? extends TextInputType>)newValue);
				return;
			case TextPackage.ATYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				getInitialCreator().addAll((Collection<? extends InitialCreatorType>)newValue);
				return;
			case TextPackage.ATYPE__CREATION_DATE:
				getCreationDate().clear();
				getCreationDate().addAll((Collection<? extends CreationDateType>)newValue);
				return;
			case TextPackage.ATYPE__CREATION_TIME:
				getCreationTime().clear();
				getCreationTime().addAll((Collection<? extends CreationTimeType>)newValue);
				return;
			case TextPackage.ATYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case TextPackage.ATYPE__USER_DEFINED:
				getUserDefined().clear();
				getUserDefined().addAll((Collection<? extends UserDefinedType>)newValue);
				return;
			case TextPackage.ATYPE__PRINT_TIME:
				getPrintTime().clear();
				getPrintTime().addAll((Collection<? extends PrintTimeType>)newValue);
				return;
			case TextPackage.ATYPE__PRINT_DATE:
				getPrintDate().clear();
				getPrintDate().addAll((Collection<? extends PrintDateType>)newValue);
				return;
			case TextPackage.ATYPE__PRINTED_BY:
				getPrintedBy().clear();
				getPrintedBy().addAll((Collection<? extends PrintedByType>)newValue);
				return;
			case TextPackage.ATYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case TextPackage.ATYPE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectType>)newValue);
				return;
			case TextPackage.ATYPE__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends KeywordsType>)newValue);
				return;
			case TextPackage.ATYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				getEditingCycles().addAll((Collection<? extends EditingCyclesType>)newValue);
				return;
			case TextPackage.ATYPE__EDITING_DURATION:
				getEditingDuration().clear();
				getEditingDuration().addAll((Collection<? extends EditingDurationType>)newValue);
				return;
			case TextPackage.ATYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				getModificationTime().addAll((Collection<? extends ModificationTimeType>)newValue);
				return;
			case TextPackage.ATYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				getModificationDate().addAll((Collection<? extends ModificationDateType>)newValue);
				return;
			case TextPackage.ATYPE__CREATOR:
				getCreator().clear();
				getCreator().addAll((Collection<? extends CreatorType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_COUNT:
				getPageCount().clear();
				getPageCount().addAll((Collection<? extends PageCountType>)newValue);
				return;
			case TextPackage.ATYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				getParagraphCount().addAll((Collection<? extends ParagraphCountType>)newValue);
				return;
			case TextPackage.ATYPE__WORD_COUNT:
				getWordCount().clear();
				getWordCount().addAll((Collection<? extends WordCountType>)newValue);
				return;
			case TextPackage.ATYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				getCharacterCount().addAll((Collection<? extends CharacterCountType>)newValue);
				return;
			case TextPackage.ATYPE__TABLE_COUNT:
				getTableCount().clear();
				getTableCount().addAll((Collection<? extends TableCountType>)newValue);
				return;
			case TextPackage.ATYPE__IMAGE_COUNT:
				getImageCount().clear();
				getImageCount().addAll((Collection<? extends ImageCountType>)newValue);
				return;
			case TextPackage.ATYPE__OBJECT_COUNT:
				getObjectCount().clear();
				getObjectCount().addAll((Collection<? extends ObjectCountType>)newValue);
				return;
			case TextPackage.ATYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				getDatabaseDisplay().addAll((Collection<? extends TextDatabaseDisplayAttlist>)newValue);
				return;
			case TextPackage.ATYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				getDatabaseNext().addAll((Collection<? extends TextDatabaseNextAttlist>)newValue);
				return;
			case TextPackage.ATYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				getDatabaseRowSelect().addAll((Collection<? extends TextDatabaseRowSelectAttlist>)newValue);
				return;
			case TextPackage.ATYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				getDatabaseRowNumber().addAll((Collection<? extends DatabaseRowNumberType>)newValue);
				return;
			case TextPackage.ATYPE__DATABASE_NAME:
				getDatabaseName().clear();
				getDatabaseName().addAll((Collection<? extends DatabaseNameType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				getPageVariableSet().addAll((Collection<? extends PageVariableSetType>)newValue);
				return;
			case TextPackage.ATYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				getPageVariableGet().addAll((Collection<? extends PageVariableGetType>)newValue);
				return;
			case TextPackage.ATYPE__PLACEHOLDER:
				getPlaceholder().clear();
				getPlaceholder().addAll((Collection<? extends PlaceholderType>)newValue);
				return;
			case TextPackage.ATYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				getConditionalText().addAll((Collection<? extends ConditionalTextType>)newValue);
				return;
			case TextPackage.ATYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				getHiddenText().addAll((Collection<? extends HiddenTextType>)newValue);
				return;
			case TextPackage.ATYPE__REFERENCE_REF:
				getReferenceRef().clear();
				getReferenceRef().addAll((Collection<? extends ReferenceRefType>)newValue);
				return;
			case TextPackage.ATYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				getBookmarkRef().addAll((Collection<? extends BookmarkRefType>)newValue);
				return;
			case TextPackage.ATYPE__NOTE_REF:
				getNoteRef().clear();
				getNoteRef().addAll((Collection<? extends NoteRefType>)newValue);
				return;
			case TextPackage.ATYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				getSequenceRef().addAll((Collection<? extends SequenceRefType>)newValue);
				return;
			case TextPackage.ATYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case TextPackage.ATYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				getExecuteMacro().addAll((Collection<? extends ExecuteMacroType>)newValue);
				return;
			case TextPackage.ATYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				getHiddenParagraph().addAll((Collection<? extends HiddenParagraphType>)newValue);
				return;
			case TextPackage.ATYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				getDdeConnection().addAll((Collection<? extends DdeConnectionType>)newValue);
				return;
			case TextPackage.ATYPE__MEASURE1:
				getMeasure1().clear();
				getMeasure1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType>)newValue);
				return;
			case TextPackage.ATYPE__TABLE_FORMULA:
				getTableFormula().clear();
				getTableFormula().addAll((Collection<? extends TableFormulaType>)newValue);
				return;
			case TextPackage.ATYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				getTocMarkStart().addAll((Collection<? extends TocMarkStartType>)newValue);
				return;
			case TextPackage.ATYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				getTocMarkEnd().addAll((Collection<? extends TocMarkEndType>)newValue);
				return;
			case TextPackage.ATYPE__TOC_MARK:
				getTocMark().clear();
				getTocMark().addAll((Collection<? extends TocMarkType>)newValue);
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				getUserIndexMarkStart().addAll((Collection<? extends UserIndexMarkStartType>)newValue);
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				getUserIndexMarkEnd().addAll((Collection<? extends UserIndexMarkEndType>)newValue);
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				getUserIndexMark().addAll((Collection<? extends UserIndexMarkType>)newValue);
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				getAlphabeticalIndexMarkStart().addAll((Collection<? extends AlphabeticalIndexMarkStartType>)newValue);
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				getAlphabeticalIndexMarkEnd().addAll((Collection<? extends AlphabeticalIndexMarkEndType>)newValue);
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				getAlphabeticalIndexMark().addAll((Collection<? extends AlphabeticalIndexMarkType>)newValue);
				return;
			case TextPackage.ATYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				getBibliographyMark().addAll((Collection<? extends BibliographyMarkType>)newValue);
				return;
			case TextPackage.ATYPE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends HeaderType>)newValue);
				return;
			case TextPackage.ATYPE__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends FooterType>)newValue);
				return;
			case TextPackage.ATYPE__DATE_TIME:
				getDateTime().clear();
				getDateTime().addAll((Collection<? extends DateTimeType>)newValue);
				return;
			case TextPackage.ATYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case TextPackage.ATYPE__HREF:
				setHref((String)newValue);
				return;
			case TextPackage.ATYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.ATYPE__SHOW:
				setShow((ShowType2)newValue);
				return;
			case TextPackage.ATYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TextPackage.ATYPE__TARGET_FRAME_NAME:
				setTargetFrameName(newValue);
				return;
			case TextPackage.ATYPE__TITLE1:
				setTitle1((String)newValue);
				return;
			case TextPackage.ATYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case TextPackage.ATYPE__VISITED_STYLE_NAME:
				setVisitedStyleName((String)newValue);
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
			case TextPackage.ATYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.ATYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case TextPackage.ATYPE__GROUP:
				getGroup().clear();
				return;
			case TextPackage.ATYPE__S:
				getS().clear();
				return;
			case TextPackage.ATYPE__TAB:
				getTab().clear();
				return;
			case TextPackage.ATYPE__LINE_BREAK:
				getLineBreak().clear();
				return;
			case TextPackage.ATYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.ATYPE__SPAN:
				getSpan().clear();
				return;
			case TextPackage.ATYPE__A:
				getA().clear();
				return;
			case TextPackage.ATYPE__BOOKMARK:
				getBookmark().clear();
				return;
			case TextPackage.ATYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				return;
			case TextPackage.ATYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				return;
			case TextPackage.ATYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				return;
			case TextPackage.ATYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				return;
			case TextPackage.ATYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				return;
			case TextPackage.ATYPE__NOTE:
				getNote().clear();
				return;
			case TextPackage.ATYPE__RUBY:
				getRuby().clear();
				return;
			case TextPackage.ATYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case TextPackage.ATYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.ATYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.ATYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.ATYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.ATYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.ATYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.ATYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.ATYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.ATYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.ATYPE__G:
				getG().clear();
				return;
			case TextPackage.ATYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.ATYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.ATYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.ATYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.ATYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.ATYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.ATYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.ATYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.ATYPE__A1:
				getA1().clear();
				return;
			case TextPackage.ATYPE__DATE:
				getDate().clear();
				return;
			case TextPackage.ATYPE__TIME:
				getTime().clear();
				return;
			case TextPackage.ATYPE__PAGE_NUMBER:
				getPageNumber().clear();
				return;
			case TextPackage.ATYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				return;
			case TextPackage.ATYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				return;
			case TextPackage.ATYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				return;
			case TextPackage.ATYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				return;
			case TextPackage.ATYPE__SENDER_TITLE:
				getSenderTitle().clear();
				return;
			case TextPackage.ATYPE__SENDER_POSITION:
				getSenderPosition().clear();
				return;
			case TextPackage.ATYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				return;
			case TextPackage.ATYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				return;
			case TextPackage.ATYPE__SENDER_FAX:
				getSenderFax().clear();
				return;
			case TextPackage.ATYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				return;
			case TextPackage.ATYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				return;
			case TextPackage.ATYPE__SENDER_STREET:
				getSenderStreet().clear();
				return;
			case TextPackage.ATYPE__SENDER_CITY:
				getSenderCity().clear();
				return;
			case TextPackage.ATYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				return;
			case TextPackage.ATYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				return;
			case TextPackage.ATYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				return;
			case TextPackage.ATYPE__AUTHOR_NAME:
				getAuthorName().clear();
				return;
			case TextPackage.ATYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				return;
			case TextPackage.ATYPE__CHAPTER:
				getChapter().clear();
				return;
			case TextPackage.ATYPE__FILE_NAME:
				getFileName().clear();
				return;
			case TextPackage.ATYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				return;
			case TextPackage.ATYPE__SHEET_NAME:
				getSheetName().clear();
				return;
			case TextPackage.ATYPE__VARIABLE_SET:
				getVariableSet().clear();
				return;
			case TextPackage.ATYPE__VARIABLE_GET:
				getVariableGet().clear();
				return;
			case TextPackage.ATYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				return;
			case TextPackage.ATYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				return;
			case TextPackage.ATYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				return;
			case TextPackage.ATYPE__SEQUENCE:
				getSequence().clear();
				return;
			case TextPackage.ATYPE__EXPRESSION:
				getExpression().clear();
				return;
			case TextPackage.ATYPE__TEXT_INPUT:
				getTextInput().clear();
				return;
			case TextPackage.ATYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				return;
			case TextPackage.ATYPE__CREATION_DATE:
				getCreationDate().clear();
				return;
			case TextPackage.ATYPE__CREATION_TIME:
				getCreationTime().clear();
				return;
			case TextPackage.ATYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case TextPackage.ATYPE__USER_DEFINED:
				getUserDefined().clear();
				return;
			case TextPackage.ATYPE__PRINT_TIME:
				getPrintTime().clear();
				return;
			case TextPackage.ATYPE__PRINT_DATE:
				getPrintDate().clear();
				return;
			case TextPackage.ATYPE__PRINTED_BY:
				getPrintedBy().clear();
				return;
			case TextPackage.ATYPE__TITLE:
				getTitle().clear();
				return;
			case TextPackage.ATYPE__SUBJECT:
				getSubject().clear();
				return;
			case TextPackage.ATYPE__KEYWORDS:
				getKeywords().clear();
				return;
			case TextPackage.ATYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				return;
			case TextPackage.ATYPE__EDITING_DURATION:
				getEditingDuration().clear();
				return;
			case TextPackage.ATYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				return;
			case TextPackage.ATYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				return;
			case TextPackage.ATYPE__CREATOR:
				getCreator().clear();
				return;
			case TextPackage.ATYPE__PAGE_COUNT:
				getPageCount().clear();
				return;
			case TextPackage.ATYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				return;
			case TextPackage.ATYPE__WORD_COUNT:
				getWordCount().clear();
				return;
			case TextPackage.ATYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				return;
			case TextPackage.ATYPE__TABLE_COUNT:
				getTableCount().clear();
				return;
			case TextPackage.ATYPE__IMAGE_COUNT:
				getImageCount().clear();
				return;
			case TextPackage.ATYPE__OBJECT_COUNT:
				getObjectCount().clear();
				return;
			case TextPackage.ATYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				return;
			case TextPackage.ATYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				return;
			case TextPackage.ATYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				return;
			case TextPackage.ATYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				return;
			case TextPackage.ATYPE__DATABASE_NAME:
				getDatabaseName().clear();
				return;
			case TextPackage.ATYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				return;
			case TextPackage.ATYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				return;
			case TextPackage.ATYPE__PLACEHOLDER:
				getPlaceholder().clear();
				return;
			case TextPackage.ATYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				return;
			case TextPackage.ATYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				return;
			case TextPackage.ATYPE__REFERENCE_REF:
				getReferenceRef().clear();
				return;
			case TextPackage.ATYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				return;
			case TextPackage.ATYPE__NOTE_REF:
				getNoteRef().clear();
				return;
			case TextPackage.ATYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				return;
			case TextPackage.ATYPE__SCRIPT:
				getScript().clear();
				return;
			case TextPackage.ATYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				return;
			case TextPackage.ATYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				return;
			case TextPackage.ATYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				return;
			case TextPackage.ATYPE__MEASURE1:
				getMeasure1().clear();
				return;
			case TextPackage.ATYPE__TABLE_FORMULA:
				getTableFormula().clear();
				return;
			case TextPackage.ATYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				return;
			case TextPackage.ATYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				return;
			case TextPackage.ATYPE__TOC_MARK:
				getTocMark().clear();
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				return;
			case TextPackage.ATYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				return;
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				return;
			case TextPackage.ATYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				return;
			case TextPackage.ATYPE__HEADER:
				getHeader().clear();
				return;
			case TextPackage.ATYPE__FOOTER:
				getFooter().clear();
				return;
			case TextPackage.ATYPE__DATE_TIME:
				getDateTime().clear();
				return;
			case TextPackage.ATYPE__ACTUATE:
				unsetActuate();
				return;
			case TextPackage.ATYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case TextPackage.ATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.ATYPE__SHOW:
				unsetShow();
				return;
			case TextPackage.ATYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.ATYPE__TARGET_FRAME_NAME:
				setTargetFrameName(TARGET_FRAME_NAME_EDEFAULT);
				return;
			case TextPackage.ATYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case TextPackage.ATYPE__TYPE:
				unsetType();
				return;
			case TextPackage.ATYPE__VISITED_STYLE_NAME:
				setVisitedStyleName(VISITED_STYLE_NAME_EDEFAULT);
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
			case TextPackage.ATYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.ATYPE__EVENT_LISTENERS:
				return getEventListeners() != null;
			case TextPackage.ATYPE__GROUP:
				return !getGroup().isEmpty();
			case TextPackage.ATYPE__S:
				return !getS().isEmpty();
			case TextPackage.ATYPE__TAB:
				return !getTab().isEmpty();
			case TextPackage.ATYPE__LINE_BREAK:
				return !getLineBreak().isEmpty();
			case TextPackage.ATYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.ATYPE__SPAN:
				return !getSpan().isEmpty();
			case TextPackage.ATYPE__A:
				return !getA().isEmpty();
			case TextPackage.ATYPE__BOOKMARK:
				return !getBookmark().isEmpty();
			case TextPackage.ATYPE__BOOKMARK_START:
				return !getBookmarkStart().isEmpty();
			case TextPackage.ATYPE__BOOKMARK_END:
				return !getBookmarkEnd().isEmpty();
			case TextPackage.ATYPE__REFERENCE_MARK:
				return !getReferenceMark().isEmpty();
			case TextPackage.ATYPE__REFERENCE_MARK_START:
				return !getReferenceMarkStart().isEmpty();
			case TextPackage.ATYPE__REFERENCE_MARK_END:
				return !getReferenceMarkEnd().isEmpty();
			case TextPackage.ATYPE__NOTE:
				return !getNote().isEmpty();
			case TextPackage.ATYPE__RUBY:
				return !getRuby().isEmpty();
			case TextPackage.ATYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case TextPackage.ATYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.ATYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.ATYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.ATYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.ATYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.ATYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.ATYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.ATYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.ATYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.ATYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.ATYPE__G:
				return !getG().isEmpty();
			case TextPackage.ATYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.ATYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.ATYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.ATYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.ATYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.ATYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.ATYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.ATYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.ATYPE__A1:
				return !getA1().isEmpty();
			case TextPackage.ATYPE__DATE:
				return !getDate().isEmpty();
			case TextPackage.ATYPE__TIME:
				return !getTime().isEmpty();
			case TextPackage.ATYPE__PAGE_NUMBER:
				return !getPageNumber().isEmpty();
			case TextPackage.ATYPE__PAGE_CONTINUATION:
				return !getPageContinuation().isEmpty();
			case TextPackage.ATYPE__SENDER_FIRSTNAME:
				return !getSenderFirstname().isEmpty();
			case TextPackage.ATYPE__SENDER_LASTNAME:
				return !getSenderLastname().isEmpty();
			case TextPackage.ATYPE__SENDER_INITIALS:
				return !getSenderInitials().isEmpty();
			case TextPackage.ATYPE__SENDER_TITLE:
				return !getSenderTitle().isEmpty();
			case TextPackage.ATYPE__SENDER_POSITION:
				return !getSenderPosition().isEmpty();
			case TextPackage.ATYPE__SENDER_EMAIL:
				return !getSenderEmail().isEmpty();
			case TextPackage.ATYPE__SENDER_PHONE_PRIVATE:
				return !getSenderPhonePrivate().isEmpty();
			case TextPackage.ATYPE__SENDER_FAX:
				return !getSenderFax().isEmpty();
			case TextPackage.ATYPE__SENDER_COMPANY:
				return !getSenderCompany().isEmpty();
			case TextPackage.ATYPE__SENDER_PHONE_WORK:
				return !getSenderPhoneWork().isEmpty();
			case TextPackage.ATYPE__SENDER_STREET:
				return !getSenderStreet().isEmpty();
			case TextPackage.ATYPE__SENDER_CITY:
				return !getSenderCity().isEmpty();
			case TextPackage.ATYPE__SENDER_POSTAL_CODE:
				return !getSenderPostalCode().isEmpty();
			case TextPackage.ATYPE__SENDER_COUNTRY:
				return !getSenderCountry().isEmpty();
			case TextPackage.ATYPE__SENDER_STATE_OR_PROVINCE:
				return !getSenderStateOrProvince().isEmpty();
			case TextPackage.ATYPE__AUTHOR_NAME:
				return !getAuthorName().isEmpty();
			case TextPackage.ATYPE__AUTHOR_INITIALS:
				return !getAuthorInitials().isEmpty();
			case TextPackage.ATYPE__CHAPTER:
				return !getChapter().isEmpty();
			case TextPackage.ATYPE__FILE_NAME:
				return !getFileName().isEmpty();
			case TextPackage.ATYPE__TEMPLATE_NAME:
				return !getTemplateName().isEmpty();
			case TextPackage.ATYPE__SHEET_NAME:
				return !getSheetName().isEmpty();
			case TextPackage.ATYPE__VARIABLE_SET:
				return !getVariableSet().isEmpty();
			case TextPackage.ATYPE__VARIABLE_GET:
				return !getVariableGet().isEmpty();
			case TextPackage.ATYPE__VARIABLE_INPUT:
				return !getVariableInput().isEmpty();
			case TextPackage.ATYPE__USER_FIELD_GET:
				return !getUserFieldGet().isEmpty();
			case TextPackage.ATYPE__USER_FIELD_INPUT:
				return !getUserFieldInput().isEmpty();
			case TextPackage.ATYPE__SEQUENCE:
				return !getSequence().isEmpty();
			case TextPackage.ATYPE__EXPRESSION:
				return !getExpression().isEmpty();
			case TextPackage.ATYPE__TEXT_INPUT:
				return !getTextInput().isEmpty();
			case TextPackage.ATYPE__INITIAL_CREATOR:
				return !getInitialCreator().isEmpty();
			case TextPackage.ATYPE__CREATION_DATE:
				return !getCreationDate().isEmpty();
			case TextPackage.ATYPE__CREATION_TIME:
				return !getCreationTime().isEmpty();
			case TextPackage.ATYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case TextPackage.ATYPE__USER_DEFINED:
				return !getUserDefined().isEmpty();
			case TextPackage.ATYPE__PRINT_TIME:
				return !getPrintTime().isEmpty();
			case TextPackage.ATYPE__PRINT_DATE:
				return !getPrintDate().isEmpty();
			case TextPackage.ATYPE__PRINTED_BY:
				return !getPrintedBy().isEmpty();
			case TextPackage.ATYPE__TITLE:
				return !getTitle().isEmpty();
			case TextPackage.ATYPE__SUBJECT:
				return !getSubject().isEmpty();
			case TextPackage.ATYPE__KEYWORDS:
				return !getKeywords().isEmpty();
			case TextPackage.ATYPE__EDITING_CYCLES:
				return !getEditingCycles().isEmpty();
			case TextPackage.ATYPE__EDITING_DURATION:
				return !getEditingDuration().isEmpty();
			case TextPackage.ATYPE__MODIFICATION_TIME:
				return !getModificationTime().isEmpty();
			case TextPackage.ATYPE__MODIFICATION_DATE:
				return !getModificationDate().isEmpty();
			case TextPackage.ATYPE__CREATOR:
				return !getCreator().isEmpty();
			case TextPackage.ATYPE__PAGE_COUNT:
				return !getPageCount().isEmpty();
			case TextPackage.ATYPE__PARAGRAPH_COUNT:
				return !getParagraphCount().isEmpty();
			case TextPackage.ATYPE__WORD_COUNT:
				return !getWordCount().isEmpty();
			case TextPackage.ATYPE__CHARACTER_COUNT:
				return !getCharacterCount().isEmpty();
			case TextPackage.ATYPE__TABLE_COUNT:
				return !getTableCount().isEmpty();
			case TextPackage.ATYPE__IMAGE_COUNT:
				return !getImageCount().isEmpty();
			case TextPackage.ATYPE__OBJECT_COUNT:
				return !getObjectCount().isEmpty();
			case TextPackage.ATYPE__DATABASE_DISPLAY:
				return !getDatabaseDisplay().isEmpty();
			case TextPackage.ATYPE__DATABASE_NEXT:
				return !getDatabaseNext().isEmpty();
			case TextPackage.ATYPE__DATABASE_ROW_SELECT:
				return !getDatabaseRowSelect().isEmpty();
			case TextPackage.ATYPE__DATABASE_ROW_NUMBER:
				return !getDatabaseRowNumber().isEmpty();
			case TextPackage.ATYPE__DATABASE_NAME:
				return !getDatabaseName().isEmpty();
			case TextPackage.ATYPE__PAGE_VARIABLE_SET:
				return !getPageVariableSet().isEmpty();
			case TextPackage.ATYPE__PAGE_VARIABLE_GET:
				return !getPageVariableGet().isEmpty();
			case TextPackage.ATYPE__PLACEHOLDER:
				return !getPlaceholder().isEmpty();
			case TextPackage.ATYPE__CONDITIONAL_TEXT:
				return !getConditionalText().isEmpty();
			case TextPackage.ATYPE__HIDDEN_TEXT:
				return !getHiddenText().isEmpty();
			case TextPackage.ATYPE__REFERENCE_REF:
				return !getReferenceRef().isEmpty();
			case TextPackage.ATYPE__BOOKMARK_REF:
				return !getBookmarkRef().isEmpty();
			case TextPackage.ATYPE__NOTE_REF:
				return !getNoteRef().isEmpty();
			case TextPackage.ATYPE__SEQUENCE_REF:
				return !getSequenceRef().isEmpty();
			case TextPackage.ATYPE__SCRIPT:
				return !getScript().isEmpty();
			case TextPackage.ATYPE__EXECUTE_MACRO:
				return !getExecuteMacro().isEmpty();
			case TextPackage.ATYPE__HIDDEN_PARAGRAPH:
				return !getHiddenParagraph().isEmpty();
			case TextPackage.ATYPE__DDE_CONNECTION:
				return !getDdeConnection().isEmpty();
			case TextPackage.ATYPE__MEASURE1:
				return !getMeasure1().isEmpty();
			case TextPackage.ATYPE__TABLE_FORMULA:
				return !getTableFormula().isEmpty();
			case TextPackage.ATYPE__TOC_MARK_START:
				return !getTocMarkStart().isEmpty();
			case TextPackage.ATYPE__TOC_MARK_END:
				return !getTocMarkEnd().isEmpty();
			case TextPackage.ATYPE__TOC_MARK:
				return !getTocMark().isEmpty();
			case TextPackage.ATYPE__USER_INDEX_MARK_START:
				return !getUserIndexMarkStart().isEmpty();
			case TextPackage.ATYPE__USER_INDEX_MARK_END:
				return !getUserIndexMarkEnd().isEmpty();
			case TextPackage.ATYPE__USER_INDEX_MARK:
				return !getUserIndexMark().isEmpty();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_START:
				return !getAlphabeticalIndexMarkStart().isEmpty();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK_END:
				return !getAlphabeticalIndexMarkEnd().isEmpty();
			case TextPackage.ATYPE__ALPHABETICAL_INDEX_MARK:
				return !getAlphabeticalIndexMark().isEmpty();
			case TextPackage.ATYPE__BIBLIOGRAPHY_MARK:
				return !getBibliographyMark().isEmpty();
			case TextPackage.ATYPE__HEADER:
				return !getHeader().isEmpty();
			case TextPackage.ATYPE__FOOTER:
				return !getFooter().isEmpty();
			case TextPackage.ATYPE__DATE_TIME:
				return !getDateTime().isEmpty();
			case TextPackage.ATYPE__ACTUATE:
				return isSetActuate();
			case TextPackage.ATYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case TextPackage.ATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.ATYPE__SHOW:
				return isSetShow();
			case TextPackage.ATYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TextPackage.ATYPE__TARGET_FRAME_NAME:
				return TARGET_FRAME_NAME_EDEFAULT == null ? targetFrameName != null : !TARGET_FRAME_NAME_EDEFAULT.equals(targetFrameName);
			case TextPackage.ATYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case TextPackage.ATYPE__TYPE:
				return isSetType();
			case TextPackage.ATYPE__VISITED_STYLE_NAME:
				return VISITED_STYLE_NAME_EDEFAULT == null ? visitedStyleName != null : !VISITED_STYLE_NAME_EDEFAULT.equals(visitedStyleName);
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
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", name: ");
		result.append(name);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", targetFrameName: ");
		result.append(targetFrameName);
		result.append(", title1: ");
		result.append(title1);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", visitedStyleName: ");
		result.append(visitedStyleName);
		result.append(')');
		return result.toString();
	}

} //ATypeImpl
