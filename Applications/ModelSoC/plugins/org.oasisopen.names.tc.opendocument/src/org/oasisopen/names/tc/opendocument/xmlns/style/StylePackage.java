/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleFactory
 * @model kind="package"
 * @generated
 */
public interface StylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "style";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:style:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfstyle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StylePackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl <em>Background Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getBackgroundImageType()
	 * @generated
	 */
	int BACKGROUND_IMAGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Binary Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__BINARY_DATA = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__FILTER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__OPACITY = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__POSITION = 5;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__REPEAT = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Background Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl <em>Column Sep Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getColumnSepType()
	 * @generated
	 */
	int COLUMN_SEP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE__VERTICAL_ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE__WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Column Sep Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SEP_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl <em>Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getColumnsType()
	 * @generated
	 */
	int COLUMNS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Column Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_TYPE__COLUMN_SEP = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_TYPE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_TYPE__COLUMN_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_TYPE__COLUMN_GAP = 3;

	/**
	 * The number of structural features of the '<em>Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__END_INDENT = 0;

	/**
	 * The feature id for the '<em><b>Rel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__REL_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__SPACE_AFTER = 2;

	/**
	 * The feature id for the '<em><b>Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__SPACE_BEFORE = 3;

	/**
	 * The feature id for the '<em><b>Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__START_INDENT = 4;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DropCapTypeImpl <em>Drop Cap Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.DropCapTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDropCapType()
	 * @generated
	 */
	int DROP_CAP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CAP_TYPE__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CAP_TYPE__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CAP_TYPE__LINES = 2;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CAP_TYPE__STYLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Drop Cap Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CAP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl <em>Font Face Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFontFaceType()
	 * @generated
	 */
	int FONT_FACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Font Face Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_FACE_SRC = 0;

	/**
	 * The feature id for the '<em><b>Definition Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__DEFINITION_SRC = 1;

	/**
	 * The feature id for the '<em><b>Accent Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__ACCENT_HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Alphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__ALPHABETIC = 3;

	/**
	 * The feature id for the '<em><b>Ascent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__ASCENT = 4;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__BBOX = 5;

	/**
	 * The feature id for the '<em><b>Cap Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__CAP_HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Descent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__DESCENT = 7;

	/**
	 * The feature id for the '<em><b>Font Adornments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_ADORNMENTS = 8;

	/**
	 * The feature id for the '<em><b>Font Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_CHARSET = 9;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_FAMILY = 10;

	/**
	 * The feature id for the '<em><b>Font Family Generic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_FAMILY_GENERIC = 11;

	/**
	 * The feature id for the '<em><b>Font Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_PITCH = 12;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Font Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_STRETCH = 14;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_STYLE = 15;

	/**
	 * The feature id for the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_VARIANT = 16;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__FONT_WEIGHT = 17;

	/**
	 * The feature id for the '<em><b>Hanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__HANGING = 18;

	/**
	 * The feature id for the '<em><b>Ideographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__IDEOGRAPHIC = 19;

	/**
	 * The feature id for the '<em><b>Mathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__MATHEMATICAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__NAME = 21;

	/**
	 * The feature id for the '<em><b>Overline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__OVERLINE_POSITION = 22;

	/**
	 * The feature id for the '<em><b>Overline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__OVERLINE_THICKNESS = 23;

	/**
	 * The feature id for the '<em><b>Panose1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__PANOSE1 = 24;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__SLOPE = 25;

	/**
	 * The feature id for the '<em><b>Stemh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__STEMH = 26;

	/**
	 * The feature id for the '<em><b>Stemv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__STEMV = 27;

	/**
	 * The feature id for the '<em><b>Strikethrough Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__STRIKETHROUGH_POSITION = 28;

	/**
	 * The feature id for the '<em><b>Strikethrough Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS = 29;

	/**
	 * The feature id for the '<em><b>Underline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__UNDERLINE_POSITION = 30;

	/**
	 * The feature id for the '<em><b>Underline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__UNDERLINE_THICKNESS = 31;

	/**
	 * The feature id for the '<em><b>Unicode Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__UNICODE_RANGE = 32;

	/**
	 * The feature id for the '<em><b>Units Per Em</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__UNITS_PER_EM = 33;

	/**
	 * The feature id for the '<em><b>VAlphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__VALPHABETIC = 34;

	/**
	 * The feature id for the '<em><b>VHanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__VHANGING = 35;

	/**
	 * The feature id for the '<em><b>VIdeographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__VIDEOGRAPHIC = 36;

	/**
	 * The feature id for the '<em><b>VMathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__VMATHEMATICAL = 37;

	/**
	 * The feature id for the '<em><b>Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__WIDTHS = 38;

	/**
	 * The feature id for the '<em><b>XHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE__XHEIGHT = 39;

	/**
	 * The number of structural features of the '<em>Font Face Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_TYPE_FEATURE_COUNT = 40;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterLeftTypeImpl <em>Footer Left Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterLeftTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFooterLeftType()
	 * @generated
	 */
	int FOOTER_LEFT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__TRACKED_CHANGES = TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__VARIABLE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__SEQUENCE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__USER_FIELD_DECLS = TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__DDE_CONNECTION_DECLS = TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__GROUP = TextPackage.HEADER_FOOTER_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__H = TextPackage.HEADER_FOOTER_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__P = TextPackage.HEADER_FOOTER_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__LIST = TextPackage.HEADER_FOOTER_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__TABLE = TextPackage.HEADER_FOOTER_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__SECTION = TextPackage.HEADER_FOOTER_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__TABLE_OF_CONTENT = TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__ILLUSTRATION_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__TABLE_INDEX = TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__OBJECT_INDEX = TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__USER_INDEX = TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__ALPHABETICAL_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__BIBLIOGRAPHY = TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Index Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__INDEX_TITLE = TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__CHANGE_MARKS_GROUP = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__CHANGE_MARKS = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__REGION_LEFT = TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT;

	/**
	 * The feature id for the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__REGION_CENTER = TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER;

	/**
	 * The feature id for the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__REGION_RIGHT = TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE__DISPLAY = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Footer Left Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_LEFT_TYPE_FEATURE_COUNT = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterStyleTypeImpl <em>Footer Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFooterStyleType()
	 * @generated
	 */
	int FOOTER_STYLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Footer Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_STYLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterTypeImpl <em>Footer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.FooterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFooterType()
	 * @generated
	 */
	int FOOTER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__TRACKED_CHANGES = TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__VARIABLE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__SEQUENCE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__USER_FIELD_DECLS = TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__DDE_CONNECTION_DECLS = TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__GROUP = TextPackage.HEADER_FOOTER_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__H = TextPackage.HEADER_FOOTER_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__P = TextPackage.HEADER_FOOTER_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__LIST = TextPackage.HEADER_FOOTER_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__TABLE = TextPackage.HEADER_FOOTER_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__SECTION = TextPackage.HEADER_FOOTER_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__TABLE_OF_CONTENT = TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__ILLUSTRATION_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__TABLE_INDEX = TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__OBJECT_INDEX = TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__USER_INDEX = TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__ALPHABETICAL_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__BIBLIOGRAPHY = TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Index Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__INDEX_TITLE = TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__CHANGE_MARKS_GROUP = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__CHANGE_MARKS = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__REGION_LEFT = TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT;

	/**
	 * The feature id for the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__REGION_CENTER = TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER;

	/**
	 * The feature id for the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__REGION_RIGHT = TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__DISPLAY = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Footer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE_FEATURE_COUNT = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl <em>Footnote Sep Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFootnoteSepType()
	 * @generated
	 */
	int FOOTNOTE_SEP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__ADJUSTMENT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Distance After Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP = 2;

	/**
	 * The feature id for the '<em><b>Distance Before Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP = 3;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__LINE_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Rel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__REL_WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE__WIDTH = 6;

	/**
	 * The number of structural features of the '<em>Footnote Sep Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_SEP_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl <em>Handout Master Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHandoutMasterType()
	 * @generated
	 */
	int HANDOUT_MASTER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__RECT = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__LINE = 2;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__POLYLINE = 3;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__POLYGON = 4;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__REGULAR_POLYGON = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__CIRCLE = 7;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__ELLIPSE = 8;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__G = 9;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL = 10;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__FRAME = 11;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__CAPTION = 13;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__CONTROL = 15;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__SCENE = 16;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__CUSTOM_SHAPE = 17;

	/**
	 * The feature id for the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME = 18;

	/**
	 * The feature id for the '<em><b>Presentation Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Use Date Time Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME = 21;

	/**
	 * The feature id for the '<em><b>Use Footer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__USE_FOOTER_NAME = 22;

	/**
	 * The feature id for the '<em><b>Use Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE__USE_HEADER_NAME = 23;

	/**
	 * The number of structural features of the '<em>Handout Master Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDOUT_MASTER_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderLeftTypeImpl <em>Header Left Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderLeftTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHeaderLeftType()
	 * @generated
	 */
	int HEADER_LEFT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__TRACKED_CHANGES = TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__VARIABLE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__SEQUENCE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__USER_FIELD_DECLS = TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__DDE_CONNECTION_DECLS = TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__GROUP = TextPackage.HEADER_FOOTER_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__H = TextPackage.HEADER_FOOTER_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__P = TextPackage.HEADER_FOOTER_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__LIST = TextPackage.HEADER_FOOTER_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__TABLE = TextPackage.HEADER_FOOTER_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__SECTION = TextPackage.HEADER_FOOTER_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__TABLE_OF_CONTENT = TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__ILLUSTRATION_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__TABLE_INDEX = TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__OBJECT_INDEX = TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__USER_INDEX = TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__ALPHABETICAL_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__BIBLIOGRAPHY = TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Index Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__INDEX_TITLE = TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__CHANGE_MARKS_GROUP = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__CHANGE_MARKS = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__REGION_LEFT = TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT;

	/**
	 * The feature id for the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__REGION_CENTER = TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER;

	/**
	 * The feature id for the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__REGION_RIGHT = TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE__DISPLAY = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header Left Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LEFT_TYPE_FEATURE_COUNT = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderStyleTypeImpl <em>Header Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHeaderStyleType()
	 * @generated
	 */
	int HEADER_STYLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Header Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_STYLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TRACKED_CHANGES = TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__VARIABLE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__SEQUENCE_DECLS = TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__USER_FIELD_DECLS = TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DDE_CONNECTION_DECLS = TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__GROUP = TextPackage.HEADER_FOOTER_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__H = TextPackage.HEADER_FOOTER_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__P = TextPackage.HEADER_FOOTER_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__LIST = TextPackage.HEADER_FOOTER_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TABLE = TextPackage.HEADER_FOOTER_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__SECTION = TextPackage.HEADER_FOOTER_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TABLE_OF_CONTENT = TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ILLUSTRATION_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TABLE_INDEX = TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__OBJECT_INDEX = TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__USER_INDEX = TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ALPHABETICAL_INDEX = TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__BIBLIOGRAPHY = TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Index Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__INDEX_TITLE = TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CHANGE_MARKS_GROUP = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CHANGE_MARKS = TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__REGION_LEFT = TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT;

	/**
	 * The feature id for the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__REGION_CENTER = TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER;

	/**
	 * The feature id for the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__REGION_RIGHT = TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DISPLAY = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = TextPackage.HEADER_FOOTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.MapTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Apply Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__APPLY_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__BASE_CELL_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl <em>Master Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMasterPageType()
	 * @generated
	 */
	int MASTER_PAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Header Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__HEADER_LEFT = 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__FOOTER = 2;

	/**
	 * The feature id for the '<em><b>Footer Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__FOOTER_LEFT = 3;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__FORMS = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__RECT = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__LINE = 8;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__POLYLINE = 9;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__POLYGON = 10;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__REGULAR_POLYGON = 11;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__PATH = 12;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__CIRCLE = 13;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__ELLIPSE = 14;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__G = 15;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__PAGE_THUMBNAIL = 16;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__FRAME = 17;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__MEASURE = 18;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__CAPTION = 19;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__CONNECTOR = 20;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__CONTROL = 21;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__SCENE = 22;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__CUSTOM_SHAPE = 23;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__NOTES = 24;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__DISPLAY_NAME = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Next Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__NEXT_STYLE_NAME = 27;

	/**
	 * The feature id for the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME = 28;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE__STYLE_NAME = 29;

	/**
	 * The number of structural features of the '<em>Master Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_PAGE_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl <em>Page Layout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageLayoutType()
	 * @generated
	 */
	int PAGE_LAYOUT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Page Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Header Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE__HEADER_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Footer Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE__FOOTER_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Page Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE__PAGE_USAGE = 4;

	/**
	 * The number of structural features of the '<em>Page Layout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LAYOUT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PresentationPageLayoutTypeImpl <em>Presentation Page Layout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.PresentationPageLayoutTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPresentationPageLayoutType()
	 * @generated
	 */
	int PRESENTATION_PAGE_LAYOUT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_PAGE_LAYOUT_TYPE__PLACEHOLDER = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_PAGE_LAYOUT_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_PAGE_LAYOUT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Presentation Page Layout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_PAGE_LAYOUT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl <em>Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getStyleType1()
	 * @generated
	 */
	int STYLE_TYPE1 = 18;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TEXT_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Paragraph Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__PARAGRAPH_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Text Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TEXT_PROPERTIES1 = TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1;

	/**
	 * The feature id for the '<em><b>Section Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__SECTION_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Ruby Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__RUBY_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Table Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TABLE_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Table Column Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TABLE_COLUMN_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Table Row Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TABLE_ROW_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Table Cell Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TABLE_CELL_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Paragraph Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__PARAGRAPH_PROPERTIES1 = TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1;

	/**
	 * The feature id for the '<em><b>Text Properties2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TEXT_PROPERTIES2 = TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2;

	/**
	 * The feature id for the '<em><b>Graphic Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__GRAPHIC_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Paragraph Properties2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__PARAGRAPH_PROPERTIES2 = TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2;

	/**
	 * The feature id for the '<em><b>Text Properties3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TEXT_PROPERTIES3 = TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3;

	/**
	 * The feature id for the '<em><b>Drawing Page Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__DRAWING_PAGE_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Chart Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__CHART_PROPERTIES = TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Graphic Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__GRAPHIC_PROPERTIES1 = TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1;

	/**
	 * The feature id for the '<em><b>Paragraph Properties3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__PARAGRAPH_PROPERTIES3 = TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3;

	/**
	 * The feature id for the '<em><b>Text Properties4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__TEXT_PROPERTIES4 = TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__FAMILY = TextPackage.STYLE_STYLE_CONTENT__FAMILY;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__MAP = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__AUTO_UPDATE = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__CLASS = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__DATA_STYLE_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__DISPLAY_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>List Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__LIST_STYLE_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__MASTER_PAGE_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__NEXT_STYLE_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1__PARENT_STYLE_NAME = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE1_FEATURE_COUNT = TextPackage.STYLE_STYLE_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopsTypeImpl <em>Tab Stops Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTabStopsType()
	 * @generated
	 */
	int TAB_STOPS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOPS_TYPE__TAB_STOP = 0;

	/**
	 * The number of structural features of the '<em>Tab Stops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

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
	 * The feature id for the '<em><b>Background Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Chart Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHART_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMNS = 6;

	/**
	 * The feature id for the '<em><b>Column Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_SEP = 7;

	/**
	 * The feature id for the '<em><b>Default Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Drawing Page Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Drop Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_CAP = 10;

	/**
	 * The feature id for the '<em><b>Font Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE = 11;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER = 12;

	/**
	 * The feature id for the '<em><b>Footer Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Footer Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER_STYLE = 14;

	/**
	 * The feature id for the '<em><b>Footnote Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTNOTE_SEP = 15;

	/**
	 * The feature id for the '<em><b>Graphic Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRAPHIC_PROPERTIES = 16;

	/**
	 * The feature id for the '<em><b>Handout Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDOUT_MASTER = 17;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER = 18;

	/**
	 * The feature id for the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES = 19;

	/**
	 * The feature id for the '<em><b>Header Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_LEFT = 20;

	/**
	 * The feature id for the '<em><b>Header Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_STYLE = 21;

	/**
	 * The feature id for the '<em><b>List Level Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES = 22;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAP = 23;

	/**
	 * The feature id for the '<em><b>Master Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_PAGE = 24;

	/**
	 * The feature id for the '<em><b>Page Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_LAYOUT = 25;

	/**
	 * The feature id for the '<em><b>Page Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES = 26;

	/**
	 * The feature id for the '<em><b>Paragraph Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAGRAPH_PROPERTIES = 27;

	/**
	 * The feature id for the '<em><b>Presentation Page Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT = 28;

	/**
	 * The feature id for the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION_CENTER = 29;

	/**
	 * The feature id for the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION_LEFT = 30;

	/**
	 * The feature id for the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION_RIGHT = 31;

	/**
	 * The feature id for the '<em><b>Ruby Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY_PROPERTIES = 32;

	/**
	 * The feature id for the '<em><b>Section Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECTION_PROPERTIES = 33;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 34;

	/**
	 * The feature id for the '<em><b>Table Cell Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_CELL_PROPERTIES = 35;

	/**
	 * The feature id for the '<em><b>Table Column Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES = 36;

	/**
	 * The feature id for the '<em><b>Table Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_PROPERTIES = 37;

	/**
	 * The feature id for the '<em><b>Table Row Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_ROW_PROPERTIES = 38;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_STOP = 39;

	/**
	 * The feature id for the '<em><b>Tab Stops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_STOPS = 40;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_PROPERTIES = 41;

	/**
	 * The feature id for the '<em><b>Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADJUSTMENT = 42;

	/**
	 * The feature id for the '<em><b>Apply Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLY_STYLE_NAME = 43;

	/**
	 * The feature id for the '<em><b>Auto Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_TEXT_INDENT = 44;

	/**
	 * The feature id for the '<em><b>Auto Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_UPDATE = 45;

	/**
	 * The feature id for the '<em><b>Background Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY = 46;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE_CELL_ADDRESS = 47;

	/**
	 * The feature id for the '<em><b>Border Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LINE_WIDTH = 48;

	/**
	 * The feature id for the '<em><b>Border Line Width Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM = 49;

	/**
	 * The feature id for the '<em><b>Border Line Width Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT = 50;

	/**
	 * The feature id for the '<em><b>Border Line Width Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT = 51;

	/**
	 * The feature id for the '<em><b>Border Line Width Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP = 52;

	/**
	 * The feature id for the '<em><b>Cell Protect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_PROTECT = 53;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHAR = 54;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 55;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR = 56;

	/**
	 * The feature id for the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_WIDTH = 57;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION = 58;

	/**
	 * The feature id for the '<em><b>Country Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY_ASIAN = 59;

	/**
	 * The feature id for the '<em><b>Country Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY_COMPLEX = 60;

	/**
	 * The feature id for the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_STYLE_NAME = 61;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL_PLACES = 62;

	/**
	 * The feature id for the '<em><b>Default Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL = 63;

	/**
	 * The feature id for the '<em><b>Diagonal Bl Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGONAL_BL_TR = 64;

	/**
	 * The feature id for the '<em><b>Diagonal Bl Tr Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS = 65;

	/**
	 * The feature id for the '<em><b>Diagonal Tl Br</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGONAL_TL_BR = 66;

	/**
	 * The feature id for the '<em><b>Diagonal Tl Br Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS = 67;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTION = 68;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY = 69;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_NAME = 70;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE = 71;

	/**
	 * The feature id for the '<em><b>Distance After Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE_AFTER_SEP = 72;

	/**
	 * The feature id for the '<em><b>Distance Before Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE_BEFORE_SEP = 73;

	/**
	 * The feature id for the '<em><b>Dynamic Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DYNAMIC_SPACING = 74;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDITABLE = 75;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAMILY = 76;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_NAME = 77;

	/**
	 * The feature id for the '<em><b>First Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRST_PAGE_NUMBER = 78;

	/**
	 * The feature id for the '<em><b>Flow With Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOW_WITH_TEXT = 79;

	/**
	 * The feature id for the '<em><b>Font Adornments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_ADORNMENTS = 80;

	/**
	 * The feature id for the '<em><b>Font Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_CHARSET = 81;

	/**
	 * The feature id for the '<em><b>Font Charset Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_CHARSET_ASIAN = 82;

	/**
	 * The feature id for the '<em><b>Font Charset Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_CHARSET_COMPLEX = 83;

	/**
	 * The feature id for the '<em><b>Font Family Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY_ASIAN = 84;

	/**
	 * The feature id for the '<em><b>Font Family Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY_COMPLEX = 85;

	/**
	 * The feature id for the '<em><b>Font Family Generic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY_GENERIC = 86;

	/**
	 * The feature id for the '<em><b>Font Family Generic Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN = 87;

	/**
	 * The feature id for the '<em><b>Font Family Generic Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX = 88;

	/**
	 * The feature id for the '<em><b>Font Independent Line Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING = 89;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_NAME = 90;

	/**
	 * The feature id for the '<em><b>Font Name Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_NAME_ASIAN = 91;

	/**
	 * The feature id for the '<em><b>Font Name Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_NAME_COMPLEX = 92;

	/**
	 * The feature id for the '<em><b>Font Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_PITCH = 93;

	/**
	 * The feature id for the '<em><b>Font Pitch Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_PITCH_ASIAN = 94;

	/**
	 * The feature id for the '<em><b>Font Pitch Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_PITCH_COMPLEX = 95;

	/**
	 * The feature id for the '<em><b>Font Relief</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_RELIEF = 96;

	/**
	 * The feature id for the '<em><b>Font Size Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE_ASIAN = 97;

	/**
	 * The feature id for the '<em><b>Font Size Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE_COMPLEX = 98;

	/**
	 * The feature id for the '<em><b>Font Size Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE_REL = 99;

	/**
	 * The feature id for the '<em><b>Font Size Rel Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN = 100;

	/**
	 * The feature id for the '<em><b>Font Size Rel Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX = 101;

	/**
	 * The feature id for the '<em><b>Font Style Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE_ASIAN = 102;

	/**
	 * The feature id for the '<em><b>Font Style Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE_COMPLEX = 103;

	/**
	 * The feature id for the '<em><b>Font Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE_NAME = 104;

	/**
	 * The feature id for the '<em><b>Font Style Name Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN = 105;

	/**
	 * The feature id for the '<em><b>Font Style Name Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX = 106;

	/**
	 * The feature id for the '<em><b>Font Weight Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_WEIGHT_ASIAN = 107;

	/**
	 * The feature id for the '<em><b>Font Weight Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX = 108;

	/**
	 * The feature id for the '<em><b>Footnote Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT = 109;

	/**
	 * The feature id for the '<em><b>Glyph Orientation Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL = 110;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEIGHT = 111;

	/**
	 * The feature id for the '<em><b>Horizontal Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HORIZONTAL_POS = 112;

	/**
	 * The feature id for the '<em><b>Horizontal Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HORIZONTAL_REL = 113;

	/**
	 * The feature id for the '<em><b>Justify Single Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD = 114;

	/**
	 * The feature id for the '<em><b>Language Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE_ASIAN = 115;

	/**
	 * The feature id for the '<em><b>Language Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE_COMPLEX = 116;

	/**
	 * The feature id for the '<em><b>Layout Grid Base Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT = 117;

	/**
	 * The feature id for the '<em><b>Layout Grid Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_COLOR = 118;

	/**
	 * The feature id for the '<em><b>Layout Grid Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY = 119;

	/**
	 * The feature id for the '<em><b>Layout Grid Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_LINES = 120;

	/**
	 * The feature id for the '<em><b>Layout Grid Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_MODE = 121;

	/**
	 * The feature id for the '<em><b>Layout Grid Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_PRINT = 122;

	/**
	 * The feature id for the '<em><b>Layout Grid Ruby Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW = 123;

	/**
	 * The feature id for the '<em><b>Layout Grid Ruby Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT = 124;

	/**
	 * The feature id for the '<em><b>Leader Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_CHAR = 125;

	/**
	 * The feature id for the '<em><b>Leader Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_COLOR = 126;

	/**
	 * The feature id for the '<em><b>Leader Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_STYLE = 127;

	/**
	 * The feature id for the '<em><b>Leader Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_TEXT = 128;

	/**
	 * The feature id for the '<em><b>Leader Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_TEXT_STYLE = 129;

	/**
	 * The feature id for the '<em><b>Leader Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Leader Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER_WIDTH = 131;

	/**
	 * The feature id for the '<em><b>Legend Expansion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND_EXPANSION = 132;

	/**
	 * The feature id for the '<em><b>Legend Expansion Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO = 133;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LENGTH = 134;

	/**
	 * The feature id for the '<em><b>Letter Kerning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LETTER_KERNING = 135;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_BREAK = 136;

	/**
	 * The feature id for the '<em><b>Line Height At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST = 137;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINES = 138;

	/**
	 * The feature id for the '<em><b>Line Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_SPACING = 139;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STYLE = 140;

	/**
	 * The feature id for the '<em><b>List Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STYLE_NAME = 141;

	/**
	 * The feature id for the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_PAGE_NAME = 142;

	/**
	 * The feature id for the '<em><b>May Break Between Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS = 143;

	/**
	 * The feature id for the '<em><b>Min Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_ROW_HEIGHT = 144;

	/**
	 * The feature id for the '<em><b>Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIRROR = 145;

	/**
	 * The feature id for the '<em><b>Next Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEXT_STYLE_NAME = 146;

	/**
	 * The feature id for the '<em><b>Number Wrapped Paragraphs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS = 147;

	/**
	 * The feature id for the '<em><b>Num Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUM_FORMAT = 148;

	/**
	 * The feature id for the '<em><b>Num Letter Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUM_LETTER_SYNC = 149;

	/**
	 * The feature id for the '<em><b>Num Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUM_PREFIX = 150;

	/**
	 * The feature id for the '<em><b>Num Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUM_SUFFIX = 151;

	/**
	 * The feature id for the '<em><b>Overflow Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERFLOW_BEHAVIOR = 152;

	/**
	 * The feature id for the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_LAYOUT_NAME = 153;

	/**
	 * The feature id for the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_NUMBER = 154;

	/**
	 * The feature id for the '<em><b>Page Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_USAGE = 155;

	/**
	 * The feature id for the '<em><b>Paper Tray Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAPER_TRAY_NAME = 156;

	/**
	 * The feature id for the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARENT_STYLE_NAME = 157;

	/**
	 * The feature id for the '<em><b>Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT = 158;

	/**
	 * The feature id for the '<em><b>Print Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT_CONTENT = 159;

	/**
	 * The feature id for the '<em><b>Print Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT_ORIENTATION = 160;

	/**
	 * The feature id for the '<em><b>Print Page Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT_PAGE_ORDER = 161;

	/**
	 * The feature id for the '<em><b>Punctuation Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUNCTUATION_WRAP = 162;

	/**
	 * The feature id for the '<em><b>Register True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTER_TRUE = 163;

	/**
	 * The feature id for the '<em><b>Register Truth Ref Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME = 164;

	/**
	 * The feature id for the '<em><b>Rel Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REL_COLUMN_WIDTH = 165;

	/**
	 * The feature id for the '<em><b>Rel Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REL_HEIGHT = 166;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT = 167;

	/**
	 * The feature id for the '<em><b>Repeat Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT_CONTENT = 168;

	/**
	 * The feature id for the '<em><b>Rotation Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATION_ALIGN = 169;

	/**
	 * The feature id for the '<em><b>Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATION_ANGLE = 170;

	/**
	 * The feature id for the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROW_HEIGHT = 171;

	/**
	 * The feature id for the '<em><b>Ruby Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY_ALIGN = 172;

	/**
	 * The feature id for the '<em><b>Ruby Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY_POSITION = 173;

	/**
	 * The feature id for the '<em><b>Run Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUN_THROUGH = 174;

	/**
	 * The feature id for the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE_TO = 175;

	/**
	 * The feature id for the '<em><b>Scale To Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE_TO_PAGES = 176;

	/**
	 * The feature id for the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT_TYPE = 177;

	/**
	 * The feature id for the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADOW = 178;

	/**
	 * The feature id for the '<em><b>Shrink To Fit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHRINK_TO_FIT = 179;

	/**
	 * The feature id for the '<em><b>Snap To Layout Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID = 180;

	/**
	 * The feature id for the '<em><b>Style1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE1 = 181;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_NAME = 182;

	/**
	 * The feature id for the '<em><b>Table Centering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_CENTERING = 183;

	/**
	 * The feature id for the '<em><b>Tab Stop Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_STOP_DISTANCE = 184;

	/**
	 * The feature id for the '<em><b>Text Align Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ALIGN_SOURCE = 185;

	/**
	 * The feature id for the '<em><b>Text Autospace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_AUTOSPACE = 186;

	/**
	 * The feature id for the '<em><b>Text Blinking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_BLINKING = 187;

	/**
	 * The feature id for the '<em><b>Text Combine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_COMBINE = 188;

	/**
	 * The feature id for the '<em><b>Text Combine End Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR = 189;

	/**
	 * The feature id for the '<em><b>Text Combine Start Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR = 190;

	/**
	 * The feature id for the '<em><b>Text Emphasize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_EMPHASIZE = 191;

	/**
	 * The feature id for the '<em><b>Text Line Through Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR = 192;

	/**
	 * The feature id for the '<em><b>Text Line Through Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE = 193;

	/**
	 * The feature id for the '<em><b>Text Line Through Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE = 194;

	/**
	 * The feature id for the '<em><b>Text Line Through Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT = 195;

	/**
	 * The feature id for the '<em><b>Text Line Through Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE = 196;

	/**
	 * The feature id for the '<em><b>Text Line Through Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE = 197;

	/**
	 * The feature id for the '<em><b>Text Line Through Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH = 198;

	/**
	 * The feature id for the '<em><b>Text Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_OUTLINE = 199;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_POSITION = 200;

	/**
	 * The feature id for the '<em><b>Text Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ROTATION_ANGLE = 201;

	/**
	 * The feature id for the '<em><b>Text Rotation Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ROTATION_SCALE = 202;

	/**
	 * The feature id for the '<em><b>Text Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_SCALE = 203;

	/**
	 * The feature id for the '<em><b>Text Underline Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR = 204;

	/**
	 * The feature id for the '<em><b>Text Underline Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_UNDERLINE_MODE = 205;

	/**
	 * The feature id for the '<em><b>Text Underline Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE = 206;

	/**
	 * The feature id for the '<em><b>Text Underline Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE = 207;

	/**
	 * The feature id for the '<em><b>Text Underline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH = 208;

	/**
	 * The feature id for the '<em><b>Use Optimal Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH = 209;

	/**
	 * The feature id for the '<em><b>Use Optimal Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT = 210;

	/**
	 * The feature id for the '<em><b>Use Window Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR = 211;

	/**
	 * The feature id for the '<em><b>Vertical Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERTICAL_POS = 212;

	/**
	 * The feature id for the '<em><b>Vertical Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERTICAL_REL = 213;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VOLATILE = 214;

	/**
	 * The feature id for the '<em><b>Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP = 215;

	/**
	 * The feature id for the '<em><b>Wrap Contour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP_CONTOUR = 216;

	/**
	 * The feature id for the '<em><b>Wrap Contour Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP_CONTOUR_MODE = 217;

	/**
	 * The feature id for the '<em><b>Wrap Dynamic Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD = 218;

	/**
	 * The feature id for the '<em><b>Writing Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRITING_MODE = 219;

	/**
	 * The feature id for the '<em><b>Writing Mode Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC = 220;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 221;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl <em>Tab Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTabStopType()
	 * @generated
	 */
	int TAB_STOP_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__CHAR = 0;

	/**
	 * The feature id for the '<em><b>Leader Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Leader Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Leader Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Leader Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_TEXT_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Leader Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Leader Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__LEADER_WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__POSITION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Tab Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOP_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType <em>Adjustment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getAdjustmentType()
	 * @generated
	 */
	int ADJUSTMENT_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0 <em>Cell Protect Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember0()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER0 = 23;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1 <em>Cell Protect Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember1()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER1 = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem <em>Cell Protect Type Member2 Base Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember2BaseItem()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM = 25;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType <em>Family Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFamilyType()
	 * @generated
	 */
	int FAMILY_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1 <em>First Page Number Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFirstPageNumberTypeMember1()
	 * @generated
	 */
	int FIRST_PAGE_NUMBER_TYPE_MEMBER1 = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType <em>Font Relief Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFontReliefType()
	 * @generated
	 */
	int FONT_RELIEF_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType <em>Glyph Orientation Vertical Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getGlyphOrientationVerticalType()
	 * @generated
	 */
	int GLYPH_ORIENTATION_VERTICAL_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType <em>Horizontal Pos Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHorizontalPosType()
	 * @generated
	 */
	int HORIZONTAL_POS_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType <em>Horizontal Rel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHorizontalRelType()
	 * @generated
	 */
	int HORIZONTAL_REL_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType <em>Layout Grid Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLayoutGridModeType()
	 * @generated
	 */
	int LAYOUT_GRID_MODE_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1 <em>Leader Color Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLeaderColorTypeMember1()
	 * @generated
	 */
	int LEADER_COLOR_TYPE_MEMBER1 = 34;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType <em>Legend Expansion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLegendExpansionType()
	 * @generated
	 */
	int LEGEND_EXPANSION_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1 <em>Length Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLengthTypeMember1()
	 * @generated
	 */
	int LENGTH_TYPE_MEMBER1 = 36;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType <em>Line Break Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLineBreakType()
	 * @generated
	 */
	int LINE_BREAK_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1 <em>Mirror Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember1()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER1 = 38;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2 <em>Mirror Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember2()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER2 = 39;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1 <em>Mirror Type Member3 Base Item Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember3BaseItemMember1()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1 = 40;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1 <em>Mirror Type Member4 Base Item Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember4BaseItemMember1()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1 = 41;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1 <em>Number Wrapped Paragraphs Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumberWrappedParagraphsTypeMember1()
	 * @generated
	 */
	int NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1 = 42;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1 <em>Num Format Type Member0 Member0 Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member1()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1 = 43;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2 <em>Num Format Type Member0 Member0 Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member2()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2 = 44;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3 <em>Num Format Type Member0 Member0 Member3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member3()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3 = 45;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1 <em>Num Format Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember1()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER1 = 46;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType <em>Overflow Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getOverflowBehaviorType()
	 * @generated
	 */
	int OVERFLOW_BEHAVIOR_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1 <em>Page Number Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageNumberTypeMember1()
	 * @generated
	 */
	int PAGE_NUMBER_TYPE_MEMBER1 = 48;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType <em>Page Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageUsageType()
	 * @generated
	 */
	int PAGE_USAGE_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1 <em>Paper Tray Name Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPaperTrayNameTypeMember1()
	 * @generated
	 */
	int PAPER_TRAY_NAME_TYPE_MEMBER1 = 50;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0 <em>Position Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember0()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER0 = 51;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1 <em>Position Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember1()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER1 = 52;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2 <em>Position Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember2()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER2 = 53;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3 <em>Position Type Member3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember3()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER3 = 54;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4 <em>Position Type Member4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember4()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER4 = 55;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType <em>Print Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintOrientationType()
	 * @generated
	 */
	int PRINT_ORIENTATION_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType <em>Print Page Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintPageOrderType()
	 * @generated
	 */
	int PRINT_PAGE_ORDER_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem <em>Print Type Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintTypeItem()
	 * @generated
	 */
	int PRINT_TYPE_ITEM = 58;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType <em>Punctuation Wrap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPunctuationWrapType()
	 * @generated
	 */
	int PUNCTUATION_WRAP_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1 <em>Rel Height Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelHeightTypeMember1()
	 * @generated
	 */
	int REL_HEIGHT_TYPE_MEMBER1 = 60;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2 <em>Rel Height Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelHeightTypeMember2()
	 * @generated
	 */
	int REL_HEIGHT_TYPE_MEMBER2 = 61;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1 <em>Rel Width Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelWidthTypeMember1()
	 * @generated
	 */
	int REL_WIDTH_TYPE_MEMBER1 = 62;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2 <em>Rel Width Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelWidthTypeMember2()
	 * @generated
	 */
	int REL_WIDTH_TYPE_MEMBER2 = 63;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType <em>Repeat Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRepeatType()
	 * @generated
	 */
	int REPEAT_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType <em>Rotation Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRotationAlignType()
	 * @generated
	 */
	int ROTATION_ALIGN_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType <em>Ruby Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRubyAlignType()
	 * @generated
	 */
	int RUBY_ALIGN_TYPE = 66;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType <em>Ruby Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRubyPositionType()
	 * @generated
	 */
	int RUBY_POSITION_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType <em>Run Through Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRunThroughType()
	 * @generated
	 */
	int RUN_THROUGH_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType <em>Script Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getScriptTypeType()
	 * @generated
	 */
	int SCRIPT_TYPE_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType <em>Text Autospace Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextAutospaceType()
	 * @generated
	 */
	int TEXT_AUTOSPACE_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType <em>Text Combine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextCombineType()
	 * @generated
	 */
	int TEXT_COMBINE_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0 <em>Text Emphasize Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember0()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER0 = 73;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem <em>Text Emphasize Type Member1 Base Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember1BaseItem()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM = 74;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1 <em>Text Line Through Color Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextLineThroughColorTypeMember1()
	 * @generated
	 */
	int TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1 = 75;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1 <em>Text Position Type Base Item Member1 Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItemMember1Member1()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1 = 76;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2 <em>Text Position Type Base Item Member1 Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItemMember1Member2()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2 = 77;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType <em>Text Rotation Scale Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextRotationScaleType()
	 * @generated
	 */
	int TEXT_ROTATION_SCALE_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1 <em>Text Underline Color Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextUnderlineColorTypeMember1()
	 * @generated
	 */
	int TEXT_UNDERLINE_COLOR_TYPE_MEMBER1 = 79;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 80;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType <em>Table Centering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTableCenteringType()
	 * @generated
	 */
	int TABLE_CENTERING_TYPE = 81;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType <em>Text Align Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextAlignSourceType()
	 * @generated
	 */
	int TEXT_ALIGN_SOURCE_TYPE = 82;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 83;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType <em>Vertical Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalAlignType()
	 * @generated
	 */
	int VERTICAL_ALIGN_TYPE = 84;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType <em>Vertical Pos Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalPosType()
	 * @generated
	 */
	int VERTICAL_POS_TYPE = 85;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType <em>Vertical Rel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalRelType()
	 * @generated
	 */
	int VERTICAL_REL_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType <em>Wrap Contour Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWrapContourModeType()
	 * @generated
	 */
	int WRAP_CONTOUR_MODE_TYPE = 87;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapType <em>Wrap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWrapType()
	 * @generated
	 */
	int WRAP_TYPE = 88;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType <em>Writing Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWritingModeType()
	 * @generated
	 */
	int WRITING_MODE_TYPE = 89;

	/**
	 * The meta object id for the '<em>Adjustment Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getAdjustmentTypeObject()
	 * @generated
	 */
	int ADJUSTMENT_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Apply Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getApplyStyleNameType()
	 * @generated
	 */
	int APPLY_STYLE_NAME_TYPE = 91;

	/**
	 * The meta object id for the '<em>Apply Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getApplyStyleNameTypeMember1()
	 * @generated
	 */
	int APPLY_STYLE_NAME_TYPE_MEMBER1 = 92;

	/**
	 * The meta object id for the '<em>Cell Protect Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectType()
	 * @generated
	 */
	int CELL_PROTECT_TYPE = 93;

	/**
	 * The meta object id for the '<em>Cell Protect Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember0Object()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER0_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Cell Protect Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember1Object()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER1_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Cell Protect Type Member2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember2()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER2 = 96;

	/**
	 * The meta object id for the '<em>Cell Protect Type Member2 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember2Base()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER2_BASE = 97;

	/**
	 * The meta object id for the '<em>Cell Protect Type Member2 Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getCellProtectTypeMember2BaseItemObject()
	 * @generated
	 */
	int CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Data Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDataStyleNameType()
	 * @generated
	 */
	int DATA_STYLE_NAME_TYPE = 99;

	/**
	 * The meta object id for the '<em>Data Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDataStyleNameTypeMember1()
	 * @generated
	 */
	int DATA_STYLE_NAME_TYPE_MEMBER1 = 100;

	/**
	 * The meta object id for the '<em>Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getDirectionTypeObject()
	 * @generated
	 */
	int DIRECTION_TYPE_OBJECT = 101;

	/**
	 * The meta object id for the '<em>Family Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFamilyTypeObject()
	 * @generated
	 */
	int FAMILY_TYPE_OBJECT = 102;

	/**
	 * The meta object id for the '<em>First Page Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFirstPageNumberType()
	 * @generated
	 */
	int FIRST_PAGE_NUMBER_TYPE = 103;

	/**
	 * The meta object id for the '<em>First Page Number Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFirstPageNumberTypeMember1Object()
	 * @generated
	 */
	int FIRST_PAGE_NUMBER_TYPE_MEMBER1_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Font Relief Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFontReliefTypeObject()
	 * @generated
	 */
	int FONT_RELIEF_TYPE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Font Size Asian Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFontSizeAsianType()
	 * @generated
	 */
	int FONT_SIZE_ASIAN_TYPE = 106;

	/**
	 * The meta object id for the '<em>Font Size Complex Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getFontSizeComplexType()
	 * @generated
	 */
	int FONT_SIZE_COMPLEX_TYPE = 107;

	/**
	 * The meta object id for the '<em>Glyph Orientation Vertical Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getGlyphOrientationVerticalTypeObject()
	 * @generated
	 */
	int GLYPH_ORIENTATION_VERTICAL_TYPE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Horizontal Pos Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHorizontalPosTypeObject()
	 * @generated
	 */
	int HORIZONTAL_POS_TYPE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Horizontal Rel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getHorizontalRelTypeObject()
	 * @generated
	 */
	int HORIZONTAL_REL_TYPE_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Layout Grid Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLayoutGridModeTypeObject()
	 * @generated
	 */
	int LAYOUT_GRID_MODE_TYPE_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Leader Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLeaderColorType()
	 * @generated
	 */
	int LEADER_COLOR_TYPE = 112;

	/**
	 * The meta object id for the '<em>Leader Color Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLeaderColorTypeMember1Object()
	 * @generated
	 */
	int LEADER_COLOR_TYPE_MEMBER1_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Leader Text Style Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLeaderTextStyleType()
	 * @generated
	 */
	int LEADER_TEXT_STYLE_TYPE = 114;

	/**
	 * The meta object id for the '<em>Leader Text Style Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLeaderTextStyleTypeMember1()
	 * @generated
	 */
	int LEADER_TEXT_STYLE_TYPE_MEMBER1 = 115;

	/**
	 * The meta object id for the '<em>Legend Expansion Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLegendExpansionTypeObject()
	 * @generated
	 */
	int LEGEND_EXPANSION_TYPE_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Length Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLengthType()
	 * @generated
	 */
	int LENGTH_TYPE = 117;

	/**
	 * The meta object id for the '<em>Length Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLengthTypeMember1Object()
	 * @generated
	 */
	int LENGTH_TYPE_MEMBER1_OBJECT = 118;

	/**
	 * The meta object id for the '<em>Line Break Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getLineBreakTypeObject()
	 * @generated
	 */
	int LINE_BREAK_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>List Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getListStyleNameType()
	 * @generated
	 */
	int LIST_STYLE_NAME_TYPE = 120;

	/**
	 * The meta object id for the '<em>List Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getListStyleNameTypeMember1()
	 * @generated
	 */
	int LIST_STYLE_NAME_TYPE_MEMBER1 = 121;

	/**
	 * The meta object id for the '<em>Master Page Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMasterPageNameType()
	 * @generated
	 */
	int MASTER_PAGE_NAME_TYPE = 122;

	/**
	 * The meta object id for the '<em>Master Page Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMasterPageNameTypeMember1()
	 * @generated
	 */
	int MASTER_PAGE_NAME_TYPE_MEMBER1 = 123;

	/**
	 * The meta object id for the '<em>Mirror Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorType()
	 * @generated
	 */
	int MIRROR_TYPE = 124;

	/**
	 * The meta object id for the '<em>Mirror Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember1Object()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER1_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Mirror Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember2Object()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER2_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Mirror Type Member3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember3()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER3 = 127;

	/**
	 * The meta object id for the '<em>Mirror Type Member3 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember3Base()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER3_BASE = 128;

	/**
	 * The meta object id for the '<em>Mirror Type Member3 Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember3BaseItem()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER3_BASE_ITEM = 129;

	/**
	 * The meta object id for the '<em>Mirror Type Member3 Base Item Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember3BaseItemMember1Object()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Mirror Type Member4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember4()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER4 = 131;

	/**
	 * The meta object id for the '<em>Mirror Type Member4 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember4Base()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER4_BASE = 132;

	/**
	 * The meta object id for the '<em>Mirror Type Member4 Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember4BaseItem()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER4_BASE_ITEM = 133;

	/**
	 * The meta object id for the '<em>Mirror Type Member4 Base Item Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getMirrorTypeMember4BaseItemMember1Object()
	 * @generated
	 */
	int MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Next Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNextStyleNameType()
	 * @generated
	 */
	int NEXT_STYLE_NAME_TYPE = 135;

	/**
	 * The meta object id for the '<em>Next Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNextStyleNameTypeMember1()
	 * @generated
	 */
	int NEXT_STYLE_NAME_TYPE_MEMBER1 = 136;

	/**
	 * The meta object id for the '<em>Number Wrapped Paragraphs Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumberWrappedParagraphsType()
	 * @generated
	 */
	int NUMBER_WRAPPED_PARAGRAPHS_TYPE = 137;

	/**
	 * The meta object id for the '<em>Number Wrapped Paragraphs Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumberWrappedParagraphsTypeMember1Object()
	 * @generated
	 */
	int NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1_OBJECT = 138;

	/**
	 * The meta object id for the '<em>Num Format Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatType()
	 * @generated
	 */
	int NUM_FORMAT_TYPE = 139;

	/**
	 * The meta object id for the '<em>Num Format Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0 = 140;

	/**
	 * The meta object id for the '<em>Num Format Type Member0 Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0 = 141;

	/**
	 * The meta object id for the '<em>Num Format Type Member0 Member0 Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member1Object()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Num Format Type Member0 Member0 Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member2Object()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Num Format Type Member0 Member0 Member3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member0Member3Object()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3_OBJECT = 144;

	/**
	 * The meta object id for the '<em>Num Format Type Member0 Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember0Member1()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER0_MEMBER1 = 145;

	/**
	 * The meta object id for the '<em>Num Format Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getNumFormatTypeMember1Object()
	 * @generated
	 */
	int NUM_FORMAT_TYPE_MEMBER1_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Overflow Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getOverflowBehaviorTypeObject()
	 * @generated
	 */
	int OVERFLOW_BEHAVIOR_TYPE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>Page Layout Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageLayoutNameType()
	 * @generated
	 */
	int PAGE_LAYOUT_NAME_TYPE = 148;

	/**
	 * The meta object id for the '<em>Page Layout Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageLayoutNameTypeMember1()
	 * @generated
	 */
	int PAGE_LAYOUT_NAME_TYPE_MEMBER1 = 149;

	/**
	 * The meta object id for the '<em>Page Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageNumberType()
	 * @generated
	 */
	int PAGE_NUMBER_TYPE = 150;

	/**
	 * The meta object id for the '<em>Page Number Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageNumberTypeMember1Object()
	 * @generated
	 */
	int PAGE_NUMBER_TYPE_MEMBER1_OBJECT = 151;

	/**
	 * The meta object id for the '<em>Page Usage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPageUsageTypeObject()
	 * @generated
	 */
	int PAGE_USAGE_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Paper Tray Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPaperTrayNameType()
	 * @generated
	 */
	int PAPER_TRAY_NAME_TYPE = 153;

	/**
	 * The meta object id for the '<em>Paper Tray Name Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPaperTrayNameTypeMember1Object()
	 * @generated
	 */
	int PAPER_TRAY_NAME_TYPE_MEMBER1_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Parent Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getParentStyleNameType()
	 * @generated
	 */
	int PARENT_STYLE_NAME_TYPE = 155;

	/**
	 * The meta object id for the '<em>Parent Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getParentStyleNameTypeMember1()
	 * @generated
	 */
	int PARENT_STYLE_NAME_TYPE_MEMBER1 = 156;

	/**
	 * The meta object id for the '<em>Position Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 157;

	/**
	 * The meta object id for the '<em>Position Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember0Object()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER0_OBJECT = 158;

	/**
	 * The meta object id for the '<em>Position Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember1Object()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER1_OBJECT = 159;

	/**
	 * The meta object id for the '<em>Position Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember2Object()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER2_OBJECT = 160;

	/**
	 * The meta object id for the '<em>Position Type Member3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember3Object()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER3_OBJECT = 161;

	/**
	 * The meta object id for the '<em>Position Type Member4 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember4Object()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER4_OBJECT = 162;

	/**
	 * The meta object id for the '<em>Position Type Member5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember5()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER5 = 163;

	/**
	 * The meta object id for the '<em>Position Type Member5 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember5Base()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER5_BASE = 164;

	/**
	 * The meta object id for the '<em>Position Type Member5 Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember5BaseItem()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER5_BASE_ITEM = 165;

	/**
	 * The meta object id for the '<em>Position Type Member6</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember6()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER6 = 166;

	/**
	 * The meta object id for the '<em>Position Type Member6 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember6Base()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER6_BASE = 167;

	/**
	 * The meta object id for the '<em>Position Type Member6 Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPositionTypeMember6BaseItem()
	 * @generated
	 */
	int POSITION_TYPE_MEMBER6_BASE_ITEM = 168;

	/**
	 * The meta object id for the '<em>Print Orientation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintOrientationTypeObject()
	 * @generated
	 */
	int PRINT_ORIENTATION_TYPE_OBJECT = 169;

	/**
	 * The meta object id for the '<em>Print Page Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintPageOrderTypeObject()
	 * @generated
	 */
	int PRINT_PAGE_ORDER_TYPE_OBJECT = 170;

	/**
	 * The meta object id for the '<em>Print Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintType()
	 * @generated
	 */
	int PRINT_TYPE = 171;

	/**
	 * The meta object id for the '<em>Print Type Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPrintTypeItemObject()
	 * @generated
	 */
	int PRINT_TYPE_ITEM_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Punctuation Wrap Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getPunctuationWrapTypeObject()
	 * @generated
	 */
	int PUNCTUATION_WRAP_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Register Truth Ref Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRegisterTruthRefStyleNameType()
	 * @generated
	 */
	int REGISTER_TRUTH_REF_STYLE_NAME_TYPE = 174;

	/**
	 * The meta object id for the '<em>Register Truth Ref Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRegisterTruthRefStyleNameTypeMember1()
	 * @generated
	 */
	int REGISTER_TRUTH_REF_STYLE_NAME_TYPE_MEMBER1 = 175;

	/**
	 * The meta object id for the '<em>Rel Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelHeightType()
	 * @generated
	 */
	int REL_HEIGHT_TYPE = 176;

	/**
	 * The meta object id for the '<em>Rel Height Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelHeightTypeMember1Object()
	 * @generated
	 */
	int REL_HEIGHT_TYPE_MEMBER1_OBJECT = 177;

	/**
	 * The meta object id for the '<em>Rel Height Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelHeightTypeMember2Object()
	 * @generated
	 */
	int REL_HEIGHT_TYPE_MEMBER2_OBJECT = 178;

	/**
	 * The meta object id for the '<em>Rel Width Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelWidthType()
	 * @generated
	 */
	int REL_WIDTH_TYPE = 179;

	/**
	 * The meta object id for the '<em>Rel Width Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelWidthTypeMember1Object()
	 * @generated
	 */
	int REL_WIDTH_TYPE_MEMBER1_OBJECT = 180;

	/**
	 * The meta object id for the '<em>Rel Width Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRelWidthTypeMember2Object()
	 * @generated
	 */
	int REL_WIDTH_TYPE_MEMBER2_OBJECT = 181;

	/**
	 * The meta object id for the '<em>Repeat Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRepeatTypeObject()
	 * @generated
	 */
	int REPEAT_TYPE_OBJECT = 182;

	/**
	 * The meta object id for the '<em>Rotation Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRotationAlignTypeObject()
	 * @generated
	 */
	int ROTATION_ALIGN_TYPE_OBJECT = 183;

	/**
	 * The meta object id for the '<em>Ruby Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRubyAlignTypeObject()
	 * @generated
	 */
	int RUBY_ALIGN_TYPE_OBJECT = 184;

	/**
	 * The meta object id for the '<em>Ruby Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRubyPositionTypeObject()
	 * @generated
	 */
	int RUBY_POSITION_TYPE_OBJECT = 185;

	/**
	 * The meta object id for the '<em>Run Through Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getRunThroughTypeObject()
	 * @generated
	 */
	int RUN_THROUGH_TYPE_OBJECT = 186;

	/**
	 * The meta object id for the '<em>Script Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getScriptTypeTypeObject()
	 * @generated
	 */
	int SCRIPT_TYPE_TYPE_OBJECT = 187;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getStyleNameType()
	 * @generated
	 */
	int STYLE_NAME_TYPE = 188;

	/**
	 * The meta object id for the '<em>Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getStyleNameTypeMember1()
	 * @generated
	 */
	int STYLE_NAME_TYPE_MEMBER1 = 189;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getStyleTypeObject()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT = 190;

	/**
	 * The meta object id for the '<em>Text Autospace Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextAutospaceTypeObject()
	 * @generated
	 */
	int TEXT_AUTOSPACE_TYPE_OBJECT = 191;

	/**
	 * The meta object id for the '<em>Text Combine Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextCombineTypeObject()
	 * @generated
	 */
	int TEXT_COMBINE_TYPE_OBJECT = 192;

	/**
	 * The meta object id for the '<em>Text Emphasize Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeType()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE = 193;

	/**
	 * The meta object id for the '<em>Text Emphasize Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember0Object()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER0_OBJECT = 194;

	/**
	 * The meta object id for the '<em>Text Emphasize Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember1()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER1 = 195;

	/**
	 * The meta object id for the '<em>Text Emphasize Type Member1 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember1Base()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER1_BASE = 196;

	/**
	 * The meta object id for the '<em>Text Line Through Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextLineThroughColorType()
	 * @generated
	 */
	int TEXT_LINE_THROUGH_COLOR_TYPE = 197;

	/**
	 * The meta object id for the '<em>Text Line Through Color Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextLineThroughColorTypeMember1Object()
	 * @generated
	 */
	int TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1_OBJECT = 198;

	/**
	 * The meta object id for the '<em>Text Line Through Text Style Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextLineThroughTextStyleType()
	 * @generated
	 */
	int TEXT_LINE_THROUGH_TEXT_STYLE_TYPE = 199;

	/**
	 * The meta object id for the '<em>Text Line Through Text Style Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextLineThroughTextStyleTypeMember1()
	 * @generated
	 */
	int TEXT_LINE_THROUGH_TEXT_STYLE_TYPE_MEMBER1 = 200;

	/**
	 * The meta object id for the '<em>Text Position Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionType()
	 * @generated
	 */
	int TEXT_POSITION_TYPE = 201;

	/**
	 * The meta object id for the '<em>Text Position Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBase()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE = 202;

	/**
	 * The meta object id for the '<em>Text Position Type Base Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItem()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM = 203;

	/**
	 * The meta object id for the '<em>Text Position Type Base Item Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItemMember1()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1 = 204;

	/**
	 * The meta object id for the '<em>Text Position Type Base Item Member1 Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItemMember1Member1Object()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1_OBJECT = 205;

	/**
	 * The meta object id for the '<em>Text Position Type Base Item Member1 Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextPositionTypeBaseItemMember1Member2Object()
	 * @generated
	 */
	int TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2_OBJECT = 206;

	/**
	 * The meta object id for the '<em>Text Rotation Scale Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextRotationScaleTypeObject()
	 * @generated
	 */
	int TEXT_ROTATION_SCALE_TYPE_OBJECT = 207;

	/**
	 * The meta object id for the '<em>Text Underline Color Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextUnderlineColorTypeMember1Object()
	 * @generated
	 */
	int TEXT_UNDERLINE_COLOR_TYPE_MEMBER1_OBJECT = 208;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 209;

	/**
	 * The meta object id for the '<em>Table Centering Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTableCenteringTypeObject()
	 * @generated
	 */
	int TABLE_CENTERING_TYPE_OBJECT = 210;

	/**
	 * The meta object id for the '<em>Text Align Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextAlignSourceTypeObject()
	 * @generated
	 */
	int TEXT_ALIGN_SOURCE_TYPE_OBJECT = 211;

	/**
	 * The meta object id for the '<em>Text Emphasize Type Member1 Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextEmphasizeTypeMember1BaseItemObject()
	 * @generated
	 */
	int TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM_OBJECT = 212;

	/**
	 * The meta object id for the '<em>Text Underline Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTextUnderlineColorType()
	 * @generated
	 */
	int TEXT_UNDERLINE_COLOR_TYPE = 213;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 214;

	/**
	 * The meta object id for the '<em>Vertical Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalAlignTypeObject()
	 * @generated
	 */
	int VERTICAL_ALIGN_TYPE_OBJECT = 215;

	/**
	 * The meta object id for the '<em>Vertical Pos Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalPosTypeObject()
	 * @generated
	 */
	int VERTICAL_POS_TYPE_OBJECT = 216;

	/**
	 * The meta object id for the '<em>Vertical Rel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getVerticalRelTypeObject()
	 * @generated
	 */
	int VERTICAL_REL_TYPE_OBJECT = 217;

	/**
	 * The meta object id for the '<em>Wrap Contour Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWrapContourModeTypeObject()
	 * @generated
	 */
	int WRAP_CONTOUR_MODE_TYPE_OBJECT = 218;

	/**
	 * The meta object id for the '<em>Wrap Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWrapTypeObject()
	 * @generated
	 */
	int WRAP_TYPE_OBJECT = 219;

	/**
	 * The meta object id for the '<em>Writing Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl#getWritingModeTypeObject()
	 * @generated
	 */
	int WRITING_MODE_TYPE_OBJECT = 220;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType <em>Background Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Image Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType
	 * @generated
	 */
	EClass getBackgroundImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getBinaryData <em>Binary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getBinaryData()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_BinaryData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getActuate()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getFilterName()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getHref()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getOpacity()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getPosition()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getRepeat()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getShow()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType#getType()
	 * @see #getBackgroundImageType()
	 * @generated
	 */
	EAttribute getBackgroundImageType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType <em>Column Sep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Sep Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType
	 * @generated
	 */
	EClass getColumnSepType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor()
	 * @see #getColumnSepType()
	 * @generated
	 */
	EAttribute getColumnSepType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight()
	 * @see #getColumnSepType()
	 * @generated
	 */
	EAttribute getColumnSepType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle()
	 * @see #getColumnSepType()
	 * @generated
	 */
	EAttribute getColumnSepType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign()
	 * @see #getColumnSepType()
	 * @generated
	 */
	EAttribute getColumnSepType_VerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getWidth()
	 * @see #getColumnSepType()
	 * @generated
	 */
	EAttribute getColumnSepType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType <em>Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType
	 * @generated
	 */
	EClass getColumnsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnSep <em>Column Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnSep()
	 * @see #getColumnsType()
	 * @generated
	 */
	EReference getColumnsType_ColumnSep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumn()
	 * @see #getColumnsType()
	 * @generated
	 */
	EReference getColumnsType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnCount <em>Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnCount()
	 * @see #getColumnsType()
	 * @generated
	 */
	EAttribute getColumnsType_ColumnCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnGap <em>Column Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Gap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnGap()
	 * @see #getColumnsType()
	 * @generated
	 */
	EAttribute getColumnsType_ColumnGap();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent <em>End Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_EndIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getRelWidth <em>Rel Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getRelWidth()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_RelWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter <em>Space After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space After</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_SpaceAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore <em>Space Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Before</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_SpaceBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent <em>Start Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_StartIndent();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType <em>Drop Cap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Cap Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType
	 * @generated
	 */
	EClass getDropCapType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance()
	 * @see #getDropCapType()
	 * @generated
	 */
	EAttribute getDropCapType_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength()
	 * @see #getDropCapType()
	 * @generated
	 */
	EAttribute getDropCapType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines()
	 * @see #getDropCapType()
	 * @generated
	 */
	EAttribute getDropCapType_Lines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getStyleName()
	 * @see #getDropCapType()
	 * @generated
	 */
	EAttribute getDropCapType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType <em>Font Face Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType
	 * @generated
	 */
	EClass getFontFaceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFaceSrc <em>Font Face Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Src</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFaceSrc()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EReference getFontFaceType_FontFaceSrc();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDefinitionSrc <em>Definition Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition Src</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDefinitionSrc()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EReference getFontFaceType_DefinitionSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAccentHeight <em>Accent Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accent Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAccentHeight()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_AccentHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAlphabetic <em>Alphabetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alphabetic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAlphabetic()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Alphabetic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAscent <em>Ascent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAscent()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Ascent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getBbox <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getBbox()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Bbox();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getCapHeight <em>Cap Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getCapHeight()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_CapHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDescent <em>Descent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDescent()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Descent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontAdornments <em>Font Adornments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Adornments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontAdornments()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontAdornments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontCharset <em>Font Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Charset</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontCharset()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontCharset();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamily()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric <em>Font Family Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Generic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontFamilyGeneric();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch <em>Font Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Pitch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontPitch();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontSize()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch <em>Font Stretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Stretch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontStretch();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant <em>Font Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Variant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getHanging <em>Hanging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hanging</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getHanging()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Hanging();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getIdeographic <em>Ideographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ideographic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getIdeographic()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Ideographic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getMathematical <em>Mathematical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mathematical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getMathematical()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Mathematical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getName()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlinePosition <em>Overline Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overline Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlinePosition()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_OverlinePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlineThickness <em>Overline Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overline Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlineThickness()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_OverlineThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getPanose1 <em>Panose1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Panose1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getPanose1()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Panose1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getSlope()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Slope();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemh <em>Stemh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stemh</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemh()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Stemh();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemv <em>Stemv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stemv</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemv()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Stemv();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughPosition <em>Strikethrough Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughPosition()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_StrikethroughPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughThickness <em>Strikethrough Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughThickness()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_StrikethroughThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlinePosition <em>Underline Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlinePosition()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_UnderlinePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlineThickness <em>Underline Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline Thickness</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlineThickness()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_UnderlineThickness();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnicodeRange <em>Unicode Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnicodeRange()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_UnicodeRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnitsPerEm <em>Units Per Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Per Em</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnitsPerEm()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_UnitsPerEm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVAlphabetic <em>VAlphabetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VAlphabetic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVAlphabetic()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_VAlphabetic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVHanging <em>VHanging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VHanging</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVHanging()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_VHanging();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVIdeographic <em>VIdeographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIdeographic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVIdeographic()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_VIdeographic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVMathematical <em>VMathematical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VMathematical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVMathematical()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_VMathematical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getWidths <em>Widths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widths</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getWidths()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_Widths();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getXHeight <em>XHeight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XHeight</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getXHeight()
	 * @see #getFontFaceType()
	 * @generated
	 */
	EAttribute getFontFaceType_XHeight();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType <em>Footer Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Left Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType
	 * @generated
	 */
	EClass getFooterLeftType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType#getDisplay()
	 * @see #getFooterLeftType()
	 * @generated
	 */
	EAttribute getFooterLeftType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType <em>Footer Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType
	 * @generated
	 */
	EClass getFooterStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Footer Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType#getHeaderFooterProperties()
	 * @see #getFooterStyleType()
	 * @generated
	 */
	EReference getFooterStyleType_HeaderFooterProperties();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterType <em>Footer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterType
	 * @generated
	 */
	EClass getFooterType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterType#getDisplay()
	 * @see #getFooterType()
	 * @generated
	 */
	EAttribute getFooterType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType <em>Footnote Sep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote Sep Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType
	 * @generated
	 */
	EClass getFootnoteSepType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjustment</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_Adjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getColor()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceAfterSep <em>Distance After Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance After Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceAfterSep()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_DistanceAfterSep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceBeforeSep <em>Distance Before Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Before Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceBeforeSep()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_DistanceBeforeSep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getRelWidth <em>Rel Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getRelWidth()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_RelWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getWidth()
	 * @see #getFootnoteSepType()
	 * @generated
	 */
	EAttribute getFootnoteSepType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType <em>Handout Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handout Master Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType
	 * @generated
	 */
	EClass getHandoutMasterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getShape()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getRect()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getLine()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPolyline()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPolygon()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getRegularPolygon()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPath()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCircle()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getEllipse()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getG()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPageThumbnail()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getFrame()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getMeasure()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCaption()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getConnector()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getControl()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getScene()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getCustomShape()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EReference getHandoutMasterType_CustomShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPageLayoutName <em>Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPageLayoutName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_PageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getPresentationPageLayoutName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_PresentationPageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getStyleName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseDateTimeName <em>Use Date Time Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Date Time Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseDateTimeName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_UseDateTimeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseFooterName <em>Use Footer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Footer Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseFooterName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_UseFooterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseHeaderName <em>Use Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Header Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType#getUseHeaderName()
	 * @see #getHandoutMasterType()
	 * @generated
	 */
	EAttribute getHandoutMasterType_UseHeaderName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType <em>Header Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Left Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType
	 * @generated
	 */
	EClass getHeaderLeftType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType#getDisplay()
	 * @see #getHeaderLeftType()
	 * @generated
	 */
	EAttribute getHeaderLeftType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType <em>Header Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType
	 * @generated
	 */
	EClass getHeaderStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Footer Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType#getHeaderFooterProperties()
	 * @see #getHeaderStyleType()
	 * @generated
	 */
	EReference getHeaderStyleType_HeaderFooterProperties();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType#getDisplay()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getApplyStyleName <em>Apply Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getApplyStyleName()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_ApplyStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getBaseCellAddress()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MapType#getCondition()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Condition();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType <em>Master Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Page Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType
	 * @generated
	 */
	EClass getMasterPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getHeader()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getHeaderLeft <em>Header Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getHeaderLeft()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_HeaderLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFooter()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Footer();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFooterLeft <em>Footer Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFooterLeft()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_FooterLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getForms()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getStyle()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Style();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getShape()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getRect()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getLine()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPolyline()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPolygon()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getRegularPolygon()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPath()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCircle()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getEllipse()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getG()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPageThumbnail()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getFrame()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getMeasure()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCaption()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getConnector()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getControl()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getScene()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getCustomShape()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_CustomShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getNotes()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EReference getMasterPageType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getDisplayName()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getName()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getNextStyleName <em>Next Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getNextStyleName()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_NextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPageLayoutName <em>Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getPageLayoutName()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_PageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType#getStyleName()
	 * @see #getMasterPageType()
	 * @generated
	 */
	EAttribute getMasterPageType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType <em>Page Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Layout Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType
	 * @generated
	 */
	EClass getPageLayoutType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageLayoutProperties <em>Page Layout Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Layout Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageLayoutProperties()
	 * @see #getPageLayoutType()
	 * @generated
	 */
	EReference getPageLayoutType_PageLayoutProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getHeaderStyle <em>Header Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getHeaderStyle()
	 * @see #getPageLayoutType()
	 * @generated
	 */
	EReference getPageLayoutType_HeaderStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getFooterStyle <em>Footer Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getFooterStyle()
	 * @see #getPageLayoutType()
	 * @generated
	 */
	EReference getPageLayoutType_FooterStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getName()
	 * @see #getPageLayoutType()
	 * @generated
	 */
	EAttribute getPageLayoutType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage <em>Page Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Usage</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage()
	 * @see #getPageLayoutType()
	 * @generated
	 */
	EAttribute getPageLayoutType_PageUsage();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType <em>Presentation Page Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Page Layout Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType
	 * @generated
	 */
	EClass getPresentationPageLayoutType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placeholder</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getPlaceholder()
	 * @see #getPresentationPageLayoutType()
	 * @generated
	 */
	EReference getPresentationPageLayoutType_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getDisplayName()
	 * @see #getPresentationPageLayoutType()
	 * @generated
	 */
	EAttribute getPresentationPageLayoutType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getName()
	 * @see #getPresentationPageLayoutType()
	 * @generated
	 */
	EAttribute getPresentationPageLayoutType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1
	 * @generated
	 */
	EClass getStyleType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMap()
	 * @see #getStyleType1()
	 * @generated
	 */
	EReference getStyleType1_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate <em>Auto Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_AutoUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getClass_()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDataStyleName <em>Data Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDataStyleName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_DataStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDefaultOutlineLevel <em>Default Outline Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Outline Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDefaultOutlineLevel()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_DefaultOutlineLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDisplayName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getListStyleName <em>List Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getListStyleName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_ListStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMasterPageName <em>Master Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Page Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMasterPageName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_MasterPageName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getNextStyleName <em>Next Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getNextStyleName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_NextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getParentStyleName <em>Parent Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getParentStyleName()
	 * @see #getStyleType1()
	 * @generated
	 */
	EAttribute getStyleType1_ParentStyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType <em>Tab Stops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Stops Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType
	 * @generated
	 */
	EClass getTabStopsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType#getTabStop()
	 * @see #getTabStopsType()
	 * @generated
	 */
	EReference getTabStopsType_TabStop();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BackgroundImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChartProperties <em>Chart Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chart Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChartProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChartProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnSep <em>Column Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnSep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ColumnSep();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultStyle <em>Default Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DefaultStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDrawingPageProperties <em>Drawing Page Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawing Page Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDrawingPageProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DrawingPageProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDropCap <em>Drop Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Cap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDropCap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropCap();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFace <em>Font Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFace();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Footer();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterLeft <em>Footer Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FooterLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterStyle <em>Footer Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FooterStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteSep <em>Footnote Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footnote Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteSep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FootnoteSep();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGraphicProperties <em>Graphic Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphic Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGraphicProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GraphicProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHandoutMaster <em>Handout Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handout Master</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHandoutMaster()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HandoutMaster();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderFooterProperties <em>Header Footer Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Footer Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderFooterProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HeaderFooterProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderLeft <em>Header Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HeaderLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderStyle <em>Header Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HeaderStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListLevelProperties <em>List Level Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Level Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListLevelProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListLevelProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Map();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPage <em>Master Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MasterPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayout <em>Page Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Layout</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PageLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutProperties <em>Page Layout Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Layout Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PageLayoutProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParagraphProperties <em>Paragraph Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paragraph Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParagraphProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParagraphProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPresentationPageLayout <em>Presentation Page Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Page Layout</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPresentationPageLayout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PresentationPageLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionCenter <em>Region Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Center</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionCenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegionCenter();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionLeft <em>Region Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegionLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionRight <em>Region Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Right</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionRight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegionRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyProperties <em>Ruby Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ruby Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RubyProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSectionProperties <em>Section Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSectionProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SectionProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Style();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCellProperties <em>Table Cell Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Cell Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCellProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableCellProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableColumnProperties <em>Table Column Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Column Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableColumnProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableColumnProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableProperties <em>Table Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableRowProperties <em>Table Row Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Row Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableRowProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableRowProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TabStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStops <em>Tab Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tab Stops</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStops()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TabStops();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjustment</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Adjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getApplyStyleName <em>Apply Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getApplyStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplyStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent <em>Auto Text Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Text Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoTextIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate <em>Auto Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundTransparency <em>Background Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Transparency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundTransparency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackgroundTransparency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBaseCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidth <em>Border Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Line Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthBottom <em>Border Line Width Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Line Width Bottom</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthBottom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLineWidthBottom();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthLeft <em>Border Line Width Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Line Width Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLineWidthLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthRight <em>Border Line Width Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Line Width Right</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthRight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLineWidthRight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthTop <em>Border Line Width Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Line Width Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLineWidthTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCellProtect <em>Cell Protect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Protect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCellProtect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CellProtect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnWidth <em>Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryAsian <em>Country Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CountryAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryComplex <em>Country Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CountryComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDataStyleName <em>Data Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDataStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDecimalPlaces()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultOutlineLevel <em>Default Outline Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Outline Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultOutlineLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DefaultOutlineLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTr <em>Diagonal Bl Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Bl Tr</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagonalBlTr();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTrWidths <em>Diagonal Bl Tr Widths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Bl Tr Widths</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTrWidths()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagonalBlTrWidths();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBr <em>Diagonal Tl Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Tl Br</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagonalTlBr();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBrWidths <em>Diagonal Tl Br Widths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Tl Br Widths</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBrWidths()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagonalTlBrWidths();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceAfterSep <em>Distance After Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance After Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceAfterSep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DistanceAfterSep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceBeforeSep <em>Distance Before Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Before Sep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceBeforeSep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DistanceBeforeSep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing <em>Dynamic Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Spacing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DynamicSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFilterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFirstPageNumber <em>First Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFirstPageNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FirstPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText <em>Flow With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow With Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FlowWithText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontAdornments <em>Font Adornments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Adornments</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontAdornments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontAdornments();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharset <em>Font Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Charset</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontCharset();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetAsian <em>Font Charset Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Charset Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontCharsetAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetComplex <em>Font Charset Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Charset Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontCharsetComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyAsian <em>Font Family Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamilyAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyComplex <em>Font Family Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamilyComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric <em>Font Family Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Generic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamilyGeneric();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Generic Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamilyGenericAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family Generic Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamilyGenericComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Independent Line Spacing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontIndependentLineSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameAsian <em>Font Name Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontNameAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameComplex <em>Font Name Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontNameComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch <em>Font Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Pitch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontPitch();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian <em>Font Pitch Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Pitch Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontPitchAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex <em>Font Pitch Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Pitch Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontPitchComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief <em>Font Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Relief</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontRelief();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeAsian <em>Font Size Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSizeAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeComplex <em>Font Size Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSizeComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRel <em>Font Size Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Rel</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSizeRel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelAsian <em>Font Size Rel Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Rel Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSizeRelAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelComplex <em>Font Size Rel Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Rel Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSizeRelComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian <em>Font Style Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyleAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex <em>Font Style Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyleComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleName <em>Font Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameAsian <em>Font Style Name Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style Name Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyleNameAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameComplex <em>Font Style Name Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style Name Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyleNameComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian <em>Font Weight Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontWeightAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex <em>Font Weight Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontWeightComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteMaxHeight <em>Footnote Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footnote Max Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteMaxHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FootnoteMaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glyph Orientation Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GlyphOrientationVertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos <em>Horizontal Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Pos</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HorizontalPos();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel <em>Horizontal Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Rel</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HorizontalRel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord <em>Justify Single Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify Single Word</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_JustifySingleWord();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageAsian <em>Language Asian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Asian</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageAsian()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LanguageAsian();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageComplex <em>Language Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Complex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LanguageComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridBaseHeight <em>Layout Grid Base Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Base Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridBaseHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridBaseHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridColor <em>Layout Grid Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay <em>Layout Grid Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridDisplay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridLines <em>Layout Grid Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridLines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode <em>Layout Grid Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint <em>Layout Grid Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Print</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridPrint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Ruby Below</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridRubyBelow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyHeight <em>Layout Grid Ruby Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Grid Ruby Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutGridRubyHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderChar <em>Leader Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderChar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderChar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderColor <em>Leader Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle <em>Leader Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderText <em>Leader Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderTextStyle <em>Leader Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderTextStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType <em>Leader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderWidth <em>Leader Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeaderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion <em>Legend Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Expansion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LegendExpansion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Expansion Aspect Ratio</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LegendExpansionAspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning <em>Letter Kerning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter Kerning</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LetterKerning();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineBreak();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineHeightAtLeast <em>Line Height At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height At Least</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineHeightAtLeast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineHeightAtLeast();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Lines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineSpacing <em>Line Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Spacing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineSpacing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListStyleName <em>List Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ListStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPageName <em>Master Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Page Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPageName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MasterPageName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows <em>May Break Between Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Break Between Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MayBreakBetweenRows();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMinRowHeight <em>Min Row Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Row Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMinRowHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinRowHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMirror <em>Mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMirror()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mirror();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNextStyleName <em>Next Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNextStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumberWrappedParagraphs <em>Number Wrapped Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Wrapped Paragraphs</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumberWrappedParagraphs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberWrappedParagraphs();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumFormat <em>Num Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync <em>Num Letter Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Letter Sync</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumLetterSync();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumPrefix <em>Num Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Prefix</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumSuffix <em>Num Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Suffix</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior <em>Overflow Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow Behavior</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OverflowBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutName <em>Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageNumber <em>Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage <em>Page Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Usage</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPaperTrayName <em>Paper Tray Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paper Tray Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPaperTrayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaperTrayName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParentStyleName <em>Parent Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParentStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ParentStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrint <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Print();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent <em>Print Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation <em>Print Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintOrientation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder <em>Print Page Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Page Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintPageOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap <em>Punctuation Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Punctuation Wrap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PunctuationWrap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue <em>Register True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register True</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RegisterTrue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTruthRefStyleName <em>Register Truth Ref Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Truth Ref Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTruthRefStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RegisterTruthRefStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelColumnWidth <em>Rel Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Column Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelColumnWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RelColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelHeight <em>Rel Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RelHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent <em>Repeat Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RepeatContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign <em>Rotation Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RotationAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAngle <em>Rotation Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RotationAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRowHeight <em>Row Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRowHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RowHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign <em>Ruby Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruby Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RubyAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition <em>Ruby Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruby Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RubyPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough <em>Run Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Through</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RunThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleTo <em>Scale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScaleTo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleToPages <em>Scale To Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale To Pages</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleToPages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScaleToPages();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScriptType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShadow <em>Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShadow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Shadow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit <em>Shrink To Fit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shrink To Fit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShrinkToFit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snap To Layout Grid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SnapToLayoutGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1 <em>Style1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Style1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering <em>Table Centering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Centering</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TableCentering();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStopDistance <em>Tab Stop Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStopDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TabStopDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource <em>Text Align Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextAlignSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace <em>Text Autospace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Autospace</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextAutospace();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking <em>Text Blinking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Blinking</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextBlinking();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine <em>Text Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Combine</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextCombine();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineEndChar <em>Text Combine End Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Combine End Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineEndChar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextCombineEndChar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineStartChar <em>Text Combine Start Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Combine Start Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineStartChar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextCombineStartChar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextEmphasize <em>Text Emphasize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Emphasize</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextEmphasize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextEmphasize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughColor <em>Text Line Through Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode <em>Text Line Through Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle <em>Text Line Through Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughText <em>Text Line Through Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughTextStyle <em>Text Line Through Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughTextStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType <em>Text Line Through Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughWidth <em>Text Line Through Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Line Through Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextLineThroughWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline <em>Text Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Outline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextOutline();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationAngle <em>Text Rotation Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Rotation Angle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextRotationAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale <em>Text Rotation Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Rotation Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextRotationScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextScale <em>Text Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineColor <em>Text Underline Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Underline Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextUnderlineColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode <em>Text Underline Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Underline Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextUnderlineMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle <em>Text Underline Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Underline Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextUnderlineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType <em>Text Underline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Underline Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextUnderlineType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineWidth <em>Text Underline Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Underline Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextUnderlineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Optimal Column Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseOptimalColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Optimal Row Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseOptimalRowHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor <em>Use Window Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Window Font Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseWindowFontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos <em>Vertical Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Pos</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VerticalPos();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel <em>Vertical Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Rel</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VerticalRel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap <em>Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Wrap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour <em>Wrap Contour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Contour</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WrapContour();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode <em>Wrap Contour Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Contour Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WrapContourMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapDynamicThreshold <em>Wrap Dynamic Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Dynamic Threshold</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapDynamicThreshold()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WrapDynamicThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode <em>Writing Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writing Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WritingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic <em>Writing Mode Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writing Mode Automatic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WritingModeAutomatic();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType <em>Tab Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Stop Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType
	 * @generated
	 */
	EClass getTabStopType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getChar()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderColor <em>Leader Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderColor()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle <em>Leader Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText <em>Leader Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderTextStyle <em>Leader Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderTextStyle()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType <em>Leader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderWidth <em>Leader Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderWidth()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_LeaderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getPosition()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType()
	 * @see #getTabStopType()
	 * @generated
	 */
	EAttribute getTabStopType_Type();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjustment Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @generated
	 */
	EEnum getAdjustmentType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0 <em>Cell Protect Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cell Protect Type Member0</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0
	 * @generated
	 */
	EEnum getCellProtectTypeMember0();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1 <em>Cell Protect Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cell Protect Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1
	 * @generated
	 */
	EEnum getCellProtectTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem <em>Cell Protect Type Member2 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cell Protect Type Member2 Base Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem
	 * @generated
	 */
	EEnum getCellProtectTypeMember2BaseItem();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType <em>Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @generated
	 */
	EEnum getFamilyType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1 <em>First Page Number Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>First Page Number Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1
	 * @generated
	 */
	EEnum getFirstPageNumberTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType <em>Font Relief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Relief Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @generated
	 */
	EEnum getFontReliefType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType <em>Glyph Orientation Vertical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Glyph Orientation Vertical Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @generated
	 */
	EEnum getGlyphOrientationVerticalType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType <em>Horizontal Pos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Horizontal Pos Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @generated
	 */
	EEnum getHorizontalPosType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType <em>Horizontal Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Horizontal Rel Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @generated
	 */
	EEnum getHorizontalRelType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType <em>Layout Grid Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Grid Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @generated
	 */
	EEnum getLayoutGridModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1 <em>Leader Color Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leader Color Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1
	 * @generated
	 */
	EEnum getLeaderColorTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType <em>Legend Expansion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legend Expansion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @generated
	 */
	EEnum getLegendExpansionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1 <em>Length Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Length Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1
	 * @generated
	 */
	EEnum getLengthTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType <em>Line Break Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Break Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @generated
	 */
	EEnum getLineBreakType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1 <em>Mirror Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mirror Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1
	 * @generated
	 */
	EEnum getMirrorTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2 <em>Mirror Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mirror Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2
	 * @generated
	 */
	EEnum getMirrorTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1 <em>Mirror Type Member3 Base Item Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mirror Type Member3 Base Item Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1
	 * @generated
	 */
	EEnum getMirrorTypeMember3BaseItemMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1 <em>Mirror Type Member4 Base Item Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mirror Type Member4 Base Item Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1
	 * @generated
	 */
	EEnum getMirrorTypeMember4BaseItemMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1 <em>Number Wrapped Paragraphs Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Wrapped Paragraphs Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1
	 * @generated
	 */
	EEnum getNumberWrappedParagraphsTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1 <em>Num Format Type Member0 Member0 Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Num Format Type Member0 Member0 Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1
	 * @generated
	 */
	EEnum getNumFormatTypeMember0Member0Member1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2 <em>Num Format Type Member0 Member0 Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Num Format Type Member0 Member0 Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2
	 * @generated
	 */
	EEnum getNumFormatTypeMember0Member0Member2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3 <em>Num Format Type Member0 Member0 Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Num Format Type Member0 Member0 Member3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3
	 * @generated
	 */
	EEnum getNumFormatTypeMember0Member0Member3();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1 <em>Num Format Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Num Format Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1
	 * @generated
	 */
	EEnum getNumFormatTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType <em>Overflow Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overflow Behavior Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @generated
	 */
	EEnum getOverflowBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1 <em>Page Number Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Number Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1
	 * @generated
	 */
	EEnum getPageNumberTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType <em>Page Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Usage Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @generated
	 */
	EEnum getPageUsageType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1 <em>Paper Tray Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Paper Tray Name Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1
	 * @generated
	 */
	EEnum getPaperTrayNameTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0 <em>Position Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type Member0</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0
	 * @generated
	 */
	EEnum getPositionTypeMember0();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1 <em>Position Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1
	 * @generated
	 */
	EEnum getPositionTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2 <em>Position Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2
	 * @generated
	 */
	EEnum getPositionTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3 <em>Position Type Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type Member3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3
	 * @generated
	 */
	EEnum getPositionTypeMember3();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4 <em>Position Type Member4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type Member4</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4
	 * @generated
	 */
	EEnum getPositionTypeMember4();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType <em>Print Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Print Orientation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @generated
	 */
	EEnum getPrintOrientationType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType <em>Print Page Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Print Page Order Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @generated
	 */
	EEnum getPrintPageOrderType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem <em>Print Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Print Type Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem
	 * @generated
	 */
	EEnum getPrintTypeItem();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType <em>Punctuation Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Punctuation Wrap Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @generated
	 */
	EEnum getPunctuationWrapType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1 <em>Rel Height Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel Height Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1
	 * @generated
	 */
	EEnum getRelHeightTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2 <em>Rel Height Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel Height Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2
	 * @generated
	 */
	EEnum getRelHeightTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1 <em>Rel Width Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel Width Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1
	 * @generated
	 */
	EEnum getRelWidthTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2 <em>Rel Width Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel Width Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2
	 * @generated
	 */
	EEnum getRelWidthTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType <em>Repeat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repeat Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @generated
	 */
	EEnum getRepeatType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType <em>Rotation Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rotation Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @generated
	 */
	EEnum getRotationAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType <em>Ruby Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ruby Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @generated
	 */
	EEnum getRubyAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType <em>Ruby Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ruby Position Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @generated
	 */
	EEnum getRubyPositionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType <em>Run Through Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Run Through Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @generated
	 */
	EEnum getRunThroughType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType <em>Script Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @generated
	 */
	EEnum getScriptTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @generated
	 */
	EEnum getStyleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType <em>Text Autospace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Autospace Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @generated
	 */
	EEnum getTextAutospaceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType <em>Text Combine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Combine Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @generated
	 */
	EEnum getTextCombineType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0 <em>Text Emphasize Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Emphasize Type Member0</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0
	 * @generated
	 */
	EEnum getTextEmphasizeTypeMember0();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem <em>Text Emphasize Type Member1 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Emphasize Type Member1 Base Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem
	 * @generated
	 */
	EEnum getTextEmphasizeTypeMember1BaseItem();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1 <em>Text Line Through Color Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Line Through Color Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1
	 * @generated
	 */
	EEnum getTextLineThroughColorTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1 <em>Text Position Type Base Item Member1 Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Position Type Base Item Member1 Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1
	 * @generated
	 */
	EEnum getTextPositionTypeBaseItemMember1Member1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2 <em>Text Position Type Base Item Member1 Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Position Type Base Item Member1 Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2
	 * @generated
	 */
	EEnum getTextPositionTypeBaseItemMember1Member2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType <em>Text Rotation Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Rotation Scale Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @generated
	 */
	EEnum getTextRotationScaleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1 <em>Text Underline Color Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Underline Color Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1
	 * @generated
	 */
	EEnum getTextUnderlineColorTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType <em>Table Centering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Centering Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @generated
	 */
	EEnum getTableCenteringType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType <em>Text Align Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Align Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @generated
	 */
	EEnum getTextAlignSourceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType <em>Vertical Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @generated
	 */
	EEnum getVerticalAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType <em>Vertical Pos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Pos Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @generated
	 */
	EEnum getVerticalPosType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType <em>Vertical Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Rel Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @generated
	 */
	EEnum getVerticalRelType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType <em>Wrap Contour Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Contour Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @generated
	 */
	EEnum getWrapContourModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapType <em>Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @generated
	 */
	EEnum getWrapType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType <em>Writing Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Writing Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @generated
	 */
	EEnum getWritingModeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType <em>Adjustment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Adjustment Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType"
	 *        extendedMetaData="name='adjustment_._type:Object' baseType='adjustment_._type'"
	 * @generated
	 */
	EDataType getAdjustmentTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Apply Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Apply Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='apply-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef apply-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getApplyStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Apply Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Apply Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='apply-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getApplyStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Cell Protect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='cell-protect_._type' memberTypes='cell-protect_._type_._member_._0 cell-protect_._type_._member_._1 cell-protect_._type_._member_._2'"
	 * @generated
	 */
	EDataType getCellProtectType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0 <em>Cell Protect Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type Member0 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0"
	 *        extendedMetaData="name='cell-protect_._type_._member_._0:Object' baseType='cell-protect_._type_._member_._0'"
	 * @generated
	 */
	EDataType getCellProtectTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1 <em>Cell Protect Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1"
	 *        extendedMetaData="name='cell-protect_._type_._member_._1:Object' baseType='cell-protect_._type_._member_._1'"
	 * @generated
	 */
	EDataType getCellProtectTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Cell Protect Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type Member2</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='cell-protect_._type_._member_._2' minLength='1'"
	 * @generated
	 */
	EDataType getCellProtectTypeMember2();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Cell Protect Type Member2 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type Member2 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='cell-protect_._type_._member_._2_._base' itemType='cell-protect_._type_._member_._2_._base_._item'"
	 * @generated
	 */
	EDataType getCellProtectTypeMember2Base();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem <em>Cell Protect Type Member2 Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Protect Type Member2 Base Item Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem"
	 *        extendedMetaData="name='cell-protect_._type_._member_._2_._base_._item:Object' baseType='cell-protect_._type_._member_._2_._base_._item'"
	 * @generated
	 */
	EDataType getCellProtectTypeMember2BaseItemObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Data Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='data-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef data-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDataStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Data Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='data-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getDataStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType <em>Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType"
	 *        extendedMetaData="name='direction_._type:Object' baseType='direction_._type'"
	 * @generated
	 */
	EDataType getDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType <em>Family Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Family Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType"
	 *        extendedMetaData="name='family_._type:Object' baseType='family_._type'"
	 * @generated
	 */
	EDataType getFamilyTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>First Page Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>First Page Number Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='first-page-number_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger first-page-number_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFirstPageNumberType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1 <em>First Page Number Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>First Page Number Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1"
	 *        extendedMetaData="name='first-page-number_._type_._member_._1:Object' baseType='first-page-number_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFirstPageNumberTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType <em>Font Relief Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Relief Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType"
	 *        extendedMetaData="name='font-relief_._type:Object' baseType='font-relief_._type'"
	 * @generated
	 */
	EDataType getFontReliefTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Font Size Asian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Size Asian Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='font-size-asian_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFontSizeAsianType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Font Size Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Size Complex Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='font-size-complex_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFontSizeComplexType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType <em>Glyph Orientation Vertical Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Glyph Orientation Vertical Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType"
	 *        extendedMetaData="name='glyph-orientation-vertical_._type:Object' baseType='glyph-orientation-vertical_._type'"
	 * @generated
	 */
	EDataType getGlyphOrientationVerticalTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType <em>Horizontal Pos Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Horizontal Pos Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType"
	 *        extendedMetaData="name='horizontal-pos_._type:Object' baseType='horizontal-pos_._type'"
	 * @generated
	 */
	EDataType getHorizontalPosTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType <em>Horizontal Rel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Horizontal Rel Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType"
	 *        extendedMetaData="name='horizontal-rel_._type:Object' baseType='horizontal-rel_._type'"
	 * @generated
	 */
	EDataType getHorizontalRelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType <em>Layout Grid Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Layout Grid Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType"
	 *        extendedMetaData="name='layout-grid-mode_._type:Object' baseType='layout-grid-mode_._type'"
	 * @generated
	 */
	EDataType getLayoutGridModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Leader Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leader Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='leader-color_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#color leader-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLeaderColorType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1 <em>Leader Color Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leader Color Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1"
	 *        extendedMetaData="name='leader-color_._type_._member_._1:Object' baseType='leader-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLeaderColorTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Leader Text Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leader Text Style Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='leader-text-style_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef leader-text-style_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLeaderTextStyleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Leader Text Style Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leader Text Style Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='leader-text-style_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getLeaderTextStyleTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType <em>Legend Expansion Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Legend Expansion Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType"
	 *        extendedMetaData="name='legend-expansion_._type:Object' baseType='legend-expansion_._type'"
	 * @generated
	 */
	EDataType getLegendExpansionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='length_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger length_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLengthType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1 <em>Length Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1"
	 *        extendedMetaData="name='length_._type_._member_._1:Object' baseType='length_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLengthTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType <em>Line Break Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Break Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType"
	 *        extendedMetaData="name='line-break_._type:Object' baseType='line-break_._type'"
	 * @generated
	 */
	EDataType getLineBreakTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>List Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='list-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleName list-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getListStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>List Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='list-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getListStyleNameTypeMember1();

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
	 * Returns the meta object for data type '{@link java.lang.Object <em>Mirror Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='mirror_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#horizontal-mirror mirror_._type_._member_._1 mirror_._type_._member_._2 mirror_._type_._member_._3 mirror_._type_._member_._4'"
	 * @generated
	 */
	EDataType getMirrorType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1 <em>Mirror Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1"
	 *        extendedMetaData="name='mirror_._type_._member_._1:Object' baseType='mirror_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMirrorTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2 <em>Mirror Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2"
	 *        extendedMetaData="name='mirror_._type_._member_._2:Object' baseType='mirror_._type_._member_._2'"
	 * @generated
	 */
	EDataType getMirrorTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Mirror Type Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member3</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='mirror_._type_._member_._3' length='2'"
	 * @generated
	 */
	EDataType getMirrorTypeMember3();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Mirror Type Member3 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member3 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='mirror_._type_._member_._3_._base' itemType='mirror_._type_._member_._3_._base_._item'"
	 * @generated
	 */
	EDataType getMirrorTypeMember3Base();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Mirror Type Member3 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member3 Base Item</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='mirror_._type_._member_._3_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#horizontal-mirror mirror_._type_._member_._3_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getMirrorTypeMember3BaseItem();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1 <em>Mirror Type Member3 Base Item Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member3 Base Item Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1"
	 *        extendedMetaData="name='mirror_._type_._member_._3_._base_._item_._member_._1:Object' baseType='mirror_._type_._member_._3_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getMirrorTypeMember3BaseItemMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Mirror Type Member4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member4</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='mirror_._type_._member_._4' length='2'"
	 * @generated
	 */
	EDataType getMirrorTypeMember4();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Mirror Type Member4 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member4 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='mirror_._type_._member_._4_._base' itemType='mirror_._type_._member_._4_._base_._item'"
	 * @generated
	 */
	EDataType getMirrorTypeMember4Base();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Mirror Type Member4 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member4 Base Item</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='mirror_._type_._member_._4_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#horizontal-mirror mirror_._type_._member_._4_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getMirrorTypeMember4BaseItem();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1 <em>Mirror Type Member4 Base Item Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mirror Type Member4 Base Item Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1"
	 *        extendedMetaData="name='mirror_._type_._member_._4_._base_._item_._member_._1:Object' baseType='mirror_._type_._member_._4_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getMirrorTypeMember4BaseItemMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Next Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Next Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='next-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef next-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getNextStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Next Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Next Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='next-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getNextStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Number Wrapped Paragraphs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Wrapped Paragraphs Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='number-wrapped-paragraphs_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger number-wrapped-paragraphs_._type_._member_._1'"
	 * @generated
	 */
	EDataType getNumberWrappedParagraphsType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1 <em>Number Wrapped Paragraphs Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Wrapped Paragraphs Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1"
	 *        extendedMetaData="name='number-wrapped-paragraphs_._type_._member_._1:Object' baseType='number-wrapped-paragraphs_._type_._member_._1'"
	 * @generated
	 */
	EDataType getNumberWrappedParagraphsTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Num Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='num-format_._type' memberTypes='num-format_._type_._member_._0 num-format_._type_._member_._1'"
	 * @generated
	 */
	EDataType getNumFormatType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Num Format Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='num-format_._type_._member_._0' memberTypes='num-format_._type_._member_._0_._member_._0 num-format_._type_._member_._0_._member_._1'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Num Format Type Member0 Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0 Member0</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='num-format_._type_._member_._0_._member_._0' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string num-format_._type_._member_._0_._member_._0_._member_._1 num-format_._type_._member_._0_._member_._0_._member_._2 num-format_._type_._member_._0_._member_._0_._member_._3'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0Member0();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1 <em>Num Format Type Member0 Member0 Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0 Member0 Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1"
	 *        extendedMetaData="name='num-format_._type_._member_._0_._member_._0_._member_._1:Object' baseType='num-format_._type_._member_._0_._member_._0_._member_._1'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0Member0Member1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2 <em>Num Format Type Member0 Member0 Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0 Member0 Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2"
	 *        extendedMetaData="name='num-format_._type_._member_._0_._member_._0_._member_._2:Object' baseType='num-format_._type_._member_._0_._member_._0_._member_._2'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0Member0Member2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3 <em>Num Format Type Member0 Member0 Member3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0 Member0 Member3 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3"
	 *        extendedMetaData="name='num-format_._type_._member_._0_._member_._0_._member_._3:Object' baseType='num-format_._type_._member_._0_._member_._0_._member_._3'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0Member0Member3Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Num Format Type Member0 Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member0 Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='num-format_._type_._member_._0_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember0Member1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1 <em>Num Format Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Format Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1"
	 *        extendedMetaData="name='num-format_._type_._member_._1:Object' baseType='num-format_._type_._member_._1'"
	 * @generated
	 */
	EDataType getNumFormatTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType <em>Overflow Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Overflow Behavior Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType"
	 *        extendedMetaData="name='overflow-behavior_._type:Object' baseType='overflow-behavior_._type'"
	 * @generated
	 */
	EDataType getOverflowBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Page Layout Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Layout Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='page-layout-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef page-layout-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPageLayoutNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Page Layout Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Layout Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='page-layout-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getPageLayoutNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Page Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Number Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='page-number_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger page-number_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPageNumberType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1 <em>Page Number Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Number Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1"
	 *        extendedMetaData="name='page-number_._type_._member_._1:Object' baseType='page-number_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPageNumberTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType <em>Page Usage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Usage Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType"
	 *        extendedMetaData="name='page-usage_._type:Object' baseType='page-usage_._type'"
	 * @generated
	 */
	EDataType getPageUsageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Paper Tray Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Paper Tray Name Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='paper-tray-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string paper-tray-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPaperTrayNameType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1 <em>Paper Tray Name Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Paper Tray Name Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1"
	 *        extendedMetaData="name='paper-tray-name_._type_._member_._1:Object' baseType='paper-tray-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPaperTrayNameTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parent Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parent Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='parent-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef parent-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getParentStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parent Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parent Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='parent-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getParentStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='position_._type' memberTypes='position_._type_._member_._0 position_._type_._member_._1 position_._type_._member_._2 position_._type_._member_._3 position_._type_._member_._4 position_._type_._member_._5 position_._type_._member_._6'"
	 * @generated
	 */
	EDataType getPositionType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0 <em>Position Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member0 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0"
	 *        extendedMetaData="name='position_._type_._member_._0:Object' baseType='position_._type_._member_._0'"
	 * @generated
	 */
	EDataType getPositionTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1 <em>Position Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1"
	 *        extendedMetaData="name='position_._type_._member_._1:Object' baseType='position_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPositionTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2 <em>Position Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2"
	 *        extendedMetaData="name='position_._type_._member_._2:Object' baseType='position_._type_._member_._2'"
	 * @generated
	 */
	EDataType getPositionTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3 <em>Position Type Member3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member3 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3"
	 *        extendedMetaData="name='position_._type_._member_._3:Object' baseType='position_._type_._member_._3'"
	 * @generated
	 */
	EDataType getPositionTypeMember3Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4 <em>Position Type Member4 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member4 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4"
	 *        extendedMetaData="name='position_._type_._member_._4:Object' baseType='position_._type_._member_._4'"
	 * @generated
	 */
	EDataType getPositionTypeMember4Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type Member5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member5</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='position_._type_._member_._5' length='2'"
	 * @generated
	 */
	EDataType getPositionTypeMember5();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type Member5 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member5 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='position_._type_._member_._5_._base' itemType='position_._type_._member_._5_._base_._item'"
	 * @generated
	 */
	EDataType getPositionTypeMember5Base();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Position Type Member5 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member5 Base Item</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='position_._type_._member_._5_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#horiBackPos urn:oasis:names:tc:opendocument:xmlns:text:1.0#vertBackPos'"
	 * @generated
	 */
	EDataType getPositionTypeMember5BaseItem();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type Member6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member6</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='position_._type_._member_._6' length='2'"
	 * @generated
	 */
	EDataType getPositionTypeMember6();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type Member6 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member6 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='position_._type_._member_._6_._base' itemType='position_._type_._member_._6_._base_._item'"
	 * @generated
	 */
	EDataType getPositionTypeMember6Base();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Position Type Member6 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type Member6 Base Item</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='position_._type_._member_._6_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#vertBackPos urn:oasis:names:tc:opendocument:xmlns:text:1.0#horiBackPos'"
	 * @generated
	 */
	EDataType getPositionTypeMember6BaseItem();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType <em>Print Orientation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Print Orientation Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType"
	 *        extendedMetaData="name='print-orientation_._type:Object' baseType='print-orientation_._type'"
	 * @generated
	 */
	EDataType getPrintOrientationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType <em>Print Page Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Print Page Order Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType"
	 *        extendedMetaData="name='print-page-order_._type:Object' baseType='print-page-order_._type'"
	 * @generated
	 */
	EDataType getPrintPageOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Print Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Print Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='print_._type' itemType='print_._type_._item'"
	 * @generated
	 */
	EDataType getPrintType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem <em>Print Type Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Print Type Item Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem"
	 *        extendedMetaData="name='print_._type_._item:Object' baseType='print_._type_._item'"
	 * @generated
	 */
	EDataType getPrintTypeItemObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType <em>Punctuation Wrap Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Punctuation Wrap Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType"
	 *        extendedMetaData="name='punctuation-wrap_._type:Object' baseType='punctuation-wrap_._type'"
	 * @generated
	 */
	EDataType getPunctuationWrapTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Register Truth Ref Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Register Truth Ref Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='register-truth-ref-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef register-truth-ref-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRegisterTruthRefStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Register Truth Ref Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Register Truth Ref Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='register-truth-ref-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getRegisterTruthRefStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Rel Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Height Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='rel-height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent rel-height_._type_._member_._1 rel-height_._type_._member_._2'"
	 * @generated
	 */
	EDataType getRelHeightType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1 <em>Rel Height Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Height Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1"
	 *        extendedMetaData="name='rel-height_._type_._member_._1:Object' baseType='rel-height_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRelHeightTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2 <em>Rel Height Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Height Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2"
	 *        extendedMetaData="name='rel-height_._type_._member_._2:Object' baseType='rel-height_._type_._member_._2'"
	 * @generated
	 */
	EDataType getRelHeightTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Rel Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Width Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='rel-width_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent rel-width_._type_._member_._1 rel-width_._type_._member_._2'"
	 * @generated
	 */
	EDataType getRelWidthType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1 <em>Rel Width Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Width Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1"
	 *        extendedMetaData="name='rel-width_._type_._member_._1:Object' baseType='rel-width_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRelWidthTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2 <em>Rel Width Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Width Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2"
	 *        extendedMetaData="name='rel-width_._type_._member_._2:Object' baseType='rel-width_._type_._member_._2'"
	 * @generated
	 */
	EDataType getRelWidthTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType <em>Repeat Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repeat Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType"
	 *        extendedMetaData="name='repeat_._type:Object' baseType='repeat_._type'"
	 * @generated
	 */
	EDataType getRepeatTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType <em>Rotation Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rotation Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType"
	 *        extendedMetaData="name='rotation-align_._type:Object' baseType='rotation-align_._type'"
	 * @generated
	 */
	EDataType getRotationAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType <em>Ruby Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ruby Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType"
	 *        extendedMetaData="name='ruby-align_._type:Object' baseType='ruby-align_._type'"
	 * @generated
	 */
	EDataType getRubyAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType <em>Ruby Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ruby Position Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType"
	 *        extendedMetaData="name='ruby-position_._type:Object' baseType='ruby-position_._type'"
	 * @generated
	 */
	EDataType getRubyPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType <em>Run Through Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Run Through Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType"
	 *        extendedMetaData="name='run-through_._type:Object' baseType='run-through_._type'"
	 * @generated
	 */
	EDataType getRunThroughTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType <em>Script Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Script Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType"
	 *        extendedMetaData="name='script-type_._type:Object' baseType='script-type_._type'"
	 * @generated
	 */
	EDataType getScriptTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.StyleType"
	 *        extendedMetaData="name='style_._1_._type:Object' baseType='style_._1_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType <em>Text Autospace Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Autospace Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType"
	 *        extendedMetaData="name='text-autospace_._type:Object' baseType='text-autospace_._type'"
	 * @generated
	 */
	EDataType getTextAutospaceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType <em>Text Combine Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Combine Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType"
	 *        extendedMetaData="name='text-combine_._type:Object' baseType='text-combine_._type'"
	 * @generated
	 */
	EDataType getTextCombineTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text Emphasize Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Emphasize Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='text-emphasize_._type' memberTypes='text-emphasize_._type_._member_._0 text-emphasize_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextEmphasizeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0 <em>Text Emphasize Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Emphasize Type Member0 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0"
	 *        extendedMetaData="name='text-emphasize_._type_._member_._0:Object' baseType='text-emphasize_._type_._member_._0'"
	 * @generated
	 */
	EDataType getTextEmphasizeTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Text Emphasize Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Emphasize Type Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='text-emphasize_._type_._member_._1' length='2'"
	 * @generated
	 */
	EDataType getTextEmphasizeTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Text Emphasize Type Member1 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Emphasize Type Member1 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='text-emphasize_._type_._member_._1_._base' itemType='text-emphasize_._type_._member_._1_._base_._item'"
	 * @generated
	 */
	EDataType getTextEmphasizeTypeMember1Base();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text Line Through Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Line Through Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='text-line-through-color_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#color text-line-through-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextLineThroughColorType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1 <em>Text Line Through Color Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Line Through Color Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1"
	 *        extendedMetaData="name='text-line-through-color_._type_._member_._1:Object' baseType='text-line-through-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextLineThroughColorTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Line Through Text Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Line Through Text Style Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-line-through-text-style_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef text-line-through-text-style_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextLineThroughTextStyleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Line Through Text Style Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Line Through Text Style Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-line-through-text-style_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getTextLineThroughTextStyleTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Text Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='text-position_._type' minLength='1' maxLength='2'"
	 * @generated
	 */
	EDataType getTextPositionType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Text Position Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='text-position_._type_._base' itemType='text-position_._type_._base_._item'"
	 * @generated
	 */
	EDataType getTextPositionTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text Position Type Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type Base Item</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='text-position_._type_._base_._item' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent text-position_._type_._base_._item_._member_._1'"
	 * @generated
	 */
	EDataType getTextPositionTypeBaseItem();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text Position Type Base Item Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type Base Item Member1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='text-position_._type_._base_._item_._member_._1' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent text-position_._type_._base_._item_._member_._1_._member_._1 text-position_._type_._base_._item_._member_._1_._member_._2'"
	 * @generated
	 */
	EDataType getTextPositionTypeBaseItemMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1 <em>Text Position Type Base Item Member1 Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type Base Item Member1 Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1"
	 *        extendedMetaData="name='text-position_._type_._base_._item_._member_._1_._member_._1:Object' baseType='text-position_._type_._base_._item_._member_._1_._member_._1'"
	 * @generated
	 */
	EDataType getTextPositionTypeBaseItemMember1Member1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2 <em>Text Position Type Base Item Member1 Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Position Type Base Item Member1 Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2"
	 *        extendedMetaData="name='text-position_._type_._base_._item_._member_._1_._member_._2:Object' baseType='text-position_._type_._base_._item_._member_._1_._member_._2'"
	 * @generated
	 */
	EDataType getTextPositionTypeBaseItemMember1Member2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType <em>Text Rotation Scale Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Rotation Scale Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType"
	 *        extendedMetaData="name='text-rotation-scale_._type:Object' baseType='text-rotation-scale_._type'"
	 * @generated
	 */
	EDataType getTextRotationScaleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1 <em>Text Underline Color Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Underline Color Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1"
	 *        extendedMetaData="name='text-underline-color_._type_._member_._1:Object' baseType='text-underline-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextUnderlineColorTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType <em>Table Centering Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table Centering Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType"
	 *        extendedMetaData="name='table-centering_._type:Object' baseType='table-centering_._type'"
	 * @generated
	 */
	EDataType getTableCenteringTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType <em>Text Align Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Align Source Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType"
	 *        extendedMetaData="name='text-align-source_._type:Object' baseType='text-align-source_._type'"
	 * @generated
	 */
	EDataType getTextAlignSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem <em>Text Emphasize Type Member1 Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Emphasize Type Member1 Base Item Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem"
	 *        extendedMetaData="name='text-emphasize_._type_._member_._1_._base_._item:Object' baseType='text-emphasize_._type_._member_._1_._base_._item'"
	 * @generated
	 */
	EDataType getTextEmphasizeTypeMember1BaseItemObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text Underline Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Underline Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='text-underline-color_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#color text-underline-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextUnderlineColorType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType <em>Vertical Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertical Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType"
	 *        extendedMetaData="name='vertical-align_._type:Object' baseType='vertical-align_._type'"
	 * @generated
	 */
	EDataType getVerticalAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType <em>Vertical Pos Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertical Pos Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType"
	 *        extendedMetaData="name='vertical-pos_._type:Object' baseType='vertical-pos_._type'"
	 * @generated
	 */
	EDataType getVerticalPosTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType <em>Vertical Rel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertical Rel Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType"
	 *        extendedMetaData="name='vertical-rel_._type:Object' baseType='vertical-rel_._type'"
	 * @generated
	 */
	EDataType getVerticalRelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType <em>Wrap Contour Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Contour Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType"
	 *        extendedMetaData="name='wrap-contour-mode_._type:Object' baseType='wrap-contour-mode_._type'"
	 * @generated
	 */
	EDataType getWrapContourModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapType <em>Wrap Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.WrapType"
	 *        extendedMetaData="name='wrap_._type:Object' baseType='wrap_._type'"
	 * @generated
	 */
	EDataType getWrapTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType <em>Writing Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Writing Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType"
	 *        extendedMetaData="name='writing-mode_._type:Object' baseType='writing-mode_._type'"
	 * @generated
	 */
	EDataType getWritingModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StyleFactory getStyleFactory();

} //StylePackage
