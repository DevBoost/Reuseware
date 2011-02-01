/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dFactory
 * @model kind="package"
 * @generated
 */
public interface Dr3dPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dr3d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dr3d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dr3dPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.CubeTypeImpl <em>Cube Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.CubeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getCubeType()
	 * @generated
	 */
	int CUBE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__CLASS_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__CLASS_NAMES1 = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__LAYER = 3;

	/**
	 * The feature id for the '<em><b>Max Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__MAX_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Min Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__MIN_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__STYLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__STYLE_NAME1 = 7;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__TRANSFORM = 8;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE__ZINDEX = 9;

	/**
	 * The number of structural features of the '<em>Cube Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.ExtrudeTypeImpl <em>Extrude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.ExtrudeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getExtrudeType()
	 * @generated
	 */
	int EXTRUDE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__CLASS_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__CLASS_NAMES1 = 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__D = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__LAYER = 4;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__STYLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__STYLE_NAME1 = 6;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__TRANSFORM = 7;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__VIEW_BOX = 8;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE__ZINDEX = 9;

	/**
	 * The number of structural features of the '<em>Extrude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUDE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl <em>Light Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getLightType()
	 * @generated
	 */
	int LIGHT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__DIFFUSE_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__SPECULAR = 3;

	/**
	 * The number of structural features of the '<em>Light Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.RotateTypeImpl <em>Rotate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.RotateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getRotateType()
	 * @generated
	 */
	int ROTATE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__CLASS_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__CLASS_NAMES1 = 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__D = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__LAYER = 4;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__STYLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__STYLE_NAME1 = 6;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__TRANSFORM = 7;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__VIEW_BOX = 8;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE__ZINDEX = 9;

	/**
	 * The number of structural features of the '<em>Rotate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl <em>Scene Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getSceneType()
	 * @generated
	 */
	int SCENE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__LIGHT = 2;

	/**
	 * The feature id for the '<em><b>Shapes3d Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__SHAPES3D_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Shapes3d</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__SHAPES3D = 4;

	/**
	 * The feature id for the '<em><b>Ambient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__AMBIENT_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__ANCHOR_PAGE_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__ANCHOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__CAPTION_ID = 8;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__CLASS_NAMES = 9;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__CLASS_NAMES1 = 10;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__DISTANCE = 11;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__END_CELL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__END_X = 13;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__END_Y = 14;

	/**
	 * The feature id for the '<em><b>Focal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__FOCAL_LENGTH = 15;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__HEIGHT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__ID = 17;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__LAYER = 18;

	/**
	 * The feature id for the '<em><b>Lighting Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__LIGHTING_MODE = 19;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__PROJECTION = 20;

	/**
	 * The feature id for the '<em><b>Shade Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__SHADE_MODE = 21;

	/**
	 * The feature id for the '<em><b>Shadow Slant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__SHADOW_SLANT = 22;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__STYLE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__STYLE_NAME1 = 24;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__TABLE_BACKGROUND = 25;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__TRANSFORM = 26;

	/**
	 * The feature id for the '<em><b>Vpn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__VPN = 27;

	/**
	 * The feature id for the '<em><b>Vrp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__VRP = 28;

	/**
	 * The feature id for the '<em><b>Vup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__VUP = 29;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__WIDTH = 30;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__X = 31;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__Y = 32;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__ZINDEX = 33;

	/**
	 * The number of structural features of the '<em>Scene Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE_FEATURE_COUNT = 34;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Cube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUBE = 3;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUDE = 4;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT = 5;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATE = 6;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCENE = 7;

	/**
	 * The feature id for the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPHERE = 8;

	/**
	 * The feature id for the '<em><b>Ambient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AMBIENT_COLOR = 9;

	/**
	 * The feature id for the '<em><b>Backface Culling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKFACE_CULLING = 10;

	/**
	 * The feature id for the '<em><b>Back Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACK_SCALE = 11;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CENTER = 12;

	/**
	 * The feature id for the '<em><b>Close Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOSE_BACK = 13;

	/**
	 * The feature id for the '<em><b>Close Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOSE_FRONT = 14;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPTH = 15;

	/**
	 * The feature id for the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIFFUSE_COLOR = 16;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTION = 17;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE = 18;

	/**
	 * The feature id for the '<em><b>Edge Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDGE_ROUNDING = 19;

	/**
	 * The feature id for the '<em><b>Edge Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDGE_ROUNDING_MODE = 20;

	/**
	 * The feature id for the '<em><b>Emissive Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMISSIVE_COLOR = 21;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENABLED = 22;

	/**
	 * The feature id for the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_ANGLE = 23;

	/**
	 * The feature id for the '<em><b>Focal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOCAL_LENGTH = 24;

	/**
	 * The feature id for the '<em><b>Horizontal Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HORIZONTAL_SEGMENTS = 25;

	/**
	 * The feature id for the '<em><b>Max Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_EDGE = 26;

	/**
	 * The feature id for the '<em><b>Min Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_EDGE = 27;

	/**
	 * The feature id for the '<em><b>Normals Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NORMALS_DIRECTION = 28;

	/**
	 * The feature id for the '<em><b>Normals Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NORMALS_KIND = 29;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECTION = 30;

	/**
	 * The feature id for the '<em><b>Shade Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADE_MODE = 31;

	/**
	 * The feature id for the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW = 32;

	/**
	 * The feature id for the '<em><b>Shadow Slant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW_SLANT = 33;

	/**
	 * The feature id for the '<em><b>Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHININESS = 34;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIZE = 35;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECULAR = 36;

	/**
	 * The feature id for the '<em><b>Specular Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECULAR_COLOR = 37;

	/**
	 * The feature id for the '<em><b>Texture Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_FILTER = 38;

	/**
	 * The feature id for the '<em><b>Texture Generation Mode X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X = 39;

	/**
	 * The feature id for the '<em><b>Texture Generation Mode Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y = 40;

	/**
	 * The feature id for the '<em><b>Texture Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_KIND = 41;

	/**
	 * The feature id for the '<em><b>Texture Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_MODE = 42;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM = 43;

	/**
	 * The feature id for the '<em><b>Vertical Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERTICAL_SEGMENTS = 44;

	/**
	 * The feature id for the '<em><b>Vpn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VPN = 45;

	/**
	 * The feature id for the '<em><b>Vrp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VRP = 46;

	/**
	 * The feature id for the '<em><b>Vup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VUP = 47;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 48;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SphereTypeImpl <em>Sphere Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SphereTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getSphereType()
	 * @generated
	 */
	int SPHERE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__CENTER = 0;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__CLASS_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__CLASS_NAMES1 = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__LAYER = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__SIZE = 5;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__STYLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__STYLE_NAME1 = 7;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__TRANSFORM = 8;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE__ZINDEX = 9;

	/**
	 * The number of structural features of the '<em>Sphere Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType <em>Backface Culling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getBackfaceCullingType()
	 * @generated
	 */
	int BACKFACE_CULLING_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType <em>Edge Rounding Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getEdgeRoundingModeType()
	 * @generated
	 */
	int EDGE_ROUNDING_MODE_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType <em>Normals Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsDirectionType()
	 * @generated
	 */
	int NORMALS_DIRECTION_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType <em>Normals Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsKindType()
	 * @generated
	 */
	int NORMALS_KIND_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType <em>Projection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getProjectionType()
	 * @generated
	 */
	int PROJECTION_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType <em>Shade Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadeModeType()
	 * @generated
	 */
	int SHADE_MODE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType <em>Shadow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadowType()
	 * @generated
	 */
	int SHADOW_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType <em>Texture Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureFilterType()
	 * @generated
	 */
	int TEXTURE_FILTER_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType <em>Texture Generation Mode XType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeXType()
	 * @generated
	 */
	int TEXTURE_GENERATION_MODE_XTYPE = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType <em>Texture Generation Mode YType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeYType()
	 * @generated
	 */
	int TEXTURE_GENERATION_MODE_YTYPE = 16;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType <em>Texture Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureKindType()
	 * @generated
	 */
	int TEXTURE_KIND_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType <em>Texture Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureModeType()
	 * @generated
	 */
	int TEXTURE_MODE_TYPE = 18;

	/**
	 * The meta object id for the '<em>Backface Culling Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getBackfaceCullingTypeObject()
	 * @generated
	 */
	int BACKFACE_CULLING_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Edge Rounding Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getEdgeRoundingModeTypeObject()
	 * @generated
	 */
	int EDGE_ROUNDING_MODE_TYPE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Normals Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsDirectionTypeObject()
	 * @generated
	 */
	int NORMALS_DIRECTION_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Normals Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsKindTypeObject()
	 * @generated
	 */
	int NORMALS_KIND_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Projection Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getProjectionTypeObject()
	 * @generated
	 */
	int PROJECTION_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Shade Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadeModeTypeObject()
	 * @generated
	 */
	int SHADE_MODE_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Shadow Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadowTypeObject()
	 * @generated
	 */
	int SHADOW_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Texture Filter Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureFilterTypeObject()
	 * @generated
	 */
	int TEXTURE_FILTER_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Texture Generation Mode XType Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeXTypeObject()
	 * @generated
	 */
	int TEXTURE_GENERATION_MODE_XTYPE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Texture Generation Mode YType Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeYTypeObject()
	 * @generated
	 */
	int TEXTURE_GENERATION_MODE_YTYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Texture Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureKindTypeObject()
	 * @generated
	 */
	int TEXTURE_KIND_TYPE_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Texture Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureModeTypeObject()
	 * @generated
	 */
	int TEXTURE_MODE_TYPE_OBJECT = 30;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType <em>Cube Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType
	 * @generated
	 */
	EClass getCubeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames1()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getId()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getLayer()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMaxEdge <em>Max Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Edge</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMaxEdge()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_MaxEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMinEdge <em>Min Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Edge</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMinEdge()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_MinEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName1()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getTransform()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getZIndex()
	 * @see #getCubeType()
	 * @generated
	 */
	EAttribute getCubeType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType <em>Extrude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrude Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType
	 * @generated
	 */
	EClass getExtrudeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getClassNames()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getClassNames1()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getD()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getId()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getLayer()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getStyleName()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getStyleName1()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getTransform()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getViewBox()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType#getZIndex()
	 * @see #getExtrudeType()
	 * @generated
	 */
	EAttribute getExtrudeType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType <em>Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType
	 * @generated
	 */
	EClass getLightType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getDiffuseColor <em>Diffuse Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diffuse Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getDiffuseColor()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_DiffuseColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getDirection()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getEnabled()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getSpecular <em>Specular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType#getSpecular()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Specular();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType <em>Rotate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType
	 * @generated
	 */
	EClass getRotateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getClassNames()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getClassNames1()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getD()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getId()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getLayer()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getStyleName()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getStyleName1()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getTransform()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getViewBox()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType#getZIndex()
	 * @see #getRotateType()
	 * @generated
	 */
	EAttribute getRotateType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType <em>Scene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType
	 * @generated
	 */
	EClass getSceneType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTitle()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDesc()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLight()
	 * @see #getSceneType()
	 * @generated
	 */
	EReference getSceneType_Light();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3dGroup <em>Shapes3d Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shapes3d Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3dGroup()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Shapes3dGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3d <em>Shapes3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shapes3d</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3d()
	 * @see #getSceneType()
	 * @generated
	 */
	EReference getSceneType_Shapes3d();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAmbientColor <em>Ambient Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAmbientColor()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_AmbientColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorPageNumber()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getCaptionId <em>Caption Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getCaptionId()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_CaptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames1()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDistance()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndCellAddress()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndX()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndY()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getFocalLength <em>Focal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getFocalLength()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_FocalLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getHeight()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getId()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLayer()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode <em>Lighting Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lighting Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_LightingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Projection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode <em>Shade Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shade Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_ShadeMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadowSlant <em>Shadow Slant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Slant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadowSlant()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_ShadowSlant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName1()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTransform()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVpn <em>Vpn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVpn()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Vpn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVrp <em>Vrp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vrp</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVrp()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Vrp();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVup <em>Vup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vup</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVup()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Vup();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getWidth()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getX()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getY()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getZIndex()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cube</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCube()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cube();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrude</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getExtrude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extrude();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getLight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Light();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getRotate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rotate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getScene()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scene();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sphere</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSphere()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sphere();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getAmbientColor <em>Ambient Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getAmbientColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AmbientColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling <em>Backface Culling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backface Culling</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackfaceCulling();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackScale <em>Back Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Back Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Center();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack <em>Close Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Back</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CloseBack();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront <em>Close Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Front</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CloseFront();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDepth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Depth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDiffuseColor <em>Diffuse Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diffuse Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDiffuseColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiffuseColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRounding <em>Edge Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Rounding</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRounding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EdgeRounding();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode <em>Edge Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Rounding Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EdgeRoundingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEmissiveColor <em>Emissive Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emissive Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEmissiveColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EmissiveColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEndAngle <em>End Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEndAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getFocalLength <em>Focal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getFocalLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FocalLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getHorizontalSegments <em>Horizontal Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Segments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getHorizontalSegments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HorizontalSegments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMaxEdge <em>Max Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Edge</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMaxEdge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMinEdge <em>Min Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Edge</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMinEdge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection <em>Normals Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NormalsDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind <em>Normals Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals Kind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NormalsKind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Projection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode <em>Shade Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shade Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadeMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow <em>Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Shadow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadowSlant <em>Shadow Slant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Slant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadowSlant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShadowSlant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShininess <em>Shininess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shininess</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShininess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Shininess();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular <em>Specular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Specular();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecularColor <em>Specular Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecularColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SpecularColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter <em>Texture Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextureFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX <em>Texture Generation Mode X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Generation Mode X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextureGenerationModeX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Generation Mode Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextureGenerationModeY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind <em>Texture Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Kind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextureKind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode <em>Texture Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextureMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVerticalSegments <em>Vertical Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Segments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVerticalSegments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VerticalSegments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVpn <em>Vpn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVpn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Vpn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVrp <em>Vrp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vrp</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVrp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Vrp();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVup <em>Vup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vup</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Vup();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType <em>Sphere Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType
	 * @generated
	 */
	EClass getSphereType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getCenter()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_Center();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getClassNames()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getClassNames1()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getId()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getLayer()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getSize()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getStyleName()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getStyleName1()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getTransform()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType#getZIndex()
	 * @see #getSphereType()
	 * @generated
	 */
	EAttribute getSphereType_ZIndex();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType <em>Backface Culling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backface Culling Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @generated
	 */
	EEnum getBackfaceCullingType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType <em>Edge Rounding Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Rounding Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @generated
	 */
	EEnum getEdgeRoundingModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType <em>Normals Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Normals Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @generated
	 */
	EEnum getNormalsDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType <em>Normals Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Normals Kind Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @generated
	 */
	EEnum getNormalsKindType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType <em>Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Projection Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @generated
	 */
	EEnum getProjectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType <em>Shade Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shade Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @generated
	 */
	EEnum getShadeModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType <em>Shadow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shadow Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @generated
	 */
	EEnum getShadowType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType <em>Texture Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Filter Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @generated
	 */
	EEnum getTextureFilterType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType <em>Texture Generation Mode XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Generation Mode XType</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @generated
	 */
	EEnum getTextureGenerationModeXType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType <em>Texture Generation Mode YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Generation Mode YType</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @generated
	 */
	EEnum getTextureGenerationModeYType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType <em>Texture Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Kind Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @generated
	 */
	EEnum getTextureKindType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType <em>Texture Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @generated
	 */
	EEnum getTextureModeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType <em>Backface Culling Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Backface Culling Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType"
	 *        extendedMetaData="name='backface-culling_._type:Object' baseType='backface-culling_._type'"
	 * @generated
	 */
	EDataType getBackfaceCullingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType <em>Edge Rounding Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Rounding Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType"
	 *        extendedMetaData="name='edge-rounding-mode_._type:Object' baseType='edge-rounding-mode_._type'"
	 * @generated
	 */
	EDataType getEdgeRoundingModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType <em>Normals Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Normals Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType"
	 *        extendedMetaData="name='normals-direction_._type:Object' baseType='normals-direction_._type'"
	 * @generated
	 */
	EDataType getNormalsDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType <em>Normals Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Normals Kind Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType"
	 *        extendedMetaData="name='normals-kind_._type:Object' baseType='normals-kind_._type'"
	 * @generated
	 */
	EDataType getNormalsKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType <em>Projection Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Projection Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType"
	 *        extendedMetaData="name='projection_._type:Object' baseType='projection_._type'"
	 * @generated
	 */
	EDataType getProjectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType <em>Shade Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shade Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType"
	 *        extendedMetaData="name='shade-mode_._type:Object' baseType='shade-mode_._type'"
	 * @generated
	 */
	EDataType getShadeModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType <em>Shadow Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shadow Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType"
	 *        extendedMetaData="name='shadow_._type:Object' baseType='shadow_._type'"
	 * @generated
	 */
	EDataType getShadowTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType <em>Texture Filter Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Filter Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType"
	 *        extendedMetaData="name='texture-filter_._type:Object' baseType='texture-filter_._type'"
	 * @generated
	 */
	EDataType getTextureFilterTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType <em>Texture Generation Mode XType Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Generation Mode XType Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType"
	 *        extendedMetaData="name='texture-generation-mode-x_._type:Object' baseType='texture-generation-mode-x_._type'"
	 * @generated
	 */
	EDataType getTextureGenerationModeXTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType <em>Texture Generation Mode YType Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Generation Mode YType Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType"
	 *        extendedMetaData="name='texture-generation-mode-y_._type:Object' baseType='texture-generation-mode-y_._type'"
	 * @generated
	 */
	EDataType getTextureGenerationModeYTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType <em>Texture Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Kind Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType"
	 *        extendedMetaData="name='texture-kind_._type:Object' baseType='texture-kind_._type'"
	 * @generated
	 */
	EDataType getTextureKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType <em>Texture Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType"
	 *        extendedMetaData="name='texture-mode_._type:Object' baseType='texture-mode_._type'"
	 * @generated
	 */
	EDataType getTextureModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dr3dFactory getDr3dFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.CubeTypeImpl <em>Cube Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.CubeTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getCubeType()
		 * @generated
		 */
		EClass CUBE_TYPE = eINSTANCE.getCubeType();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__CLASS_NAMES = eINSTANCE.getCubeType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__CLASS_NAMES1 = eINSTANCE.getCubeType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__ID = eINSTANCE.getCubeType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__LAYER = eINSTANCE.getCubeType_Layer();

		/**
		 * The meta object literal for the '<em><b>Max Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__MAX_EDGE = eINSTANCE.getCubeType_MaxEdge();

		/**
		 * The meta object literal for the '<em><b>Min Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__MIN_EDGE = eINSTANCE.getCubeType_MinEdge();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__STYLE_NAME = eINSTANCE.getCubeType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__STYLE_NAME1 = eINSTANCE.getCubeType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__TRANSFORM = eINSTANCE.getCubeType_Transform();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_TYPE__ZINDEX = eINSTANCE.getCubeType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.ExtrudeTypeImpl <em>Extrude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.ExtrudeTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getExtrudeType()
		 * @generated
		 */
		EClass EXTRUDE_TYPE = eINSTANCE.getExtrudeType();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__CLASS_NAMES = eINSTANCE.getExtrudeType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__CLASS_NAMES1 = eINSTANCE.getExtrudeType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__D = eINSTANCE.getExtrudeType_D();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__ID = eINSTANCE.getExtrudeType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__LAYER = eINSTANCE.getExtrudeType_Layer();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__STYLE_NAME = eINSTANCE.getExtrudeType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__STYLE_NAME1 = eINSTANCE.getExtrudeType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__TRANSFORM = eINSTANCE.getExtrudeType_Transform();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__VIEW_BOX = eINSTANCE.getExtrudeType_ViewBox();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUDE_TYPE__ZINDEX = eINSTANCE.getExtrudeType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl <em>Light Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getLightType()
		 * @generated
		 */
		EClass LIGHT_TYPE = eINSTANCE.getLightType();

		/**
		 * The meta object literal for the '<em><b>Diffuse Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__DIFFUSE_COLOR = eINSTANCE.getLightType_DiffuseColor();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__DIRECTION = eINSTANCE.getLightType_Direction();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__ENABLED = eINSTANCE.getLightType_Enabled();

		/**
		 * The meta object literal for the '<em><b>Specular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__SPECULAR = eINSTANCE.getLightType_Specular();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.RotateTypeImpl <em>Rotate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.RotateTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getRotateType()
		 * @generated
		 */
		EClass ROTATE_TYPE = eINSTANCE.getRotateType();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__CLASS_NAMES = eINSTANCE.getRotateType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__CLASS_NAMES1 = eINSTANCE.getRotateType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__D = eINSTANCE.getRotateType_D();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__ID = eINSTANCE.getRotateType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__LAYER = eINSTANCE.getRotateType_Layer();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__STYLE_NAME = eINSTANCE.getRotateType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__STYLE_NAME1 = eINSTANCE.getRotateType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__TRANSFORM = eINSTANCE.getRotateType_Transform();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__VIEW_BOX = eINSTANCE.getRotateType_ViewBox();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_TYPE__ZINDEX = eINSTANCE.getRotateType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl <em>Scene Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SceneTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getSceneType()
		 * @generated
		 */
		EClass SCENE_TYPE = eINSTANCE.getSceneType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__TITLE = eINSTANCE.getSceneType_Title();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__DESC = eINSTANCE.getSceneType_Desc();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_TYPE__LIGHT = eINSTANCE.getSceneType_Light();

		/**
		 * The meta object literal for the '<em><b>Shapes3d Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__SHAPES3D_GROUP = eINSTANCE.getSceneType_Shapes3dGroup();

		/**
		 * The meta object literal for the '<em><b>Shapes3d</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_TYPE__SHAPES3D = eINSTANCE.getSceneType_Shapes3d();

		/**
		 * The meta object literal for the '<em><b>Ambient Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__AMBIENT_COLOR = eINSTANCE.getSceneType_AmbientColor();

		/**
		 * The meta object literal for the '<em><b>Anchor Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__ANCHOR_PAGE_NUMBER = eINSTANCE.getSceneType_AnchorPageNumber();

		/**
		 * The meta object literal for the '<em><b>Anchor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__ANCHOR_TYPE = eINSTANCE.getSceneType_AnchorType();

		/**
		 * The meta object literal for the '<em><b>Caption Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__CAPTION_ID = eINSTANCE.getSceneType_CaptionId();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__CLASS_NAMES = eINSTANCE.getSceneType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__CLASS_NAMES1 = eINSTANCE.getSceneType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__DISTANCE = eINSTANCE.getSceneType_Distance();

		/**
		 * The meta object literal for the '<em><b>End Cell Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__END_CELL_ADDRESS = eINSTANCE.getSceneType_EndCellAddress();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__END_X = eINSTANCE.getSceneType_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__END_Y = eINSTANCE.getSceneType_EndY();

		/**
		 * The meta object literal for the '<em><b>Focal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__FOCAL_LENGTH = eINSTANCE.getSceneType_FocalLength();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__HEIGHT = eINSTANCE.getSceneType_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__ID = eINSTANCE.getSceneType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__LAYER = eINSTANCE.getSceneType_Layer();

		/**
		 * The meta object literal for the '<em><b>Lighting Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__LIGHTING_MODE = eINSTANCE.getSceneType_LightingMode();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__PROJECTION = eINSTANCE.getSceneType_Projection();

		/**
		 * The meta object literal for the '<em><b>Shade Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__SHADE_MODE = eINSTANCE.getSceneType_ShadeMode();

		/**
		 * The meta object literal for the '<em><b>Shadow Slant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__SHADOW_SLANT = eINSTANCE.getSceneType_ShadowSlant();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__STYLE_NAME = eINSTANCE.getSceneType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__STYLE_NAME1 = eINSTANCE.getSceneType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Table Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__TABLE_BACKGROUND = eINSTANCE.getSceneType_TableBackground();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__TRANSFORM = eINSTANCE.getSceneType_Transform();

		/**
		 * The meta object literal for the '<em><b>Vpn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__VPN = eINSTANCE.getSceneType_Vpn();

		/**
		 * The meta object literal for the '<em><b>Vrp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__VRP = eINSTANCE.getSceneType_Vrp();

		/**
		 * The meta object literal for the '<em><b>Vup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__VUP = eINSTANCE.getSceneType_Vup();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__WIDTH = eINSTANCE.getSceneType_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__X = eINSTANCE.getSceneType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__Y = eINSTANCE.getSceneType_Y();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_TYPE__ZINDEX = eINSTANCE.getSceneType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Cube</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CUBE = eINSTANCE.getDocumentRoot_Cube();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRUDE = eINSTANCE.getDocumentRoot_Extrude();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIGHT = eINSTANCE.getDocumentRoot_Light();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROTATE = eINSTANCE.getDocumentRoot_Rotate();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCENE = eINSTANCE.getDocumentRoot_Scene();

		/**
		 * The meta object literal for the '<em><b>Sphere</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPHERE = eINSTANCE.getDocumentRoot_Sphere();

		/**
		 * The meta object literal for the '<em><b>Ambient Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AMBIENT_COLOR = eINSTANCE.getDocumentRoot_AmbientColor();

		/**
		 * The meta object literal for the '<em><b>Backface Culling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BACKFACE_CULLING = eINSTANCE.getDocumentRoot_BackfaceCulling();

		/**
		 * The meta object literal for the '<em><b>Back Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BACK_SCALE = eINSTANCE.getDocumentRoot_BackScale();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CENTER = eINSTANCE.getDocumentRoot_Center();

		/**
		 * The meta object literal for the '<em><b>Close Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLOSE_BACK = eINSTANCE.getDocumentRoot_CloseBack();

		/**
		 * The meta object literal for the '<em><b>Close Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLOSE_FRONT = eINSTANCE.getDocumentRoot_CloseFront();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEPTH = eINSTANCE.getDocumentRoot_Depth();

		/**
		 * The meta object literal for the '<em><b>Diffuse Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIFFUSE_COLOR = eINSTANCE.getDocumentRoot_DiffuseColor();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIRECTION = eINSTANCE.getDocumentRoot_Direction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISTANCE = eINSTANCE.getDocumentRoot_Distance();

		/**
		 * The meta object literal for the '<em><b>Edge Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EDGE_ROUNDING = eINSTANCE.getDocumentRoot_EdgeRounding();

		/**
		 * The meta object literal for the '<em><b>Edge Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EDGE_ROUNDING_MODE = eINSTANCE.getDocumentRoot_EdgeRoundingMode();

		/**
		 * The meta object literal for the '<em><b>Emissive Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EMISSIVE_COLOR = eINSTANCE.getDocumentRoot_EmissiveColor();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENABLED = eINSTANCE.getDocumentRoot_Enabled();

		/**
		 * The meta object literal for the '<em><b>End Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__END_ANGLE = eINSTANCE.getDocumentRoot_EndAngle();

		/**
		 * The meta object literal for the '<em><b>Focal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FOCAL_LENGTH = eINSTANCE.getDocumentRoot_FocalLength();

		/**
		 * The meta object literal for the '<em><b>Horizontal Segments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HORIZONTAL_SEGMENTS = eINSTANCE.getDocumentRoot_HorizontalSegments();

		/**
		 * The meta object literal for the '<em><b>Max Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_EDGE = eINSTANCE.getDocumentRoot_MaxEdge();

		/**
		 * The meta object literal for the '<em><b>Min Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_EDGE = eINSTANCE.getDocumentRoot_MinEdge();

		/**
		 * The meta object literal for the '<em><b>Normals Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NORMALS_DIRECTION = eINSTANCE.getDocumentRoot_NormalsDirection();

		/**
		 * The meta object literal for the '<em><b>Normals Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NORMALS_KIND = eINSTANCE.getDocumentRoot_NormalsKind();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROJECTION = eINSTANCE.getDocumentRoot_Projection();

		/**
		 * The meta object literal for the '<em><b>Shade Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHADE_MODE = eINSTANCE.getDocumentRoot_ShadeMode();

		/**
		 * The meta object literal for the '<em><b>Shadow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHADOW = eINSTANCE.getDocumentRoot_Shadow();

		/**
		 * The meta object literal for the '<em><b>Shadow Slant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHADOW_SLANT = eINSTANCE.getDocumentRoot_ShadowSlant();

		/**
		 * The meta object literal for the '<em><b>Shininess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHININESS = eINSTANCE.getDocumentRoot_Shininess();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIZE = eINSTANCE.getDocumentRoot_Size();

		/**
		 * The meta object literal for the '<em><b>Specular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPECULAR = eINSTANCE.getDocumentRoot_Specular();

		/**
		 * The meta object literal for the '<em><b>Specular Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPECULAR_COLOR = eINSTANCE.getDocumentRoot_SpecularColor();

		/**
		 * The meta object literal for the '<em><b>Texture Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTURE_FILTER = eINSTANCE.getDocumentRoot_TextureFilter();

		/**
		 * The meta object literal for the '<em><b>Texture Generation Mode X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X = eINSTANCE.getDocumentRoot_TextureGenerationModeX();

		/**
		 * The meta object literal for the '<em><b>Texture Generation Mode Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y = eINSTANCE.getDocumentRoot_TextureGenerationModeY();

		/**
		 * The meta object literal for the '<em><b>Texture Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTURE_KIND = eINSTANCE.getDocumentRoot_TextureKind();

		/**
		 * The meta object literal for the '<em><b>Texture Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTURE_MODE = eINSTANCE.getDocumentRoot_TextureMode();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

		/**
		 * The meta object literal for the '<em><b>Vertical Segments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VERTICAL_SEGMENTS = eINSTANCE.getDocumentRoot_VerticalSegments();

		/**
		 * The meta object literal for the '<em><b>Vpn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VPN = eINSTANCE.getDocumentRoot_Vpn();

		/**
		 * The meta object literal for the '<em><b>Vrp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VRP = eINSTANCE.getDocumentRoot_Vrp();

		/**
		 * The meta object literal for the '<em><b>Vup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VUP = eINSTANCE.getDocumentRoot_Vup();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SphereTypeImpl <em>Sphere Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.SphereTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getSphereType()
		 * @generated
		 */
		EClass SPHERE_TYPE = eINSTANCE.getSphereType();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__CENTER = eINSTANCE.getSphereType_Center();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__CLASS_NAMES = eINSTANCE.getSphereType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__CLASS_NAMES1 = eINSTANCE.getSphereType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__ID = eINSTANCE.getSphereType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__LAYER = eINSTANCE.getSphereType_Layer();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__SIZE = eINSTANCE.getSphereType_Size();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__STYLE_NAME = eINSTANCE.getSphereType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__STYLE_NAME1 = eINSTANCE.getSphereType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__TRANSFORM = eINSTANCE.getSphereType_Transform();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_TYPE__ZINDEX = eINSTANCE.getSphereType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType <em>Backface Culling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getBackfaceCullingType()
		 * @generated
		 */
		EEnum BACKFACE_CULLING_TYPE = eINSTANCE.getBackfaceCullingType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType <em>Edge Rounding Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getEdgeRoundingModeType()
		 * @generated
		 */
		EEnum EDGE_ROUNDING_MODE_TYPE = eINSTANCE.getEdgeRoundingModeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType <em>Normals Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsDirectionType()
		 * @generated
		 */
		EEnum NORMALS_DIRECTION_TYPE = eINSTANCE.getNormalsDirectionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType <em>Normals Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsKindType()
		 * @generated
		 */
		EEnum NORMALS_KIND_TYPE = eINSTANCE.getNormalsKindType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType <em>Projection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getProjectionType()
		 * @generated
		 */
		EEnum PROJECTION_TYPE = eINSTANCE.getProjectionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType <em>Shade Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadeModeType()
		 * @generated
		 */
		EEnum SHADE_MODE_TYPE = eINSTANCE.getShadeModeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType <em>Shadow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadowType()
		 * @generated
		 */
		EEnum SHADOW_TYPE = eINSTANCE.getShadowType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType <em>Texture Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureFilterType()
		 * @generated
		 */
		EEnum TEXTURE_FILTER_TYPE = eINSTANCE.getTextureFilterType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType <em>Texture Generation Mode XType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeXType()
		 * @generated
		 */
		EEnum TEXTURE_GENERATION_MODE_XTYPE = eINSTANCE.getTextureGenerationModeXType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType <em>Texture Generation Mode YType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeYType()
		 * @generated
		 */
		EEnum TEXTURE_GENERATION_MODE_YTYPE = eINSTANCE.getTextureGenerationModeYType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType <em>Texture Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureKindType()
		 * @generated
		 */
		EEnum TEXTURE_KIND_TYPE = eINSTANCE.getTextureKindType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType <em>Texture Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureModeType()
		 * @generated
		 */
		EEnum TEXTURE_MODE_TYPE = eINSTANCE.getTextureModeType();

		/**
		 * The meta object literal for the '<em>Backface Culling Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getBackfaceCullingTypeObject()
		 * @generated
		 */
		EDataType BACKFACE_CULLING_TYPE_OBJECT = eINSTANCE.getBackfaceCullingTypeObject();

		/**
		 * The meta object literal for the '<em>Edge Rounding Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getEdgeRoundingModeTypeObject()
		 * @generated
		 */
		EDataType EDGE_ROUNDING_MODE_TYPE_OBJECT = eINSTANCE.getEdgeRoundingModeTypeObject();

		/**
		 * The meta object literal for the '<em>Normals Direction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsDirectionTypeObject()
		 * @generated
		 */
		EDataType NORMALS_DIRECTION_TYPE_OBJECT = eINSTANCE.getNormalsDirectionTypeObject();

		/**
		 * The meta object literal for the '<em>Normals Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getNormalsKindTypeObject()
		 * @generated
		 */
		EDataType NORMALS_KIND_TYPE_OBJECT = eINSTANCE.getNormalsKindTypeObject();

		/**
		 * The meta object literal for the '<em>Projection Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getProjectionTypeObject()
		 * @generated
		 */
		EDataType PROJECTION_TYPE_OBJECT = eINSTANCE.getProjectionTypeObject();

		/**
		 * The meta object literal for the '<em>Shade Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadeModeTypeObject()
		 * @generated
		 */
		EDataType SHADE_MODE_TYPE_OBJECT = eINSTANCE.getShadeModeTypeObject();

		/**
		 * The meta object literal for the '<em>Shadow Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getShadowTypeObject()
		 * @generated
		 */
		EDataType SHADOW_TYPE_OBJECT = eINSTANCE.getShadowTypeObject();

		/**
		 * The meta object literal for the '<em>Texture Filter Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureFilterTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_FILTER_TYPE_OBJECT = eINSTANCE.getTextureFilterTypeObject();

		/**
		 * The meta object literal for the '<em>Texture Generation Mode XType Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeXTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_GENERATION_MODE_XTYPE_OBJECT = eINSTANCE.getTextureGenerationModeXTypeObject();

		/**
		 * The meta object literal for the '<em>Texture Generation Mode YType Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureGenerationModeYTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_GENERATION_MODE_YTYPE_OBJECT = eINSTANCE.getTextureGenerationModeYTypeObject();

		/**
		 * The meta object literal for the '<em>Texture Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureKindTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_KIND_TYPE_OBJECT = eINSTANCE.getTextureKindTypeObject();

		/**
		 * The meta object literal for the '<em>Texture Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl#getTextureModeTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_MODE_TYPE_OBJECT = eINSTANCE.getTextureModeTypeObject();

	}

} //Dr3dPackage
