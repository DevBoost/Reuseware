/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getDateString <em>Date String</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getCaptionPointX <em>Caption Point X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getCaptionPointY <em>Caption Point Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeImpl extends EObjectImpl implements AnnotationType {
	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateString() <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateString()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateString() <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateString()
	 * @generated
	 * @ordered
	 */
	protected String dateString = DATE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAnchorPageNumber() <em>Anchor Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANCHOR_PAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorPageNumber() <em>Anchor Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorPageNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anchorPageNumber = ANCHOR_PAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorType() <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorType()
	 * @generated
	 * @ordered
	 */
	protected static final AnchorTypeType ANCHOR_TYPE_EDEFAULT = AnchorTypeType.PAGE;

	/**
	 * The cached value of the '{@link #getAnchorType() <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorType()
	 * @generated
	 * @ordered
	 */
	protected AnchorTypeType anchorType = ANCHOR_TYPE_EDEFAULT;

	/**
	 * This is true if the Anchor Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorTypeESet;

	/**
	 * The default value of the '{@link #getCaptionPointX() <em>Caption Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointX()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_POINT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionPointX() <em>Caption Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointX()
	 * @generated
	 * @ordered
	 */
	protected String captionPointX = CAPTION_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionPointY() <em>Caption Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointY()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_POINT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionPointY() <em>Caption Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointY()
	 * @generated
	 * @ordered
	 */
	protected String captionPointY = CAPTION_POINT_Y_EDEFAULT;

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
	 * The default value of the '{@link #getClassNames1() <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_NAMES1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNames1() <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames1()
	 * @generated
	 * @ordered
	 */
	protected List<String> classNames1 = CLASS_NAMES1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String CORNER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected String cornerRadius = CORNER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getEndCellAddress() <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String END_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndCellAddress() <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String endCellAddress = END_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected static final String END_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected String endX = END_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected static final String END_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected String endY = END_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected String layer = LAYER_EDEFAULT;

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
	 * The default value of the '{@link #getStyleName1() <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName1()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName1() <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName1()
	 * @generated
	 * @ordered
	 */
	protected String styleName1 = STYLE_NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableBackground() <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableBackground()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TABLE_BACKGROUND_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTableBackground() <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableBackground()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tableBackground = TABLE_BACKGROUND_EDEFAULT;

	/**
	 * This is true if the Table Background attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableBackgroundESet;

	/**
	 * The default value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String textStyleName = TEXT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ZINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger zIndex = ZINDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.ANNOTATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(XMLGregorianCalendar newDate) {
		XMLGregorianCalendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateString() {
		return dateString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateString(String newDateString) {
		String oldDateString = dateString;
		dateString = newDateString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__DATE_STRING, oldDateString, dateString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.ANNOTATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(OfficePackage.Literals.ANNOTATION_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getGroup().list(OfficePackage.Literals.ANNOTATION_TYPE__LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAnchorPageNumber() {
		return anchorPageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorPageNumber(BigInteger newAnchorPageNumber) {
		BigInteger oldAnchorPageNumber = anchorPageNumber;
		anchorPageNumber = newAnchorPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER, oldAnchorPageNumber, anchorPageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorTypeType getAnchorType() {
		return anchorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorType(AnchorTypeType newAnchorType) {
		AnchorTypeType oldAnchorType = anchorType;
		anchorType = newAnchorType == null ? ANCHOR_TYPE_EDEFAULT : newAnchorType;
		boolean oldAnchorTypeESet = anchorTypeESet;
		anchorTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE, oldAnchorType, anchorType, !oldAnchorTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnchorType() {
		AnchorTypeType oldAnchorType = anchorType;
		boolean oldAnchorTypeESet = anchorTypeESet;
		anchorType = ANCHOR_TYPE_EDEFAULT;
		anchorTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE, oldAnchorType, ANCHOR_TYPE_EDEFAULT, oldAnchorTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnchorType() {
		return anchorTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionPointX() {
		return captionPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionPointX(String newCaptionPointX) {
		String oldCaptionPointX = captionPointX;
		captionPointX = newCaptionPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_X, oldCaptionPointX, captionPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionPointY() {
		return captionPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionPointY(String newCaptionPointY) {
		String oldCaptionPointY = captionPointY;
		captionPointY = newCaptionPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_Y, oldCaptionPointY, captionPointY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CLASS_NAMES, oldClassNames, classNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClassNames1() {
		return classNames1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNames1(List<String> newClassNames1) {
		List<String> oldClassNames1 = classNames1;
		classNames1 = newClassNames1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CLASS_NAMES1, oldClassNames1, classNames1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerRadius(String newCornerRadius) {
		String oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__CORNER_RADIUS, oldCornerRadius, cornerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.ANNOTATION_TYPE__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndCellAddress() {
		return endCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndCellAddress(String newEndCellAddress) {
		String oldEndCellAddress = endCellAddress;
		endCellAddress = newEndCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__END_CELL_ADDRESS, oldEndCellAddress, endCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndX() {
		return endX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndX(String newEndX) {
		String oldEndX = endX;
		endX = newEndX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__END_X, oldEndX, endX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndY() {
		return endY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndY(String newEndY) {
		String oldEndY = endY;
		endY = newEndY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__END_Y, oldEndY, endY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(String newLayer) {
		String oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__LAYER, oldLayer, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName1() {
		return styleName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName1(String newStyleName1) {
		String oldStyleName1 = styleName1;
		styleName1 = newStyleName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__STYLE_NAME1, oldStyleName1, styleName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground() {
		return tableBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTableBackground) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTableBackground = tableBackground;
		tableBackground = newTableBackground == null ? TABLE_BACKGROUND_EDEFAULT : newTableBackground;
		boolean oldTableBackgroundESet = tableBackgroundESet;
		tableBackgroundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND, oldTableBackground, tableBackground, !oldTableBackgroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTableBackground() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTableBackground = tableBackground;
		boolean oldTableBackgroundESet = tableBackgroundESet;
		tableBackground = TABLE_BACKGROUND_EDEFAULT;
		tableBackgroundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND, oldTableBackground, TABLE_BACKGROUND_EDEFAULT, oldTableBackgroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTableBackground() {
		return tableBackgroundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyleName() {
		return textStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyleName(String newTextStyleName) {
		String oldTextStyleName = textStyleName;
		textStyleName = newTextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__TEXT_STYLE_NAME, oldTextStyleName, textStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getZIndex() {
		return zIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZIndex(BigInteger newZIndex) {
		BigInteger oldZIndex = zIndex;
		zIndex = newZIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.ANNOTATION_TYPE__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.ANNOTATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.ANNOTATION_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case OfficePackage.ANNOTATION_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.ANNOTATION_TYPE__CREATOR:
				return getCreator();
			case OfficePackage.ANNOTATION_TYPE__DATE:
				return getDate();
			case OfficePackage.ANNOTATION_TYPE__DATE_STRING:
				return getDateString();
			case OfficePackage.ANNOTATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.ANNOTATION_TYPE__P:
				return getP();
			case OfficePackage.ANNOTATION_TYPE__LIST:
				return getList();
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER:
				return getAnchorPageNumber();
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE:
				return getAnchorType();
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_X:
				return getCaptionPointX();
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_Y:
				return getCaptionPointY();
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES:
				return getClassNames();
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES1:
				return getClassNames1();
			case OfficePackage.ANNOTATION_TYPE__CORNER_RADIUS:
				return getCornerRadius();
			case OfficePackage.ANNOTATION_TYPE__DISPLAY:
				return getDisplay();
			case OfficePackage.ANNOTATION_TYPE__END_CELL_ADDRESS:
				return getEndCellAddress();
			case OfficePackage.ANNOTATION_TYPE__END_X:
				return getEndX();
			case OfficePackage.ANNOTATION_TYPE__END_Y:
				return getEndY();
			case OfficePackage.ANNOTATION_TYPE__HEIGHT:
				return getHeight();
			case OfficePackage.ANNOTATION_TYPE__ID:
				return getId();
			case OfficePackage.ANNOTATION_TYPE__LAYER:
				return getLayer();
			case OfficePackage.ANNOTATION_TYPE__NAME:
				return getName();
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME:
				return getStyleName();
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME1:
				return getStyleName1();
			case OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND:
				return getTableBackground();
			case OfficePackage.ANNOTATION_TYPE__TEXT_STYLE_NAME:
				return getTextStyleName();
			case OfficePackage.ANNOTATION_TYPE__TRANSFORM:
				return getTransform();
			case OfficePackage.ANNOTATION_TYPE__WIDTH:
				return getWidth();
			case OfficePackage.ANNOTATION_TYPE__X:
				return getX();
			case OfficePackage.ANNOTATION_TYPE__Y:
				return getY();
			case OfficePackage.ANNOTATION_TYPE__ZINDEX:
				return getZIndex();
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
			case OfficePackage.ANNOTATION_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__DATE_STRING:
				setDateString((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber((BigInteger)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE:
				setAnchorType((AnchorTypeType)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_X:
				setCaptionPointX((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_Y:
				setCaptionPointY((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES1:
				setClassNames1((List<String>)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__CORNER_RADIUS:
				setCornerRadius((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__END_CELL_ADDRESS:
				setEndCellAddress((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__END_X:
				setEndX((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__END_Y:
				setEndY((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__ID:
				setId((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__LAYER:
				setLayer((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME1:
				setStyleName1((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND:
				setTableBackground((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__TEXT_STYLE_NAME:
				setTextStyleName((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__X:
				setX((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__Y:
				setY((String)newValue);
				return;
			case OfficePackage.ANNOTATION_TYPE__ZINDEX:
				setZIndex((BigInteger)newValue);
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
			case OfficePackage.ANNOTATION_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__DATE_STRING:
				setDateString(DATE_STRING_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.ANNOTATION_TYPE__P:
				getP().clear();
				return;
			case OfficePackage.ANNOTATION_TYPE__LIST:
				getList().clear();
				return;
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber(ANCHOR_PAGE_NUMBER_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE:
				unsetAnchorType();
				return;
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_X:
				setCaptionPointX(CAPTION_POINT_X_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_Y:
				setCaptionPointY(CAPTION_POINT_Y_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES1:
				setClassNames1(CLASS_NAMES1_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__CORNER_RADIUS:
				setCornerRadius(CORNER_RADIUS_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__DISPLAY:
				unsetDisplay();
				return;
			case OfficePackage.ANNOTATION_TYPE__END_CELL_ADDRESS:
				setEndCellAddress(END_CELL_ADDRESS_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME1:
				setStyleName1(STYLE_NAME1_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND:
				unsetTableBackground();
				return;
			case OfficePackage.ANNOTATION_TYPE__TEXT_STYLE_NAME:
				setTextStyleName(TEXT_STYLE_NAME_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__Y:
				setY(Y_EDEFAULT);
				return;
			case OfficePackage.ANNOTATION_TYPE__ZINDEX:
				setZIndex(ZINDEX_EDEFAULT);
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
			case OfficePackage.ANNOTATION_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case OfficePackage.ANNOTATION_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case OfficePackage.ANNOTATION_TYPE__DATE_STRING:
				return DATE_STRING_EDEFAULT == null ? dateString != null : !DATE_STRING_EDEFAULT.equals(dateString);
			case OfficePackage.ANNOTATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.ANNOTATION_TYPE__P:
				return !getP().isEmpty();
			case OfficePackage.ANNOTATION_TYPE__LIST:
				return !getList().isEmpty();
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER:
				return ANCHOR_PAGE_NUMBER_EDEFAULT == null ? anchorPageNumber != null : !ANCHOR_PAGE_NUMBER_EDEFAULT.equals(anchorPageNumber);
			case OfficePackage.ANNOTATION_TYPE__ANCHOR_TYPE:
				return isSetAnchorType();
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_X:
				return CAPTION_POINT_X_EDEFAULT == null ? captionPointX != null : !CAPTION_POINT_X_EDEFAULT.equals(captionPointX);
			case OfficePackage.ANNOTATION_TYPE__CAPTION_POINT_Y:
				return CAPTION_POINT_Y_EDEFAULT == null ? captionPointY != null : !CAPTION_POINT_Y_EDEFAULT.equals(captionPointY);
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case OfficePackage.ANNOTATION_TYPE__CLASS_NAMES1:
				return CLASS_NAMES1_EDEFAULT == null ? classNames1 != null : !CLASS_NAMES1_EDEFAULT.equals(classNames1);
			case OfficePackage.ANNOTATION_TYPE__CORNER_RADIUS:
				return CORNER_RADIUS_EDEFAULT == null ? cornerRadius != null : !CORNER_RADIUS_EDEFAULT.equals(cornerRadius);
			case OfficePackage.ANNOTATION_TYPE__DISPLAY:
				return isSetDisplay();
			case OfficePackage.ANNOTATION_TYPE__END_CELL_ADDRESS:
				return END_CELL_ADDRESS_EDEFAULT == null ? endCellAddress != null : !END_CELL_ADDRESS_EDEFAULT.equals(endCellAddress);
			case OfficePackage.ANNOTATION_TYPE__END_X:
				return END_X_EDEFAULT == null ? endX != null : !END_X_EDEFAULT.equals(endX);
			case OfficePackage.ANNOTATION_TYPE__END_Y:
				return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
			case OfficePackage.ANNOTATION_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case OfficePackage.ANNOTATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OfficePackage.ANNOTATION_TYPE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case OfficePackage.ANNOTATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case OfficePackage.ANNOTATION_TYPE__STYLE_NAME1:
				return STYLE_NAME1_EDEFAULT == null ? styleName1 != null : !STYLE_NAME1_EDEFAULT.equals(styleName1);
			case OfficePackage.ANNOTATION_TYPE__TABLE_BACKGROUND:
				return isSetTableBackground();
			case OfficePackage.ANNOTATION_TYPE__TEXT_STYLE_NAME:
				return TEXT_STYLE_NAME_EDEFAULT == null ? textStyleName != null : !TEXT_STYLE_NAME_EDEFAULT.equals(textStyleName);
			case OfficePackage.ANNOTATION_TYPE__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case OfficePackage.ANNOTATION_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case OfficePackage.ANNOTATION_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case OfficePackage.ANNOTATION_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case OfficePackage.ANNOTATION_TYPE__ZINDEX:
				return ZINDEX_EDEFAULT == null ? zIndex != null : !ZINDEX_EDEFAULT.equals(zIndex);
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
		result.append(" (creator: ");
		result.append(creator);
		result.append(", date: ");
		result.append(date);
		result.append(", dateString: ");
		result.append(dateString);
		result.append(", group: ");
		result.append(group);
		result.append(", anchorPageNumber: ");
		result.append(anchorPageNumber);
		result.append(", anchorType: ");
		if (anchorTypeESet) result.append(anchorType); else result.append("<unset>");
		result.append(", captionPointX: ");
		result.append(captionPointX);
		result.append(", captionPointY: ");
		result.append(captionPointY);
		result.append(", classNames: ");
		result.append(classNames);
		result.append(", classNames1: ");
		result.append(classNames1);
		result.append(", cornerRadius: ");
		result.append(cornerRadius);
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", endCellAddress: ");
		result.append(endCellAddress);
		result.append(", endX: ");
		result.append(endX);
		result.append(", endY: ");
		result.append(endY);
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", layer: ");
		result.append(layer);
		result.append(", name: ");
		result.append(name);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", styleName1: ");
		result.append(styleName1);
		result.append(", tableBackground: ");
		if (tableBackgroundESet) result.append(tableBackground); else result.append("<unset>");
		result.append(", textStyleName: ");
		result.append(textStyleName);
		result.append(", transform: ");
		result.append(transform);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", zIndex: ");
		result.append(zIndex);
		result.append(')');
		return result.toString();
	}

} //AnnotationTypeImpl
