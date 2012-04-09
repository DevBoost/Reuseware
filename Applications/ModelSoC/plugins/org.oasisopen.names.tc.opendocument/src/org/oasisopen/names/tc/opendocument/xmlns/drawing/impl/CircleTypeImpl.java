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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getR <em>R</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircleTypeImpl extends EObjectImpl implements CircleType {
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
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected String cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected String cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double END_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected double endAngle = END_ANGLE_EDEFAULT;

	/**
	 * This is true if the End Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endAngleESet;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KindType KIND_EDEFAULT = KindType.FULL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KindType kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

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
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final String R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected String r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double START_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected double startAngle = START_ANGLE_EDEFAULT;

	/**
	 * This is true if the Start Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startAngleESet;

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
	protected CircleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getCircleType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__DESC, oldDesc, desc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS, oldEventListeners, newEventListeners);
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
				msgs = ((InternalEObject)eventListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS, null, msgs);
			if (newEventListeners != null)
				msgs = ((InternalEObject)newEventListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS, null, msgs);
			msgs = basicSetEventListeners(newEventListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS, newEventListeners, newEventListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GluePointType> getGluePoint() {
		if (gluePoint == null) {
			gluePoint = new EObjectContainmentEList<GluePointType>(GluePointType.class, this, DrawingPackage.CIRCLE_TYPE__GLUE_POINT);
		}
		return gluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DrawingPackage.CIRCLE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(DrawingPackage.eINSTANCE.getCircleType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getGroup().list(DrawingPackage.eINSTANCE.getCircleType_List());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__ANCHOR_PAGE_NUMBER, oldAnchorPageNumber, anchorPageNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE, oldAnchorType, anchorType, !oldAnchorTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE, oldAnchorType, ANCHOR_TYPE_EDEFAULT, oldAnchorTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__CAPTION_ID, oldCaptionId, captionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__CLASS_NAMES, oldClassNames, classNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__CLASS_NAMES1, oldClassNames1, classNames1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(String newCx) {
		String oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(String newCy) {
		String oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndAngle() {
		return endAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAngle(double newEndAngle) {
		double oldEndAngle = endAngle;
		endAngle = newEndAngle;
		boolean oldEndAngleESet = endAngleESet;
		endAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__END_ANGLE, oldEndAngle, endAngle, !oldEndAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndAngle() {
		double oldEndAngle = endAngle;
		boolean oldEndAngleESet = endAngleESet;
		endAngle = END_ANGLE_EDEFAULT;
		endAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CIRCLE_TYPE__END_ANGLE, oldEndAngle, END_ANGLE_EDEFAULT, oldEndAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndAngle() {
		return endAngleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__END_CELL_ADDRESS, oldEndCellAddress, endCellAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__END_X, oldEndX, endX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__END_Y, oldEndY, endY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KindType newKind) {
		KindType oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		KindType oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CIRCLE_TYPE__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__LAYER, oldLayer, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(String newR) {
		String oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartAngle() {
		return startAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAngle(double newStartAngle) {
		double oldStartAngle = startAngle;
		startAngle = newStartAngle;
		boolean oldStartAngleESet = startAngleESet;
		startAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__START_ANGLE, oldStartAngle, startAngle, !oldStartAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartAngle() {
		double oldStartAngle = startAngle;
		boolean oldStartAngleESet = startAngleESet;
		startAngle = START_ANGLE_EDEFAULT;
		startAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CIRCLE_TYPE__START_ANGLE, oldStartAngle, START_ANGLE_EDEFAULT, oldStartAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartAngle() {
		return startAngleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__STYLE_NAME1, oldStyleName1, styleName1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND, oldTableBackground, tableBackground, !oldTableBackgroundESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND, oldTableBackground, TABLE_BACKGROUND_EDEFAULT, oldTableBackgroundESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__TEXT_STYLE_NAME, oldTextStyleName, textStyleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__TRANSFORM, oldTransform, transform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CIRCLE_TYPE__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
			case DrawingPackage.CIRCLE_TYPE__GLUE_POINT:
				return ((InternalEList<?>)getGluePoint()).basicRemove(otherEnd, msgs);
			case DrawingPackage.CIRCLE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DrawingPackage.CIRCLE_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case DrawingPackage.CIRCLE_TYPE__LIST:
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
			case DrawingPackage.CIRCLE_TYPE__TITLE:
				return getTitle();
			case DrawingPackage.CIRCLE_TYPE__DESC:
				return getDesc();
			case DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS:
				return getEventListeners();
			case DrawingPackage.CIRCLE_TYPE__GLUE_POINT:
				return getGluePoint();
			case DrawingPackage.CIRCLE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DrawingPackage.CIRCLE_TYPE__P:
				return getP();
			case DrawingPackage.CIRCLE_TYPE__LIST:
				return getList();
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_PAGE_NUMBER:
				return getAnchorPageNumber();
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE:
				return getAnchorType();
			case DrawingPackage.CIRCLE_TYPE__CAPTION_ID:
				return getCaptionId();
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES:
				return getClassNames();
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES1:
				return getClassNames1();
			case DrawingPackage.CIRCLE_TYPE__CX:
				return getCx();
			case DrawingPackage.CIRCLE_TYPE__CY:
				return getCy();
			case DrawingPackage.CIRCLE_TYPE__END_ANGLE:
				return new Double(getEndAngle());
			case DrawingPackage.CIRCLE_TYPE__END_CELL_ADDRESS:
				return getEndCellAddress();
			case DrawingPackage.CIRCLE_TYPE__END_X:
				return getEndX();
			case DrawingPackage.CIRCLE_TYPE__END_Y:
				return getEndY();
			case DrawingPackage.CIRCLE_TYPE__HEIGHT:
				return getHeight();
			case DrawingPackage.CIRCLE_TYPE__ID:
				return getId();
			case DrawingPackage.CIRCLE_TYPE__KIND:
				return getKind();
			case DrawingPackage.CIRCLE_TYPE__LAYER:
				return getLayer();
			case DrawingPackage.CIRCLE_TYPE__NAME:
				return getName();
			case DrawingPackage.CIRCLE_TYPE__R:
				return getR();
			case DrawingPackage.CIRCLE_TYPE__START_ANGLE:
				return new Double(getStartAngle());
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME:
				return getStyleName();
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME1:
				return getStyleName1();
			case DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND:
				return getTableBackground();
			case DrawingPackage.CIRCLE_TYPE__TEXT_STYLE_NAME:
				return getTextStyleName();
			case DrawingPackage.CIRCLE_TYPE__TRANSFORM:
				return getTransform();
			case DrawingPackage.CIRCLE_TYPE__WIDTH:
				return getWidth();
			case DrawingPackage.CIRCLE_TYPE__X:
				return getX();
			case DrawingPackage.CIRCLE_TYPE__Y:
				return getY();
			case DrawingPackage.CIRCLE_TYPE__ZINDEX:
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
			case DrawingPackage.CIRCLE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__GLUE_POINT:
				getGluePoint().clear();
				getGluePoint().addAll((Collection<? extends GluePointType>)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber((BigInteger)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE:
				setAnchorType((AnchorTypeType)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__CAPTION_ID:
				setCaptionId((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES1:
				setClassNames1((List<String>)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__CX:
				setCx((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__CY:
				setCy((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_ANGLE:
				setEndAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.CIRCLE_TYPE__END_CELL_ADDRESS:
				setEndCellAddress((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_X:
				setEndX((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_Y:
				setEndY((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__ID:
				setId((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__KIND:
				setKind((KindType)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__LAYER:
				setLayer((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__R:
				setR((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__START_ANGLE:
				setStartAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME1:
				setStyleName1((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND:
				setTableBackground((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__TEXT_STYLE_NAME:
				setTextStyleName((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__X:
				setX((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__Y:
				setY((String)newValue);
				return;
			case DrawingPackage.CIRCLE_TYPE__ZINDEX:
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
			case DrawingPackage.CIRCLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case DrawingPackage.CIRCLE_TYPE__GLUE_POINT:
				getGluePoint().clear();
				return;
			case DrawingPackage.CIRCLE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DrawingPackage.CIRCLE_TYPE__P:
				getP().clear();
				return;
			case DrawingPackage.CIRCLE_TYPE__LIST:
				getList().clear();
				return;
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber(ANCHOR_PAGE_NUMBER_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE:
				unsetAnchorType();
				return;
			case DrawingPackage.CIRCLE_TYPE__CAPTION_ID:
				setCaptionId(CAPTION_ID_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES1:
				setClassNames1(CLASS_NAMES1_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__CX:
				setCx(CX_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__CY:
				setCy(CY_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_ANGLE:
				unsetEndAngle();
				return;
			case DrawingPackage.CIRCLE_TYPE__END_CELL_ADDRESS:
				setEndCellAddress(END_CELL_ADDRESS_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__KIND:
				unsetKind();
				return;
			case DrawingPackage.CIRCLE_TYPE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__R:
				setR(R_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__START_ANGLE:
				unsetStartAngle();
				return;
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME1:
				setStyleName1(STYLE_NAME1_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND:
				unsetTableBackground();
				return;
			case DrawingPackage.CIRCLE_TYPE__TEXT_STYLE_NAME:
				setTextStyleName(TEXT_STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__Y:
				setY(Y_EDEFAULT);
				return;
			case DrawingPackage.CIRCLE_TYPE__ZINDEX:
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
			case DrawingPackage.CIRCLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DrawingPackage.CIRCLE_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case DrawingPackage.CIRCLE_TYPE__EVENT_LISTENERS:
				return eventListeners != null;
			case DrawingPackage.CIRCLE_TYPE__GLUE_POINT:
				return gluePoint != null && !gluePoint.isEmpty();
			case DrawingPackage.CIRCLE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DrawingPackage.CIRCLE_TYPE__P:
				return !getP().isEmpty();
			case DrawingPackage.CIRCLE_TYPE__LIST:
				return !getList().isEmpty();
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_PAGE_NUMBER:
				return ANCHOR_PAGE_NUMBER_EDEFAULT == null ? anchorPageNumber != null : !ANCHOR_PAGE_NUMBER_EDEFAULT.equals(anchorPageNumber);
			case DrawingPackage.CIRCLE_TYPE__ANCHOR_TYPE:
				return isSetAnchorType();
			case DrawingPackage.CIRCLE_TYPE__CAPTION_ID:
				return CAPTION_ID_EDEFAULT == null ? captionId != null : !CAPTION_ID_EDEFAULT.equals(captionId);
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case DrawingPackage.CIRCLE_TYPE__CLASS_NAMES1:
				return CLASS_NAMES1_EDEFAULT == null ? classNames1 != null : !CLASS_NAMES1_EDEFAULT.equals(classNames1);
			case DrawingPackage.CIRCLE_TYPE__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case DrawingPackage.CIRCLE_TYPE__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case DrawingPackage.CIRCLE_TYPE__END_ANGLE:
				return isSetEndAngle();
			case DrawingPackage.CIRCLE_TYPE__END_CELL_ADDRESS:
				return END_CELL_ADDRESS_EDEFAULT == null ? endCellAddress != null : !END_CELL_ADDRESS_EDEFAULT.equals(endCellAddress);
			case DrawingPackage.CIRCLE_TYPE__END_X:
				return END_X_EDEFAULT == null ? endX != null : !END_X_EDEFAULT.equals(endX);
			case DrawingPackage.CIRCLE_TYPE__END_Y:
				return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
			case DrawingPackage.CIRCLE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case DrawingPackage.CIRCLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DrawingPackage.CIRCLE_TYPE__KIND:
				return isSetKind();
			case DrawingPackage.CIRCLE_TYPE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case DrawingPackage.CIRCLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DrawingPackage.CIRCLE_TYPE__R:
				return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
			case DrawingPackage.CIRCLE_TYPE__START_ANGLE:
				return isSetStartAngle();
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case DrawingPackage.CIRCLE_TYPE__STYLE_NAME1:
				return STYLE_NAME1_EDEFAULT == null ? styleName1 != null : !STYLE_NAME1_EDEFAULT.equals(styleName1);
			case DrawingPackage.CIRCLE_TYPE__TABLE_BACKGROUND:
				return isSetTableBackground();
			case DrawingPackage.CIRCLE_TYPE__TEXT_STYLE_NAME:
				return TEXT_STYLE_NAME_EDEFAULT == null ? textStyleName != null : !TEXT_STYLE_NAME_EDEFAULT.equals(textStyleName);
			case DrawingPackage.CIRCLE_TYPE__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case DrawingPackage.CIRCLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case DrawingPackage.CIRCLE_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case DrawingPackage.CIRCLE_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case DrawingPackage.CIRCLE_TYPE__ZINDEX:
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
		result.append(", group: ");
		result.append(group);
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
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", endAngle: ");
		if (endAngleESet) result.append(endAngle); else result.append("<unset>");
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", layer: ");
		result.append(layer);
		result.append(", name: ");
		result.append(name);
		result.append(", r: ");
		result.append(r);
		result.append(", startAngle: ");
		if (startAngleESet) result.append(startAngle); else result.append("<unset>");
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

} //CircleTypeImpl
