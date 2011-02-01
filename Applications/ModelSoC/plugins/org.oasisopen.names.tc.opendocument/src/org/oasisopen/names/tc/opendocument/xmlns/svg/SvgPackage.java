/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgFactory
 * @model kind="package"
 * @generated
 */
public interface SvgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfsvg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvgPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DefinitionSrcTypeImpl <em>Definition Src Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DefinitionSrcTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getDefinitionSrcType()
	 * @generated
	 */
	int DEFINITION_SRC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SRC_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SRC_TYPE__HREF = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SRC_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Definition Src Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SRC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceFormatTypeImpl <em>Font Face Format Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceFormatTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceFormatType()
	 * @generated
	 */
	int FONT_FACE_FORMAT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_FORMAT_TYPE__STRING = 0;

	/**
	 * The number of structural features of the '<em>Font Face Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_FORMAT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceNameTypeImpl <em>Font Face Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceNameTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceNameType()
	 * @generated
	 */
	int FONT_FACE_NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_NAME_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Font Face Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_NAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl <em>Font Face Src Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceSrcType()
	 * @generated
	 */
	int FONT_FACE_SRC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_SRC_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Font Face Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_SRC_TYPE__FONT_FACE_URI = 1;

	/**
	 * The feature id for the '<em><b>Font Face Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_SRC_TYPE__FONT_FACE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Font Face Src Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_SRC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceUriTypeImpl <em>Font Face Uri Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceUriTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceUriType()
	 * @generated
	 */
	int FONT_FACE_URI_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Font Face Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_URI_TYPE__FONT_FACE_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_URI_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_URI_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_URI_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Font Face Uri Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_URI_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl <em>Linear Gradient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getLinearGradientType()
	 * @generated
	 */
	int LINEAR_GRADIENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__STOP = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Gradient Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Gradient Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__GRADIENT_UNITS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__SPREAD_METHOD = 5;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__X1 = 6;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__X2 = 7;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__Y1 = 8;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE__Y2 = 9;

	/**
	 * The number of structural features of the '<em>Linear Gradient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl <em>Radial Gradient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getRadialGradientType()
	 * @generated
	 */
	int RADIAL_GRADIENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__STOP = 0;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__CX = 1;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__CY = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__DISPLAY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Fx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__FX = 4;

	/**
	 * The feature id for the '<em><b>Fy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__FY = 5;

	/**
	 * The feature id for the '<em><b>Gradient Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM = 6;

	/**
	 * The feature id for the '<em><b>Gradient Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__GRADIENT_UNITS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__R = 9;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE__SPREAD_METHOD = 10;

	/**
	 * The number of structural features of the '<em>Radial Gradient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl <em>Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStopType()
	 * @generated
	 */
	int STOP_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Stop Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE__STOP_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Stop Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE__STOP_OPACITY = 2;

	/**
	 * The number of structural features of the '<em>Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

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
	 * The feature id for the '<em><b>Definition Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITION_SRC = 3;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESC = 4;

	/**
	 * The feature id for the '<em><b>Font Face Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE_FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Font Face Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Font Face Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE_SRC = 7;

	/**
	 * The feature id for the '<em><b>Font Face Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE_URI = 8;

	/**
	 * The feature id for the '<em><b>Linear Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_GRADIENT = 9;

	/**
	 * The feature id for the '<em><b>Radial Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RADIAL_GRADIENT = 10;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 12;

	/**
	 * The feature id for the '<em><b>Accent Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCENT_HEIGHT = 13;

	/**
	 * The feature id for the '<em><b>Alphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALPHABETIC = 14;

	/**
	 * The feature id for the '<em><b>Ascent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASCENT = 15;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BBOX = 16;

	/**
	 * The feature id for the '<em><b>Cap Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAP_HEIGHT = 17;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CX = 18;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CY = 19;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__D = 20;

	/**
	 * The feature id for the '<em><b>Descent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCENT = 21;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_RULE = 22;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY = 23;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE = 24;

	/**
	 * The feature id for the '<em><b>Font Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STRETCH = 25;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE = 26;

	/**
	 * The feature id for the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_VARIANT = 27;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_WEIGHT = 28;

	/**
	 * The feature id for the '<em><b>Gradient Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRADIENT_TRANSFORM = 29;

	/**
	 * The feature id for the '<em><b>Gradient Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRADIENT_UNITS = 30;

	/**
	 * The feature id for the '<em><b>Hanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANGING = 31;

	/**
	 * The feature id for the '<em><b>Ideographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDEOGRAPHIC = 32;

	/**
	 * The feature id for the '<em><b>Mathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MATHEMATICAL = 33;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGIN = 34;

	/**
	 * The feature id for the '<em><b>Overline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERLINE_POSITION = 35;

	/**
	 * The feature id for the '<em><b>Overline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERLINE_THICKNESS = 36;

	/**
	 * The feature id for the '<em><b>Panose1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PANOSE1 = 37;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH = 38;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__R = 39;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RX = 40;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RY = 41;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOPE = 42;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPREAD_METHOD = 43;

	/**
	 * The feature id for the '<em><b>Stemh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEMH = 44;

	/**
	 * The feature id for the '<em><b>Stemv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEMV = 45;

	/**
	 * The feature id for the '<em><b>Strikethrough Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRIKETHROUGH_POSITION = 46;

	/**
	 * The feature id for the '<em><b>Strikethrough Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS = 47;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_COLOR = 48;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_OPACITY = 49;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STROKE_WIDTH = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 51;

	/**
	 * The feature id for the '<em><b>Underline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNDERLINE_POSITION = 52;

	/**
	 * The feature id for the '<em><b>Underline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNDERLINE_THICKNESS = 53;

	/**
	 * The feature id for the '<em><b>Unicode Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNICODE_RANGE = 54;

	/**
	 * The feature id for the '<em><b>Units Per Em</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNITS_PER_EM = 55;

	/**
	 * The feature id for the '<em><b>VAlphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALPHABETIC = 56;

	/**
	 * The feature id for the '<em><b>VHanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VHANGING = 57;

	/**
	 * The feature id for the '<em><b>VIdeographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIDEOGRAPHIC = 58;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_BOX = 59;

	/**
	 * The feature id for the '<em><b>VMathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VMATHEMATICAL = 60;

	/**
	 * The feature id for the '<em><b>Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIDTHS = 61;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X1 = 62;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X2 = 63;

	/**
	 * The feature id for the '<em><b>XHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XHEIGHT = 64;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Y1 = 65;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Y2 = 66;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 67;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType <em>Fill Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFillRuleType()
	 * @generated
	 */
	int FILL_RULE_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType <em>Font Stretch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontStretchType()
	 * @generated
	 */
	int FONT_STRETCH_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType <em>Gradient Units Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getGradientUnitsType()
	 * @generated
	 */
	int GRADIENT_UNITS_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType <em>Spread Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getSpreadMethodType()
	 * @generated
	 */
	int SPREAD_METHOD_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Cx Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getCxType()
	 * @generated
	 */
	int CX_TYPE = 14;

	/**
	 * The meta object id for the '<em>Cy Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getCyType()
	 * @generated
	 */
	int CY_TYPE = 15;

	/**
	 * The meta object id for the '<em>Fill Rule Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFillRuleTypeObject()
	 * @generated
	 */
	int FILL_RULE_TYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Font Stretch Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontStretchTypeObject()
	 * @generated
	 */
	int FONT_STRETCH_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Fx Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFxType()
	 * @generated
	 */
	int FX_TYPE = 18;

	/**
	 * The meta object id for the '<em>Fy Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFyType()
	 * @generated
	 */
	int FY_TYPE = 19;

	/**
	 * The meta object id for the '<em>Gradient Units Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getGradientUnitsTypeObject()
	 * @generated
	 */
	int GRADIENT_UNITS_TYPE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getHeightType()
	 * @generated
	 */
	int HEIGHT_TYPE = 21;

	/**
	 * The meta object id for the '<em>Offset Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getOffsetType()
	 * @generated
	 */
	int OFFSET_TYPE = 22;

	/**
	 * The meta object id for the '<em>RType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getRType()
	 * @generated
	 */
	int RTYPE = 23;

	/**
	 * The meta object id for the '<em>Spread Method Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getSpreadMethodTypeObject()
	 * @generated
	 */
	int SPREAD_METHOD_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Stroke Opacity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityType()
	 * @generated
	 */
	int STROKE_OPACITY_TYPE = 25;

	/**
	 * The meta object id for the '<em>Stroke Opacity Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityTypeMember1()
	 * @generated
	 */
	int STROKE_OPACITY_TYPE_MEMBER1 = 26;

	/**
	 * The meta object id for the '<em>Stroke Opacity Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityTypeMember1Object()
	 * @generated
	 */
	int STROKE_OPACITY_TYPE_MEMBER1_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>View Box Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxType()
	 * @generated
	 */
	int VIEW_BOX_TYPE = 29;

	/**
	 * The meta object id for the '<em>View Box Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxTypeBase()
	 * @generated
	 */
	int VIEW_BOX_TYPE_BASE = 30;

	/**
	 * The meta object id for the '<em>View Box Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxTypeBaseItem()
	 * @generated
	 */
	int VIEW_BOX_TYPE_BASE_ITEM = 31;

	/**
	 * The meta object id for the '<em>Width Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getWidthType()
	 * @generated
	 */
	int WIDTH_TYPE = 32;

	/**
	 * The meta object id for the '<em>X1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getX1Type()
	 * @generated
	 */
	int X1_TYPE = 33;

	/**
	 * The meta object id for the '<em>X2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getX2Type()
	 * @generated
	 */
	int X2_TYPE = 34;

	/**
	 * The meta object id for the '<em>XType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getXType()
	 * @generated
	 */
	int XTYPE = 35;

	/**
	 * The meta object id for the '<em>XType1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getXType1()
	 * @generated
	 */
	int XTYPE1 = 36;

	/**
	 * The meta object id for the '<em>Y1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getY1Type()
	 * @generated
	 */
	int Y1_TYPE = 37;

	/**
	 * The meta object id for the '<em>Y2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getY2Type()
	 * @generated
	 */
	int Y2_TYPE = 38;

	/**
	 * The meta object id for the '<em>YType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getYType()
	 * @generated
	 */
	int YTYPE = 39;

	/**
	 * The meta object id for the '<em>YType1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getYType1()
	 * @generated
	 */
	int YTYPE1 = 40;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType <em>Definition Src Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Src Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType
	 * @generated
	 */
	EClass getDefinitionSrcType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getActuate()
	 * @see #getDefinitionSrcType()
	 * @generated
	 */
	EAttribute getDefinitionSrcType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getHref()
	 * @see #getDefinitionSrcType()
	 * @generated
	 */
	EAttribute getDefinitionSrcType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType#getType()
	 * @see #getDefinitionSrcType()
	 * @generated
	 */
	EAttribute getDefinitionSrcType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType <em>Font Face Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Format Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType
	 * @generated
	 */
	EClass getFontFaceFormatType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType#getString()
	 * @see #getFontFaceFormatType()
	 * @generated
	 */
	EAttribute getFontFaceFormatType_String();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType <em>Font Face Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Name Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType
	 * @generated
	 */
	EClass getFontFaceNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType#getName()
	 * @see #getFontFaceNameType()
	 * @generated
	 */
	EAttribute getFontFaceNameType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType <em>Font Face Src Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Src Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType
	 * @generated
	 */
	EClass getFontFaceSrcType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getGroup()
	 * @see #getFontFaceSrcType()
	 * @generated
	 */
	EAttribute getFontFaceSrcType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceUri <em>Font Face Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font Face Uri</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceUri()
	 * @see #getFontFaceSrcType()
	 * @generated
	 */
	EReference getFontFaceSrcType_FontFaceUri();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceName <em>Font Face Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font Face Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType#getFontFaceName()
	 * @see #getFontFaceSrcType()
	 * @generated
	 */
	EReference getFontFaceSrcType_FontFaceName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType <em>Font Face Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Uri Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType
	 * @generated
	 */
	EClass getFontFaceUriType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getFontFaceFormat <em>Font Face Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font Face Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getFontFaceFormat()
	 * @see #getFontFaceUriType()
	 * @generated
	 */
	EReference getFontFaceUriType_FontFaceFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getActuate()
	 * @see #getFontFaceUriType()
	 * @generated
	 */
	EAttribute getFontFaceUriType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getHref()
	 * @see #getFontFaceUriType()
	 * @generated
	 */
	EAttribute getFontFaceUriType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType#getType()
	 * @see #getFontFaceUriType()
	 * @generated
	 */
	EAttribute getFontFaceUriType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType <em>Linear Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Gradient Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType
	 * @generated
	 */
	EClass getLinearGradientType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getStop()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EReference getLinearGradientType_Stop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getDisplayName()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientTransform <em>Gradient Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientTransform()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_GradientTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits <em>Gradient Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Units</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_GradientUnits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getName()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2()
	 * @see #getLinearGradientType()
	 * @generated
	 */
	EAttribute getLinearGradientType_Y2();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType <em>Radial Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radial Gradient Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType
	 * @generated
	 */
	EClass getRadialGradientType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getStop()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EReference getRadialGradientType_Stop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getDisplayName()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFx <em>Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFx()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_Fx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFy <em>Fy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFy()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_Fy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientTransform <em>Gradient Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientTransform()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_GradientTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits <em>Gradient Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Units</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_GradientUnits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getName()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_R();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod()
	 * @see #getRadialGradientType()
	 * @generated
	 */
	EAttribute getRadialGradientType_SpreadMethod();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType <em>Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.StopType
	 * @generated
	 */
	EClass getStopType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getOffset()
	 * @see #getStopType()
	 * @generated
	 */
	EAttribute getStopType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopColor <em>Stop Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopColor()
	 * @see #getStopType()
	 * @generated
	 */
	EAttribute getStopType_StopColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity <em>Stop Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity()
	 * @see #getStopType()
	 * @generated
	 */
	EAttribute getStopType_StopOpacity();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDefinitionSrc <em>Definition Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition Src</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDefinitionSrc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DefinitionSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDesc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceFormat <em>Font Face Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFaceFormat();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceName <em>Font Face Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFaceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceSrc <em>Font Face Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Src</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceSrc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFaceSrc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceUri <em>Font Face Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Uri</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceUri()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFaceUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getLinearGradient()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinearGradient();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRadialGradient <em>Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radial Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRadialGradient()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RadialGradient();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Stop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAccentHeight <em>Accent Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accent Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAccentHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccentHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAlphabetic <em>Alphabetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alphabetic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAlphabetic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Alphabetic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAscent <em>Ascent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAscent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ascent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getBbox <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getBbox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Bbox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCapHeight <em>Cap Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCapHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CapHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCx()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getD()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_D();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDescent <em>Descent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDescent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Descent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFamily()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch <em>Font Stretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Stretch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStretch();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant <em>Font Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Variant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientTransform <em>Gradient Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GradientTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits <em>Gradient Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Units</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GradientUnits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getHanging <em>Hanging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hanging</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getHanging()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Hanging();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getIdeographic <em>Ideographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ideographic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getIdeographic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ideographic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMathematical <em>Mathematical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mathematical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMathematical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mathematical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlinePosition <em>Overline Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overline Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlinePosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OverlinePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlineThickness <em>Overline Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overline Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlineThickness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OverlineThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPanose1 <em>Panose1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Panose1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPanose1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Panose1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getR()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_R();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRx()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSlope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Slope();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemh <em>Stemh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stemh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Stemh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemv <em>Stemv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stemv</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemv()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Stemv();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughPosition <em>Strikethrough Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrikethroughPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughThickness <em>Strikethrough Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughThickness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrikethroughThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeColor <em>Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeOpacity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlinePosition <em>Underline Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlinePosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnderlinePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlineThickness <em>Underline Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlineThickness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnderlineThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnicodeRange <em>Unicode Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnicodeRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnicodeRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnitsPerEm <em>Units Per Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Per Em</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnitsPerEm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitsPerEm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVAlphabetic <em>VAlphabetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VAlphabetic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVAlphabetic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VAlphabetic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVHanging <em>VHanging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VHanging</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVHanging()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VHanging();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVIdeographic <em>VIdeographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIdeographic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVIdeographic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VIdeographic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getViewBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVMathematical <em>VMathematical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VMathematical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVMathematical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VMathematical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getWidths <em>Widths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widths</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getWidths()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Widths();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXHeight <em>XHeight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XHeight</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_XHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Y2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType <em>Fill Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Rule Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @generated
	 */
	EEnum getFillRuleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType <em>Font Stretch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Stretch Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @generated
	 */
	EEnum getFontStretchType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType <em>Gradient Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gradient Units Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @generated
	 */
	EEnum getGradientUnitsType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType <em>Spread Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spread Method Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @generated
	 */
	EEnum getSpreadMethodType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cx Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cx_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getCxType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cy Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cy_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getCyType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType <em>Fill Rule Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType"
	 *        extendedMetaData="name='fill-rule_._type:Object' baseType='fill-rule_._type'"
	 * @generated
	 */
	EDataType getFillRuleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType <em>Font Stretch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Stretch Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType"
	 *        extendedMetaData="name='font-stretch_._type:Object' baseType='font-stretch_._type'"
	 * @generated
	 */
	EDataType getFontStretchTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fx Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fx_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFxType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fy Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fy_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFyType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType <em>Gradient Units Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gradient Units Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType"
	 *        extendedMetaData="name='gradientUnits_._type:Object' baseType='gradientUnits_._type'"
	 * @generated
	 */
	EDataType getGradientUnitsTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Height Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getHeightType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Offset Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='offset_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getOffsetType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>RType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RType</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='r_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getRType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType <em>Spread Method Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Spread Method Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType"
	 *        extendedMetaData="name='spreadMethod_._type:Object' baseType='spreadMethod_._type'"
	 * @generated
	 */
	EDataType getSpreadMethodTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Stroke Opacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Opacity Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='stroke-opacity_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent stroke-opacity_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStrokeOpacityType();

	/**
	 * Returns the meta object for data type '<em>Stroke Opacity Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Opacity Type Member1</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='stroke-opacity_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getStrokeOpacityTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Stroke Opacity Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Opacity Type Member1 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='stroke-opacity_._type_._member_._1:Object' baseType='stroke-opacity_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStrokeOpacityTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>View Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Box Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='viewBox_._type' length='4'"
	 * @generated
	 */
	EDataType getViewBoxType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>View Box Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Box Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='viewBox_._type_._base' itemType='viewBox_._type_._base_._item'"
	 * @generated
	 */
	EDataType getViewBoxTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>View Box Type Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Box Type Base Item</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='viewBox_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#integer'"
	 * @generated
	 */
	EDataType getViewBoxTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Width Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='width_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getWidthType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>X1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>X1 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='x1_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getX1Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>X2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>X2 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='x2_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getX2Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XType</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='x_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getXType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>XType1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XType1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='x_._1_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#distance urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getXType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Y1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Y1 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='y1_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getY1Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Y2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Y2 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='y2_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getY2Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YType</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='y_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getYType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>YType1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YType1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='y_._1_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#distance urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getYType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SvgFactory getSvgFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DefinitionSrcTypeImpl <em>Definition Src Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DefinitionSrcTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getDefinitionSrcType()
		 * @generated
		 */
		EClass DEFINITION_SRC_TYPE = eINSTANCE.getDefinitionSrcType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_SRC_TYPE__ACTUATE = eINSTANCE.getDefinitionSrcType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_SRC_TYPE__HREF = eINSTANCE.getDefinitionSrcType_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_SRC_TYPE__TYPE = eINSTANCE.getDefinitionSrcType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceFormatTypeImpl <em>Font Face Format Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceFormatTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceFormatType()
		 * @generated
		 */
		EClass FONT_FACE_FORMAT_TYPE = eINSTANCE.getFontFaceFormatType();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_FORMAT_TYPE__STRING = eINSTANCE.getFontFaceFormatType_String();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceNameTypeImpl <em>Font Face Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceNameTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceNameType()
		 * @generated
		 */
		EClass FONT_FACE_NAME_TYPE = eINSTANCE.getFontFaceNameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_NAME_TYPE__NAME = eINSTANCE.getFontFaceNameType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl <em>Font Face Src Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceSrcType()
		 * @generated
		 */
		EClass FONT_FACE_SRC_TYPE = eINSTANCE.getFontFaceSrcType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_SRC_TYPE__GROUP = eINSTANCE.getFontFaceSrcType_Group();

		/**
		 * The meta object literal for the '<em><b>Font Face Uri</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_FACE_SRC_TYPE__FONT_FACE_URI = eINSTANCE.getFontFaceSrcType_FontFaceUri();

		/**
		 * The meta object literal for the '<em><b>Font Face Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_FACE_SRC_TYPE__FONT_FACE_NAME = eINSTANCE.getFontFaceSrcType_FontFaceName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceUriTypeImpl <em>Font Face Uri Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceUriTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontFaceUriType()
		 * @generated
		 */
		EClass FONT_FACE_URI_TYPE = eINSTANCE.getFontFaceUriType();

		/**
		 * The meta object literal for the '<em><b>Font Face Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_FACE_URI_TYPE__FONT_FACE_FORMAT = eINSTANCE.getFontFaceUriType_FontFaceFormat();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_URI_TYPE__ACTUATE = eINSTANCE.getFontFaceUriType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_URI_TYPE__HREF = eINSTANCE.getFontFaceUriType_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FACE_URI_TYPE__TYPE = eINSTANCE.getFontFaceUriType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl <em>Linear Gradient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getLinearGradientType()
		 * @generated
		 */
		EClass LINEAR_GRADIENT_TYPE = eINSTANCE.getLinearGradientType();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_GRADIENT_TYPE__STOP = eINSTANCE.getLinearGradientType_Stop();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__DISPLAY_NAME = eINSTANCE.getLinearGradientType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Gradient Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM = eINSTANCE.getLinearGradientType_GradientTransform();

		/**
		 * The meta object literal for the '<em><b>Gradient Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__GRADIENT_UNITS = eINSTANCE.getLinearGradientType_GradientUnits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__NAME = eINSTANCE.getLinearGradientType_Name();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__SPREAD_METHOD = eINSTANCE.getLinearGradientType_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__X1 = eINSTANCE.getLinearGradientType_X1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__X2 = eINSTANCE.getLinearGradientType_X2();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__Y1 = eINSTANCE.getLinearGradientType_Y1();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_TYPE__Y2 = eINSTANCE.getLinearGradientType_Y2();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl <em>Radial Gradient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getRadialGradientType()
		 * @generated
		 */
		EClass RADIAL_GRADIENT_TYPE = eINSTANCE.getRadialGradientType();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIAL_GRADIENT_TYPE__STOP = eINSTANCE.getRadialGradientType_Stop();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__CX = eINSTANCE.getRadialGradientType_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__CY = eINSTANCE.getRadialGradientType_Cy();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__DISPLAY_NAME = eINSTANCE.getRadialGradientType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Fx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__FX = eINSTANCE.getRadialGradientType_Fx();

		/**
		 * The meta object literal for the '<em><b>Fy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__FY = eINSTANCE.getRadialGradientType_Fy();

		/**
		 * The meta object literal for the '<em><b>Gradient Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM = eINSTANCE.getRadialGradientType_GradientTransform();

		/**
		 * The meta object literal for the '<em><b>Gradient Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__GRADIENT_UNITS = eINSTANCE.getRadialGradientType_GradientUnits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__NAME = eINSTANCE.getRadialGradientType_Name();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__R = eINSTANCE.getRadialGradientType_R();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_TYPE__SPREAD_METHOD = eINSTANCE.getRadialGradientType_SpreadMethod();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl <em>Stop Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStopType()
		 * @generated
		 */
		EClass STOP_TYPE = eINSTANCE.getStopType();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TYPE__OFFSET = eINSTANCE.getStopType_Offset();

		/**
		 * The meta object literal for the '<em><b>Stop Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TYPE__STOP_COLOR = eINSTANCE.getStopType_StopColor();

		/**
		 * The meta object literal for the '<em><b>Stop Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TYPE__STOP_OPACITY = eINSTANCE.getStopType_StopOpacity();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Definition Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFINITION_SRC = eINSTANCE.getDocumentRoot_DefinitionSrc();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESC = eINSTANCE.getDocumentRoot_Desc();

		/**
		 * The meta object literal for the '<em><b>Font Face Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT_FACE_FORMAT = eINSTANCE.getDocumentRoot_FontFaceFormat();

		/**
		 * The meta object literal for the '<em><b>Font Face Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT_FACE_NAME = eINSTANCE.getDocumentRoot_FontFaceName();

		/**
		 * The meta object literal for the '<em><b>Font Face Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT_FACE_SRC = eINSTANCE.getDocumentRoot_FontFaceSrc();

		/**
		 * The meta object literal for the '<em><b>Font Face Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT_FACE_URI = eINSTANCE.getDocumentRoot_FontFaceUri();

		/**
		 * The meta object literal for the '<em><b>Linear Gradient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINEAR_GRADIENT = eINSTANCE.getDocumentRoot_LinearGradient();

		/**
		 * The meta object literal for the '<em><b>Radial Gradient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RADIAL_GRADIENT = eINSTANCE.getDocumentRoot_RadialGradient();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOP = eINSTANCE.getDocumentRoot_Stop();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Accent Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCENT_HEIGHT = eINSTANCE.getDocumentRoot_AccentHeight();

		/**
		 * The meta object literal for the '<em><b>Alphabetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ALPHABETIC = eINSTANCE.getDocumentRoot_Alphabetic();

		/**
		 * The meta object literal for the '<em><b>Ascent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ASCENT = eINSTANCE.getDocumentRoot_Ascent();

		/**
		 * The meta object literal for the '<em><b>Bbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BBOX = eINSTANCE.getDocumentRoot_Bbox();

		/**
		 * The meta object literal for the '<em><b>Cap Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CAP_HEIGHT = eINSTANCE.getDocumentRoot_CapHeight();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CX = eINSTANCE.getDocumentRoot_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CY = eINSTANCE.getDocumentRoot_Cy();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__D = eINSTANCE.getDocumentRoot_D();

		/**
		 * The meta object literal for the '<em><b>Descent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCENT = eINSTANCE.getDocumentRoot_Descent();

		/**
		 * The meta object literal for the '<em><b>Fill Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FILL_RULE = eINSTANCE.getDocumentRoot_FillRule();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_FAMILY = eINSTANCE.getDocumentRoot_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_SIZE = eINSTANCE.getDocumentRoot_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Stretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_STRETCH = eINSTANCE.getDocumentRoot_FontStretch();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_STYLE = eINSTANCE.getDocumentRoot_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_VARIANT = eINSTANCE.getDocumentRoot_FontVariant();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_WEIGHT = eINSTANCE.getDocumentRoot_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Gradient Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRADIENT_TRANSFORM = eINSTANCE.getDocumentRoot_GradientTransform();

		/**
		 * The meta object literal for the '<em><b>Gradient Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRADIENT_UNITS = eINSTANCE.getDocumentRoot_GradientUnits();

		/**
		 * The meta object literal for the '<em><b>Hanging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HANGING = eINSTANCE.getDocumentRoot_Hanging();

		/**
		 * The meta object literal for the '<em><b>Ideographic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IDEOGRAPHIC = eINSTANCE.getDocumentRoot_Ideographic();

		/**
		 * The meta object literal for the '<em><b>Mathematical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MATHEMATICAL = eINSTANCE.getDocumentRoot_Mathematical();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORIGIN = eINSTANCE.getDocumentRoot_Origin();

		/**
		 * The meta object literal for the '<em><b>Overline Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OVERLINE_POSITION = eINSTANCE.getDocumentRoot_OverlinePosition();

		/**
		 * The meta object literal for the '<em><b>Overline Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OVERLINE_THICKNESS = eINSTANCE.getDocumentRoot_OverlineThickness();

		/**
		 * The meta object literal for the '<em><b>Panose1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PANOSE1 = eINSTANCE.getDocumentRoot_Panose1();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PATH = eINSTANCE.getDocumentRoot_Path();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__R = eINSTANCE.getDocumentRoot_R();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RX = eINSTANCE.getDocumentRoot_Rx();

		/**
		 * The meta object literal for the '<em><b>Ry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RY = eINSTANCE.getDocumentRoot_Ry();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SLOPE = eINSTANCE.getDocumentRoot_Slope();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPREAD_METHOD = eINSTANCE.getDocumentRoot_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>Stemh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STEMH = eINSTANCE.getDocumentRoot_Stemh();

		/**
		 * The meta object literal for the '<em><b>Stemv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STEMV = eINSTANCE.getDocumentRoot_Stemv();

		/**
		 * The meta object literal for the '<em><b>Strikethrough Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STRIKETHROUGH_POSITION = eINSTANCE.getDocumentRoot_StrikethroughPosition();

		/**
		 * The meta object literal for the '<em><b>Strikethrough Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS = eINSTANCE.getDocumentRoot_StrikethroughThickness();

		/**
		 * The meta object literal for the '<em><b>Stroke Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STROKE_COLOR = eINSTANCE.getDocumentRoot_StrokeColor();

		/**
		 * The meta object literal for the '<em><b>Stroke Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STROKE_OPACITY = eINSTANCE.getDocumentRoot_StrokeOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STROKE_WIDTH = eINSTANCE.getDocumentRoot_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Underline Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNDERLINE_POSITION = eINSTANCE.getDocumentRoot_UnderlinePosition();

		/**
		 * The meta object literal for the '<em><b>Underline Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNDERLINE_THICKNESS = eINSTANCE.getDocumentRoot_UnderlineThickness();

		/**
		 * The meta object literal for the '<em><b>Unicode Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNICODE_RANGE = eINSTANCE.getDocumentRoot_UnicodeRange();

		/**
		 * The meta object literal for the '<em><b>Units Per Em</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNITS_PER_EM = eINSTANCE.getDocumentRoot_UnitsPerEm();

		/**
		 * The meta object literal for the '<em><b>VAlphabetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALPHABETIC = eINSTANCE.getDocumentRoot_VAlphabetic();

		/**
		 * The meta object literal for the '<em><b>VHanging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VHANGING = eINSTANCE.getDocumentRoot_VHanging();

		/**
		 * The meta object literal for the '<em><b>VIdeographic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VIDEOGRAPHIC = eINSTANCE.getDocumentRoot_VIdeographic();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VIEW_BOX = eINSTANCE.getDocumentRoot_ViewBox();

		/**
		 * The meta object literal for the '<em><b>VMathematical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VMATHEMATICAL = eINSTANCE.getDocumentRoot_VMathematical();

		/**
		 * The meta object literal for the '<em><b>Widths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WIDTHS = eINSTANCE.getDocumentRoot_Widths();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__X1 = eINSTANCE.getDocumentRoot_X1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__X2 = eINSTANCE.getDocumentRoot_X2();

		/**
		 * The meta object literal for the '<em><b>XHeight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__XHEIGHT = eINSTANCE.getDocumentRoot_XHeight();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__Y1 = eINSTANCE.getDocumentRoot_Y1();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__Y2 = eINSTANCE.getDocumentRoot_Y2();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType <em>Fill Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFillRuleType()
		 * @generated
		 */
		EEnum FILL_RULE_TYPE = eINSTANCE.getFillRuleType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType <em>Font Stretch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontStretchType()
		 * @generated
		 */
		EEnum FONT_STRETCH_TYPE = eINSTANCE.getFontStretchType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType <em>Gradient Units Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getGradientUnitsType()
		 * @generated
		 */
		EEnum GRADIENT_UNITS_TYPE = eINSTANCE.getGradientUnitsType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType <em>Spread Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getSpreadMethodType()
		 * @generated
		 */
		EEnum SPREAD_METHOD_TYPE = eINSTANCE.getSpreadMethodType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Cx Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getCxType()
		 * @generated
		 */
		EDataType CX_TYPE = eINSTANCE.getCxType();

		/**
		 * The meta object literal for the '<em>Cy Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getCyType()
		 * @generated
		 */
		EDataType CY_TYPE = eINSTANCE.getCyType();

		/**
		 * The meta object literal for the '<em>Fill Rule Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFillRuleTypeObject()
		 * @generated
		 */
		EDataType FILL_RULE_TYPE_OBJECT = eINSTANCE.getFillRuleTypeObject();

		/**
		 * The meta object literal for the '<em>Font Stretch Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFontStretchTypeObject()
		 * @generated
		 */
		EDataType FONT_STRETCH_TYPE_OBJECT = eINSTANCE.getFontStretchTypeObject();

		/**
		 * The meta object literal for the '<em>Fx Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFxType()
		 * @generated
		 */
		EDataType FX_TYPE = eINSTANCE.getFxType();

		/**
		 * The meta object literal for the '<em>Fy Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getFyType()
		 * @generated
		 */
		EDataType FY_TYPE = eINSTANCE.getFyType();

		/**
		 * The meta object literal for the '<em>Gradient Units Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getGradientUnitsTypeObject()
		 * @generated
		 */
		EDataType GRADIENT_UNITS_TYPE_OBJECT = eINSTANCE.getGradientUnitsTypeObject();

		/**
		 * The meta object literal for the '<em>Height Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getHeightType()
		 * @generated
		 */
		EDataType HEIGHT_TYPE = eINSTANCE.getHeightType();

		/**
		 * The meta object literal for the '<em>Offset Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getOffsetType()
		 * @generated
		 */
		EDataType OFFSET_TYPE = eINSTANCE.getOffsetType();

		/**
		 * The meta object literal for the '<em>RType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getRType()
		 * @generated
		 */
		EDataType RTYPE = eINSTANCE.getRType();

		/**
		 * The meta object literal for the '<em>Spread Method Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getSpreadMethodTypeObject()
		 * @generated
		 */
		EDataType SPREAD_METHOD_TYPE_OBJECT = eINSTANCE.getSpreadMethodTypeObject();

		/**
		 * The meta object literal for the '<em>Stroke Opacity Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityType()
		 * @generated
		 */
		EDataType STROKE_OPACITY_TYPE = eINSTANCE.getStrokeOpacityType();

		/**
		 * The meta object literal for the '<em>Stroke Opacity Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityTypeMember1()
		 * @generated
		 */
		EDataType STROKE_OPACITY_TYPE_MEMBER1 = eINSTANCE.getStrokeOpacityTypeMember1();

		/**
		 * The meta object literal for the '<em>Stroke Opacity Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getStrokeOpacityTypeMember1Object()
		 * @generated
		 */
		EDataType STROKE_OPACITY_TYPE_MEMBER1_OBJECT = eINSTANCE.getStrokeOpacityTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>View Box Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxType()
		 * @generated
		 */
		EDataType VIEW_BOX_TYPE = eINSTANCE.getViewBoxType();

		/**
		 * The meta object literal for the '<em>View Box Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxTypeBase()
		 * @generated
		 */
		EDataType VIEW_BOX_TYPE_BASE = eINSTANCE.getViewBoxTypeBase();

		/**
		 * The meta object literal for the '<em>View Box Type Base Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getViewBoxTypeBaseItem()
		 * @generated
		 */
		EDataType VIEW_BOX_TYPE_BASE_ITEM = eINSTANCE.getViewBoxTypeBaseItem();

		/**
		 * The meta object literal for the '<em>Width Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getWidthType()
		 * @generated
		 */
		EDataType WIDTH_TYPE = eINSTANCE.getWidthType();

		/**
		 * The meta object literal for the '<em>X1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getX1Type()
		 * @generated
		 */
		EDataType X1_TYPE = eINSTANCE.getX1Type();

		/**
		 * The meta object literal for the '<em>X2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getX2Type()
		 * @generated
		 */
		EDataType X2_TYPE = eINSTANCE.getX2Type();

		/**
		 * The meta object literal for the '<em>XType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getXType()
		 * @generated
		 */
		EDataType XTYPE = eINSTANCE.getXType();

		/**
		 * The meta object literal for the '<em>XType1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getXType1()
		 * @generated
		 */
		EDataType XTYPE1 = eINSTANCE.getXType1();

		/**
		 * The meta object literal for the '<em>Y1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getY1Type()
		 * @generated
		 */
		EDataType Y1_TYPE = eINSTANCE.getY1Type();

		/**
		 * The meta object literal for the '<em>Y2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getY2Type()
		 * @generated
		 */
		EDataType Y2_TYPE = eINSTANCE.getY2Type();

		/**
		 * The meta object literal for the '<em>YType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getYType()
		 * @generated
		 */
		EDataType YTYPE = eINSTANCE.getYType();

		/**
		 * The meta object literal for the '<em>YType1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl#getYType1()
		 * @generated
		 */
		EDataType YTYPE1 = eINSTANCE.getYType1();

	}

} //SvgPackage
