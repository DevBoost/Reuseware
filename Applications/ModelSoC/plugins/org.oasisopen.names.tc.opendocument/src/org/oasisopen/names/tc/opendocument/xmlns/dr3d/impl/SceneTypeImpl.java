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
package org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getShapes3dGroup <em>Shapes3d Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getShapes3d <em>Shapes3d</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getLightingMode <em>Lighting Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getVup <em>Vup</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneTypeImpl extends EObjectImpl implements SceneType {
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
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected EList<LightType> light;

	/**
	 * The cached value of the '{@link #getShapes3dGroup() <em>Shapes3d Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes3dGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shapes3dGroup;

	/**
	 * The default value of the '{@link #getAmbientColor() <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientColor()
	 * @generated
	 * @ordered
	 */
	protected static final String AMBIENT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbientColor() <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientColor()
	 * @generated
	 * @ordered
	 */
	protected String ambientColor = AMBIENT_COLOR_EDEFAULT;

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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

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
	 * The default value of the '{@link #getFocalLength() <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLength()
	 * @generated
	 * @ordered
	 */
	protected static final String FOCAL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFocalLength() <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLength()
	 * @generated
	 * @ordered
	 */
	protected String focalLength = FOCAL_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getLightingMode() <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingMode()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LIGHTING_MODE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLightingMode() <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingMode()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean lightingMode = LIGHTING_MODE_EDEFAULT;

	/**
	 * This is true if the Lighting Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lightingModeESet;

	/**
	 * The default value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected static final ProjectionType PROJECTION_EDEFAULT = ProjectionType.PARALLEL;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected ProjectionType projection = PROJECTION_EDEFAULT;

	/**
	 * This is true if the Projection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectionESet;

	/**
	 * The default value of the '{@link #getShadeMode() <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadeMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShadeModeType SHADE_MODE_EDEFAULT = ShadeModeType.FLAT;

	/**
	 * The cached value of the '{@link #getShadeMode() <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadeMode()
	 * @generated
	 * @ordered
	 */
	protected ShadeModeType shadeMode = SHADE_MODE_EDEFAULT;

	/**
	 * This is true if the Shade Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shadeModeESet;

	/**
	 * The default value of the '{@link #getShadowSlant() <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowSlant()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SHADOW_SLANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowSlant() <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowSlant()
	 * @generated
	 * @ordered
	 */
	protected BigInteger shadowSlant = SHADOW_SLANT_EDEFAULT;

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
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Object transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpn() <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpn()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpn() <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpn()
	 * @generated
	 * @ordered
	 */
	protected String vpn = VPN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrp() <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrp()
	 * @generated
	 * @ordered
	 */
	protected static final String VRP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrp() <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrp()
	 * @generated
	 * @ordered
	 */
	protected String vrp = VRP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVup() <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVup()
	 * @generated
	 * @ordered
	 */
	protected static final String VUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVup() <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVup()
	 * @generated
	 * @ordered
	 */
	protected String vup = VUP_EDEFAULT;

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
	protected SceneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dr3dPackage.Literals.SCENE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LightType> getLight() {
		if (light == null) {
			light = new EObjectContainmentEList<LightType>(LightType.class, this, Dr3dPackage.SCENE_TYPE__LIGHT);
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShapes3dGroup() {
		if (shapes3dGroup == null) {
			shapes3dGroup = new BasicFeatureMap(this, Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP);
		}
		return shapes3dGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getShapes3d() {
		return getShapes3dGroup().list(Dr3dPackage.Literals.SCENE_TYPE__SHAPES3D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmbientColor() {
		return ambientColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientColor(String newAmbientColor) {
		String oldAmbientColor = ambientColor;
		ambientColor = newAmbientColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__AMBIENT_COLOR, oldAmbientColor, ambientColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__ANCHOR_PAGE_NUMBER, oldAnchorPageNumber, anchorPageNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE, oldAnchorType, anchorType, !oldAnchorTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE, oldAnchorType, ANCHOR_TYPE_EDEFAULT, oldAnchorTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__CAPTION_ID, oldCaptionId, captionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__CLASS_NAMES, oldClassNames, classNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__CLASS_NAMES1, oldClassNames1, classNames1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__DISTANCE, oldDistance, distance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__END_CELL_ADDRESS, oldEndCellAddress, endCellAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__END_X, oldEndX, endX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__END_Y, oldEndY, endY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFocalLength() {
		return focalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalLength(String newFocalLength) {
		String oldFocalLength = focalLength;
		focalLength = newFocalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__FOCAL_LENGTH, oldFocalLength, focalLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLightingMode() {
		return lightingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLightingMode) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLightingMode = lightingMode;
		lightingMode = newLightingMode == null ? LIGHTING_MODE_EDEFAULT : newLightingMode;
		boolean oldLightingModeESet = lightingModeESet;
		lightingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__LIGHTING_MODE, oldLightingMode, lightingMode, !oldLightingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLightingMode() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLightingMode = lightingMode;
		boolean oldLightingModeESet = lightingModeESet;
		lightingMode = LIGHTING_MODE_EDEFAULT;
		lightingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.SCENE_TYPE__LIGHTING_MODE, oldLightingMode, LIGHTING_MODE_EDEFAULT, oldLightingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLightingMode() {
		return lightingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionType getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(ProjectionType newProjection) {
		ProjectionType oldProjection = projection;
		projection = newProjection == null ? PROJECTION_EDEFAULT : newProjection;
		boolean oldProjectionESet = projectionESet;
		projectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__PROJECTION, oldProjection, projection, !oldProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjection() {
		ProjectionType oldProjection = projection;
		boolean oldProjectionESet = projectionESet;
		projection = PROJECTION_EDEFAULT;
		projectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.SCENE_TYPE__PROJECTION, oldProjection, PROJECTION_EDEFAULT, oldProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjection() {
		return projectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadeModeType getShadeMode() {
		return shadeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadeMode(ShadeModeType newShadeMode) {
		ShadeModeType oldShadeMode = shadeMode;
		shadeMode = newShadeMode == null ? SHADE_MODE_EDEFAULT : newShadeMode;
		boolean oldShadeModeESet = shadeModeESet;
		shadeModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__SHADE_MODE, oldShadeMode, shadeMode, !oldShadeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShadeMode() {
		ShadeModeType oldShadeMode = shadeMode;
		boolean oldShadeModeESet = shadeModeESet;
		shadeMode = SHADE_MODE_EDEFAULT;
		shadeModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.SCENE_TYPE__SHADE_MODE, oldShadeMode, SHADE_MODE_EDEFAULT, oldShadeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShadeMode() {
		return shadeModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getShadowSlant() {
		return shadowSlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowSlant(BigInteger newShadowSlant) {
		BigInteger oldShadowSlant = shadowSlant;
		shadowSlant = newShadowSlant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__SHADOW_SLANT, oldShadowSlant, shadowSlant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__STYLE_NAME1, oldStyleName1, styleName1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND, oldTableBackground, tableBackground, !oldTableBackgroundESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND, oldTableBackground, TABLE_BACKGROUND_EDEFAULT, oldTableBackgroundESet));
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
	public Object getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Object newTransform) {
		Object oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpn() {
		return vpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpn(String newVpn) {
		String oldVpn = vpn;
		vpn = newVpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__VPN, oldVpn, vpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrp() {
		return vrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrp(String newVrp) {
		String oldVrp = vrp;
		vrp = newVrp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__VRP, oldVrp, vrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVup() {
		return vup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVup(String newVup) {
		String oldVup = vup;
		vup = newVup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__VUP, oldVup, vup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.SCENE_TYPE__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dr3dPackage.SCENE_TYPE__LIGHT:
				return ((InternalEList<?>)getLight()).basicRemove(otherEnd, msgs);
			case Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP:
				return ((InternalEList<?>)getShapes3dGroup()).basicRemove(otherEnd, msgs);
			case Dr3dPackage.SCENE_TYPE__SHAPES3D:
				return ((InternalEList<?>)getShapes3d()).basicRemove(otherEnd, msgs);
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
			case Dr3dPackage.SCENE_TYPE__TITLE:
				return getTitle();
			case Dr3dPackage.SCENE_TYPE__DESC:
				return getDesc();
			case Dr3dPackage.SCENE_TYPE__LIGHT:
				return getLight();
			case Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP:
				if (coreType) return getShapes3dGroup();
				return ((FeatureMap.Internal)getShapes3dGroup()).getWrapper();
			case Dr3dPackage.SCENE_TYPE__SHAPES3D:
				return getShapes3d();
			case Dr3dPackage.SCENE_TYPE__AMBIENT_COLOR:
				return getAmbientColor();
			case Dr3dPackage.SCENE_TYPE__ANCHOR_PAGE_NUMBER:
				return getAnchorPageNumber();
			case Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE:
				return getAnchorType();
			case Dr3dPackage.SCENE_TYPE__CAPTION_ID:
				return getCaptionId();
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES:
				return getClassNames();
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES1:
				return getClassNames1();
			case Dr3dPackage.SCENE_TYPE__DISTANCE:
				return getDistance();
			case Dr3dPackage.SCENE_TYPE__END_CELL_ADDRESS:
				return getEndCellAddress();
			case Dr3dPackage.SCENE_TYPE__END_X:
				return getEndX();
			case Dr3dPackage.SCENE_TYPE__END_Y:
				return getEndY();
			case Dr3dPackage.SCENE_TYPE__FOCAL_LENGTH:
				return getFocalLength();
			case Dr3dPackage.SCENE_TYPE__HEIGHT:
				return getHeight();
			case Dr3dPackage.SCENE_TYPE__ID:
				return getId();
			case Dr3dPackage.SCENE_TYPE__LAYER:
				return getLayer();
			case Dr3dPackage.SCENE_TYPE__LIGHTING_MODE:
				return getLightingMode();
			case Dr3dPackage.SCENE_TYPE__PROJECTION:
				return getProjection();
			case Dr3dPackage.SCENE_TYPE__SHADE_MODE:
				return getShadeMode();
			case Dr3dPackage.SCENE_TYPE__SHADOW_SLANT:
				return getShadowSlant();
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME:
				return getStyleName();
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME1:
				return getStyleName1();
			case Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND:
				return getTableBackground();
			case Dr3dPackage.SCENE_TYPE__TRANSFORM:
				return getTransform();
			case Dr3dPackage.SCENE_TYPE__VPN:
				return getVpn();
			case Dr3dPackage.SCENE_TYPE__VRP:
				return getVrp();
			case Dr3dPackage.SCENE_TYPE__VUP:
				return getVup();
			case Dr3dPackage.SCENE_TYPE__WIDTH:
				return getWidth();
			case Dr3dPackage.SCENE_TYPE__X:
				return getX();
			case Dr3dPackage.SCENE_TYPE__Y:
				return getY();
			case Dr3dPackage.SCENE_TYPE__ZINDEX:
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
			case Dr3dPackage.SCENE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__LIGHT:
				getLight().clear();
				getLight().addAll((Collection<? extends LightType>)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP:
				((FeatureMap.Internal)getShapes3dGroup()).set(newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__AMBIENT_COLOR:
				setAmbientColor((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber((BigInteger)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE:
				setAnchorType((AnchorTypeType)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__CAPTION_ID:
				setCaptionId((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES1:
				setClassNames1((List<String>)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__DISTANCE:
				setDistance((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__END_CELL_ADDRESS:
				setEndCellAddress((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__END_X:
				setEndX((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__END_Y:
				setEndY((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__FOCAL_LENGTH:
				setFocalLength((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__ID:
				setId((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__LAYER:
				setLayer((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__LIGHTING_MODE:
				setLightingMode((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__PROJECTION:
				setProjection((ProjectionType)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__SHADE_MODE:
				setShadeMode((ShadeModeType)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__SHADOW_SLANT:
				setShadowSlant((BigInteger)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME1:
				setStyleName1((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND:
				setTableBackground((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__TRANSFORM:
				setTransform(newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__VPN:
				setVpn((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__VRP:
				setVrp((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__VUP:
				setVup((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__X:
				setX((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__Y:
				setY((String)newValue);
				return;
			case Dr3dPackage.SCENE_TYPE__ZINDEX:
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
			case Dr3dPackage.SCENE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__LIGHT:
				getLight().clear();
				return;
			case Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP:
				getShapes3dGroup().clear();
				return;
			case Dr3dPackage.SCENE_TYPE__AMBIENT_COLOR:
				setAmbientColor(AMBIENT_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__ANCHOR_PAGE_NUMBER:
				setAnchorPageNumber(ANCHOR_PAGE_NUMBER_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE:
				unsetAnchorType();
				return;
			case Dr3dPackage.SCENE_TYPE__CAPTION_ID:
				setCaptionId(CAPTION_ID_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES1:
				setClassNames1(CLASS_NAMES1_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__END_CELL_ADDRESS:
				setEndCellAddress(END_CELL_ADDRESS_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__FOCAL_LENGTH:
				setFocalLength(FOCAL_LENGTH_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__LIGHTING_MODE:
				unsetLightingMode();
				return;
			case Dr3dPackage.SCENE_TYPE__PROJECTION:
				unsetProjection();
				return;
			case Dr3dPackage.SCENE_TYPE__SHADE_MODE:
				unsetShadeMode();
				return;
			case Dr3dPackage.SCENE_TYPE__SHADOW_SLANT:
				setShadowSlant(SHADOW_SLANT_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME1:
				setStyleName1(STYLE_NAME1_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND:
				unsetTableBackground();
				return;
			case Dr3dPackage.SCENE_TYPE__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__VPN:
				setVpn(VPN_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__VRP:
				setVrp(VRP_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__VUP:
				setVup(VUP_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__Y:
				setY(Y_EDEFAULT);
				return;
			case Dr3dPackage.SCENE_TYPE__ZINDEX:
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
			case Dr3dPackage.SCENE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Dr3dPackage.SCENE_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case Dr3dPackage.SCENE_TYPE__LIGHT:
				return light != null && !light.isEmpty();
			case Dr3dPackage.SCENE_TYPE__SHAPES3D_GROUP:
				return shapes3dGroup != null && !shapes3dGroup.isEmpty();
			case Dr3dPackage.SCENE_TYPE__SHAPES3D:
				return !getShapes3d().isEmpty();
			case Dr3dPackage.SCENE_TYPE__AMBIENT_COLOR:
				return AMBIENT_COLOR_EDEFAULT == null ? ambientColor != null : !AMBIENT_COLOR_EDEFAULT.equals(ambientColor);
			case Dr3dPackage.SCENE_TYPE__ANCHOR_PAGE_NUMBER:
				return ANCHOR_PAGE_NUMBER_EDEFAULT == null ? anchorPageNumber != null : !ANCHOR_PAGE_NUMBER_EDEFAULT.equals(anchorPageNumber);
			case Dr3dPackage.SCENE_TYPE__ANCHOR_TYPE:
				return isSetAnchorType();
			case Dr3dPackage.SCENE_TYPE__CAPTION_ID:
				return CAPTION_ID_EDEFAULT == null ? captionId != null : !CAPTION_ID_EDEFAULT.equals(captionId);
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case Dr3dPackage.SCENE_TYPE__CLASS_NAMES1:
				return CLASS_NAMES1_EDEFAULT == null ? classNames1 != null : !CLASS_NAMES1_EDEFAULT.equals(classNames1);
			case Dr3dPackage.SCENE_TYPE__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case Dr3dPackage.SCENE_TYPE__END_CELL_ADDRESS:
				return END_CELL_ADDRESS_EDEFAULT == null ? endCellAddress != null : !END_CELL_ADDRESS_EDEFAULT.equals(endCellAddress);
			case Dr3dPackage.SCENE_TYPE__END_X:
				return END_X_EDEFAULT == null ? endX != null : !END_X_EDEFAULT.equals(endX);
			case Dr3dPackage.SCENE_TYPE__END_Y:
				return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
			case Dr3dPackage.SCENE_TYPE__FOCAL_LENGTH:
				return FOCAL_LENGTH_EDEFAULT == null ? focalLength != null : !FOCAL_LENGTH_EDEFAULT.equals(focalLength);
			case Dr3dPackage.SCENE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Dr3dPackage.SCENE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Dr3dPackage.SCENE_TYPE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case Dr3dPackage.SCENE_TYPE__LIGHTING_MODE:
				return isSetLightingMode();
			case Dr3dPackage.SCENE_TYPE__PROJECTION:
				return isSetProjection();
			case Dr3dPackage.SCENE_TYPE__SHADE_MODE:
				return isSetShadeMode();
			case Dr3dPackage.SCENE_TYPE__SHADOW_SLANT:
				return SHADOW_SLANT_EDEFAULT == null ? shadowSlant != null : !SHADOW_SLANT_EDEFAULT.equals(shadowSlant);
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case Dr3dPackage.SCENE_TYPE__STYLE_NAME1:
				return STYLE_NAME1_EDEFAULT == null ? styleName1 != null : !STYLE_NAME1_EDEFAULT.equals(styleName1);
			case Dr3dPackage.SCENE_TYPE__TABLE_BACKGROUND:
				return isSetTableBackground();
			case Dr3dPackage.SCENE_TYPE__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case Dr3dPackage.SCENE_TYPE__VPN:
				return VPN_EDEFAULT == null ? vpn != null : !VPN_EDEFAULT.equals(vpn);
			case Dr3dPackage.SCENE_TYPE__VRP:
				return VRP_EDEFAULT == null ? vrp != null : !VRP_EDEFAULT.equals(vrp);
			case Dr3dPackage.SCENE_TYPE__VUP:
				return VUP_EDEFAULT == null ? vup != null : !VUP_EDEFAULT.equals(vup);
			case Dr3dPackage.SCENE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Dr3dPackage.SCENE_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case Dr3dPackage.SCENE_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case Dr3dPackage.SCENE_TYPE__ZINDEX:
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
		result.append(", shapes3dGroup: ");
		result.append(shapes3dGroup);
		result.append(", ambientColor: ");
		result.append(ambientColor);
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
		result.append(", distance: ");
		result.append(distance);
		result.append(", endCellAddress: ");
		result.append(endCellAddress);
		result.append(", endX: ");
		result.append(endX);
		result.append(", endY: ");
		result.append(endY);
		result.append(", focalLength: ");
		result.append(focalLength);
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", layer: ");
		result.append(layer);
		result.append(", lightingMode: ");
		if (lightingModeESet) result.append(lightingMode); else result.append("<unset>");
		result.append(", projection: ");
		if (projectionESet) result.append(projection); else result.append("<unset>");
		result.append(", shadeMode: ");
		if (shadeModeESet) result.append(shadeMode); else result.append("<unset>");
		result.append(", shadowSlant: ");
		result.append(shadowSlant);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", styleName1: ");
		result.append(styleName1);
		result.append(", tableBackground: ");
		if (tableBackgroundESet) result.append(tableBackground); else result.append("<unset>");
		result.append(", transform: ");
		result.append(transform);
		result.append(", vpn: ");
		result.append(vpn);
		result.append(", vrp: ");
		result.append(vrp);
		result.append(", vup: ");
		result.append(vup);
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

} //SceneTypeImpl
