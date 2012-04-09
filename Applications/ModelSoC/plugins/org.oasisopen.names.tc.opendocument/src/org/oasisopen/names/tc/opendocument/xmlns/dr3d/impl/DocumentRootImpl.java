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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getExtrude <em>Extrude</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getBackfaceCulling <em>Backface Culling</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getBackScale <em>Back Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getCloseBack <em>Close Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getCloseFront <em>Close Front</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getEdgeRounding <em>Edge Rounding</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getEdgeRoundingMode <em>Edge Rounding Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getEmissiveColor <em>Emissive Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getHorizontalSegments <em>Horizontal Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getMaxEdge <em>Max Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getMinEdge <em>Min Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getNormalsDirection <em>Normals Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getNormalsKind <em>Normals Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getShininess <em>Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getSpecular <em>Specular</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTextureFilter <em>Texture Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTextureGenerationModeX <em>Texture Generation Mode X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTextureKind <em>Texture Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTextureMode <em>Texture Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getVerticalSegments <em>Vertical Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl#getVup <em>Vup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

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
	 * The default value of the '{@link #getBackfaceCulling() <em>Backface Culling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackfaceCulling()
	 * @generated
	 * @ordered
	 */
	protected static final BackfaceCullingType BACKFACE_CULLING_EDEFAULT = BackfaceCullingType.ENABLED;

	/**
	 * The cached value of the '{@link #getBackfaceCulling() <em>Backface Culling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackfaceCulling()
	 * @generated
	 * @ordered
	 */
	protected BackfaceCullingType backfaceCulling = BACKFACE_CULLING_EDEFAULT;

	/**
	 * This is true if the Backface Culling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backfaceCullingESet;

	/**
	 * The default value of the '{@link #getBackScale() <em>Back Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackScale()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackScale() <em>Back Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackScale()
	 * @generated
	 * @ordered
	 */
	protected String backScale = BACK_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected String center = CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseBack() <em>Close Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseBack()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CLOSE_BACK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCloseBack() <em>Close Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseBack()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean closeBack = CLOSE_BACK_EDEFAULT;

	/**
	 * This is true if the Close Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean closeBackESet;

	/**
	 * The default value of the '{@link #getCloseFront() <em>Close Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseFront()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CLOSE_FRONT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCloseFront() <em>Close Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseFront()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean closeFront = CLOSE_FRONT_EDEFAULT;

	/**
	 * This is true if the Close Front attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean closeFrontESet;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected String depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFUSE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected String diffuseColor = DIFFUSE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

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
	 * The default value of the '{@link #getEdgeRounding() <em>Edge Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRounding()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_ROUNDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdgeRounding() <em>Edge Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRounding()
	 * @generated
	 * @ordered
	 */
	protected String edgeRounding = EDGE_ROUNDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdgeRoundingMode() <em>Edge Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeRoundingModeType EDGE_ROUNDING_MODE_EDEFAULT = EdgeRoundingModeType.CORRECT;

	/**
	 * The cached value of the '{@link #getEdgeRoundingMode() <em>Edge Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected EdgeRoundingModeType edgeRoundingMode = EDGE_ROUNDING_MODE_EDEFAULT;

	/**
	 * This is true if the Edge Rounding Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeRoundingModeESet;

	/**
	 * The default value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected static final String EMISSIVE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected String emissiveColor = EMISSIVE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endAngle = END_ANGLE_EDEFAULT;

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
	 * The default value of the '{@link #getHorizontalSegments() <em>Horizontal Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSegments()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HORIZONTAL_SEGMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalSegments() <em>Horizontal Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSegments()
	 * @generated
	 * @ordered
	 */
	protected BigInteger horizontalSegments = HORIZONTAL_SEGMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEdge() <em>Max Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEdge()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxEdge() <em>Max Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEdge()
	 * @generated
	 * @ordered
	 */
	protected String maxEdge = MAX_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinEdge() <em>Min Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEdge()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinEdge() <em>Min Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEdge()
	 * @generated
	 * @ordered
	 */
	protected String minEdge = MIN_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalsDirection() <em>Normals Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalsDirection()
	 * @generated
	 * @ordered
	 */
	protected static final NormalsDirectionType NORMALS_DIRECTION_EDEFAULT = NormalsDirectionType.NORMAL;

	/**
	 * The cached value of the '{@link #getNormalsDirection() <em>Normals Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalsDirection()
	 * @generated
	 * @ordered
	 */
	protected NormalsDirectionType normalsDirection = NORMALS_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Normals Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalsDirectionESet;

	/**
	 * The default value of the '{@link #getNormalsKind() <em>Normals Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalsKind()
	 * @generated
	 * @ordered
	 */
	protected static final NormalsKindType NORMALS_KIND_EDEFAULT = NormalsKindType.OBJECT;

	/**
	 * The cached value of the '{@link #getNormalsKind() <em>Normals Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalsKind()
	 * @generated
	 * @ordered
	 */
	protected NormalsKindType normalsKind = NORMALS_KIND_EDEFAULT;

	/**
	 * This is true if the Normals Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalsKindESet;

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
	 * The default value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected static final ShadowType SHADOW_EDEFAULT = ShadowType.VISIBLE;

	/**
	 * The cached value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected ShadowType shadow = SHADOW_EDEFAULT;

	/**
	 * This is true if the Shadow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shadowESet;

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
	 * The default value of the '{@link #getShininess() <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShininess()
	 * @generated
	 * @ordered
	 */
	protected static final String SHININESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShininess() <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShininess()
	 * @generated
	 * @ordered
	 */
	protected String shininess = SHININESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SPECULAR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean specular = SPECULAR_EDEFAULT;

	/**
	 * This is true if the Specular attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specularESet;

	/**
	 * The default value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECULAR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected String specularColor = SPECULAR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextureFilter() <em>Texture Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureFilter()
	 * @generated
	 * @ordered
	 */
	protected static final TextureFilterType TEXTURE_FILTER_EDEFAULT = TextureFilterType.ENABLED;

	/**
	 * The cached value of the '{@link #getTextureFilter() <em>Texture Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureFilter()
	 * @generated
	 * @ordered
	 */
	protected TextureFilterType textureFilter = TEXTURE_FILTER_EDEFAULT;

	/**
	 * This is true if the Texture Filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureFilterESet;

	/**
	 * The default value of the '{@link #getTextureGenerationModeX() <em>Texture Generation Mode X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureGenerationModeX()
	 * @generated
	 * @ordered
	 */
	protected static final TextureGenerationModeXType TEXTURE_GENERATION_MODE_X_EDEFAULT = TextureGenerationModeXType.OBJECT;

	/**
	 * The cached value of the '{@link #getTextureGenerationModeX() <em>Texture Generation Mode X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureGenerationModeX()
	 * @generated
	 * @ordered
	 */
	protected TextureGenerationModeXType textureGenerationModeX = TEXTURE_GENERATION_MODE_X_EDEFAULT;

	/**
	 * This is true if the Texture Generation Mode X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureGenerationModeXESet;

	/**
	 * The default value of the '{@link #getTextureGenerationModeY() <em>Texture Generation Mode Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureGenerationModeY()
	 * @generated
	 * @ordered
	 */
	protected static final TextureGenerationModeYType TEXTURE_GENERATION_MODE_Y_EDEFAULT = TextureGenerationModeYType.OBJECT;

	/**
	 * The cached value of the '{@link #getTextureGenerationModeY() <em>Texture Generation Mode Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureGenerationModeY()
	 * @generated
	 * @ordered
	 */
	protected TextureGenerationModeYType textureGenerationModeY = TEXTURE_GENERATION_MODE_Y_EDEFAULT;

	/**
	 * This is true if the Texture Generation Mode Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureGenerationModeYESet;

	/**
	 * The default value of the '{@link #getTextureKind() <em>Texture Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureKind()
	 * @generated
	 * @ordered
	 */
	protected static final TextureKindType TEXTURE_KIND_EDEFAULT = TextureKindType.LUMINANCE;

	/**
	 * The cached value of the '{@link #getTextureKind() <em>Texture Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureKind()
	 * @generated
	 * @ordered
	 */
	protected TextureKindType textureKind = TEXTURE_KIND_EDEFAULT;

	/**
	 * This is true if the Texture Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureKindESet;

	/**
	 * The default value of the '{@link #getTextureMode() <em>Texture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMode()
	 * @generated
	 * @ordered
	 */
	protected static final TextureModeType TEXTURE_MODE_EDEFAULT = TextureModeType.REPLACE;

	/**
	 * The cached value of the '{@link #getTextureMode() <em>Texture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMode()
	 * @generated
	 * @ordered
	 */
	protected TextureModeType textureMode = TEXTURE_MODE_EDEFAULT;

	/**
	 * This is true if the Texture Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureModeESet;

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
	 * The default value of the '{@link #getVerticalSegments() <em>Vertical Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSegments()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERTICAL_SEGMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalSegments() <em>Vertical Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSegments()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verticalSegments = VERTICAL_SEGMENTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dr3dPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Dr3dPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeType getCube() {
		return (CubeType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__CUBE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCube(CubeType newCube, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__CUBE, newCube, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(CubeType newCube) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__CUBE, newCube);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrudeType getExtrude() {
		return (ExtrudeType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__EXTRUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrude(ExtrudeType newExtrude, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__EXTRUDE, newExtrude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrude(ExtrudeType newExtrude) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__EXTRUDE, newExtrude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightType getLight() {
		return (LightType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__LIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLight(LightType newLight, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__LIGHT, newLight, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(LightType newLight) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__LIGHT, newLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateType getRotate() {
		return (RotateType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__ROTATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotate(RotateType newRotate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__ROTATE, newRotate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotate(RotateType newRotate) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__ROTATE, newRotate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneType getScene() {
		return (SceneType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__SCENE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScene(SceneType newScene, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__SCENE, newScene, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScene(SceneType newScene) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__SCENE, newScene);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphereType getSphere() {
		return (SphereType)getMixed().get(Dr3dPackage.Literals.DOCUMENT_ROOT__SPHERE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(SphereType newSphere, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Dr3dPackage.Literals.DOCUMENT_ROOT__SPHERE, newSphere, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(SphereType newSphere) {
		((FeatureMap.Internal)getMixed()).set(Dr3dPackage.Literals.DOCUMENT_ROOT__SPHERE, newSphere);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__AMBIENT_COLOR, oldAmbientColor, ambientColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackfaceCullingType getBackfaceCulling() {
		return backfaceCulling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackfaceCulling(BackfaceCullingType newBackfaceCulling) {
		BackfaceCullingType oldBackfaceCulling = backfaceCulling;
		backfaceCulling = newBackfaceCulling == null ? BACKFACE_CULLING_EDEFAULT : newBackfaceCulling;
		boolean oldBackfaceCullingESet = backfaceCullingESet;
		backfaceCullingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING, oldBackfaceCulling, backfaceCulling, !oldBackfaceCullingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackfaceCulling() {
		BackfaceCullingType oldBackfaceCulling = backfaceCulling;
		boolean oldBackfaceCullingESet = backfaceCullingESet;
		backfaceCulling = BACKFACE_CULLING_EDEFAULT;
		backfaceCullingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING, oldBackfaceCulling, BACKFACE_CULLING_EDEFAULT, oldBackfaceCullingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackfaceCulling() {
		return backfaceCullingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackScale() {
		return backScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackScale(String newBackScale) {
		String oldBackScale = backScale;
		backScale = newBackScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__BACK_SCALE, oldBackScale, backScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(String newCenter) {
		String oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCloseBack() {
		return closeBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCloseBack) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCloseBack = closeBack;
		closeBack = newCloseBack == null ? CLOSE_BACK_EDEFAULT : newCloseBack;
		boolean oldCloseBackESet = closeBackESet;
		closeBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK, oldCloseBack, closeBack, !oldCloseBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCloseBack() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCloseBack = closeBack;
		boolean oldCloseBackESet = closeBackESet;
		closeBack = CLOSE_BACK_EDEFAULT;
		closeBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK, oldCloseBack, CLOSE_BACK_EDEFAULT, oldCloseBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCloseBack() {
		return closeBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCloseFront() {
		return closeFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseFront(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCloseFront) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCloseFront = closeFront;
		closeFront = newCloseFront == null ? CLOSE_FRONT_EDEFAULT : newCloseFront;
		boolean oldCloseFrontESet = closeFrontESet;
		closeFrontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT, oldCloseFront, closeFront, !oldCloseFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCloseFront() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCloseFront = closeFront;
		boolean oldCloseFrontESet = closeFrontESet;
		closeFront = CLOSE_FRONT_EDEFAULT;
		closeFrontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT, oldCloseFront, CLOSE_FRONT_EDEFAULT, oldCloseFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCloseFront() {
		return closeFrontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(String newDepth) {
		String oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiffuseColor() {
		return diffuseColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColor(String newDiffuseColor) {
		String oldDiffuseColor = diffuseColor;
		diffuseColor = newDiffuseColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__DIFFUSE_COLOR, oldDiffuseColor, diffuseColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdgeRounding() {
		return edgeRounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRounding(String newEdgeRounding) {
		String oldEdgeRounding = edgeRounding;
		edgeRounding = newEdgeRounding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING, oldEdgeRounding, edgeRounding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeRoundingModeType getEdgeRoundingMode() {
		return edgeRoundingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRoundingMode(EdgeRoundingModeType newEdgeRoundingMode) {
		EdgeRoundingModeType oldEdgeRoundingMode = edgeRoundingMode;
		edgeRoundingMode = newEdgeRoundingMode == null ? EDGE_ROUNDING_MODE_EDEFAULT : newEdgeRoundingMode;
		boolean oldEdgeRoundingModeESet = edgeRoundingModeESet;
		edgeRoundingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE, oldEdgeRoundingMode, edgeRoundingMode, !oldEdgeRoundingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeRoundingMode() {
		EdgeRoundingModeType oldEdgeRoundingMode = edgeRoundingMode;
		boolean oldEdgeRoundingModeESet = edgeRoundingModeESet;
		edgeRoundingMode = EDGE_ROUNDING_MODE_EDEFAULT;
		edgeRoundingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE, oldEdgeRoundingMode, EDGE_ROUNDING_MODE_EDEFAULT, oldEdgeRoundingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeRoundingMode() {
		return edgeRoundingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmissiveColor() {
		return emissiveColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissiveColor(String newEmissiveColor) {
		String oldEmissiveColor = emissiveColor;
		emissiveColor = newEmissiveColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__EMISSIVE_COLOR, oldEmissiveColor, emissiveColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEnabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		enabled = newEnabled == null ? ENABLED_EDEFAULT : newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndAngle() {
		return endAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAngle(BigInteger newEndAngle) {
		BigInteger oldEndAngle = endAngle;
		endAngle = newEndAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__END_ANGLE, oldEndAngle, endAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__FOCAL_LENGTH, oldFocalLength, focalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHorizontalSegments() {
		return horizontalSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSegments(BigInteger newHorizontalSegments) {
		BigInteger oldHorizontalSegments = horizontalSegments;
		horizontalSegments = newHorizontalSegments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__HORIZONTAL_SEGMENTS, oldHorizontalSegments, horizontalSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxEdge() {
		return maxEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEdge(String newMaxEdge) {
		String oldMaxEdge = maxEdge;
		maxEdge = newMaxEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__MAX_EDGE, oldMaxEdge, maxEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinEdge() {
		return minEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinEdge(String newMinEdge) {
		String oldMinEdge = minEdge;
		minEdge = newMinEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__MIN_EDGE, oldMinEdge, minEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsDirectionType getNormalsDirection() {
		return normalsDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalsDirection(NormalsDirectionType newNormalsDirection) {
		NormalsDirectionType oldNormalsDirection = normalsDirection;
		normalsDirection = newNormalsDirection == null ? NORMALS_DIRECTION_EDEFAULT : newNormalsDirection;
		boolean oldNormalsDirectionESet = normalsDirectionESet;
		normalsDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION, oldNormalsDirection, normalsDirection, !oldNormalsDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormalsDirection() {
		NormalsDirectionType oldNormalsDirection = normalsDirection;
		boolean oldNormalsDirectionESet = normalsDirectionESet;
		normalsDirection = NORMALS_DIRECTION_EDEFAULT;
		normalsDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION, oldNormalsDirection, NORMALS_DIRECTION_EDEFAULT, oldNormalsDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormalsDirection() {
		return normalsDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsKindType getNormalsKind() {
		return normalsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalsKind(NormalsKindType newNormalsKind) {
		NormalsKindType oldNormalsKind = normalsKind;
		normalsKind = newNormalsKind == null ? NORMALS_KIND_EDEFAULT : newNormalsKind;
		boolean oldNormalsKindESet = normalsKindESet;
		normalsKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND, oldNormalsKind, normalsKind, !oldNormalsKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormalsKind() {
		NormalsKindType oldNormalsKind = normalsKind;
		boolean oldNormalsKindESet = normalsKindESet;
		normalsKind = NORMALS_KIND_EDEFAULT;
		normalsKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND, oldNormalsKind, NORMALS_KIND_EDEFAULT, oldNormalsKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormalsKind() {
		return normalsKindESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__PROJECTION, oldProjection, projection, !oldProjectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__PROJECTION, oldProjection, PROJECTION_EDEFAULT, oldProjectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE, oldShadeMode, shadeMode, !oldShadeModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE, oldShadeMode, SHADE_MODE_EDEFAULT, oldShadeModeESet));
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
	public ShadowType getShadow() {
		return shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadow(ShadowType newShadow) {
		ShadowType oldShadow = shadow;
		shadow = newShadow == null ? SHADOW_EDEFAULT : newShadow;
		boolean oldShadowESet = shadowESet;
		shadowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SHADOW, oldShadow, shadow, !oldShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShadow() {
		ShadowType oldShadow = shadow;
		boolean oldShadowESet = shadowESet;
		shadow = SHADOW_EDEFAULT;
		shadowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__SHADOW, oldShadow, SHADOW_EDEFAULT, oldShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShadow() {
		return shadowESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SHADOW_SLANT, oldShadowSlant, shadowSlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShininess() {
		return shininess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShininess(String newShininess) {
		String oldShininess = shininess;
		shininess = newShininess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SHININESS, oldShininess, shininess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSpecular() {
		return specular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSpecular) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSpecular = specular;
		specular = newSpecular == null ? SPECULAR_EDEFAULT : newSpecular;
		boolean oldSpecularESet = specularESet;
		specularESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SPECULAR, oldSpecular, specular, !oldSpecularESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecular() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSpecular = specular;
		boolean oldSpecularESet = specularESet;
		specular = SPECULAR_EDEFAULT;
		specularESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__SPECULAR, oldSpecular, SPECULAR_EDEFAULT, oldSpecularESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecular() {
		return specularESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecularColor() {
		return specularColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColor(String newSpecularColor) {
		String oldSpecularColor = specularColor;
		specularColor = newSpecularColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__SPECULAR_COLOR, oldSpecularColor, specularColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureFilterType getTextureFilter() {
		return textureFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureFilter(TextureFilterType newTextureFilter) {
		TextureFilterType oldTextureFilter = textureFilter;
		textureFilter = newTextureFilter == null ? TEXTURE_FILTER_EDEFAULT : newTextureFilter;
		boolean oldTextureFilterESet = textureFilterESet;
		textureFilterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER, oldTextureFilter, textureFilter, !oldTextureFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureFilter() {
		TextureFilterType oldTextureFilter = textureFilter;
		boolean oldTextureFilterESet = textureFilterESet;
		textureFilter = TEXTURE_FILTER_EDEFAULT;
		textureFilterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER, oldTextureFilter, TEXTURE_FILTER_EDEFAULT, oldTextureFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureFilter() {
		return textureFilterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeXType getTextureGenerationModeX() {
		return textureGenerationModeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureGenerationModeX(TextureGenerationModeXType newTextureGenerationModeX) {
		TextureGenerationModeXType oldTextureGenerationModeX = textureGenerationModeX;
		textureGenerationModeX = newTextureGenerationModeX == null ? TEXTURE_GENERATION_MODE_X_EDEFAULT : newTextureGenerationModeX;
		boolean oldTextureGenerationModeXESet = textureGenerationModeXESet;
		textureGenerationModeXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X, oldTextureGenerationModeX, textureGenerationModeX, !oldTextureGenerationModeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureGenerationModeX() {
		TextureGenerationModeXType oldTextureGenerationModeX = textureGenerationModeX;
		boolean oldTextureGenerationModeXESet = textureGenerationModeXESet;
		textureGenerationModeX = TEXTURE_GENERATION_MODE_X_EDEFAULT;
		textureGenerationModeXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X, oldTextureGenerationModeX, TEXTURE_GENERATION_MODE_X_EDEFAULT, oldTextureGenerationModeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureGenerationModeX() {
		return textureGenerationModeXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeYType getTextureGenerationModeY() {
		return textureGenerationModeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureGenerationModeY(TextureGenerationModeYType newTextureGenerationModeY) {
		TextureGenerationModeYType oldTextureGenerationModeY = textureGenerationModeY;
		textureGenerationModeY = newTextureGenerationModeY == null ? TEXTURE_GENERATION_MODE_Y_EDEFAULT : newTextureGenerationModeY;
		boolean oldTextureGenerationModeYESet = textureGenerationModeYESet;
		textureGenerationModeYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y, oldTextureGenerationModeY, textureGenerationModeY, !oldTextureGenerationModeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureGenerationModeY() {
		TextureGenerationModeYType oldTextureGenerationModeY = textureGenerationModeY;
		boolean oldTextureGenerationModeYESet = textureGenerationModeYESet;
		textureGenerationModeY = TEXTURE_GENERATION_MODE_Y_EDEFAULT;
		textureGenerationModeYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y, oldTextureGenerationModeY, TEXTURE_GENERATION_MODE_Y_EDEFAULT, oldTextureGenerationModeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureGenerationModeY() {
		return textureGenerationModeYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureKindType getTextureKind() {
		return textureKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureKind(TextureKindType newTextureKind) {
		TextureKindType oldTextureKind = textureKind;
		textureKind = newTextureKind == null ? TEXTURE_KIND_EDEFAULT : newTextureKind;
		boolean oldTextureKindESet = textureKindESet;
		textureKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND, oldTextureKind, textureKind, !oldTextureKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureKind() {
		TextureKindType oldTextureKind = textureKind;
		boolean oldTextureKindESet = textureKindESet;
		textureKind = TEXTURE_KIND_EDEFAULT;
		textureKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND, oldTextureKind, TEXTURE_KIND_EDEFAULT, oldTextureKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureKind() {
		return textureKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModeType getTextureMode() {
		return textureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureMode(TextureModeType newTextureMode) {
		TextureModeType oldTextureMode = textureMode;
		textureMode = newTextureMode == null ? TEXTURE_MODE_EDEFAULT : newTextureMode;
		boolean oldTextureModeESet = textureModeESet;
		textureModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE, oldTextureMode, textureMode, !oldTextureModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureMode() {
		TextureModeType oldTextureMode = textureMode;
		boolean oldTextureModeESet = textureModeESet;
		textureMode = TEXTURE_MODE_EDEFAULT;
		textureModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE, oldTextureMode, TEXTURE_MODE_EDEFAULT, oldTextureModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureMode() {
		return textureModeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVerticalSegments() {
		return verticalSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSegments(BigInteger newVerticalSegments) {
		BigInteger oldVerticalSegments = verticalSegments;
		verticalSegments = newVerticalSegments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__VERTICAL_SEGMENTS, oldVerticalSegments, verticalSegments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__VPN, oldVpn, vpn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__VRP, oldVrp, vrp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.DOCUMENT_ROOT__VUP, oldVup, vup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dr3dPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__CUBE:
				return basicSetCube(null, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__EXTRUDE:
				return basicSetExtrude(null, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__LIGHT:
				return basicSetLight(null, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__ROTATE:
				return basicSetRotate(null, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__SCENE:
				return basicSetScene(null, msgs);
			case Dr3dPackage.DOCUMENT_ROOT__SPHERE:
				return basicSetSphere(null, msgs);
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
			case Dr3dPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Dr3dPackage.DOCUMENT_ROOT__CUBE:
				return getCube();
			case Dr3dPackage.DOCUMENT_ROOT__EXTRUDE:
				return getExtrude();
			case Dr3dPackage.DOCUMENT_ROOT__LIGHT:
				return getLight();
			case Dr3dPackage.DOCUMENT_ROOT__ROTATE:
				return getRotate();
			case Dr3dPackage.DOCUMENT_ROOT__SCENE:
				return getScene();
			case Dr3dPackage.DOCUMENT_ROOT__SPHERE:
				return getSphere();
			case Dr3dPackage.DOCUMENT_ROOT__AMBIENT_COLOR:
				return getAmbientColor();
			case Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING:
				return getBackfaceCulling();
			case Dr3dPackage.DOCUMENT_ROOT__BACK_SCALE:
				return getBackScale();
			case Dr3dPackage.DOCUMENT_ROOT__CENTER:
				return getCenter();
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK:
				return getCloseBack();
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT:
				return getCloseFront();
			case Dr3dPackage.DOCUMENT_ROOT__DEPTH:
				return getDepth();
			case Dr3dPackage.DOCUMENT_ROOT__DIFFUSE_COLOR:
				return getDiffuseColor();
			case Dr3dPackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case Dr3dPackage.DOCUMENT_ROOT__DISTANCE:
				return getDistance();
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING:
				return getEdgeRounding();
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE:
				return getEdgeRoundingMode();
			case Dr3dPackage.DOCUMENT_ROOT__EMISSIVE_COLOR:
				return getEmissiveColor();
			case Dr3dPackage.DOCUMENT_ROOT__ENABLED:
				return getEnabled();
			case Dr3dPackage.DOCUMENT_ROOT__END_ANGLE:
				return getEndAngle();
			case Dr3dPackage.DOCUMENT_ROOT__FOCAL_LENGTH:
				return getFocalLength();
			case Dr3dPackage.DOCUMENT_ROOT__HORIZONTAL_SEGMENTS:
				return getHorizontalSegments();
			case Dr3dPackage.DOCUMENT_ROOT__MAX_EDGE:
				return getMaxEdge();
			case Dr3dPackage.DOCUMENT_ROOT__MIN_EDGE:
				return getMinEdge();
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION:
				return getNormalsDirection();
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND:
				return getNormalsKind();
			case Dr3dPackage.DOCUMENT_ROOT__PROJECTION:
				return getProjection();
			case Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE:
				return getShadeMode();
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW:
				return getShadow();
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW_SLANT:
				return getShadowSlant();
			case Dr3dPackage.DOCUMENT_ROOT__SHININESS:
				return getShininess();
			case Dr3dPackage.DOCUMENT_ROOT__SIZE:
				return getSize();
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR:
				return getSpecular();
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR_COLOR:
				return getSpecularColor();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER:
				return getTextureFilter();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X:
				return getTextureGenerationModeX();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y:
				return getTextureGenerationModeY();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND:
				return getTextureKind();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE:
				return getTextureMode();
			case Dr3dPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case Dr3dPackage.DOCUMENT_ROOT__VERTICAL_SEGMENTS:
				return getVerticalSegments();
			case Dr3dPackage.DOCUMENT_ROOT__VPN:
				return getVpn();
			case Dr3dPackage.DOCUMENT_ROOT__VRP:
				return getVrp();
			case Dr3dPackage.DOCUMENT_ROOT__VUP:
				return getVup();
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
			case Dr3dPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CUBE:
				setCube((CubeType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EXTRUDE:
				setExtrude((ExtrudeType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__LIGHT:
				setLight((LightType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__ROTATE:
				setRotate((RotateType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SCENE:
				setScene((SceneType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__AMBIENT_COLOR:
				setAmbientColor((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING:
				setBackfaceCulling((BackfaceCullingType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__BACK_SCALE:
				setBackScale((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CENTER:
				setCenter((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK:
				setCloseBack((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT:
				setCloseFront((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DEPTH:
				setDepth((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DIFFUSE_COLOR:
				setDiffuseColor((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING:
				setEdgeRounding((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE:
				setEdgeRoundingMode((EdgeRoundingModeType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EMISSIVE_COLOR:
				setEmissiveColor((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__ENABLED:
				setEnabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__END_ANGLE:
				setEndAngle((BigInteger)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__FOCAL_LENGTH:
				setFocalLength((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__HORIZONTAL_SEGMENTS:
				setHorizontalSegments((BigInteger)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__MAX_EDGE:
				setMaxEdge((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__MIN_EDGE:
				setMinEdge((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION:
				setNormalsDirection((NormalsDirectionType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND:
				setNormalsKind((NormalsKindType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__PROJECTION:
				setProjection((ProjectionType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE:
				setShadeMode((ShadeModeType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW:
				setShadow((ShadowType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW_SLANT:
				setShadowSlant((BigInteger)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHININESS:
				setShininess((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SIZE:
				setSize((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR:
				setSpecular((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR_COLOR:
				setSpecularColor((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER:
				setTextureFilter((TextureFilterType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X:
				setTextureGenerationModeX((TextureGenerationModeXType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y:
				setTextureGenerationModeY((TextureGenerationModeYType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND:
				setTextureKind((TextureKindType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE:
				setTextureMode((TextureModeType)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform(newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VERTICAL_SEGMENTS:
				setVerticalSegments((BigInteger)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VPN:
				setVpn((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VRP:
				setVrp((String)newValue);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VUP:
				setVup((String)newValue);
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
			case Dr3dPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CUBE:
				setCube((CubeType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EXTRUDE:
				setExtrude((ExtrudeType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__LIGHT:
				setLight((LightType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__ROTATE:
				setRotate((RotateType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SCENE:
				setScene((SceneType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)null);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__AMBIENT_COLOR:
				setAmbientColor(AMBIENT_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING:
				unsetBackfaceCulling();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__BACK_SCALE:
				setBackScale(BACK_SCALE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CENTER:
				setCenter(CENTER_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK:
				unsetCloseBack();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT:
				unsetCloseFront();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DIFFUSE_COLOR:
				setDiffuseColor(DIFFUSE_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING:
				setEdgeRounding(EDGE_ROUNDING_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE:
				unsetEdgeRoundingMode();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__EMISSIVE_COLOR:
				setEmissiveColor(EMISSIVE_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__ENABLED:
				unsetEnabled();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__END_ANGLE:
				setEndAngle(END_ANGLE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__FOCAL_LENGTH:
				setFocalLength(FOCAL_LENGTH_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__HORIZONTAL_SEGMENTS:
				setHorizontalSegments(HORIZONTAL_SEGMENTS_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__MAX_EDGE:
				setMaxEdge(MAX_EDGE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__MIN_EDGE:
				setMinEdge(MIN_EDGE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION:
				unsetNormalsDirection();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND:
				unsetNormalsKind();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__PROJECTION:
				unsetProjection();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE:
				unsetShadeMode();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW:
				unsetShadow();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW_SLANT:
				setShadowSlant(SHADOW_SLANT_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SHININESS:
				setShininess(SHININESS_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR:
				unsetSpecular();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR_COLOR:
				setSpecularColor(SPECULAR_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER:
				unsetTextureFilter();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X:
				unsetTextureGenerationModeX();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y:
				unsetTextureGenerationModeY();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND:
				unsetTextureKind();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE:
				unsetTextureMode();
				return;
			case Dr3dPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VERTICAL_SEGMENTS:
				setVerticalSegments(VERTICAL_SEGMENTS_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VPN:
				setVpn(VPN_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VRP:
				setVrp(VRP_EDEFAULT);
				return;
			case Dr3dPackage.DOCUMENT_ROOT__VUP:
				setVup(VUP_EDEFAULT);
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
			case Dr3dPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Dr3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Dr3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Dr3dPackage.DOCUMENT_ROOT__CUBE:
				return getCube() != null;
			case Dr3dPackage.DOCUMENT_ROOT__EXTRUDE:
				return getExtrude() != null;
			case Dr3dPackage.DOCUMENT_ROOT__LIGHT:
				return getLight() != null;
			case Dr3dPackage.DOCUMENT_ROOT__ROTATE:
				return getRotate() != null;
			case Dr3dPackage.DOCUMENT_ROOT__SCENE:
				return getScene() != null;
			case Dr3dPackage.DOCUMENT_ROOT__SPHERE:
				return getSphere() != null;
			case Dr3dPackage.DOCUMENT_ROOT__AMBIENT_COLOR:
				return AMBIENT_COLOR_EDEFAULT == null ? ambientColor != null : !AMBIENT_COLOR_EDEFAULT.equals(ambientColor);
			case Dr3dPackage.DOCUMENT_ROOT__BACKFACE_CULLING:
				return isSetBackfaceCulling();
			case Dr3dPackage.DOCUMENT_ROOT__BACK_SCALE:
				return BACK_SCALE_EDEFAULT == null ? backScale != null : !BACK_SCALE_EDEFAULT.equals(backScale);
			case Dr3dPackage.DOCUMENT_ROOT__CENTER:
				return CENTER_EDEFAULT == null ? center != null : !CENTER_EDEFAULT.equals(center);
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_BACK:
				return isSetCloseBack();
			case Dr3dPackage.DOCUMENT_ROOT__CLOSE_FRONT:
				return isSetCloseFront();
			case Dr3dPackage.DOCUMENT_ROOT__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case Dr3dPackage.DOCUMENT_ROOT__DIFFUSE_COLOR:
				return DIFFUSE_COLOR_EDEFAULT == null ? diffuseColor != null : !DIFFUSE_COLOR_EDEFAULT.equals(diffuseColor);
			case Dr3dPackage.DOCUMENT_ROOT__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case Dr3dPackage.DOCUMENT_ROOT__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING:
				return EDGE_ROUNDING_EDEFAULT == null ? edgeRounding != null : !EDGE_ROUNDING_EDEFAULT.equals(edgeRounding);
			case Dr3dPackage.DOCUMENT_ROOT__EDGE_ROUNDING_MODE:
				return isSetEdgeRoundingMode();
			case Dr3dPackage.DOCUMENT_ROOT__EMISSIVE_COLOR:
				return EMISSIVE_COLOR_EDEFAULT == null ? emissiveColor != null : !EMISSIVE_COLOR_EDEFAULT.equals(emissiveColor);
			case Dr3dPackage.DOCUMENT_ROOT__ENABLED:
				return isSetEnabled();
			case Dr3dPackage.DOCUMENT_ROOT__END_ANGLE:
				return END_ANGLE_EDEFAULT == null ? endAngle != null : !END_ANGLE_EDEFAULT.equals(endAngle);
			case Dr3dPackage.DOCUMENT_ROOT__FOCAL_LENGTH:
				return FOCAL_LENGTH_EDEFAULT == null ? focalLength != null : !FOCAL_LENGTH_EDEFAULT.equals(focalLength);
			case Dr3dPackage.DOCUMENT_ROOT__HORIZONTAL_SEGMENTS:
				return HORIZONTAL_SEGMENTS_EDEFAULT == null ? horizontalSegments != null : !HORIZONTAL_SEGMENTS_EDEFAULT.equals(horizontalSegments);
			case Dr3dPackage.DOCUMENT_ROOT__MAX_EDGE:
				return MAX_EDGE_EDEFAULT == null ? maxEdge != null : !MAX_EDGE_EDEFAULT.equals(maxEdge);
			case Dr3dPackage.DOCUMENT_ROOT__MIN_EDGE:
				return MIN_EDGE_EDEFAULT == null ? minEdge != null : !MIN_EDGE_EDEFAULT.equals(minEdge);
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_DIRECTION:
				return isSetNormalsDirection();
			case Dr3dPackage.DOCUMENT_ROOT__NORMALS_KIND:
				return isSetNormalsKind();
			case Dr3dPackage.DOCUMENT_ROOT__PROJECTION:
				return isSetProjection();
			case Dr3dPackage.DOCUMENT_ROOT__SHADE_MODE:
				return isSetShadeMode();
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW:
				return isSetShadow();
			case Dr3dPackage.DOCUMENT_ROOT__SHADOW_SLANT:
				return SHADOW_SLANT_EDEFAULT == null ? shadowSlant != null : !SHADOW_SLANT_EDEFAULT.equals(shadowSlant);
			case Dr3dPackage.DOCUMENT_ROOT__SHININESS:
				return SHININESS_EDEFAULT == null ? shininess != null : !SHININESS_EDEFAULT.equals(shininess);
			case Dr3dPackage.DOCUMENT_ROOT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR:
				return isSetSpecular();
			case Dr3dPackage.DOCUMENT_ROOT__SPECULAR_COLOR:
				return SPECULAR_COLOR_EDEFAULT == null ? specularColor != null : !SPECULAR_COLOR_EDEFAULT.equals(specularColor);
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_FILTER:
				return isSetTextureFilter();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X:
				return isSetTextureGenerationModeX();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y:
				return isSetTextureGenerationModeY();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_KIND:
				return isSetTextureKind();
			case Dr3dPackage.DOCUMENT_ROOT__TEXTURE_MODE:
				return isSetTextureMode();
			case Dr3dPackage.DOCUMENT_ROOT__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case Dr3dPackage.DOCUMENT_ROOT__VERTICAL_SEGMENTS:
				return VERTICAL_SEGMENTS_EDEFAULT == null ? verticalSegments != null : !VERTICAL_SEGMENTS_EDEFAULT.equals(verticalSegments);
			case Dr3dPackage.DOCUMENT_ROOT__VPN:
				return VPN_EDEFAULT == null ? vpn != null : !VPN_EDEFAULT.equals(vpn);
			case Dr3dPackage.DOCUMENT_ROOT__VRP:
				return VRP_EDEFAULT == null ? vrp != null : !VRP_EDEFAULT.equals(vrp);
			case Dr3dPackage.DOCUMENT_ROOT__VUP:
				return VUP_EDEFAULT == null ? vup != null : !VUP_EDEFAULT.equals(vup);
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
		result.append(", ambientColor: ");
		result.append(ambientColor);
		result.append(", backfaceCulling: ");
		if (backfaceCullingESet) result.append(backfaceCulling); else result.append("<unset>");
		result.append(", backScale: ");
		result.append(backScale);
		result.append(", center: ");
		result.append(center);
		result.append(", closeBack: ");
		if (closeBackESet) result.append(closeBack); else result.append("<unset>");
		result.append(", closeFront: ");
		if (closeFrontESet) result.append(closeFront); else result.append("<unset>");
		result.append(", depth: ");
		result.append(depth);
		result.append(", diffuseColor: ");
		result.append(diffuseColor);
		result.append(", direction: ");
		result.append(direction);
		result.append(", distance: ");
		result.append(distance);
		result.append(", edgeRounding: ");
		result.append(edgeRounding);
		result.append(", edgeRoundingMode: ");
		if (edgeRoundingModeESet) result.append(edgeRoundingMode); else result.append("<unset>");
		result.append(", emissiveColor: ");
		result.append(emissiveColor);
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", endAngle: ");
		result.append(endAngle);
		result.append(", focalLength: ");
		result.append(focalLength);
		result.append(", horizontalSegments: ");
		result.append(horizontalSegments);
		result.append(", maxEdge: ");
		result.append(maxEdge);
		result.append(", minEdge: ");
		result.append(minEdge);
		result.append(", normalsDirection: ");
		if (normalsDirectionESet) result.append(normalsDirection); else result.append("<unset>");
		result.append(", normalsKind: ");
		if (normalsKindESet) result.append(normalsKind); else result.append("<unset>");
		result.append(", projection: ");
		if (projectionESet) result.append(projection); else result.append("<unset>");
		result.append(", shadeMode: ");
		if (shadeModeESet) result.append(shadeMode); else result.append("<unset>");
		result.append(", shadow: ");
		if (shadowESet) result.append(shadow); else result.append("<unset>");
		result.append(", shadowSlant: ");
		result.append(shadowSlant);
		result.append(", shininess: ");
		result.append(shininess);
		result.append(", size: ");
		result.append(size);
		result.append(", specular: ");
		if (specularESet) result.append(specular); else result.append("<unset>");
		result.append(", specularColor: ");
		result.append(specularColor);
		result.append(", textureFilter: ");
		if (textureFilterESet) result.append(textureFilter); else result.append("<unset>");
		result.append(", textureGenerationModeX: ");
		if (textureGenerationModeXESet) result.append(textureGenerationModeX); else result.append("<unset>");
		result.append(", textureGenerationModeY: ");
		if (textureGenerationModeYESet) result.append(textureGenerationModeY); else result.append("<unset>");
		result.append(", textureKind: ");
		if (textureKindESet) result.append(textureKind); else result.append("<unset>");
		result.append(", textureMode: ");
		if (textureModeESet) result.append(textureMode); else result.append("<unset>");
		result.append(", transform: ");
		result.append(transform);
		result.append(", verticalSegments: ");
		result.append(verticalSegments);
		result.append(", vpn: ");
		result.append(vpn);
		result.append(", vrp: ");
		result.append(vrp);
		result.append(", vup: ");
		result.append(vup);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
