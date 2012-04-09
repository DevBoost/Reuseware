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
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import java.math.BigInteger;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GTypeImpl extends EObjectImpl implements GType {
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
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventListeners() <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventListeners()
	 * @generated
	 * @ordered
	 */
	protected EventListenersType eventListeners;

	/**
	 * The cached value of the '{@link #getGluePoint() <em>Glue Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<GluePointType> gluePoint;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shape;

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
	 * The default value of the '{@link #getCaptionId() <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionId() <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionId()
	 * @generated
	 * @ordered
	 */
	protected String captionId = CAPTION_ID_EDEFAULT;

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
	protected GTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getGType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType getEventListeners() {
		return eventListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListeners(EventListenersType newEventListeners, NotificationChain msgs) {
		EventListenersType oldEventListeners = eventListeners;
		eventListeners = newEventListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__EVENT_LISTENERS, oldEventListeners, newEventListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListeners(EventListenersType newEventListeners) {
		if (newEventListeners != eventListeners) {
			NotificationChain msgs = null;
			if (eventListeners != null)
				msgs = ((InternalEObject)eventListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.GTYPE__EVENT_LISTENERS, null, msgs);
			if (newEventListeners != null)
				msgs = ((InternalEObject)newEventListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.GTYPE__EVENT_LISTENERS, null, msgs);
			msgs = basicSetEventListeners(newEventListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__EVENT_LISTENERS, newEventListeners, newEventListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GluePointType> getGluePoint() {
		if (gluePoint == null) {
			gluePoint = new EObjectContainmentEList<GluePointType>(GluePointType.class, this, DrawingPackage.GTYPE__GLUE_POINT);
		}
		return gluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, DrawingPackage.GTYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(DrawingPackage.eINSTANCE.getGType_CustomShape());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__ANCHOR_PAGE_NUMBER, oldAnchorPageNumber, anchorPageNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__ANCHOR_TYPE, oldAnchorType, anchorType, !oldAnchorTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.GTYPE__ANCHOR_TYPE, oldAnchorType, ANCHOR_TYPE_EDEFAULT, oldAnchorTypeESet));
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
	public String getCaptionId() {
		return captionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionId(String newCaptionId) {
		String oldCaptionId = captionId;
		captionId = newCaptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__CAPTION_ID, oldCaptionId, captionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__CLASS_NAMES, oldClassNames, classNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__CLASS_NAMES1, oldClassNames1, classNames1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__END_CELL_ADDRESS, oldEndCellAddress, endCellAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__END_X, oldEndX, endX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__END_Y, oldEndY, endY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__STYLE_NAME1, oldStyleName1, styleName1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__TABLE_BACKGROUND, oldTableBackground, tableBackground, !oldTableBackgroundESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.GTYPE__TABLE_BACKGROUND, oldTableBackground, TABLE_BACKGROUND_EDEFAULT, oldTableBackgroundESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GTYPE__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.GTYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
			case DrawingPackage.GTYPE__GLUE_POINT:
				return ((InternalEList<?>)getGluePoint()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case DrawingPackage.GTYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
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
			case DrawingPackage.GTYPE__TITLE:
				return getTitle();
			case DrawingPackage.GTYPE__DESC:
				return getDesc();
			case DrawingPackage.GTYPE__EVENT_LISTENERS:
				return getEventListeners();
			case DrawingPackage.GTYPE__GLUE_POINT:
				return getGluePoint();
			case DrawingPackage.GTYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case DrawingPackage.GTYPE__RECT:
				return getRect();
			case DrawingPackage.GTYPE__LINE:
				return getLine();
			case DrawingPackage.GTYPE__POLYLINE:
				return getPolyline();
			case DrawingPackage.GTYPE__POLYGON:
				return getPolygon();
			case DrawingPackage.GTYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case DrawingPackage.GTYPE__PATH:
				return getPath();
			case DrawingPackage.GTYPE__CIRCLE:
				return getCircle();
			case DrawingPackage.GTYPE__ELLIPSE:
				return getEllipse();
			case DrawingPackage.GTYPE__G:
				return getG();
			case DrawingPackage.GTYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case DrawingPackage.GTYPE__FRAME:
				return getFrame();
			case DrawingPackage.GTYPE__MEASURE:
				return getMeasure();
			case DrawingPackage.GTYPE__CAPTION:
				return getCaption();
			case DrawingPackage.GTYPE__CONNECTOR:
				return getConnector();
			case DrawingPackage.GTYPE__CONTROL:
				return getControl();
			case DrawingPackage.GTYPE__SCENE:
				return getScene();
			case DrawingPackage.GTYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case DrawingPackage.GTYPE__ANCHOR_PAGE_NUMBER:
				return getAnchorPageNumber();
			case DrawingPackage.GTYPE__ANCHOR_TYPE:
				return getAnchorType();
			case DrawingPackage.GTYPE__CAPTION_ID:
				return getCaptionId();
			case DrawingPackage.GTYPE__CLASS_NAMES:
				return getClassNames();
			case DrawingPackage.GTYPE__CLASS_NAMES1:
				return getClassNames1();
			case DrawingPackage.GTYPE__END_CELL_ADDRESS:
				return getEndCellAddress();
			case DrawingPackage.GTYPE__END_X:
				return getEndX();
			case DrawingPackage.GTYPE__END_Y:
				return getEndY();
			case DrawingPackage.GTYPE__ID:
				return getId();
			case DrawingPackage.GTYPE__NAME:
				return getName();
			case DrawingPackage.GTYPE__STYLE_NAME:
				return getStyleName();
			case DrawingPackage.GTYPE__STYLE_NAME1:
				return getStyleName1();
			case DrawingPackage.GTYPE__TABLE_BACKGROUND:
				return getTableBackground();
			case DrawingPackage.GTYPE__Y:
				return getY();
			case DrawingPackage.GTYPE__ZINDEX:
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
			case DrawingPackage.GTYPE__TITLE:
				setTitle((String)newValue);
				return;
			case DrawingPackage.GTYPE__DESC:
				setDesc((String)newValue);
				return;
			case DrawingPackage.GTYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case DrawingPackage.GTYPE__GLUE_POINT:
				getGluePoint().clear();
				getGluePoint().addAll((Collection<? extends GluePointType>)newValue);
				return;
			case DrawingPackage.GTYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case DrawingPackage.GTYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case DrawingPackage.GTYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case DrawingPackage.GTYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case DrawingPackage.GTYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case DrawingPackage.GTYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case DrawingPackage.GTYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case DrawingPackage.GTYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case DrawingPackage.GTYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case DrawingPackage.GTYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case DrawingPackage.GTYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case DrawingPackage.GTYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case DrawingPackage.GTYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case DrawingPackage.GTYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case DrawingPackage.GTYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case DrawingPackage.GTYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case DrawingPackage.GTYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case DrawingPackage.GTYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case DrawingPackage.GTYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber((BigInteger)newValue);
				return;
			case DrawingPackage.GTYPE__ANCHOR_TYPE:
				setAnchorType((AnchorTypeType)newValue);
				return;
			case DrawingPackage.GTYPE__CAPTION_ID:
				setCaptionId((String)newValue);
				return;
			case DrawingPackage.GTYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case DrawingPackage.GTYPE__CLASS_NAMES1:
				setClassNames1((List<String>)newValue);
				return;
			case DrawingPackage.GTYPE__END_CELL_ADDRESS:
				setEndCellAddress((String)newValue);
				return;
			case DrawingPackage.GTYPE__END_X:
				setEndX((String)newValue);
				return;
			case DrawingPackage.GTYPE__END_Y:
				setEndY((String)newValue);
				return;
			case DrawingPackage.GTYPE__ID:
				setId((String)newValue);
				return;
			case DrawingPackage.GTYPE__NAME:
				setName((String)newValue);
				return;
			case DrawingPackage.GTYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case DrawingPackage.GTYPE__STYLE_NAME1:
				setStyleName1((String)newValue);
				return;
			case DrawingPackage.GTYPE__TABLE_BACKGROUND:
				setTableBackground((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.GTYPE__Y:
				setY((String)newValue);
				return;
			case DrawingPackage.GTYPE__ZINDEX:
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
			case DrawingPackage.GTYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case DrawingPackage.GTYPE__GLUE_POINT:
				getGluePoint().clear();
				return;
			case DrawingPackage.GTYPE__SHAPE:
				getShape().clear();
				return;
			case DrawingPackage.GTYPE__RECT:
				getRect().clear();
				return;
			case DrawingPackage.GTYPE__LINE:
				getLine().clear();
				return;
			case DrawingPackage.GTYPE__POLYLINE:
				getPolyline().clear();
				return;
			case DrawingPackage.GTYPE__POLYGON:
				getPolygon().clear();
				return;
			case DrawingPackage.GTYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case DrawingPackage.GTYPE__PATH:
				getPath().clear();
				return;
			case DrawingPackage.GTYPE__CIRCLE:
				getCircle().clear();
				return;
			case DrawingPackage.GTYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case DrawingPackage.GTYPE__G:
				getG().clear();
				return;
			case DrawingPackage.GTYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case DrawingPackage.GTYPE__FRAME:
				getFrame().clear();
				return;
			case DrawingPackage.GTYPE__MEASURE:
				getMeasure().clear();
				return;
			case DrawingPackage.GTYPE__CAPTION:
				getCaption().clear();
				return;
			case DrawingPackage.GTYPE__CONNECTOR:
				getConnector().clear();
				return;
			case DrawingPackage.GTYPE__CONTROL:
				getControl().clear();
				return;
			case DrawingPackage.GTYPE__SCENE:
				getScene().clear();
				return;
			case DrawingPackage.GTYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case DrawingPackage.GTYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber(ANCHOR_PAGE_NUMBER_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__ANCHOR_TYPE:
				unsetAnchorType();
				return;
			case DrawingPackage.GTYPE__CAPTION_ID:
				setCaptionId(CAPTION_ID_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__CLASS_NAMES1:
				setClassNames1(CLASS_NAMES1_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__END_CELL_ADDRESS:
				setEndCellAddress(END_CELL_ADDRESS_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__STYLE_NAME1:
				setStyleName1(STYLE_NAME1_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__TABLE_BACKGROUND:
				unsetTableBackground();
				return;
			case DrawingPackage.GTYPE__Y:
				setY(Y_EDEFAULT);
				return;
			case DrawingPackage.GTYPE__ZINDEX:
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
			case DrawingPackage.GTYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DrawingPackage.GTYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case DrawingPackage.GTYPE__EVENT_LISTENERS:
				return eventListeners != null;
			case DrawingPackage.GTYPE__GLUE_POINT:
				return gluePoint != null && !gluePoint.isEmpty();
			case DrawingPackage.GTYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case DrawingPackage.GTYPE__RECT:
				return !getRect().isEmpty();
			case DrawingPackage.GTYPE__LINE:
				return !getLine().isEmpty();
			case DrawingPackage.GTYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case DrawingPackage.GTYPE__POLYGON:
				return !getPolygon().isEmpty();
			case DrawingPackage.GTYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case DrawingPackage.GTYPE__PATH:
				return !getPath().isEmpty();
			case DrawingPackage.GTYPE__CIRCLE:
				return !getCircle().isEmpty();
			case DrawingPackage.GTYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case DrawingPackage.GTYPE__G:
				return !getG().isEmpty();
			case DrawingPackage.GTYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case DrawingPackage.GTYPE__FRAME:
				return !getFrame().isEmpty();
			case DrawingPackage.GTYPE__MEASURE:
				return !getMeasure().isEmpty();
			case DrawingPackage.GTYPE__CAPTION:
				return !getCaption().isEmpty();
			case DrawingPackage.GTYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case DrawingPackage.GTYPE__CONTROL:
				return !getControl().isEmpty();
			case DrawingPackage.GTYPE__SCENE:
				return !getScene().isEmpty();
			case DrawingPackage.GTYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case DrawingPackage.GTYPE__ANCHOR_PAGE_NUMBER:
				return ANCHOR_PAGE_NUMBER_EDEFAULT == null ? anchorPageNumber != null : !ANCHOR_PAGE_NUMBER_EDEFAULT.equals(anchorPageNumber);
			case DrawingPackage.GTYPE__ANCHOR_TYPE:
				return isSetAnchorType();
			case DrawingPackage.GTYPE__CAPTION_ID:
				return CAPTION_ID_EDEFAULT == null ? captionId != null : !CAPTION_ID_EDEFAULT.equals(captionId);
			case DrawingPackage.GTYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case DrawingPackage.GTYPE__CLASS_NAMES1:
				return CLASS_NAMES1_EDEFAULT == null ? classNames1 != null : !CLASS_NAMES1_EDEFAULT.equals(classNames1);
			case DrawingPackage.GTYPE__END_CELL_ADDRESS:
				return END_CELL_ADDRESS_EDEFAULT == null ? endCellAddress != null : !END_CELL_ADDRESS_EDEFAULT.equals(endCellAddress);
			case DrawingPackage.GTYPE__END_X:
				return END_X_EDEFAULT == null ? endX != null : !END_X_EDEFAULT.equals(endX);
			case DrawingPackage.GTYPE__END_Y:
				return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
			case DrawingPackage.GTYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DrawingPackage.GTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DrawingPackage.GTYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case DrawingPackage.GTYPE__STYLE_NAME1:
				return STYLE_NAME1_EDEFAULT == null ? styleName1 != null : !STYLE_NAME1_EDEFAULT.equals(styleName1);
			case DrawingPackage.GTYPE__TABLE_BACKGROUND:
				return isSetTableBackground();
			case DrawingPackage.GTYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case DrawingPackage.GTYPE__ZINDEX:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", desc: ");
		result.append(desc);
		result.append(", shape: ");
		result.append(shape);
		result.append(", anchorPageNumber: ");
		result.append(anchorPageNumber);
		result.append(", anchorType: ");
		if (anchorTypeESet) result.append(anchorType); else result.append("<unset>");
		result.append(", captionId: ");
		result.append(captionId);
		result.append(", classNames: ");
		result.append(classNames);
		result.append(", classNames1: ");
		result.append(classNames1);
		result.append(", endCellAddress: ");
		result.append(endCellAddress);
		result.append(", endX: ");
		result.append(endX);
		result.append(", endY: ");
		result.append(endY);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", styleName1: ");
		result.append(styleName1);
		result.append(", tableBackground: ");
		if (tableBackgroundESet) result.append(tableBackground); else result.append("<unset>");
		result.append(", y: ");
		result.append(y);
		result.append(", zIndex: ");
		result.append(zIndex);
		result.append(')');
		return result.toString();
	}

} //GTypeImpl
