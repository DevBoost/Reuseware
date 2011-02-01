/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartFactory
 * @model kind="package"
 * @generated
 */
public interface ChartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfchart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl <em>Axis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getAxisType()
	 * @generated
	 */
	int AXIS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__GRID = 2;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__STYLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Axis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.CategoriesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getCategoriesType()
	 * @generated
	 */
	int CATEGORIES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_TYPE__CELL_RANGE_ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Categories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DataPointTypeImpl <em>Data Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DataPointTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataPointType()
	 * @generated
	 */
	int DATA_POINT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT_TYPE__REPEATED = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AXIS = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATEGORIES = 4;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHART = 5;

	/**
	 * The feature id for the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_POINT = 6;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN = 7;

	/**
	 * The feature id for the '<em><b>Error Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOOR = 9;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER = 10;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID = 11;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND = 12;

	/**
	 * The feature id for the '<em><b>Mean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEAN_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Plot Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLOT_AREA = 14;

	/**
	 * The feature id for the '<em><b>Regression Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGRESSION_CURVE = 15;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIES = 16;

	/**
	 * The feature id for the '<em><b>Stock Gain Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOCK_GAIN_MARKER = 17;

	/**
	 * The feature id for the '<em><b>Stock Loss Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOCK_LOSS_MARKER = 18;

	/**
	 * The feature id for the '<em><b>Stock Range Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOCK_RANGE_LINE = 19;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTITLE = 20;

	/**
	 * The feature id for the '<em><b>Symbol Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_IMAGE = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 22;

	/**
	 * The feature id for the '<em><b>Wall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WALL = 23;

	/**
	 * The feature id for the '<em><b>Attached Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTACHED_AXIS = 24;

	/**
	 * The feature id for the '<em><b>Column Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_MAPPING = 25;

	/**
	 * The feature id for the '<em><b>Connect Bars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECT_BARS = 26;

	/**
	 * The feature id for the '<em><b>Data Label Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_LABEL_NUMBER = 27;

	/**
	 * The feature id for the '<em><b>Data Label Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_LABEL_SYMBOL = 28;

	/**
	 * The feature id for the '<em><b>Data Label Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_LABEL_TEXT = 29;

	/**
	 * The feature id for the '<em><b>Data Source Has Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS = 30;

	/**
	 * The feature id for the '<em><b>Deep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEEP = 31;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIMENSION = 32;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_LABEL = 33;

	/**
	 * The feature id for the '<em><b>Error Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_CATEGORY = 34;

	/**
	 * The feature id for the '<em><b>Error Lower Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_LOWER_INDICATOR = 35;

	/**
	 * The feature id for the '<em><b>Error Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_LOWER_LIMIT = 36;

	/**
	 * The feature id for the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_MARGIN = 37;

	/**
	 * The feature id for the '<em><b>Error Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_PERCENTAGE = 38;

	/**
	 * The feature id for the '<em><b>Error Upper Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_UPPER_INDICATOR = 39;

	/**
	 * The feature id for the '<em><b>Error Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_UPPER_LIMIT = 40;

	/**
	 * The feature id for the '<em><b>Gap Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GAP_WIDTH = 41;

	/**
	 * The feature id for the '<em><b>Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERPOLATION = 42;

	/**
	 * The feature id for the '<em><b>Interval Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERVAL_MAJOR = 43;

	/**
	 * The feature id for the '<em><b>Interval Minor Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR = 44;

	/**
	 * The feature id for the '<em><b>Japanese Candle Stick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JAPANESE_CANDLE_STICK = 45;

	/**
	 * The feature id for the '<em><b>Label Arrangement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_ARRANGEMENT = 46;

	/**
	 * The feature id for the '<em><b>Label Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_CELL_ADDRESS = 47;

	/**
	 * The feature id for the '<em><b>Legend Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND_ALIGN = 48;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND_POSITION = 49;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINES = 50;

	/**
	 * The feature id for the '<em><b>Link Data Style To Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE = 51;

	/**
	 * The feature id for the '<em><b>Logarithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGARITHMIC = 52;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAXIMUM = 53;

	/**
	 * The feature id for the '<em><b>Mean Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEAN_VALUE1 = 54;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MINIMUM = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 56;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGIN = 57;

	/**
	 * The feature id for the '<em><b>Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERLAP = 58;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERCENTAGE = 59;

	/**
	 * The feature id for the '<em><b>Pie Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PIE_OFFSET = 60;

	/**
	 * The feature id for the '<em><b>Regression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGRESSION_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEATED = 62;

	/**
	 * The feature id for the '<em><b>Row Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROW_MAPPING = 63;

	/**
	 * The feature id for the '<em><b>Scale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE_TEXT = 64;

	/**
	 * The feature id for the '<em><b>Series Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIES_SOURCE = 65;

	/**
	 * The feature id for the '<em><b>Solid Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOLID_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Spline Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPLINE_ORDER = 67;

	/**
	 * The feature id for the '<em><b>Spline Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPLINE_RESOLUTION = 68;

	/**
	 * The feature id for the '<em><b>Stacked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STACKED = 69;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_NAME = 70;

	/**
	 * The feature id for the '<em><b>Symbol Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_HEIGHT = 71;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_NAME = 72;

	/**
	 * The feature id for the '<em><b>Symbol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Symbol Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL_WIDTH = 74;

	/**
	 * The feature id for the '<em><b>Text Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_OVERLAP = 75;

	/**
	 * The feature id for the '<em><b>Three Dimensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THREE_DIMENSIONAL = 76;

	/**
	 * The feature id for the '<em><b>Tick Marks Major Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER = 77;

	/**
	 * The feature id for the '<em><b>Tick Marks Major Outer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER = 78;

	/**
	 * The feature id for the '<em><b>Tick Marks Minor Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER = 79;

	/**
	 * The feature id for the '<em><b>Tick Marks Minor Outer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER = 80;

	/**
	 * The feature id for the '<em><b>Values Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS = 81;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERTICAL = 82;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBLE = 83;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 84;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DomainTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__CELL_RANGE_ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ErrorIndicatorTypeImpl <em>Error Indicator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ErrorIndicatorTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorIndicatorType()
	 * @generated
	 */
	int ERROR_INDICATOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INDICATOR_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Error Indicator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INDICATOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FloorTypeImpl <em>Floor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FloorTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getFloorType()
	 * @generated
	 */
	int FLOOR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_TYPE__STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_TYPE__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Floor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FooterTypeImpl <em>Footer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FooterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getFooterType()
	 * @generated
	 */
	int FOOTER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Cell Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__CELL_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__STYLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE__Y = 4;

	/**
	 * The number of structural features of the '<em>Footer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.GridTypeImpl <em>Grid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.GridTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getGridType()
	 * @generated
	 */
	int GRID_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Grid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl <em>Legend Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendType()
	 * @generated
	 */
	int LEGEND_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Legend Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__LEGEND_ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Legend Expansion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__LEGEND_EXPANSION = 1;

	/**
	 * The feature id for the '<em><b>Legend Expansion Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO = 2;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__LEGEND_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__STYLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE__Y = 6;

	/**
	 * The number of structural features of the '<em>Legend Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.MeanValueTypeImpl <em>Mean Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.MeanValueTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getMeanValueType()
	 * @generated
	 */
	int MEAN_VALUE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_VALUE_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Mean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl <em>Plot Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getPlotAreaType()
	 * @generated
	 */
	int PLOT_AREA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__LIGHT = 0;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__AXIS = 1;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__SERIES = 2;

	/**
	 * The feature id for the '<em><b>Stock Gain Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__STOCK_GAIN_MARKER = 3;

	/**
	 * The feature id for the '<em><b>Stock Loss Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__STOCK_LOSS_MARKER = 4;

	/**
	 * The feature id for the '<em><b>Stock Range Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__STOCK_RANGE_LINE = 5;

	/**
	 * The feature id for the '<em><b>Wall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__WALL = 6;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__FLOOR = 7;

	/**
	 * The feature id for the '<em><b>Ambient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__AMBIENT_COLOR = 8;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__CELL_RANGE_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Data Source Has Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS = 10;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__DISTANCE = 11;

	/**
	 * The feature id for the '<em><b>Focal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__FOCAL_LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__HEIGHT = 13;

	/**
	 * The feature id for the '<em><b>Lighting Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__LIGHTING_MODE = 14;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__PROJECTION = 15;

	/**
	 * The feature id for the '<em><b>Shade Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__SHADE_MODE = 16;

	/**
	 * The feature id for the '<em><b>Shadow Slant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__SHADOW_SLANT = 17;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__STYLE_NAME = 18;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__TRANSFORM = 19;

	/**
	 * The feature id for the '<em><b>Vpn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__VPN = 20;

	/**
	 * The feature id for the '<em><b>Vrp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__VRP = 21;

	/**
	 * The feature id for the '<em><b>Vup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__VUP = 22;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__WIDTH = 23;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__X = 24;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE__Y = 25;

	/**
	 * The number of structural features of the '<em>Plot Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_AREA_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.RegressionCurveTypeImpl <em>Regression Curve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.RegressionCurveTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionCurveType()
	 * @generated
	 */
	int REGRESSION_CURVE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_CURVE_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Regression Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_CURVE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl <em>Series Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesType()
	 * @generated
	 */
	int SERIES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Mean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__MEAN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Regression Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__REGRESSION_CURVE = 2;

	/**
	 * The feature id for the '<em><b>Error Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__ERROR_INDICATOR = 3;

	/**
	 * The feature id for the '<em><b>Data Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__DATA_POINT = 4;

	/**
	 * The feature id for the '<em><b>Attached Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__ATTACHED_AXIS = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Label Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__LABEL_CELL_ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__STYLE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Values Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS = 9;

	/**
	 * The number of structural features of the '<em>Series Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockGainMarkerTypeImpl <em>Stock Gain Marker Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockGainMarkerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockGainMarkerType()
	 * @generated
	 */
	int STOCK_GAIN_MARKER_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_GAIN_MARKER_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Stock Gain Marker Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_GAIN_MARKER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockLossMarkerTypeImpl <em>Stock Loss Marker Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockLossMarkerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockLossMarkerType()
	 * @generated
	 */
	int STOCK_LOSS_MARKER_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LOSS_MARKER_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Stock Loss Marker Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LOSS_MARKER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockRangeLineTypeImpl <em>Stock Range Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockRangeLineTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockRangeLineType()
	 * @generated
	 */
	int STOCK_RANGE_LINE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_RANGE_LINE_TYPE__STYLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Stock Range Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_RANGE_LINE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SubtitleTypeImpl <em>Subtitle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SubtitleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSubtitleType()
	 * @generated
	 */
	int SUBTITLE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Cell Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__CELL_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__STYLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__Y = 4;

	/**
	 * The number of structural features of the '<em>Subtitle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SymbolImageTypeImpl <em>Symbol Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SymbolImageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolImageType()
	 * @generated
	 */
	int SYMBOL_IMAGE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_IMAGE_TYPE__HREF = 0;

	/**
	 * The number of structural features of the '<em>Symbol Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_IMAGE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.TitleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Cell Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__CELL_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__STYLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__Y = 4;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.WallTypeImpl <em>Wall Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.WallTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getWallType()
	 * @generated
	 */
	int WALL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TYPE__STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TYPE__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Wall Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType <em>Data Label Number Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataLabelNumberType()
	 * @generated
	 */
	int DATA_LABEL_NUMBER_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType <em>Data Source Has Labels Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataSourceHasLabelsType()
	 * @generated
	 */
	int DATA_SOURCE_HAS_LABELS_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType <em>Dimension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType <em>Error Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorCategoryType()
	 * @generated
	 */
	int ERROR_CATEGORY_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType <em>Interpolation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getInterpolationType()
	 * @generated
	 */
	int INTERPOLATION_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType <em>Label Arrangement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLabelArrangementType()
	 * @generated
	 */
	int LABEL_ARRANGEMENT_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType <em>Legend Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendAlignType()
	 * @generated
	 */
	int LEGEND_ALIGN_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType <em>Legend Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendPositionType()
	 * @generated
	 */
	int LEGEND_POSITION_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType <em>Regression Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionTypeType()
	 * @generated
	 */
	int REGRESSION_TYPE_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType <em>Series Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesSourceType()
	 * @generated
	 */
	int SERIES_SOURCE_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType <em>Solid Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSolidTypeType()
	 * @generated
	 */
	int SOLID_TYPE_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType <em>Symbol Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolNameType()
	 * @generated
	 */
	int SYMBOL_NAME_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType <em>Symbol Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolTypeType()
	 * @generated
	 */
	int SYMBOL_TYPE_TYPE = 34;

	/**
	 * The meta object id for the '<em>Class Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getClassTypeObject()
	 * @generated
	 */
	int CLASS_TYPE_OBJECT = 35;

	/**
	 * The meta object id for the '<em>Data Label Number Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataLabelNumberTypeObject()
	 * @generated
	 */
	int DATA_LABEL_NUMBER_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Data Source Has Labels Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataSourceHasLabelsTypeObject()
	 * @generated
	 */
	int DATA_SOURCE_HAS_LABELS_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Dimension Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDimensionTypeObject()
	 * @generated
	 */
	int DIMENSION_TYPE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Error Category Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorCategoryTypeObject()
	 * @generated
	 */
	int ERROR_CATEGORY_TYPE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Interpolation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getInterpolationTypeObject()
	 * @generated
	 */
	int INTERPOLATION_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Label Arrangement Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLabelArrangementTypeObject()
	 * @generated
	 */
	int LABEL_ARRANGEMENT_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Legend Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendAlignTypeObject()
	 * @generated
	 */
	int LEGEND_ALIGN_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Legend Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendPositionTypeObject()
	 * @generated
	 */
	int LEGEND_POSITION_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Regression Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionTypeTypeObject()
	 * @generated
	 */
	int REGRESSION_TYPE_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Series Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesSourceTypeObject()
	 * @generated
	 */
	int SERIES_SOURCE_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Solid Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSolidTypeTypeObject()
	 * @generated
	 */
	int SOLID_TYPE_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStyleNameType()
	 * @generated
	 */
	int STYLE_NAME_TYPE = 47;

	/**
	 * The meta object id for the '<em>Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStyleNameTypeMember1()
	 * @generated
	 */
	int STYLE_NAME_TYPE_MEMBER1 = 48;

	/**
	 * The meta object id for the '<em>Symbol Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolNameTypeObject()
	 * @generated
	 */
	int SYMBOL_NAME_TYPE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Symbol Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolTypeTypeObject()
	 * @generated
	 */
	int SYMBOL_TYPE_TYPE_OBJECT = 50;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType <em>Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType
	 * @generated
	 */
	EClass getAxisType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getTitle()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getCategories()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getGrid()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_Grid();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension()
	 * @see #getAxisType()
	 * @generated
	 */
	EAttribute getAxisType_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getName()
	 * @see #getAxisType()
	 * @generated
	 */
	EAttribute getAxisType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getStyleName()
	 * @see #getAxisType()
	 * @generated
	 */
	EAttribute getAxisType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType
	 * @generated
	 */
	EClass getCategoriesType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType#getCellRangeAddress()
	 * @see #getCategoriesType()
	 * @generated
	 */
	EAttribute getCategoriesType_CellRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType <em>Data Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Point Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType
	 * @generated
	 */
	EClass getDataPointType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType#getRepeated()
	 * @see #getDataPointType()
	 * @generated
	 */
	EAttribute getDataPointType_Repeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType#getStyleName()
	 * @see #getDataPointType()
	 * @generated
	 */
	EAttribute getDataPointType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAxis()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Axis();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getCategories()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getChart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Chart();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataPoint <em>Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorIndicator <em>Error Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Indicator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floor</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFloor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Floor();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFooter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Footer();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGrid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Grid();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegend()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Legend();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue <em>Mean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MeanValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPlotArea <em>Plot Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plot Area</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPlotArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlotArea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionCurve <em>Regression Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regression Curve</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionCurve()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegressionCurve();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Series</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Series();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockGainMarker <em>Stock Gain Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Gain Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockGainMarker()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StockGainMarker();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockLossMarker <em>Stock Loss Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Loss Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockLossMarker()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StockLossMarker();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockRangeLine <em>Stock Range Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Range Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockRangeLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StockRangeLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSubtitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subtitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolImage <em>Symbol Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbol Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SymbolImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getWall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wall</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getWall()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Wall();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAttachedAxis <em>Attached Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Axis</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAttachedAxis()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AttachedAxis();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getColumnMapping <em>Column Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Mapping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getColumnMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColumnMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars <em>Connect Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Bars</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConnectBars();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber <em>Data Label Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Label Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataLabelNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol <em>Data Label Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Label Symbol</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataLabelSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText <em>Data Label Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Label Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataLabelText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels <em>Data Source Has Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Has Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataSourceHasLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep <em>Deep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Deep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory <em>Error Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Category</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator <em>Error Lower Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Lower Indicator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorLowerIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit <em>Error Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Lower Limit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorLowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin <em>Error Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Margin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage <em>Error Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Percentage</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator <em>Error Upper Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Upper Indicator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorUpperIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit <em>Error Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Upper Limit</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ErrorUpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGapWidth <em>Gap Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGapWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GapWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation <em>Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Interpolation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor <em>Interval Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Major</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IntervalMajor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMinorDivisor <em>Interval Minor Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Minor Divisor</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMinorDivisor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IntervalMinorDivisor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick <em>Japanese Candle Stick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Japanese Candle Stick</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_JapaneseCandleStick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement <em>Label Arrangement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Arrangement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LabelArrangement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelCellAddress <em>Label Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LabelCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign <em>Legend Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LegendAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition <em>Legend Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LegendPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Lines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource <em>Link Data Style To Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Data Style To Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkDataStyleToSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic <em>Logarithmic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logarithmic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Logarithmic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1 <em>Mean Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Value1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MeanValue1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOverlap <em>Overlap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOverlap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Overlap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPieOffset <em>Pie Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pie Offset</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPieOffset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PieOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType <em>Regression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regression Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RegressionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRepeated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Repeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRowMapping <em>Row Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Mapping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRowMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RowMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText <em>Scale Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScaleText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource <em>Series Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SeriesSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType <em>Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solid Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SolidType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineOrder <em>Spline Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SplineOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineResolution <em>Spline Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline Resolution</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineResolution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SplineResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked <em>Stacked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stacked</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Stacked();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolHeight <em>Symbol Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SymbolHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SymbolName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType <em>Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SymbolType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolWidth <em>Symbol Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SymbolWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap <em>Text Overlap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Overlap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextOverlap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional <em>Three Dimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Three Dimensional</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ThreeDimensional();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Marks Major Inner</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TickMarksMajorInner();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Marks Major Outer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TickMarksMajorOuter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Marks Minor Inner</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TickMarksMinorInner();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Marks Minor Outer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TickMarksMinorOuter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getValuesCellRangeAddress <em>Values Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getValuesCellRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ValuesCellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Visible();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType#getCellRangeAddress()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_CellRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType <em>Error Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Indicator Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType
	 * @generated
	 */
	EClass getErrorIndicatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType#getStyleName()
	 * @see #getErrorIndicatorType()
	 * @generated
	 */
	EAttribute getErrorIndicatorType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType <em>Floor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType
	 * @generated
	 */
	EClass getFloorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType#getStyleName()
	 * @see #getFloorType()
	 * @generated
	 */
	EAttribute getFloorType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType#getWidth()
	 * @see #getFloorType()
	 * @generated
	 */
	EAttribute getFloorType_Width();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType <em>Footer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType
	 * @generated
	 */
	EClass getFooterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getP()
	 * @see #getFooterType()
	 * @generated
	 */
	EReference getFooterType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getCellRange <em>Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getCellRange()
	 * @see #getFooterType()
	 * @generated
	 */
	EAttribute getFooterType_CellRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getStyleName()
	 * @see #getFooterType()
	 * @generated
	 */
	EAttribute getFooterType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getX()
	 * @see #getFooterType()
	 * @generated
	 */
	EAttribute getFooterType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType#getY()
	 * @see #getFooterType()
	 * @generated
	 */
	EAttribute getFooterType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.GridType
	 * @generated
	 */
	EClass getGridType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getStyleName()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType <em>Legend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType
	 * @generated
	 */
	EClass getLegendType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign <em>Legend Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_LegendAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion <em>Legend Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Expansion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_LegendExpansion();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Expansion Aspect Ratio</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_LegendExpansionAspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition <em>Legend Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_LegendPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getStyleName()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getX()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getY()
	 * @see #getLegendType()
	 * @generated
	 */
	EAttribute getLegendType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType <em>Mean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mean Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType
	 * @generated
	 */
	EClass getMeanValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType#getStyleName()
	 * @see #getMeanValueType()
	 * @generated
	 */
	EAttribute getMeanValueType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType <em>Plot Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot Area Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType
	 * @generated
	 */
	EClass getPlotAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLight()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_Light();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAxis()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_Axis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getSeries()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_Series();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockGainMarker <em>Stock Gain Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Gain Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockGainMarker()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_StockGainMarker();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockLossMarker <em>Stock Loss Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Loss Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockLossMarker()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_StockLossMarker();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockRangeLine <em>Stock Range Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Range Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockRangeLine()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_StockRangeLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wall</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWall()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_Wall();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floor</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFloor()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EReference getPlotAreaType_Floor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAmbientColor <em>Ambient Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAmbientColor()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_AmbientColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getCellRangeAddress()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_CellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels <em>Data Source Has Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Has Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_DataSourceHasLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDistance()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFocalLength <em>Focal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFocalLength()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_FocalLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getHeight()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode <em>Lighting Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lighting Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_LightingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Projection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode <em>Shade Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shade Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_ShadeMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadowSlant <em>Shadow Slant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Slant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadowSlant()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_ShadowSlant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStyleName()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getTransform()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVpn <em>Vpn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVpn()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Vpn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVrp <em>Vrp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vrp</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVrp()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Vrp();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVup <em>Vup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vup</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVup()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Vup();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWidth()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getX()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getY()
	 * @see #getPlotAreaType()
	 * @generated
	 */
	EAttribute getPlotAreaType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType <em>Regression Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regression Curve Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType
	 * @generated
	 */
	EClass getRegressionCurveType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType#getStyleName()
	 * @see #getRegressionCurveType()
	 * @generated
	 */
	EAttribute getRegressionCurveType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType <em>Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType
	 * @generated
	 */
	EClass getSeriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDomain()
	 * @see #getSeriesType()
	 * @generated
	 */
	EReference getSeriesType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getMeanValue <em>Mean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getMeanValue()
	 * @see #getSeriesType()
	 * @generated
	 */
	EReference getSeriesType_MeanValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getRegressionCurve <em>Regression Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regression Curve</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getRegressionCurve()
	 * @see #getSeriesType()
	 * @generated
	 */
	EReference getSeriesType_RegressionCurve();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getErrorIndicator <em>Error Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Indicator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getErrorIndicator()
	 * @see #getSeriesType()
	 * @generated
	 */
	EReference getSeriesType_ErrorIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDataPoint <em>Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Point</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDataPoint()
	 * @see #getSeriesType()
	 * @generated
	 */
	EReference getSeriesType_DataPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getAttachedAxis <em>Attached Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Axis</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getAttachedAxis()
	 * @see #getSeriesType()
	 * @generated
	 */
	EAttribute getSeriesType_AttachedAxis();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getClass_()
	 * @see #getSeriesType()
	 * @generated
	 */
	EAttribute getSeriesType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getLabelCellAddress <em>Label Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getLabelCellAddress()
	 * @see #getSeriesType()
	 * @generated
	 */
	EAttribute getSeriesType_LabelCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getStyleName()
	 * @see #getSeriesType()
	 * @generated
	 */
	EAttribute getSeriesType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getValuesCellRangeAddress <em>Values Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getValuesCellRangeAddress()
	 * @see #getSeriesType()
	 * @generated
	 */
	EAttribute getSeriesType_ValuesCellRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType <em>Stock Gain Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Gain Marker Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType
	 * @generated
	 */
	EClass getStockGainMarkerType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType#getStyleName()
	 * @see #getStockGainMarkerType()
	 * @generated
	 */
	EAttribute getStockGainMarkerType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType <em>Stock Loss Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Loss Marker Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType
	 * @generated
	 */
	EClass getStockLossMarkerType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType#getStyleName()
	 * @see #getStockLossMarkerType()
	 * @generated
	 */
	EAttribute getStockLossMarkerType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType <em>Stock Range Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Range Line Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType
	 * @generated
	 */
	EClass getStockRangeLineType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType#getStyleName()
	 * @see #getStockRangeLineType()
	 * @generated
	 */
	EAttribute getStockRangeLineType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtitle Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType
	 * @generated
	 */
	EClass getSubtitleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getP()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getCellRange <em>Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getCellRange()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_CellRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getStyleName()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getX()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType#getY()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType <em>Symbol Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Image Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType
	 * @generated
	 */
	EClass getSymbolImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType#getHref()
	 * @see #getSymbolImageType()
	 * @generated
	 */
	EAttribute getSymbolImageType_Href();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getP()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getCellRange <em>Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getCellRange()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_CellRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getStyleName()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getX()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType#getY()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.WallType <em>Wall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.WallType
	 * @generated
	 */
	EClass getWallType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.WallType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.WallType#getStyleName()
	 * @see #getWallType()
	 * @generated
	 */
	EAttribute getWallType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.WallType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.WallType#getWidth()
	 * @see #getWallType()
	 * @generated
	 */
	EAttribute getWallType_Width();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @generated
	 */
	EEnum getClassType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType <em>Data Label Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Label Number Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @generated
	 */
	EEnum getDataLabelNumberType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType <em>Data Source Has Labels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source Has Labels Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @generated
	 */
	EEnum getDataSourceHasLabelsType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @generated
	 */
	EEnum getDimensionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType <em>Error Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Category Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @generated
	 */
	EEnum getErrorCategoryType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType <em>Interpolation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interpolation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @generated
	 */
	EEnum getInterpolationType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType <em>Label Arrangement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Arrangement Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @generated
	 */
	EEnum getLabelArrangementType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType <em>Legend Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legend Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @generated
	 */
	EEnum getLegendAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType <em>Legend Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legend Position Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @generated
	 */
	EEnum getLegendPositionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType <em>Regression Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regression Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @generated
	 */
	EEnum getRegressionTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType <em>Series Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Series Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @generated
	 */
	EEnum getSeriesSourceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType <em>Solid Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Solid Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @generated
	 */
	EEnum getSolidTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType <em>Symbol Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symbol Name Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @generated
	 */
	EEnum getSymbolNameType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType <em>Symbol Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symbol Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @generated
	 */
	EEnum getSymbolTypeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType <em>Class Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType"
	 *        extendedMetaData="name='class_._type:Object' baseType='class_._type'"
	 * @generated
	 */
	EDataType getClassTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType <em>Data Label Number Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Label Number Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType"
	 *        extendedMetaData="name='data-label-number_._type:Object' baseType='data-label-number_._type'"
	 * @generated
	 */
	EDataType getDataLabelNumberTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType <em>Data Source Has Labels Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Source Has Labels Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType"
	 *        extendedMetaData="name='data-source-has-labels_._type:Object' baseType='data-source-has-labels_._type'"
	 * @generated
	 */
	EDataType getDataSourceHasLabelsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType <em>Dimension Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dimension Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType"
	 *        extendedMetaData="name='dimension_._type:Object' baseType='dimension_._type'"
	 * @generated
	 */
	EDataType getDimensionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType <em>Error Category Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Error Category Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType"
	 *        extendedMetaData="name='error-category_._type:Object' baseType='error-category_._type'"
	 * @generated
	 */
	EDataType getErrorCategoryTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType <em>Interpolation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interpolation Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType"
	 *        extendedMetaData="name='interpolation_._type:Object' baseType='interpolation_._type'"
	 * @generated
	 */
	EDataType getInterpolationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType <em>Label Arrangement Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Label Arrangement Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType"
	 *        extendedMetaData="name='label-arrangement_._type:Object' baseType='label-arrangement_._type'"
	 * @generated
	 */
	EDataType getLabelArrangementTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType <em>Legend Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Legend Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType"
	 *        extendedMetaData="name='legend-align_._type:Object' baseType='legend-align_._type'"
	 * @generated
	 */
	EDataType getLegendAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType <em>Legend Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Legend Position Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType"
	 *        extendedMetaData="name='legend-position_._type:Object' baseType='legend-position_._type'"
	 * @generated
	 */
	EDataType getLegendPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType <em>Regression Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Regression Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType"
	 *        extendedMetaData="name='regression-type_._type:Object' baseType='regression-type_._type'"
	 * @generated
	 */
	EDataType getRegressionTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType <em>Series Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Series Source Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType"
	 *        extendedMetaData="name='series-source_._type:Object' baseType='series-source_._type'"
	 * @generated
	 */
	EDataType getSeriesSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType <em>Solid Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Solid Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType"
	 *        extendedMetaData="name='solid-type_._type:Object' baseType='solid-type_._type'"
	 * @generated
	 */
	EDataType getSolidTypeTypeObject();

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
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType <em>Symbol Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symbol Name Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType"
	 *        extendedMetaData="name='symbol-name_._type:Object' baseType='symbol-name_._type'"
	 * @generated
	 */
	EDataType getSymbolNameTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType <em>Symbol Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symbol Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType"
	 *        extendedMetaData="name='symbol-type_._type:Object' baseType='symbol-type_._type'"
	 * @generated
	 */
	EDataType getSymbolTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartFactory getChartFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl <em>Axis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getAxisType()
		 * @generated
		 */
		EClass AXIS_TYPE = eINSTANCE.getAxisType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__TITLE = eINSTANCE.getAxisType_Title();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__CATEGORIES = eINSTANCE.getAxisType_Categories();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__GRID = eINSTANCE.getAxisType_Grid();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_TYPE__DIMENSION = eINSTANCE.getAxisType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_TYPE__NAME = eINSTANCE.getAxisType_Name();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_TYPE__STYLE_NAME = eINSTANCE.getAxisType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.CategoriesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getCategoriesType()
		 * @generated
		 */
		EClass CATEGORIES_TYPE = eINSTANCE.getCategoriesType();

		/**
		 * The meta object literal for the '<em><b>Cell Range Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIES_TYPE__CELL_RANGE_ADDRESS = eINSTANCE.getCategoriesType_CellRangeAddress();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DataPointTypeImpl <em>Data Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DataPointTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataPointType()
		 * @generated
		 */
		EClass DATA_POINT_TYPE = eINSTANCE.getDataPointType();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_POINT_TYPE__REPEATED = eINSTANCE.getDataPointType_Repeated();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_POINT_TYPE__STYLE_NAME = eINSTANCE.getDataPointType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AXIS = eINSTANCE.getDocumentRoot_Axis();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATEGORIES = eINSTANCE.getDocumentRoot_Categories();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHART = eINSTANCE.getDocumentRoot_Chart();

		/**
		 * The meta object literal for the '<em><b>Data Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_POINT = eINSTANCE.getDocumentRoot_DataPoint();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN = eINSTANCE.getDocumentRoot_Domain();

		/**
		 * The meta object literal for the '<em><b>Error Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERROR_INDICATOR = eINSTANCE.getDocumentRoot_ErrorIndicator();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOOR = eINSTANCE.getDocumentRoot_Floor();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOOTER = eINSTANCE.getDocumentRoot_Footer();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GRID = eINSTANCE.getDocumentRoot_Grid();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LEGEND = eINSTANCE.getDocumentRoot_Legend();

		/**
		 * The meta object literal for the '<em><b>Mean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEAN_VALUE = eINSTANCE.getDocumentRoot_MeanValue();

		/**
		 * The meta object literal for the '<em><b>Plot Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLOT_AREA = eINSTANCE.getDocumentRoot_PlotArea();

		/**
		 * The meta object literal for the '<em><b>Regression Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGRESSION_CURVE = eINSTANCE.getDocumentRoot_RegressionCurve();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERIES = eINSTANCE.getDocumentRoot_Series();

		/**
		 * The meta object literal for the '<em><b>Stock Gain Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOCK_GAIN_MARKER = eINSTANCE.getDocumentRoot_StockGainMarker();

		/**
		 * The meta object literal for the '<em><b>Stock Loss Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOCK_LOSS_MARKER = eINSTANCE.getDocumentRoot_StockLossMarker();

		/**
		 * The meta object literal for the '<em><b>Stock Range Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOCK_RANGE_LINE = eINSTANCE.getDocumentRoot_StockRangeLine();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBTITLE = eINSTANCE.getDocumentRoot_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Symbol Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYMBOL_IMAGE = eINSTANCE.getDocumentRoot_SymbolImage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Wall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WALL = eINSTANCE.getDocumentRoot_Wall();

		/**
		 * The meta object literal for the '<em><b>Attached Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ATTACHED_AXIS = eINSTANCE.getDocumentRoot_AttachedAxis();

		/**
		 * The meta object literal for the '<em><b>Column Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLUMN_MAPPING = eINSTANCE.getDocumentRoot_ColumnMapping();

		/**
		 * The meta object literal for the '<em><b>Connect Bars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONNECT_BARS = eINSTANCE.getDocumentRoot_ConnectBars();

		/**
		 * The meta object literal for the '<em><b>Data Label Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_LABEL_NUMBER = eINSTANCE.getDocumentRoot_DataLabelNumber();

		/**
		 * The meta object literal for the '<em><b>Data Label Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_LABEL_SYMBOL = eINSTANCE.getDocumentRoot_DataLabelSymbol();

		/**
		 * The meta object literal for the '<em><b>Data Label Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_LABEL_TEXT = eINSTANCE.getDocumentRoot_DataLabelText();

		/**
		 * The meta object literal for the '<em><b>Data Source Has Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS = eINSTANCE.getDocumentRoot_DataSourceHasLabels();

		/**
		 * The meta object literal for the '<em><b>Deep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEEP = eINSTANCE.getDocumentRoot_Deep();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIMENSION = eINSTANCE.getDocumentRoot_Dimension();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_LABEL = eINSTANCE.getDocumentRoot_DisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Error Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_CATEGORY = eINSTANCE.getDocumentRoot_ErrorCategory();

		/**
		 * The meta object literal for the '<em><b>Error Lower Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_LOWER_INDICATOR = eINSTANCE.getDocumentRoot_ErrorLowerIndicator();

		/**
		 * The meta object literal for the '<em><b>Error Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_LOWER_LIMIT = eINSTANCE.getDocumentRoot_ErrorLowerLimit();

		/**
		 * The meta object literal for the '<em><b>Error Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_MARGIN = eINSTANCE.getDocumentRoot_ErrorMargin();

		/**
		 * The meta object literal for the '<em><b>Error Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_PERCENTAGE = eINSTANCE.getDocumentRoot_ErrorPercentage();

		/**
		 * The meta object literal for the '<em><b>Error Upper Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_UPPER_INDICATOR = eINSTANCE.getDocumentRoot_ErrorUpperIndicator();

		/**
		 * The meta object literal for the '<em><b>Error Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ERROR_UPPER_LIMIT = eINSTANCE.getDocumentRoot_ErrorUpperLimit();

		/**
		 * The meta object literal for the '<em><b>Gap Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GAP_WIDTH = eINSTANCE.getDocumentRoot_GapWidth();

		/**
		 * The meta object literal for the '<em><b>Interpolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INTERPOLATION = eINSTANCE.getDocumentRoot_Interpolation();

		/**
		 * The meta object literal for the '<em><b>Interval Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INTERVAL_MAJOR = eINSTANCE.getDocumentRoot_IntervalMajor();

		/**
		 * The meta object literal for the '<em><b>Interval Minor Divisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR = eINSTANCE.getDocumentRoot_IntervalMinorDivisor();

		/**
		 * The meta object literal for the '<em><b>Japanese Candle Stick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__JAPANESE_CANDLE_STICK = eINSTANCE.getDocumentRoot_JapaneseCandleStick();

		/**
		 * The meta object literal for the '<em><b>Label Arrangement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LABEL_ARRANGEMENT = eINSTANCE.getDocumentRoot_LabelArrangement();

		/**
		 * The meta object literal for the '<em><b>Label Cell Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LABEL_CELL_ADDRESS = eINSTANCE.getDocumentRoot_LabelCellAddress();

		/**
		 * The meta object literal for the '<em><b>Legend Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LEGEND_ALIGN = eINSTANCE.getDocumentRoot_LegendAlign();

		/**
		 * The meta object literal for the '<em><b>Legend Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LEGEND_POSITION = eINSTANCE.getDocumentRoot_LegendPosition();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LINES = eINSTANCE.getDocumentRoot_Lines();

		/**
		 * The meta object literal for the '<em><b>Link Data Style To Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE = eINSTANCE.getDocumentRoot_LinkDataStyleToSource();

		/**
		 * The meta object literal for the '<em><b>Logarithmic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LOGARITHMIC = eINSTANCE.getDocumentRoot_Logarithmic();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAXIMUM = eINSTANCE.getDocumentRoot_Maximum();

		/**
		 * The meta object literal for the '<em><b>Mean Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MEAN_VALUE1 = eINSTANCE.getDocumentRoot_MeanValue1();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MINIMUM = eINSTANCE.getDocumentRoot_Minimum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORIGIN = eINSTANCE.getDocumentRoot_Origin();

		/**
		 * The meta object literal for the '<em><b>Overlap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OVERLAP = eINSTANCE.getDocumentRoot_Overlap();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PERCENTAGE = eINSTANCE.getDocumentRoot_Percentage();

		/**
		 * The meta object literal for the '<em><b>Pie Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PIE_OFFSET = eINSTANCE.getDocumentRoot_PieOffset();

		/**
		 * The meta object literal for the '<em><b>Regression Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REGRESSION_TYPE = eINSTANCE.getDocumentRoot_RegressionType();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REPEATED = eINSTANCE.getDocumentRoot_Repeated();

		/**
		 * The meta object literal for the '<em><b>Row Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ROW_MAPPING = eINSTANCE.getDocumentRoot_RowMapping();

		/**
		 * The meta object literal for the '<em><b>Scale Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SCALE_TEXT = eINSTANCE.getDocumentRoot_ScaleText();

		/**
		 * The meta object literal for the '<em><b>Series Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERIES_SOURCE = eINSTANCE.getDocumentRoot_SeriesSource();

		/**
		 * The meta object literal for the '<em><b>Solid Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOLID_TYPE = eINSTANCE.getDocumentRoot_SolidType();

		/**
		 * The meta object literal for the '<em><b>Spline Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPLINE_ORDER = eINSTANCE.getDocumentRoot_SplineOrder();

		/**
		 * The meta object literal for the '<em><b>Spline Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPLINE_RESOLUTION = eINSTANCE.getDocumentRoot_SplineResolution();

		/**
		 * The meta object literal for the '<em><b>Stacked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STACKED = eINSTANCE.getDocumentRoot_Stacked();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STYLE_NAME = eINSTANCE.getDocumentRoot_StyleName();

		/**
		 * The meta object literal for the '<em><b>Symbol Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYMBOL_HEIGHT = eINSTANCE.getDocumentRoot_SymbolHeight();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYMBOL_NAME = eINSTANCE.getDocumentRoot_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Symbol Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYMBOL_TYPE = eINSTANCE.getDocumentRoot_SymbolType();

		/**
		 * The meta object literal for the '<em><b>Symbol Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYMBOL_WIDTH = eINSTANCE.getDocumentRoot_SymbolWidth();

		/**
		 * The meta object literal for the '<em><b>Text Overlap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_OVERLAP = eINSTANCE.getDocumentRoot_TextOverlap();

		/**
		 * The meta object literal for the '<em><b>Three Dimensional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__THREE_DIMENSIONAL = eINSTANCE.getDocumentRoot_ThreeDimensional();

		/**
		 * The meta object literal for the '<em><b>Tick Marks Major Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER = eINSTANCE.getDocumentRoot_TickMarksMajorInner();

		/**
		 * The meta object literal for the '<em><b>Tick Marks Major Outer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER = eINSTANCE.getDocumentRoot_TickMarksMajorOuter();

		/**
		 * The meta object literal for the '<em><b>Tick Marks Minor Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER = eINSTANCE.getDocumentRoot_TickMarksMinorInner();

		/**
		 * The meta object literal for the '<em><b>Tick Marks Minor Outer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER = eINSTANCE.getDocumentRoot_TickMarksMinorOuter();

		/**
		 * The meta object literal for the '<em><b>Values Cell Range Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS = eINSTANCE.getDocumentRoot_ValuesCellRangeAddress();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VERTICAL = eINSTANCE.getDocumentRoot_Vertical();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VISIBLE = eINSTANCE.getDocumentRoot_Visible();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DomainTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '<em><b>Cell Range Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__CELL_RANGE_ADDRESS = eINSTANCE.getDomainType_CellRangeAddress();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ErrorIndicatorTypeImpl <em>Error Indicator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ErrorIndicatorTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorIndicatorType()
		 * @generated
		 */
		EClass ERROR_INDICATOR_TYPE = eINSTANCE.getErrorIndicatorType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_INDICATOR_TYPE__STYLE_NAME = eINSTANCE.getErrorIndicatorType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FloorTypeImpl <em>Floor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FloorTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getFloorType()
		 * @generated
		 */
		EClass FLOOR_TYPE = eINSTANCE.getFloorType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR_TYPE__STYLE_NAME = eINSTANCE.getFloorType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR_TYPE__WIDTH = eINSTANCE.getFloorType_Width();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FooterTypeImpl <em>Footer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.FooterTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getFooterType()
		 * @generated
		 */
		EClass FOOTER_TYPE = eINSTANCE.getFooterType();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTER_TYPE__P = eINSTANCE.getFooterType_P();

		/**
		 * The meta object literal for the '<em><b>Cell Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_TYPE__CELL_RANGE = eINSTANCE.getFooterType_CellRange();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_TYPE__STYLE_NAME = eINSTANCE.getFooterType_StyleName();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_TYPE__X = eINSTANCE.getFooterType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_TYPE__Y = eINSTANCE.getFooterType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.GridTypeImpl <em>Grid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.GridTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getGridType()
		 * @generated
		 */
		EClass GRID_TYPE = eINSTANCE.getGridType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_TYPE__CLASS = eINSTANCE.getGridType_Class();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_TYPE__STYLE_NAME = eINSTANCE.getGridType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl <em>Legend Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendType()
		 * @generated
		 */
		EClass LEGEND_TYPE = eINSTANCE.getLegendType();

		/**
		 * The meta object literal for the '<em><b>Legend Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__LEGEND_ALIGN = eINSTANCE.getLegendType_LegendAlign();

		/**
		 * The meta object literal for the '<em><b>Legend Expansion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__LEGEND_EXPANSION = eINSTANCE.getLegendType_LegendExpansion();

		/**
		 * The meta object literal for the '<em><b>Legend Expansion Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO = eINSTANCE.getLegendType_LegendExpansionAspectRatio();

		/**
		 * The meta object literal for the '<em><b>Legend Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__LEGEND_POSITION = eINSTANCE.getLegendType_LegendPosition();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__STYLE_NAME = eINSTANCE.getLegendType_StyleName();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__X = eINSTANCE.getLegendType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TYPE__Y = eINSTANCE.getLegendType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.MeanValueTypeImpl <em>Mean Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.MeanValueTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getMeanValueType()
		 * @generated
		 */
		EClass MEAN_VALUE_TYPE = eINSTANCE.getMeanValueType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAN_VALUE_TYPE__STYLE_NAME = eINSTANCE.getMeanValueType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl <em>Plot Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getPlotAreaType()
		 * @generated
		 */
		EClass PLOT_AREA_TYPE = eINSTANCE.getPlotAreaType();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__LIGHT = eINSTANCE.getPlotAreaType_Light();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__AXIS = eINSTANCE.getPlotAreaType_Axis();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__SERIES = eINSTANCE.getPlotAreaType_Series();

		/**
		 * The meta object literal for the '<em><b>Stock Gain Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__STOCK_GAIN_MARKER = eINSTANCE.getPlotAreaType_StockGainMarker();

		/**
		 * The meta object literal for the '<em><b>Stock Loss Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__STOCK_LOSS_MARKER = eINSTANCE.getPlotAreaType_StockLossMarker();

		/**
		 * The meta object literal for the '<em><b>Stock Range Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__STOCK_RANGE_LINE = eINSTANCE.getPlotAreaType_StockRangeLine();

		/**
		 * The meta object literal for the '<em><b>Wall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__WALL = eINSTANCE.getPlotAreaType_Wall();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_AREA_TYPE__FLOOR = eINSTANCE.getPlotAreaType_Floor();

		/**
		 * The meta object literal for the '<em><b>Ambient Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__AMBIENT_COLOR = eINSTANCE.getPlotAreaType_AmbientColor();

		/**
		 * The meta object literal for the '<em><b>Cell Range Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__CELL_RANGE_ADDRESS = eINSTANCE.getPlotAreaType_CellRangeAddress();

		/**
		 * The meta object literal for the '<em><b>Data Source Has Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS = eINSTANCE.getPlotAreaType_DataSourceHasLabels();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__DISTANCE = eINSTANCE.getPlotAreaType_Distance();

		/**
		 * The meta object literal for the '<em><b>Focal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__FOCAL_LENGTH = eINSTANCE.getPlotAreaType_FocalLength();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__HEIGHT = eINSTANCE.getPlotAreaType_Height();

		/**
		 * The meta object literal for the '<em><b>Lighting Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__LIGHTING_MODE = eINSTANCE.getPlotAreaType_LightingMode();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__PROJECTION = eINSTANCE.getPlotAreaType_Projection();

		/**
		 * The meta object literal for the '<em><b>Shade Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__SHADE_MODE = eINSTANCE.getPlotAreaType_ShadeMode();

		/**
		 * The meta object literal for the '<em><b>Shadow Slant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__SHADOW_SLANT = eINSTANCE.getPlotAreaType_ShadowSlant();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__STYLE_NAME = eINSTANCE.getPlotAreaType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__TRANSFORM = eINSTANCE.getPlotAreaType_Transform();

		/**
		 * The meta object literal for the '<em><b>Vpn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__VPN = eINSTANCE.getPlotAreaType_Vpn();

		/**
		 * The meta object literal for the '<em><b>Vrp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__VRP = eINSTANCE.getPlotAreaType_Vrp();

		/**
		 * The meta object literal for the '<em><b>Vup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__VUP = eINSTANCE.getPlotAreaType_Vup();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__WIDTH = eINSTANCE.getPlotAreaType_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__X = eINSTANCE.getPlotAreaType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_AREA_TYPE__Y = eINSTANCE.getPlotAreaType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.RegressionCurveTypeImpl <em>Regression Curve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.RegressionCurveTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionCurveType()
		 * @generated
		 */
		EClass REGRESSION_CURVE_TYPE = eINSTANCE.getRegressionCurveType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRESSION_CURVE_TYPE__STYLE_NAME = eINSTANCE.getRegressionCurveType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl <em>Series Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesType()
		 * @generated
		 */
		EClass SERIES_TYPE = eINSTANCE.getSeriesType();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_TYPE__DOMAIN = eINSTANCE.getSeriesType_Domain();

		/**
		 * The meta object literal for the '<em><b>Mean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_TYPE__MEAN_VALUE = eINSTANCE.getSeriesType_MeanValue();

		/**
		 * The meta object literal for the '<em><b>Regression Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_TYPE__REGRESSION_CURVE = eINSTANCE.getSeriesType_RegressionCurve();

		/**
		 * The meta object literal for the '<em><b>Error Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_TYPE__ERROR_INDICATOR = eINSTANCE.getSeriesType_ErrorIndicator();

		/**
		 * The meta object literal for the '<em><b>Data Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_TYPE__DATA_POINT = eINSTANCE.getSeriesType_DataPoint();

		/**
		 * The meta object literal for the '<em><b>Attached Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_TYPE__ATTACHED_AXIS = eINSTANCE.getSeriesType_AttachedAxis();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_TYPE__CLASS = eINSTANCE.getSeriesType_Class();

		/**
		 * The meta object literal for the '<em><b>Label Cell Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_TYPE__LABEL_CELL_ADDRESS = eINSTANCE.getSeriesType_LabelCellAddress();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_TYPE__STYLE_NAME = eINSTANCE.getSeriesType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Values Cell Range Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS = eINSTANCE.getSeriesType_ValuesCellRangeAddress();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockGainMarkerTypeImpl <em>Stock Gain Marker Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockGainMarkerTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockGainMarkerType()
		 * @generated
		 */
		EClass STOCK_GAIN_MARKER_TYPE = eINSTANCE.getStockGainMarkerType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_GAIN_MARKER_TYPE__STYLE_NAME = eINSTANCE.getStockGainMarkerType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockLossMarkerTypeImpl <em>Stock Loss Marker Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockLossMarkerTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockLossMarkerType()
		 * @generated
		 */
		EClass STOCK_LOSS_MARKER_TYPE = eINSTANCE.getStockLossMarkerType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_LOSS_MARKER_TYPE__STYLE_NAME = eINSTANCE.getStockLossMarkerType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockRangeLineTypeImpl <em>Stock Range Line Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.StockRangeLineTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStockRangeLineType()
		 * @generated
		 */
		EClass STOCK_RANGE_LINE_TYPE = eINSTANCE.getStockRangeLineType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_RANGE_LINE_TYPE__STYLE_NAME = eINSTANCE.getStockRangeLineType_StyleName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SubtitleTypeImpl <em>Subtitle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SubtitleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSubtitleType()
		 * @generated
		 */
		EClass SUBTITLE_TYPE = eINSTANCE.getSubtitleType();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE_TYPE__P = eINSTANCE.getSubtitleType_P();

		/**
		 * The meta object literal for the '<em><b>Cell Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__CELL_RANGE = eINSTANCE.getSubtitleType_CellRange();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__STYLE_NAME = eINSTANCE.getSubtitleType_StyleName();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__X = eINSTANCE.getSubtitleType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__Y = eINSTANCE.getSubtitleType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SymbolImageTypeImpl <em>Symbol Image Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SymbolImageTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolImageType()
		 * @generated
		 */
		EClass SYMBOL_IMAGE_TYPE = eINSTANCE.getSymbolImageType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_IMAGE_TYPE__HREF = eINSTANCE.getSymbolImageType_Href();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.TitleTypeImpl <em>Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.TitleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getTitleType()
		 * @generated
		 */
		EClass TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_TYPE__P = eINSTANCE.getTitleType_P();

		/**
		 * The meta object literal for the '<em><b>Cell Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__CELL_RANGE = eINSTANCE.getTitleType_CellRange();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__STYLE_NAME = eINSTANCE.getTitleType_StyleName();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__X = eINSTANCE.getTitleType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__Y = eINSTANCE.getTitleType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.WallTypeImpl <em>Wall Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.WallTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getWallType()
		 * @generated
		 */
		EClass WALL_TYPE = eINSTANCE.getWallType();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALL_TYPE__STYLE_NAME = eINSTANCE.getWallType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALL_TYPE__WIDTH = eINSTANCE.getWallType_Width();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType <em>Data Label Number Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataLabelNumberType()
		 * @generated
		 */
		EEnum DATA_LABEL_NUMBER_TYPE = eINSTANCE.getDataLabelNumberType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType <em>Data Source Has Labels Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataSourceHasLabelsType()
		 * @generated
		 */
		EEnum DATA_SOURCE_HAS_LABELS_TYPE = eINSTANCE.getDataSourceHasLabelsType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType <em>Dimension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDimensionType()
		 * @generated
		 */
		EEnum DIMENSION_TYPE = eINSTANCE.getDimensionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType <em>Error Category Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorCategoryType()
		 * @generated
		 */
		EEnum ERROR_CATEGORY_TYPE = eINSTANCE.getErrorCategoryType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType <em>Interpolation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getInterpolationType()
		 * @generated
		 */
		EEnum INTERPOLATION_TYPE = eINSTANCE.getInterpolationType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType <em>Label Arrangement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLabelArrangementType()
		 * @generated
		 */
		EEnum LABEL_ARRANGEMENT_TYPE = eINSTANCE.getLabelArrangementType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType <em>Legend Align Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendAlignType()
		 * @generated
		 */
		EEnum LEGEND_ALIGN_TYPE = eINSTANCE.getLegendAlignType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType <em>Legend Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendPositionType()
		 * @generated
		 */
		EEnum LEGEND_POSITION_TYPE = eINSTANCE.getLegendPositionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType <em>Regression Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionTypeType()
		 * @generated
		 */
		EEnum REGRESSION_TYPE_TYPE = eINSTANCE.getRegressionTypeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType <em>Series Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesSourceType()
		 * @generated
		 */
		EEnum SERIES_SOURCE_TYPE = eINSTANCE.getSeriesSourceType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType <em>Solid Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSolidTypeType()
		 * @generated
		 */
		EEnum SOLID_TYPE_TYPE = eINSTANCE.getSolidTypeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType <em>Symbol Name Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolNameType()
		 * @generated
		 */
		EEnum SYMBOL_NAME_TYPE = eINSTANCE.getSymbolNameType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType <em>Symbol Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolTypeType()
		 * @generated
		 */
		EEnum SYMBOL_TYPE_TYPE = eINSTANCE.getSymbolTypeType();

		/**
		 * The meta object literal for the '<em>Class Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getClassTypeObject()
		 * @generated
		 */
		EDataType CLASS_TYPE_OBJECT = eINSTANCE.getClassTypeObject();

		/**
		 * The meta object literal for the '<em>Data Label Number Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataLabelNumberTypeObject()
		 * @generated
		 */
		EDataType DATA_LABEL_NUMBER_TYPE_OBJECT = eINSTANCE.getDataLabelNumberTypeObject();

		/**
		 * The meta object literal for the '<em>Data Source Has Labels Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDataSourceHasLabelsTypeObject()
		 * @generated
		 */
		EDataType DATA_SOURCE_HAS_LABELS_TYPE_OBJECT = eINSTANCE.getDataSourceHasLabelsTypeObject();

		/**
		 * The meta object literal for the '<em>Dimension Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getDimensionTypeObject()
		 * @generated
		 */
		EDataType DIMENSION_TYPE_OBJECT = eINSTANCE.getDimensionTypeObject();

		/**
		 * The meta object literal for the '<em>Error Category Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getErrorCategoryTypeObject()
		 * @generated
		 */
		EDataType ERROR_CATEGORY_TYPE_OBJECT = eINSTANCE.getErrorCategoryTypeObject();

		/**
		 * The meta object literal for the '<em>Interpolation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getInterpolationTypeObject()
		 * @generated
		 */
		EDataType INTERPOLATION_TYPE_OBJECT = eINSTANCE.getInterpolationTypeObject();

		/**
		 * The meta object literal for the '<em>Label Arrangement Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLabelArrangementTypeObject()
		 * @generated
		 */
		EDataType LABEL_ARRANGEMENT_TYPE_OBJECT = eINSTANCE.getLabelArrangementTypeObject();

		/**
		 * The meta object literal for the '<em>Legend Align Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendAlignTypeObject()
		 * @generated
		 */
		EDataType LEGEND_ALIGN_TYPE_OBJECT = eINSTANCE.getLegendAlignTypeObject();

		/**
		 * The meta object literal for the '<em>Legend Position Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getLegendPositionTypeObject()
		 * @generated
		 */
		EDataType LEGEND_POSITION_TYPE_OBJECT = eINSTANCE.getLegendPositionTypeObject();

		/**
		 * The meta object literal for the '<em>Regression Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getRegressionTypeTypeObject()
		 * @generated
		 */
		EDataType REGRESSION_TYPE_TYPE_OBJECT = eINSTANCE.getRegressionTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Series Source Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSeriesSourceTypeObject()
		 * @generated
		 */
		EDataType SERIES_SOURCE_TYPE_OBJECT = eINSTANCE.getSeriesSourceTypeObject();

		/**
		 * The meta object literal for the '<em>Solid Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSolidTypeTypeObject()
		 * @generated
		 */
		EDataType SOLID_TYPE_TYPE_OBJECT = eINSTANCE.getSolidTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Style Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStyleNameType()
		 * @generated
		 */
		EDataType STYLE_NAME_TYPE = eINSTANCE.getStyleNameType();

		/**
		 * The meta object literal for the '<em>Style Name Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getStyleNameTypeMember1()
		 * @generated
		 */
		EDataType STYLE_NAME_TYPE_MEMBER1 = eINSTANCE.getStyleNameTypeMember1();

		/**
		 * The meta object literal for the '<em>Symbol Name Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolNameTypeObject()
		 * @generated
		 */
		EDataType SYMBOL_NAME_TYPE_OBJECT = eINSTANCE.getSymbolNameTypeObject();

		/**
		 * The meta object literal for the '<em>Symbol Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl#getSymbolTypeTypeObject()
		 * @generated
		 */
		EDataType SYMBOL_TYPE_TYPE_OBJECT = eINSTANCE.getSymbolTypeTypeObject();

	}

} //ChartPackage
