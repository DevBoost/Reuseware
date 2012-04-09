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
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationFactory
 * @model kind="package"
 * @generated
 */
public interface AnimationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "animation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfanimation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnimationPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateColorTypeImpl <em>Animate Color Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateColorTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateColorType()
	 * @generated
	 */
	int ANIMATE_COLOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__AUTO_REVERSE = 4;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__BEGIN = 5;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__BY = 6;

	/**
	 * The feature id for the '<em><b>Calc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__CALC_MODE = 7;

	/**
	 * The feature id for the '<em><b>Color Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION = 8;

	/**
	 * The feature id for the '<em><b>Color Interpolation Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION_DIRECTION = 9;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__DECELERATE = 10;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__DUR = 11;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__END = 12;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__FILL = 13;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__FILL_DEFAULT = 14;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__FORMULA = 15;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__FROM = 16;

	/**
	 * The feature id for the '<em><b>Key Splines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__KEY_SPLINES = 17;

	/**
	 * The feature id for the '<em><b>Key Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__KEY_TIMES = 18;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__REPEAT_COUNT = 19;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__REPEAT_DUR = 20;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__RESTART = 21;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__RESTART_DEFAULT = 22;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__SUB_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__TARGET_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__TO = 25;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE__VALUES = 26;

	/**
	 * The number of structural features of the '<em>Animate Color Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_COLOR_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateMotionTypeImpl <em>Animate Motion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateMotionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateMotionType()
	 * @generated
	 */
	int ANIMATE_MOTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__AUTO_REVERSE = 4;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__BEGIN = 5;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__BY = 6;

	/**
	 * The feature id for the '<em><b>Calc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__CALC_MODE = 7;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__DECELERATE = 8;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__DUR = 9;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__END = 10;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__FILL = 11;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__FILL_DEFAULT = 12;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__FORMULA = 13;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__FROM = 14;

	/**
	 * The feature id for the '<em><b>Key Splines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__KEY_SPLINES = 15;

	/**
	 * The feature id for the '<em><b>Key Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__KEY_TIMES = 16;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__ORIGIN = 17;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__PATH = 18;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__REPEAT_COUNT = 19;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__REPEAT_DUR = 20;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__RESTART = 21;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__RESTART_DEFAULT = 22;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__SUB_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__TARGET_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__TO = 25;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE__VALUES = 26;

	/**
	 * The number of structural features of the '<em>Animate Motion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_MOTION_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTransformTypeImpl <em>Animate Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTransformTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateTransformType()
	 * @generated
	 */
	int ANIMATE_TRANSFORM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__AUTO_REVERSE = 4;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__BEGIN = 5;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__BY = 6;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__DECELERATE = 7;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__DUR = 8;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__END = 9;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__FILL = 10;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__FILL_DEFAULT = 11;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__FORMULA = 12;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__FROM = 13;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__REPEAT_COUNT = 14;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__REPEAT_DUR = 15;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__RESTART = 16;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__RESTART_DEFAULT = 17;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__SUB_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__TARGET_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__TO = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__TYPE = 21;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE__VALUES = 22;

	/**
	 * The number of structural features of the '<em>Animate Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TRANSFORM_TYPE_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl <em>Animate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateType()
	 * @generated
	 */
	int ANIMATE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__AUTO_REVERSE = 4;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__BEGIN = 5;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__BY = 6;

	/**
	 * The feature id for the '<em><b>Calc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__CALC_MODE = 7;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__DECELERATE = 8;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__DUR = 9;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__END = 10;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__FILL = 11;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__FILL_DEFAULT = 12;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__FORMULA = 13;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__FROM = 14;

	/**
	 * The feature id for the '<em><b>Key Splines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__KEY_SPLINES = 15;

	/**
	 * The feature id for the '<em><b>Key Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__KEY_TIMES = 16;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__REPEAT_COUNT = 17;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__REPEAT_DUR = 18;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__RESTART = 19;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__RESTART_DEFAULT = 20;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__SUB_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__TARGET_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__TO = 23;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE__VALUES = 24;

	/**
	 * The number of structural features of the '<em>Animate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_TYPE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl <em>Audio Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAudioType()
	 * @generated
	 */
	int AUDIO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Audio Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__AUDIO_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__DUR = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__END = 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__GROUP_ID = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__HREF = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__MASTER_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__NODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__PRESET_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__PRESET_ID = 10;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__PRESET_SUB_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__REPEAT_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE__REPEAT_DUR = 13;

	/**
	 * The number of structural features of the '<em>Audio Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl <em>Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__COMMAND = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__END = 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__GROUP_ID = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__MASTER_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__NODE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__PRESET_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__PRESET_ID = 9;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__PRESET_SUB_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__SUB_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__TARGET_ELEMENT = 12;

	/**
	 * The number of structural features of the '<em>Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Animate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATE = 3;

	/**
	 * The feature id for the '<em><b>Animate Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATE_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Animate Motion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATE_MOTION = 5;

	/**
	 * The feature id for the '<em><b>Animate Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATE_TRANSFORM = 6;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIO = 7;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Iterate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITERATE = 9;

	/**
	 * The feature id for the '<em><b>Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAR = 10;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM = 11;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQ = 12;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET = 13;

	/**
	 * The feature id for the '<em><b>Transition Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_FILTER = 14;

	/**
	 * The feature id for the '<em><b>Audio Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIO_LEVEL = 15;

	/**
	 * The feature id for the '<em><b>Color Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR_INTERPOLATION = 16;

	/**
	 * The feature id for the '<em><b>Color Interpolation Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION = 17;

	/**
	 * The feature id for the '<em><b>Command1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMAND1 = 18;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMULA = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 20;

	/**
	 * The feature id for the '<em><b>Iterate Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITERATE_INTERVAL = 21;

	/**
	 * The feature id for the '<em><b>Iterate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITERATE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_ITEM = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.IterateTypeImpl <em>Iterate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.IterateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getIterateType()
	 * @generated
	 */
	int ITERATE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Animation Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ANIMATION_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Animation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ANIMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ACCELERATE = 2;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__AUTO_REVERSE = 3;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__BEGIN = 4;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__DECELERATE = 5;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__DUR = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__END = 7;

	/**
	 * The feature id for the '<em><b>Endsync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ENDSYNC = 8;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__FILL = 9;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__FILL_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__GROUP_ID = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Iterate Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ITERATE_INTERVAL = 13;

	/**
	 * The feature id for the '<em><b>Iterate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__ITERATE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__MASTER_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__NODE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__PRESET_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__PRESET_ID = 18;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__PRESET_SUB_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__REPEAT_COUNT = 20;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__REPEAT_DUR = 21;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__RESTART = 22;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__RESTART_DEFAULT = 23;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__SUB_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE__TARGET_ELEMENT = 25;

	/**
	 * The number of structural features of the '<em>Iterate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParamTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl <em>Par Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getParType()
	 * @generated
	 */
	int PAR_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Animation Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__ANIMATION_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Animation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__ANIMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__ACCELERATE = 2;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__AUTO_REVERSE = 3;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__BEGIN = 4;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__DECELERATE = 5;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__DUR = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__END = 7;

	/**
	 * The feature id for the '<em><b>Endsync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__ENDSYNC = 8;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__FILL = 9;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__FILL_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__GROUP_ID = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__MASTER_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__NODE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__PRESET_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__PRESET_ID = 16;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__PRESET_SUB_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__REPEAT_COUNT = 18;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__REPEAT_DUR = 19;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__RESTART = 20;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE__RESTART_DEFAULT = 21;

	/**
	 * The number of structural features of the '<em>Par Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SeqTypeImpl <em>Seq Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SeqTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getSeqType()
	 * @generated
	 */
	int SEQ_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Animation Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__ANIMATION_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Animation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__ANIMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__ACCELERATE = 2;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__AUTO_REVERSE = 3;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__BEGIN = 4;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__DECELERATE = 5;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__DUR = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__END = 7;

	/**
	 * The feature id for the '<em><b>Endsync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__ENDSYNC = 8;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__FILL = 9;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__FILL_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__GROUP_ID = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__MASTER_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__NODE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__PRESET_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__PRESET_ID = 16;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__PRESET_SUB_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__REPEAT_COUNT = 18;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__REPEAT_DUR = 19;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__RESTART = 20;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE__RESTART_DEFAULT = 21;

	/**
	 * The number of structural features of the '<em>Seq Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__AUTO_REVERSE = 4;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__BEGIN = 5;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DECELERATE = 6;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DUR = 7;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__END = 8;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__FILL = 9;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__FILL_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__REPEAT_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__REPEAT_DUR = 12;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__RESTART = 13;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__RESTART_DEFAULT = 14;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__SUB_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TARGET_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TO = 17;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.TransitionFilterTypeImpl <em>Transition Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.TransitionFilterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getTransitionFilterType()
	 * @generated
	 */
	int TRANSITION_FILTER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__ACCELERATE = 0;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__ACCUMULATE = 1;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__ADDITIVE = 2;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__AUTO_REVERSE = 3;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__BEGIN = 4;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__BY = 5;

	/**
	 * The feature id for the '<em><b>Calc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__CALC_MODE = 6;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__DECELERATE = 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__DIRECTION = 8;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__DUR = 9;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__END = 10;

	/**
	 * The feature id for the '<em><b>Fade Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__FADE_COLOR = 11;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__FILL = 12;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__FILL_DEFAULT = 13;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__FORMULA = 14;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__FROM = 15;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__MODE = 16;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__REPEAT_COUNT = 17;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__REPEAT_DUR = 18;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__RESTART = 19;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__RESTART_DEFAULT = 20;

	/**
	 * The feature id for the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__SUB_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__SUBTYPE = 22;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__TARGET_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__TO = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__TYPE = 25;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE__VALUES = 26;

	/**
	 * The number of structural features of the '<em>Transition Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FILTER_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType <em>Color Interpolation Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationDirectionType()
	 * @generated
	 */
	int COLOR_INTERPOLATION_DIRECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType <em>Color Interpolation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationType()
	 * @generated
	 */
	int COLOR_INTERPOLATION_TYPE = 14;

	/**
	 * The meta object id for the '<em>Color Interpolation Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationDirectionTypeObject()
	 * @generated
	 */
	int COLOR_INTERPOLATION_DIRECTION_TYPE_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Color Interpolation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationTypeObject()
	 * @generated
	 */
	int COLOR_INTERPOLATION_TYPE_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType <em>Animate Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animate Color Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType
	 * @generated
	 */
	EClass getAnimateColorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAccelerate()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAccumulate()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAdditive()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAttributeName()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getAutoReverse()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getBegin()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getBy()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getCalcMode <em>Calc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getCalcMode()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_CalcMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getColorInterpolation <em>Color Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Interpolation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getColorInterpolation()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_ColorInterpolation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getColorInterpolationDirection <em>Color Interpolation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Interpolation Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getColorInterpolationDirection()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_ColorInterpolationDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getDecelerate()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getDur()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getEnd()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFill()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFillDefault()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFormula()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getFrom()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getKeySplines <em>Key Splines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Splines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getKeySplines()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_KeySplines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getKeyTimes <em>Key Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Times</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getKeyTimes()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_KeyTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRepeatCount()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRepeatDur()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRestart()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getRestartDefault()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getSubItem()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getTargetElement()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getTo()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType#getValues()
	 * @see #getAnimateColorType()
	 * @generated
	 */
	EAttribute getAnimateColorType_Values();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType <em>Animate Motion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animate Motion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType
	 * @generated
	 */
	EClass getAnimateMotionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAccelerate()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAccumulate()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAdditive()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAttributeName()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getAutoReverse()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getBegin()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getBy()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getCalcMode <em>Calc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getCalcMode()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_CalcMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getDecelerate()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getDur()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getEnd()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFill()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFillDefault()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFormula()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getFrom()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getKeySplines <em>Key Splines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Splines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getKeySplines()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_KeySplines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getKeyTimes <em>Key Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Times</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getKeyTimes()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_KeyTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getOrigin()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getPath()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRepeatCount()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRepeatDur()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRestart()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getRestartDefault()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getSubItem()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getTargetElement()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getTo()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType#getValues()
	 * @see #getAnimateMotionType()
	 * @generated
	 */
	EAttribute getAnimateMotionType_Values();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType <em>Animate Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animate Transform Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType
	 * @generated
	 */
	EClass getAnimateTransformType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAccelerate()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAccumulate()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAdditive()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAttributeName()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getAutoReverse()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getBegin()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getBy()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getDecelerate()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getDur()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getEnd()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFill()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFillDefault()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFormula()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getFrom()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRepeatCount()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRepeatDur()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRestart()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getRestartDefault()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getSubItem()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getTargetElement()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getTo()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getType()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType#getValues()
	 * @see #getAnimateTransformType()
	 * @generated
	 */
	EAttribute getAnimateTransformType_Values();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType <em>Animate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType
	 * @generated
	 */
	EClass getAnimateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAccelerate()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAccumulate()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAdditive()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAttributeName()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getAutoReverse()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getBegin()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getBy()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getCalcMode <em>Calc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getCalcMode()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_CalcMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getDecelerate()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getDur()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getEnd()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFill()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFillDefault()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFormula()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getFrom()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getKeySplines <em>Key Splines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Splines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getKeySplines()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_KeySplines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getKeyTimes <em>Key Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Times</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getKeyTimes()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_KeyTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRepeatCount()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRepeatDur()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRestart()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getRestartDefault()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getSubItem()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getTargetElement()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getTo()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType#getValues()
	 * @see #getAnimateType()
	 * @generated
	 */
	EAttribute getAnimateType_Values();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType <em>Audio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType
	 * @generated
	 */
	EClass getAudioType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel <em>Audio Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_AudioLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getBegin()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getDur()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getEnd()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getGroupId()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getHref()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getId()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getMasterElement()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetId()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetSubType()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatCount()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatDur()
	 * @see #getAudioType()
	 * @generated
	 */
	EAttribute getAudioType_RepeatDur();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType
	 * @generated
	 */
	EClass getCommandType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getParam()
	 * @see #getCommandType()
	 * @generated
	 */
	EReference getCommandType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getBegin()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getCommand()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getEnd()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getGroupId()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getId()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getMasterElement()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getNodeType()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetClass()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetId()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getPresetSubType()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getSubItem()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType#getTargetElement()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_TargetElement();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimate <em>Animate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Animate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateColor <em>Animate Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animate Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnimateColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateMotion <em>Animate Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animate Motion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateMotion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnimateMotion();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateTransform <em>Animate Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animate Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnimateTransform();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audio</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudio()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Audio();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Command();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Iterate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getPar <em>Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Par</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getPar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Par();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Param();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seq</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSeq()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Seq();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getTransitionFilter <em>Transition Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getTransitionFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransitionFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel <em>Audio Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AudioLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation <em>Color Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Interpolation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColorInterpolation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection <em>Color Interpolation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Interpolation Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColorInterpolationDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand1 <em>Command1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Command1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getFormula()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateInterval <em>Iterate Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterate Interval</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateInterval()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IterateInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateType <em>Iterate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IterateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSubItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SubItem();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType <em>Iterate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType
	 * @generated
	 */
	EClass getIterateType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElementGroup <em>Animation Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Animation Element Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElementGroup()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_AnimationElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElement <em>Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElement()
	 * @see #getIterateType()
	 * @generated
	 */
	EReference getIterateType_AnimationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getBegin()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDur()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEnd()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync <em>Endsync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endsync</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Endsync();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getGroupId()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getId()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateInterval <em>Iterate Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterate Interval</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateInterval()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_IterateInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateType <em>Iterate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateType()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_IterateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getMasterElement()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetId()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetSubType()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatCount()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatDur()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getSubItem()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getTargetElement()
	 * @see #getIterateType()
	 * @generated
	 */
	EAttribute getIterateType_TargetElement();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType#getValue()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType <em>Par Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Par Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType
	 * @generated
	 */
	EClass getParType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAnimationElementGroup <em>Animation Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Animation Element Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAnimationElementGroup()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_AnimationElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAnimationElement <em>Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAnimationElement()
	 * @see #getParType()
	 * @generated
	 */
	EReference getParType_AnimationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAccelerate()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getAutoReverse()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getBegin()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getDecelerate()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getDur()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getEnd()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getEndsync <em>Endsync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endsync</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getEndsync()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Endsync();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getFill()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getFillDefault()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getGroupId()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getId()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getMasterElement()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getNodeType()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetClass()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetId()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getPresetSubType()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRepeatCount()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRepeatDur()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRestart()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ParType#getRestartDefault()
	 * @see #getParType()
	 * @generated
	 */
	EAttribute getParType_RestartDefault();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType <em>Seq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType
	 * @generated
	 */
	EClass getSeqType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAnimationElementGroup <em>Animation Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Animation Element Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAnimationElementGroup()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_AnimationElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAnimationElement <em>Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAnimationElement()
	 * @see #getSeqType()
	 * @generated
	 */
	EReference getSeqType_AnimationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAccelerate()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getAutoReverse()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getBegin()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getDecelerate()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getDur()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getEnd()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getEndsync <em>Endsync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endsync</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getEndsync()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Endsync();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getFill()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getFillDefault()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getGroupId()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getId()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getMasterElement()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getNodeType()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetClass()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetId()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getPresetSubType()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRepeatCount()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRepeatDur()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRestart()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType#getRestartDefault()
	 * @see #getSeqType()
	 * @generated
	 */
	EAttribute getSeqType_RestartDefault();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAccelerate()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAccumulate()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAdditive()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAttributeName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getAutoReverse()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getBegin()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getDecelerate()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getDur()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getEnd()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getFill()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getFillDefault()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRepeatCount()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRepeatDur()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRestart()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getRestartDefault()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getSubItem()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getTargetElement()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.SetType#getTo()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_To();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType <em>Transition Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Filter Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType
	 * @generated
	 */
	EClass getTransitionFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBegin()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBy()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode <em>Calc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_CalcMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDur()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getEnd()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor <em>Fade Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_FadeColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFormula()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFrom()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatCount()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatDur()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubItem <em>Sub Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubItem()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_SubItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubtype()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTargetElement()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTo()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getType()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getValues()
	 * @see #getTransitionFilterType()
	 * @generated
	 */
	EAttribute getTransitionFilterType_Values();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType <em>Color Interpolation Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Interpolation Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @generated
	 */
	EEnum getColorInterpolationDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType <em>Color Interpolation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Interpolation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @generated
	 */
	EEnum getColorInterpolationType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType <em>Color Interpolation Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Interpolation Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType"
	 *        extendedMetaData="name='color-interpolation-direction_._type:Object' baseType='color-interpolation-direction_._type'"
	 * @generated
	 */
	EDataType getColorInterpolationDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType <em>Color Interpolation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Interpolation Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType"
	 *        extendedMetaData="name='color-interpolation_._type:Object' baseType='color-interpolation_._type'"
	 * @generated
	 */
	EDataType getColorInterpolationTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnimationFactory getAnimationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateColorTypeImpl <em>Animate Color Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateColorTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateColorType()
		 * @generated
		 */
		EClass ANIMATE_COLOR_TYPE = eINSTANCE.getAnimateColorType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__ACCELERATE = eINSTANCE.getAnimateColorType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__ACCUMULATE = eINSTANCE.getAnimateColorType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__ADDITIVE = eINSTANCE.getAnimateColorType_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__ATTRIBUTE_NAME = eINSTANCE.getAnimateColorType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__AUTO_REVERSE = eINSTANCE.getAnimateColorType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__BEGIN = eINSTANCE.getAnimateColorType_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__BY = eINSTANCE.getAnimateColorType_By();

		/**
		 * The meta object literal for the '<em><b>Calc Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__CALC_MODE = eINSTANCE.getAnimateColorType_CalcMode();

		/**
		 * The meta object literal for the '<em><b>Color Interpolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION = eINSTANCE.getAnimateColorType_ColorInterpolation();

		/**
		 * The meta object literal for the '<em><b>Color Interpolation Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION_DIRECTION = eINSTANCE.getAnimateColorType_ColorInterpolationDirection();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__DECELERATE = eINSTANCE.getAnimateColorType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__DUR = eINSTANCE.getAnimateColorType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__END = eINSTANCE.getAnimateColorType_End();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__FILL = eINSTANCE.getAnimateColorType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__FILL_DEFAULT = eINSTANCE.getAnimateColorType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__FORMULA = eINSTANCE.getAnimateColorType_Formula();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__FROM = eINSTANCE.getAnimateColorType_From();

		/**
		 * The meta object literal for the '<em><b>Key Splines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__KEY_SPLINES = eINSTANCE.getAnimateColorType_KeySplines();

		/**
		 * The meta object literal for the '<em><b>Key Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__KEY_TIMES = eINSTANCE.getAnimateColorType_KeyTimes();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__REPEAT_COUNT = eINSTANCE.getAnimateColorType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__REPEAT_DUR = eINSTANCE.getAnimateColorType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__RESTART = eINSTANCE.getAnimateColorType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__RESTART_DEFAULT = eINSTANCE.getAnimateColorType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__SUB_ITEM = eINSTANCE.getAnimateColorType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__TARGET_ELEMENT = eINSTANCE.getAnimateColorType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__TO = eINSTANCE.getAnimateColorType_To();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_COLOR_TYPE__VALUES = eINSTANCE.getAnimateColorType_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateMotionTypeImpl <em>Animate Motion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateMotionTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateMotionType()
		 * @generated
		 */
		EClass ANIMATE_MOTION_TYPE = eINSTANCE.getAnimateMotionType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__ACCELERATE = eINSTANCE.getAnimateMotionType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__ACCUMULATE = eINSTANCE.getAnimateMotionType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__ADDITIVE = eINSTANCE.getAnimateMotionType_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__ATTRIBUTE_NAME = eINSTANCE.getAnimateMotionType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__AUTO_REVERSE = eINSTANCE.getAnimateMotionType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__BEGIN = eINSTANCE.getAnimateMotionType_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__BY = eINSTANCE.getAnimateMotionType_By();

		/**
		 * The meta object literal for the '<em><b>Calc Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__CALC_MODE = eINSTANCE.getAnimateMotionType_CalcMode();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__DECELERATE = eINSTANCE.getAnimateMotionType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__DUR = eINSTANCE.getAnimateMotionType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__END = eINSTANCE.getAnimateMotionType_End();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__FILL = eINSTANCE.getAnimateMotionType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__FILL_DEFAULT = eINSTANCE.getAnimateMotionType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__FORMULA = eINSTANCE.getAnimateMotionType_Formula();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__FROM = eINSTANCE.getAnimateMotionType_From();

		/**
		 * The meta object literal for the '<em><b>Key Splines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__KEY_SPLINES = eINSTANCE.getAnimateMotionType_KeySplines();

		/**
		 * The meta object literal for the '<em><b>Key Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__KEY_TIMES = eINSTANCE.getAnimateMotionType_KeyTimes();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__ORIGIN = eINSTANCE.getAnimateMotionType_Origin();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__PATH = eINSTANCE.getAnimateMotionType_Path();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__REPEAT_COUNT = eINSTANCE.getAnimateMotionType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__REPEAT_DUR = eINSTANCE.getAnimateMotionType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__RESTART = eINSTANCE.getAnimateMotionType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__RESTART_DEFAULT = eINSTANCE.getAnimateMotionType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__SUB_ITEM = eINSTANCE.getAnimateMotionType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__TARGET_ELEMENT = eINSTANCE.getAnimateMotionType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__TO = eINSTANCE.getAnimateMotionType_To();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_MOTION_TYPE__VALUES = eINSTANCE.getAnimateMotionType_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTransformTypeImpl <em>Animate Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTransformTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateTransformType()
		 * @generated
		 */
		EClass ANIMATE_TRANSFORM_TYPE = eINSTANCE.getAnimateTransformType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__ACCELERATE = eINSTANCE.getAnimateTransformType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__ACCUMULATE = eINSTANCE.getAnimateTransformType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__ADDITIVE = eINSTANCE.getAnimateTransformType_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__ATTRIBUTE_NAME = eINSTANCE.getAnimateTransformType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__AUTO_REVERSE = eINSTANCE.getAnimateTransformType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__BEGIN = eINSTANCE.getAnimateTransformType_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__BY = eINSTANCE.getAnimateTransformType_By();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__DECELERATE = eINSTANCE.getAnimateTransformType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__DUR = eINSTANCE.getAnimateTransformType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__END = eINSTANCE.getAnimateTransformType_End();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__FILL = eINSTANCE.getAnimateTransformType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__FILL_DEFAULT = eINSTANCE.getAnimateTransformType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__FORMULA = eINSTANCE.getAnimateTransformType_Formula();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__FROM = eINSTANCE.getAnimateTransformType_From();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__REPEAT_COUNT = eINSTANCE.getAnimateTransformType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__REPEAT_DUR = eINSTANCE.getAnimateTransformType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__RESTART = eINSTANCE.getAnimateTransformType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__RESTART_DEFAULT = eINSTANCE.getAnimateTransformType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__SUB_ITEM = eINSTANCE.getAnimateTransformType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__TARGET_ELEMENT = eINSTANCE.getAnimateTransformType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__TO = eINSTANCE.getAnimateTransformType_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__TYPE = eINSTANCE.getAnimateTransformType_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TRANSFORM_TYPE__VALUES = eINSTANCE.getAnimateTransformType_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl <em>Animate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAnimateType()
		 * @generated
		 */
		EClass ANIMATE_TYPE = eINSTANCE.getAnimateType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__ACCELERATE = eINSTANCE.getAnimateType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__ACCUMULATE = eINSTANCE.getAnimateType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__ADDITIVE = eINSTANCE.getAnimateType_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__ATTRIBUTE_NAME = eINSTANCE.getAnimateType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__AUTO_REVERSE = eINSTANCE.getAnimateType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__BEGIN = eINSTANCE.getAnimateType_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__BY = eINSTANCE.getAnimateType_By();

		/**
		 * The meta object literal for the '<em><b>Calc Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__CALC_MODE = eINSTANCE.getAnimateType_CalcMode();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__DECELERATE = eINSTANCE.getAnimateType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__DUR = eINSTANCE.getAnimateType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__END = eINSTANCE.getAnimateType_End();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__FILL = eINSTANCE.getAnimateType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__FILL_DEFAULT = eINSTANCE.getAnimateType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__FORMULA = eINSTANCE.getAnimateType_Formula();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__FROM = eINSTANCE.getAnimateType_From();

		/**
		 * The meta object literal for the '<em><b>Key Splines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__KEY_SPLINES = eINSTANCE.getAnimateType_KeySplines();

		/**
		 * The meta object literal for the '<em><b>Key Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__KEY_TIMES = eINSTANCE.getAnimateType_KeyTimes();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__REPEAT_COUNT = eINSTANCE.getAnimateType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__REPEAT_DUR = eINSTANCE.getAnimateType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__RESTART = eINSTANCE.getAnimateType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__RESTART_DEFAULT = eINSTANCE.getAnimateType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__SUB_ITEM = eINSTANCE.getAnimateType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__TARGET_ELEMENT = eINSTANCE.getAnimateType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__TO = eINSTANCE.getAnimateType_To();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATE_TYPE__VALUES = eINSTANCE.getAnimateType_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl <em>Audio Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getAudioType()
		 * @generated
		 */
		EClass AUDIO_TYPE = eINSTANCE.getAudioType();

		/**
		 * The meta object literal for the '<em><b>Audio Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__AUDIO_LEVEL = eINSTANCE.getAudioType_AudioLevel();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__BEGIN = eINSTANCE.getAudioType_Begin();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__DUR = eINSTANCE.getAudioType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__END = eINSTANCE.getAudioType_End();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__GROUP_ID = eINSTANCE.getAudioType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__HREF = eINSTANCE.getAudioType_Href();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__ID = eINSTANCE.getAudioType_Id();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__MASTER_ELEMENT = eINSTANCE.getAudioType_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__NODE_TYPE = eINSTANCE.getAudioType_NodeType();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__PRESET_CLASS = eINSTANCE.getAudioType_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__PRESET_ID = eINSTANCE.getAudioType_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__PRESET_SUB_TYPE = eINSTANCE.getAudioType_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__REPEAT_COUNT = eINSTANCE.getAudioType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TYPE__REPEAT_DUR = eINSTANCE.getAudioType_RepeatDur();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl <em>Command Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getCommandType()
		 * @generated
		 */
		EClass COMMAND_TYPE = eINSTANCE.getCommandType();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_TYPE__PARAM = eINSTANCE.getCommandType_Param();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__BEGIN = eINSTANCE.getCommandType_Begin();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__COMMAND = eINSTANCE.getCommandType_Command();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__END = eINSTANCE.getCommandType_End();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__GROUP_ID = eINSTANCE.getCommandType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__ID = eINSTANCE.getCommandType_Id();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__MASTER_ELEMENT = eINSTANCE.getCommandType_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__NODE_TYPE = eINSTANCE.getCommandType_NodeType();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__PRESET_CLASS = eINSTANCE.getCommandType_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__PRESET_ID = eINSTANCE.getCommandType_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__PRESET_SUB_TYPE = eINSTANCE.getCommandType_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__SUB_ITEM = eINSTANCE.getCommandType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__TARGET_ELEMENT = eINSTANCE.getCommandType_TargetElement();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Animate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATE = eINSTANCE.getDocumentRoot_Animate();

		/**
		 * The meta object literal for the '<em><b>Animate Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATE_COLOR = eINSTANCE.getDocumentRoot_AnimateColor();

		/**
		 * The meta object literal for the '<em><b>Animate Motion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATE_MOTION = eINSTANCE.getDocumentRoot_AnimateMotion();

		/**
		 * The meta object literal for the '<em><b>Animate Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATE_TRANSFORM = eINSTANCE.getDocumentRoot_AnimateTransform();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDIO = eINSTANCE.getDocumentRoot_Audio();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMAND = eINSTANCE.getDocumentRoot_Command();

		/**
		 * The meta object literal for the '<em><b>Iterate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ITERATE = eINSTANCE.getDocumentRoot_Iterate();

		/**
		 * The meta object literal for the '<em><b>Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PAR = eINSTANCE.getDocumentRoot_Par();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAM = eINSTANCE.getDocumentRoot_Param();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEQ = eINSTANCE.getDocumentRoot_Seq();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SET = eINSTANCE.getDocumentRoot_Set();

		/**
		 * The meta object literal for the '<em><b>Transition Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSITION_FILTER = eINSTANCE.getDocumentRoot_TransitionFilter();

		/**
		 * The meta object literal for the '<em><b>Audio Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUDIO_LEVEL = eINSTANCE.getDocumentRoot_AudioLevel();

		/**
		 * The meta object literal for the '<em><b>Color Interpolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLOR_INTERPOLATION = eINSTANCE.getDocumentRoot_ColorInterpolation();

		/**
		 * The meta object literal for the '<em><b>Color Interpolation Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION = eINSTANCE.getDocumentRoot_ColorInterpolationDirection();

		/**
		 * The meta object literal for the '<em><b>Command1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMMAND1 = eINSTANCE.getDocumentRoot_Command1();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FORMULA = eINSTANCE.getDocumentRoot_Formula();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Iterate Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ITERATE_INTERVAL = eINSTANCE.getDocumentRoot_IterateInterval();

		/**
		 * The meta object literal for the '<em><b>Iterate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ITERATE_TYPE = eINSTANCE.getDocumentRoot_IterateType();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUB_ITEM = eINSTANCE.getDocumentRoot_SubItem();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.IterateTypeImpl <em>Iterate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.IterateTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getIterateType()
		 * @generated
		 */
		EClass ITERATE_TYPE = eINSTANCE.getIterateType();

		/**
		 * The meta object literal for the '<em><b>Animation Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ANIMATION_ELEMENT_GROUP = eINSTANCE.getIterateType_AnimationElementGroup();

		/**
		 * The meta object literal for the '<em><b>Animation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_TYPE__ANIMATION_ELEMENT = eINSTANCE.getIterateType_AnimationElement();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ACCELERATE = eINSTANCE.getIterateType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__AUTO_REVERSE = eINSTANCE.getIterateType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__BEGIN = eINSTANCE.getIterateType_Begin();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__DECELERATE = eINSTANCE.getIterateType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__DUR = eINSTANCE.getIterateType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__END = eINSTANCE.getIterateType_End();

		/**
		 * The meta object literal for the '<em><b>Endsync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ENDSYNC = eINSTANCE.getIterateType_Endsync();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__FILL = eINSTANCE.getIterateType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__FILL_DEFAULT = eINSTANCE.getIterateType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__GROUP_ID = eINSTANCE.getIterateType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ID = eINSTANCE.getIterateType_Id();

		/**
		 * The meta object literal for the '<em><b>Iterate Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ITERATE_INTERVAL = eINSTANCE.getIterateType_IterateInterval();

		/**
		 * The meta object literal for the '<em><b>Iterate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__ITERATE_TYPE = eINSTANCE.getIterateType_IterateType();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__MASTER_ELEMENT = eINSTANCE.getIterateType_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__NODE_TYPE = eINSTANCE.getIterateType_NodeType();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__PRESET_CLASS = eINSTANCE.getIterateType_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__PRESET_ID = eINSTANCE.getIterateType_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__PRESET_SUB_TYPE = eINSTANCE.getIterateType_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__REPEAT_COUNT = eINSTANCE.getIterateType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__REPEAT_DUR = eINSTANCE.getIterateType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__RESTART = eINSTANCE.getIterateType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__RESTART_DEFAULT = eINSTANCE.getIterateType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__SUB_ITEM = eINSTANCE.getIterateType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TYPE__TARGET_ELEMENT = eINSTANCE.getIterateType_TargetElement();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParamTypeImpl <em>Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParamTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getParamType()
		 * @generated
		 */
		EClass PARAM_TYPE = eINSTANCE.getParamType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__NAME = eINSTANCE.getParamType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__VALUE = eINSTANCE.getParamType_Value();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl <em>Par Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getParType()
		 * @generated
		 */
		EClass PAR_TYPE = eINSTANCE.getParType();

		/**
		 * The meta object literal for the '<em><b>Animation Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__ANIMATION_ELEMENT_GROUP = eINSTANCE.getParType_AnimationElementGroup();

		/**
		 * The meta object literal for the '<em><b>Animation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAR_TYPE__ANIMATION_ELEMENT = eINSTANCE.getParType_AnimationElement();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__ACCELERATE = eINSTANCE.getParType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__AUTO_REVERSE = eINSTANCE.getParType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__BEGIN = eINSTANCE.getParType_Begin();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__DECELERATE = eINSTANCE.getParType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__DUR = eINSTANCE.getParType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__END = eINSTANCE.getParType_End();

		/**
		 * The meta object literal for the '<em><b>Endsync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__ENDSYNC = eINSTANCE.getParType_Endsync();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__FILL = eINSTANCE.getParType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__FILL_DEFAULT = eINSTANCE.getParType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__GROUP_ID = eINSTANCE.getParType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__ID = eINSTANCE.getParType_Id();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__MASTER_ELEMENT = eINSTANCE.getParType_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__NODE_TYPE = eINSTANCE.getParType_NodeType();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__PRESET_CLASS = eINSTANCE.getParType_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__PRESET_ID = eINSTANCE.getParType_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__PRESET_SUB_TYPE = eINSTANCE.getParType_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__REPEAT_COUNT = eINSTANCE.getParType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__REPEAT_DUR = eINSTANCE.getParType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__RESTART = eINSTANCE.getParType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAR_TYPE__RESTART_DEFAULT = eINSTANCE.getParType_RestartDefault();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SeqTypeImpl <em>Seq Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SeqTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getSeqType()
		 * @generated
		 */
		EClass SEQ_TYPE = eINSTANCE.getSeqType();

		/**
		 * The meta object literal for the '<em><b>Animation Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__ANIMATION_ELEMENT_GROUP = eINSTANCE.getSeqType_AnimationElementGroup();

		/**
		 * The meta object literal for the '<em><b>Animation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_TYPE__ANIMATION_ELEMENT = eINSTANCE.getSeqType_AnimationElement();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__ACCELERATE = eINSTANCE.getSeqType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__AUTO_REVERSE = eINSTANCE.getSeqType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__BEGIN = eINSTANCE.getSeqType_Begin();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__DECELERATE = eINSTANCE.getSeqType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__DUR = eINSTANCE.getSeqType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__END = eINSTANCE.getSeqType_End();

		/**
		 * The meta object literal for the '<em><b>Endsync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__ENDSYNC = eINSTANCE.getSeqType_Endsync();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__FILL = eINSTANCE.getSeqType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__FILL_DEFAULT = eINSTANCE.getSeqType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__GROUP_ID = eINSTANCE.getSeqType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__ID = eINSTANCE.getSeqType_Id();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__MASTER_ELEMENT = eINSTANCE.getSeqType_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__NODE_TYPE = eINSTANCE.getSeqType_NodeType();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__PRESET_CLASS = eINSTANCE.getSeqType_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__PRESET_ID = eINSTANCE.getSeqType_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__PRESET_SUB_TYPE = eINSTANCE.getSeqType_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__REPEAT_COUNT = eINSTANCE.getSeqType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__REPEAT_DUR = eINSTANCE.getSeqType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__RESTART = eINSTANCE.getSeqType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_TYPE__RESTART_DEFAULT = eINSTANCE.getSeqType_RestartDefault();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__ACCELERATE = eINSTANCE.getSetType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__ACCUMULATE = eINSTANCE.getSetType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__ADDITIVE = eINSTANCE.getSetType_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__ATTRIBUTE_NAME = eINSTANCE.getSetType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__AUTO_REVERSE = eINSTANCE.getSetType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__BEGIN = eINSTANCE.getSetType_Begin();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__DECELERATE = eINSTANCE.getSetType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__DUR = eINSTANCE.getSetType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__END = eINSTANCE.getSetType_End();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__FILL = eINSTANCE.getSetType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__FILL_DEFAULT = eINSTANCE.getSetType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__REPEAT_COUNT = eINSTANCE.getSetType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__REPEAT_DUR = eINSTANCE.getSetType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__RESTART = eINSTANCE.getSetType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__RESTART_DEFAULT = eINSTANCE.getSetType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__SUB_ITEM = eINSTANCE.getSetType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__TARGET_ELEMENT = eINSTANCE.getSetType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__TO = eINSTANCE.getSetType_To();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.TransitionFilterTypeImpl <em>Transition Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.TransitionFilterTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getTransitionFilterType()
		 * @generated
		 */
		EClass TRANSITION_FILTER_TYPE = eINSTANCE.getTransitionFilterType();

		/**
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__ACCELERATE = eINSTANCE.getTransitionFilterType_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__ACCUMULATE = eINSTANCE.getTransitionFilterType_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__ADDITIVE = eINSTANCE.getTransitionFilterType_Additive();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__AUTO_REVERSE = eINSTANCE.getTransitionFilterType_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__BEGIN = eINSTANCE.getTransitionFilterType_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__BY = eINSTANCE.getTransitionFilterType_By();

		/**
		 * The meta object literal for the '<em><b>Calc Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__CALC_MODE = eINSTANCE.getTransitionFilterType_CalcMode();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__DECELERATE = eINSTANCE.getTransitionFilterType_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__DIRECTION = eINSTANCE.getTransitionFilterType_Direction();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__DUR = eINSTANCE.getTransitionFilterType_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__END = eINSTANCE.getTransitionFilterType_End();

		/**
		 * The meta object literal for the '<em><b>Fade Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__FADE_COLOR = eINSTANCE.getTransitionFilterType_FadeColor();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__FILL = eINSTANCE.getTransitionFilterType_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__FILL_DEFAULT = eINSTANCE.getTransitionFilterType_FillDefault();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__FORMULA = eINSTANCE.getTransitionFilterType_Formula();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__FROM = eINSTANCE.getTransitionFilterType_From();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__MODE = eINSTANCE.getTransitionFilterType_Mode();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__REPEAT_COUNT = eINSTANCE.getTransitionFilterType_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__REPEAT_DUR = eINSTANCE.getTransitionFilterType_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__RESTART = eINSTANCE.getTransitionFilterType_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__RESTART_DEFAULT = eINSTANCE.getTransitionFilterType_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Sub Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__SUB_ITEM = eINSTANCE.getTransitionFilterType_SubItem();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__SUBTYPE = eINSTANCE.getTransitionFilterType_Subtype();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__TARGET_ELEMENT = eINSTANCE.getTransitionFilterType_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__TO = eINSTANCE.getTransitionFilterType_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__TYPE = eINSTANCE.getTransitionFilterType_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FILTER_TYPE__VALUES = eINSTANCE.getTransitionFilterType_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType <em>Color Interpolation Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationDirectionType()
		 * @generated
		 */
		EEnum COLOR_INTERPOLATION_DIRECTION_TYPE = eINSTANCE.getColorInterpolationDirectionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType <em>Color Interpolation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationType()
		 * @generated
		 */
		EEnum COLOR_INTERPOLATION_TYPE = eINSTANCE.getColorInterpolationType();

		/**
		 * The meta object literal for the '<em>Color Interpolation Direction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationDirectionTypeObject()
		 * @generated
		 */
		EDataType COLOR_INTERPOLATION_DIRECTION_TYPE_OBJECT = eINSTANCE.getColorInterpolationDirectionTypeObject();

		/**
		 * The meta object literal for the '<em>Color Interpolation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl#getColorInterpolationTypeObject()
		 * @generated
		 */
		EDataType COLOR_INTERPOLATION_TYPE_OBJECT = eINSTANCE.getColorInterpolationTypeObject();

	}

} //AnimationPackage
