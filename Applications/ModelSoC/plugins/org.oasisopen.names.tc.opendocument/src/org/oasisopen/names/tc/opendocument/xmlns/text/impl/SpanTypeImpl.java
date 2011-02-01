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
 * An implementation of the model object '<em><b>Span Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getS <em>S</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getBookmarkStart <em>Bookmark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getBookmarkEnd <em>Bookmark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getReferenceMark <em>Reference Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getReferenceMarkStart <em>Reference Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getReferenceMarkEnd <em>Reference Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageContinuation <em>Page Continuation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderFirstname <em>Sender Firstname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderLastname <em>Sender Lastname</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderInitials <em>Sender Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderTitle <em>Sender Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderPosition <em>Sender Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderEmail <em>Sender Email</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderPhonePrivate <em>Sender Phone Private</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderFax <em>Sender Fax</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderCompany <em>Sender Company</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderPhoneWork <em>Sender Phone Work</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderStreet <em>Sender Street</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderCity <em>Sender City</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderPostalCode <em>Sender Postal Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderCountry <em>Sender Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSenderStateOrProvince <em>Sender State Or Province</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAuthorInitials <em>Author Initials</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getVariableGet <em>Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getVariableInput <em>Variable Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserFieldGet <em>User Field Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserFieldInput <em>User Field Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTextInput <em>Text Input</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserDefined <em>User Defined</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPrintTime <em>Print Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDatabaseDisplay <em>Database Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDatabaseNext <em>Database Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDatabaseRowSelect <em>Database Row Select</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDatabaseRowNumber <em>Database Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageVariableSet <em>Page Variable Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPageVariableGet <em>Page Variable Get</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getConditionalText <em>Conditional Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getHiddenText <em>Hidden Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getReferenceRef <em>Reference Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getBookmarkRef <em>Bookmark Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getNoteRef <em>Note Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getSequenceRef <em>Sequence Ref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getExecuteMacro <em>Execute Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getHiddenParagraph <em>Hidden Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDdeConnection <em>Dde Connection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTableFormula <em>Table Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTocMarkStart <em>Toc Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTocMarkEnd <em>Toc Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getTocMark <em>Toc Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserIndexMarkStart <em>User Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserIndexMarkEnd <em>User Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getUserIndexMark <em>User Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAlphabeticalIndexMarkStart <em>Alphabetical Index Mark Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAlphabeticalIndexMarkEnd <em>Alphabetical Index Mark End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getAlphabeticalIndexMark <em>Alphabetical Index Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getBibliographyMark <em>Bibliography Mark</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SpanTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanTypeImpl extends EObjectImpl implements SpanType {
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
	protected SpanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSpanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.SPAN_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getSpanType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SType> getS() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_S());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabType> getTab() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Tab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineBreakType> getLineBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_LineBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkType> getBookmark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Bookmark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkStartType> getBookmarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_BookmarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkEndType> getBookmarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_BookmarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkType> getReferenceMark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ReferenceMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkStartType> getReferenceMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ReferenceMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceMarkEndType> getReferenceMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ReferenceMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RubyType> getRuby() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getSpanType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getSpanType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.drawing.AType> getA1() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_A1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDate() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeType> getTime() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Time());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageNumberType> getPageNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContinuationType> getPageContinuation() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageContinuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFirstnameType> getSenderFirstname() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderFirstname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderLastnameType> getSenderLastname() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderLastname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderInitialsType> getSenderInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderTitleType> getSenderTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPositionType> getSenderPosition() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderEmailType> getSenderEmail() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderEmail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhonePrivateType> getSenderPhonePrivate() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderPhonePrivate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderFaxType> getSenderFax() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderFax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCompanyType> getSenderCompany() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderCompany());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPhoneWorkType> getSenderPhoneWork() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderPhoneWork());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStreetType> getSenderStreet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderStreet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCityType> getSenderCity() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderCity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderPostalCodeType> getSenderPostalCode() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderPostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderCountryType> getSenderCountry() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SenderStateOrProvinceType> getSenderStateOrProvince() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SenderStateOrProvince());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorNameType> getAuthorName() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_AuthorName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorInitialsType> getAuthorInitials() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_AuthorInitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChapterType> getChapter() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Chapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileNameType> getFileName() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_FileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateNameType> getTemplateName() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TemplateName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSheetName() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SheetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableSetType> getVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_VariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableGetType> getVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_VariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableInputType> getVariableInput() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_VariableInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldGetType> getUserFieldGet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserFieldGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldInputType> getUserFieldInput() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserFieldInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequence() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Sequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionType> getExpression() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Expression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextInputType> getTextInput() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TextInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialCreatorType> getInitialCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_InitialCreator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationDateType> getCreationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_CreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreationTimeType> getCreationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_CreationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserDefinedType> getUserDefined() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserDefined());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintTimeType> getPrintTime() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PrintTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintDateType> getPrintDate() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PrintDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintedByType> getPrintedBy() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PrintedBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectType> getSubject() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordsType> getKeywords() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Keywords());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingCyclesType> getEditingCycles() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_EditingCycles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditingDurationType> getEditingDuration() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_EditingDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationTimeType> getModificationTime() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ModificationTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModificationDateType> getModificationDate() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ModificationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreatorType> getCreator() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Creator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageCountType> getPageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParagraphCountType> getParagraphCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ParagraphCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WordCountType> getWordCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_WordCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacterCountType> getCharacterCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_CharacterCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCountType> getTableCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TableCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageCountType> getImageCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ImageCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectCountType> getObjectCount() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ObjectCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseDisplayAttlist> getDatabaseDisplay() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DatabaseDisplay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseNextAttlist> getDatabaseNext() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DatabaseNext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextDatabaseRowSelectAttlist> getDatabaseRowSelect() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DatabaseRowSelect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseRowNumberType> getDatabaseRowNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DatabaseRowNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseNameType> getDatabaseName() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DatabaseName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableSetType> getPageVariableSet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageVariableSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageVariableGetType> getPageVariableGet() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_PageVariableGet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceholderType> getPlaceholder() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Placeholder());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalTextType> getConditionalText() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ConditionalText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenTextType> getHiddenText() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_HiddenText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRefType> getReferenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ReferenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookmarkRefType> getBookmarkRef() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_BookmarkRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteRefType> getNoteRef() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_NoteRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRefType> getSequenceRef() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_SequenceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteMacroType> getExecuteMacro() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_ExecuteMacro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HiddenParagraphType> getHiddenParagraph() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_HiddenParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdeConnectionType> getDdeConnection() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DdeConnection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType> getMeasure1() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Measure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableFormulaType> getTableFormula() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TableFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkStartType> getTocMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TocMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkEndType> getTocMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TocMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TocMarkType> getTocMark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_TocMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkStartType> getUserIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkEndType> getUserIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexMarkType> getUserIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_UserIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkStartType> getAlphabeticalIndexMarkStart() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_AlphabeticalIndexMarkStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkEndType> getAlphabeticalIndexMarkEnd() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_AlphabeticalIndexMarkEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexMarkType> getAlphabeticalIndexMark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_AlphabeticalIndexMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyMarkType> getBibliographyMark() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_BibliographyMark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderType> getHeader() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Header());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FooterType> getFooter() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_Footer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTimeType> getDateTime() {
		return getGroup().list(TextPackage.eINSTANCE.getSpanType_DateTime());
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SPAN_TYPE__CLASS_NAMES, oldClassNames, classNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SPAN_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.SPAN_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TAB:
				return ((InternalEList<?>)getTab()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__LINE_BREAK:
				return ((InternalEList<?>)getLineBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__BOOKMARK:
				return ((InternalEList<?>)getBookmark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__BOOKMARK_START:
				return ((InternalEList<?>)getBookmarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__BOOKMARK_END:
				return ((InternalEList<?>)getBookmarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__REFERENCE_MARK:
				return ((InternalEList<?>)getReferenceMark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_START:
				return ((InternalEList<?>)getReferenceMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_END:
				return ((InternalEList<?>)getReferenceMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__A1:
				return ((InternalEList<?>)getA1()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_NUMBER:
				return ((InternalEList<?>)getPageNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_CONTINUATION:
				return ((InternalEList<?>)getPageContinuation()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_FIRSTNAME:
				return ((InternalEList<?>)getSenderFirstname()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_LASTNAME:
				return ((InternalEList<?>)getSenderLastname()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_INITIALS:
				return ((InternalEList<?>)getSenderInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_TITLE:
				return ((InternalEList<?>)getSenderTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_POSITION:
				return ((InternalEList<?>)getSenderPosition()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_EMAIL:
				return ((InternalEList<?>)getSenderEmail()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_PHONE_PRIVATE:
				return ((InternalEList<?>)getSenderPhonePrivate()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_FAX:
				return ((InternalEList<?>)getSenderFax()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_COMPANY:
				return ((InternalEList<?>)getSenderCompany()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_PHONE_WORK:
				return ((InternalEList<?>)getSenderPhoneWork()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_STREET:
				return ((InternalEList<?>)getSenderStreet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_CITY:
				return ((InternalEList<?>)getSenderCity()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_POSTAL_CODE:
				return ((InternalEList<?>)getSenderPostalCode()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_COUNTRY:
				return ((InternalEList<?>)getSenderCountry()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SENDER_STATE_OR_PROVINCE:
				return ((InternalEList<?>)getSenderStateOrProvince()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__AUTHOR_NAME:
				return ((InternalEList<?>)getAuthorName()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__AUTHOR_INITIALS:
				return ((InternalEList<?>)getAuthorInitials()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CHAPTER:
				return ((InternalEList<?>)getChapter()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__FILE_NAME:
				return ((InternalEList<?>)getFileName()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TEMPLATE_NAME:
				return ((InternalEList<?>)getTemplateName()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__VARIABLE_SET:
				return ((InternalEList<?>)getVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__VARIABLE_GET:
				return ((InternalEList<?>)getVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__VARIABLE_INPUT:
				return ((InternalEList<?>)getVariableInput()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_FIELD_GET:
				return ((InternalEList<?>)getUserFieldGet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_FIELD_INPUT:
				return ((InternalEList<?>)getUserFieldInput()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TEXT_INPUT:
				return ((InternalEList<?>)getTextInput()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__INITIAL_CREATOR:
				return ((InternalEList<?>)getInitialCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CREATION_DATE:
				return ((InternalEList<?>)getCreationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CREATION_TIME:
				return ((InternalEList<?>)getCreationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_DEFINED:
				return ((InternalEList<?>)getUserDefined()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PRINT_TIME:
				return ((InternalEList<?>)getPrintTime()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PRINT_DATE:
				return ((InternalEList<?>)getPrintDate()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PRINTED_BY:
				return ((InternalEList<?>)getPrintedBy()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__KEYWORDS:
				return ((InternalEList<?>)getKeywords()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__EDITING_CYCLES:
				return ((InternalEList<?>)getEditingCycles()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__EDITING_DURATION:
				return ((InternalEList<?>)getEditingDuration()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__MODIFICATION_TIME:
				return ((InternalEList<?>)getModificationTime()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__MODIFICATION_DATE:
				return ((InternalEList<?>)getModificationDate()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CREATOR:
				return ((InternalEList<?>)getCreator()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_COUNT:
				return ((InternalEList<?>)getPageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PARAGRAPH_COUNT:
				return ((InternalEList<?>)getParagraphCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__WORD_COUNT:
				return ((InternalEList<?>)getWordCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CHARACTER_COUNT:
				return ((InternalEList<?>)getCharacterCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TABLE_COUNT:
				return ((InternalEList<?>)getTableCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__IMAGE_COUNT:
				return ((InternalEList<?>)getImageCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__OBJECT_COUNT:
				return ((InternalEList<?>)getObjectCount()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATABASE_DISPLAY:
				return ((InternalEList<?>)getDatabaseDisplay()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATABASE_NEXT:
				return ((InternalEList<?>)getDatabaseNext()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATABASE_ROW_SELECT:
				return ((InternalEList<?>)getDatabaseRowSelect()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATABASE_ROW_NUMBER:
				return ((InternalEList<?>)getDatabaseRowNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATABASE_NAME:
				return ((InternalEList<?>)getDatabaseName()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_SET:
				return ((InternalEList<?>)getPageVariableSet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_GET:
				return ((InternalEList<?>)getPageVariableGet()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__PLACEHOLDER:
				return ((InternalEList<?>)getPlaceholder()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__CONDITIONAL_TEXT:
				return ((InternalEList<?>)getConditionalText()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__HIDDEN_TEXT:
				return ((InternalEList<?>)getHiddenText()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__REFERENCE_REF:
				return ((InternalEList<?>)getReferenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__BOOKMARK_REF:
				return ((InternalEList<?>)getBookmarkRef()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__NOTE_REF:
				return ((InternalEList<?>)getNoteRef()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SEQUENCE_REF:
				return ((InternalEList<?>)getSequenceRef()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__EXECUTE_MACRO:
				return ((InternalEList<?>)getExecuteMacro()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__HIDDEN_PARAGRAPH:
				return ((InternalEList<?>)getHiddenParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DDE_CONNECTION:
				return ((InternalEList<?>)getDdeConnection()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__MEASURE1:
				return ((InternalEList<?>)getMeasure1()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TABLE_FORMULA:
				return ((InternalEList<?>)getTableFormula()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TOC_MARK_START:
				return ((InternalEList<?>)getTocMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TOC_MARK_END:
				return ((InternalEList<?>)getTocMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__TOC_MARK:
				return ((InternalEList<?>)getTocMark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_START:
				return ((InternalEList<?>)getUserIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_END:
				return ((InternalEList<?>)getUserIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK:
				return ((InternalEList<?>)getUserIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return ((InternalEList<?>)getAlphabeticalIndexMarkStart()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return ((InternalEList<?>)getAlphabeticalIndexMarkEnd()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK:
				return ((InternalEList<?>)getAlphabeticalIndexMark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__BIBLIOGRAPHY_MARK:
				return ((InternalEList<?>)getBibliographyMark()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
			case TextPackage.SPAN_TYPE__DATE_TIME:
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
			case TextPackage.SPAN_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.SPAN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.SPAN_TYPE__S:
				return getS();
			case TextPackage.SPAN_TYPE__TAB:
				return getTab();
			case TextPackage.SPAN_TYPE__LINE_BREAK:
				return getLineBreak();
			case TextPackage.SPAN_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.SPAN_TYPE__SPAN:
				return getSpan();
			case TextPackage.SPAN_TYPE__A:
				return getA();
			case TextPackage.SPAN_TYPE__BOOKMARK:
				return getBookmark();
			case TextPackage.SPAN_TYPE__BOOKMARK_START:
				return getBookmarkStart();
			case TextPackage.SPAN_TYPE__BOOKMARK_END:
				return getBookmarkEnd();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK:
				return getReferenceMark();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_START:
				return getReferenceMarkStart();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_END:
				return getReferenceMarkEnd();
			case TextPackage.SPAN_TYPE__NOTE:
				return getNote();
			case TextPackage.SPAN_TYPE__RUBY:
				return getRuby();
			case TextPackage.SPAN_TYPE__ANNOTATION:
				return getAnnotation();
			case TextPackage.SPAN_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.SPAN_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.SPAN_TYPE__RECT:
				return getRect();
			case TextPackage.SPAN_TYPE__LINE:
				return getLine();
			case TextPackage.SPAN_TYPE__POLYLINE:
				return getPolyline();
			case TextPackage.SPAN_TYPE__POLYGON:
				return getPolygon();
			case TextPackage.SPAN_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.SPAN_TYPE__PATH:
				return getPath();
			case TextPackage.SPAN_TYPE__CIRCLE:
				return getCircle();
			case TextPackage.SPAN_TYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.SPAN_TYPE__G:
				return getG();
			case TextPackage.SPAN_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.SPAN_TYPE__FRAME:
				return getFrame();
			case TextPackage.SPAN_TYPE__MEASURE:
				return getMeasure();
			case TextPackage.SPAN_TYPE__CAPTION:
				return getCaption();
			case TextPackage.SPAN_TYPE__CONNECTOR:
				return getConnector();
			case TextPackage.SPAN_TYPE__CONTROL:
				return getControl();
			case TextPackage.SPAN_TYPE__SCENE:
				return getScene();
			case TextPackage.SPAN_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.SPAN_TYPE__A1:
				return getA1();
			case TextPackage.SPAN_TYPE__DATE:
				return getDate();
			case TextPackage.SPAN_TYPE__TIME:
				return getTime();
			case TextPackage.SPAN_TYPE__PAGE_NUMBER:
				return getPageNumber();
			case TextPackage.SPAN_TYPE__PAGE_CONTINUATION:
				return getPageContinuation();
			case TextPackage.SPAN_TYPE__SENDER_FIRSTNAME:
				return getSenderFirstname();
			case TextPackage.SPAN_TYPE__SENDER_LASTNAME:
				return getSenderLastname();
			case TextPackage.SPAN_TYPE__SENDER_INITIALS:
				return getSenderInitials();
			case TextPackage.SPAN_TYPE__SENDER_TITLE:
				return getSenderTitle();
			case TextPackage.SPAN_TYPE__SENDER_POSITION:
				return getSenderPosition();
			case TextPackage.SPAN_TYPE__SENDER_EMAIL:
				return getSenderEmail();
			case TextPackage.SPAN_TYPE__SENDER_PHONE_PRIVATE:
				return getSenderPhonePrivate();
			case TextPackage.SPAN_TYPE__SENDER_FAX:
				return getSenderFax();
			case TextPackage.SPAN_TYPE__SENDER_COMPANY:
				return getSenderCompany();
			case TextPackage.SPAN_TYPE__SENDER_PHONE_WORK:
				return getSenderPhoneWork();
			case TextPackage.SPAN_TYPE__SENDER_STREET:
				return getSenderStreet();
			case TextPackage.SPAN_TYPE__SENDER_CITY:
				return getSenderCity();
			case TextPackage.SPAN_TYPE__SENDER_POSTAL_CODE:
				return getSenderPostalCode();
			case TextPackage.SPAN_TYPE__SENDER_COUNTRY:
				return getSenderCountry();
			case TextPackage.SPAN_TYPE__SENDER_STATE_OR_PROVINCE:
				return getSenderStateOrProvince();
			case TextPackage.SPAN_TYPE__AUTHOR_NAME:
				return getAuthorName();
			case TextPackage.SPAN_TYPE__AUTHOR_INITIALS:
				return getAuthorInitials();
			case TextPackage.SPAN_TYPE__CHAPTER:
				return getChapter();
			case TextPackage.SPAN_TYPE__FILE_NAME:
				return getFileName();
			case TextPackage.SPAN_TYPE__TEMPLATE_NAME:
				return getTemplateName();
			case TextPackage.SPAN_TYPE__SHEET_NAME:
				return getSheetName();
			case TextPackage.SPAN_TYPE__VARIABLE_SET:
				return getVariableSet();
			case TextPackage.SPAN_TYPE__VARIABLE_GET:
				return getVariableGet();
			case TextPackage.SPAN_TYPE__VARIABLE_INPUT:
				return getVariableInput();
			case TextPackage.SPAN_TYPE__USER_FIELD_GET:
				return getUserFieldGet();
			case TextPackage.SPAN_TYPE__USER_FIELD_INPUT:
				return getUserFieldInput();
			case TextPackage.SPAN_TYPE__SEQUENCE:
				return getSequence();
			case TextPackage.SPAN_TYPE__EXPRESSION:
				return getExpression();
			case TextPackage.SPAN_TYPE__TEXT_INPUT:
				return getTextInput();
			case TextPackage.SPAN_TYPE__INITIAL_CREATOR:
				return getInitialCreator();
			case TextPackage.SPAN_TYPE__CREATION_DATE:
				return getCreationDate();
			case TextPackage.SPAN_TYPE__CREATION_TIME:
				return getCreationTime();
			case TextPackage.SPAN_TYPE__DESCRIPTION:
				return getDescription();
			case TextPackage.SPAN_TYPE__USER_DEFINED:
				return getUserDefined();
			case TextPackage.SPAN_TYPE__PRINT_TIME:
				return getPrintTime();
			case TextPackage.SPAN_TYPE__PRINT_DATE:
				return getPrintDate();
			case TextPackage.SPAN_TYPE__PRINTED_BY:
				return getPrintedBy();
			case TextPackage.SPAN_TYPE__TITLE:
				return getTitle();
			case TextPackage.SPAN_TYPE__SUBJECT:
				return getSubject();
			case TextPackage.SPAN_TYPE__KEYWORDS:
				return getKeywords();
			case TextPackage.SPAN_TYPE__EDITING_CYCLES:
				return getEditingCycles();
			case TextPackage.SPAN_TYPE__EDITING_DURATION:
				return getEditingDuration();
			case TextPackage.SPAN_TYPE__MODIFICATION_TIME:
				return getModificationTime();
			case TextPackage.SPAN_TYPE__MODIFICATION_DATE:
				return getModificationDate();
			case TextPackage.SPAN_TYPE__CREATOR:
				return getCreator();
			case TextPackage.SPAN_TYPE__PAGE_COUNT:
				return getPageCount();
			case TextPackage.SPAN_TYPE__PARAGRAPH_COUNT:
				return getParagraphCount();
			case TextPackage.SPAN_TYPE__WORD_COUNT:
				return getWordCount();
			case TextPackage.SPAN_TYPE__CHARACTER_COUNT:
				return getCharacterCount();
			case TextPackage.SPAN_TYPE__TABLE_COUNT:
				return getTableCount();
			case TextPackage.SPAN_TYPE__IMAGE_COUNT:
				return getImageCount();
			case TextPackage.SPAN_TYPE__OBJECT_COUNT:
				return getObjectCount();
			case TextPackage.SPAN_TYPE__DATABASE_DISPLAY:
				return getDatabaseDisplay();
			case TextPackage.SPAN_TYPE__DATABASE_NEXT:
				return getDatabaseNext();
			case TextPackage.SPAN_TYPE__DATABASE_ROW_SELECT:
				return getDatabaseRowSelect();
			case TextPackage.SPAN_TYPE__DATABASE_ROW_NUMBER:
				return getDatabaseRowNumber();
			case TextPackage.SPAN_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_SET:
				return getPageVariableSet();
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_GET:
				return getPageVariableGet();
			case TextPackage.SPAN_TYPE__PLACEHOLDER:
				return getPlaceholder();
			case TextPackage.SPAN_TYPE__CONDITIONAL_TEXT:
				return getConditionalText();
			case TextPackage.SPAN_TYPE__HIDDEN_TEXT:
				return getHiddenText();
			case TextPackage.SPAN_TYPE__REFERENCE_REF:
				return getReferenceRef();
			case TextPackage.SPAN_TYPE__BOOKMARK_REF:
				return getBookmarkRef();
			case TextPackage.SPAN_TYPE__NOTE_REF:
				return getNoteRef();
			case TextPackage.SPAN_TYPE__SEQUENCE_REF:
				return getSequenceRef();
			case TextPackage.SPAN_TYPE__SCRIPT:
				return getScript();
			case TextPackage.SPAN_TYPE__EXECUTE_MACRO:
				return getExecuteMacro();
			case TextPackage.SPAN_TYPE__HIDDEN_PARAGRAPH:
				return getHiddenParagraph();
			case TextPackage.SPAN_TYPE__DDE_CONNECTION:
				return getDdeConnection();
			case TextPackage.SPAN_TYPE__MEASURE1:
				return getMeasure1();
			case TextPackage.SPAN_TYPE__TABLE_FORMULA:
				return getTableFormula();
			case TextPackage.SPAN_TYPE__TOC_MARK_START:
				return getTocMarkStart();
			case TextPackage.SPAN_TYPE__TOC_MARK_END:
				return getTocMarkEnd();
			case TextPackage.SPAN_TYPE__TOC_MARK:
				return getTocMark();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_START:
				return getUserIndexMarkStart();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_END:
				return getUserIndexMarkEnd();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK:
				return getUserIndexMark();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return getAlphabeticalIndexMarkStart();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return getAlphabeticalIndexMarkEnd();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK:
				return getAlphabeticalIndexMark();
			case TextPackage.SPAN_TYPE__BIBLIOGRAPHY_MARK:
				return getBibliographyMark();
			case TextPackage.SPAN_TYPE__HEADER:
				return getHeader();
			case TextPackage.SPAN_TYPE__FOOTER:
				return getFooter();
			case TextPackage.SPAN_TYPE__DATE_TIME:
				return getDateTime();
			case TextPackage.SPAN_TYPE__CLASS_NAMES:
				return getClassNames();
			case TextPackage.SPAN_TYPE__STYLE_NAME:
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
			case TextPackage.SPAN_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.SPAN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.SPAN_TYPE__S:
				getS().clear();
				getS().addAll((Collection<? extends SType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TAB:
				getTab().clear();
				getTab().addAll((Collection<? extends TabType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__LINE_BREAK:
				getLineBreak().clear();
				getLineBreak().addAll((Collection<? extends LineBreakType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK:
				getBookmark().clear();
				getBookmark().addAll((Collection<? extends BookmarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				getBookmarkStart().addAll((Collection<? extends BookmarkStartType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				getBookmarkEnd().addAll((Collection<? extends BookmarkEndType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				getReferenceMark().addAll((Collection<? extends ReferenceMarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				getReferenceMarkStart().addAll((Collection<? extends ReferenceMarkStartType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				getReferenceMarkEnd().addAll((Collection<? extends ReferenceMarkEndType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.SPAN_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__A1:
				getA1().clear();
				getA1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.drawing.AType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends TimeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_NUMBER:
				getPageNumber().clear();
				getPageNumber().addAll((Collection<? extends PageNumberType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				getPageContinuation().addAll((Collection<? extends PageContinuationType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				getSenderFirstname().addAll((Collection<? extends SenderFirstnameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				getSenderLastname().addAll((Collection<? extends SenderLastnameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				getSenderInitials().addAll((Collection<? extends SenderInitialsType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_TITLE:
				getSenderTitle().clear();
				getSenderTitle().addAll((Collection<? extends SenderTitleType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_POSITION:
				getSenderPosition().clear();
				getSenderPosition().addAll((Collection<? extends SenderPositionType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				getSenderEmail().addAll((Collection<? extends SenderEmailType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				getSenderPhonePrivate().addAll((Collection<? extends SenderPhonePrivateType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_FAX:
				getSenderFax().clear();
				getSenderFax().addAll((Collection<? extends SenderFaxType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				getSenderCompany().addAll((Collection<? extends SenderCompanyType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				getSenderPhoneWork().addAll((Collection<? extends SenderPhoneWorkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_STREET:
				getSenderStreet().clear();
				getSenderStreet().addAll((Collection<? extends SenderStreetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_CITY:
				getSenderCity().clear();
				getSenderCity().addAll((Collection<? extends SenderCityType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				getSenderPostalCode().addAll((Collection<? extends SenderPostalCodeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				getSenderCountry().addAll((Collection<? extends SenderCountryType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				getSenderStateOrProvince().addAll((Collection<? extends SenderStateOrProvinceType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__AUTHOR_NAME:
				getAuthorName().clear();
				getAuthorName().addAll((Collection<? extends AuthorNameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				getAuthorInitials().addAll((Collection<? extends AuthorInitialsType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CHAPTER:
				getChapter().clear();
				getChapter().addAll((Collection<? extends ChapterType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__FILE_NAME:
				getFileName().clear();
				getFileName().addAll((Collection<? extends FileNameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				getTemplateName().addAll((Collection<? extends TemplateNameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SHEET_NAME:
				getSheetName().clear();
				getSheetName().addAll((Collection<? extends String>)newValue);
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_SET:
				getVariableSet().clear();
				getVariableSet().addAll((Collection<? extends VariableSetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_GET:
				getVariableGet().clear();
				getVariableGet().addAll((Collection<? extends VariableGetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				getVariableInput().addAll((Collection<? extends VariableInputType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				getUserFieldGet().addAll((Collection<? extends UserFieldGetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				getUserFieldInput().addAll((Collection<? extends UserFieldInputType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ExpressionType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TEXT_INPUT:
				getTextInput().clear();
				getTextInput().addAll((Collection<? extends TextInputType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				getInitialCreator().addAll((Collection<? extends InitialCreatorType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CREATION_DATE:
				getCreationDate().clear();
				getCreationDate().addAll((Collection<? extends CreationDateType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CREATION_TIME:
				getCreationTime().clear();
				getCreationTime().addAll((Collection<? extends CreationTimeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_DEFINED:
				getUserDefined().clear();
				getUserDefined().addAll((Collection<? extends UserDefinedType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PRINT_TIME:
				getPrintTime().clear();
				getPrintTime().addAll((Collection<? extends PrintTimeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PRINT_DATE:
				getPrintDate().clear();
				getPrintDate().addAll((Collection<? extends PrintDateType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PRINTED_BY:
				getPrintedBy().clear();
				getPrintedBy().addAll((Collection<? extends PrintedByType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends KeywordsType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				getEditingCycles().addAll((Collection<? extends EditingCyclesType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__EDITING_DURATION:
				getEditingDuration().clear();
				getEditingDuration().addAll((Collection<? extends EditingDurationType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				getModificationTime().addAll((Collection<? extends ModificationTimeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				getModificationDate().addAll((Collection<? extends ModificationDateType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CREATOR:
				getCreator().clear();
				getCreator().addAll((Collection<? extends CreatorType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_COUNT:
				getPageCount().clear();
				getPageCount().addAll((Collection<? extends PageCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				getParagraphCount().addAll((Collection<? extends ParagraphCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__WORD_COUNT:
				getWordCount().clear();
				getWordCount().addAll((Collection<? extends WordCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				getCharacterCount().addAll((Collection<? extends CharacterCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TABLE_COUNT:
				getTableCount().clear();
				getTableCount().addAll((Collection<? extends TableCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__IMAGE_COUNT:
				getImageCount().clear();
				getImageCount().addAll((Collection<? extends ImageCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__OBJECT_COUNT:
				getObjectCount().clear();
				getObjectCount().addAll((Collection<? extends ObjectCountType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				getDatabaseDisplay().addAll((Collection<? extends TextDatabaseDisplayAttlist>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				getDatabaseNext().addAll((Collection<? extends TextDatabaseNextAttlist>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				getDatabaseRowSelect().addAll((Collection<? extends TextDatabaseRowSelectAttlist>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				getDatabaseRowNumber().addAll((Collection<? extends DatabaseRowNumberType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATABASE_NAME:
				getDatabaseName().clear();
				getDatabaseName().addAll((Collection<? extends DatabaseNameType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				getPageVariableSet().addAll((Collection<? extends PageVariableSetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				getPageVariableGet().addAll((Collection<? extends PageVariableGetType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__PLACEHOLDER:
				getPlaceholder().clear();
				getPlaceholder().addAll((Collection<? extends PlaceholderType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				getConditionalText().addAll((Collection<? extends ConditionalTextType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				getHiddenText().addAll((Collection<? extends HiddenTextType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_REF:
				getReferenceRef().clear();
				getReferenceRef().addAll((Collection<? extends ReferenceRefType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				getBookmarkRef().addAll((Collection<? extends BookmarkRefType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__NOTE_REF:
				getNoteRef().clear();
				getNoteRef().addAll((Collection<? extends NoteRefType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				getSequenceRef().addAll((Collection<? extends SequenceRefType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				getExecuteMacro().addAll((Collection<? extends ExecuteMacroType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				getHiddenParagraph().addAll((Collection<? extends HiddenParagraphType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				getDdeConnection().addAll((Collection<? extends DdeConnectionType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__MEASURE1:
				getMeasure1().clear();
				getMeasure1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TABLE_FORMULA:
				getTableFormula().clear();
				getTableFormula().addAll((Collection<? extends TableFormulaType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				getTocMarkStart().addAll((Collection<? extends TocMarkStartType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				getTocMarkEnd().addAll((Collection<? extends TocMarkEndType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK:
				getTocMark().clear();
				getTocMark().addAll((Collection<? extends TocMarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				getUserIndexMarkStart().addAll((Collection<? extends UserIndexMarkStartType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				getUserIndexMarkEnd().addAll((Collection<? extends UserIndexMarkEndType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				getUserIndexMark().addAll((Collection<? extends UserIndexMarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				getAlphabeticalIndexMarkStart().addAll((Collection<? extends AlphabeticalIndexMarkStartType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				getAlphabeticalIndexMarkEnd().addAll((Collection<? extends AlphabeticalIndexMarkEndType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				getAlphabeticalIndexMark().addAll((Collection<? extends AlphabeticalIndexMarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				getBibliographyMark().addAll((Collection<? extends BibliographyMarkType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends HeaderType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends FooterType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__DATE_TIME:
				getDateTime().clear();
				getDateTime().addAll((Collection<? extends DateTimeType>)newValue);
				return;
			case TextPackage.SPAN_TYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case TextPackage.SPAN_TYPE__STYLE_NAME:
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
			case TextPackage.SPAN_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.SPAN_TYPE__GROUP:
				getGroup().clear();
				return;
			case TextPackage.SPAN_TYPE__S:
				getS().clear();
				return;
			case TextPackage.SPAN_TYPE__TAB:
				getTab().clear();
				return;
			case TextPackage.SPAN_TYPE__LINE_BREAK:
				getLineBreak().clear();
				return;
			case TextPackage.SPAN_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.SPAN_TYPE__SPAN:
				getSpan().clear();
				return;
			case TextPackage.SPAN_TYPE__A:
				getA().clear();
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK:
				getBookmark().clear();
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_START:
				getBookmarkStart().clear();
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_END:
				getBookmarkEnd().clear();
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK:
				getReferenceMark().clear();
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_START:
				getReferenceMarkStart().clear();
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_END:
				getReferenceMarkEnd().clear();
				return;
			case TextPackage.SPAN_TYPE__NOTE:
				getNote().clear();
				return;
			case TextPackage.SPAN_TYPE__RUBY:
				getRuby().clear();
				return;
			case TextPackage.SPAN_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case TextPackage.SPAN_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.SPAN_TYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.SPAN_TYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.SPAN_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.SPAN_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.SPAN_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.SPAN_TYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.SPAN_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.SPAN_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.SPAN_TYPE__G:
				getG().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.SPAN_TYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.SPAN_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.SPAN_TYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.SPAN_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.SPAN_TYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.SPAN_TYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.SPAN_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.SPAN_TYPE__A1:
				getA1().clear();
				return;
			case TextPackage.SPAN_TYPE__DATE:
				getDate().clear();
				return;
			case TextPackage.SPAN_TYPE__TIME:
				getTime().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_NUMBER:
				getPageNumber().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_CONTINUATION:
				getPageContinuation().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_FIRSTNAME:
				getSenderFirstname().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_LASTNAME:
				getSenderLastname().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_INITIALS:
				getSenderInitials().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_TITLE:
				getSenderTitle().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_POSITION:
				getSenderPosition().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_EMAIL:
				getSenderEmail().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_PHONE_PRIVATE:
				getSenderPhonePrivate().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_FAX:
				getSenderFax().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_COMPANY:
				getSenderCompany().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_PHONE_WORK:
				getSenderPhoneWork().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_STREET:
				getSenderStreet().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_CITY:
				getSenderCity().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_POSTAL_CODE:
				getSenderPostalCode().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_COUNTRY:
				getSenderCountry().clear();
				return;
			case TextPackage.SPAN_TYPE__SENDER_STATE_OR_PROVINCE:
				getSenderStateOrProvince().clear();
				return;
			case TextPackage.SPAN_TYPE__AUTHOR_NAME:
				getAuthorName().clear();
				return;
			case TextPackage.SPAN_TYPE__AUTHOR_INITIALS:
				getAuthorInitials().clear();
				return;
			case TextPackage.SPAN_TYPE__CHAPTER:
				getChapter().clear();
				return;
			case TextPackage.SPAN_TYPE__FILE_NAME:
				getFileName().clear();
				return;
			case TextPackage.SPAN_TYPE__TEMPLATE_NAME:
				getTemplateName().clear();
				return;
			case TextPackage.SPAN_TYPE__SHEET_NAME:
				getSheetName().clear();
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_SET:
				getVariableSet().clear();
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_GET:
				getVariableGet().clear();
				return;
			case TextPackage.SPAN_TYPE__VARIABLE_INPUT:
				getVariableInput().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_FIELD_GET:
				getUserFieldGet().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_FIELD_INPUT:
				getUserFieldInput().clear();
				return;
			case TextPackage.SPAN_TYPE__SEQUENCE:
				getSequence().clear();
				return;
			case TextPackage.SPAN_TYPE__EXPRESSION:
				getExpression().clear();
				return;
			case TextPackage.SPAN_TYPE__TEXT_INPUT:
				getTextInput().clear();
				return;
			case TextPackage.SPAN_TYPE__INITIAL_CREATOR:
				getInitialCreator().clear();
				return;
			case TextPackage.SPAN_TYPE__CREATION_DATE:
				getCreationDate().clear();
				return;
			case TextPackage.SPAN_TYPE__CREATION_TIME:
				getCreationTime().clear();
				return;
			case TextPackage.SPAN_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_DEFINED:
				getUserDefined().clear();
				return;
			case TextPackage.SPAN_TYPE__PRINT_TIME:
				getPrintTime().clear();
				return;
			case TextPackage.SPAN_TYPE__PRINT_DATE:
				getPrintDate().clear();
				return;
			case TextPackage.SPAN_TYPE__PRINTED_BY:
				getPrintedBy().clear();
				return;
			case TextPackage.SPAN_TYPE__TITLE:
				getTitle().clear();
				return;
			case TextPackage.SPAN_TYPE__SUBJECT:
				getSubject().clear();
				return;
			case TextPackage.SPAN_TYPE__KEYWORDS:
				getKeywords().clear();
				return;
			case TextPackage.SPAN_TYPE__EDITING_CYCLES:
				getEditingCycles().clear();
				return;
			case TextPackage.SPAN_TYPE__EDITING_DURATION:
				getEditingDuration().clear();
				return;
			case TextPackage.SPAN_TYPE__MODIFICATION_TIME:
				getModificationTime().clear();
				return;
			case TextPackage.SPAN_TYPE__MODIFICATION_DATE:
				getModificationDate().clear();
				return;
			case TextPackage.SPAN_TYPE__CREATOR:
				getCreator().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_COUNT:
				getPageCount().clear();
				return;
			case TextPackage.SPAN_TYPE__PARAGRAPH_COUNT:
				getParagraphCount().clear();
				return;
			case TextPackage.SPAN_TYPE__WORD_COUNT:
				getWordCount().clear();
				return;
			case TextPackage.SPAN_TYPE__CHARACTER_COUNT:
				getCharacterCount().clear();
				return;
			case TextPackage.SPAN_TYPE__TABLE_COUNT:
				getTableCount().clear();
				return;
			case TextPackage.SPAN_TYPE__IMAGE_COUNT:
				getImageCount().clear();
				return;
			case TextPackage.SPAN_TYPE__OBJECT_COUNT:
				getObjectCount().clear();
				return;
			case TextPackage.SPAN_TYPE__DATABASE_DISPLAY:
				getDatabaseDisplay().clear();
				return;
			case TextPackage.SPAN_TYPE__DATABASE_NEXT:
				getDatabaseNext().clear();
				return;
			case TextPackage.SPAN_TYPE__DATABASE_ROW_SELECT:
				getDatabaseRowSelect().clear();
				return;
			case TextPackage.SPAN_TYPE__DATABASE_ROW_NUMBER:
				getDatabaseRowNumber().clear();
				return;
			case TextPackage.SPAN_TYPE__DATABASE_NAME:
				getDatabaseName().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_SET:
				getPageVariableSet().clear();
				return;
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_GET:
				getPageVariableGet().clear();
				return;
			case TextPackage.SPAN_TYPE__PLACEHOLDER:
				getPlaceholder().clear();
				return;
			case TextPackage.SPAN_TYPE__CONDITIONAL_TEXT:
				getConditionalText().clear();
				return;
			case TextPackage.SPAN_TYPE__HIDDEN_TEXT:
				getHiddenText().clear();
				return;
			case TextPackage.SPAN_TYPE__REFERENCE_REF:
				getReferenceRef().clear();
				return;
			case TextPackage.SPAN_TYPE__BOOKMARK_REF:
				getBookmarkRef().clear();
				return;
			case TextPackage.SPAN_TYPE__NOTE_REF:
				getNoteRef().clear();
				return;
			case TextPackage.SPAN_TYPE__SEQUENCE_REF:
				getSequenceRef().clear();
				return;
			case TextPackage.SPAN_TYPE__SCRIPT:
				getScript().clear();
				return;
			case TextPackage.SPAN_TYPE__EXECUTE_MACRO:
				getExecuteMacro().clear();
				return;
			case TextPackage.SPAN_TYPE__HIDDEN_PARAGRAPH:
				getHiddenParagraph().clear();
				return;
			case TextPackage.SPAN_TYPE__DDE_CONNECTION:
				getDdeConnection().clear();
				return;
			case TextPackage.SPAN_TYPE__MEASURE1:
				getMeasure1().clear();
				return;
			case TextPackage.SPAN_TYPE__TABLE_FORMULA:
				getTableFormula().clear();
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK_START:
				getTocMarkStart().clear();
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK_END:
				getTocMarkEnd().clear();
				return;
			case TextPackage.SPAN_TYPE__TOC_MARK:
				getTocMark().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_START:
				getUserIndexMarkStart().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_END:
				getUserIndexMarkEnd().clear();
				return;
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK:
				getUserIndexMark().clear();
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_START:
				getAlphabeticalIndexMarkStart().clear();
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_END:
				getAlphabeticalIndexMarkEnd().clear();
				return;
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK:
				getAlphabeticalIndexMark().clear();
				return;
			case TextPackage.SPAN_TYPE__BIBLIOGRAPHY_MARK:
				getBibliographyMark().clear();
				return;
			case TextPackage.SPAN_TYPE__HEADER:
				getHeader().clear();
				return;
			case TextPackage.SPAN_TYPE__FOOTER:
				getFooter().clear();
				return;
			case TextPackage.SPAN_TYPE__DATE_TIME:
				getDateTime().clear();
				return;
			case TextPackage.SPAN_TYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case TextPackage.SPAN_TYPE__STYLE_NAME:
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
			case TextPackage.SPAN_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.SPAN_TYPE__GROUP:
				return !getGroup().isEmpty();
			case TextPackage.SPAN_TYPE__S:
				return !getS().isEmpty();
			case TextPackage.SPAN_TYPE__TAB:
				return !getTab().isEmpty();
			case TextPackage.SPAN_TYPE__LINE_BREAK:
				return !getLineBreak().isEmpty();
			case TextPackage.SPAN_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.SPAN_TYPE__SPAN:
				return !getSpan().isEmpty();
			case TextPackage.SPAN_TYPE__A:
				return !getA().isEmpty();
			case TextPackage.SPAN_TYPE__BOOKMARK:
				return !getBookmark().isEmpty();
			case TextPackage.SPAN_TYPE__BOOKMARK_START:
				return !getBookmarkStart().isEmpty();
			case TextPackage.SPAN_TYPE__BOOKMARK_END:
				return !getBookmarkEnd().isEmpty();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK:
				return !getReferenceMark().isEmpty();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_START:
				return !getReferenceMarkStart().isEmpty();
			case TextPackage.SPAN_TYPE__REFERENCE_MARK_END:
				return !getReferenceMarkEnd().isEmpty();
			case TextPackage.SPAN_TYPE__NOTE:
				return !getNote().isEmpty();
			case TextPackage.SPAN_TYPE__RUBY:
				return !getRuby().isEmpty();
			case TextPackage.SPAN_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case TextPackage.SPAN_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.SPAN_TYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.SPAN_TYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.SPAN_TYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.SPAN_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.SPAN_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.SPAN_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.SPAN_TYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.SPAN_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.SPAN_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.SPAN_TYPE__G:
				return !getG().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.SPAN_TYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.SPAN_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.SPAN_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.SPAN_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.SPAN_TYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.SPAN_TYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.SPAN_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.SPAN_TYPE__A1:
				return !getA1().isEmpty();
			case TextPackage.SPAN_TYPE__DATE:
				return !getDate().isEmpty();
			case TextPackage.SPAN_TYPE__TIME:
				return !getTime().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_NUMBER:
				return !getPageNumber().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_CONTINUATION:
				return !getPageContinuation().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_FIRSTNAME:
				return !getSenderFirstname().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_LASTNAME:
				return !getSenderLastname().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_INITIALS:
				return !getSenderInitials().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_TITLE:
				return !getSenderTitle().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_POSITION:
				return !getSenderPosition().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_EMAIL:
				return !getSenderEmail().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_PHONE_PRIVATE:
				return !getSenderPhonePrivate().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_FAX:
				return !getSenderFax().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_COMPANY:
				return !getSenderCompany().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_PHONE_WORK:
				return !getSenderPhoneWork().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_STREET:
				return !getSenderStreet().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_CITY:
				return !getSenderCity().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_POSTAL_CODE:
				return !getSenderPostalCode().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_COUNTRY:
				return !getSenderCountry().isEmpty();
			case TextPackage.SPAN_TYPE__SENDER_STATE_OR_PROVINCE:
				return !getSenderStateOrProvince().isEmpty();
			case TextPackage.SPAN_TYPE__AUTHOR_NAME:
				return !getAuthorName().isEmpty();
			case TextPackage.SPAN_TYPE__AUTHOR_INITIALS:
				return !getAuthorInitials().isEmpty();
			case TextPackage.SPAN_TYPE__CHAPTER:
				return !getChapter().isEmpty();
			case TextPackage.SPAN_TYPE__FILE_NAME:
				return !getFileName().isEmpty();
			case TextPackage.SPAN_TYPE__TEMPLATE_NAME:
				return !getTemplateName().isEmpty();
			case TextPackage.SPAN_TYPE__SHEET_NAME:
				return !getSheetName().isEmpty();
			case TextPackage.SPAN_TYPE__VARIABLE_SET:
				return !getVariableSet().isEmpty();
			case TextPackage.SPAN_TYPE__VARIABLE_GET:
				return !getVariableGet().isEmpty();
			case TextPackage.SPAN_TYPE__VARIABLE_INPUT:
				return !getVariableInput().isEmpty();
			case TextPackage.SPAN_TYPE__USER_FIELD_GET:
				return !getUserFieldGet().isEmpty();
			case TextPackage.SPAN_TYPE__USER_FIELD_INPUT:
				return !getUserFieldInput().isEmpty();
			case TextPackage.SPAN_TYPE__SEQUENCE:
				return !getSequence().isEmpty();
			case TextPackage.SPAN_TYPE__EXPRESSION:
				return !getExpression().isEmpty();
			case TextPackage.SPAN_TYPE__TEXT_INPUT:
				return !getTextInput().isEmpty();
			case TextPackage.SPAN_TYPE__INITIAL_CREATOR:
				return !getInitialCreator().isEmpty();
			case TextPackage.SPAN_TYPE__CREATION_DATE:
				return !getCreationDate().isEmpty();
			case TextPackage.SPAN_TYPE__CREATION_TIME:
				return !getCreationTime().isEmpty();
			case TextPackage.SPAN_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case TextPackage.SPAN_TYPE__USER_DEFINED:
				return !getUserDefined().isEmpty();
			case TextPackage.SPAN_TYPE__PRINT_TIME:
				return !getPrintTime().isEmpty();
			case TextPackage.SPAN_TYPE__PRINT_DATE:
				return !getPrintDate().isEmpty();
			case TextPackage.SPAN_TYPE__PRINTED_BY:
				return !getPrintedBy().isEmpty();
			case TextPackage.SPAN_TYPE__TITLE:
				return !getTitle().isEmpty();
			case TextPackage.SPAN_TYPE__SUBJECT:
				return !getSubject().isEmpty();
			case TextPackage.SPAN_TYPE__KEYWORDS:
				return !getKeywords().isEmpty();
			case TextPackage.SPAN_TYPE__EDITING_CYCLES:
				return !getEditingCycles().isEmpty();
			case TextPackage.SPAN_TYPE__EDITING_DURATION:
				return !getEditingDuration().isEmpty();
			case TextPackage.SPAN_TYPE__MODIFICATION_TIME:
				return !getModificationTime().isEmpty();
			case TextPackage.SPAN_TYPE__MODIFICATION_DATE:
				return !getModificationDate().isEmpty();
			case TextPackage.SPAN_TYPE__CREATOR:
				return !getCreator().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_COUNT:
				return !getPageCount().isEmpty();
			case TextPackage.SPAN_TYPE__PARAGRAPH_COUNT:
				return !getParagraphCount().isEmpty();
			case TextPackage.SPAN_TYPE__WORD_COUNT:
				return !getWordCount().isEmpty();
			case TextPackage.SPAN_TYPE__CHARACTER_COUNT:
				return !getCharacterCount().isEmpty();
			case TextPackage.SPAN_TYPE__TABLE_COUNT:
				return !getTableCount().isEmpty();
			case TextPackage.SPAN_TYPE__IMAGE_COUNT:
				return !getImageCount().isEmpty();
			case TextPackage.SPAN_TYPE__OBJECT_COUNT:
				return !getObjectCount().isEmpty();
			case TextPackage.SPAN_TYPE__DATABASE_DISPLAY:
				return !getDatabaseDisplay().isEmpty();
			case TextPackage.SPAN_TYPE__DATABASE_NEXT:
				return !getDatabaseNext().isEmpty();
			case TextPackage.SPAN_TYPE__DATABASE_ROW_SELECT:
				return !getDatabaseRowSelect().isEmpty();
			case TextPackage.SPAN_TYPE__DATABASE_ROW_NUMBER:
				return !getDatabaseRowNumber().isEmpty();
			case TextPackage.SPAN_TYPE__DATABASE_NAME:
				return !getDatabaseName().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_SET:
				return !getPageVariableSet().isEmpty();
			case TextPackage.SPAN_TYPE__PAGE_VARIABLE_GET:
				return !getPageVariableGet().isEmpty();
			case TextPackage.SPAN_TYPE__PLACEHOLDER:
				return !getPlaceholder().isEmpty();
			case TextPackage.SPAN_TYPE__CONDITIONAL_TEXT:
				return !getConditionalText().isEmpty();
			case TextPackage.SPAN_TYPE__HIDDEN_TEXT:
				return !getHiddenText().isEmpty();
			case TextPackage.SPAN_TYPE__REFERENCE_REF:
				return !getReferenceRef().isEmpty();
			case TextPackage.SPAN_TYPE__BOOKMARK_REF:
				return !getBookmarkRef().isEmpty();
			case TextPackage.SPAN_TYPE__NOTE_REF:
				return !getNoteRef().isEmpty();
			case TextPackage.SPAN_TYPE__SEQUENCE_REF:
				return !getSequenceRef().isEmpty();
			case TextPackage.SPAN_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case TextPackage.SPAN_TYPE__EXECUTE_MACRO:
				return !getExecuteMacro().isEmpty();
			case TextPackage.SPAN_TYPE__HIDDEN_PARAGRAPH:
				return !getHiddenParagraph().isEmpty();
			case TextPackage.SPAN_TYPE__DDE_CONNECTION:
				return !getDdeConnection().isEmpty();
			case TextPackage.SPAN_TYPE__MEASURE1:
				return !getMeasure1().isEmpty();
			case TextPackage.SPAN_TYPE__TABLE_FORMULA:
				return !getTableFormula().isEmpty();
			case TextPackage.SPAN_TYPE__TOC_MARK_START:
				return !getTocMarkStart().isEmpty();
			case TextPackage.SPAN_TYPE__TOC_MARK_END:
				return !getTocMarkEnd().isEmpty();
			case TextPackage.SPAN_TYPE__TOC_MARK:
				return !getTocMark().isEmpty();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_START:
				return !getUserIndexMarkStart().isEmpty();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK_END:
				return !getUserIndexMarkEnd().isEmpty();
			case TextPackage.SPAN_TYPE__USER_INDEX_MARK:
				return !getUserIndexMark().isEmpty();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_START:
				return !getAlphabeticalIndexMarkStart().isEmpty();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK_END:
				return !getAlphabeticalIndexMarkEnd().isEmpty();
			case TextPackage.SPAN_TYPE__ALPHABETICAL_INDEX_MARK:
				return !getAlphabeticalIndexMark().isEmpty();
			case TextPackage.SPAN_TYPE__BIBLIOGRAPHY_MARK:
				return !getBibliographyMark().isEmpty();
			case TextPackage.SPAN_TYPE__HEADER:
				return !getHeader().isEmpty();
			case TextPackage.SPAN_TYPE__FOOTER:
				return !getFooter().isEmpty();
			case TextPackage.SPAN_TYPE__DATE_TIME:
				return !getDateTime().isEmpty();
			case TextPackage.SPAN_TYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case TextPackage.SPAN_TYPE__STYLE_NAME:
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
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //SpanTypeImpl
