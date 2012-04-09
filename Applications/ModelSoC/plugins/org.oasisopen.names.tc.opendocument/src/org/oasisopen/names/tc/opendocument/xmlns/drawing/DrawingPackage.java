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
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingFactory
 * @model kind="package"
 * @generated
 */
public interface DrawingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drawing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfdrawing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrawingPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AppletTypeImpl <em>Applet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AppletTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAppletType()
	 * @generated
	 */
	int APPLET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__ARCHIVE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>May Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__MAY_SCRIPT = 5;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Applet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaCircleTypeImpl <em>Area Circle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaCircleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAreaCircleType()
	 * @generated
	 */
	int AREA_CIRCLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__CX = 3;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__CY = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__HREF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Nohref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__NOHREF = 7;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__R = 8;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__SHOW = 9;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__TARGET_FRAME_NAME = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE__TYPE = 11;

	/**
	 * The number of structural features of the '<em>Area Circle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CIRCLE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaPolygonTypeImpl <em>Area Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaPolygonTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAreaPolygonType()
	 * @generated
	 */
	int AREA_POLYGON_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nohref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__NOHREF = 6;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__POINTS = 7;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__SHOW = 8;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__TARGET_FRAME_NAME = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__TYPE = 10;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__VIEW_BOX = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__WIDTH = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__X = 13;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE__Y = 14;

	/**
	 * The number of structural features of the '<em>Area Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_POLYGON_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaRectangleTypeImpl <em>Area Rectangle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.AreaRectangleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAreaRectangleType()
	 * @generated
	 */
	int AREA_RECTANGLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nohref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__NOHREF = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__TARGET_FRAME_NAME = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__WIDTH = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__X = 11;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE__Y = 12;

	/**
	 * The number of structural features of the '<em>Area Rectangle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RECTANGLE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ATypeImpl <em>AType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ATypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAType()
	 * @generated
	 */
	int ATYPE = 4;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__FRAME = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Server Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SERVER_MAP = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TARGET_FRAME_NAME = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CaptionTypeImpl <em>Caption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CaptionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionType()
	 * @generated
	 */
	int CAPTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Caption Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CAPTION_POINT_X = 10;

	/**
	 * The feature id for the '<em><b>Caption Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CAPTION_POINT_Y = 11;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CLASS_NAMES = 12;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CLASS_NAMES1 = 13;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CORNER_RADIUS = 14;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__END_CELL_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__END_X = 16;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__END_Y = 17;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__HEIGHT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ID = 19;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__LAYER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__NAME = 21;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STYLE_NAME = 22;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STYLE_NAME1 = 23;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TABLE_BACKGROUND = 24;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TEXT_STYLE_NAME = 25;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TRANSFORM = 26;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__WIDTH = 27;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__X = 28;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__Y = 29;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ZINDEX = 30;

	/**
	 * The number of structural features of the '<em>Caption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl <em>Circle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CircleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCircleType()
	 * @generated
	 */
	int CIRCLE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__CX = 12;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__CY = 13;

	/**
	 * The feature id for the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__END_ANGLE = 14;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__END_CELL_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__END_X = 16;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__END_Y = 17;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__HEIGHT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__ID = 19;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__KIND = 20;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__LAYER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__NAME = 22;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__R = 23;

	/**
	 * The feature id for the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__START_ANGLE = 24;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__STYLE_NAME = 25;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__STYLE_NAME1 = 26;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__TABLE_BACKGROUND = 27;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__TEXT_STYLE_NAME = 28;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__TRANSFORM = 29;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__WIDTH = 30;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__X = 31;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__Y = 32;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE__ZINDEX = 33;

	/**
	 * The number of structural features of the '<em>Circle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_TYPE_FEATURE_COUNT = 34;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ConnectorTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__END_GLUE_POINT = 13;

	/**
	 * The feature id for the '<em><b>End Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__END_SHAPE = 14;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__END_X = 15;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__END_Y = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ID = 17;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LAYER = 18;

	/**
	 * The feature id for the '<em><b>Line Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LINE_SKEW = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Start Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__START_GLUE_POINT = 21;

	/**
	 * The feature id for the '<em><b>Start Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__START_SHAPE = 22;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__STYLE_NAME1 = 24;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TABLE_BACKGROUND = 25;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TEXT_STYLE_NAME = 26;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TRANSFORM = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TYPE = 28;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__X1 = 29;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__X2 = 30;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__Y1 = 31;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__Y2 = 32;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ZINDEX = 33;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 34;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl <em>Contour Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getContourPathType()
	 * @generated
	 */
	int CONTOUR_PATH_TYPE = 8;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE__D = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Recreate On Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE__RECREATE_ON_EDIT = 2;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE__VIEW_BOX = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE__WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Contour Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_PATH_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPolygonTypeImpl <em>Contour Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPolygonTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getContourPolygonType()
	 * @generated
	 */
	int CONTOUR_POLYGON_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Recreate On Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE__RECREATE_ON_EDIT = 2;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE__VIEW_BOX = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE__WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Contour Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTOUR_POLYGON_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ControlTypeImpl <em>Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ControlTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__GLUE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ANCHOR_PAGE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ANCHOR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CAPTION_ID = 5;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CLASS_NAMES = 6;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CLASS_NAMES1 = 7;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CONTROL = 8;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__END_CELL_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__END_X = 10;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__END_Y = 11;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__HEIGHT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__LAYER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__NAME = 15;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__STYLE_NAME = 16;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__STYLE_NAME1 = 17;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__TABLE_BACKGROUND = 18;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__TEXT_STYLE_NAME = 19;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__TRANSFORM = 20;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__WIDTH = 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__X = 22;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__Y = 23;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ZINDEX = 24;

	/**
	 * The number of structural features of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CustomShapeTypeImpl <em>Custom Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.CustomShapeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCustomShapeType()
	 * @generated
	 */
	int CUSTOM_SHAPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Enhanced Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ENHANCED_GEOMETRY = 7;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ANCHOR_PAGE_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ANCHOR_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__CAPTION_ID = 10;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__CLASS_NAMES = 11;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__CLASS_NAMES1 = 12;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__DATA = 13;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__END_CELL_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__END_X = 15;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__END_Y = 16;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ENGINE = 17;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__HEIGHT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ID = 19;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__LAYER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__NAME = 21;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__STYLE_NAME = 22;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__STYLE_NAME1 = 23;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__TABLE_BACKGROUND = 24;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__TEXT_STYLE_NAME = 25;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__TRANSFORM = 26;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__WIDTH = 27;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__X = 28;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__Y = 29;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE__ZINDEX = 30;

	/**
	 * The number of structural features of the '<em>Custom Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_TYPE_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

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
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__A = 3;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLET = 4;

	/**
	 * The feature id for the '<em><b>Area Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AREA_CIRCLE = 5;

	/**
	 * The feature id for the '<em><b>Area Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AREA_POLYGON = 6;

	/**
	 * The feature id for the '<em><b>Area Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AREA_RECTANGLE = 7;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION = 8;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CIRCLE = 9;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>Contour Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTOUR_PATH = 11;

	/**
	 * The feature id for the '<em><b>Contour Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTOUR_POLYGON = 12;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROL = 13;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_SHAPE = 14;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELLIPSE = 15;

	/**
	 * The feature id for the '<em><b>Enhanced Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENHANCED_GEOMETRY = 16;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EQUATION = 17;

	/**
	 * The feature id for the '<em><b>Fill Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE = 18;

	/**
	 * The feature id for the '<em><b>Floating Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOATING_FRAME = 19;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME = 20;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__G = 21;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLUE_POINT = 22;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRADIENT = 23;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE = 24;

	/**
	 * The feature id for the '<em><b>Hatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HATCH = 25;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 26;

	/**
	 * The feature id for the '<em><b>Image Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_MAP = 27;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYER = 28;

	/**
	 * The feature id for the '<em><b>Layer Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYER_SET = 29;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE = 30;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER = 31;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE = 32;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT = 33;

	/**
	 * The feature id for the '<em><b>Object Ole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_OLE = 34;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPACITY = 35;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE = 36;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_THUMBNAIL = 37;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM = 38;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH = 39;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLUGIN = 40;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON = 41;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYLINE = 42;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECT = 43;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGULAR_POLYGON = 44;

	/**
	 * The feature id for the '<em><b>Stroke Dash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_DASH = 45;

	/**
	 * The feature id for the '<em><b>Text Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_BOX = 46;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIGN = 47;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANGLE = 48;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCHIVE = 49;

	/**
	 * The feature id for the '<em><b>Auto Grow Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_GROW_HEIGHT = 50;

	/**
	 * The feature id for the '<em><b>Auto Grow Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_GROW_WIDTH = 51;

	/**
	 * The feature id for the '<em><b>Background Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_SIZE = 52;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BLUE = 53;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER = 54;

	/**
	 * The feature id for the '<em><b>Caption Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_ANGLE = 55;

	/**
	 * The feature id for the '<em><b>Caption Angle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_ANGLE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Caption Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_ESCAPE = 57;

	/**
	 * The feature id for the '<em><b>Caption Escape Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION = 58;

	/**
	 * The feature id for the '<em><b>Caption Fit Line Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH = 59;

	/**
	 * The feature id for the '<em><b>Caption Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_GAP = 60;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_ID = 61;

	/**
	 * The feature id for the '<em><b>Caption Line Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_LINE_LENGTH = 62;

	/**
	 * The feature id for the '<em><b>Caption Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_POINT_X = 63;

	/**
	 * The feature id for the '<em><b>Caption Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_POINT_Y = 64;

	/**
	 * The feature id for the '<em><b>Caption Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Chain Next Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHAIN_NEXT_NAME = 66;

	/**
	 * The feature id for the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS_ID = 67;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS_NAMES = 68;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE = 69;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR = 70;

	/**
	 * The feature id for the '<em><b>Color Inversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR_INVERSION = 71;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR_MODE = 72;

	/**
	 * The feature id for the '<em><b>Concave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONCAVE = 73;

	/**
	 * The feature id for the '<em><b>Concentric Gradient Fill Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED = 74;

	/**
	 * The feature id for the '<em><b>Contrast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRAST = 75;

	/**
	 * The feature id for the '<em><b>Control1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROL1 = 76;

	/**
	 * The feature id for the '<em><b>Copy Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY_OF = 77;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORNER_RADIUS = 78;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORNERS = 79;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CX = 80;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CY = 81;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA = 82;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL_PLACES = 83;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY = 84;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_NAME = 85;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE = 86;

	/**
	 * The feature id for the '<em><b>Dots1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOTS1 = 87;

	/**
	 * The feature id for the '<em><b>Dots1 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOTS1_LENGTH = 88;

	/**
	 * The feature id for the '<em><b>Dots2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOTS2 = 89;

	/**
	 * The feature id for the '<em><b>Dots2 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOTS2_LENGTH = 90;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 91;

	/**
	 * The feature id for the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_ANGLE = 92;

	/**
	 * The feature id for the '<em><b>End Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_COLOR = 93;

	/**
	 * The feature id for the '<em><b>End Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_GLUE_POINT = 94;

	/**
	 * The feature id for the '<em><b>End Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_GUIDE = 95;

	/**
	 * The feature id for the '<em><b>End Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_INTENSITY = 96;

	/**
	 * The feature id for the '<em><b>End Line Spacing Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL = 97;

	/**
	 * The feature id for the '<em><b>End Line Spacing Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL = 98;

	/**
	 * The feature id for the '<em><b>End Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_SHAPE = 99;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENGINE = 100;

	/**
	 * The feature id for the '<em><b>Enhanced Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENHANCED_PATH = 101;

	/**
	 * The feature id for the '<em><b>Escape Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ESCAPE_DIRECTION = 102;

	/**
	 * The feature id for the '<em><b>Extrusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION = 103;

	/**
	 * The feature id for the '<em><b>Extrusion Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_ALLOWED = 104;

	/**
	 * The feature id for the '<em><b>Extrusion Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS = 105;

	/**
	 * The feature id for the '<em><b>Extrusion Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_COLOR = 106;

	/**
	 * The feature id for the '<em><b>Extrusion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_DEPTH = 107;

	/**
	 * The feature id for the '<em><b>Extrusion Diffusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_DIFFUSION = 108;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION = 109;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Harsh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH = 110;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL = 111;

	/**
	 * The feature id for the '<em><b>Extrusion Light Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE = 112;

	/**
	 * The feature id for the '<em><b>Extrusion Metal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_METAL = 113;

	/**
	 * The feature id for the '<em><b>Extrusion Number Of Line Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS = 114;

	/**
	 * The feature id for the '<em><b>Extrusion Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_ORIGIN = 115;

	/**
	 * The feature id for the '<em><b>Extrusion Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE = 116;

	/**
	 * The feature id for the '<em><b>Extrusion Rotation Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER = 117;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION = 118;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Harsh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH = 119;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL = 120;

	/**
	 * The feature id for the '<em><b>Extrusion Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SHININESS = 121;

	/**
	 * The feature id for the '<em><b>Extrusion Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SKEW = 122;

	/**
	 * The feature id for the '<em><b>Extrusion Specularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_SPECULARITY = 123;

	/**
	 * The feature id for the '<em><b>Extrusion Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUSION_VIEWPOINT = 124;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL = 125;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_COLOR = 126;

	/**
	 * The feature id for the '<em><b>Fill Gradient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_GRADIENT_NAME = 127;

	/**
	 * The feature id for the '<em><b>Fill Hatch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_HATCH_NAME = 128;

	/**
	 * The feature id for the '<em><b>Fill Hatch Solid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_HATCH_SOLID = 129;

	/**
	 * The feature id for the '<em><b>Fill Image Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_HEIGHT = 130;

	/**
	 * The feature id for the '<em><b>Fill Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_NAME = 131;

	/**
	 * The feature id for the '<em><b>Fill Image Ref Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_REF_POINT = 132;

	/**
	 * The feature id for the '<em><b>Fill Image Ref Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X = 133;

	/**
	 * The feature id for the '<em><b>Fill Image Ref Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y = 134;

	/**
	 * The feature id for the '<em><b>Fill Image Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_IMAGE_WIDTH = 135;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_NAME = 136;

	/**
	 * The feature id for the '<em><b>Fit To Contour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIT_TO_CONTOUR = 137;

	/**
	 * The feature id for the '<em><b>Fit To Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIT_TO_SIZE = 138;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMULA = 139;

	/**
	 * The feature id for the '<em><b>Frame Display Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME_DISPLAY_BORDER = 140;

	/**
	 * The feature id for the '<em><b>Frame Display Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR = 141;

	/**
	 * The feature id for the '<em><b>Frame Margin Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL = 142;

	/**
	 * The feature id for the '<em><b>Frame Margin Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL = 143;

	/**
	 * The feature id for the '<em><b>Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME_NAME = 144;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GAMMA = 145;

	/**
	 * The feature id for the '<em><b>Glue Point Leaving Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS = 146;

	/**
	 * The feature id for the '<em><b>Glue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLUE_POINTS = 147;

	/**
	 * The feature id for the '<em><b>Glue Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLUE_POINT_TYPE = 148;

	/**
	 * The feature id for the '<em><b>Gradient Step Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRADIENT_STEP_COUNT = 149;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GREEN = 150;

	/**
	 * The feature id for the '<em><b>Guide Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GUIDE_DISTANCE = 151;

	/**
	 * The feature id for the '<em><b>Guide Overhang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GUIDE_OVERHANG = 152;

	/**
	 * The feature id for the '<em><b>Handle Mirror Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL = 153;

	/**
	 * The feature id for the '<em><b>Handle Mirror Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL = 154;

	/**
	 * The feature id for the '<em><b>Handle Polar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_POLAR = 155;

	/**
	 * The feature id for the '<em><b>Handle Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_POSITION = 156;

	/**
	 * The feature id for the '<em><b>Handle Radius Range Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM = 157;

	/**
	 * The feature id for the '<em><b>Handle Radius Range Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM = 158;

	/**
	 * The feature id for the '<em><b>Handle Range XMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM = 159;

	/**
	 * The feature id for the '<em><b>Handle Range XMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM = 160;

	/**
	 * The feature id for the '<em><b>Handle Range YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM = 161;

	/**
	 * The feature id for the '<em><b>Handle Range YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM = 162;

	/**
	 * The feature id for the '<em><b>Handle Switched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLE_SWITCHED = 163;

	/**
	 * The feature id for the '<em><b>Image Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_OPACITY = 164;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KIND = 165;

	/**
	 * The feature id for the '<em><b>Layer1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYER1 = 166;

	/**
	 * The feature id for the '<em><b>Line Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_DISTANCE = 167;

	/**
	 * The feature id for the '<em><b>Line Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_SKEW = 168;

	/**
	 * The feature id for the '<em><b>Luminance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LUMINANCE = 169;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_END = 170;

	/**
	 * The feature id for the '<em><b>Marker End Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_END_CENTER = 171;

	/**
	 * The feature id for the '<em><b>Marker End Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_END_WIDTH = 172;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_START = 173;

	/**
	 * The feature id for the '<em><b>Marker Start Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_START_CENTER = 174;

	/**
	 * The feature id for the '<em><b>Marker Start Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER_START_WIDTH = 175;

	/**
	 * The feature id for the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_PAGE_NAME = 176;

	/**
	 * The feature id for the '<em><b>May Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAY_SCRIPT = 177;

	/**
	 * The feature id for the '<em><b>Measure Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE_ALIGN = 178;

	/**
	 * The feature id for the '<em><b>Measure Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN = 179;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_TYPE = 180;

	/**
	 * The feature id for the '<em><b>Mirror Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIRROR_HORIZONTAL = 181;

	/**
	 * The feature id for the '<em><b>Mirror Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIRROR_VERTICAL = 182;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIERS = 183;

	/**
	 * The feature id for the '<em><b>Nav Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAV_ORDER = 184;

	/**
	 * The feature id for the '<em><b>Nohref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOHREF = 185;

	/**
	 * The feature id for the '<em><b>Notify On Update Of Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES = 186;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT1 = 187;

	/**
	 * The feature id for the '<em><b>Ole Draw Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OLE_DRAW_ASPECT = 188;

	/**
	 * The feature id for the '<em><b>Opacity1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPACITY1 = 189;

	/**
	 * The feature id for the '<em><b>Opacity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPACITY_NAME = 190;

	/**
	 * The feature id for the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_NUMBER = 191;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARALLEL = 192;

	/**
	 * The feature id for the '<em><b>Path Stretchpoint X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH_STRETCHPOINT_X = 193;

	/**
	 * The feature id for the '<em><b>Path Stretchpoint Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH_STRETCHPOINT_Y = 194;

	/**
	 * The feature id for the '<em><b>Placing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACING = 195;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINTS = 196;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTECTED = 197;

	/**
	 * The feature id for the '<em><b>Recreate On Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECREATE_ON_EDIT = 198;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RED = 199;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATION = 200;

	/**
	 * The feature id for the '<em><b>Secondary Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECONDARY_FILL_COLOR = 201;

	/**
	 * The feature id for the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW = 202;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW_COLOR = 203;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW_OFFSET_X = 204;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW_OFFSET_Y = 205;

	/**
	 * The feature id for the '<em><b>Shadow Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW_OPACITY = 206;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHAPE_ID = 207;

	/**
	 * The feature id for the '<em><b>Sharpness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHARPNESS = 208;

	/**
	 * The feature id for the '<em><b>Show Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_UNIT = 209;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 210;

	/**
	 * The feature id for the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_ANGLE = 211;

	/**
	 * The feature id for the '<em><b>Start Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_COLOR = 212;

	/**
	 * The feature id for the '<em><b>Start Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_GLUE_POINT = 213;

	/**
	 * The feature id for the '<em><b>Start Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_GUIDE = 214;

	/**
	 * The feature id for the '<em><b>Start Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_INTENSITY = 215;

	/**
	 * The feature id for the '<em><b>Start Line Spacing Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL = 216;

	/**
	 * The feature id for the '<em><b>Start Line Spacing Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL = 217;

	/**
	 * The feature id for the '<em><b>Start Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_SHAPE = 218;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE = 219;

	/**
	 * The feature id for the '<em><b>Stroke Dash1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_DASH1 = 220;

	/**
	 * The feature id for the '<em><b>Stroke Dash Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_DASH_NAMES = 221;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_LINEJOIN = 222;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_NAME = 223;

	/**
	 * The feature id for the '<em><b>Symbol Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_COLOR = 224;

	/**
	 * The feature id for the '<em><b>Textarea Horizontal Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN = 225;

	/**
	 * The feature id for the '<em><b>Text Areas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_AREAS = 226;

	/**
	 * The feature id for the '<em><b>Textarea Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN = 227;

	/**
	 * The feature id for the '<em><b>Text Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PATH = 228;

	/**
	 * The feature id for the '<em><b>Text Path Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PATH_ALLOWED = 229;

	/**
	 * The feature id for the '<em><b>Text Path Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PATH_MODE = 230;

	/**
	 * The feature id for the '<em><b>Text Path Same Letter Heights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS = 231;

	/**
	 * The feature id for the '<em><b>Text Path Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PATH_SCALE = 232;

	/**
	 * The feature id for the '<em><b>Text Rotate Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ROTATE_ANGLE = 233;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_STYLE_NAME = 234;

	/**
	 * The feature id for the '<em><b>Tile Repeat Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TILE_REPEAT_OFFSET = 235;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM = 236;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT = 237;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 238;

	/**
	 * The feature id for the '<em><b>Visible Area Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT = 239;

	/**
	 * The feature id for the '<em><b>Visible Area Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBLE_AREA_LEFT = 240;

	/**
	 * The feature id for the '<em><b>Visible Area Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBLE_AREA_TOP = 241;

	/**
	 * The feature id for the '<em><b>Visible Area Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBLE_AREA_WIDTH = 242;

	/**
	 * The feature id for the '<em><b>Wrap Influence On Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION = 243;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ZINDEX = 244;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 245;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EllipseTypeImpl <em>Ellipse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EllipseTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getEllipseType()
	 * @generated
	 */
	int ELLIPSE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__CX = 12;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__CY = 13;

	/**
	 * The feature id for the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__END_ANGLE = 14;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__END_CELL_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__END_X = 16;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__END_Y = 17;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__HEIGHT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ID = 19;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__KIND = 20;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__LAYER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__NAME = 22;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__RX = 23;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__RY = 24;

	/**
	 * The feature id for the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__START_ANGLE = 25;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STYLE_NAME = 26;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STYLE_NAME1 = 27;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TABLE_BACKGROUND = 28;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TEXT_STYLE_NAME = 29;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TRANSFORM = 30;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__WIDTH = 31;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__X = 32;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__Y = 33;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ZINDEX = 34;

	/**
	 * The number of structural features of the '<em>Ellipse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE_FEATURE_COUNT = 35;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl <em>Enhanced Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EnhancedGeometryTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getEnhancedGeometryType()
	 * @generated
	 */
	int ENHANCED_GEOMETRY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EQUATION = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__HANDLE = 1;

	/**
	 * The feature id for the '<em><b>Concentric Gradient Fill Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__CONCENTRIC_GRADIENT_FILL_ALLOWED = 2;

	/**
	 * The feature id for the '<em><b>Enhanced Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__ENHANCED_PATH = 3;

	/**
	 * The feature id for the '<em><b>Extrusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION = 4;

	/**
	 * The feature id for the '<em><b>Extrusion Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_ALLOWED = 5;

	/**
	 * The feature id for the '<em><b>Extrusion Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_BRIGHTNESS = 6;

	/**
	 * The feature id for the '<em><b>Extrusion Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_COLOR = 7;

	/**
	 * The feature id for the '<em><b>Extrusion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_DEPTH = 8;

	/**
	 * The feature id for the '<em><b>Extrusion Diffusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_DIFFUSION = 9;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_DIRECTION = 10;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Harsh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_HARSH = 11;

	/**
	 * The feature id for the '<em><b>Extrusion First Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_FIRST_LIGHT_LEVEL = 12;

	/**
	 * The feature id for the '<em><b>Extrusion Light Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_LIGHT_FACE = 13;

	/**
	 * The feature id for the '<em><b>Extrusion Metal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_METAL = 14;

	/**
	 * The feature id for the '<em><b>Extrusion Number Of Line Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_NUMBER_OF_LINE_SEGMENTS = 15;

	/**
	 * The feature id for the '<em><b>Extrusion Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_ORIGIN = 16;

	/**
	 * The feature id for the '<em><b>Extrusion Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_ANGLE = 17;

	/**
	 * The feature id for the '<em><b>Extrusion Rotation Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_ROTATION_CENTER = 18;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_DIRECTION = 19;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Harsh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_HARSH = 20;

	/**
	 * The feature id for the '<em><b>Extrusion Second Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SECOND_LIGHT_LEVEL = 21;

	/**
	 * The feature id for the '<em><b>Extrusion Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SHININESS = 22;

	/**
	 * The feature id for the '<em><b>Extrusion Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SKEW = 23;

	/**
	 * The feature id for the '<em><b>Extrusion Specularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_SPECULARITY = 24;

	/**
	 * The feature id for the '<em><b>Extrusion Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__EXTRUSION_VIEWPOINT = 25;

	/**
	 * The feature id for the '<em><b>Glue Point Leaving Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__GLUE_POINT_LEAVING_DIRECTIONS = 26;

	/**
	 * The feature id for the '<em><b>Glue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__GLUE_POINTS = 27;

	/**
	 * The feature id for the '<em><b>Glue Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__GLUE_POINT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mirror Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__MIRROR_HORIZONTAL = 29;

	/**
	 * The feature id for the '<em><b>Mirror Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__MIRROR_VERTICAL = 30;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__MODIFIERS = 31;

	/**
	 * The feature id for the '<em><b>Path Stretchpoint X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_X = 32;

	/**
	 * The feature id for the '<em><b>Path Stretchpoint Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__PATH_STRETCHPOINT_Y = 33;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__PROJECTION = 34;

	/**
	 * The feature id for the '<em><b>Shade Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__SHADE_MODE = 35;

	/**
	 * The feature id for the '<em><b>Text Areas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_AREAS = 36;

	/**
	 * The feature id for the '<em><b>Text Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_PATH = 37;

	/**
	 * The feature id for the '<em><b>Text Path Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_PATH_ALLOWED = 38;

	/**
	 * The feature id for the '<em><b>Text Path Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_PATH_MODE = 39;

	/**
	 * The feature id for the '<em><b>Text Path Same Letter Heights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SAME_LETTER_HEIGHTS = 40;

	/**
	 * The feature id for the '<em><b>Text Path Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_PATH_SCALE = 41;

	/**
	 * The feature id for the '<em><b>Text Rotate Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TEXT_ROTATE_ANGLE = 42;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__TYPE = 43;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE__VIEW_BOX = 44;

	/**
	 * The number of structural features of the '<em>Enhanced Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_GEOMETRY_TYPE_FEATURE_COUNT = 45;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EquationTypeImpl <em>Equation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.EquationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getEquationType()
	 * @generated
	 */
	int EQUATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_TYPE__FORMULA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Equation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FillImageTypeImpl <em>Fill Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FillImageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageType()
	 * @generated
	 */
	int FILL_IMAGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE__WIDTH = 7;

	/**
	 * The number of structural features of the '<em>Fill Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_IMAGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FloatingFrameTypeImpl <em>Floating Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FloatingFrameTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFloatingFrameType()
	 * @generated
	 */
	int FLOATING_FRAME_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE__FRAME_NAME = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE__SHOW = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Floating Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FRAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FrameTypeImpl <em>Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.FrameTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFrameType()
	 * @generated
	 */
	int FRAME_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Text Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TEXT_BOX = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Object Ole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__OBJECT_OLE = 4;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__APPLET = 5;

	/**
	 * The feature id for the '<em><b>Floating Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__FLOATING_FRAME = 6;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PLUGIN = 7;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__EVENT_LISTENERS = 8;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__GLUE_POINT = 9;

	/**
	 * The feature id for the '<em><b>Image Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__IMAGE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TITLE = 11;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__DESC = 12;

	/**
	 * The feature id for the '<em><b>Contour Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CONTOUR_POLYGON = 13;

	/**
	 * The feature id for the '<em><b>Contour Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CONTOUR_PATH = 14;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ANCHOR_PAGE_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ANCHOR_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CAPTION_ID = 17;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CLASS = 18;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CLASS_NAMES = 19;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CLASS_NAMES1 = 20;

	/**
	 * The feature id for the '<em><b>Copy Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__COPY_OF = 21;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__END_CELL_ADDRESS = 22;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__END_X = 23;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__END_Y = 24;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__HEIGHT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ID = 26;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__LAYER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__NAME = 28;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PLACEHOLDER = 29;

	/**
	 * The feature id for the '<em><b>Rel Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__REL_HEIGHT = 30;

	/**
	 * The feature id for the '<em><b>Rel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__REL_WIDTH = 31;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__STYLE_NAME = 32;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__STYLE_NAME1 = 33;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TABLE_BACKGROUND = 34;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TEXT_STYLE_NAME = 35;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TRANSFORM = 36;

	/**
	 * The feature id for the '<em><b>User Transformed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__USER_TRANSFORMED = 37;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__WIDTH = 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__X = 39;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__Y = 40;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ZINDEX = 41;

	/**
	 * The number of structural features of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_FEATURE_COUNT = 42;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GluePointTypeImpl <em>Glue Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GluePointTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getGluePointType()
	 * @generated
	 */
	int GLUE_POINT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_POINT_TYPE__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_POINT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_POINT_TYPE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_POINT_TYPE__Y = 3;

	/**
	 * The number of structural features of the '<em>Glue Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_POINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl <em>Gradient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getGradientType()
	 * @generated
	 */
	int GRADIENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__BORDER = 1;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__CX = 2;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__CY = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__DISPLAY_NAME = 4;

	/**
	 * The feature id for the '<em><b>End Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__END_COLOR = 5;

	/**
	 * The feature id for the '<em><b>End Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__END_INTENSITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Start Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__START_COLOR = 8;

	/**
	 * The feature id for the '<em><b>Start Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__START_INTENSITY = 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__STYLE = 10;

	/**
	 * The number of structural features of the '<em>Gradient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl <em>GType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getGType()
	 * @generated
	 */
	int GTYPE = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__RECT = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__LINE = 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__POLYLINE = 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__POLYGON = 8;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__REGULAR_POLYGON = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__PATH = 10;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CIRCLE = 11;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__ELLIPSE = 12;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__G = 13;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__PAGE_THUMBNAIL = 14;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__FRAME = 15;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__MEASURE = 16;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CAPTION = 17;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CONNECTOR = 18;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CONTROL = 19;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__SCENE = 20;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CUSTOM_SHAPE = 21;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__ANCHOR_PAGE_NUMBER = 22;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__ANCHOR_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CAPTION_ID = 24;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CLASS_NAMES = 25;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__CLASS_NAMES1 = 26;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__END_CELL_ADDRESS = 27;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__END_X = 28;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__END_Y = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__ID = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__NAME = 31;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__STYLE_NAME = 32;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__STYLE_NAME1 = 33;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__TABLE_BACKGROUND = 34;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__Y = 35;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE__ZINDEX = 36;

	/**
	 * The number of structural features of the '<em>GType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPE_FEATURE_COUNT = 37;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl <em>Handle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getHandleType()
	 * @generated
	 */
	int HANDLE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Handle Mirror Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL = 0;

	/**
	 * The feature id for the '<em><b>Handle Mirror Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_MIRROR_VERTICAL = 1;

	/**
	 * The feature id for the '<em><b>Handle Polar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_POLAR = 2;

	/**
	 * The feature id for the '<em><b>Handle Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Handle Radius Range Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM = 4;

	/**
	 * The feature id for the '<em><b>Handle Radius Range Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM = 5;

	/**
	 * The feature id for the '<em><b>Handle Range XMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM = 6;

	/**
	 * The feature id for the '<em><b>Handle Range XMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RANGE_XMINIMUM = 7;

	/**
	 * The feature id for the '<em><b>Handle Range YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM = 8;

	/**
	 * The feature id for the '<em><b>Handle Range YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_RANGE_YMINIMUM = 9;

	/**
	 * The feature id for the '<em><b>Handle Switched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__HANDLE_SWITCHED = 10;

	/**
	 * The number of structural features of the '<em>Handle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HatchTypeImpl <em>Hatch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HatchTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getHatchType()
	 * @generated
	 */
	int HATCH_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__ROTATION = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE__STYLE = 5;

	/**
	 * The number of structural features of the '<em>Hatch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HATCH_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl <em>Image Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getImageMapType()
	 * @generated
	 */
	int IMAGE_MAP_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Area Rectangle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_TYPE__AREA_RECTANGLE = 1;

	/**
	 * The feature id for the '<em><b>Area Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_TYPE__AREA_CIRCLE = 2;

	/**
	 * The feature id for the '<em><b>Area Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_TYPE__AREA_POLYGON = 3;

	/**
	 * The number of structural features of the '<em>Image Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl <em>Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Binary Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__BINARY_DATA = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__P = 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__LIST = 3;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ACTUATE = 4;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__FILTER_NAME = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__HREF = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LayerSetTypeImpl <em>Layer Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LayerSetTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLayerSetType()
	 * @generated
	 */
	int LAYER_SET_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SET_TYPE__LAYER = 0;

	/**
	 * The number of structural features of the '<em>Layer Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LayerTypeImpl <em>Layer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LayerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLayerType()
	 * @generated
	 */
	int LAYER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__PROTECTED = 4;

	/**
	 * The number of structural features of the '<em>Layer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LineTypeImpl <em>Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.LineTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__END_X = 13;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__END_Y = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ID = 15;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__LAYER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__NAME = 17;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STYLE_NAME = 18;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STYLE_NAME1 = 19;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TABLE_BACKGROUND = 20;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TEXT_STYLE_NAME = 21;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TRANSFORM = 22;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__X1 = 23;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__X2 = 24;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__Y1 = 25;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__Y2 = 26;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ZINDEX = 27;

	/**
	 * The number of structural features of the '<em>Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE_FEATURE_COUNT = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.MarkerTypeImpl <em>Marker Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.MarkerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMarkerType()
	 * @generated
	 */
	int MARKER_TYPE = 29;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_TYPE__D = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_TYPE__VIEW_BOX = 3;

	/**
	 * The number of structural features of the '<em>Marker Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.MeasureTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__END_X = 13;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__END_Y = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ID = 15;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__LAYER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__NAME = 17;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__STYLE_NAME = 18;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__STYLE_NAME1 = 19;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__TABLE_BACKGROUND = 20;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__TEXT_STYLE_NAME = 21;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__TRANSFORM = 22;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__X1 = 23;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__X2 = 24;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__Y1 = 25;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__Y2 = 26;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ZINDEX = 27;

	/**
	 * The number of structural features of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_FEATURE_COUNT = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectOleTypeImpl <em>Object Ole Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectOleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getObjectOleType()
	 * @generated
	 */
	int OBJECT_OLE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Binary Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__BINARY_DATA = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__CLASS_ID = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__SHOW = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Object Ole Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OLE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__MATH = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Notify On Update Of Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.OpacityTypeImpl <em>Opacity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.OpacityTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getOpacityType()
	 * @generated
	 */
	int OPACITY_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__BORDER = 1;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__CX = 2;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__CY = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__DISPLAY_NAME = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__END = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__START = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE__STYLE = 8;

	/**
	 * The number of structural features of the '<em>Opacity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACITY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageThumbnailTypeImpl <em>Page Thumbnail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageThumbnailTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPageThumbnailType()
	 * @generated
	 */
	int PAGE_THUMBNAIL_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__ANCHOR_PAGE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__ANCHOR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__CAPTION_ID = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__CLASS = 5;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__CLASS_NAMES = 6;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__CLASS_NAMES1 = 7;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__END_CELL_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__END_X = 9;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__END_Y = 10;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__HEIGHT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__LAYER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__NAME = 14;

	/**
	 * The feature id for the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__PAGE_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__PLACEHOLDER = 16;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__STYLE_NAME = 17;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__STYLE_NAME1 = 18;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__TABLE_BACKGROUND = 19;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__TRANSFORM = 20;

	/**
	 * The feature id for the '<em><b>User Transformed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__USER_TRANSFORMED = 21;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__WIDTH = 22;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__X = 23;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__Y = 24;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE__ZINDEX = 25;

	/**
	 * The number of structural features of the '<em>Page Thumbnail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_THUMBNAIL_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl <em>Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPageType()
	 * @generated
	 */
	int PAGE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__FORMS = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__RECT = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__POLYLINE = 4;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__POLYGON = 5;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__REGULAR_POLYGON = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__PATH = 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__CIRCLE = 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__ELLIPSE = 9;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__G = 10;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__PAGE_THUMBNAIL = 11;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__FRAME = 12;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__MEASURE = 13;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__CAPTION = 14;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__CONTROL = 16;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__SCENE = 17;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__CUSTOM_SHAPE = 18;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__ANIMATIONS = 19;

	/**
	 * The feature id for the '<em><b>Animation Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__ANIMATION_ELEMENT_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Animation Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__ANIMATION_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__NOTES = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__ID = 23;

	/**
	 * The feature id for the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__MASTER_PAGE_NAME = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__NAME = 25;

	/**
	 * The feature id for the '<em><b>Nav Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__NAV_ORDER = 26;

	/**
	 * The feature id for the '<em><b>Presentation Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME = 27;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__STYLE_NAME = 28;

	/**
	 * The feature id for the '<em><b>Use Date Time Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__USE_DATE_TIME_NAME = 29;

	/**
	 * The feature id for the '<em><b>Use Footer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__USE_FOOTER_NAME = 30;

	/**
	 * The feature id for the '<em><b>Use Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE__USE_HEADER_NAME = 31;

	/**
	 * The number of structural features of the '<em>Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ParamTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 36;

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
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PathTypeImpl <em>Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PathTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__D = 12;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__END_CELL_ADDRESS = 13;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__END_X = 14;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__END_Y = 15;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__HEIGHT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ID = 17;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__LAYER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__STYLE_NAME1 = 21;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__TABLE_BACKGROUND = 22;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__TEXT_STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__TRANSFORM = 24;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__VIEW_BOX = 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__WIDTH = 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__X = 27;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__Y = 28;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ZINDEX = 29;

	/**
	 * The number of structural features of the '<em>Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PluginTypeImpl <em>Plugin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PluginTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPluginType()
	 * @generated
	 */
	int PLUGIN_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__MIME_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__SHOW = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Plugin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PolygonTypeImpl <em>Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PolygonTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPolygonType()
	 * @generated
	 */
	int POLYGON_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__END_X = 13;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__END_Y = 14;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__HEIGHT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ID = 16;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__LAYER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__NAME = 18;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POINTS = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STYLE_NAME1 = 21;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TABLE_BACKGROUND = 22;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TEXT_STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TRANSFORM = 24;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__VIEW_BOX = 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__WIDTH = 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__X = 27;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__Y = 28;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ZINDEX = 29;

	/**
	 * The number of structural features of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PolylineTypeImpl <em>Polyline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PolylineTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPolylineType()
	 * @generated
	 */
	int POLYLINE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__END_X = 13;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__END_Y = 14;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__HEIGHT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ID = 16;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__LAYER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__NAME = 18;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__POINTS = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STYLE_NAME1 = 21;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TABLE_BACKGROUND = 22;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TEXT_STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TRANSFORM = 24;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__VIEW_BOX = 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__WIDTH = 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__X = 27;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__Y = 28;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ZINDEX = 29;

	/**
	 * The number of structural features of the '<em>Polyline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.RectTypeImpl <em>Rect Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.RectTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getRectType()
	 * @generated
	 */
	int RECT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__CORNER_RADIUS = 12;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__END_CELL_ADDRESS = 13;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__END_X = 14;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__END_Y = 15;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__HEIGHT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__ID = 17;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__LAYER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__STYLE_NAME1 = 21;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__TABLE_BACKGROUND = 22;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__TEXT_STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__TRANSFORM = 24;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__WIDTH = 25;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__X = 26;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__Y = 27;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE__ZINDEX = 28;

	/**
	 * The number of structural features of the '<em>Rect Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_TYPE_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.RegularPolygonTypeImpl <em>Regular Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.RegularPolygonTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getRegularPolygonType()
	 * @generated
	 */
	int REGULAR_POLYGON_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Glue Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__GLUE_POINT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__ANCHOR_PAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__ANCHOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__CAPTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>Concave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__CONCAVE = 12;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__CORNERS = 13;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__END_CELL_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__END_X = 15;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__END_Y = 16;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__HEIGHT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__ID = 18;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__LAYER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Sharpness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__SHARPNESS = 21;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__STYLE_NAME = 22;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__STYLE_NAME1 = 23;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__TABLE_BACKGROUND = 24;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__TEXT_STYLE_NAME = 25;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__TRANSFORM = 26;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__WIDTH = 27;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__X = 28;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__Y = 29;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE__ZINDEX = 30;

	/**
	 * The number of structural features of the '<em>Regular Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_POLYGON_TYPE_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl <em>Stroke Dash Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeDashType1()
	 * @generated
	 */
	int STROKE_DASH_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Dots1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DOTS1 = 2;

	/**
	 * The feature id for the '<em><b>Dots1 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DOTS1_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Dots2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DOTS2 = 4;

	/**
	 * The feature id for the '<em><b>Dots2 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__DOTS2_LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__NAME = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1__STYLE = 7;

	/**
	 * The number of structural features of the '<em>Stroke Dash Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_TYPE1_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl <em>Text Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextBoxType()
	 * @generated
	 */
	int TEXT_BOX_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__TEXT_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__H = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__P = 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__LIST = 3;

	/**
	 * The feature id for the '<em><b>Numbered Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__NUMBERED_PARAGRAPH = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__TABLE = 5;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__A = 6;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__SECTION = 7;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__SOFT_PAGE_BREAK = 8;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__TABLE_OF_CONTENT = 9;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__ILLUSTRATION_INDEX = 10;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__TABLE_INDEX = 11;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__OBJECT_INDEX = 12;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__USER_INDEX = 13;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__ALPHABETICAL_INDEX = 14;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__BIBLIOGRAPHY = 15;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__RECT = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__LINE = 17;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__POLYLINE = 18;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__POLYGON = 19;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__REGULAR_POLYGON = 20;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__PATH = 21;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CIRCLE = 22;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__ELLIPSE = 23;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__G = 24;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__PAGE_THUMBNAIL = 25;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__FRAME = 26;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__MEASURE = 27;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CAPTION = 28;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CONNECTOR = 29;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CONTROL = 30;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__SCENE = 31;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CUSTOM_SHAPE = 32;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CHANGE_MARKS_GROUP = 33;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CHANGE_MARKS = 34;

	/**
	 * The feature id for the '<em><b>Chain Next Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CHAIN_NEXT_NAME = 35;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__CORNER_RADIUS = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__ID = 37;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__MAX_HEIGHT = 38;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__MAX_WIDTH = 39;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__MIN_HEIGHT = 40;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE__MIN_WIDTH = 41;

	/**
	 * The number of structural features of the '<em>Text Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_TYPE_FEATURE_COUNT = 42;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType <em>Background Size Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getBackgroundSizeType()
	 * @generated
	 */
	int BACKGROUND_SIZE_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType <em>Caption Angle Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionAngleTypeType()
	 * @generated
	 */
	int CAPTION_ANGLE_TYPE_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType <em>Caption Escape Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionEscapeDirectionType()
	 * @generated
	 */
	int CAPTION_ESCAPE_DIRECTION_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType <em>Caption Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionTypeType()
	 * @generated
	 */
	int CAPTION_TYPE_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType <em>Color Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getColorModeType()
	 * @generated
	 */
	int COLOR_MODE_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType <em>Concave Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getConcaveType()
	 * @generated
	 */
	int CONCAVE_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType <em>Display Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getDisplayType()
	 * @generated
	 */
	int DISPLAY_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType <em>Escape Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getEscapeDirectionType()
	 * @generated
	 */
	int ESCAPE_DIRECTION_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType <em>Fill Image Ref Point Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageRefPointType()
	 * @generated
	 */
	int FILL_IMAGE_REF_POINT_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType <em>Fill Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillType()
	 * @generated
	 */
	int FILL_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType <em>Glue Point Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getGluePointTypeType()
	 * @generated
	 */
	int GLUE_POINT_TYPE_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType <em>Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getKindType()
	 * @generated
	 */
	int KIND_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType <em>Measure Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMeasureAlignType()
	 * @generated
	 */
	int MEASURE_ALIGN_TYPE = 58;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType <em>Measure Vertical Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMeasureVerticalAlignType()
	 * @generated
	 */
	int MEASURE_VERTICAL_ALIGN_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType <em>Nohref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getNohrefType()
	 * @generated
	 */
	int NOHREF_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType <em>Placing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPlacingType()
	 * @generated
	 */
	int PLACING_TYPE = 61;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType <em>Shadow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getShadowType()
	 * @generated
	 */
	int SHADOW_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType <em>Stroke Linejoin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeLinejoinType()
	 * @generated
	 */
	int STROKE_LINEJOIN_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType <em>Stroke Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeType()
	 * @generated
	 */
	int STROKE_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType <em>Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1 <em>Style Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleType1()
	 * @generated
	 */
	int STYLE_TYPE1 = 66;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType <em>Textarea Horizontal Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextareaHorizontalAlignType()
	 * @generated
	 */
	int TEXTAREA_HORIZONTAL_ALIGN_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType <em>Textarea Vertical Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextareaVerticalAlignType()
	 * @generated
	 */
	int TEXTAREA_VERTICAL_ALIGN_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType <em>Text Path Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextPathModeType()
	 * @generated
	 */
	int TEXT_PATH_MODE_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType <em>Text Path Scale Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextPathScaleType()
	 * @generated
	 */
	int TEXT_PATH_SCALE_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType <em>Wrap Influence On Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getWrapInfluenceOnPositionType()
	 * @generated
	 */
	int WRAP_INFLUENCE_ON_POSITION_TYPE = 73;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Background Size Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getBackgroundSizeTypeObject()
	 * @generated
	 */
	int BACKGROUND_SIZE_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Caption Angle Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionAngleTypeTypeObject()
	 * @generated
	 */
	int CAPTION_ANGLE_TYPE_TYPE_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Caption Escape Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionEscapeDirectionTypeObject()
	 * @generated
	 */
	int CAPTION_ESCAPE_DIRECTION_TYPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Caption Escape Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionEscapeType()
	 * @generated
	 */
	int CAPTION_ESCAPE_TYPE = 78;

	/**
	 * The meta object id for the '<em>Caption Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getCaptionTypeTypeObject()
	 * @generated
	 */
	int CAPTION_TYPE_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Color Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getColorModeTypeObject()
	 * @generated
	 */
	int COLOR_MODE_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Concave Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getConcaveTypeObject()
	 * @generated
	 */
	int CONCAVE_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Display Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getDisplayTypeObject()
	 * @generated
	 */
	int DISPLAY_TYPE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Escape Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getEscapeDirectionTypeObject()
	 * @generated
	 */
	int ESCAPE_DIRECTION_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Extrusion Depth Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionDepthType()
	 * @generated
	 */
	int EXTRUSION_DEPTH_TYPE = 84;

	/**
	 * The meta object id for the '<em>Extrusion Depth Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionDepthTypeBase()
	 * @generated
	 */
	int EXTRUSION_DEPTH_TYPE_BASE = 85;

	/**
	 * The meta object id for the '<em>Extrusion Depth Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionDepthTypeBaseItem()
	 * @generated
	 */
	int EXTRUSION_DEPTH_TYPE_BASE_ITEM = 86;

	/**
	 * The meta object id for the '<em>Extrusion Origin Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionOriginType()
	 * @generated
	 */
	int EXTRUSION_ORIGIN_TYPE = 87;

	/**
	 * The meta object id for the '<em>Extrusion Origin Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionOriginTypeBase()
	 * @generated
	 */
	int EXTRUSION_ORIGIN_TYPE_BASE = 88;

	/**
	 * The meta object id for the '<em>Extrusion Origin Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionOriginTypeBaseItem()
	 * @generated
	 */
	int EXTRUSION_ORIGIN_TYPE_BASE_ITEM = 89;

	/**
	 * The meta object id for the '<em>Extrusion Origin Type Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionOriginTypeBaseItemObject()
	 * @generated
	 */
	int EXTRUSION_ORIGIN_TYPE_BASE_ITEM_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Extrusion Rotation Angle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionRotationAngleType()
	 * @generated
	 */
	int EXTRUSION_ROTATION_ANGLE_TYPE = 91;

	/**
	 * The meta object id for the '<em>Extrusion Rotation Angle Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionRotationAngleTypeBase()
	 * @generated
	 */
	int EXTRUSION_ROTATION_ANGLE_TYPE_BASE = 92;

	/**
	 * The meta object id for the '<em>Extrusion Rotation Angle Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionRotationAngleTypeBaseItem()
	 * @generated
	 */
	int EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM = 93;

	/**
	 * The meta object id for the '<em>Extrusion Rotation Angle Type Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionRotationAngleTypeBaseItemObject()
	 * @generated
	 */
	int EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Extrusion Skew Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionSkewType()
	 * @generated
	 */
	int EXTRUSION_SKEW_TYPE = 95;

	/**
	 * The meta object id for the '<em>Extrusion Skew Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionSkewTypeBase()
	 * @generated
	 */
	int EXTRUSION_SKEW_TYPE_BASE = 96;

	/**
	 * The meta object id for the '<em>Extrusion Skew Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionSkewTypeBaseItem()
	 * @generated
	 */
	int EXTRUSION_SKEW_TYPE_BASE_ITEM = 97;

	/**
	 * The meta object id for the '<em>Extrusion Skew Type Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getExtrusionSkewTypeBaseItemObject()
	 * @generated
	 */
	int EXTRUSION_SKEW_TYPE_BASE_ITEM_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Fill Gradient Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillGradientNameType()
	 * @generated
	 */
	int FILL_GRADIENT_NAME_TYPE = 99;

	/**
	 * The meta object id for the '<em>Fill Gradient Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillGradientNameTypeMember1()
	 * @generated
	 */
	int FILL_GRADIENT_NAME_TYPE_MEMBER1 = 100;

	/**
	 * The meta object id for the '<em>Fill Hatch Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillHatchNameType()
	 * @generated
	 */
	int FILL_HATCH_NAME_TYPE = 101;

	/**
	 * The meta object id for the '<em>Fill Hatch Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillHatchNameTypeMember1()
	 * @generated
	 */
	int FILL_HATCH_NAME_TYPE_MEMBER1 = 102;

	/**
	 * The meta object id for the '<em>Fill Image Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageHeightType()
	 * @generated
	 */
	int FILL_IMAGE_HEIGHT_TYPE = 103;

	/**
	 * The meta object id for the '<em>Fill Image Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageNameType()
	 * @generated
	 */
	int FILL_IMAGE_NAME_TYPE = 104;

	/**
	 * The meta object id for the '<em>Fill Image Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageNameTypeMember1()
	 * @generated
	 */
	int FILL_IMAGE_NAME_TYPE_MEMBER1 = 105;

	/**
	 * The meta object id for the '<em>Fill Image Ref Point Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageRefPointTypeObject()
	 * @generated
	 */
	int FILL_IMAGE_REF_POINT_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Fill Image Width Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillImageWidthType()
	 * @generated
	 */
	int FILL_IMAGE_WIDTH_TYPE = 107;

	/**
	 * The meta object id for the '<em>Fill Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getFillTypeObject()
	 * @generated
	 */
	int FILL_TYPE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Glue Point Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getGluePointTypeTypeObject()
	 * @generated
	 */
	int GLUE_POINT_TYPE_TYPE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getKindTypeObject()
	 * @generated
	 */
	int KIND_TYPE_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Line Skew Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLineSkewType()
	 * @generated
	 */
	int LINE_SKEW_TYPE = 111;

	/**
	 * The meta object id for the '<em>Line Skew Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLineSkewTypeBase()
	 * @generated
	 */
	int LINE_SKEW_TYPE_BASE = 112;

	/**
	 * The meta object id for the '<em>Line Skew Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLineSkewTypeBaseItem()
	 * @generated
	 */
	int LINE_SKEW_TYPE_BASE_ITEM = 113;

	/**
	 * The meta object id for the '<em>Line Skew Type Base Item Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getLineSkewTypeBaseItemMember1()
	 * @generated
	 */
	int LINE_SKEW_TYPE_BASE_ITEM_MEMBER1 = 114;

	/**
	 * The meta object id for the '<em>Marker End Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMarkerEndType()
	 * @generated
	 */
	int MARKER_END_TYPE = 115;

	/**
	 * The meta object id for the '<em>Marker End Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMarkerEndTypeMember1()
	 * @generated
	 */
	int MARKER_END_TYPE_MEMBER1 = 116;

	/**
	 * The meta object id for the '<em>Marker Start Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMarkerStartType()
	 * @generated
	 */
	int MARKER_START_TYPE = 117;

	/**
	 * The meta object id for the '<em>Marker Start Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMarkerStartTypeMember1()
	 * @generated
	 */
	int MARKER_START_TYPE_MEMBER1 = 118;

	/**
	 * The meta object id for the '<em>Master Page Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMasterPageNameType()
	 * @generated
	 */
	int MASTER_PAGE_NAME_TYPE = 119;

	/**
	 * The meta object id for the '<em>Master Page Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMasterPageNameTypeMember1()
	 * @generated
	 */
	int MASTER_PAGE_NAME_TYPE_MEMBER1 = 120;

	/**
	 * The meta object id for the '<em>Measure Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMeasureAlignTypeObject()
	 * @generated
	 */
	int MEASURE_ALIGN_TYPE_OBJECT = 121;

	/**
	 * The meta object id for the '<em>Measure Vertical Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getMeasureVerticalAlignTypeObject()
	 * @generated
	 */
	int MEASURE_VERTICAL_ALIGN_TYPE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Nohref Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getNohrefTypeObject()
	 * @generated
	 */
	int NOHREF_TYPE_OBJECT = 123;

	/**
	 * The meta object id for the '<em>Opacity Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getOpacityNameType()
	 * @generated
	 */
	int OPACITY_NAME_TYPE = 124;

	/**
	 * The meta object id for the '<em>Opacity Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getOpacityNameTypeMember1()
	 * @generated
	 */
	int OPACITY_NAME_TYPE_MEMBER1 = 125;

	/**
	 * The meta object id for the '<em>Placing Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getPlacingTypeObject()
	 * @generated
	 */
	int PLACING_TYPE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Shadow Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getShadowTypeObject()
	 * @generated
	 */
	int SHADOW_TYPE_OBJECT = 127;

	/**
	 * The meta object id for the '<em>Stroke Dash Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeDashType()
	 * @generated
	 */
	int STROKE_DASH_TYPE = 128;

	/**
	 * The meta object id for the '<em>Stroke Dash Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeDashTypeMember1()
	 * @generated
	 */
	int STROKE_DASH_TYPE_MEMBER1 = 129;

	/**
	 * The meta object id for the '<em>Stroke Linejoin Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeLinejoinTypeObject()
	 * @generated
	 */
	int STROKE_LINEJOIN_TYPE_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Stroke Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStrokeTypeObject()
	 * @generated
	 */
	int STROKE_TYPE_OBJECT = 131;

	/**
	 * The meta object id for the '<em>Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleNameType()
	 * @generated
	 */
	int STYLE_NAME_TYPE = 132;

	/**
	 * The meta object id for the '<em>Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleNameTypeMember1()
	 * @generated
	 */
	int STYLE_NAME_TYPE_MEMBER1 = 133;

	/**
	 * The meta object id for the '<em>Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleTypeObject()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Style Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getStyleTypeObject1()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT1 = 135;

	/**
	 * The meta object id for the '<em>Textarea Horizontal Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextareaHorizontalAlignTypeObject()
	 * @generated
	 */
	int TEXTAREA_HORIZONTAL_ALIGN_TYPE_OBJECT = 136;

	/**
	 * The meta object id for the '<em>Textarea Vertical Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextareaVerticalAlignTypeObject()
	 * @generated
	 */
	int TEXTAREA_VERTICAL_ALIGN_TYPE_OBJECT = 137;

	/**
	 * The meta object id for the '<em>Text Path Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextPathModeTypeObject()
	 * @generated
	 */
	int TEXT_PATH_MODE_TYPE_OBJECT = 138;

	/**
	 * The meta object id for the '<em>Text Path Scale Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextPathScaleTypeObject()
	 * @generated
	 */
	int TEXT_PATH_SCALE_TYPE_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Text Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextStyleNameType()
	 * @generated
	 */
	int TEXT_STYLE_NAME_TYPE = 140;

	/**
	 * The meta object id for the '<em>Text Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTextStyleNameTypeMember1()
	 * @generated
	 */
	int TEXT_STYLE_NAME_TYPE_MEMBER1 = 141;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Wrap Influence On Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl#getWrapInfluenceOnPositionTypeObject()
	 * @generated
	 */
	int WRAP_INFLUENCE_ON_POSITION_TYPE_OBJECT = 144;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType <em>Applet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applet Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType
	 * @generated
	 */
	EClass getAppletType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getParam()
	 * @see #getAppletType()
	 * @generated
	 */
	EReference getAppletType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getArchive()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Archive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getCode()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getHref()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript <em>May Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Script</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_MayScript();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getObject()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType()
	 * @see #getAppletType()
	 * @generated
	 */
	EAttribute getAppletType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType <em>Area Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Circle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType
	 * @generated
	 */
	EClass getAreaCircleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getTitle()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getDesc()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getEventListeners()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EReference getAreaCircleType_EventListeners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getCx()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getCy()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getHref()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getName()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getNohref <em>Nohref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nohref</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getNohref()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Nohref();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getR()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_R();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getShow()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getTargetFrameName()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_TargetFrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType#getType()
	 * @see #getAreaCircleType()
	 * @generated
	 */
	EAttribute getAreaCircleType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType <em>Area Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Polygon Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType
	 * @generated
	 */
	EClass getAreaPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getTitle()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getDesc()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getEventListeners()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EReference getAreaPolygonType_EventListeners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getHeight()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getHref()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getName()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getNohref <em>Nohref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nohref</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getNohref()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Nohref();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getPoints()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getShow()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getTargetFrameName()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_TargetFrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getType()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getViewBox()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getWidth()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getX()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType#getY()
	 * @see #getAreaPolygonType()
	 * @generated
	 */
	EAttribute getAreaPolygonType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType <em>Area Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Rectangle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType
	 * @generated
	 */
	EClass getAreaRectangleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getTitle()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getDesc()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getEventListeners()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EReference getAreaRectangleType_EventListeners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getHeight()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getHref()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getName()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getNohref <em>Nohref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nohref</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getNohref()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Nohref();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getShow()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getTargetFrameName()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_TargetFrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getType()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getWidth()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getX()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType#getY()
	 * @see #getAreaRectangleType()
	 * @generated
	 */
	EAttribute getAreaRectangleType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AType</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType
	 * @generated
	 */
	EClass getAType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getFrame()
	 * @see #getAType()
	 * @generated
	 */
	EReference getAType_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getActuate()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getHref()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getName()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getServerMap <em>Server Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getServerMap()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_ServerMap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getShow()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getTargetFrameName()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_TargetFrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getTitle()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType#getType()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType
	 * @generated
	 */
	EClass getCaptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTitle()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getDesc()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEventListeners()
	 * @see #getCaptionType()
	 * @generated
	 */
	EReference getCaptionType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getGluePoint()
	 * @see #getCaptionType()
	 * @generated
	 */
	EReference getCaptionType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getGroup()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getP()
	 * @see #getCaptionType()
	 * @generated
	 */
	EReference getCaptionType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getList()
	 * @see #getCaptionType()
	 * @generated
	 */
	EReference getCaptionType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getAnchorPageNumber()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getAnchorType()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionId()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionPointX <em>Caption Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionPointX()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_CaptionPointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionPointY <em>Caption Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCaptionPointY()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_CaptionPointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getClassNames()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getClassNames1()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCornerRadius <em>Corner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getCornerRadius()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_CornerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndCellAddress()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndX()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getEndY()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getHeight()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getId()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getLayer()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getName()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getStyleName()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getStyleName1()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTableBackground()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTextStyleName()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getTransform()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getWidth()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getX()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getY()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType#getZIndex()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType <em>Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType
	 * @generated
	 */
	EClass getCircleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTitle()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getDesc()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEventListeners()
	 * @see #getCircleType()
	 * @generated
	 */
	EReference getCircleType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getGluePoint()
	 * @see #getCircleType()
	 * @generated
	 */
	EReference getCircleType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getGroup()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getP()
	 * @see #getCircleType()
	 * @generated
	 */
	EReference getCircleType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getList()
	 * @see #getCircleType()
	 * @generated
	 */
	EReference getCircleType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getAnchorPageNumber()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getAnchorType()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCaptionId()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getClassNames()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getClassNames1()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCx()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getCy()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndAngle <em>End Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndAngle()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_EndAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndCellAddress()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndX()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getEndY()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getHeight()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getId()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getKind()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getLayer()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getName()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getR()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_R();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStartAngle <em>Start Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStartAngle()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_StartAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStyleName()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getStyleName1()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTableBackground()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTextStyleName()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getTransform()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getWidth()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getX()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getY()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType#getZIndex()
	 * @see #getCircleType()
	 * @generated
	 */
	EAttribute getCircleType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTitle()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getDesc()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEventListeners()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getGluePoint()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getGroup()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getP()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getList()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getAnchorPageNumber()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getAnchorType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getCaptionId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getClassNames()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getClassNames1()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndCellAddress()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndGluePoint <em>End Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndGluePoint()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_EndGluePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndShape <em>End Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndShape()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_EndShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndX()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getEndY()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getLayer()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getLineSkew <em>Line Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Skew</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getLineSkew()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_LineSkew();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStartGluePoint <em>Start Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStartGluePoint()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_StartGluePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStartShape <em>Start Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStartShape()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_StartShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStyleName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getStyleName1()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTableBackground()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTextStyleName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getTransform()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getX1()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getX2()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getY1()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getY2()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Y2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType#getZIndex()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType <em>Contour Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contour Path Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType
	 * @generated
	 */
	EClass getContourPathType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getD()
	 * @see #getContourPathType()
	 * @generated
	 */
	EAttribute getContourPathType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getHeight()
	 * @see #getContourPathType()
	 * @generated
	 */
	EAttribute getContourPathType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getRecreateOnEdit <em>Recreate On Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recreate On Edit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getRecreateOnEdit()
	 * @see #getContourPathType()
	 * @generated
	 */
	EAttribute getContourPathType_RecreateOnEdit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getViewBox()
	 * @see #getContourPathType()
	 * @generated
	 */
	EAttribute getContourPathType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType#getWidth()
	 * @see #getContourPathType()
	 * @generated
	 */
	EAttribute getContourPathType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType <em>Contour Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contour Polygon Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType
	 * @generated
	 */
	EClass getContourPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getHeight()
	 * @see #getContourPolygonType()
	 * @generated
	 */
	EAttribute getContourPolygonType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getPoints()
	 * @see #getContourPolygonType()
	 * @generated
	 */
	EAttribute getContourPolygonType_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getRecreateOnEdit <em>Recreate On Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recreate On Edit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getRecreateOnEdit()
	 * @see #getContourPolygonType()
	 * @generated
	 */
	EAttribute getContourPolygonType_RecreateOnEdit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getViewBox()
	 * @see #getContourPolygonType()
	 * @generated
	 */
	EAttribute getContourPolygonType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType#getWidth()
	 * @see #getContourPolygonType()
	 * @generated
	 */
	EAttribute getContourPolygonType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType
	 * @generated
	 */
	EClass getControlType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTitle()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getDesc()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getGluePoint()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_GluePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getAnchorPageNumber()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getAnchorType()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getCaptionId()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getClassNames()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getClassNames1()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getControl()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Control();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndCellAddress()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndX()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getEndY()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getHeight()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getId()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getLayer()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getName()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getStyleName()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getStyleName1()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTableBackground()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTextStyleName()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getTransform()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getWidth()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getX()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getY()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType#getZIndex()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType <em>Custom Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Shape Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType
	 * @generated
	 */
	EClass getCustomShapeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTitle()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getDesc()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEventListeners()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EReference getCustomShapeType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getGluePoint()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EReference getCustomShapeType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getGroup()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getP()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EReference getCustomShapeType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getList()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EReference getCustomShapeType_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEnhancedGeometry <em>Enhanced Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enhanced Geometry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEnhancedGeometry()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EReference getCustomShapeType_EnhancedGeometry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getAnchorPageNumber()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getAnchorType()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getCaptionId()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getClassNames()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getClassNames1()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getData()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndCellAddress()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndX()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEndY()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getEngine()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Engine();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getHeight()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getId()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getLayer()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getName()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getStyleName()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getStyleName1()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTableBackground()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTextStyleName()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getTransform()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getWidth()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getX()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getY()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType#getZIndex()
	 * @see #getCustomShapeType()
	 * @generated
	 */
	EAttribute getCustomShapeType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_A();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applet</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getApplet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Applet();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaCircle <em>Area Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaCircle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AreaCircle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaPolygon <em>Area Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AreaPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaRectangle <em>Area Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area Rectangle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaRectangle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AreaRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCircle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Circle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPath <em>Contour Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contour Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContourPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPolygon <em>Contour Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contour Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContourPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Control();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCustomShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEllipse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ellipse();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedGeometry <em>Enhanced Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enhanced Geometry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedGeometry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnhancedGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEquation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Equation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImage <em>Fill Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FillImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFloatingFrame <em>Floating Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFloatingFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FloatingFrame();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getG()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_G();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GluePoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradient()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Gradient();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Handle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHatch <em>Hatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hatch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHatch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageMap <em>Image Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImageMap();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Layer();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayerSet <em>Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer Set</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayerSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LayerSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarker()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Marker();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Measure();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObjectOle <em>Object Ole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ole</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObjectOle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectOle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Opacity();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Page();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageThumbnail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Param();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlugin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plugin();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolyline()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polyline();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rect();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRegularPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash <em>Stroke Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke Dash</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StrokeDash();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getArchive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Archive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight <em>Auto Grow Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Grow Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoGrowHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth <em>Auto Grow Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Grow Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoGrowWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize <em>Background Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackgroundSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBlue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Blue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBorder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngle <em>Caption Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType <em>Caption Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Angle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionAngleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscape <em>Caption Escape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Escape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionEscape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection <em>Caption Escape Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Escape Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionEscapeDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength <em>Caption Fit Line Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Fit Line Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionFitLineLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionGap <em>Caption Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Gap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionGap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionGap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionLineLength <em>Caption Line Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Line Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionLineLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionLineLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointX <em>Caption Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionPointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointY <em>Caption Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionPointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CaptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getChainNextName <em>Chain Next Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain Next Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getChainNextName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ChainNextName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassNames()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion <em>Color Inversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Inversion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColorInversion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColorMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave <em>Concave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concave</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Concave();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concentric Gradient Fill Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConcentricGradientFillAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContrast <em>Contrast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrast</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContrast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Contrast();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl1 <em>Control1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Control1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCopyOf <em>Copy Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Of</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCopyOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CopyOf();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCornerRadius <em>Corner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCornerRadius()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CornerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCorners()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Corners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCx()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDecimalPlaces()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1 <em>Dots1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dots1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1Length <em>Dots1 Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots1 Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1Length()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dots1Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2 <em>Dots2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dots2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2Length <em>Dots2 Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots2 Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2Length()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dots2Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle <em>End Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndColor <em>End Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGluePoint <em>End Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGluePoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndGluePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGuide <em>End Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Guide</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGuide()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndGuide();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndIntensity <em>End Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Intensity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndIntensity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndIntensity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingHorizontal <em>End Line Spacing Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line Spacing Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingHorizontal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndLineSpacingHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingVertical <em>End Line Spacing Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line Spacing Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndLineSpacingVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndShape <em>End Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEngine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Engine();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedPath <em>Enhanced Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enhanced Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EnhancedPath();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection <em>Escape Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EscapeDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion <em>Extrusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Extrusion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed <em>Extrusion Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionBrightness <em>Extrusion Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Brightness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionBrightness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionBrightness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor <em>Extrusion Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDepth <em>Extrusion Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Depth</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDepth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDiffusion <em>Extrusion Diffusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Diffusion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDiffusion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionDiffusion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionFirstLightDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Harsh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionFirstLightHarsh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionFirstLightLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace <em>Extrusion Light Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Light Face</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionLightFace();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal <em>Extrusion Metal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Metal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionMetal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Number Of Line Segments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionNumberOfLineSegments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionNumberOfLineSegments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionOrigin <em>Extrusion Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Origin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionOrigin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Rotation Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionRotationAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Rotation Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationCenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionRotationCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionSecondLightDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Harsh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionSecondLightHarsh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionSecondLightLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionShininess <em>Extrusion Shininess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Shininess</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionShininess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionShininess();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSkew <em>Extrusion Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Skew</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSkew()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionSkew();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSpecularity <em>Extrusion Specularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Specularity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSpecularity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionSpecularity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Viewpoint</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionViewpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExtrusionViewpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillGradientName <em>Fill Gradient Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Gradient Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillGradientName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillGradientName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchName <em>Fill Hatch Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Hatch Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillHatchName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid <em>Fill Hatch Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Hatch Solid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillHatchSolid();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageHeight <em>Fill Image Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageName <em>Fill Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint <em>Fill Image Ref Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Ref Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageRefPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointX <em>Fill Image Ref Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Ref Point X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageRefPointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointY <em>Fill Image Ref Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Ref Point Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageRefPointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageWidth <em>Fill Image Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Image Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillImageWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFilterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour <em>Fit To Contour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit To Contour</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FitToContour();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize <em>Fit To Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit To Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FitToSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFormula()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder <em>Frame Display Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Display Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FrameDisplayBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Display Scrollbar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FrameDisplayScrollbar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginHorizontal <em>Frame Margin Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Margin Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginHorizontal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FrameMarginHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginVertical <em>Frame Margin Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Margin Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FrameMarginVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameName <em>Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gamma</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGamma()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Gamma();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Point Leaving Directions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointLeavingDirections()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GluePointLeavingDirections();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoints <em>Glue Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GluePoints();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType <em>Glue Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Point Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GluePointType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradientStepCount <em>Gradient Step Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Step Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradientStepCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GradientStepCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGreen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideDistance <em>Guide Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guide Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GuideDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideOverhang <em>Guide Overhang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guide Overhang</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideOverhang()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GuideOverhang();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Mirror Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleMirrorHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Mirror Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleMirrorVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePolar <em>Handle Polar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Polar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePolar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandlePolar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePosition <em>Handle Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandlePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Radius Range Maximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMaximum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRadiusRangeMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Radius Range Minimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMinimum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRadiusRangeMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range XMaximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMaximum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRangeXMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range XMinimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMinimum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRangeXMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range YMaximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMaximum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRangeYMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range YMinimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMinimum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleRangeYMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched <em>Handle Switched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Switched</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HandleSwitched();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageOpacity <em>Image Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageOpacity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer1 <em>Layer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Layer1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineDistance <em>Line Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineSkew <em>Line Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Skew</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineSkew()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineSkew();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLuminance <em>Luminance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLuminance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Luminance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter <em>Marker End Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerEndCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndWidth <em>Marker End Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerEndWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStart <em>Marker Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerStart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter <em>Marker Start Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerStartCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartWidth <em>Marker Start Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkerStartWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMasterPageName <em>Master Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Page Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMasterPageName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MasterPageName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript <em>May Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Script</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MayScript();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign <em>Measure Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MeasureAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign <em>Measure Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Vertical Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MeasureVerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMimeType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal <em>Mirror Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MirrorHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical <em>Mirror Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MirrorVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifiers</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getModifiers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNavOrder <em>Nav Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nav Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNavOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NavOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref <em>Nohref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nohref</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Nohref();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notify On Update Of Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNotifyOnUpdateOfRanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NotifyOnUpdateOfRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject1 <em>Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Object1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOleDrawAspect <em>Ole Draw Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ole Draw Aspect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOleDrawAspect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OleDrawAspect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity1 <em>Opacity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Opacity1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacityName <em>Opacity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacityName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OpacityName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageNumber <em>Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Parallel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX <em>Path Stretchpoint X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Stretchpoint X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PathStretchpointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY <em>Path Stretchpoint Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Stretchpoint Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PathStretchpointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing <em>Placing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Placing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPoints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Protected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit <em>Recreate On Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recreate On Edit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RecreateOnEdit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSecondaryFillColor <em>Secondary Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Fill Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSecondaryFillColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SecondaryFillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow <em>Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Shadow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetX <em>Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetY <em>Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOpacity <em>Shadow Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOpacity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadowOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShapeId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSharpness <em>Sharpness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharpness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSharpness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Sharpness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit <em>Show Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Unit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle <em>Start Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartColor <em>Start Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGluePoint <em>Start Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGluePoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartGluePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGuide <em>Start Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Guide</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGuide()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartGuide();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartIntensity <em>Start Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Intensity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartIntensity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartIntensity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingHorizontal <em>Start Line Spacing Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line Spacing Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingHorizontal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartLineSpacingHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingVertical <em>Start Line Spacing Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line Spacing Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartLineSpacingVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartShape <em>Start Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash1 <em>Stroke Dash1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dash1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeDash1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDashNames <em>Stroke Dash Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dash Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDashNames()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeDashNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSymbolColor <em>Symbol Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSymbolColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SymbolColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textarea Horizontal Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextareaHorizontalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextAreas <em>Text Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Areas</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextAreas()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextAreas();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textarea Vertical Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextareaVerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath <em>Text Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPath();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed <em>Text Path Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPathAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode <em>Text Path Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPathMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Same Letter Heights</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPathSameLetterHeights();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale <em>Text Path Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPathScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle <em>Text Rotate Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Rotate Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextRotateAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTileRepeatOffset <em>Tile Repeat Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Repeat Offset</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTileRepeatOffset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TileRepeatOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaHeight <em>Visible Area Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Area Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VisibleAreaHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaLeft <em>Visible Area Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Area Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VisibleAreaLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaTop <em>Visible Area Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Area Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VisibleAreaTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaWidth <em>Visible Area Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Area Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VisibleAreaWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Influence On Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WrapInfluenceOnPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getZIndex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType <em>Ellipse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType
	 * @generated
	 */
	EClass getEllipseType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTitle()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getDesc()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEventListeners()
	 * @see #getEllipseType()
	 * @generated
	 */
	EReference getEllipseType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGluePoint()
	 * @see #getEllipseType()
	 * @generated
	 */
	EReference getEllipseType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGroup()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getP()
	 * @see #getEllipseType()
	 * @generated
	 */
	EReference getEllipseType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getList()
	 * @see #getEllipseType()
	 * @generated
	 */
	EReference getEllipseType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorPageNumber()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCaptionId()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames1()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCx()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCy()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle <em>End Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_EndAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndCellAddress()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndX()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndY()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getHeight()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getId()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getLayer()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getName()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRx()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRy()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle <em>Start Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_StartAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName1()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTextStyleName()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTransform()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getWidth()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getX()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getY()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getZIndex()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType <em>Enhanced Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enhanced Geometry Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType
	 * @generated
	 */
	EClass getEnhancedGeometryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEquation()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EReference getEnhancedGeometryType_Equation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getHandle()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EReference getEnhancedGeometryType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concentric Gradient Fill Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ConcentricGradientFillAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEnhancedPath <em>Enhanced Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enhanced Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEnhancedPath()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_EnhancedPath();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion <em>Extrusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_Extrusion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed <em>Extrusion Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness <em>Extrusion Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Brightness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionBrightness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor <em>Extrusion Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth <em>Extrusion Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Depth</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion <em>Extrusion Diffusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Diffusion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionDiffusion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionFirstLightDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Harsh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionFirstLightHarsh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion First Light Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionFirstLightLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace <em>Extrusion Light Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Light Face</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionLightFace();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal <em>Extrusion Metal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Metal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionMetal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Number Of Line Segments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionNumberOfLineSegments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin <em>Extrusion Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Origin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionOrigin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Rotation Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionRotationAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Rotation Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationCenter()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionRotationCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionSecondLightDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Harsh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionSecondLightHarsh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Second Light Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionSecondLightLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess <em>Extrusion Shininess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Shininess</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionShininess();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew <em>Extrusion Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Skew</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionSkew();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity <em>Extrusion Specularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Specularity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionSpecularity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrusion Viewpoint</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ExtrusionViewpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Point Leaving Directions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointLeavingDirections()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_GluePointLeavingDirections();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePoints <em>Glue Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePoints()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_GluePoints();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType <em>Glue Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Point Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_GluePointType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal <em>Mirror Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_MirrorHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical <em>Mirror Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_MirrorVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifiers</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getModifiers()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX <em>Path Stretchpoint X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Stretchpoint X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_PathStretchpointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY <em>Path Stretchpoint Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Stretchpoint Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_PathStretchpointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_Projection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode <em>Shade Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shade Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ShadeMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextAreas <em>Text Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Areas</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextAreas()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextAreas();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath <em>Text Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextPath();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed <em>Text Path Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Allowed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextPathAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode <em>Text Path Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextPathMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Same Letter Heights</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextPathSameLetterHeights();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale <em>Text Path Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Path Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextPathScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle <em>Text Rotate Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Rotate Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_TextRotateAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getType()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getViewBox()
	 * @see #getEnhancedGeometryType()
	 * @generated
	 */
	EAttribute getEnhancedGeometryType_ViewBox();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType <em>Equation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType
	 * @generated
	 */
	EClass getEquationType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType#getFormula()
	 * @see #getEquationType()
	 * @generated
	 */
	EAttribute getEquationType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType#getName()
	 * @see #getEquationType()
	 * @generated
	 */
	EAttribute getEquationType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType <em>Fill Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Image Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType
	 * @generated
	 */
	EClass getFillImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getActuate()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getDisplayName()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getHeight()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getHref()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getName()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getShow()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getType()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType#getWidth()
	 * @see #getFillImageType()
	 * @generated
	 */
	EAttribute getFillImageType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType <em>Floating Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Frame Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType
	 * @generated
	 */
	EClass getFloatingFrameType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getActuate()
	 * @see #getFloatingFrameType()
	 * @generated
	 */
	EAttribute getFloatingFrameType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getFrameName <em>Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getFrameName()
	 * @see #getFloatingFrameType()
	 * @generated
	 */
	EAttribute getFloatingFrameType_FrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getHref()
	 * @see #getFloatingFrameType()
	 * @generated
	 */
	EAttribute getFloatingFrameType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getShow()
	 * @see #getFloatingFrameType()
	 * @generated
	 */
	EAttribute getFloatingFrameType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType#getType()
	 * @see #getFloatingFrameType()
	 * @generated
	 */
	EAttribute getFloatingFrameType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType
	 * @generated
	 */
	EClass getFrameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getGroup()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTextBox()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_TextBox();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getImage()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getObject()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getObjectOle <em>Object Ole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ole</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getObjectOle()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_ObjectOle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applet</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getApplet()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Applet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getFloatingFrame <em>Floating Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floating Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getFloatingFrame()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_FloatingFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getPlugin()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Plugin();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEventListeners()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getGluePoint()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_GluePoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getImageMap <em>Image Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getImageMap()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_ImageMap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTitle()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getDesc()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getContourPolygon <em>Contour Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contour Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getContourPolygon()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_ContourPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getContourPath <em>Contour Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contour Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getContourPath()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_ContourPath();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getAnchorPageNumber()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getAnchorType()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getCaptionId()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClass_()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClassNames()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getClassNames1()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getCopyOf <em>Copy Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Of</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getCopyOf()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_CopyOf();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndCellAddress()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndX()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getEndY()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getHeight()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getId()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getLayer()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getName()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getPlaceholder()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getRelHeight <em>Rel Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getRelHeight()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_RelHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getRelWidth <em>Rel Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getRelWidth()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_RelWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getStyleName()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getStyleName1()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTableBackground()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTextStyleName()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getTransform()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getUserTransformed <em>User Transformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Transformed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getUserTransformed()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_UserTransformed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getWidth()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getX()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getY()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType#getZIndex()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType <em>Glue Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Point Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType
	 * @generated
	 */
	EClass getGluePointType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getAlign()
	 * @see #getGluePointType()
	 * @generated
	 */
	EAttribute getGluePointType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getId()
	 * @see #getGluePointType()
	 * @generated
	 */
	EAttribute getGluePointType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getX()
	 * @see #getGluePointType()
	 * @generated
	 */
	EAttribute getGluePointType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType#getY()
	 * @see #getGluePointType()
	 * @generated
	 */
	EAttribute getGluePointType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType
	 * @generated
	 */
	EClass getGradientType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getAngle()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getBorder()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getCx()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getCy()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getDisplayName()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getEndColor <em>End Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getEndColor()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_EndColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getEndIntensity <em>End Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Intensity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getEndIntensity()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_EndIntensity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getName()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStartColor <em>Start Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStartColor()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_StartColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStartIntensity <em>Start Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Intensity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStartIntensity()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_StartIntensity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType#getStyle()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType <em>GType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GType</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType
	 * @generated
	 */
	EClass getGType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTitle()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getDesc()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEventListeners()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getGluePoint()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getShape()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRect()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getLine()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolyline()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolygon()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRegularPolygon()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPath()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCircle()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEllipse()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getG()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPageThumbnail()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getFrame()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getMeasure()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaption()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getConnector()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getControl()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getScene()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCustomShape()
	 * @see #getGType()
	 * @generated
	 */
	EReference getGType_CustomShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorPageNumber()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaptionId()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames1()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndCellAddress()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndX()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndY()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getId()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getName()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName1()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getY()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getZIndex()
	 * @see #getGType()
	 * @generated
	 */
	EAttribute getGType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType
	 * @generated
	 */
	EClass getHandleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Mirror Horizontal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleMirrorHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Mirror Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleMirrorVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePolar <em>Handle Polar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Polar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePolar()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandlePolar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePosition <em>Handle Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePosition()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandlePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Radius Range Maximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMaximum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRadiusRangeMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Radius Range Minimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMinimum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRadiusRangeMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range XMaximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMaximum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRangeXMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range XMinimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMinimum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRangeXMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range YMaximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMaximum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRangeYMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Range YMinimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMinimum()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleRangeYMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched <em>Handle Switched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Switched</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_HandleSwitched();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType <em>Hatch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hatch Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType
	 * @generated
	 */
	EClass getHatchType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getColor()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getDisplayName()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getDistance()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getName()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getRotation()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType#getStyle()
	 * @see #getHatchType()
	 * @generated
	 */
	EAttribute getHatchType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType <em>Image Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Map Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType
	 * @generated
	 */
	EClass getImageMapType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getGroup()
	 * @see #getImageMapType()
	 * @generated
	 */
	EAttribute getImageMapType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaRectangle <em>Area Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Rectangle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaRectangle()
	 * @see #getImageMapType()
	 * @generated
	 */
	EReference getImageMapType_AreaRectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaCircle <em>Area Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaCircle()
	 * @see #getImageMapType()
	 * @generated
	 */
	EReference getImageMapType_AreaCircle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaPolygon <em>Area Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaPolygon()
	 * @see #getImageMapType()
	 * @generated
	 */
	EReference getImageMapType_AreaPolygon();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType
	 * @generated
	 */
	EClass getImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getBinaryData <em>Binary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getBinaryData()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_BinaryData();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getGroup()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getP()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getList()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getFilterName()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getHref()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType <em>Layer Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Set Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType
	 * @generated
	 */
	EClass getLayerSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType#getLayer()
	 * @see #getLayerSetType()
	 * @generated
	 */
	EReference getLayerSetType_Layer();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType <em>Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType
	 * @generated
	 */
	EClass getLayerType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getTitle()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getDesc()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getDisplay()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getName()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType#getProtected()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Protected();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType
	 * @generated
	 */
	EClass getLineType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTitle()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getDesc()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEventListeners()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getGluePoint()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getGroup()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getP()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getList()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getAnchorPageNumber()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getAnchorType()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getCaptionId()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getClassNames()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getClassNames1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndCellAddress()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndX()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getEndY()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getId()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getLayer()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getName()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getStyleName()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getStyleName1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTableBackground()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTextStyleName()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getTransform()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getX1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getX2()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getY1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getY2()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Y2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType#getZIndex()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType
	 * @generated
	 */
	EClass getMarkerType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getD()
	 * @see #getMarkerType()
	 * @generated
	 */
	EAttribute getMarkerType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getDisplayName()
	 * @see #getMarkerType()
	 * @generated
	 */
	EAttribute getMarkerType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getName()
	 * @see #getMarkerType()
	 * @generated
	 */
	EAttribute getMarkerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType#getViewBox()
	 * @see #getMarkerType()
	 * @generated
	 */
	EAttribute getMarkerType_ViewBox();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType
	 * @generated
	 */
	EClass getMeasureType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTitle()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getDesc()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEventListeners()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getGluePoint()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getGroup()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getP()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getList()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getAnchorPageNumber()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getAnchorType()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getCaptionId()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getClassNames()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getClassNames1()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndCellAddress()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndX()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getEndY()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getId()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getLayer()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getName()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getStyleName()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getStyleName1()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTableBackground()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTextStyleName()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getTransform()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getX1()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getX2()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getY1()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getY2()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Y2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType#getZIndex()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType <em>Object Ole Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ole Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType
	 * @generated
	 */
	EClass getObjectOleType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getBinaryData <em>Binary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getBinaryData()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_BinaryData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getActuate()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getClassId()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_ClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getHref()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getShow()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType#getType()
	 * @see #getObjectOleType()
	 * @generated
	 */
	EAttribute getObjectOleType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getDocument()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Document();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Math</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getMath()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Math();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getActuate()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getHref()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notify On Update Of Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getNotifyOnUpdateOfRanges()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_NotifyOnUpdateOfRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getShow()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType#getType()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType <em>Opacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opacity Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType
	 * @generated
	 */
	EClass getOpacityType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getAngle()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getBorder()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getCx()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getCy()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getDisplayName()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getEnd()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getName()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getStart()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType#getStyle()
	 * @see #getOpacityType()
	 * @generated
	 */
	EAttribute getOpacityType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType <em>Page Thumbnail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Thumbnail Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType
	 * @generated
	 */
	EClass getPageThumbnailType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTitle()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getDesc()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getAnchorPageNumber()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getAnchorType()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getCaptionId()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClass_()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClassNames()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getClassNames1()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndCellAddress()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndX()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getEndY()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getHeight()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getId()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getLayer()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getName()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getPageNumber <em>Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getPageNumber()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_PageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getPlaceholder()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getStyleName()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getStyleName1()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTableBackground()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getTransform()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getUserTransformed <em>User Transformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Transformed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getUserTransformed()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_UserTransformed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getWidth()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getX()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getY()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType#getZIndex()
	 * @see #getPageThumbnailType()
	 * @generated
	 */
	EAttribute getPageThumbnailType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType
	 * @generated
	 */
	EClass getPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getForms()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Forms();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getShape()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getRect()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getLine()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPolyline()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPolygon()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getRegularPolygon()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPath()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCircle()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getEllipse()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getG()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPageThumbnail()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getFrame()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getMeasure()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCaption()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getConnector()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getControl()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getScene()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getCustomShape()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_CustomShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimations()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Animations();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimationElementGroup <em>Animation Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Animation Element Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimationElementGroup()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_AnimationElementGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimationElement <em>Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animation Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getAnimationElement()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_AnimationElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getNotes()
	 * @see #getPageType()
	 * @generated
	 */
	EReference getPageType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getId()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getMasterPageName <em>Master Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Page Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getMasterPageName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_MasterPageName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getNavOrder <em>Nav Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nav Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getNavOrder()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_NavOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getPresentationPageLayoutName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_PresentationPageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getStyleName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseDateTimeName <em>Use Date Time Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Date Time Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseDateTimeName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_UseDateTimeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseFooterName <em>Use Footer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Footer Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseFooterName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_UseFooterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseHeaderName <em>Use Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Header Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType#getUseHeaderName()
	 * @see #getPageType()
	 * @generated
	 */
	EAttribute getPageType_UseHeaderName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType#getValue()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType
	 * @generated
	 */
	EClass getPathType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTitle()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getDesc()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEventListeners()
	 * @see #getPathType()
	 * @generated
	 */
	EReference getPathType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getGluePoint()
	 * @see #getPathType()
	 * @generated
	 */
	EReference getPathType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getGroup()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getP()
	 * @see #getPathType()
	 * @generated
	 */
	EReference getPathType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getList()
	 * @see #getPathType()
	 * @generated
	 */
	EReference getPathType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getAnchorPageNumber()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getAnchorType()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getCaptionId()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getClassNames()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getClassNames1()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getD()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndCellAddress()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndX()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getEndY()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getHeight()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getId()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getLayer()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getName()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getStyleName()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getStyleName1()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTableBackground()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTextStyleName()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getTransform()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getViewBox()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getWidth()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getX()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getY()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType#getZIndex()
	 * @see #getPathType()
	 * @generated
	 */
	EAttribute getPathType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType <em>Plugin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType
	 * @generated
	 */
	EClass getPluginType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getParam()
	 * @see #getPluginType()
	 * @generated
	 */
	EReference getPluginType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getActuate()
	 * @see #getPluginType()
	 * @generated
	 */
	EAttribute getPluginType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getHref()
	 * @see #getPluginType()
	 * @generated
	 */
	EAttribute getPluginType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getMimeType()
	 * @see #getPluginType()
	 * @generated
	 */
	EAttribute getPluginType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getShow()
	 * @see #getPluginType()
	 * @generated
	 */
	EAttribute getPluginType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType#getType()
	 * @see #getPluginType()
	 * @generated
	 */
	EAttribute getPluginType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType
	 * @generated
	 */
	EClass getPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTitle()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getDesc()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEventListeners()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getGluePoint()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getP()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getList()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getAnchorPageNumber()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getAnchorType()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getCaptionId()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getClassNames()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getClassNames1()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndCellAddress()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndX()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getEndY()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getHeight()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getId()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getLayer()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getName()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getPoints()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getStyleName()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getStyleName1()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTableBackground()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTextStyleName()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getTransform()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getViewBox()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getWidth()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getX()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getY()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType#getZIndex()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType <em>Polyline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType
	 * @generated
	 */
	EClass getPolylineType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTitle()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getDesc()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEventListeners()
	 * @see #getPolylineType()
	 * @generated
	 */
	EReference getPolylineType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getGluePoint()
	 * @see #getPolylineType()
	 * @generated
	 */
	EReference getPolylineType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getGroup()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getP()
	 * @see #getPolylineType()
	 * @generated
	 */
	EReference getPolylineType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getList()
	 * @see #getPolylineType()
	 * @generated
	 */
	EReference getPolylineType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getAnchorPageNumber()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getAnchorType()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getCaptionId()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getClassNames()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getClassNames1()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndCellAddress()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndX()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getEndY()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getHeight()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getId()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getLayer()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getName()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getPoints()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getStyleName()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getStyleName1()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTableBackground()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTextStyleName()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getTransform()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getViewBox()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getWidth()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getX()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getY()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType#getZIndex()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType <em>Rect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType
	 * @generated
	 */
	EClass getRectType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTitle()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getDesc()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEventListeners()
	 * @see #getRectType()
	 * @generated
	 */
	EReference getRectType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getGluePoint()
	 * @see #getRectType()
	 * @generated
	 */
	EReference getRectType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getGroup()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getP()
	 * @see #getRectType()
	 * @generated
	 */
	EReference getRectType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getList()
	 * @see #getRectType()
	 * @generated
	 */
	EReference getRectType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getAnchorPageNumber()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getAnchorType()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getCaptionId()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getClassNames()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getClassNames1()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getCornerRadius <em>Corner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getCornerRadius()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_CornerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndCellAddress()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndX()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getEndY()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getHeight()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getId()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getLayer()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getName()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getStyleName()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getStyleName1()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTableBackground()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTextStyleName()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getTransform()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getWidth()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getX()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getY()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType#getZIndex()
	 * @see #getRectType()
	 * @generated
	 */
	EAttribute getRectType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType <em>Regular Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Polygon Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType
	 * @generated
	 */
	EClass getRegularPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTitle()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getDesc()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEventListeners()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EReference getRegularPolygonType_EventListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getGluePoint <em>Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getGluePoint()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EReference getRegularPolygonType_GluePoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getGroup()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getP()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EReference getRegularPolygonType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getList()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EReference getRegularPolygonType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getAnchorPageNumber()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getAnchorType()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getCaptionId()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getClassNames()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getClassNames1()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getConcave <em>Concave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concave</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getConcave()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Concave();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getCorners()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Corners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndCellAddress()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndX()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getEndY()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getHeight()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getId()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getLayer()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getName()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getSharpness <em>Sharpness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharpness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getSharpness()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Sharpness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getStyleName()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getStyleName1()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTableBackground()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTextStyleName()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getTransform()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getWidth()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getX()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getY()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType#getZIndex()
	 * @see #getRegularPolygonType()
	 * @generated
	 */
	EAttribute getRegularPolygonType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1 <em>Stroke Dash Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke Dash Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1
	 * @generated
	 */
	EClass getStrokeDashType1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDisplayName()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDistance()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots1 <em>Dots1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots1()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Dots1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots1Length <em>Dots1 Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots1 Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots1Length()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Dots1Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots2 <em>Dots2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots2()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Dots2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots2Length <em>Dots2 Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dots2 Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getDots2Length()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Dots2Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getName()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1#getStyle()
	 * @see #getStrokeDashType1()
	 * @generated
	 */
	EAttribute getStrokeDashType1_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType <em>Text Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType
	 * @generated
	 */
	EClass getTextBoxType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTextContent()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_TextContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getH()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_H();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getP()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getList()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getNumberedParagraph <em>Numbered Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Numbered Paragraph</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getNumberedParagraph()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_NumberedParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTable()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getA()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getSection()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Section();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getSoftPageBreak()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTableOfContent <em>Table Of Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Of Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTableOfContent()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_TableOfContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getIllustrationIndex <em>Illustration Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illustration Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getIllustrationIndex()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_IllustrationIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTableIndex <em>Table Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getTableIndex()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_TableIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getObjectIndex <em>Object Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getObjectIndex()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_ObjectIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getUserIndex <em>User Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getUserIndex()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_UserIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getAlphabeticalIndex <em>Alphabetical Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alphabetical Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getAlphabeticalIndex()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_AlphabeticalIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bibliography</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getBibliography()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Bibliography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getRect()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getLine()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPolyline()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPolygon()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getRegularPolygon()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPath()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCircle()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getEllipse()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getG()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getPageThumbnail()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getFrame()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMeasure()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCaption()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getConnector()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getControl()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getScene()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCustomShape()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_CustomShape();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChangeMarksGroup <em>Change Marks Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Change Marks Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChangeMarksGroup()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_ChangeMarksGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChangeMarks <em>Change Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Marks</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChangeMarks()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EReference getTextBoxType_ChangeMarks();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChainNextName <em>Chain Next Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain Next Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getChainNextName()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_ChainNextName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCornerRadius <em>Corner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getCornerRadius()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_CornerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getId()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMaxHeight()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMaxWidth()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMinHeight()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType#getMinWidth()
	 * @see #getTextBoxType()
	 * @generated
	 */
	EAttribute getTextBoxType_MinWidth();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType <em>Background Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Background Size Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @generated
	 */
	EEnum getBackgroundSizeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType <em>Caption Angle Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Caption Angle Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @generated
	 */
	EEnum getCaptionAngleTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType <em>Caption Escape Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Caption Escape Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @generated
	 */
	EEnum getCaptionEscapeDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType <em>Caption Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Caption Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @generated
	 */
	EEnum getCaptionTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType <em>Color Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @generated
	 */
	EEnum getColorModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType <em>Concave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concave Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @generated
	 */
	EEnum getConcaveType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType <em>Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @generated
	 */
	EEnum getDisplayType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType <em>Escape Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Escape Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @generated
	 */
	EEnum getEscapeDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType <em>Fill Image Ref Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Image Ref Point Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @generated
	 */
	EEnum getFillImageRefPointType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType <em>Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @generated
	 */
	EEnum getFillType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType <em>Glue Point Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Glue Point Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @generated
	 */
	EEnum getGluePointTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType <em>Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @generated
	 */
	EEnum getKindType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType <em>Measure Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @generated
	 */
	EEnum getMeasureAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType <em>Measure Vertical Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Vertical Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @generated
	 */
	EEnum getMeasureVerticalAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType <em>Nohref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nohref Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @generated
	 */
	EEnum getNohrefType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType <em>Placing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placing Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @generated
	 */
	EEnum getPlacingType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType <em>Shadow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shadow Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @generated
	 */
	EEnum getShadowType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType <em>Stroke Linejoin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stroke Linejoin Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @generated
	 */
	EEnum getStrokeLinejoinType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType <em>Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stroke Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @generated
	 */
	EEnum getStrokeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType
	 * @generated
	 */
	EEnum getStyleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1 <em>Style Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1
	 * @generated
	 */
	EEnum getStyleType1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType <em>Textarea Horizontal Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Textarea Horizontal Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @generated
	 */
	EEnum getTextareaHorizontalAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType <em>Textarea Vertical Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Textarea Vertical Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @generated
	 */
	EEnum getTextareaVerticalAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType <em>Text Path Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Path Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @generated
	 */
	EEnum getTextPathModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType <em>Text Path Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Path Scale Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @generated
	 */
	EEnum getTextPathScaleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType <em>Wrap Influence On Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Influence On Position Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @generated
	 */
	EEnum getWrapInfluenceOnPositionType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType <em>Background Size Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Background Size Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType"
	 *        extendedMetaData="name='background-size_._type:Object' baseType='background-size_._type'"
	 * @generated
	 */
	EDataType getBackgroundSizeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType <em>Caption Angle Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Caption Angle Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType"
	 *        extendedMetaData="name='caption-angle-type_._type:Object' baseType='caption-angle-type_._type'"
	 * @generated
	 */
	EDataType getCaptionAngleTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType <em>Caption Escape Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Caption Escape Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType"
	 *        extendedMetaData="name='caption-escape-direction_._type:Object' baseType='caption-escape-direction_._type'"
	 * @generated
	 */
	EDataType getCaptionEscapeDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Caption Escape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Caption Escape Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='caption-escape_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getCaptionEscapeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType <em>Caption Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Caption Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType"
	 *        extendedMetaData="name='caption-type_._type:Object' baseType='caption-type_._type'"
	 * @generated
	 */
	EDataType getCaptionTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType <em>Color Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType"
	 *        extendedMetaData="name='color-mode_._type:Object' baseType='color-mode_._type'"
	 * @generated
	 */
	EDataType getColorModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType <em>Concave Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Concave Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType"
	 *        extendedMetaData="name='concave_._type:Object' baseType='concave_._type'"
	 * @generated
	 */
	EDataType getConcaveTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType <em>Display Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType"
	 *        extendedMetaData="name='display_._type:Object' baseType='display_._type'"
	 * @generated
	 */
	EDataType getDisplayTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType <em>Escape Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Escape Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType"
	 *        extendedMetaData="name='escape-direction_._type:Object' baseType='escape-direction_._type'"
	 * @generated
	 */
	EDataType getEscapeDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Depth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Depth Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-depth_._type' length='2'"
	 * @generated
	 */
	EDataType getExtrusionDepthType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Depth Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Depth Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-depth_._type_._base' itemType='extrusion-depth_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionDepthTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Extrusion Depth Type Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Depth Type Base Item</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='extrusion-depth_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#double'"
	 * @generated
	 */
	EDataType getExtrusionDepthTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Origin Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-origin_._type' length='2'"
	 * @generated
	 */
	EDataType getExtrusionOriginType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Origin Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Origin Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-origin_._type_._base' itemType='extrusion-origin_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionOriginTypeBase();

	/**
	 * Returns the meta object for data type '<em>Extrusion Origin Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Origin Type Base Item</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='extrusion-origin_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double'"
	 * @generated
	 */
	EDataType getExtrusionOriginTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Extrusion Origin Type Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Origin Type Base Item Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='extrusion-origin_._type_._base_._item:Object' baseType='extrusion-origin_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionOriginTypeBaseItemObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Rotation Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Rotation Angle Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-rotation-angle_._type' length='2'"
	 * @generated
	 */
	EDataType getExtrusionRotationAngleType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Rotation Angle Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Rotation Angle Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-rotation-angle_._type_._base' itemType='extrusion-rotation-angle_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionRotationAngleTypeBase();

	/**
	 * Returns the meta object for data type '<em>Extrusion Rotation Angle Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Rotation Angle Type Base Item</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='extrusion-rotation-angle_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double'"
	 * @generated
	 */
	EDataType getExtrusionRotationAngleTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Extrusion Rotation Angle Type Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Rotation Angle Type Base Item Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='extrusion-rotation-angle_._type_._base_._item:Object' baseType='extrusion-rotation-angle_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionRotationAngleTypeBaseItemObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Skew Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Skew Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-skew_._type' length='2'"
	 * @generated
	 */
	EDataType getExtrusionSkewType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Extrusion Skew Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Skew Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='extrusion-skew_._type_._base' itemType='extrusion-skew_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionSkewTypeBase();

	/**
	 * Returns the meta object for data type '<em>Extrusion Skew Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Skew Type Base Item</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='extrusion-skew_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double'"
	 * @generated
	 */
	EDataType getExtrusionSkewTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Extrusion Skew Type Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Extrusion Skew Type Base Item Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='extrusion-skew_._type_._base_._item:Object' baseType='extrusion-skew_._type_._base_._item'"
	 * @generated
	 */
	EDataType getExtrusionSkewTypeBaseItemObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Gradient Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Gradient Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-gradient-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef fill-gradient-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFillGradientNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Gradient Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Gradient Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-gradient-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getFillGradientNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Hatch Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Hatch Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-hatch-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef fill-hatch-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFillHatchNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Hatch Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Hatch Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-hatch-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getFillHatchNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Image Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Image Height Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-image-height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFillImageHeightType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Image Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Image Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-image-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef fill-image-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFillImageNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Image Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Image Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-image-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getFillImageNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType <em>Fill Image Ref Point Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Image Ref Point Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType"
	 *        extendedMetaData="name='fill-image-ref-point_._type:Object' baseType='fill-image-ref-point_._type'"
	 * @generated
	 */
	EDataType getFillImageRefPointTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fill Image Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Image Width Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fill-image-width_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFillImageWidthType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType <em>Fill Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType"
	 *        extendedMetaData="name='fill_._type:Object' baseType='fill_._type'"
	 * @generated
	 */
	EDataType getFillTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType <em>Glue Point Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Glue Point Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType"
	 *        extendedMetaData="name='glue-point-type_._type:Object' baseType='glue-point-type_._type'"
	 * @generated
	 */
	EDataType getGluePointTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType <em>Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType"
	 *        extendedMetaData="name='kind_._type:Object' baseType='kind_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Line Skew Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Skew Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='line-skew_._type' minLength='1' maxLength='3'"
	 * @generated
	 */
	EDataType getLineSkewType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Line Skew Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Skew Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='line-skew_._type_._base' itemType='line-skew_._type_._base_._item'"
	 * @generated
	 */
	EDataType getLineSkewTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Line Skew Type Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Skew Type Base Item</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='line-skew_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length line-skew_._type_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getLineSkewTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Line Skew Type Base Item Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Skew Type Base Item Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='line-skew_._type_._base_._item_._member_._1' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length'"
	 * @generated
	 */
	EDataType getLineSkewTypeBaseItemMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Marker End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Marker End Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='marker-end_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef marker-end_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMarkerEndType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Marker End Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Marker End Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='marker-end_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getMarkerEndTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Marker Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Marker Start Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='marker-start_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef marker-start_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMarkerStartType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Marker Start Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Marker Start Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='marker-start_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getMarkerStartTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Master Page Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Master Page Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='master-page-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef master-page-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMasterPageNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Master Page Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Master Page Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='master-page-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getMasterPageNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType <em>Measure Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measure Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType"
	 *        extendedMetaData="name='measure-align_._type:Object' baseType='measure-align_._type'"
	 * @generated
	 */
	EDataType getMeasureAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType <em>Measure Vertical Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measure Vertical Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType"
	 *        extendedMetaData="name='measure-vertical-align_._type:Object' baseType='measure-vertical-align_._type'"
	 * @generated
	 */
	EDataType getMeasureVerticalAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType <em>Nohref Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nohref Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType"
	 *        extendedMetaData="name='nohref_._type:Object' baseType='nohref_._type'"
	 * @generated
	 */
	EDataType getNohrefTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Opacity Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='opacity-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef opacity-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getOpacityNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Opacity Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='opacity-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getOpacityNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType <em>Placing Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Placing Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType"
	 *        extendedMetaData="name='placing_._type:Object' baseType='placing_._type'"
	 * @generated
	 */
	EDataType getPlacingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType <em>Shadow Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shadow Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType"
	 *        extendedMetaData="name='shadow_._type:Object' baseType='shadow_._type'"
	 * @generated
	 */
	EDataType getShadowTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stroke Dash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Dash Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='stroke-dash_._1_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef stroke-dash_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStrokeDashType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stroke Dash Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Dash Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='stroke-dash_._1_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getStrokeDashTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType <em>Stroke Linejoin Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Linejoin Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType"
	 *        extendedMetaData="name='stroke-linejoin_._type:Object' baseType='stroke-linejoin_._type'"
	 * @generated
	 */
	EDataType getStrokeLinejoinTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType <em>Stroke Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType"
	 *        extendedMetaData="name='stroke_._type:Object' baseType='stroke_._type'"
	 * @generated
	 */
	EDataType getStrokeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType <em>Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType"
	 *        extendedMetaData="name='style_._type:Object' baseType='style_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1 <em>Style Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Type Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1"
	 *        extendedMetaData="name='style_._1_._type:Object' baseType='style_._1_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType <em>Textarea Horizontal Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Textarea Horizontal Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType"
	 *        extendedMetaData="name='textarea-horizontal-align_._type:Object' baseType='textarea-horizontal-align_._type'"
	 * @generated
	 */
	EDataType getTextareaHorizontalAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType <em>Textarea Vertical Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Textarea Vertical Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType"
	 *        extendedMetaData="name='textarea-vertical-align_._type:Object' baseType='textarea-vertical-align_._type'"
	 * @generated
	 */
	EDataType getTextareaVerticalAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType <em>Text Path Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Path Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType"
	 *        extendedMetaData="name='text-path-mode_._type:Object' baseType='text-path-mode_._type'"
	 * @generated
	 */
	EDataType getTextPathModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType <em>Text Path Scale Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Path Scale Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType"
	 *        extendedMetaData="name='text-path-scale_._type:Object' baseType='text-path-scale_._type'"
	 * @generated
	 */
	EDataType getTextPathScaleTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef text-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getTextStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType"
	 *        extendedMetaData="name='unit_._type:Object' baseType='unit_._type'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType <em>Wrap Influence On Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Influence On Position Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType"
	 *        extendedMetaData="name='wrap-influence-on-position_._type:Object' baseType='wrap-influence-on-position_._type'"
	 * @generated
	 */
	EDataType getWrapInfluenceOnPositionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DrawingFactory getDrawingFactory();

} //DrawingPackage
