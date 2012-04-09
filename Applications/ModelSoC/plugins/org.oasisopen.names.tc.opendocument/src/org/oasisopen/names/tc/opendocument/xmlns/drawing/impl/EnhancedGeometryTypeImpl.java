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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingFactory;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enhanced Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getEnhancedPath <em>Enhanced Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionAllowed <em>Extrusion Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionBrightness <em>Extrusion Brightness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionColor <em>Extrusion Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionDepth <em>Extrusion Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionDiffusion <em>Extrusion Diffusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionLightFace <em>Extrusion Light Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionMetal <em>Extrusion Metal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionOrigin <em>Extrusion Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionShininess <em>Extrusion Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionSkew <em>Extrusion Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionSpecularity <em>Extrusion Specularity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getGluePoints <em>Glue Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getGluePointType <em>Glue Point Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getMirrorHorizontal <em>Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getMirrorVertical <em>Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getPathStretchpointX <em>Path Stretchpoint X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getPathStretchpointY <em>Path Stretchpoint Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextAreas <em>Text Areas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextPath <em>Text Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextPathAllowed <em>Text Path Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextPathMode <em>Text Path Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextPathScale <em>Text Path Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getTextRotateAngle <em>Text Rotate Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl#getViewBox <em>View Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnhancedGeometryTypeImpl extends EObjectImpl implements EnhancedGeometryType {
	/**
	 * The cached value of the '{@link #getEquation() <em>Equation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquation()
	 * @generated
	 * @ordered
	 */
	protected EList<EquationType> equation;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected EList<HandleType> handle;

	/**
	 * The default value of the '{@link #getConcentricGradientFillAllowed() <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConcentricGradientFillAllowed() <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean concentricGradientFillAllowed = CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Concentric Gradient Fill Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concentricGradientFillAllowedESet;

	/**
	 * The default value of the '{@link #getEnhancedPath() <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ENHANCED_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnhancedPath() <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedPath()
	 * @generated
	 * @ordered
	 */
	protected String enhancedPath = ENHANCED_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusion() <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getExtrusion() <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusion = EXTRUSION_EDEFAULT;

	/**
	 * This is true if the Extrusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionESet;

	/**
	 * The default value of the '{@link #getExtrusionAllowed() <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getExtrusionAllowed() <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionAllowed = EXTRUSION_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Extrusion Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionAllowedESet;

	/**
	 * The default value of the '{@link #getExtrusionBrightness() <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_BRIGHTNESS_EDEFAULT = "33%";

	/**
	 * The cached value of the '{@link #getExtrusionBrightness() <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionBrightness()
	 * @generated
	 * @ordered
	 */
	protected String extrusionBrightness = EXTRUSION_BRIGHTNESS_EDEFAULT;

	/**
	 * This is true if the Extrusion Brightness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionBrightnessESet;

	/**
	 * The default value of the '{@link #getExtrusionColor() <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionColor()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_COLOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getExtrusionColor() <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionColor()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionColor = EXTRUSION_COLOR_EDEFAULT;

	/**
	 * This is true if the Extrusion Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionColorESet;

	/**
	 * The default value of the '{@link #getExtrusionDepth() <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDepth()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_DEPTH_EDEFAULT = (List)DrawingFactory.eINSTANCE.createFromString(DrawingPackage.eINSTANCE.getExtrusionDepthType(), "36pt 0");

	/**
	 * The cached value of the '{@link #getExtrusionDepth() <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDepth()
	 * @generated
	 * @ordered
	 */
	protected List extrusionDepth = EXTRUSION_DEPTH_EDEFAULT;

	/**
	 * This is true if the Extrusion Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionDepthESet;

	/**
	 * The default value of the '{@link #getExtrusionDiffusion() <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDiffusion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_DIFFUSION_EDEFAULT = "0%";

	/**
	 * The cached value of the '{@link #getExtrusionDiffusion() <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDiffusion()
	 * @generated
	 * @ordered
	 */
	protected String extrusionDiffusion = EXTRUSION_DIFFUSION_EDEFAULT;

	/**
	 * This is true if the Extrusion Diffusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionDiffusionESet;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightDirection() <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT = "(5 0 1)";

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightDirection() <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 * @ordered
	 */
	protected String extrusionFirstLightDirection = EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Extrusion First Light Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionFirstLightDirectionESet;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightHarsh() <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightHarsh() <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionFirstLightHarsh = EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT;

	/**
	 * This is true if the Extrusion First Light Harsh attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionFirstLightHarshESet;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightLevel() <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT = "66%";

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightLevel() <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 * @ordered
	 */
	protected String extrusionFirstLightLevel = EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT;

	/**
	 * This is true if the Extrusion First Light Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionFirstLightLevelESet;

	/**
	 * The default value of the '{@link #getExtrusionLightFace() <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionLightFace()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_LIGHT_FACE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionLightFace() <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionLightFace()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionLightFace = EXTRUSION_LIGHT_FACE_EDEFAULT;

	/**
	 * This is true if the Extrusion Light Face attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionLightFaceESet;

	/**
	 * The default value of the '{@link #getExtrusionMetal() <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionMetal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_METAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getExtrusionMetal() <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionMetal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionMetal = EXTRUSION_METAL_EDEFAULT;

	/**
	 * This is true if the Extrusion Metal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionMetalESet;

	/**
	 * The default value of the '{@link #getExtrusionNumberOfLineSegments() <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT = new BigInteger("30");

	/**
	 * The cached value of the '{@link #getExtrusionNumberOfLineSegments() <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 * @ordered
	 */
	protected BigInteger extrusionNumberOfLineSegments = EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT;

	/**
	 * This is true if the Extrusion Number Of Line Segments attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionNumberOfLineSegmentsESet;

	/**
	 * The default value of the '{@link #getExtrusionOrigin() <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_ORIGIN_EDEFAULT = (List)DrawingFactory.eINSTANCE.createFromString(DrawingPackage.eINSTANCE.getExtrusionOriginType(), "0.5 -0.5");

	/**
	 * The cached value of the '{@link #getExtrusionOrigin() <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionOrigin()
	 * @generated
	 * @ordered
	 */
	protected List extrusionOrigin = EXTRUSION_ORIGIN_EDEFAULT;

	/**
	 * This is true if the Extrusion Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionOriginESet;

	/**
	 * The default value of the '{@link #getExtrusionRotationAngle() <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_ROTATION_ANGLE_EDEFAULT = (List)DrawingFactory.eINSTANCE.createFromString(DrawingPackage.eINSTANCE.getExtrusionRotationAngleType(), "0 0");

	/**
	 * The cached value of the '{@link #getExtrusionRotationAngle() <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected List extrusionRotationAngle = EXTRUSION_ROTATION_ANGLE_EDEFAULT;

	/**
	 * This is true if the Extrusion Rotation Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionRotationAngleESet;

	/**
	 * The default value of the '{@link #getExtrusionRotationCenter() <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_ROTATION_CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionRotationCenter() <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 * @ordered
	 */
	protected String extrusionRotationCenter = EXTRUSION_ROTATION_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightDirection() <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT = "(-5 0 1)";

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightDirection() <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSecondLightDirection = EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Extrusion Second Light Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSecondLightDirectionESet;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightHarsh() <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightHarsh() <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionSecondLightHarsh = EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT;

	/**
	 * This is true if the Extrusion Second Light Harsh attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSecondLightHarshESet;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightLevel() <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT = "66%";

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightLevel() <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSecondLightLevel = EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT;

	/**
	 * This is true if the Extrusion Second Light Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSecondLightLevelESet;

	/**
	 * The default value of the '{@link #getExtrusionShininess() <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionShininess()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SHININESS_EDEFAULT = "50%";

	/**
	 * The cached value of the '{@link #getExtrusionShininess() <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionShininess()
	 * @generated
	 * @ordered
	 */
	protected String extrusionShininess = EXTRUSION_SHININESS_EDEFAULT;

	/**
	 * This is true if the Extrusion Shininess attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionShininessESet;

	/**
	 * The default value of the '{@link #getExtrusionSkew() <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSkew()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_SKEW_EDEFAULT = (List)DrawingFactory.eINSTANCE.createFromString(DrawingPackage.eINSTANCE.getExtrusionSkewType(), "50 45");

	/**
	 * The cached value of the '{@link #getExtrusionSkew() <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSkew()
	 * @generated
	 * @ordered
	 */
	protected List extrusionSkew = EXTRUSION_SKEW_EDEFAULT;

	/**
	 * This is true if the Extrusion Skew attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSkewESet;

	/**
	 * The default value of the '{@link #getExtrusionSpecularity() <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSpecularity()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SPECULARITY_EDEFAULT = "0%";

	/**
	 * The cached value of the '{@link #getExtrusionSpecularity() <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSpecularity()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSpecularity = EXTRUSION_SPECULARITY_EDEFAULT;

	/**
	 * This is true if the Extrusion Specularity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSpecularityESet;

	/**
	 * The default value of the '{@link #getExtrusionViewpoint() <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_VIEWPOINT_EDEFAULT = "3.5cm -3.5cm 25cm";

	/**
	 * The cached value of the '{@link #getExtrusionViewpoint() <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String extrusionViewpoint = EXTRUSION_VIEWPOINT_EDEFAULT;

	/**
	 * This is true if the Extrusion Viewpoint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionViewpointESet;

	/**
	 * The default value of the '{@link #getGluePointLeavingDirections() <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 * @ordered
	 */
	protected static final Object GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGluePointLeavingDirections() <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 * @ordered
	 */
	protected Object gluePointLeavingDirections = GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGluePoints() <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePoints()
	 * @generated
	 * @ordered
	 */
	protected static final String GLUE_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGluePoints() <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePoints()
	 * @generated
	 * @ordered
	 */
	protected String gluePoints = GLUE_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGluePointType() <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointType()
	 * @generated
	 * @ordered
	 */
	protected static final GluePointTypeType GLUE_POINT_TYPE_EDEFAULT = GluePointTypeType.NONE;

	/**
	 * The cached value of the '{@link #getGluePointType() <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointType()
	 * @generated
	 * @ordered
	 */
	protected GluePointTypeType gluePointType = GLUE_POINT_TYPE_EDEFAULT;

	/**
	 * This is true if the Glue Point Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gluePointTypeESet;

	/**
	 * The default value of the '{@link #getMirrorHorizontal() <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MIRROR_HORIZONTAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMirrorHorizontal() <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mirrorHorizontal = MIRROR_HORIZONTAL_EDEFAULT;

	/**
	 * This is true if the Mirror Horizontal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mirrorHorizontalESet;

	/**
	 * The default value of the '{@link #getMirrorVertical() <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MIRROR_VERTICAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMirrorVertical() <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mirrorVertical = MIRROR_VERTICAL_EDEFAULT;

	/**
	 * This is true if the Mirror Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mirrorVerticalESet;

	/**
	 * The default value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected String modifiers = MODIFIERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathStretchpointX() <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointX()
	 * @generated
	 * @ordered
	 */
	protected static final double PATH_STRETCHPOINT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPathStretchpointX() <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointX()
	 * @generated
	 * @ordered
	 */
	protected double pathStretchpointX = PATH_STRETCHPOINT_X_EDEFAULT;

	/**
	 * This is true if the Path Stretchpoint X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pathStretchpointXESet;

	/**
	 * The default value of the '{@link #getPathStretchpointY() <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointY()
	 * @generated
	 * @ordered
	 */
	protected static final double PATH_STRETCHPOINT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPathStretchpointY() <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointY()
	 * @generated
	 * @ordered
	 */
	protected double pathStretchpointY = PATH_STRETCHPOINT_Y_EDEFAULT;

	/**
	 * This is true if the Path Stretchpoint Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pathStretchpointYESet;

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
	 * The default value of the '{@link #getTextAreas() <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAreas()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_AREAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAreas() <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAreas()
	 * @generated
	 * @ordered
	 */
	protected String textAreas = TEXT_AREAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextPath() <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPath()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTextPath() <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPath()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPath = TEXT_PATH_EDEFAULT;

	/**
	 * This is true if the Text Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathESet;

	/**
	 * The default value of the '{@link #getTextPathAllowed() <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTextPathAllowed() <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPathAllowed = TEXT_PATH_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Text Path Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathAllowedESet;

	/**
	 * The default value of the '{@link #getTextPathMode() <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathMode()
	 * @generated
	 * @ordered
	 */
	protected static final TextPathModeType TEXT_PATH_MODE_EDEFAULT = TextPathModeType.NORMAL;

	/**
	 * The cached value of the '{@link #getTextPathMode() <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathMode()
	 * @generated
	 * @ordered
	 */
	protected TextPathModeType textPathMode = TEXT_PATH_MODE_EDEFAULT;

	/**
	 * This is true if the Text Path Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathModeESet;

	/**
	 * The default value of the '{@link #getTextPathSameLetterHeights() <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTextPathSameLetterHeights() <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPathSameLetterHeights = TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT;

	/**
	 * This is true if the Text Path Same Letter Heights attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathSameLetterHeightsESet;

	/**
	 * The default value of the '{@link #getTextPathScale() <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathScale()
	 * @generated
	 * @ordered
	 */
	protected static final TextPathScaleType TEXT_PATH_SCALE_EDEFAULT = TextPathScaleType.PATH;

	/**
	 * The cached value of the '{@link #getTextPathScale() <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathScale()
	 * @generated
	 * @ordered
	 */
	protected TextPathScaleType textPathScale = TEXT_PATH_SCALE_EDEFAULT;

	/**
	 * This is true if the Text Path Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathScaleESet;

	/**
	 * The default value of the '{@link #getTextRotateAngle() <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TEXT_ROTATE_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTextRotateAngle() <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected double textRotateAngle = TEXT_ROTATE_ANGLE_EDEFAULT;

	/**
	 * This is true if the Text Rotate Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textRotateAngleESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected static final List VIEW_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected List viewBox = VIEW_BOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnhancedGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getEnhancedGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquationType> getEquation() {
		if (equation == null) {
			equation = new EObjectContainmentEList<EquationType>(EquationType.class, this, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION);
		}
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandleType> getHandle() {
		if (handle == null) {
			handle = new EObjectContainmentEList<HandleType>(HandleType.class, this, DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE);
		}
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConcentricGradientFillAllowed() {
		return concentricGradientFillAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newConcentricGradientFillAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConcentricGradientFillAllowed = concentricGradientFillAllowed;
		concentricGradientFillAllowed = newConcentricGradientFillAllowed == null ? CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT : newConcentricGradientFillAllowed;
		boolean oldConcentricGradientFillAllowedESet = concentricGradientFillAllowedESet;
		concentricGradientFillAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED, oldConcentricGradientFillAllowed, concentricGradientFillAllowed, !oldConcentricGradientFillAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcentricGradientFillAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConcentricGradientFillAllowed = concentricGradientFillAllowed;
		boolean oldConcentricGradientFillAllowedESet = concentricGradientFillAllowedESet;
		concentricGradientFillAllowed = CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT;
		concentricGradientFillAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED, oldConcentricGradientFillAllowed, CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT, oldConcentricGradientFillAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcentricGradientFillAllowed() {
		return concentricGradientFillAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnhancedPath() {
		return enhancedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnhancedPath(String newEnhancedPath) {
		String oldEnhancedPath = enhancedPath;
		enhancedPath = newEnhancedPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH, oldEnhancedPath, enhancedPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusion() {
		return extrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusion) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusion = extrusion;
		extrusion = newExtrusion == null ? EXTRUSION_EDEFAULT : newExtrusion;
		boolean oldExtrusionESet = extrusionESet;
		extrusionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION, oldExtrusion, extrusion, !oldExtrusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusion() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusion = extrusion;
		boolean oldExtrusionESet = extrusionESet;
		extrusion = EXTRUSION_EDEFAULT;
		extrusionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION, oldExtrusion, EXTRUSION_EDEFAULT, oldExtrusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusion() {
		return extrusionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionAllowed() {
		return extrusionAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionAllowed = extrusionAllowed;
		extrusionAllowed = newExtrusionAllowed == null ? EXTRUSION_ALLOWED_EDEFAULT : newExtrusionAllowed;
		boolean oldExtrusionAllowedESet = extrusionAllowedESet;
		extrusionAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED, oldExtrusionAllowed, extrusionAllowed, !oldExtrusionAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionAllowed = extrusionAllowed;
		boolean oldExtrusionAllowedESet = extrusionAllowedESet;
		extrusionAllowed = EXTRUSION_ALLOWED_EDEFAULT;
		extrusionAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED, oldExtrusionAllowed, EXTRUSION_ALLOWED_EDEFAULT, oldExtrusionAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionAllowed() {
		return extrusionAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionBrightness() {
		return extrusionBrightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionBrightness(String newExtrusionBrightness) {
		String oldExtrusionBrightness = extrusionBrightness;
		extrusionBrightness = newExtrusionBrightness;
		boolean oldExtrusionBrightnessESet = extrusionBrightnessESet;
		extrusionBrightnessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS, oldExtrusionBrightness, extrusionBrightness, !oldExtrusionBrightnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionBrightness() {
		String oldExtrusionBrightness = extrusionBrightness;
		boolean oldExtrusionBrightnessESet = extrusionBrightnessESet;
		extrusionBrightness = EXTRUSION_BRIGHTNESS_EDEFAULT;
		extrusionBrightnessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS, oldExtrusionBrightness, EXTRUSION_BRIGHTNESS_EDEFAULT, oldExtrusionBrightnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionBrightness() {
		return extrusionBrightnessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionColor() {
		return extrusionColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionColor) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionColor = extrusionColor;
		extrusionColor = newExtrusionColor == null ? EXTRUSION_COLOR_EDEFAULT : newExtrusionColor;
		boolean oldExtrusionColorESet = extrusionColorESet;
		extrusionColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR, oldExtrusionColor, extrusionColor, !oldExtrusionColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionColor() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionColor = extrusionColor;
		boolean oldExtrusionColorESet = extrusionColorESet;
		extrusionColor = EXTRUSION_COLOR_EDEFAULT;
		extrusionColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR, oldExtrusionColor, EXTRUSION_COLOR_EDEFAULT, oldExtrusionColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionColor() {
		return extrusionColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionDepth() {
		return extrusionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionDepth(List newExtrusionDepth) {
		List oldExtrusionDepth = extrusionDepth;
		extrusionDepth = newExtrusionDepth;
		boolean oldExtrusionDepthESet = extrusionDepthESet;
		extrusionDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH, oldExtrusionDepth, extrusionDepth, !oldExtrusionDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionDepth() {
		List oldExtrusionDepth = extrusionDepth;
		boolean oldExtrusionDepthESet = extrusionDepthESet;
		extrusionDepth = EXTRUSION_DEPTH_EDEFAULT;
		extrusionDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH, oldExtrusionDepth, EXTRUSION_DEPTH_EDEFAULT, oldExtrusionDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionDepth() {
		return extrusionDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionDiffusion() {
		return extrusionDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionDiffusion(String newExtrusionDiffusion) {
		String oldExtrusionDiffusion = extrusionDiffusion;
		extrusionDiffusion = newExtrusionDiffusion;
		boolean oldExtrusionDiffusionESet = extrusionDiffusionESet;
		extrusionDiffusionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION, oldExtrusionDiffusion, extrusionDiffusion, !oldExtrusionDiffusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionDiffusion() {
		String oldExtrusionDiffusion = extrusionDiffusion;
		boolean oldExtrusionDiffusionESet = extrusionDiffusionESet;
		extrusionDiffusion = EXTRUSION_DIFFUSION_EDEFAULT;
		extrusionDiffusionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION, oldExtrusionDiffusion, EXTRUSION_DIFFUSION_EDEFAULT, oldExtrusionDiffusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionDiffusion() {
		return extrusionDiffusionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionFirstLightDirection() {
		return extrusionFirstLightDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightDirection(String newExtrusionFirstLightDirection) {
		String oldExtrusionFirstLightDirection = extrusionFirstLightDirection;
		extrusionFirstLightDirection = newExtrusionFirstLightDirection;
		boolean oldExtrusionFirstLightDirectionESet = extrusionFirstLightDirectionESet;
		extrusionFirstLightDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION, oldExtrusionFirstLightDirection, extrusionFirstLightDirection, !oldExtrusionFirstLightDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionFirstLightDirection() {
		String oldExtrusionFirstLightDirection = extrusionFirstLightDirection;
		boolean oldExtrusionFirstLightDirectionESet = extrusionFirstLightDirectionESet;
		extrusionFirstLightDirection = EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT;
		extrusionFirstLightDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION, oldExtrusionFirstLightDirection, EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT, oldExtrusionFirstLightDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionFirstLightDirection() {
		return extrusionFirstLightDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionFirstLightHarsh() {
		return extrusionFirstLightHarsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionFirstLightHarsh) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionFirstLightHarsh = extrusionFirstLightHarsh;
		extrusionFirstLightHarsh = newExtrusionFirstLightHarsh == null ? EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT : newExtrusionFirstLightHarsh;
		boolean oldExtrusionFirstLightHarshESet = extrusionFirstLightHarshESet;
		extrusionFirstLightHarshESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH, oldExtrusionFirstLightHarsh, extrusionFirstLightHarsh, !oldExtrusionFirstLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionFirstLightHarsh() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionFirstLightHarsh = extrusionFirstLightHarsh;
		boolean oldExtrusionFirstLightHarshESet = extrusionFirstLightHarshESet;
		extrusionFirstLightHarsh = EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT;
		extrusionFirstLightHarshESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH, oldExtrusionFirstLightHarsh, EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT, oldExtrusionFirstLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionFirstLightHarsh() {
		return extrusionFirstLightHarshESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionFirstLightLevel() {
		return extrusionFirstLightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightLevel(String newExtrusionFirstLightLevel) {
		String oldExtrusionFirstLightLevel = extrusionFirstLightLevel;
		extrusionFirstLightLevel = newExtrusionFirstLightLevel;
		boolean oldExtrusionFirstLightLevelESet = extrusionFirstLightLevelESet;
		extrusionFirstLightLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL, oldExtrusionFirstLightLevel, extrusionFirstLightLevel, !oldExtrusionFirstLightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionFirstLightLevel() {
		String oldExtrusionFirstLightLevel = extrusionFirstLightLevel;
		boolean oldExtrusionFirstLightLevelESet = extrusionFirstLightLevelESet;
		extrusionFirstLightLevel = EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT;
		extrusionFirstLightLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL, oldExtrusionFirstLightLevel, EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT, oldExtrusionFirstLightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionFirstLightLevel() {
		return extrusionFirstLightLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionLightFace() {
		return extrusionLightFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionLightFace) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionLightFace = extrusionLightFace;
		extrusionLightFace = newExtrusionLightFace == null ? EXTRUSION_LIGHT_FACE_EDEFAULT : newExtrusionLightFace;
		boolean oldExtrusionLightFaceESet = extrusionLightFaceESet;
		extrusionLightFaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE, oldExtrusionLightFace, extrusionLightFace, !oldExtrusionLightFaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionLightFace() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionLightFace = extrusionLightFace;
		boolean oldExtrusionLightFaceESet = extrusionLightFaceESet;
		extrusionLightFace = EXTRUSION_LIGHT_FACE_EDEFAULT;
		extrusionLightFaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE, oldExtrusionLightFace, EXTRUSION_LIGHT_FACE_EDEFAULT, oldExtrusionLightFaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionLightFace() {
		return extrusionLightFaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionMetal() {
		return extrusionMetal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionMetal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionMetal = extrusionMetal;
		extrusionMetal = newExtrusionMetal == null ? EXTRUSION_METAL_EDEFAULT : newExtrusionMetal;
		boolean oldExtrusionMetalESet = extrusionMetalESet;
		extrusionMetalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL, oldExtrusionMetal, extrusionMetal, !oldExtrusionMetalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionMetal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionMetal = extrusionMetal;
		boolean oldExtrusionMetalESet = extrusionMetalESet;
		extrusionMetal = EXTRUSION_METAL_EDEFAULT;
		extrusionMetalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL, oldExtrusionMetal, EXTRUSION_METAL_EDEFAULT, oldExtrusionMetalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionMetal() {
		return extrusionMetalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getExtrusionNumberOfLineSegments() {
		return extrusionNumberOfLineSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionNumberOfLineSegments(BigInteger newExtrusionNumberOfLineSegments) {
		BigInteger oldExtrusionNumberOfLineSegments = extrusionNumberOfLineSegments;
		extrusionNumberOfLineSegments = newExtrusionNumberOfLineSegments;
		boolean oldExtrusionNumberOfLineSegmentsESet = extrusionNumberOfLineSegmentsESet;
		extrusionNumberOfLineSegmentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS, oldExtrusionNumberOfLineSegments, extrusionNumberOfLineSegments, !oldExtrusionNumberOfLineSegmentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionNumberOfLineSegments() {
		BigInteger oldExtrusionNumberOfLineSegments = extrusionNumberOfLineSegments;
		boolean oldExtrusionNumberOfLineSegmentsESet = extrusionNumberOfLineSegmentsESet;
		extrusionNumberOfLineSegments = EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT;
		extrusionNumberOfLineSegmentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS, oldExtrusionNumberOfLineSegments, EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT, oldExtrusionNumberOfLineSegmentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionNumberOfLineSegments() {
		return extrusionNumberOfLineSegmentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionOrigin() {
		return extrusionOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionOrigin(List newExtrusionOrigin) {
		List oldExtrusionOrigin = extrusionOrigin;
		extrusionOrigin = newExtrusionOrigin;
		boolean oldExtrusionOriginESet = extrusionOriginESet;
		extrusionOriginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN, oldExtrusionOrigin, extrusionOrigin, !oldExtrusionOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionOrigin() {
		List oldExtrusionOrigin = extrusionOrigin;
		boolean oldExtrusionOriginESet = extrusionOriginESet;
		extrusionOrigin = EXTRUSION_ORIGIN_EDEFAULT;
		extrusionOriginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN, oldExtrusionOrigin, EXTRUSION_ORIGIN_EDEFAULT, oldExtrusionOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionOrigin() {
		return extrusionOriginESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionRotationAngle() {
		return extrusionRotationAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionRotationAngle(List newExtrusionRotationAngle) {
		List oldExtrusionRotationAngle = extrusionRotationAngle;
		extrusionRotationAngle = newExtrusionRotationAngle;
		boolean oldExtrusionRotationAngleESet = extrusionRotationAngleESet;
		extrusionRotationAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE, oldExtrusionRotationAngle, extrusionRotationAngle, !oldExtrusionRotationAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionRotationAngle() {
		List oldExtrusionRotationAngle = extrusionRotationAngle;
		boolean oldExtrusionRotationAngleESet = extrusionRotationAngleESet;
		extrusionRotationAngle = EXTRUSION_ROTATION_ANGLE_EDEFAULT;
		extrusionRotationAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE, oldExtrusionRotationAngle, EXTRUSION_ROTATION_ANGLE_EDEFAULT, oldExtrusionRotationAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionRotationAngle() {
		return extrusionRotationAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionRotationCenter() {
		return extrusionRotationCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionRotationCenter(String newExtrusionRotationCenter) {
		String oldExtrusionRotationCenter = extrusionRotationCenter;
		extrusionRotationCenter = newExtrusionRotationCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER, oldExtrusionRotationCenter, extrusionRotationCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSecondLightDirection() {
		return extrusionSecondLightDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightDirection(String newExtrusionSecondLightDirection) {
		String oldExtrusionSecondLightDirection = extrusionSecondLightDirection;
		extrusionSecondLightDirection = newExtrusionSecondLightDirection;
		boolean oldExtrusionSecondLightDirectionESet = extrusionSecondLightDirectionESet;
		extrusionSecondLightDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION, oldExtrusionSecondLightDirection, extrusionSecondLightDirection, !oldExtrusionSecondLightDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSecondLightDirection() {
		String oldExtrusionSecondLightDirection = extrusionSecondLightDirection;
		boolean oldExtrusionSecondLightDirectionESet = extrusionSecondLightDirectionESet;
		extrusionSecondLightDirection = EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT;
		extrusionSecondLightDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION, oldExtrusionSecondLightDirection, EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT, oldExtrusionSecondLightDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSecondLightDirection() {
		return extrusionSecondLightDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionSecondLightHarsh() {
		return extrusionSecondLightHarsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionSecondLightHarsh) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionSecondLightHarsh = extrusionSecondLightHarsh;
		extrusionSecondLightHarsh = newExtrusionSecondLightHarsh == null ? EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT : newExtrusionSecondLightHarsh;
		boolean oldExtrusionSecondLightHarshESet = extrusionSecondLightHarshESet;
		extrusionSecondLightHarshESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH, oldExtrusionSecondLightHarsh, extrusionSecondLightHarsh, !oldExtrusionSecondLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSecondLightHarsh() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionSecondLightHarsh = extrusionSecondLightHarsh;
		boolean oldExtrusionSecondLightHarshESet = extrusionSecondLightHarshESet;
		extrusionSecondLightHarsh = EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT;
		extrusionSecondLightHarshESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH, oldExtrusionSecondLightHarsh, EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT, oldExtrusionSecondLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSecondLightHarsh() {
		return extrusionSecondLightHarshESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSecondLightLevel() {
		return extrusionSecondLightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightLevel(String newExtrusionSecondLightLevel) {
		String oldExtrusionSecondLightLevel = extrusionSecondLightLevel;
		extrusionSecondLightLevel = newExtrusionSecondLightLevel;
		boolean oldExtrusionSecondLightLevelESet = extrusionSecondLightLevelESet;
		extrusionSecondLightLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL, oldExtrusionSecondLightLevel, extrusionSecondLightLevel, !oldExtrusionSecondLightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSecondLightLevel() {
		String oldExtrusionSecondLightLevel = extrusionSecondLightLevel;
		boolean oldExtrusionSecondLightLevelESet = extrusionSecondLightLevelESet;
		extrusionSecondLightLevel = EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT;
		extrusionSecondLightLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL, oldExtrusionSecondLightLevel, EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT, oldExtrusionSecondLightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSecondLightLevel() {
		return extrusionSecondLightLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionShininess() {
		return extrusionShininess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionShininess(String newExtrusionShininess) {
		String oldExtrusionShininess = extrusionShininess;
		extrusionShininess = newExtrusionShininess;
		boolean oldExtrusionShininessESet = extrusionShininessESet;
		extrusionShininessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS, oldExtrusionShininess, extrusionShininess, !oldExtrusionShininessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionShininess() {
		String oldExtrusionShininess = extrusionShininess;
		boolean oldExtrusionShininessESet = extrusionShininessESet;
		extrusionShininess = EXTRUSION_SHININESS_EDEFAULT;
		extrusionShininessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS, oldExtrusionShininess, EXTRUSION_SHININESS_EDEFAULT, oldExtrusionShininessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionShininess() {
		return extrusionShininessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionSkew() {
		return extrusionSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSkew(List newExtrusionSkew) {
		List oldExtrusionSkew = extrusionSkew;
		extrusionSkew = newExtrusionSkew;
		boolean oldExtrusionSkewESet = extrusionSkewESet;
		extrusionSkewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW, oldExtrusionSkew, extrusionSkew, !oldExtrusionSkewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSkew() {
		List oldExtrusionSkew = extrusionSkew;
		boolean oldExtrusionSkewESet = extrusionSkewESet;
		extrusionSkew = EXTRUSION_SKEW_EDEFAULT;
		extrusionSkewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW, oldExtrusionSkew, EXTRUSION_SKEW_EDEFAULT, oldExtrusionSkewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSkew() {
		return extrusionSkewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSpecularity() {
		return extrusionSpecularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSpecularity(String newExtrusionSpecularity) {
		String oldExtrusionSpecularity = extrusionSpecularity;
		extrusionSpecularity = newExtrusionSpecularity;
		boolean oldExtrusionSpecularityESet = extrusionSpecularityESet;
		extrusionSpecularityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY, oldExtrusionSpecularity, extrusionSpecularity, !oldExtrusionSpecularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSpecularity() {
		String oldExtrusionSpecularity = extrusionSpecularity;
		boolean oldExtrusionSpecularityESet = extrusionSpecularityESet;
		extrusionSpecularity = EXTRUSION_SPECULARITY_EDEFAULT;
		extrusionSpecularityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY, oldExtrusionSpecularity, EXTRUSION_SPECULARITY_EDEFAULT, oldExtrusionSpecularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSpecularity() {
		return extrusionSpecularityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionViewpoint() {
		return extrusionViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionViewpoint(String newExtrusionViewpoint) {
		String oldExtrusionViewpoint = extrusionViewpoint;
		extrusionViewpoint = newExtrusionViewpoint;
		boolean oldExtrusionViewpointESet = extrusionViewpointESet;
		extrusionViewpointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT, oldExtrusionViewpoint, extrusionViewpoint, !oldExtrusionViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionViewpoint() {
		String oldExtrusionViewpoint = extrusionViewpoint;
		boolean oldExtrusionViewpointESet = extrusionViewpointESet;
		extrusionViewpoint = EXTRUSION_VIEWPOINT_EDEFAULT;
		extrusionViewpointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT, oldExtrusionViewpoint, EXTRUSION_VIEWPOINT_EDEFAULT, oldExtrusionViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionViewpoint() {
		return extrusionViewpointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getGluePointLeavingDirections() {
		return gluePointLeavingDirections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePointLeavingDirections(Object newGluePointLeavingDirections) {
		Object oldGluePointLeavingDirections = gluePointLeavingDirections;
		gluePointLeavingDirections = newGluePointLeavingDirections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS, oldGluePointLeavingDirections, gluePointLeavingDirections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGluePoints() {
		return gluePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePoints(String newGluePoints) {
		String oldGluePoints = gluePoints;
		gluePoints = newGluePoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINTS, oldGluePoints, gluePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointTypeType getGluePointType() {
		return gluePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePointType(GluePointTypeType newGluePointType) {
		GluePointTypeType oldGluePointType = gluePointType;
		gluePointType = newGluePointType == null ? GLUE_POINT_TYPE_EDEFAULT : newGluePointType;
		boolean oldGluePointTypeESet = gluePointTypeESet;
		gluePointTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE, oldGluePointType, gluePointType, !oldGluePointTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGluePointType() {
		GluePointTypeType oldGluePointType = gluePointType;
		boolean oldGluePointTypeESet = gluePointTypeESet;
		gluePointType = GLUE_POINT_TYPE_EDEFAULT;
		gluePointTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE, oldGluePointType, GLUE_POINT_TYPE_EDEFAULT, oldGluePointTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGluePointType() {
		return gluePointTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorHorizontal() {
		return mirrorHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMirrorHorizontal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorHorizontal = mirrorHorizontal;
		mirrorHorizontal = newMirrorHorizontal == null ? MIRROR_HORIZONTAL_EDEFAULT : newMirrorHorizontal;
		boolean oldMirrorHorizontalESet = mirrorHorizontalESet;
		mirrorHorizontalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL, oldMirrorHorizontal, mirrorHorizontal, !oldMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMirrorHorizontal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorHorizontal = mirrorHorizontal;
		boolean oldMirrorHorizontalESet = mirrorHorizontalESet;
		mirrorHorizontal = MIRROR_HORIZONTAL_EDEFAULT;
		mirrorHorizontalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL, oldMirrorHorizontal, MIRROR_HORIZONTAL_EDEFAULT, oldMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMirrorHorizontal() {
		return mirrorHorizontalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorVertical() {
		return mirrorVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMirrorVertical) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorVertical = mirrorVertical;
		mirrorVertical = newMirrorVertical == null ? MIRROR_VERTICAL_EDEFAULT : newMirrorVertical;
		boolean oldMirrorVerticalESet = mirrorVerticalESet;
		mirrorVerticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL, oldMirrorVertical, mirrorVertical, !oldMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMirrorVertical() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorVertical = mirrorVertical;
		boolean oldMirrorVerticalESet = mirrorVerticalESet;
		mirrorVertical = MIRROR_VERTICAL_EDEFAULT;
		mirrorVerticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL, oldMirrorVertical, MIRROR_VERTICAL_EDEFAULT, oldMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMirrorVertical() {
		return mirrorVerticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiers() {
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiers(String newModifiers) {
		String oldModifiers = modifiers;
		modifiers = newModifiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__MODIFIERS, oldModifiers, modifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPathStretchpointX() {
		return pathStretchpointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathStretchpointX(double newPathStretchpointX) {
		double oldPathStretchpointX = pathStretchpointX;
		pathStretchpointX = newPathStretchpointX;
		boolean oldPathStretchpointXESet = pathStretchpointXESet;
		pathStretchpointXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X, oldPathStretchpointX, pathStretchpointX, !oldPathStretchpointXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPathStretchpointX() {
		double oldPathStretchpointX = pathStretchpointX;
		boolean oldPathStretchpointXESet = pathStretchpointXESet;
		pathStretchpointX = PATH_STRETCHPOINT_X_EDEFAULT;
		pathStretchpointXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X, oldPathStretchpointX, PATH_STRETCHPOINT_X_EDEFAULT, oldPathStretchpointXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPathStretchpointX() {
		return pathStretchpointXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPathStretchpointY() {
		return pathStretchpointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathStretchpointY(double newPathStretchpointY) {
		double oldPathStretchpointY = pathStretchpointY;
		pathStretchpointY = newPathStretchpointY;
		boolean oldPathStretchpointYESet = pathStretchpointYESet;
		pathStretchpointYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y, oldPathStretchpointY, pathStretchpointY, !oldPathStretchpointYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPathStretchpointY() {
		double oldPathStretchpointY = pathStretchpointY;
		boolean oldPathStretchpointYESet = pathStretchpointYESet;
		pathStretchpointY = PATH_STRETCHPOINT_Y_EDEFAULT;
		pathStretchpointYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y, oldPathStretchpointY, PATH_STRETCHPOINT_Y_EDEFAULT, oldPathStretchpointYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPathStretchpointY() {
		return pathStretchpointYESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION, oldProjection, projection, !oldProjectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION, oldProjection, PROJECTION_EDEFAULT, oldProjectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE, oldShadeMode, shadeMode, !oldShadeModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE, oldShadeMode, SHADE_MODE_EDEFAULT, oldShadeModeESet));
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
	public String getTextAreas() {
		return textAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAreas(String newTextAreas) {
		String oldTextAreas = textAreas;
		textAreas = newTextAreas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_AREAS, oldTextAreas, textAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPath() {
		return textPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPath) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPath = textPath;
		textPath = newTextPath == null ? TEXT_PATH_EDEFAULT : newTextPath;
		boolean oldTextPathESet = textPathESet;
		textPathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH, oldTextPath, textPath, !oldTextPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPath() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPath = textPath;
		boolean oldTextPathESet = textPathESet;
		textPath = TEXT_PATH_EDEFAULT;
		textPathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH, oldTextPath, TEXT_PATH_EDEFAULT, oldTextPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPath() {
		return textPathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathAllowed() {
		return textPathAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPathAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathAllowed = textPathAllowed;
		textPathAllowed = newTextPathAllowed == null ? TEXT_PATH_ALLOWED_EDEFAULT : newTextPathAllowed;
		boolean oldTextPathAllowedESet = textPathAllowedESet;
		textPathAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED, oldTextPathAllowed, textPathAllowed, !oldTextPathAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathAllowed = textPathAllowed;
		boolean oldTextPathAllowedESet = textPathAllowedESet;
		textPathAllowed = TEXT_PATH_ALLOWED_EDEFAULT;
		textPathAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED, oldTextPathAllowed, TEXT_PATH_ALLOWED_EDEFAULT, oldTextPathAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathAllowed() {
		return textPathAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathModeType getTextPathMode() {
		return textPathMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathMode(TextPathModeType newTextPathMode) {
		TextPathModeType oldTextPathMode = textPathMode;
		textPathMode = newTextPathMode == null ? TEXT_PATH_MODE_EDEFAULT : newTextPathMode;
		boolean oldTextPathModeESet = textPathModeESet;
		textPathModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE, oldTextPathMode, textPathMode, !oldTextPathModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathMode() {
		TextPathModeType oldTextPathMode = textPathMode;
		boolean oldTextPathModeESet = textPathModeESet;
		textPathMode = TEXT_PATH_MODE_EDEFAULT;
		textPathModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE, oldTextPathMode, TEXT_PATH_MODE_EDEFAULT, oldTextPathModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathMode() {
		return textPathModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathSameLetterHeights() {
		return textPathSameLetterHeights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPathSameLetterHeights) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathSameLetterHeights = textPathSameLetterHeights;
		textPathSameLetterHeights = newTextPathSameLetterHeights == null ? TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT : newTextPathSameLetterHeights;
		boolean oldTextPathSameLetterHeightsESet = textPathSameLetterHeightsESet;
		textPathSameLetterHeightsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS, oldTextPathSameLetterHeights, textPathSameLetterHeights, !oldTextPathSameLetterHeightsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathSameLetterHeights() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathSameLetterHeights = textPathSameLetterHeights;
		boolean oldTextPathSameLetterHeightsESet = textPathSameLetterHeightsESet;
		textPathSameLetterHeights = TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT;
		textPathSameLetterHeightsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS, oldTextPathSameLetterHeights, TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT, oldTextPathSameLetterHeightsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathSameLetterHeights() {
		return textPathSameLetterHeightsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathScaleType getTextPathScale() {
		return textPathScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathScale(TextPathScaleType newTextPathScale) {
		TextPathScaleType oldTextPathScale = textPathScale;
		textPathScale = newTextPathScale == null ? TEXT_PATH_SCALE_EDEFAULT : newTextPathScale;
		boolean oldTextPathScaleESet = textPathScaleESet;
		textPathScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE, oldTextPathScale, textPathScale, !oldTextPathScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathScale() {
		TextPathScaleType oldTextPathScale = textPathScale;
		boolean oldTextPathScaleESet = textPathScaleESet;
		textPathScale = TEXT_PATH_SCALE_EDEFAULT;
		textPathScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE, oldTextPathScale, TEXT_PATH_SCALE_EDEFAULT, oldTextPathScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathScale() {
		return textPathScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTextRotateAngle() {
		return textRotateAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRotateAngle(double newTextRotateAngle) {
		double oldTextRotateAngle = textRotateAngle;
		textRotateAngle = newTextRotateAngle;
		boolean oldTextRotateAngleESet = textRotateAngleESet;
		textRotateAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE, oldTextRotateAngle, textRotateAngle, !oldTextRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextRotateAngle() {
		double oldTextRotateAngle = textRotateAngle;
		boolean oldTextRotateAngleESet = textRotateAngleESet;
		textRotateAngle = TEXT_ROTATE_ANGLE_EDEFAULT;
		textRotateAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE, oldTextRotateAngle, TEXT_ROTATE_ANGLE_EDEFAULT, oldTextRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextRotateAngle() {
		return textRotateAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getViewBox() {
		return viewBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBox(List newViewBox) {
		List oldViewBox = viewBox;
		viewBox = newViewBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.ENHANCED_GEOMETRY_TYPE__VIEW_BOX, oldViewBox, viewBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION:
				return ((InternalEList<?>)getEquation()).basicRemove(otherEnd, msgs);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE:
				return ((InternalEList<?>)getHandle()).basicRemove(otherEnd, msgs);
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
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION:
				return getEquation();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE:
				return getHandle();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				return getConcentricGradientFillAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH:
				return getEnhancedPath();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION:
				return getExtrusion();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED:
				return getExtrusionAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS:
				return getExtrusionBrightness();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR:
				return getExtrusionColor();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH:
				return getExtrusionDepth();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION:
				return getExtrusionDiffusion();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION:
				return getExtrusionFirstLightDirection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH:
				return getExtrusionFirstLightHarsh();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL:
				return getExtrusionFirstLightLevel();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE:
				return getExtrusionLightFace();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL:
				return getExtrusionMetal();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				return getExtrusionNumberOfLineSegments();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN:
				return getExtrusionOrigin();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE:
				return getExtrusionRotationAngle();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER:
				return getExtrusionRotationCenter();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION:
				return getExtrusionSecondLightDirection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH:
				return getExtrusionSecondLightHarsh();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL:
				return getExtrusionSecondLightLevel();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS:
				return getExtrusionShininess();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW:
				return getExtrusionSkew();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY:
				return getExtrusionSpecularity();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT:
				return getExtrusionViewpoint();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS:
				return getGluePointLeavingDirections();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINTS:
				return getGluePoints();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE:
				return getGluePointType();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL:
				return getMirrorHorizontal();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL:
				return getMirrorVertical();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MODIFIERS:
				return getModifiers();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X:
				return new Double(getPathStretchpointX());
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y:
				return new Double(getPathStretchpointY());
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION:
				return getProjection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE:
				return getShadeMode();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_AREAS:
				return getTextAreas();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH:
				return getTextPath();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED:
				return getTextPathAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE:
				return getTextPathMode();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS:
				return getTextPathSameLetterHeights();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE:
				return getTextPathScale();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE:
				return new Double(getTextRotateAngle());
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TYPE:
				return getType();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__VIEW_BOX:
				return getViewBox();
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
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE:
				getHandle().clear();
				getHandle().addAll((Collection<? extends HandleType>)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				setConcentricGradientFillAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH:
				setEnhancedPath((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION:
				setExtrusion((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED:
				setExtrusionAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS:
				setExtrusionBrightness((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR:
				setExtrusionColor((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH:
				setExtrusionDepth((List)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION:
				setExtrusionDiffusion((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION:
				setExtrusionFirstLightDirection((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH:
				setExtrusionFirstLightHarsh((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL:
				setExtrusionFirstLightLevel((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE:
				setExtrusionLightFace((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL:
				setExtrusionMetal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				setExtrusionNumberOfLineSegments((BigInteger)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN:
				setExtrusionOrigin((List)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE:
				setExtrusionRotationAngle((List)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER:
				setExtrusionRotationCenter((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION:
				setExtrusionSecondLightDirection((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH:
				setExtrusionSecondLightHarsh((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL:
				setExtrusionSecondLightLevel((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS:
				setExtrusionShininess((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW:
				setExtrusionSkew((List)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY:
				setExtrusionSpecularity((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT:
				setExtrusionViewpoint((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS:
				setGluePointLeavingDirections(newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINTS:
				setGluePoints((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE:
				setGluePointType((GluePointTypeType)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL:
				setMirrorHorizontal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL:
				setMirrorVertical((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MODIFIERS:
				setModifiers((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X:
				setPathStretchpointX(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y:
				setPathStretchpointY(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION:
				setProjection((ProjectionType)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE:
				setShadeMode((ShadeModeType)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_AREAS:
				setTextAreas((String)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH:
				setTextPath((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED:
				setTextPathAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE:
				setTextPathMode((TextPathModeType)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS:
				setTextPathSameLetterHeights((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE:
				setTextPathScale((TextPathScaleType)newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE:
				setTextRotateAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TYPE:
				setType(newValue);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__VIEW_BOX:
				setViewBox((List)newValue);
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
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION:
				getEquation().clear();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE:
				getHandle().clear();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				unsetConcentricGradientFillAllowed();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH:
				setEnhancedPath(ENHANCED_PATH_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION:
				unsetExtrusion();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED:
				unsetExtrusionAllowed();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS:
				unsetExtrusionBrightness();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR:
				unsetExtrusionColor();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH:
				unsetExtrusionDepth();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION:
				unsetExtrusionDiffusion();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION:
				unsetExtrusionFirstLightDirection();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH:
				unsetExtrusionFirstLightHarsh();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL:
				unsetExtrusionFirstLightLevel();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE:
				unsetExtrusionLightFace();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL:
				unsetExtrusionMetal();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				unsetExtrusionNumberOfLineSegments();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN:
				unsetExtrusionOrigin();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE:
				unsetExtrusionRotationAngle();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER:
				setExtrusionRotationCenter(EXTRUSION_ROTATION_CENTER_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION:
				unsetExtrusionSecondLightDirection();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH:
				unsetExtrusionSecondLightHarsh();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL:
				unsetExtrusionSecondLightLevel();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS:
				unsetExtrusionShininess();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW:
				unsetExtrusionSkew();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY:
				unsetExtrusionSpecularity();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT:
				unsetExtrusionViewpoint();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS:
				setGluePointLeavingDirections(GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINTS:
				setGluePoints(GLUE_POINTS_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE:
				unsetGluePointType();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL:
				unsetMirrorHorizontal();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL:
				unsetMirrorVertical();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MODIFIERS:
				setModifiers(MODIFIERS_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X:
				unsetPathStretchpointX();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y:
				unsetPathStretchpointY();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION:
				unsetProjection();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE:
				unsetShadeMode();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_AREAS:
				setTextAreas(TEXT_AREAS_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH:
				unsetTextPath();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED:
				unsetTextPathAllowed();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE:
				unsetTextPathMode();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS:
				unsetTextPathSameLetterHeights();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE:
				unsetTextPathScale();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE:
				unsetTextRotateAngle();
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__VIEW_BOX:
				setViewBox(VIEW_BOX_EDEFAULT);
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
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EQUATION:
				return equation != null && !equation.isEmpty();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__HANDLE:
				return handle != null && !handle.isEmpty();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				return isSetConcentricGradientFillAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH:
				return ENHANCED_PATH_EDEFAULT == null ? enhancedPath != null : !ENHANCED_PATH_EDEFAULT.equals(enhancedPath);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION:
				return isSetExtrusion();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED:
				return isSetExtrusionAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS:
				return isSetExtrusionBrightness();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR:
				return isSetExtrusionColor();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH:
				return isSetExtrusionDepth();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION:
				return isSetExtrusionDiffusion();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION:
				return isSetExtrusionFirstLightDirection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH:
				return isSetExtrusionFirstLightHarsh();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL:
				return isSetExtrusionFirstLightLevel();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE:
				return isSetExtrusionLightFace();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL:
				return isSetExtrusionMetal();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				return isSetExtrusionNumberOfLineSegments();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN:
				return isSetExtrusionOrigin();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE:
				return isSetExtrusionRotationAngle();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER:
				return EXTRUSION_ROTATION_CENTER_EDEFAULT == null ? extrusionRotationCenter != null : !EXTRUSION_ROTATION_CENTER_EDEFAULT.equals(extrusionRotationCenter);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION:
				return isSetExtrusionSecondLightDirection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH:
				return isSetExtrusionSecondLightHarsh();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL:
				return isSetExtrusionSecondLightLevel();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS:
				return isSetExtrusionShininess();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW:
				return isSetExtrusionSkew();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY:
				return isSetExtrusionSpecularity();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT:
				return isSetExtrusionViewpoint();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS:
				return GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT == null ? gluePointLeavingDirections != null : !GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT.equals(gluePointLeavingDirections);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINTS:
				return GLUE_POINTS_EDEFAULT == null ? gluePoints != null : !GLUE_POINTS_EDEFAULT.equals(gluePoints);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE:
				return isSetGluePointType();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL:
				return isSetMirrorHorizontal();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL:
				return isSetMirrorVertical();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__MODIFIERS:
				return MODIFIERS_EDEFAULT == null ? modifiers != null : !MODIFIERS_EDEFAULT.equals(modifiers);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X:
				return isSetPathStretchpointX();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y:
				return isSetPathStretchpointY();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__PROJECTION:
				return isSetProjection();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__SHADE_MODE:
				return isSetShadeMode();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_AREAS:
				return TEXT_AREAS_EDEFAULT == null ? textAreas != null : !TEXT_AREAS_EDEFAULT.equals(textAreas);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH:
				return isSetTextPath();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED:
				return isSetTextPathAllowed();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE:
				return isSetTextPathMode();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS:
				return isSetTextPathSameLetterHeights();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE:
				return isSetTextPathScale();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE:
				return isSetTextRotateAngle();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE__VIEW_BOX:
				return VIEW_BOX_EDEFAULT == null ? viewBox != null : !VIEW_BOX_EDEFAULT.equals(viewBox);
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
		result.append(" (concentricGradientFillAllowed: ");
		if (concentricGradientFillAllowedESet) result.append(concentricGradientFillAllowed); else result.append("<unset>");
		result.append(", enhancedPath: ");
		result.append(enhancedPath);
		result.append(", extrusion: ");
		if (extrusionESet) result.append(extrusion); else result.append("<unset>");
		result.append(", extrusionAllowed: ");
		if (extrusionAllowedESet) result.append(extrusionAllowed); else result.append("<unset>");
		result.append(", extrusionBrightness: ");
		if (extrusionBrightnessESet) result.append(extrusionBrightness); else result.append("<unset>");
		result.append(", extrusionColor: ");
		if (extrusionColorESet) result.append(extrusionColor); else result.append("<unset>");
		result.append(", extrusionDepth: ");
		if (extrusionDepthESet) result.append(extrusionDepth); else result.append("<unset>");
		result.append(", extrusionDiffusion: ");
		if (extrusionDiffusionESet) result.append(extrusionDiffusion); else result.append("<unset>");
		result.append(", extrusionFirstLightDirection: ");
		if (extrusionFirstLightDirectionESet) result.append(extrusionFirstLightDirection); else result.append("<unset>");
		result.append(", extrusionFirstLightHarsh: ");
		if (extrusionFirstLightHarshESet) result.append(extrusionFirstLightHarsh); else result.append("<unset>");
		result.append(", extrusionFirstLightLevel: ");
		if (extrusionFirstLightLevelESet) result.append(extrusionFirstLightLevel); else result.append("<unset>");
		result.append(", extrusionLightFace: ");
		if (extrusionLightFaceESet) result.append(extrusionLightFace); else result.append("<unset>");
		result.append(", extrusionMetal: ");
		if (extrusionMetalESet) result.append(extrusionMetal); else result.append("<unset>");
		result.append(", extrusionNumberOfLineSegments: ");
		if (extrusionNumberOfLineSegmentsESet) result.append(extrusionNumberOfLineSegments); else result.append("<unset>");
		result.append(", extrusionOrigin: ");
		if (extrusionOriginESet) result.append(extrusionOrigin); else result.append("<unset>");
		result.append(", extrusionRotationAngle: ");
		if (extrusionRotationAngleESet) result.append(extrusionRotationAngle); else result.append("<unset>");
		result.append(", extrusionRotationCenter: ");
		result.append(extrusionRotationCenter);
		result.append(", extrusionSecondLightDirection: ");
		if (extrusionSecondLightDirectionESet) result.append(extrusionSecondLightDirection); else result.append("<unset>");
		result.append(", extrusionSecondLightHarsh: ");
		if (extrusionSecondLightHarshESet) result.append(extrusionSecondLightHarsh); else result.append("<unset>");
		result.append(", extrusionSecondLightLevel: ");
		if (extrusionSecondLightLevelESet) result.append(extrusionSecondLightLevel); else result.append("<unset>");
		result.append(", extrusionShininess: ");
		if (extrusionShininessESet) result.append(extrusionShininess); else result.append("<unset>");
		result.append(", extrusionSkew: ");
		if (extrusionSkewESet) result.append(extrusionSkew); else result.append("<unset>");
		result.append(", extrusionSpecularity: ");
		if (extrusionSpecularityESet) result.append(extrusionSpecularity); else result.append("<unset>");
		result.append(", extrusionViewpoint: ");
		if (extrusionViewpointESet) result.append(extrusionViewpoint); else result.append("<unset>");
		result.append(", gluePointLeavingDirections: ");
		result.append(gluePointLeavingDirections);
		result.append(", gluePoints: ");
		result.append(gluePoints);
		result.append(", gluePointType: ");
		if (gluePointTypeESet) result.append(gluePointType); else result.append("<unset>");
		result.append(", mirrorHorizontal: ");
		if (mirrorHorizontalESet) result.append(mirrorHorizontal); else result.append("<unset>");
		result.append(", mirrorVertical: ");
		if (mirrorVerticalESet) result.append(mirrorVertical); else result.append("<unset>");
		result.append(", modifiers: ");
		result.append(modifiers);
		result.append(", pathStretchpointX: ");
		if (pathStretchpointXESet) result.append(pathStretchpointX); else result.append("<unset>");
		result.append(", pathStretchpointY: ");
		if (pathStretchpointYESet) result.append(pathStretchpointY); else result.append("<unset>");
		result.append(", projection: ");
		if (projectionESet) result.append(projection); else result.append("<unset>");
		result.append(", shadeMode: ");
		if (shadeModeESet) result.append(shadeMode); else result.append("<unset>");
		result.append(", textAreas: ");
		result.append(textAreas);
		result.append(", textPath: ");
		if (textPathESet) result.append(textPath); else result.append("<unset>");
		result.append(", textPathAllowed: ");
		if (textPathAllowedESet) result.append(textPathAllowed); else result.append("<unset>");
		result.append(", textPathMode: ");
		if (textPathModeESet) result.append(textPathMode); else result.append("<unset>");
		result.append(", textPathSameLetterHeights: ");
		if (textPathSameLetterHeightsESet) result.append(textPathSameLetterHeights); else result.append("<unset>");
		result.append(", textPathScale: ");
		if (textPathScaleESet) result.append(textPathScale); else result.append("<unset>");
		result.append(", textRotateAngle: ");
		if (textRotateAngleESet) result.append(textRotateAngle); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", viewBox: ");
		result.append(viewBox);
		result.append(')');
		return result.toString();
	}

} //EnhancedGeometryTypeImpl
