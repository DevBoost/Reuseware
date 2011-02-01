/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "table";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:table:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odftable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablePackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.BodyTypeImpl <em>Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.BodyTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl <em>Calculation Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCalculationSettingsType()
	 * @generated
	 */
	int CALCULATION_SETTINGS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Null Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__NULL_DATE = 0;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__ITERATION = 1;

	/**
	 * The feature id for the '<em><b>Automatic Find Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS = 2;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Null Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__NULL_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Precision As Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN = 5;

	/**
	 * The feature id for the '<em><b>Search Criteria Must Apply To Whole Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL = 6;

	/**
	 * The feature id for the '<em><b>Use Regular Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS = 7;

	/**
	 * The number of structural features of the '<em>Calculation Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SETTINGS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellAddressTypeImpl <em>Cell Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellAddressTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCellAddressType()
	 * @generated
	 */
	int CELL_ADDRESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ADDRESS_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ADDRESS_TYPE__ROW = 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ADDRESS_TYPE__TABLE = 2;

	/**
	 * The number of structural features of the '<em>Cell Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ADDRESS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl <em>Cell Content Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCellContentChangeType()
	 * @generated
	 */
	int CELL_CONTENT_CHANGE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Cell Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__DELETIONS = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__PREVIOUS = 4;

	/**
	 * The feature id for the '<em><b>Acceptance State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID = 7;

	/**
	 * The number of structural features of the '<em>Cell Content Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_CHANGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentDeletionTypeImpl <em>Cell Content Deletion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentDeletionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCellContentDeletionType()
	 * @generated
	 */
	int CELL_CONTENT_DELETION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cell Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Change Track Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_DELETION_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Cell Content Deletion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CONTENT_DELETION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl <em>Cell Range Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCellRangeSourceType()
	 * @generated
	 */
	int CELL_RANGE_SOURCE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__FILTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Filter Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Last Column Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED = 4;

	/**
	 * The feature id for the '<em><b>Last Row Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Refresh Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Cell Range Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_RANGE_SOURCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeDeletionTypeImpl <em>Change Deletion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeDeletionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getChangeDeletionType()
	 * @generated
	 */
	int CHANGE_DELETION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DELETION_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Change Deletion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DELETION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl <em>Change Track Table Cell Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getChangeTrackTableCellType()
	 * @generated
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Matrix Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED = 6;

	/**
	 * The feature id for the '<em><b>Number Matrix Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED = 7;

	/**
	 * The feature id for the '<em><b>Number Matrix Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED = 8;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Change Track Table Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRACK_TABLE_CELL_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl <em>Consolidation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getConsolidationType()
	 * @generated
	 */
	int CONSOLIDATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Link To Source Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Source Cell Range Addresses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES = 2;

	/**
	 * The feature id for the '<em><b>Target Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Use Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE__USE_LABELS = 4;

	/**
	 * The number of structural features of the '<em>Consolidation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationsTypeImpl <em>Content Validations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getContentValidationsType()
	 * @generated
	 */
	int CONTENT_VALIDATIONS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Content Validation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION = 0;

	/**
	 * The number of structural features of the '<em>Content Validations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl <em>Content Validation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getContentValidationType()
	 * @generated
	 */
	int CONTENT_VALIDATION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Help Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__HELP_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__ERROR_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Error Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__ERROR_MACRO = 2;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__EVENT_LISTENERS = 3;

	/**
	 * The feature id for the '<em><b>Allow Empty Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL = 4;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Display List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__DISPLAY_LIST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE__NAME = 8;

	/**
	 * The number of structural features of the '<em>Content Validation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALIDATION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CoveredTableCellTypeImpl <em>Covered Table Cell Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CoveredTableCellTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCoveredTableCellType()
	 * @generated
	 */
	int COVERED_TABLE_CELL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Cell Range Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CELL_RANGE_SOURCE = TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__ANNOTATION = TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Detective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__DETECTIVE = TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__TEXT_CONTENT = TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__H = TextPackage.TABLE_TABLE_CELL_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__P = TextPackage.TABLE_TABLE_CELL_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__LIST = TextPackage.TABLE_TABLE_CELL_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Numbered Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__NUMBERED_PARAGRAPH = TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__TABLE = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__A = TextPackage.TABLE_TABLE_CELL_CONTENT__A;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__SECTION = TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__SOFT_PAGE_BREAK = TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__TABLE_OF_CONTENT = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__ILLUSTRATION_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__TABLE_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__OBJECT_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__USER_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__ALPHABETICAL_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__BIBLIOGRAPHY = TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__RECT = TextPackage.TABLE_TABLE_CELL_CONTENT__RECT;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__LINE = TextPackage.TABLE_TABLE_CELL_CONTENT__LINE;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__POLYLINE = TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__POLYGON = TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__REGULAR_POLYGON = TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__PATH = TextPackage.TABLE_TABLE_CELL_CONTENT__PATH;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CIRCLE = TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__ELLIPSE = TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__G = TextPackage.TABLE_TABLE_CELL_CONTENT__G;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__PAGE_THUMBNAIL = TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__FRAME = TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__MEASURE = TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CAPTION = TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CONNECTOR = TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CONTROL = TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__SCENE = TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CUSTOM_SHAPE = TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CHANGE_MARKS_GROUP = TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CHANGE_MARKS = TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__BOOLEAN_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Validation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__CURRENCY = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__DATE_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__FORMULA = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Protect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__PROTECT = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__STRING_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__STYLE_NAME = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__TIME_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE__VALUE_TYPE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Covered Table Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_TABLE_CELL_TYPE_FEATURE_COUNT = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CutOffsTypeImpl <em>Cut Offs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.CutOffsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getCutOffsType()
	 * @generated
	 */
	int CUT_OFFS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Movement Cut Off</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_OFFS_TYPE__MOVEMENT_CUT_OFF = 0;

	/**
	 * The feature id for the '<em><b>Insertion Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_OFFS_TYPE__INSERTION_CUT_OFF = 1;

	/**
	 * The feature id for the '<em><b>Movement Cut Off1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1 = 2;

	/**
	 * The number of structural features of the '<em>Cut Offs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_OFFS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangesTypeImpl <em>Database Ranges Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDatabaseRangesType()
	 * @generated
	 */
	int DATABASE_RANGES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Database Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGES_TYPE__DATABASE_RANGE = 0;

	/**
	 * The number of structural features of the '<em>Database Ranges Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl <em>Database Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDatabaseRangeType()
	 * @generated
	 */
	int DATABASE_RANGE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Database Source Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL = 0;

	/**
	 * The feature id for the '<em><b>Database Source Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Database Source Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__SORT = 4;

	/**
	 * The feature id for the '<em><b>Subtotal Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__SUBTOTAL_RULES = 5;

	/**
	 * The feature id for the '<em><b>Contains Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__CONTAINS_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Display Filter Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS = 7;

	/**
	 * The feature id for the '<em><b>Has Persistent Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA = 8;

	/**
	 * The feature id for the '<em><b>Is Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__IS_SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>On Update Keep Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE = 11;

	/**
	 * The feature id for the '<em><b>On Update Keep Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES = 12;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__ORIENTATION = 13;

	/**
	 * The feature id for the '<em><b>Refresh Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__REFRESH_DELAY = 14;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS = 15;

	/**
	 * The number of structural features of the '<em>Database Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_RANGE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceQueryTypeImpl <em>Database Source Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceQueryTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDatabaseSourceQueryType()
	 * @generated
	 */
	int DATABASE_SOURCE_QUERY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_QUERY_TYPE__DATABASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Query Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_QUERY_TYPE__QUERY_NAME = 1;

	/**
	 * The number of structural features of the '<em>Database Source Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_QUERY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceSqlTypeImpl <em>Database Source Sql Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceSqlTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDatabaseSourceSqlType()
	 * @generated
	 */
	int DATABASE_SOURCE_SQL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parse Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Database Source Sql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_SQL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceTableTypeImpl <em>Database Source Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceTableTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDatabaseSourceTableType()
	 * @generated
	 */
	int DATABASE_SOURCE_TABLE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Database Source Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SOURCE_TABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl <em>Data Pilot Display Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotDisplayInfoType()
	 * @generated
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Display Member Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Member Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Data Pilot Display Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_DISPLAY_INFO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl <em>Data Pilot Field Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotFieldReferenceType()
	 * @generated
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Data Pilot Field Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl <em>Data Pilot Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotFieldType()
	 * @generated
	 */
	int DATA_PILOT_FIELD_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Data Pilot Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Data Pilot Field Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Data Pilot Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Is Data Layout Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__ORIENTATION = 5;

	/**
	 * The feature id for the '<em><b>Selected Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__SELECTED_PAGE = 6;

	/**
	 * The feature id for the '<em><b>Source Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME = 7;

	/**
	 * The feature id for the '<em><b>Used Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE__USED_HIERARCHY = 8;

	/**
	 * The number of structural features of the '<em>Data Pilot Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_FIELD_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupMemberTypeImpl <em>Data Pilot Group Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupMemberTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotGroupMemberType()
	 * @generated
	 */
	int DATA_PILOT_GROUP_MEMBER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUP_MEMBER_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Pilot Group Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUP_MEMBER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl <em>Data Pilot Groups Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotGroupsType()
	 * @generated
	 */
	int DATA_PILOT_GROUPS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Data Pilot Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__DATE_END = 1;

	/**
	 * The feature id for the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__DATE_START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__END = 3;

	/**
	 * The feature id for the '<em><b>Grouped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__GROUPED_BY = 4;

	/**
	 * The feature id for the '<em><b>Source Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__START = 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE__STEP = 7;

	/**
	 * The number of structural features of the '<em>Data Pilot Groups Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUPS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupTypeImpl <em>Data Pilot Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotGroupType()
	 * @generated
	 */
	int DATA_PILOT_GROUP_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Data Pilot Group Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUP_TYPE__DATA_PILOT_GROUP_MEMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUP_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Pilot Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_GROUP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLayoutInfoTypeImpl <em>Data Pilot Layout Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLayoutInfoTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotLayoutInfoType()
	 * @generated
	 */
	int DATA_PILOT_LAYOUT_INFO_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Add Empty Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES = 0;

	/**
	 * The feature id for the '<em><b>Layout Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE = 1;

	/**
	 * The number of structural features of the '<em>Data Pilot Layout Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LAYOUT_INFO_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl <em>Data Pilot Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotLevelType()
	 * @generated
	 */
	int DATA_PILOT_LEVEL_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Data Pilot Subtotals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS = 0;

	/**
	 * The feature id for the '<em><b>Data Pilot Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Data Pilot Display Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO = 2;

	/**
	 * The feature id for the '<em><b>Data Pilot Sort Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO = 3;

	/**
	 * The feature id for the '<em><b>Data Pilot Layout Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO = 4;

	/**
	 * The feature id for the '<em><b>Show Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY = 5;

	/**
	 * The number of structural features of the '<em>Data Pilot Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_LEVEL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotMembersTypeImpl <em>Data Pilot Members Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotMembersTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotMembersType()
	 * @generated
	 */
	int DATA_PILOT_MEMBERS_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Data Pilot Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER = 0;

	/**
	 * The number of structural features of the '<em>Data Pilot Members Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotMemberTypeImpl <em>Data Pilot Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotMemberTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotMemberType()
	 * @generated
	 */
	int DATA_PILOT_MEMBER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBER_TYPE__DISPLAY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBER_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Show Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBER_TYPE__SHOW_DETAILS = 2;

	/**
	 * The number of structural features of the '<em>Data Pilot Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_MEMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSortInfoTypeImpl <em>Data Pilot Sort Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSortInfoTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotSortInfoType()
	 * @generated
	 */
	int DATA_PILOT_SORT_INFO_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SORT_INFO_TYPE__DATA_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SORT_INFO_TYPE__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Sort Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SORT_INFO_TYPE__SORT_MODE = 2;

	/**
	 * The number of structural features of the '<em>Data Pilot Sort Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SORT_INFO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSubtotalsTypeImpl <em>Data Pilot Subtotals Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSubtotalsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotSubtotalsType()
	 * @generated
	 */
	int DATA_PILOT_SUBTOTALS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Data Pilot Subtotal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL = 0;

	/**
	 * The number of structural features of the '<em>Data Pilot Subtotals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SUBTOTALS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSubtotalTypeImpl <em>Data Pilot Subtotal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSubtotalTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotSubtotalType()
	 * @generated
	 */
	int DATA_PILOT_SUBTOTAL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SUBTOTAL_TYPE__FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Data Pilot Subtotal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_SUBTOTAL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTablesTypeImpl <em>Data Pilot Tables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTablesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotTablesType()
	 * @generated
	 */
	int DATA_PILOT_TABLES_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Data Pilot Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLES_TYPE__DATA_PILOT_TABLE = 0;

	/**
	 * The number of structural features of the '<em>Data Pilot Tables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl <em>Data Pilot Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataPilotTableType()
	 * @generated
	 */
	int DATA_PILOT_TABLE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Database Source Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL = 0;

	/**
	 * The feature id for the '<em><b>Database Source Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Database Source Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Source Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Source Cell Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Data Pilot Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__APPLICATION_DATA = 6;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__BUTTONS = 7;

	/**
	 * The feature id for the '<em><b>Drill Down On Double Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK = 8;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__GRAND_TOTAL = 9;

	/**
	 * The feature id for the '<em><b>Identify Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES = 10;

	/**
	 * The feature id for the '<em><b>Ignore Empty Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Show Filter Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON = 13;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS = 14;

	/**
	 * The number of structural features of the '<em>Data Pilot Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PILOT_TABLE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinksTypeImpl <em>Dde Links Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinksTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDdeLinksType()
	 * @generated
	 */
	int DDE_LINKS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Dde Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDE_LINKS_TYPE__DDE_LINK = 0;

	/**
	 * The number of structural features of the '<em>Dde Links Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDE_LINKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinkTypeImpl <em>Dde Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinkTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDdeLinkType()
	 * @generated
	 */
	int DDE_LINK_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Dde Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDE_LINK_TYPE__DDE_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDE_LINK_TYPE__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Dde Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDE_LINK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionsTypeImpl <em>Deletions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDeletionsType()
	 * @generated
	 */
	int DELETIONS_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Cell Content Deletion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETIONS_TYPE__CELL_CONTENT_DELETION = 1;

	/**
	 * The feature id for the '<em><b>Change Deletion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETIONS_TYPE__CHANGE_DELETION = 2;

	/**
	 * The number of structural features of the '<em>Deletions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl <em>Deletion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDeletionType()
	 * @generated
	 */
	int DELETION_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__CHANGE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__DELETIONS = 2;

	/**
	 * The feature id for the '<em><b>Cut Offs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__CUT_OFFS = 3;

	/**
	 * The feature id for the '<em><b>Acceptance State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__ACCEPTANCE_STATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Multi Deletion Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__MULTI_DELETION_SPANNED = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__POSITION = 7;

	/**
	 * The feature id for the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__REJECTING_CHANGE_ID = 8;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__TABLE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Deletion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DependenciesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDependenciesType()
	 * @generated
	 */
	int DEPENDENCIES_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DependencyTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DetectiveTypeImpl <em>Detective Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DetectiveTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDetectiveType()
	 * @generated
	 */
	int DETECTIVE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Highlighted Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTIVE_TYPE__HIGHLIGHTED_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTIVE_TYPE__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Detective Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTIVE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMacroTypeImpl <em>Error Macro Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMacroTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getErrorMacroType()
	 * @generated
	 */
	int ERROR_MACRO_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MACRO_TYPE__EXECUTE = 0;

	/**
	 * The number of structural features of the '<em>Error Macro Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MACRO_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl <em>Error Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getErrorMessageType()
	 * @generated
	 */
	int ERROR_MESSAGE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_TYPE__DISPLAY = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_TYPE__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_TYPE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Error Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.EvenColumnsTypeImpl <em>Even Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.EvenColumnsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getEvenColumnsType()
	 * @generated
	 */
	int EVEN_COLUMNS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COLUMNS_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COLUMNS_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Even Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COLUMNS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.EvenRowsTypeImpl <em>Even Rows Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.EvenRowsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getEvenRowsType()
	 * @generated
	 */
	int EVEN_ROWS_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_ROWS_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_ROWS_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Even Rows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_ROWS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterAndTypeImpl <em>Filter And Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterAndTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFilterAndType()
	 * @generated
	 */
	int FILTER_AND_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Filter Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_TYPE__FILTER_OR = 1;

	/**
	 * The feature id for the '<em><b>Filter Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_TYPE__FILTER_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Filter And Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterConditionTypeImpl <em>Filter Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterConditionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFilterConditionType()
	 * @generated
	 */
	int FILTER_CONDITION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE__CASE_SENSITIVE = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE__FIELD_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE__OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Filter Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterOrTypeImpl <em>Filter Or Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterOrTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFilterOrType()
	 * @generated
	 */
	int FILTER_OR_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Filter And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OR_TYPE__FILTER_AND = 1;

	/**
	 * The feature id for the '<em><b>Filter Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OR_TYPE__FILTER_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Filter Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Filter Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Filter And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_AND = 1;

	/**
	 * The feature id for the '<em><b>Filter Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_OR = 2;

	/**
	 * The feature id for the '<em><b>Condition Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__CONDITION_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Condition Source Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Display Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DISPLAY_DUPLICATES = 5;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__TARGET_RANGE_ADDRESS = 6;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FirstColumnTypeImpl <em>First Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FirstColumnTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFirstColumnType()
	 * @generated
	 */
	int FIRST_COLUMN_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_COLUMN_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_COLUMN_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>First Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_COLUMN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FirstRowTypeImpl <em>First Row Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.FirstRowTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFirstRowType()
	 * @generated
	 */
	int FIRST_ROW_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_ROW_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_ROW_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>First Row Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_ROW_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HelpMessageTypeImpl <em>Help Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.HelpMessageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getHelpMessageType()
	 * @generated
	 */
	int HELP_MESSAGE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_MESSAGE_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_MESSAGE_TYPE__DISPLAY = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_MESSAGE_TYPE__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Help Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_MESSAGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl <em>Highlighted Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getHighlightedRangeType()
	 * @generated
	 */
	int HIGHLIGHTED_RANGE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Contains Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHTED_RANGE_TYPE__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Marked Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID = 3;

	/**
	 * The number of structural features of the '<em>Highlighted Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHTED_RANGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.InsertionCutOffTypeImpl <em>Insertion Cut Off Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.InsertionCutOffTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getInsertionCutOffType()
	 * @generated
	 */
	int INSERTION_CUT_OFF_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_CUT_OFF_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_CUT_OFF_TYPE__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Insertion Cut Off Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_CUT_OFF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.InsertionTypeImpl <em>Insertion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.InsertionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getInsertionType()
	 * @generated
	 */
	int INSERTION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__CHANGE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__DELETIONS = 2;

	/**
	 * The feature id for the '<em><b>Acceptance State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__ACCEPTANCE_STATE = 3;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__COUNT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__POSITION = 6;

	/**
	 * The feature id for the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__REJECTING_CHANGE_ID = 7;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__TABLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Insertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.IterationTypeImpl <em>Iteration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.IterationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getIterationType()
	 * @generated
	 */
	int ITERATION_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Maximum Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_TYPE__MAXIMUM_DIFFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_TYPE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_TYPE__STEPS = 2;

	/**
	 * The number of structural features of the '<em>Iteration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangesTypeImpl <em>Label Ranges Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLabelRangesType()
	 * @generated
	 */
	int LABEL_RANGES_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Label Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGES_TYPE__LABEL_RANGE = 0;

	/**
	 * The number of structural features of the '<em>Label Ranges Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangeTypeImpl <em>Label Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLabelRangeType()
	 * @generated
	 */
	int LABEL_RANGE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Data Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Label Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGE_TYPE__ORIENTATION = 2;

	/**
	 * The number of structural features of the '<em>Label Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_RANGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LastColumnTypeImpl <em>Last Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.LastColumnTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLastColumnType()
	 * @generated
	 */
	int LAST_COLUMN_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_COLUMN_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_COLUMN_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Last Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_COLUMN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LastRowTypeImpl <em>Last Row Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.LastRowTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLastRowType()
	 * @generated
	 */
	int LAST_ROW_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_ROW_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_ROW_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Last Row Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_ROW_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementCutOffTypeImpl <em>Movement Cut Off Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementCutOffTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMovementCutOffType()
	 * @generated
	 */
	int MOVEMENT_CUT_OFF_TYPE = 59;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CUT_OFF_TYPE__END_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CUT_OFF_TYPE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CUT_OFF_TYPE__START_POSITION = 2;

	/**
	 * The number of structural features of the '<em>Movement Cut Off Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CUT_OFF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementTypeImpl <em>Movement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMovementType()
	 * @generated
	 */
	int MOVEMENT_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Source Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__SOURCE_RANGE_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__TARGET_RANGE_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__CHANGE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__DELETIONS = 4;

	/**
	 * The feature id for the '<em><b>Acceptance State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__ACCEPTANCE_STATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE__REJECTING_CHANGE_ID = 7;

	/**
	 * The number of structural features of the '<em>Movement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionsTypeImpl <em>Named Expressions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNamedExpressionsType()
	 * @generated
	 */
	int NAMED_EXPRESSIONS_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Named Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSIONS_TYPE__NAMED_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Named Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Named Expressions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionTypeImpl <em>Named Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNamedExpressionType()
	 * @generated
	 */
	int NAMED_EXPRESSION_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSION_TYPE__BASE_CELL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSION_TYPE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSION_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl <em>Named Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNamedRangeType()
	 * @generated
	 */
	int NAMED_RANGE_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RANGE_TYPE__BASE_CELL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RANGE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Range Usable As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RANGE_TYPE__RANGE_USABLE_AS = 3;

	/**
	 * The number of structural features of the '<em>Named Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RANGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NullDateTypeImpl <em>Null Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.NullDateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNullDateType()
	 * @generated
	 */
	int NULL_DATE_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_DATE_TYPE__DATE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_DATE_TYPE__VALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Null Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_DATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.OddColumnsTypeImpl <em>Odd Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.OddColumnsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOddColumnsType()
	 * @generated
	 */
	int ODD_COLUMNS_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COLUMNS_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COLUMNS_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Odd Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COLUMNS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.OddRowsTypeImpl <em>Odd Rows Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.OddRowsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOddRowsType()
	 * @generated
	 */
	int ODD_ROWS_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_ROWS_TYPE__PARAGRAPH_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_ROWS_TYPE__STYLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Odd Rows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_ROWS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.OperationTypeImpl <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.OperationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.PreviousTypeImpl <em>Previous Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.PreviousTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getPreviousType()
	 * @generated
	 */
	int PREVIOUS_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Change Track Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_TYPE__CHANGE_TRACK_TABLE_CELL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Previous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl <em>Scenario Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getScenarioType()
	 * @generated
	 */
	int SCENARIO_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__BORDER_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Copy Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__COPY_BACK = 2;

	/**
	 * The feature id for the '<em><b>Copy Formulas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__COPY_FORMULAS = 3;

	/**
	 * The feature id for the '<em><b>Copy Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__COPY_STYLES = 4;

	/**
	 * The feature id for the '<em><b>Display Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__DISPLAY_BORDER = 5;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__IS_ACTIVE = 6;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__PROTECTED = 7;

	/**
	 * The feature id for the '<em><b>Scenario Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__SCENARIO_RANGES = 8;

	/**
	 * The number of structural features of the '<em>Scenario Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl <em>Shapes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getShapesType()
	 * @generated
	 */
	int SHAPES_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__RECT = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__LINE = 2;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__POLYLINE = 3;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__POLYGON = 4;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__REGULAR_POLYGON = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__CIRCLE = 7;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__ELLIPSE = 8;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__G = 9;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__PAGE_THUMBNAIL = 10;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__FRAME = 11;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__CAPTION = 13;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__CONTROL = 15;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__SCENE = 16;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__CUSTOM_SHAPE = 17;

	/**
	 * The number of structural features of the '<em>Shapes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortByTypeImpl <em>Sort By Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortByTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSortByType()
	 * @generated
	 */
	int SORT_BY_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE__FIELD_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Sort By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortGroupsTypeImpl <em>Sort Groups Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortGroupsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSortGroupsType()
	 * @generated
	 */
	int SORT_GROUPS_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_GROUPS_TYPE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_GROUPS_TYPE__ORDER = 1;

	/**
	 * The number of structural features of the '<em>Sort Groups Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_GROUPS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl <em>Sort Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSortType()
	 * @generated
	 */
	int SORT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__SORT_BY = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Bind Styles To Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__BIND_STYLES_TO_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__CASE_SENSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE__TARGET_RANGE_ADDRESS = 6;

	/**
	 * The number of structural features of the '<em>Sort Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceCellRangeTypeImpl <em>Source Cell Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceCellRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSourceCellRangeType()
	 * @generated
	 */
	int SOURCE_CELL_RANGE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CELL_RANGE_TYPE__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CELL_RANGE_TYPE__CELL_RANGE_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Source Cell Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CELL_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceRangeAddressTypeImpl <em>Source Range Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceRangeAddressTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSourceRangeAddressType()
	 * @generated
	 */
	int SOURCE_RANGE_ADDRESS_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__END_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__END_ROW = 2;

	/**
	 * The feature id for the '<em><b>End Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__END_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__ROW = 4;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__START_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__START_ROW = 6;

	/**
	 * The feature id for the '<em><b>Start Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__START_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE__TABLE = 8;

	/**
	 * The number of structural features of the '<em>Source Range Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RANGE_ADDRESS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceServiceTypeImpl <em>Source Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SourceServiceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSourceServiceType()
	 * @generated
	 */
	int SOURCE_SERVICE_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE__OBJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE__SOURCE_NAME = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE__USER_NAME = 4;

	/**
	 * The number of structural features of the '<em>Source Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SERVICE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalFieldTypeImpl <em>Subtotal Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalFieldTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSubtotalFieldType()
	 * @generated
	 */
	int SUBTOTAL_FIELD_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_FIELD_TYPE__FIELD_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_FIELD_TYPE__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Subtotal Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_FIELD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl <em>Subtotal Rules Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSubtotalRulesType()
	 * @generated
	 */
	int SUBTOTAL_RULES_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Sort Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE__SORT_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Subtotal Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE = 1;

	/**
	 * The feature id for the '<em><b>Bind Styles To Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE__CASE_SENSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Page Breaks On Group Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE = 4;

	/**
	 * The number of structural features of the '<em>Subtotal Rules Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRuleTypeImpl <em>Subtotal Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRuleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSubtotalRuleType()
	 * @generated
	 */
	int SUBTOTAL_RULE_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Subtotal Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Group By Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Subtotal Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTOTAL_RULE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl <em>Cell Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableCellType()
	 * @generated
	 */
	int TABLE_CELL_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Cell Range Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CELL_RANGE_SOURCE = TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__ANNOTATION = TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Detective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__DETECTIVE = TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__TEXT_CONTENT = TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__H = TextPackage.TABLE_TABLE_CELL_CONTENT__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__P = TextPackage.TABLE_TABLE_CELL_CONTENT__P;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__LIST = TextPackage.TABLE_TABLE_CELL_CONTENT__LIST;

	/**
	 * The feature id for the '<em><b>Numbered Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBERED_PARAGRAPH = TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__TABLE = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__A = TextPackage.TABLE_TABLE_CELL_CONTENT__A;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__SECTION = TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__SOFT_PAGE_BREAK = TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__TABLE_OF_CONTENT = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__ILLUSTRATION_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__TABLE_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__OBJECT_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__USER_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__ALPHABETICAL_INDEX = TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__BIBLIOGRAPHY = TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__RECT = TextPackage.TABLE_TABLE_CELL_CONTENT__RECT;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__LINE = TextPackage.TABLE_TABLE_CELL_CONTENT__LINE;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__POLYLINE = TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__POLYGON = TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__REGULAR_POLYGON = TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__PATH = TextPackage.TABLE_TABLE_CELL_CONTENT__PATH;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CIRCLE = TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__ELLIPSE = TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__G = TextPackage.TABLE_TABLE_CELL_CONTENT__G;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__PAGE_THUMBNAIL = TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__FRAME = TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__MEASURE = TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CAPTION = TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CONNECTOR = TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CONTROL = TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__SCENE = TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CUSTOM_SHAPE = TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CHANGE_MARKS_GROUP = TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CHANGE_MARKS = TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__BOOLEAN_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Validation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__CURRENCY = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__DATE_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__FORMULA = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Matrix Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Matrix Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Number Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Protect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__PROTECT = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__STRING_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__STYLE_NAME = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__TIME_VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__VALUE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE__VALUE_TYPE = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_TYPE_FEATURE_COUNT = TextPackage.TABLE_TABLE_CELL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl <em>Column Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableColumnGroupType()
	 * @generated
	 */
	int TABLE_COLUMN_GROUP_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Table Column Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Table Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Table Header Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS = 4;

	/**
	 * The feature id for the '<em><b>Table Columns1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1 = 5;

	/**
	 * The feature id for the '<em><b>Table Column1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1 = 6;

	/**
	 * The feature id for the '<em><b>Table Header Columns1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1 = 7;

	/**
	 * The feature id for the '<em><b>Table Columns2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2 = 8;

	/**
	 * The feature id for the '<em><b>Table Column2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2 = 9;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE__DISPLAY = 10;

	/**
	 * The number of structural features of the '<em>Column Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_GROUP_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnsTypeImpl <em>Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableColumnsType()
	 * @generated
	 */
	int TABLE_COLUMNS_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMNS_TYPE__TABLE_COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMNS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableColumnType()
	 * @generated
	 */
	int TABLE_COLUMN_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED = 1;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_TYPE__STYLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_TYPE__VISIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableHeaderColumnsTypeImpl <em>Header Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableHeaderColumnsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableHeaderColumnsType()
	 * @generated
	 */
	int TABLE_HEADER_COLUMNS_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_COLUMNS_TYPE__TABLE_COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Header Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_COLUMNS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableHeaderRowsTypeImpl <em>Header Rows Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableHeaderRowsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableHeaderRowsType()
	 * @generated
	 */
	int TABLE_HEADER_ROWS_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_ROWS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_ROWS_TYPE__SOFT_PAGE_BREAK = 1;

	/**
	 * The feature id for the '<em><b>Table Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_ROWS_TYPE__TABLE_ROW = 2;

	/**
	 * The number of structural features of the '<em>Header Rows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_ROWS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl <em>Row Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableRowGroupType()
	 * @generated
	 */
	int TABLE_ROW_GROUP_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Table Row Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROWS = 2;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK = 3;

	/**
	 * The feature id for the '<em><b>Table Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROW = 4;

	/**
	 * The feature id for the '<em><b>Table Header Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS = 5;

	/**
	 * The feature id for the '<em><b>Table Rows1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROWS1 = 6;

	/**
	 * The feature id for the '<em><b>Soft Page Break1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1 = 7;

	/**
	 * The feature id for the '<em><b>Table Row1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROW1 = 8;

	/**
	 * The feature id for the '<em><b>Table Header Rows1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1 = 9;

	/**
	 * The feature id for the '<em><b>Table Rows2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROWS2 = 10;

	/**
	 * The feature id for the '<em><b>Soft Page Break2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2 = 11;

	/**
	 * The feature id for the '<em><b>Table Row2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__TABLE_ROW2 = 12;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE__DISPLAY = 13;

	/**
	 * The number of structural features of the '<em>Row Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_GROUP_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowsTypeImpl <em>Rows Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableRowsType()
	 * @generated
	 */
	int TABLE_ROWS_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROWS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROWS_TYPE__SOFT_PAGE_BREAK = 1;

	/**
	 * The feature id for the '<em><b>Table Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROWS_TYPE__TABLE_ROW = 2;

	/**
	 * The number of structural features of the '<em>Rows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROWS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl <em>Row Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableRowType()
	 * @generated
	 */
	int TABLE_ROW_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Table Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__TABLE_CELL = 1;

	/**
	 * The feature id for the '<em><b>Covered Table Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__COVERED_TABLE_CELL = 2;

	/**
	 * The feature id for the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Number Rows Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED = 4;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__STYLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE__VISIBILITY = 6;

	/**
	 * The number of structural features of the '<em>Row Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableSourceType()
	 * @generated
	 */
	int TABLE_SOURCE_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__FILTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Filter Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__FILTER_OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__MODE = 4;

	/**
	 * The feature id for the '<em><b>Refresh Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__REFRESH_DELAY = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__TABLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SOURCE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Table Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Dde Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__DDE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__FORMS = 3;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SHAPES = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Table Column Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMN_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Table Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMNS = 7;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Table Header Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_HEADER_COLUMNS = 9;

	/**
	 * The feature id for the '<em><b>Table Columns1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMNS1 = 10;

	/**
	 * The feature id for the '<em><b>Table Column1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMN1 = 11;

	/**
	 * The feature id for the '<em><b>Table Header Columns1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_HEADER_COLUMNS1 = 12;

	/**
	 * The feature id for the '<em><b>Table Columns2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMNS2 = 13;

	/**
	 * The feature id for the '<em><b>Table Column2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_COLUMN2 = 14;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__GROUP1 = 15;

	/**
	 * The feature id for the '<em><b>Table Row Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROW_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROWS = 17;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SOFT_PAGE_BREAK = 18;

	/**
	 * The feature id for the '<em><b>Table Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROW = 19;

	/**
	 * The feature id for the '<em><b>Table Header Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_HEADER_ROWS = 20;

	/**
	 * The feature id for the '<em><b>Table Rows1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROWS1 = 21;

	/**
	 * The feature id for the '<em><b>Soft Page Break1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SOFT_PAGE_BREAK1 = 22;

	/**
	 * The feature id for the '<em><b>Table Row1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROW1 = 23;

	/**
	 * The feature id for the '<em><b>Table Header Rows1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_HEADER_ROWS1 = 24;

	/**
	 * The feature id for the '<em><b>Table Rows2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROWS2 = 25;

	/**
	 * The feature id for the '<em><b>Soft Page Break2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SOFT_PAGE_BREAK2 = 26;

	/**
	 * The feature id for the '<em><b>Table Row2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_ROW2 = 27;

	/**
	 * The feature id for the '<em><b>Is Sub Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__IS_SUB_TABLE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = 29;

	/**
	 * The feature id for the '<em><b>Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PRINT = 30;

	/**
	 * The feature id for the '<em><b>Print Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PRINT_RANGES = 31;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PROTECTED = 32;

	/**
	 * The feature id for the '<em><b>Protection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PROTECTION_KEY = 33;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__STYLE_NAME = 34;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 35;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 91;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 3;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALCULATION_SETTINGS = 4;

	/**
	 * The feature id for the '<em><b>Cell Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Cell Content Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_CONTENT_CHANGE = 6;

	/**
	 * The feature id for the '<em><b>Cell Content Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_CONTENT_DELETION = 7;

	/**
	 * The feature id for the '<em><b>Cell Range Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_RANGE_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Change Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_DELETION = 9;

	/**
	 * The feature id for the '<em><b>Change Track Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL = 10;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSOLIDATION = 11;

	/**
	 * The feature id for the '<em><b>Content Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT_VALIDATION = 12;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT_VALIDATIONS = 13;

	/**
	 * The feature id for the '<em><b>Covered Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERED_TABLE_CELL = 14;

	/**
	 * The feature id for the '<em><b>Cut Offs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUT_OFFS = 15;

	/**
	 * The feature id for the '<em><b>Database Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_RANGE = 16;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_RANGES = 17;

	/**
	 * The feature id for the '<em><b>Database Source Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_SOURCE_QUERY = 18;

	/**
	 * The feature id for the '<em><b>Database Source Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_SOURCE_SQL = 19;

	/**
	 * The feature id for the '<em><b>Database Source Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_SOURCE_TABLE = 20;

	/**
	 * The feature id for the '<em><b>Data Pilot Display Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO = 21;

	/**
	 * The feature id for the '<em><b>Data Pilot Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_FIELD = 22;

	/**
	 * The feature id for the '<em><b>Data Pilot Field Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Data Pilot Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Data Pilot Group Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER = 25;

	/**
	 * The feature id for the '<em><b>Data Pilot Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_GROUPS = 26;

	/**
	 * The feature id for the '<em><b>Data Pilot Layout Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO = 27;

	/**
	 * The feature id for the '<em><b>Data Pilot Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_LEVEL = 28;

	/**
	 * The feature id for the '<em><b>Data Pilot Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_MEMBER = 29;

	/**
	 * The feature id for the '<em><b>Data Pilot Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_MEMBERS = 30;

	/**
	 * The feature id for the '<em><b>Data Pilot Sort Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_SORT_INFO = 31;

	/**
	 * The feature id for the '<em><b>Data Pilot Subtotal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL = 32;

	/**
	 * The feature id for the '<em><b>Data Pilot Subtotals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS = 33;

	/**
	 * The feature id for the '<em><b>Data Pilot Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_TABLE = 34;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PILOT_TABLES = 35;

	/**
	 * The feature id for the '<em><b>Dde Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_LINK = 36;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_LINKS = 37;

	/**
	 * The feature id for the '<em><b>Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETION = 38;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETIONS = 39;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENCIES = 40;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENCY = 41;

	/**
	 * The feature id for the '<em><b>Detective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETECTIVE = 42;

	/**
	 * The feature id for the '<em><b>Error Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_MACRO = 43;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_MESSAGE = 44;

	/**
	 * The feature id for the '<em><b>Even Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVEN_COLUMNS = 45;

	/**
	 * The feature id for the '<em><b>Even Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVEN_ROWS = 46;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 47;

	/**
	 * The feature id for the '<em><b>Filter And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_AND = 48;

	/**
	 * The feature id for the '<em><b>Filter Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_CONDITION = 49;

	/**
	 * The feature id for the '<em><b>Filter Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_OR = 50;

	/**
	 * The feature id for the '<em><b>First Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRST_COLUMN = 51;

	/**
	 * The feature id for the '<em><b>First Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRST_ROW = 52;

	/**
	 * The feature id for the '<em><b>Help Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HELP_MESSAGE = 53;

	/**
	 * The feature id for the '<em><b>Highlighted Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIGHLIGHTED_RANGE = 54;

	/**
	 * The feature id for the '<em><b>Insertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERTION = 55;

	/**
	 * The feature id for the '<em><b>Insertion Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERTION_CUT_OFF = 56;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITERATION = 57;

	/**
	 * The feature id for the '<em><b>Label Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_RANGE = 58;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_RANGES = 59;

	/**
	 * The feature id for the '<em><b>Last Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_COLUMN = 60;

	/**
	 * The feature id for the '<em><b>Last Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_ROW = 61;

	/**
	 * The feature id for the '<em><b>Movement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT = 62;

	/**
	 * The feature id for the '<em><b>Movement Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_CUT_OFF = 63;

	/**
	 * The feature id for the '<em><b>Named Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMED_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMED_EXPRESSIONS = 65;

	/**
	 * The feature id for the '<em><b>Named Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMED_RANGE = 66;

	/**
	 * The feature id for the '<em><b>Null Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_DATE = 67;

	/**
	 * The feature id for the '<em><b>Odd Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ODD_COLUMNS = 68;

	/**
	 * The feature id for the '<em><b>Odd Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ODD_ROWS = 69;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPERATION = 70;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREVIOUS = 71;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCENARIO = 72;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHAPES = 73;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORT = 74;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORT_BY = 75;

	/**
	 * The feature id for the '<em><b>Sort Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORT_GROUPS = 76;

	/**
	 * The feature id for the '<em><b>Source Cell Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_CELL_RANGE = 77;

	/**
	 * The feature id for the '<em><b>Source Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS = 78;

	/**
	 * The feature id for the '<em><b>Source Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_SERVICE = 79;

	/**
	 * The feature id for the '<em><b>Subtotal Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTOTAL_FIELD = 80;

	/**
	 * The feature id for the '<em><b>Subtotal Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTOTAL_RULE = 81;

	/**
	 * The feature id for the '<em><b>Subtotal Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTOTAL_RULES = 82;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE = 83;

	/**
	 * The feature id for the '<em><b>Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_CELL = 84;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_COLUMN = 85;

	/**
	 * The feature id for the '<em><b>Table Column Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_COLUMN_GROUP = 86;

	/**
	 * The feature id for the '<em><b>Table Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_COLUMNS = 87;

	/**
	 * The feature id for the '<em><b>Table Header Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_HEADER_COLUMNS = 88;

	/**
	 * The feature id for the '<em><b>Table Header Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_HEADER_ROWS = 89;

	/**
	 * The feature id for the '<em><b>Table Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_ROW = 90;

	/**
	 * The feature id for the '<em><b>Table Row Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_ROW_GROUP = 91;

	/**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_ROWS = 92;

	/**
	 * The feature id for the '<em><b>Table Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_SOURCE = 93;

	/**
	 * The feature id for the '<em><b>Table Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_TEMPLATE = 94;

	/**
	 * The feature id for the '<em><b>Target Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_RANGE_ADDRESS = 95;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACKED_CHANGES = 96;

	/**
	 * The feature id for the '<em><b>Acceptance State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCEPTANCE_STATE = 97;

	/**
	 * The feature id for the '<em><b>Add Empty Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_EMPTY_LINES = 98;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALGORITHM = 99;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIGN = 100;

	/**
	 * The feature id for the '<em><b>Allow Empty Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOW_EMPTY_CELL = 101;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATION_DATA = 102;

	/**
	 * The feature id for the '<em><b>Automatic Find Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS = 103;

	/**
	 * The feature id for the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE_CELL_ADDRESS = 104;

	/**
	 * The feature id for the '<em><b>Bind Styles To Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT = 105;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_COLOR = 106;

	/**
	 * The feature id for the '<em><b>Border Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_MODEL = 107;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUTTONS = 108;

	/**
	 * The feature id for the '<em><b>Cell Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_ADDRESS1 = 109;

	/**
	 * The feature id for the '<em><b>Cell Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_RANGE = 110;

	/**
	 * The feature id for the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CELL_RANGE_ADDRESS = 111;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN = 112;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 113;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION = 114;

	/**
	 * The feature id for the '<em><b>Condition Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION_SOURCE = 115;

	/**
	 * The feature id for the '<em><b>Condition Source Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS = 116;

	/**
	 * The feature id for the '<em><b>Contains Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINS_ERROR = 117;

	/**
	 * The feature id for the '<em><b>Contains Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINS_HEADER = 118;

	/**
	 * The feature id for the '<em><b>Content Validation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT_VALIDATION_NAME = 119;

	/**
	 * The feature id for the '<em><b>Copy Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY_BACK = 120;

	/**
	 * The feature id for the '<em><b>Copy Formulas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY_FORMULAS = 121;

	/**
	 * The feature id for the '<em><b>Copy Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY_STYLES = 122;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNT = 123;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 124;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_NAME = 125;

	/**
	 * The feature id for the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_TABLE_NAME = 126;

	/**
	 * The feature id for the '<em><b>Data Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS = 127;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_FIELD = 128;

	/**
	 * The feature id for the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_END = 129;

	/**
	 * The feature id for the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_START = 130;

	/**
	 * The feature id for the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME = 131;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTION = 132;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY = 133;

	/**
	 * The feature id for the '<em><b>Display Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_BORDER = 134;

	/**
	 * The feature id for the '<em><b>Display Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_DUPLICATES = 135;

	/**
	 * The feature id for the '<em><b>Display Filter Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS = 136;

	/**
	 * The feature id for the '<em><b>Display List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_LIST = 137;

	/**
	 * The feature id for the '<em><b>Display Member Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_MEMBER_MODE = 138;

	/**
	 * The feature id for the '<em><b>Drill Down On Double Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK = 139;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENABLED = 140;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 141;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_CELL_ADDRESS = 142;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_COLUMN = 143;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_POSITION = 144;

	/**
	 * The feature id for the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_ROW = 145;

	/**
	 * The feature id for the '<em><b>End Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_TABLE = 146;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_X = 147;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_Y = 148;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION = 149;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD_NAME = 150;

	/**
	 * The feature id for the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD_NUMBER = 151;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_NAME = 152;

	/**
	 * The feature id for the '<em><b>Filter Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_OPTIONS = 153;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMULA = 154;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNCTION = 155;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRAND_TOTAL = 156;

	/**
	 * The feature id for the '<em><b>Group By Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER = 157;

	/**
	 * The feature id for the '<em><b>Grouped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUPED_BY = 158;

	/**
	 * The feature id for the '<em><b>Has Persistent Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_PERSISTENT_DATA = 159;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 160;

	/**
	 * The feature id for the '<em><b>Identify Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFY_CATEGORIES = 161;

	/**
	 * The feature id for the '<em><b>Ignore Empty Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IGNORE_EMPTY_ROWS = 162;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INDEX = 163;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_ACTIVE = 164;

	/**
	 * The feature id for the '<em><b>Is Data Layout Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD = 165;

	/**
	 * The feature id for the '<em><b>Is Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_SELECTION = 166;

	/**
	 * The feature id for the '<em><b>Is Sub Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_SUB_TABLE = 167;

	/**
	 * The feature id for the '<em><b>Label Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS = 168;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 169;

	/**
	 * The feature id for the '<em><b>Last Column Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_COLUMN_SPANNED = 170;

	/**
	 * The feature id for the '<em><b>Last Row Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_ROW_SPANNED = 171;

	/**
	 * The feature id for the '<em><b>Layout Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT_MODE = 172;

	/**
	 * The feature id for the '<em><b>Link To Source Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_TO_SOURCE_DATA = 173;

	/**
	 * The feature id for the '<em><b>Marked Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKED_INVALID = 174;

	/**
	 * The feature id for the '<em><b>Matrix Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MATRIX_COVERED = 175;

	/**
	 * The feature id for the '<em><b>Member Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMBER_COUNT = 176;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMBER_NAME = 177;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMBER_TYPE = 178;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODE = 179;

	/**
	 * The feature id for the '<em><b>Multi Deletion Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_DELETION_SPANNED = 180;

	/**
	 * The feature id for the '<em><b>Null Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_YEAR = 181;

	/**
	 * The feature id for the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED = 182;

	/**
	 * The feature id for the '<em><b>Number Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED = 183;

	/**
	 * The feature id for the '<em><b>Number Matrix Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED = 184;

	/**
	 * The feature id for the '<em><b>Number Matrix Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED = 185;

	/**
	 * The feature id for the '<em><b>Number Rows Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_ROWS_REPEATED = 186;

	/**
	 * The feature id for the '<em><b>Number Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_ROWS_SPANNED = 187;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_NAME = 188;

	/**
	 * The feature id for the '<em><b>On Update Keep Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE = 189;

	/**
	 * The feature id for the '<em><b>On Update Keep Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES = 190;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPERATOR = 191;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER = 192;

	/**
	 * The feature id for the '<em><b>Page Breaks On Group Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE = 193;

	/**
	 * The feature id for the '<em><b>Parse Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARSE_SQL_STATEMENT = 194;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PASSWORD = 195;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSITION = 196;

	/**
	 * The feature id for the '<em><b>Precision As Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRECISION_AS_SHOWN = 197;

	/**
	 * The feature id for the '<em><b>Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT = 198;

	/**
	 * The feature id for the '<em><b>Print Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT_RANGES = 199;

	/**
	 * The feature id for the '<em><b>Protect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTECT = 200;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTECTED = 201;

	/**
	 * The feature id for the '<em><b>Query Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_NAME = 202;

	/**
	 * The feature id for the '<em><b>Range Usable As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RANGE_USABLE_AS = 203;

	/**
	 * The feature id for the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REJECTING_CHANGE_ID = 204;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROW = 205;

	/**
	 * The feature id for the '<em><b>Scenario Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCENARIO_RANGES = 206;

	/**
	 * The feature id for the '<em><b>Search Criteria Must Apply To Whole Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL = 207;

	/**
	 * The feature id for the '<em><b>Selected Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECTED_PAGE = 208;

	/**
	 * The feature id for the '<em><b>Show Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_DETAILS = 209;

	/**
	 * The feature id for the '<em><b>Show Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_EMPTY = 210;

	/**
	 * The feature id for the '<em><b>Show Filter Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_FILTER_BUTTON = 211;

	/**
	 * The feature id for the '<em><b>Sort Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORT_MODE = 212;

	/**
	 * The feature id for the '<em><b>Source Cell Range Addresses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES = 213;

	/**
	 * The feature id for the '<em><b>Source Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_FIELD_NAME = 214;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_NAME = 215;

	/**
	 * The feature id for the '<em><b>Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_STATEMENT = 216;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 217;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_COLUMN = 218;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_POSITION = 219;

	/**
	 * The feature id for the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_ROW = 220;

	/**
	 * The feature id for the '<em><b>Start Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_TABLE = 221;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEP = 222;

	/**
	 * The feature id for the '<em><b>Structure Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRUCTURE_PROTECTED = 223;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_NAME = 224;

	/**
	 * The feature id for the '<em><b>Table1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE1 = 225;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_BACKGROUND = 226;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_NAME = 227;

	/**
	 * The feature id for the '<em><b>Target Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_CELL_ADDRESS = 228;

	/**
	 * The feature id for the '<em><b>Target Range Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1 = 229;

	/**
	 * The feature id for the '<em><b>Track Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACK_CHANGES = 230;

	/**
	 * The feature id for the '<em><b>Used Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USED_HIERARCHY = 231;

	/**
	 * The feature id for the '<em><b>Use Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_LABELS = 232;

	/**
	 * The feature id for the '<em><b>Use Regular Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS = 233;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_NAME = 234;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 235;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBILITY = 236;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 237;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTableTemplateType()
	 * @generated
	 */
	int TABLE_TEMPLATE_TYPE = 92;

	/**
	 * The feature id for the '<em><b>First Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__FIRST_ROW = 0;

	/**
	 * The feature id for the '<em><b>Last Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__LAST_ROW = 1;

	/**
	 * The feature id for the '<em><b>First Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__FIRST_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Last Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__LAST_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__BODY = 4;

	/**
	 * The feature id for the '<em><b>Even Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__EVEN_ROWS = 5;

	/**
	 * The feature id for the '<em><b>Odd Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__ODD_ROWS = 6;

	/**
	 * The feature id for the '<em><b>Even Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__EVEN_COLUMNS = 7;

	/**
	 * The feature id for the '<em><b>Odd Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__ODD_COLUMNS = 8;

	/**
	 * The feature id for the '<em><b>First Row End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>First Row Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Last Row End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Last Row Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE__NAME = 13;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl <em>Target Range Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTargetRangeAddressType()
	 * @generated
	 */
	int TARGET_RANGE_ADDRESS_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__END_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__END_ROW = 2;

	/**
	 * The feature id for the '<em><b>End Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__END_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__ROW = 4;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__START_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__START_ROW = 6;

	/**
	 * The feature id for the '<em><b>Start Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__START_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE__TABLE = 8;

	/**
	 * The number of structural features of the '<em>Target Range Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RANGE_ADDRESS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl <em>Tracked Changes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTrackedChangesType()
	 * @generated
	 */
	int TRACKED_CHANGES_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Cell Content Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE = 1;

	/**
	 * The feature id for the '<em><b>Insertion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__INSERTION = 2;

	/**
	 * The feature id for the '<em><b>Deletion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__DELETION = 3;

	/**
	 * The feature id for the '<em><b>Movement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__MOVEMENT = 4;

	/**
	 * The feature id for the '<em><b>Track Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE__TRACK_CHANGES = 5;

	/**
	 * The number of structural features of the '<em>Tracked Changes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKED_CHANGES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType <em>Acceptance State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getAcceptanceStateType()
	 * @generated
	 */
	int ACCEPTANCE_STATE_TYPE = 95;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 96;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType <em>Border Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getBorderModelType()
	 * @generated
	 */
	int BORDER_MODEL_TYPE = 97;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType <em>Condition Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getConditionSourceType()
	 * @generated
	 */
	int CONDITION_SOURCE_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1 <em>Data Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeType1()
	 * @generated
	 */
	int DATA_TYPE_TYPE1 = 99;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1 <em>Data Type Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember1()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER1 = 100;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2 <em>Data Type Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember2()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER2 = 101;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3 <em>Data Type Type Member3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember3()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER3 = 102;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1 <em>Date End Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateEndTypeMember1()
	 * @generated
	 */
	int DATE_END_TYPE_MEMBER1 = 103;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1 <em>Date Start Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateStartTypeMember1()
	 * @generated
	 */
	int DATE_START_TYPE_MEMBER1 = 104;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType <em>Display List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDisplayListType()
	 * @generated
	 */
	int DISPLAY_LIST_TYPE = 106;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType <em>Display Member Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDisplayMemberModeType()
	 * @generated
	 */
	int DISPLAY_MEMBER_MODE_TYPE = 107;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1 <em>End Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getEndTypeMember1()
	 * @generated
	 */
	int END_TYPE_MEMBER1 = 108;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1 <em>Function Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember1()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER1 = 109;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10 <em>Function Type Member10</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember10()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER10 = 110;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11 <em>Function Type Member11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember11()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER11 = 111;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12 <em>Function Type Member12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember12()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER12 = 112;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2 <em>Function Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember2()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER2 = 113;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3 <em>Function Type Member3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember3()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER3 = 114;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4 <em>Function Type Member4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember4()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER4 = 115;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5 <em>Function Type Member5</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember5()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER5 = 116;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6 <em>Function Type Member6</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember6()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER6 = 117;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7 <em>Function Type Member7</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember7()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER7 = 118;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8 <em>Function Type Member8</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember8()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER8 = 119;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9 <em>Function Type Member9</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember9()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER9 = 120;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType <em>Grand Total Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getGrandTotalType()
	 * @generated
	 */
	int GRAND_TOTAL_TYPE = 121;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType <em>Grouped By Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getGroupedByType()
	 * @generated
	 */
	int GROUPED_BY_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType <em>Layout Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLayoutModeType()
	 * @generated
	 */
	int LAYOUT_MODE_TYPE = 123;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType <em>Member Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMemberTypeType()
	 * @generated
	 */
	int MEMBER_TYPE_TYPE = 124;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType <em>Message Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMessageTypeType()
	 * @generated
	 */
	int MESSAGE_TYPE_TYPE = 125;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 126;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NameType <em>Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 127;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 128;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType <em>Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 129;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1 <em>Orientation Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrientationType1()
	 * @generated
	 */
	int ORIENTATION_TYPE1 = 130;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0 <em>Range Usable As Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember0()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER0 = 131;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem <em>Range Usable As Type Member1 Base Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember1BaseItem()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM = 132;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType <em>Sort Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSortModeType()
	 * @generated
	 */
	int SORT_MODE_TYPE = 133;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1 <em>Start Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStartTypeMember1()
	 * @generated
	 */
	int START_TYPE_MEMBER1 = 134;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 135;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 136;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 137;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType <em>Use Labels Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getUseLabelsType()
	 * @generated
	 */
	int USE_LABELS_TYPE = 138;

	/**
	 * The meta object id for the '<em>Acceptance State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getAcceptanceStateTypeObject()
	 * @generated
	 */
	int ACCEPTANCE_STATE_TYPE_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 140;

	/**
	 * The meta object id for the '<em>Border Model Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getBorderModelTypeObject()
	 * @generated
	 */
	int BORDER_MODEL_TYPE_OBJECT = 141;

	/**
	 * The meta object id for the '<em>Condition Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getConditionSourceTypeObject()
	 * @generated
	 */
	int CONDITION_SOURCE_TYPE_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Data Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeType()
	 * @generated
	 */
	int DATA_TYPE_TYPE = 143;

	/**
	 * The meta object id for the '<em>Data Type Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember1Object()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER1_OBJECT = 144;

	/**
	 * The meta object id for the '<em>Data Type Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember2Object()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER2_OBJECT = 145;

	/**
	 * The meta object id for the '<em>Data Type Type Member3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeMember3Object()
	 * @generated
	 */
	int DATA_TYPE_TYPE_MEMBER3_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Data Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDataTypeTypeObject()
	 * @generated
	 */
	int DATA_TYPE_TYPE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>Date End Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateEndType()
	 * @generated
	 */
	int DATE_END_TYPE = 148;

	/**
	 * The meta object id for the '<em>Date End Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateEndTypeMember1Object()
	 * @generated
	 */
	int DATE_END_TYPE_MEMBER1_OBJECT = 149;

	/**
	 * The meta object id for the '<em>Date Start Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateStartType()
	 * @generated
	 */
	int DATE_START_TYPE = 150;

	/**
	 * The meta object id for the '<em>Date Start Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDateStartTypeMember1Object()
	 * @generated
	 */
	int DATE_START_TYPE_MEMBER1_OBJECT = 151;

	/**
	 * The meta object id for the '<em>Default Cell Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDefaultCellStyleNameType()
	 * @generated
	 */
	int DEFAULT_CELL_STYLE_NAME_TYPE = 152;

	/**
	 * The meta object id for the '<em>Default Cell Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDefaultCellStyleNameTypeMember1()
	 * @generated
	 */
	int DEFAULT_CELL_STYLE_NAME_TYPE_MEMBER1 = 153;

	/**
	 * The meta object id for the '<em>Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDirectionTypeObject()
	 * @generated
	 */
	int DIRECTION_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Display List Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDisplayListTypeObject()
	 * @generated
	 */
	int DISPLAY_LIST_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>Display Member Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getDisplayMemberModeTypeObject()
	 * @generated
	 */
	int DISPLAY_MEMBER_MODE_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>End Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getEndType()
	 * @generated
	 */
	int END_TYPE = 157;

	/**
	 * The meta object id for the '<em>End Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getEndTypeMember1Object()
	 * @generated
	 */
	int END_TYPE_MEMBER1_OBJECT = 158;

	/**
	 * The meta object id for the '<em>Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 159;

	/**
	 * The meta object id for the '<em>Function Type Member10 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember10Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER10_OBJECT = 160;

	/**
	 * The meta object id for the '<em>Function Type Member11 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember11Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER11_OBJECT = 161;

	/**
	 * The meta object id for the '<em>Function Type Member12 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember12Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER12_OBJECT = 162;

	/**
	 * The meta object id for the '<em>Function Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember1Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER1_OBJECT = 163;

	/**
	 * The meta object id for the '<em>Function Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember2Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER2_OBJECT = 164;

	/**
	 * The meta object id for the '<em>Function Type Member3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember3Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER3_OBJECT = 165;

	/**
	 * The meta object id for the '<em>Function Type Member4 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember4Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER4_OBJECT = 166;

	/**
	 * The meta object id for the '<em>Function Type Member5 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember5Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER5_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Function Type Member6 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember6Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER6_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Function Type Member7 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember7Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER7_OBJECT = 169;

	/**
	 * The meta object id for the '<em>Function Type Member8 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember8Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER8_OBJECT = 170;

	/**
	 * The meta object id for the '<em>Function Type Member9 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getFunctionTypeMember9Object()
	 * @generated
	 */
	int FUNCTION_TYPE_MEMBER9_OBJECT = 171;

	/**
	 * The meta object id for the '<em>Grand Total Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getGrandTotalTypeObject()
	 * @generated
	 */
	int GRAND_TOTAL_TYPE_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Grouped By Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getGroupedByTypeObject()
	 * @generated
	 */
	int GROUPED_BY_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Layout Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getLayoutModeTypeObject()
	 * @generated
	 */
	int LAYOUT_MODE_TYPE_OBJECT = 174;

	/**
	 * The meta object id for the '<em>Member Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMemberTypeTypeObject()
	 * @generated
	 */
	int MEMBER_TYPE_TYPE_OBJECT = 175;

	/**
	 * The meta object id for the '<em>Message Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getMessageTypeTypeObject()
	 * @generated
	 */
	int MESSAGE_TYPE_TYPE_OBJECT = 176;

	/**
	 * The meta object id for the '<em>Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getModeTypeObject()
	 * @generated
	 */
	int MODE_TYPE_OBJECT = 177;

	/**
	 * The meta object id for the '<em>Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getNameTypeObject()
	 * @generated
	 */
	int NAME_TYPE_OBJECT = 178;

	/**
	 * The meta object id for the '<em>Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrderTypeObject()
	 * @generated
	 */
	int ORDER_TYPE_OBJECT = 179;

	/**
	 * The meta object id for the '<em>Orientation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrientationTypeObject()
	 * @generated
	 */
	int ORIENTATION_TYPE_OBJECT = 180;

	/**
	 * The meta object id for the '<em>Orientation Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getOrientationTypeObject1()
	 * @generated
	 */
	int ORIENTATION_TYPE_OBJECT1 = 181;

	/**
	 * The meta object id for the '<em>Range Usable As Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsType()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE = 182;

	/**
	 * The meta object id for the '<em>Range Usable As Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember0Object()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER0_OBJECT = 183;

	/**
	 * The meta object id for the '<em>Range Usable As Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember1()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER1 = 184;

	/**
	 * The meta object id for the '<em>Range Usable As Type Member1 Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember1Base()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER1_BASE = 185;

	/**
	 * The meta object id for the '<em>Range Usable As Type Member1 Base Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getRangeUsableAsTypeMember1BaseItemObject()
	 * @generated
	 */
	int RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM_OBJECT = 186;

	/**
	 * The meta object id for the '<em>Sort Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getSortModeTypeObject()
	 * @generated
	 */
	int SORT_MODE_TYPE_OBJECT = 187;

	/**
	 * The meta object id for the '<em>Start Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStartType()
	 * @generated
	 */
	int START_TYPE = 188;

	/**
	 * The meta object id for the '<em>Start Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStartTypeMember1Object()
	 * @generated
	 */
	int START_TYPE_MEMBER1_OBJECT = 189;

	/**
	 * The meta object id for the '<em>Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStatusTypeObject()
	 * @generated
	 */
	int STATUS_TYPE_OBJECT = 190;

	/**
	 * The meta object id for the '<em>Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStyleNameType()
	 * @generated
	 */
	int STYLE_NAME_TYPE = 191;

	/**
	 * The meta object id for the '<em>Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getStyleNameTypeMember1()
	 * @generated
	 */
	int STYLE_NAME_TYPE_MEMBER1 = 192;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 193;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 194;

	/**
	 * The meta object id for the '<em>Use Labels Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl#getUseLabelsTypeObject()
	 * @generated
	 */
	int USE_LABELS_TYPE_OBJECT = 195;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BodyType
	 * @generated
	 */
	EClass getBodyType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BodyType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BodyType#getParagraphStyleName()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BodyType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BodyType#getStyleName()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType <em>Calculation Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Settings Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType
	 * @generated
	 */
	EClass getCalculationSettingsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullDate <em>Null Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullDate()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EReference getCalculationSettingsType_NullDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iteration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getIteration()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EReference getCalculationSettingsType_Iteration();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels <em>Automatic Find Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Find Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_AutomaticFindLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear <em>Null Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_NullYear();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown <em>Precision As Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision As Shown</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_PrecisionAsShown();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Criteria Must Apply To Whole Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_SearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions <em>Use Regular Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Regular Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions()
	 * @see #getCalculationSettingsType()
	 * @generated
	 */
	EAttribute getCalculationSettingsType_UseRegularExpressions();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType <em>Cell Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Address Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType
	 * @generated
	 */
	EClass getCellAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getColumn()
	 * @see #getCellAddressType()
	 * @generated
	 */
	EAttribute getCellAddressType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getRow()
	 * @see #getCellAddressType()
	 * @generated
	 */
	EAttribute getCellAddressType_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getTable()
	 * @see #getCellAddressType()
	 * @generated
	 */
	EAttribute getCellAddressType_Table();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType <em>Cell Content Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Content Change Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType
	 * @generated
	 */
	EClass getCellContentChangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getCellAddress <em>Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getCellAddress()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EReference getCellContentChangeType_CellAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getChangeInfo <em>Change Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getChangeInfo()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EReference getCellContentChangeType_ChangeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getDependencies()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EReference getCellContentChangeType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getDeletions()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EReference getCellContentChangeType_Deletions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getPrevious()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EReference getCellContentChangeType_Previous();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getAcceptanceState <em>Acceptance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getAcceptanceState()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EAttribute getCellContentChangeType_AcceptanceState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getId()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EAttribute getCellContentChangeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getRejectingChangeId <em>Rejecting Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejecting Change Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType#getRejectingChangeId()
	 * @see #getCellContentChangeType()
	 * @generated
	 */
	EAttribute getCellContentChangeType_RejectingChangeId();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType <em>Cell Content Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Content Deletion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType
	 * @generated
	 */
	EClass getCellContentDeletionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getCellAddress <em>Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getCellAddress()
	 * @see #getCellContentDeletionType()
	 * @generated
	 */
	EReference getCellContentDeletionType_CellAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getChangeTrackTableCell <em>Change Track Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Track Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getChangeTrackTableCell()
	 * @see #getCellContentDeletionType()
	 * @generated
	 */
	EReference getCellContentDeletionType_ChangeTrackTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getId()
	 * @see #getCellContentDeletionType()
	 * @generated
	 */
	EAttribute getCellContentDeletionType_Id();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType <em>Cell Range Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Range Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType
	 * @generated
	 */
	EClass getCellRangeSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getActuate()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getFilterName()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getFilterOptions <em>Filter Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Options</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getFilterOptions()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_FilterOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getHref()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getLastColumnSpanned <em>Last Column Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Column Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getLastColumnSpanned()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_LastColumnSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getLastRowSpanned <em>Last Row Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Row Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getLastRowSpanned()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_LastRowSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getName()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getRefreshDelay <em>Refresh Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getRefreshDelay()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_RefreshDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType#getType()
	 * @see #getCellRangeSourceType()
	 * @generated
	 */
	EAttribute getCellRangeSourceType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType <em>Change Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Deletion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType
	 * @generated
	 */
	EClass getChangeDeletionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType#getId()
	 * @see #getChangeDeletionType()
	 * @generated
	 */
	EAttribute getChangeDeletionType_Id();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType <em>Change Track Table Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Track Table Cell Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType
	 * @generated
	 */
	EClass getChangeTrackTableCellType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getP()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EReference getChangeTrackTableCellType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getBooleanValue()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getCellAddress <em>Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getCellAddress()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_CellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getCurrency()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getDateValue()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getFormula()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getMatrixCovered <em>Matrix Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrix Covered</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getMatrixCovered()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_MatrixCovered();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Columns Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getNumberMatrixColumnsSpanned()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_NumberMatrixColumnsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Rows Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getNumberMatrixRowsSpanned()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_NumberMatrixRowsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getStringValue()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getTimeValue()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getValue()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType#getValueType()
	 * @see #getChangeTrackTableCellType()
	 * @generated
	 */
	EAttribute getChangeTrackTableCellType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType <em>Consolidation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consolidation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType
	 * @generated
	 */
	EClass getConsolidationType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getFunction()
	 * @see #getConsolidationType()
	 * @generated
	 */
	EAttribute getConsolidationType_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData <em>Link To Source Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link To Source Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData()
	 * @see #getConsolidationType()
	 * @generated
	 */
	EAttribute getConsolidationType_LinkToSourceData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cell Range Addresses</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getSourceCellRangeAddresses()
	 * @see #getConsolidationType()
	 * @generated
	 */
	EAttribute getConsolidationType_SourceCellRangeAddresses();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getTargetCellAddress <em>Target Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getTargetCellAddress()
	 * @see #getConsolidationType()
	 * @generated
	 */
	EAttribute getConsolidationType_TargetCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels <em>Use Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels()
	 * @see #getConsolidationType()
	 * @generated
	 */
	EAttribute getConsolidationType_UseLabels();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType <em>Content Validations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Validations Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType
	 * @generated
	 */
	EClass getContentValidationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType#getContentValidation <em>Content Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Validation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType#getContentValidation()
	 * @see #getContentValidationsType()
	 * @generated
	 */
	EReference getContentValidationsType_ContentValidation();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType <em>Content Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Validation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType
	 * @generated
	 */
	EClass getContentValidationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getHelpMessage <em>Help Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Help Message</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getHelpMessage()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EReference getContentValidationType_HelpMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Message</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMessage()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EReference getContentValidationType_ErrorMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMacro <em>Error Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Macro</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMacro()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EReference getContentValidationType_ErrorMacro();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getEventListeners()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EReference getContentValidationType_EventListeners();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell <em>Allow Empty Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EAttribute getContentValidationType_AllowEmptyCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getBaseCellAddress()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EAttribute getContentValidationType_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getCondition()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EAttribute getContentValidationType_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList <em>Display List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EAttribute getContentValidationType_DisplayList();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getName()
	 * @see #getContentValidationType()
	 * @generated
	 */
	EAttribute getContentValidationType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType <em>Covered Table Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Covered Table Cell Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType
	 * @generated
	 */
	EClass getCoveredTableCellType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getBooleanValue()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getContentValidationName <em>Content Validation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Validation Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getContentValidationName()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_ContentValidationName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getCurrency()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getDateValue()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getFormula()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getNumberColumnsRepeated()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_NumberColumnsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getProtect <em>Protect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getProtect()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_Protect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getStringValue()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getStyleName()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getTimeValue()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getValue()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType#getValueType()
	 * @see #getCoveredTableCellType()
	 * @generated
	 */
	EAttribute getCoveredTableCellType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType <em>Cut Offs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cut Offs Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType
	 * @generated
	 */
	EClass getCutOffsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff <em>Movement Cut Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movement Cut Off</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff()
	 * @see #getCutOffsType()
	 * @generated
	 */
	EReference getCutOffsType_MovementCutOff();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getInsertionCutOff <em>Insertion Cut Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion Cut Off</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getInsertionCutOff()
	 * @see #getCutOffsType()
	 * @generated
	 */
	EReference getCutOffsType_InsertionCutOff();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff1 <em>Movement Cut Off1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movement Cut Off1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff1()
	 * @see #getCutOffsType()
	 * @generated
	 */
	EReference getCutOffsType_MovementCutOff1();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType <em>Database Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Ranges Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType
	 * @generated
	 */
	EClass getDatabaseRangesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType#getDatabaseRange <em>Database Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType#getDatabaseRange()
	 * @see #getDatabaseRangesType()
	 * @generated
	 */
	EReference getDatabaseRangesType_DatabaseRange();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType <em>Database Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType
	 * @generated
	 */
	EClass getDatabaseRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceSql <em>Database Source Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Sql</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceSql()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_DatabaseSourceSql();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceQuery <em>Database Source Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Query</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceQuery()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_DatabaseSourceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceTable <em>Database Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceTable()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_DatabaseSourceTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getFilter()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSort()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_Sort();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSubtotalRules <em>Subtotal Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtotal Rules</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSubtotalRules()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EReference getDatabaseRangeType_SubtotalRules();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader <em>Contains Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_ContainsHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons <em>Display Filter Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Filter Buttons</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_DisplayFilterButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData <em>Has Persistent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Persistent Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_HasPersistentData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection <em>Is Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_IsSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getName()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize <em>On Update Keep Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Keep Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_OnUpdateKeepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Keep Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_OnUpdateKeepStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay <em>Refresh Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_RefreshDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getTargetRangeAddress()
	 * @see #getDatabaseRangeType()
	 * @generated
	 */
	EAttribute getDatabaseRangeType_TargetRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType <em>Database Source Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Source Query Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType
	 * @generated
	 */
	EClass getDatabaseSourceQueryType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getDatabaseName()
	 * @see #getDatabaseSourceQueryType()
	 * @generated
	 */
	EAttribute getDatabaseSourceQueryType_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getQueryName <em>Query Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getQueryName()
	 * @see #getDatabaseSourceQueryType()
	 * @generated
	 */
	EAttribute getDatabaseSourceQueryType_QueryName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType <em>Database Source Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Source Sql Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType
	 * @generated
	 */
	EClass getDatabaseSourceSqlType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getDatabaseName()
	 * @see #getDatabaseSourceSqlType()
	 * @generated
	 */
	EAttribute getDatabaseSourceSqlType_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement <em>Parse Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse Sql Statement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement()
	 * @see #getDatabaseSourceSqlType()
	 * @generated
	 */
	EAttribute getDatabaseSourceSqlType_ParseSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getSqlStatement <em>Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Statement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getSqlStatement()
	 * @see #getDatabaseSourceSqlType()
	 * @generated
	 */
	EAttribute getDatabaseSourceSqlType_SqlStatement();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType <em>Database Source Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Source Table Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType
	 * @generated
	 */
	EClass getDatabaseSourceTableType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseName()
	 * @see #getDatabaseSourceTableType()
	 * @generated
	 */
	EAttribute getDatabaseSourceTableType_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseTableName <em>Database Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseTableName()
	 * @see #getDatabaseSourceTableType()
	 * @generated
	 */
	EAttribute getDatabaseSourceTableType_DatabaseTableName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType <em>Data Pilot Display Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Display Info Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType
	 * @generated
	 */
	EClass getDataPilotDisplayInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDataField()
	 * @see #getDataPilotDisplayInfoType()
	 * @generated
	 */
	EAttribute getDataPilotDisplayInfoType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode <em>Display Member Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Member Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getDisplayMemberMode()
	 * @see #getDataPilotDisplayInfoType()
	 * @generated
	 */
	EAttribute getDataPilotDisplayInfoType_DisplayMemberMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getEnabled()
	 * @see #getDataPilotDisplayInfoType()
	 * @generated
	 */
	EAttribute getDataPilotDisplayInfoType_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getMemberCount <em>Member Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType#getMemberCount()
	 * @see #getDataPilotDisplayInfoType()
	 * @generated
	 */
	EAttribute getDataPilotDisplayInfoType_MemberCount();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType <em>Data Pilot Field Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Field Reference Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType
	 * @generated
	 */
	EClass getDataPilotFieldReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getFieldName()
	 * @see #getDataPilotFieldReferenceType()
	 * @generated
	 */
	EAttribute getDataPilotFieldReferenceType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getMemberName()
	 * @see #getDataPilotFieldReferenceType()
	 * @generated
	 */
	EAttribute getDataPilotFieldReferenceType_MemberName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getMemberType()
	 * @see #getDataPilotFieldReferenceType()
	 * @generated
	 */
	EAttribute getDataPilotFieldReferenceType_MemberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType#getType()
	 * @see #getDataPilotFieldReferenceType()
	 * @generated
	 */
	EAttribute getDataPilotFieldReferenceType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType <em>Data Pilot Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Field Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType
	 * @generated
	 */
	EClass getDataPilotFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotLevel <em>Data Pilot Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotLevel()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EReference getDataPilotFieldType_DataPilotLevel();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Field Reference</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotFieldReference()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EReference getDataPilotFieldType_DataPilotFieldReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotGroups <em>Data Pilot Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Groups</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getDataPilotGroups()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EReference getDataPilotFieldType_DataPilotGroups();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getFunction()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField <em>Is Data Layout Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Layout Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getIsDataLayoutField()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_IsDataLayoutField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getOrientation()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSelectedPage <em>Selected Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSelectedPage()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_SelectedPage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSourceFieldName <em>Source Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Field Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getSourceFieldName()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_SourceFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy <em>Used Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Hierarchy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType#getUsedHierarchy()
	 * @see #getDataPilotFieldType()
	 * @generated
	 */
	EAttribute getDataPilotFieldType_UsedHierarchy();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType <em>Data Pilot Group Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Group Member Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType
	 * @generated
	 */
	EClass getDataPilotGroupMemberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType#getName()
	 * @see #getDataPilotGroupMemberType()
	 * @generated
	 */
	EAttribute getDataPilotGroupMemberType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType <em>Data Pilot Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Groups Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType
	 * @generated
	 */
	EClass getDataPilotGroupsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDataPilotGroup <em>Data Pilot Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDataPilotGroup()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EReference getDataPilotGroupsType_DataPilotGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateEnd <em>Date End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateEnd()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_DateEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateStart <em>Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getDateStart()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_DateStart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getEnd()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy <em>Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouped By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getGroupedBy()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_GroupedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getSourceFieldName <em>Source Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Field Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getSourceFieldName()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_SourceFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStart()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType#getStep()
	 * @see #getDataPilotGroupsType()
	 * @generated
	 */
	EAttribute getDataPilotGroupsType_Step();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType <em>Data Pilot Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Group Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType
	 * @generated
	 */
	EClass getDataPilotGroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getDataPilotGroupMember <em>Data Pilot Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Group Member</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getDataPilotGroupMember()
	 * @see #getDataPilotGroupType()
	 * @generated
	 */
	EReference getDataPilotGroupType_DataPilotGroupMember();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType#getName()
	 * @see #getDataPilotGroupType()
	 * @generated
	 */
	EAttribute getDataPilotGroupType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType <em>Data Pilot Layout Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Layout Info Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType
	 * @generated
	 */
	EClass getDataPilotLayoutInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines <em>Add Empty Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Empty Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines()
	 * @see #getDataPilotLayoutInfoType()
	 * @generated
	 */
	EAttribute getDataPilotLayoutInfoType_AddEmptyLines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode <em>Layout Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode()
	 * @see #getDataPilotLayoutInfoType()
	 * @generated
	 */
	EAttribute getDataPilotLayoutInfoType_LayoutMode();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType <em>Data Pilot Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Level Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType
	 * @generated
	 */
	EClass getDataPilotLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Subtotals</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSubtotals()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EReference getDataPilotLevelType_DataPilotSubtotals();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotMembers <em>Data Pilot Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Members</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotMembers()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EReference getDataPilotLevelType_DataPilotMembers();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Display Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotDisplayInfo()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EReference getDataPilotLevelType_DataPilotDisplayInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Sort Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotSortInfo()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EReference getDataPilotLevelType_DataPilotSortInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Layout Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getDataPilotLayoutInfo()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EReference getDataPilotLevelType_DataPilotLayoutInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty <em>Show Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Empty</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType#getShowEmpty()
	 * @see #getDataPilotLevelType()
	 * @generated
	 */
	EAttribute getDataPilotLevelType_ShowEmpty();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType <em>Data Pilot Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Members Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType
	 * @generated
	 */
	EClass getDataPilotMembersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType#getDataPilotMember <em>Data Pilot Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Member</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType#getDataPilotMember()
	 * @see #getDataPilotMembersType()
	 * @generated
	 */
	EReference getDataPilotMembersType_DataPilotMember();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType <em>Data Pilot Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Member Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType
	 * @generated
	 */
	EClass getDataPilotMemberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getDisplay()
	 * @see #getDataPilotMemberType()
	 * @generated
	 */
	EAttribute getDataPilotMemberType_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getName()
	 * @see #getDataPilotMemberType()
	 * @generated
	 */
	EAttribute getDataPilotMemberType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getShowDetails <em>Show Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Details</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType#getShowDetails()
	 * @see #getDataPilotMemberType()
	 * @generated
	 */
	EAttribute getDataPilotMemberType_ShowDetails();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType <em>Data Pilot Sort Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Sort Info Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType
	 * @generated
	 */
	EClass getDataPilotSortInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getDataField()
	 * @see #getDataPilotSortInfoType()
	 * @generated
	 */
	EAttribute getDataPilotSortInfoType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder()
	 * @see #getDataPilotSortInfoType()
	 * @generated
	 */
	EAttribute getDataPilotSortInfoType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode <em>Sort Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode()
	 * @see #getDataPilotSortInfoType()
	 * @generated
	 */
	EAttribute getDataPilotSortInfoType_SortMode();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType <em>Data Pilot Subtotals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Subtotals Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType
	 * @generated
	 */
	EClass getDataPilotSubtotalsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Subtotal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType#getDataPilotSubtotal()
	 * @see #getDataPilotSubtotalsType()
	 * @generated
	 */
	EReference getDataPilotSubtotalsType_DataPilotSubtotal();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType <em>Data Pilot Subtotal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Subtotal Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType
	 * @generated
	 */
	EClass getDataPilotSubtotalType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType#getFunction()
	 * @see #getDataPilotSubtotalType()
	 * @generated
	 */
	EAttribute getDataPilotSubtotalType_Function();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType <em>Data Pilot Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Tables Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType
	 * @generated
	 */
	EClass getDataPilotTablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType#getDataPilotTable <em>Data Pilot Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType#getDataPilotTable()
	 * @see #getDataPilotTablesType()
	 * @generated
	 */
	EReference getDataPilotTablesType_DataPilotTable();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType <em>Data Pilot Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pilot Table Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType
	 * @generated
	 */
	EClass getDataPilotTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceSql <em>Database Source Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Sql</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceSql()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_DatabaseSourceSql();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceQuery <em>Database Source Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Query</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceQuery()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_DatabaseSourceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceTable <em>Database Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceTable()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_DatabaseSourceTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceService <em>Source Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Service</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceService()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_SourceService();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceCellRange <em>Source Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceCellRange()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_SourceCellRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDataPilotField <em>Data Pilot Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Pilot Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDataPilotField()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EReference getDataPilotTableType_DataPilotField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getApplicationData <em>Application Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getApplicationData()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_ApplicationData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buttons</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getButtons()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_Buttons();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drill Down On Double Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_DrillDownOnDoubleClick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_GrandTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories <em>Identify Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identify Categories</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_IdentifyCategories();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Empty Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_IgnoreEmptyRows();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getName()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton <em>Show Filter Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Filter Button</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_ShowFilterButton();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getTargetRangeAddress()
	 * @see #getDataPilotTableType()
	 * @generated
	 */
	EAttribute getDataPilotTableType_TargetRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType <em>Dde Links Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dde Links Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType
	 * @generated
	 */
	EClass getDdeLinksType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType#getDdeLink <em>Dde Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dde Link</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType#getDdeLink()
	 * @see #getDdeLinksType()
	 * @generated
	 */
	EReference getDdeLinksType_DdeLink();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType <em>Dde Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dde Link Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType
	 * @generated
	 */
	EClass getDdeLinkType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getDdeSource <em>Dde Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getDdeSource()
	 * @see #getDdeLinkType()
	 * @generated
	 */
	EReference getDdeLinkType_DdeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getTable()
	 * @see #getDdeLinkType()
	 * @generated
	 */
	EReference getDdeLinkType_Table();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType <em>Deletions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletions Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType
	 * @generated
	 */
	EClass getDeletionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getGroup()
	 * @see #getDeletionsType()
	 * @generated
	 */
	EAttribute getDeletionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getCellContentDeletion <em>Cell Content Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Content Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getCellContentDeletion()
	 * @see #getDeletionsType()
	 * @generated
	 */
	EReference getDeletionsType_CellContentDeletion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getChangeDeletion <em>Change Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType#getChangeDeletion()
	 * @see #getDeletionsType()
	 * @generated
	 */
	EReference getDeletionsType_ChangeDeletion();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType <em>Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType
	 * @generated
	 */
	EClass getDeletionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getChangeInfo <em>Change Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getChangeInfo()
	 * @see #getDeletionType()
	 * @generated
	 */
	EReference getDeletionType_ChangeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDependencies()
	 * @see #getDeletionType()
	 * @generated
	 */
	EReference getDeletionType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDeletions()
	 * @see #getDeletionType()
	 * @generated
	 */
	EReference getDeletionType_Deletions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getCutOffs <em>Cut Offs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cut Offs</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getCutOffs()
	 * @see #getDeletionType()
	 * @generated
	 */
	EReference getDeletionType_CutOffs();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState <em>Acceptance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_AcceptanceState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getId()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Deletion Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getMultiDeletionSpanned()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_MultiDeletionSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getPosition()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getRejectingChangeId <em>Rejecting Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejecting Change Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getRejectingChangeId()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_RejectingChangeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getTable()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType()
	 * @see #getDeletionType()
	 * @generated
	 */
	EAttribute getDeletionType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType
	 * @generated
	 */
	EClass getDependenciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType#getDependency()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EReference getDependenciesType_Dependency();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType
	 * @generated
	 */
	EClass getDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType#getId()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Id();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType <em>Detective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detective Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType
	 * @generated
	 */
	EClass getDetectiveType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getHighlightedRange <em>Highlighted Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Highlighted Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getHighlightedRange()
	 * @see #getDetectiveType()
	 * @generated
	 */
	EReference getDetectiveType_HighlightedRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getOperation()
	 * @see #getDetectiveType()
	 * @generated
	 */
	EReference getDetectiveType_Operation();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType <em>Error Macro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Macro Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType
	 * @generated
	 */
	EClass getErrorMacroType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType#getExecute()
	 * @see #getErrorMacroType()
	 * @generated
	 */
	EAttribute getErrorMacroType_Execute();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType <em>Error Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Message Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType
	 * @generated
	 */
	EClass getErrorMessageType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getP()
	 * @see #getErrorMessageType()
	 * @generated
	 */
	EReference getErrorMessageType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay()
	 * @see #getErrorMessageType()
	 * @generated
	 */
	EAttribute getErrorMessageType_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType()
	 * @see #getErrorMessageType()
	 * @generated
	 */
	EAttribute getErrorMessageType_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getTitle()
	 * @see #getErrorMessageType()
	 * @generated
	 */
	EAttribute getErrorMessageType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType <em>Even Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Even Columns Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType
	 * @generated
	 */
	EClass getEvenColumnsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType#getParagraphStyleName()
	 * @see #getEvenColumnsType()
	 * @generated
	 */
	EAttribute getEvenColumnsType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType#getStyleName()
	 * @see #getEvenColumnsType()
	 * @generated
	 */
	EAttribute getEvenColumnsType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType <em>Even Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Even Rows Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType
	 * @generated
	 */
	EClass getEvenRowsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType#getParagraphStyleName()
	 * @see #getEvenRowsType()
	 * @generated
	 */
	EAttribute getEvenRowsType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType#getStyleName()
	 * @see #getEvenRowsType()
	 * @generated
	 */
	EAttribute getEvenRowsType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType <em>Filter And Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter And Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType
	 * @generated
	 */
	EClass getFilterAndType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getGroup()
	 * @see #getFilterAndType()
	 * @generated
	 */
	EAttribute getFilterAndType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getFilterOr <em>Filter Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Or</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getFilterOr()
	 * @see #getFilterAndType()
	 * @generated
	 */
	EReference getFilterAndType_FilterOr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getFilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType#getFilterCondition()
	 * @see #getFilterAndType()
	 * @generated
	 */
	EReference getFilterAndType_FilterCondition();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType <em>Filter Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Condition Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType
	 * @generated
	 */
	EClass getFilterConditionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getCaseSensitive()
	 * @see #getFilterConditionType()
	 * @generated
	 */
	EAttribute getFilterConditionType_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType()
	 * @see #getFilterConditionType()
	 * @generated
	 */
	EAttribute getFilterConditionType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getFieldNumber <em>Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getFieldNumber()
	 * @see #getFilterConditionType()
	 * @generated
	 */
	EAttribute getFilterConditionType_FieldNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getOperator()
	 * @see #getFilterConditionType()
	 * @generated
	 */
	EAttribute getFilterConditionType_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getValue()
	 * @see #getFilterConditionType()
	 * @generated
	 */
	EAttribute getFilterConditionType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType <em>Filter Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Or Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType
	 * @generated
	 */
	EClass getFilterOrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getGroup()
	 * @see #getFilterOrType()
	 * @generated
	 */
	EAttribute getFilterOrType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterAnd <em>Filter And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter And</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterAnd()
	 * @see #getFilterOrType()
	 * @generated
	 */
	EReference getFilterOrType_FilterAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterCondition()
	 * @see #getFilterOrType()
	 * @generated
	 */
	EReference getFilterOrType_FilterCondition();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterCondition()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterAnd <em>Filter And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter And</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterAnd()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterAnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterOr <em>Filter Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Or</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterOr()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterOr();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource <em>Condition Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_ConditionSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Source Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSourceRangeAddress()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_ConditionSourceRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates <em>Display Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Duplicates</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_DisplayDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getTargetRangeAddress()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_TargetRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType <em>First Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Column Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType
	 * @generated
	 */
	EClass getFirstColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType#getParagraphStyleName()
	 * @see #getFirstColumnType()
	 * @generated
	 */
	EAttribute getFirstColumnType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType#getStyleName()
	 * @see #getFirstColumnType()
	 * @generated
	 */
	EAttribute getFirstColumnType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType <em>First Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Row Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType
	 * @generated
	 */
	EClass getFirstRowType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType#getParagraphStyleName()
	 * @see #getFirstRowType()
	 * @generated
	 */
	EAttribute getFirstRowType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType#getStyleName()
	 * @see #getFirstRowType()
	 * @generated
	 */
	EAttribute getFirstRowType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType <em>Help Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Message Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType
	 * @generated
	 */
	EClass getHelpMessageType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getP()
	 * @see #getHelpMessageType()
	 * @generated
	 */
	EReference getHelpMessageType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getDisplay()
	 * @see #getHelpMessageType()
	 * @generated
	 */
	EAttribute getHelpMessageType_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType#getTitle()
	 * @see #getHelpMessageType()
	 * @generated
	 */
	EAttribute getHelpMessageType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType <em>Highlighted Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highlighted Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType
	 * @generated
	 */
	EClass getHighlightedRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getCellRangeAddress()
	 * @see #getHighlightedRangeType()
	 * @generated
	 */
	EAttribute getHighlightedRangeType_CellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError <em>Contains Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Error</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError()
	 * @see #getHighlightedRangeType()
	 * @generated
	 */
	EAttribute getHighlightedRangeType_ContainsError();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection()
	 * @see #getHighlightedRangeType()
	 * @generated
	 */
	EAttribute getHighlightedRangeType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid <em>Marked Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marked Invalid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid()
	 * @see #getHighlightedRangeType()
	 * @generated
	 */
	EAttribute getHighlightedRangeType_MarkedInvalid();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType <em>Insertion Cut Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Cut Off Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType
	 * @generated
	 */
	EClass getInsertionCutOffType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType#getId()
	 * @see #getInsertionCutOffType()
	 * @generated
	 */
	EAttribute getInsertionCutOffType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType#getPosition()
	 * @see #getInsertionCutOffType()
	 * @generated
	 */
	EAttribute getInsertionCutOffType_Position();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType <em>Insertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType
	 * @generated
	 */
	EClass getInsertionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getChangeInfo <em>Change Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getChangeInfo()
	 * @see #getInsertionType()
	 * @generated
	 */
	EReference getInsertionType_ChangeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getDependencies()
	 * @see #getInsertionType()
	 * @generated
	 */
	EReference getInsertionType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getDeletions()
	 * @see #getInsertionType()
	 * @generated
	 */
	EReference getInsertionType_Deletions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getAcceptanceState <em>Acceptance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getAcceptanceState()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_AcceptanceState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getCount()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getId()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getPosition()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getRejectingChangeId <em>Rejecting Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejecting Change Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getRejectingChangeId()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_RejectingChangeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getTable()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType#getType()
	 * @see #getInsertionType()
	 * @generated
	 */
	EAttribute getInsertionType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType <em>Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.IterationType
	 * @generated
	 */
	EClass getIterationType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference <em>Maximum Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Difference</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference()
	 * @see #getIterationType()
	 * @generated
	 */
	EAttribute getIterationType_MaximumDifference();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus()
	 * @see #getIterationType()
	 * @generated
	 */
	EAttribute getIterationType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steps</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps()
	 * @see #getIterationType()
	 * @generated
	 */
	EAttribute getIterationType_Steps();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType <em>Label Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Ranges Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType
	 * @generated
	 */
	EClass getLabelRangesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType#getLabelRange <em>Label Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType#getLabelRange()
	 * @see #getLabelRangesType()
	 * @generated
	 */
	EReference getLabelRangesType_LabelRange();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType <em>Label Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType
	 * @generated
	 */
	EClass getLabelRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getDataCellRangeAddress <em>Data Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getDataCellRangeAddress()
	 * @see #getLabelRangeType()
	 * @generated
	 */
	EAttribute getLabelRangeType_DataCellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getLabelCellRangeAddress <em>Label Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getLabelCellRangeAddress()
	 * @see #getLabelRangeType()
	 * @generated
	 */
	EAttribute getLabelRangeType_LabelCellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation()
	 * @see #getLabelRangeType()
	 * @generated
	 */
	EAttribute getLabelRangeType_Orientation();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType <em>Last Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Column Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType
	 * @generated
	 */
	EClass getLastColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getParagraphStyleName()
	 * @see #getLastColumnType()
	 * @generated
	 */
	EAttribute getLastColumnType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getStyleName()
	 * @see #getLastColumnType()
	 * @generated
	 */
	EAttribute getLastColumnType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType <em>Last Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Row Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType
	 * @generated
	 */
	EClass getLastRowType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType#getParagraphStyleName()
	 * @see #getLastRowType()
	 * @generated
	 */
	EAttribute getLastRowType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType#getStyleName()
	 * @see #getLastRowType()
	 * @generated
	 */
	EAttribute getLastRowType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType <em>Movement Cut Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Cut Off Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType
	 * @generated
	 */
	EClass getMovementCutOffType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getEndPosition()
	 * @see #getMovementCutOffType()
	 * @generated
	 */
	EAttribute getMovementCutOffType_EndPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getPosition()
	 * @see #getMovementCutOffType()
	 * @generated
	 */
	EAttribute getMovementCutOffType_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType#getStartPosition()
	 * @see #getMovementCutOffType()
	 * @generated
	 */
	EAttribute getMovementCutOffType_StartPosition();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType <em>Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType
	 * @generated
	 */
	EClass getMovementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getSourceRangeAddress <em>Source Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getSourceRangeAddress()
	 * @see #getMovementType()
	 * @generated
	 */
	EReference getMovementType_SourceRangeAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getTargetRangeAddress()
	 * @see #getMovementType()
	 * @generated
	 */
	EReference getMovementType_TargetRangeAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getChangeInfo <em>Change Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getChangeInfo()
	 * @see #getMovementType()
	 * @generated
	 */
	EReference getMovementType_ChangeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDependencies()
	 * @see #getMovementType()
	 * @generated
	 */
	EReference getMovementType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDeletions()
	 * @see #getMovementType()
	 * @generated
	 */
	EReference getMovementType_Deletions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState <em>Acceptance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState()
	 * @see #getMovementType()
	 * @generated
	 */
	EAttribute getMovementType_AcceptanceState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getId()
	 * @see #getMovementType()
	 * @generated
	 */
	EAttribute getMovementType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getRejectingChangeId <em>Rejecting Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejecting Change Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getRejectingChangeId()
	 * @see #getMovementType()
	 * @generated
	 */
	EAttribute getMovementType_RejectingChangeId();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType <em>Named Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Expressions Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType
	 * @generated
	 */
	EClass getNamedExpressionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getGroup()
	 * @see #getNamedExpressionsType()
	 * @generated
	 */
	EAttribute getNamedExpressionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getNamedRange <em>Named Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getNamedRange()
	 * @see #getNamedExpressionsType()
	 * @generated
	 */
	EReference getNamedExpressionsType_NamedRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getNamedExpression <em>Named Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Expression</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType#getNamedExpression()
	 * @see #getNamedExpressionsType()
	 * @generated
	 */
	EReference getNamedExpressionsType_NamedExpression();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType <em>Named Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Expression Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType
	 * @generated
	 */
	EClass getNamedExpressionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getBaseCellAddress()
	 * @see #getNamedExpressionType()
	 * @generated
	 */
	EAttribute getNamedExpressionType_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getExpression()
	 * @see #getNamedExpressionType()
	 * @generated
	 */
	EAttribute getNamedExpressionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType#getName()
	 * @see #getNamedExpressionType()
	 * @generated
	 */
	EAttribute getNamedExpressionType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType <em>Named Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType
	 * @generated
	 */
	EClass getNamedRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getBaseCellAddress()
	 * @see #getNamedRangeType()
	 * @generated
	 */
	EAttribute getNamedRangeType_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getCellRangeAddress()
	 * @see #getNamedRangeType()
	 * @generated
	 */
	EAttribute getNamedRangeType_CellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getName()
	 * @see #getNamedRangeType()
	 * @generated
	 */
	EAttribute getNamedRangeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs <em>Range Usable As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Usable As</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs()
	 * @see #getNamedRangeType()
	 * @generated
	 */
	EAttribute getNamedRangeType_RangeUsableAs();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType <em>Null Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Date Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType
	 * @generated
	 */
	EClass getNullDateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue()
	 * @see #getNullDateType()
	 * @generated
	 */
	EAttribute getNullDateType_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType()
	 * @see #getNullDateType()
	 * @generated
	 */
	EAttribute getNullDateType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType <em>Odd Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Odd Columns Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType
	 * @generated
	 */
	EClass getOddColumnsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType#getParagraphStyleName()
	 * @see #getOddColumnsType()
	 * @generated
	 */
	EAttribute getOddColumnsType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType#getStyleName()
	 * @see #getOddColumnsType()
	 * @generated
	 */
	EAttribute getOddColumnsType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType <em>Odd Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Odd Rows Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType
	 * @generated
	 */
	EClass getOddRowsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType#getParagraphStyleName <em>Paragraph Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType#getParagraphStyleName()
	 * @see #getOddRowsType()
	 * @generated
	 */
	EAttribute getOddRowsType_ParagraphStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType#getStyleName()
	 * @see #getOddRowsType()
	 * @generated
	 */
	EAttribute getOddRowsType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getIndex()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType <em>Previous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previous Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType
	 * @generated
	 */
	EClass getPreviousType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getChangeTrackTableCell <em>Change Track Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Track Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getChangeTrackTableCell()
	 * @see #getPreviousType()
	 * @generated
	 */
	EReference getPreviousType_ChangeTrackTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getId()
	 * @see #getPreviousType()
	 * @generated
	 */
	EAttribute getPreviousType_Id();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType <em>Scenario Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType
	 * @generated
	 */
	EClass getScenarioType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getBorderColor()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getComment()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack <em>Copy Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Back</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_CopyBack();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas <em>Copy Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Formulas</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_CopyFormulas();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles <em>Copy Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_CopyStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder <em>Display Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_DisplayBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_Protected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getScenarioRanges <em>Scenario Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getScenarioRanges()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_ScenarioRanges();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType <em>Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType
	 * @generated
	 */
	EClass getShapesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EAttribute getShapesType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getRect()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getLine()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPolyline()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPolygon()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getRegularPolygon()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPath()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCircle()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getEllipse()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getG()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getPageThumbnail()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getFrame()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getMeasure()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCaption()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getConnector()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getControl()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getScene()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType#getCustomShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_CustomShape();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType <em>Sort By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort By Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortByType
	 * @generated
	 */
	EClass getSortByType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getDataType()
	 * @see #getSortByType()
	 * @generated
	 */
	EAttribute getSortByType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getFieldNumber <em>Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getFieldNumber()
	 * @see #getSortByType()
	 * @generated
	 */
	EAttribute getSortByType_FieldNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder()
	 * @see #getSortByType()
	 * @generated
	 */
	EAttribute getSortByType_Order();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType <em>Sort Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Groups Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType
	 * @generated
	 */
	EClass getSortGroupsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType#getDataType()
	 * @see #getSortGroupsType()
	 * @generated
	 */
	EAttribute getSortGroupsType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType#getOrder()
	 * @see #getSortGroupsType()
	 * @generated
	 */
	EAttribute getSortGroupsType_Order();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType <em>Sort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType
	 * @generated
	 */
	EClass getSortType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getSortBy()
	 * @see #getSortType()
	 * @generated
	 */
	EReference getSortType_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getAlgorithm()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getBindStylesToContent <em>Bind Styles To Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Styles To Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getBindStylesToContent()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_BindStylesToContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getCaseSensitive()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getCountry()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getLanguage()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType#getTargetRangeAddress()
	 * @see #getSortType()
	 * @generated
	 */
	EAttribute getSortType_TargetRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType <em>Source Cell Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Cell Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType
	 * @generated
	 */
	EClass getSourceCellRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getFilter()
	 * @see #getSourceCellRangeType()
	 * @generated
	 */
	EReference getSourceCellRangeType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getCellRangeAddress()
	 * @see #getSourceCellRangeType()
	 * @generated
	 */
	EAttribute getSourceCellRangeType_CellRangeAddress();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType <em>Source Range Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Range Address Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType
	 * @generated
	 */
	EClass getSourceRangeAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getColumn()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndColumn()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_EndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndRow <em>End Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndRow()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_EndRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndTable <em>End Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getEndTable()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_EndTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getRow()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartColumn()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartRow <em>Start Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartRow()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_StartRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartTable <em>Start Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getStartTable()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_StartTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType#getTable()
	 * @see #getSourceRangeAddressType()
	 * @generated
	 */
	EAttribute getSourceRangeAddressType_Table();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType <em>Source Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Service Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType
	 * @generated
	 */
	EClass getSourceServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getName()
	 * @see #getSourceServiceType()
	 * @generated
	 */
	EAttribute getSourceServiceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getObjectName()
	 * @see #getSourceServiceType()
	 * @generated
	 */
	EAttribute getSourceServiceType_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getPassword()
	 * @see #getSourceServiceType()
	 * @generated
	 */
	EAttribute getSourceServiceType_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getSourceName()
	 * @see #getSourceServiceType()
	 * @generated
	 */
	EAttribute getSourceServiceType_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType#getUserName()
	 * @see #getSourceServiceType()
	 * @generated
	 */
	EAttribute getSourceServiceType_UserName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType <em>Subtotal Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtotal Field Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType
	 * @generated
	 */
	EClass getSubtotalFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFieldNumber <em>Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFieldNumber()
	 * @see #getSubtotalFieldType()
	 * @generated
	 */
	EAttribute getSubtotalFieldType_FieldNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFunction()
	 * @see #getSubtotalFieldType()
	 * @generated
	 */
	EAttribute getSubtotalFieldType_Function();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType <em>Subtotal Rules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtotal Rules Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType
	 * @generated
	 */
	EClass getSubtotalRulesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSortGroups <em>Sort Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort Groups</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSortGroups()
	 * @see #getSubtotalRulesType()
	 * @generated
	 */
	EReference getSubtotalRulesType_SortGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSubtotalRule <em>Subtotal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtotal Rule</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSubtotalRule()
	 * @see #getSubtotalRulesType()
	 * @generated
	 */
	EReference getSubtotalRulesType_SubtotalRule();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent <em>Bind Styles To Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Styles To Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent()
	 * @see #getSubtotalRulesType()
	 * @generated
	 */
	EAttribute getSubtotalRulesType_BindStylesToContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive()
	 * @see #getSubtotalRulesType()
	 * @generated
	 */
	EAttribute getSubtotalRulesType_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Breaks On Group Change</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange()
	 * @see #getSubtotalRulesType()
	 * @generated
	 */
	EAttribute getSubtotalRulesType_PageBreaksOnGroupChange();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType <em>Subtotal Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtotal Rule Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType
	 * @generated
	 */
	EClass getSubtotalRuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getSubtotalField <em>Subtotal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtotal Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getSubtotalField()
	 * @see #getSubtotalRuleType()
	 * @generated
	 */
	EReference getSubtotalRuleType_SubtotalField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getGroupByFieldNumber <em>Group By Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group By Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getGroupByFieldNumber()
	 * @see #getSubtotalRuleType()
	 * @generated
	 */
	EAttribute getSubtotalRuleType_GroupByFieldNumber();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType
	 * @generated
	 */
	EClass getTableCellType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getContentValidationName <em>Content Validation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Validation Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getContentValidationName()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_ContentValidationName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getCurrency()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getDateValue()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getFormula()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_NumberColumnsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned <em>Number Columns Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_NumberColumnsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Columns Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixColumnsSpanned()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_NumberMatrixColumnsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Rows Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixRowsSpanned()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_NumberMatrixRowsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned <em>Number Rows Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Rows Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_NumberRowsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect <em>Protect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_Protect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStringValue()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStyleName()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getTimeValue()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType()
	 * @see #getTableCellType()
	 * @generated
	 */
	EAttribute getTableCellType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType <em>Column Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Group Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType
	 * @generated
	 */
	EClass getTableColumnGroupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getGroup()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EAttribute getTableColumnGroupType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumnGroup <em>Table Column Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumnGroup()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumnGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns <em>Table Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableHeaderColumns <em>Table Header Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableHeaderColumns()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableHeaderColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns1 <em>Table Columns1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns1()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumns1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn1 <em>Table Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn1()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumn1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableHeaderColumns1 <em>Table Header Columns1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Columns1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableHeaderColumns1()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableHeaderColumns1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns2 <em>Table Columns2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumns2()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumns2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn2 <em>Table Column2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getTableColumn2()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EReference getTableColumnGroupType_TableColumn2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType#getDisplay()
	 * @see #getTableColumnGroupType()
	 * @generated
	 */
	EAttribute getTableColumnGroupType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType <em>Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType
	 * @generated
	 */
	EClass getTableColumnsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType#getTableColumn()
	 * @see #getTableColumnsType()
	 * @generated
	 */
	EReference getTableColumnsType_TableColumn();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType
	 * @generated
	 */
	EClass getTableColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getDefaultCellStyleName <em>Default Cell Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cell Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getDefaultCellStyleName()
	 * @see #getTableColumnType()
	 * @generated
	 */
	EAttribute getTableColumnType_DefaultCellStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated()
	 * @see #getTableColumnType()
	 * @generated
	 */
	EAttribute getTableColumnType_NumberColumnsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getStyleName()
	 * @see #getTableColumnType()
	 * @generated
	 */
	EAttribute getTableColumnType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility()
	 * @see #getTableColumnType()
	 * @generated
	 */
	EAttribute getTableColumnType_Visibility();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType <em>Header Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Columns Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType
	 * @generated
	 */
	EClass getTableHeaderColumnsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType#getTableColumn()
	 * @see #getTableHeaderColumnsType()
	 * @generated
	 */
	EReference getTableHeaderColumnsType_TableColumn();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType <em>Header Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Rows Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType
	 * @generated
	 */
	EClass getTableHeaderRowsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getGroup()
	 * @see #getTableHeaderRowsType()
	 * @generated
	 */
	EAttribute getTableHeaderRowsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getSoftPageBreak()
	 * @see #getTableHeaderRowsType()
	 * @generated
	 */
	EReference getTableHeaderRowsType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType#getTableRow()
	 * @see #getTableHeaderRowsType()
	 * @generated
	 */
	EReference getTableHeaderRowsType_TableRow();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType <em>Row Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Group Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType
	 * @generated
	 */
	EClass getTableRowGroupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getGroup()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EAttribute getTableRowGroupType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRowGroup <em>Table Row Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRowGroup()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRowGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableHeaderRows <em>Table Header Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableHeaderRows()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableHeaderRows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows1 <em>Table Rows1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows1()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRows1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak1 <em>Soft Page Break1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak1()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_SoftPageBreak1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow1 <em>Table Row1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow1()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRow1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableHeaderRows1 <em>Table Header Rows1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Rows1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableHeaderRows1()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableHeaderRows1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows2 <em>Table Rows2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRows2()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRows2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak2 <em>Soft Page Break2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getSoftPageBreak2()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_SoftPageBreak2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow2 <em>Table Row2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getTableRow2()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EReference getTableRowGroupType_TableRow2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType#getDisplay()
	 * @see #getTableRowGroupType()
	 * @generated
	 */
	EAttribute getTableRowGroupType_Display();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType <em>Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rows Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType
	 * @generated
	 */
	EClass getTableRowsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getGroup()
	 * @see #getTableRowsType()
	 * @generated
	 */
	EAttribute getTableRowsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getSoftPageBreak()
	 * @see #getTableRowsType()
	 * @generated
	 */
	EReference getTableRowsType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType#getTableRow()
	 * @see #getTableRowsType()
	 * @generated
	 */
	EReference getTableRowsType_TableRow();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType
	 * @generated
	 */
	EClass getTableRowType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getGroup()
	 * @see #getTableRowType()
	 * @generated
	 */
	EAttribute getTableRowType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getTableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getTableCell()
	 * @see #getTableRowType()
	 * @generated
	 */
	EReference getTableRowType_TableCell();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getCoveredTableCell <em>Covered Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Covered Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getCoveredTableCell()
	 * @see #getTableRowType()
	 * @generated
	 */
	EReference getTableRowType_CoveredTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getDefaultCellStyleName <em>Default Cell Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cell Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getDefaultCellStyleName()
	 * @see #getTableRowType()
	 * @generated
	 */
	EAttribute getTableRowType_DefaultCellStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated <em>Number Rows Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Rows Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated()
	 * @see #getTableRowType()
	 * @generated
	 */
	EAttribute getTableRowType_NumberRowsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getStyleName()
	 * @see #getTableRowType()
	 * @generated
	 */
	EAttribute getTableRowType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility()
	 * @see #getTableRowType()
	 * @generated
	 */
	EAttribute getTableRowType_Visibility();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType
	 * @generated
	 */
	EClass getTableSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterName()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterOptions <em>Filter Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Options</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterOptions()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_FilterOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getHref()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getRefreshDelay <em>Refresh Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getRefreshDelay()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_RefreshDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getTableName()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType()
	 * @see #getTableSourceType()
	 * @generated
	 */
	EAttribute getTableSourceType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableSource <em>Table Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableSource()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getDdeSource <em>Dde Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getDdeSource()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_DdeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getScenario()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getForms()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Forms();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shapes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getShapes()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Shapes();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumnGroup <em>Table Column Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumnGroup()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumnGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns <em>Table Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns <em>Table Header Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableHeaderColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns1 <em>Table Columns1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumns1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn1 <em>Table Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumn1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns1 <em>Table Header Columns1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Columns1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableHeaderColumns1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns2 <em>Table Columns2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Columns2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns2()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumns2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn2 <em>Table Column2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn2()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableColumn2();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup1()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRowGroup <em>Table Row Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRowGroup()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRowGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows <em>Table Header Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableHeaderRows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows1 <em>Table Rows1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRows1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak1 <em>Soft Page Break1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_SoftPageBreak1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow1 <em>Table Row1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRow1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows1 <em>Table Header Rows1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Header Rows1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows1()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableHeaderRows1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows2 <em>Table Rows2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows2()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRows2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak2 <em>Soft Page Break2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak2()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_SoftPageBreak2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow2 <em>Table Row2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Row2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow2()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_TableRow2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable <em>Is Sub Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sub Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_IsSubTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getName()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Print();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrintRanges <em>Print Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrintRanges()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_PrintRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Protected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtectionKey <em>Protection Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Key</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtectionKey()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_ProtectionKey();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getStyleName()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_StyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCalculationSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress <em>Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CellAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentChange <em>Cell Content Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Content Change</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentChange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CellContentChange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentDeletion <em>Cell Content Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Content Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentDeletion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CellContentDeletion();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeSource <em>Cell Range Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Range Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CellRangeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeDeletion <em>Change Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeDeletion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeDeletion();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeTrackTableCell <em>Change Track Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Track Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeTrackTableCell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeTrackTableCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConsolidation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidation <em>Content Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContentValidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCoveredTableCell <em>Covered Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Covered Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCoveredTableCell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CoveredTableCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCutOffs <em>Cut Offs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cut Offs</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCutOffs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CutOffs();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRange <em>Database Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceQuery <em>Database Source Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Query</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseSourceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceSql <em>Database Source Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Sql</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceSql()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseSourceSql();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceTable <em>Database Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Source Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseSourceTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Display Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotDisplayInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotDisplayInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotField <em>Data Pilot Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotField();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Field Reference</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotFieldReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotFieldReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroup <em>Data Pilot Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroupMember <em>Data Pilot Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Group Member</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroupMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotGroupMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroups <em>Data Pilot Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Groups</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroups()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotGroups();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Layout Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLayoutInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotLayoutInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLevel <em>Data Pilot Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Level</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotLevel();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMember <em>Data Pilot Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Member</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMembers <em>Data Pilot Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Members</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMembers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotMembers();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Sort Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSortInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotSortInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Subtotal</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotSubtotal();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Subtotals</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotals()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotSubtotals();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTable <em>Data Pilot Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTables()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLink <em>Dde Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Link</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DdeLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLinks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DdeLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Deletion();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Deletions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependencies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dependency();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDetective <em>Detective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detective</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDetective()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Detective();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMacro <em>Error Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Macro</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMacro()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorMacro();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Message</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenColumns <em>Even Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Even Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EvenColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenRows <em>Even Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Even Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EvenRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterAnd <em>Filter And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter And</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterAnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterAnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOr <em>Filter Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Or</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterOr();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstColumn <em>First Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FirstColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstRow <em>First Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FirstRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHelpMessage <em>Help Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Help Message</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHelpMessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HelpMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHighlightedRange <em>Highlighted Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Highlighted Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHighlightedRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HighlightedRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertion <em>Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Insertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertionCutOff <em>Insertion Cut Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion Cut Off</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertionCutOff()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InsertionCutOff();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iteration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIteration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Iteration();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRange <em>Label Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LabelRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LabelRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumn <em>Last Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LastColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRow <em>Last Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LastRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Movement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Movement();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovementCutOff <em>Movement Cut Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Movement Cut Off</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovementCutOff()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MovementCutOff();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpression <em>Named Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expression</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpressions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedRange <em>Named Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamedRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullDate <em>Null Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NullDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddColumns <em>Odd Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odd Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OddColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddRows <em>Odd Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odd Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OddRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrevious()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenario()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shapes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShapes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Shapes();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSort()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sort();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SortBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortGroups <em>Sort Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort Groups</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortGroups()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SortGroups();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRange <em>Source Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceCellRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceRangeAddress <em>Source Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceRangeAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceService <em>Source Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Service</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceService();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalField <em>Subtotal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtotal Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubtotalField();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRule <em>Subtotal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtotal Rule</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubtotalRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRules <em>Subtotal Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtotal Rules</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRules()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubtotalRules();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableCell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumnGroup <em>Table Column Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Column Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumnGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableColumnGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumns <em>Table Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderColumns <em>Table Header Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Header Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableHeaderColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderRows <em>Table Header Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Header Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableHeaderRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRowGroup <em>Table Row Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Row Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRowGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableRowGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableSource <em>Table Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableTemplate <em>Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Template</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress <em>Target Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TargetRangeAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackedChanges <em>Tracked Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tracked Changes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackedChanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrackedChanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState <em>Acceptance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AcceptanceState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines <em>Add Empty Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Empty Lines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AddEmptyLines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell <em>Allow Empty Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AllowEmptyCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getApplicationData <em>Application Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getApplicationData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplicationData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels <em>Automatic Find Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Find Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutomaticFindLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBaseCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BaseCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent <em>Bind Styles To Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Styles To Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BindStylesToContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel <em>Border Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Model</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderModel();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buttons</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getButtons()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Buttons();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress1 <em>Cell Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Address1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CellAddress1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRange <em>Cell Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CellRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeAddress <em>Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource <em>Condition Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConditionSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Source Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSourceRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConditionSourceRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError <em>Contains Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Error</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContainsError();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader <em>Contains Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContainsHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidationName <em>Content Validation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Validation Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidationName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContentValidationName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack <em>Copy Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Back</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CopyBack();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas <em>Copy Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Formulas</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CopyFormulas();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles <em>Copy Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CopyStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseTableName <em>Database Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseTableName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DatabaseTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataCellRangeAddress <em>Data Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataCellRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataCellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateEnd <em>Date End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateStart <em>Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateStart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDefaultCellStyleName <em>Default Cell Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cell Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDefaultCellStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DefaultCellStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder <em>Display Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates <em>Display Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Duplicates</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons <em>Display Filter Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Filter Buttons</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayFilterButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList <em>Display List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayList();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode <em>Display Member Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Member Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayMemberMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drill Down On Double Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DrillDownOnDoubleClick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndRow <em>End Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndTable <em>End Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldNumber <em>Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FieldNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FilterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOptions <em>Filter Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Options</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOptions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FilterOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFormula()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFunction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GrandTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupByFieldNumber <em>Group By Field Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group By Field Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupByFieldNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupByFieldNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy <em>Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouped By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData <em>Has Persistent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Persistent Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HasPersistentData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories <em>Identify Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identify Categories</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IdentifyCategories();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Empty Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IgnoreEmptyRows();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIndex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsDataLayoutField <em>Is Data Layout Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Layout Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsDataLayoutField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsDataLayoutField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection <em>Is Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selection</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable <em>Is Sub Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sub Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsSubTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelCellRangeAddress <em>Label Cell Range Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Cell Range Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelCellRangeAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LabelCellRangeAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumnSpanned <em>Last Column Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Column Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumnSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastColumnSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRowSpanned <em>Last Row Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Row Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRowSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastRowSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode <em>Layout Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayoutMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData <em>Link To Source Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link To Source Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkToSourceData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid <em>Marked Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marked Invalid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarkedInvalid();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered <em>Matrix Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrix Covered</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MatrixCovered();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberCount <em>Member Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MemberCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MemberName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MemberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Deletion Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMultiDeletionSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MultiDeletionSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullYear <em>Null Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NullYear();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsRepeated <em>Number Columns Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsRepeated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberColumnsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsSpanned <em>Number Columns Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Columns Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberColumnsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Columns Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixColumnsSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberMatrixColumnsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matrix Rows Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixRowsSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberMatrixRowsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsRepeated <em>Number Rows Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Rows Repeated</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsRepeated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberRowsRepeated();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsSpanned <em>Number Rows Spanned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Rows Spanned</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsSpanned()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberRowsSpanned();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getObjectName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize <em>On Update Keep Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Keep Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OnUpdateKeepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Keep Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OnUpdateKeepStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Breaks On Group Change</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageBreaksOnGroupChange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement <em>Parse Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse Sql Statement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ParseSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPassword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown <em>Precision As Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision As Shown</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrecisionAsShown();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Print();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrintRanges <em>Print Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrintRanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect <em>Protect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Protect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Protected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getQueryName <em>Query Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getQueryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_QueryName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRangeUsableAs <em>Range Usable As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Usable As</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRangeUsableAs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RangeUsableAs();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRejectingChangeId <em>Rejecting Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejecting Change Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRejectingChangeId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RejectingChangeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenarioRanges <em>Scenario Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenarioRanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScenarioRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Criteria Must Apply To Whole Cell</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSelectedPage <em>Selected Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSelectedPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelectedPage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails <em>Show Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Details</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowDetails();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty <em>Show Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Empty</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowEmpty();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton <em>Show Filter Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Filter Button</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowFilterButton();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode <em>Sort Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SortMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cell Range Addresses</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRangeAddresses()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceCellRangeAddresses();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceFieldName <em>Source Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Field Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceFieldName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSqlStatement <em>Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Statement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSqlStatement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartRow <em>Start Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartTable <em>Start Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected <em>Structure Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StructureProtected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable1 <em>Table1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Table1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetCellAddress <em>Target Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetCellAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress1 <em>Target Range Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range Address1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetRangeAddress1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges <em>Track Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Changes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TrackChanges();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUsedHierarchy <em>Used Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Hierarchy</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUsedHierarchy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UsedHierarchy();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels <em>Use Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Labels</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions <em>Use Regular Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Regular Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseRegularExpressions();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUserName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Visibility();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType
	 * @generated
	 */
	EClass getTableTemplateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRow <em>First Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRow()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_FirstRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRow <em>Last Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRow()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_LastRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstColumn <em>First Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_FirstColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastColumn <em>Last Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_LastColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getBody()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenRows <em>Even Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Even Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenRows()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_EvenRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddRows <em>Odd Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odd Rows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddRows()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_OddRows();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenColumns <em>Even Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Even Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenColumns()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_EvenColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddColumns <em>Odd Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odd Columns</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddColumns()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EReference getTableTemplateType_OddColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn <em>First Row End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Row End Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EAttribute getTableTemplateType_FirstRowEndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn <em>First Row Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Row Start Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EAttribute getTableTemplateType_FirstRowStartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn <em>Last Row End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Row End Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EAttribute getTableTemplateType_LastRowEndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn <em>Last Row Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Row Start Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EAttribute getTableTemplateType_LastRowStartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getName()
	 * @see #getTableTemplateType()
	 * @generated
	 */
	EAttribute getTableTemplateType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType <em>Target Range Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Range Address Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType
	 * @generated
	 */
	EClass getTargetRangeAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getColumn()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndColumn()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_EndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndRow <em>End Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndRow()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_EndRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndTable <em>End Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndTable()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_EndTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getRow()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartColumn()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartRow <em>Start Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Row</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartRow()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_StartRow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartTable <em>Start Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartTable()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_StartTable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getTable()
	 * @see #getTargetRangeAddressType()
	 * @generated
	 */
	EAttribute getTargetRangeAddressType_Table();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType <em>Tracked Changes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracked Changes Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType
	 * @generated
	 */
	EClass getTrackedChangesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getGroup()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EAttribute getTrackedChangesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getCellContentChange <em>Cell Content Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Content Change</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getCellContentChange()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EReference getTrackedChangesType_CellContentChange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getInsertion <em>Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insertion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getInsertion()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EReference getTrackedChangesType_Insertion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getDeletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deletion</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getDeletion()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EReference getTrackedChangesType_Deletion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getMovement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getMovement()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EReference getTrackedChangesType_Movement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges <em>Track Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Changes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges()
	 * @see #getTrackedChangesType()
	 * @generated
	 */
	EAttribute getTrackedChangesType_TrackChanges();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType <em>Acceptance State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acceptance State Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @generated
	 */
	EEnum getAcceptanceStateType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType <em>Border Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Model Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @generated
	 */
	EEnum getBorderModelType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType <em>Condition Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @generated
	 */
	EEnum getConditionSourceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1 <em>Data Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @generated
	 */
	EEnum getDataTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1 <em>Data Type Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1
	 * @generated
	 */
	EEnum getDataTypeTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2 <em>Data Type Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2
	 * @generated
	 */
	EEnum getDataTypeTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3 <em>Data Type Type Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Type Member3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3
	 * @generated
	 */
	EEnum getDataTypeTypeMember3();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1 <em>Date End Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date End Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1
	 * @generated
	 */
	EEnum getDateEndTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1 <em>Date Start Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Start Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1
	 * @generated
	 */
	EEnum getDateStartTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType <em>Display List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display List Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @generated
	 */
	EEnum getDisplayListType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType <em>Display Member Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Member Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @generated
	 */
	EEnum getDisplayMemberModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1 <em>End Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1
	 * @generated
	 */
	EEnum getEndTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1 <em>Function Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1
	 * @generated
	 */
	EEnum getFunctionTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10 <em>Function Type Member10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member10</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10
	 * @generated
	 */
	EEnum getFunctionTypeMember10();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11 <em>Function Type Member11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member11</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11
	 * @generated
	 */
	EEnum getFunctionTypeMember11();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12 <em>Function Type Member12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member12</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12
	 * @generated
	 */
	EEnum getFunctionTypeMember12();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2 <em>Function Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2
	 * @generated
	 */
	EEnum getFunctionTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3 <em>Function Type Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3
	 * @generated
	 */
	EEnum getFunctionTypeMember3();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4 <em>Function Type Member4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member4</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4
	 * @generated
	 */
	EEnum getFunctionTypeMember4();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5 <em>Function Type Member5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member5</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5
	 * @generated
	 */
	EEnum getFunctionTypeMember5();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6 <em>Function Type Member6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member6</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6
	 * @generated
	 */
	EEnum getFunctionTypeMember6();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7 <em>Function Type Member7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member7</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7
	 * @generated
	 */
	EEnum getFunctionTypeMember7();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8 <em>Function Type Member8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member8</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8
	 * @generated
	 */
	EEnum getFunctionTypeMember8();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9 <em>Function Type Member9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Member9</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9
	 * @generated
	 */
	EEnum getFunctionTypeMember9();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType <em>Grand Total Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grand Total Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @generated
	 */
	EEnum getGrandTotalType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType <em>Grouped By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grouped By Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @generated
	 */
	EEnum getGroupedByType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType <em>Layout Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @generated
	 */
	EEnum getLayoutModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType <em>Member Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Member Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @generated
	 */
	EEnum getMemberTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType <em>Message Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @generated
	 */
	EEnum getMessageTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @generated
	 */
	EEnum getNameType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @generated
	 */
	EEnum getOrientationType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1 <em>Orientation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @generated
	 */
	EEnum getOrientationType1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0 <em>Range Usable As Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Usable As Type Member0</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0
	 * @generated
	 */
	EEnum getRangeUsableAsTypeMember0();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem <em>Range Usable As Type Member1 Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Usable As Type Member1 Base Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem
	 * @generated
	 */
	EEnum getRangeUsableAsTypeMember1BaseItem();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType <em>Sort Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @generated
	 */
	EEnum getSortModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1 <em>Start Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Start Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1
	 * @generated
	 */
	EEnum getStartTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType <em>Use Labels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use Labels Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @generated
	 */
	EEnum getUseLabelsType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType <em>Acceptance State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Acceptance State Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType"
	 *        extendedMetaData="name='acceptance-state_._type:Object' baseType='acceptance-state_._type'"
	 * @generated
	 */
	EDataType getAcceptanceStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType <em>Border Model Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Border Model Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType"
	 *        extendedMetaData="name='border-model_._type:Object' baseType='border-model_._type'"
	 * @generated
	 */
	EDataType getBorderModelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType <em>Condition Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Source Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType"
	 *        extendedMetaData="name='condition-source_._type:Object' baseType='condition-source_._type'"
	 * @generated
	 */
	EDataType getConditionSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='data-type_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string data-type_._type_._member_._1 data-type_._type_._member_._2 data-type_._type_._member_._3'"
	 * @generated
	 */
	EDataType getDataTypeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1 <em>Data Type Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember1"
	 *        extendedMetaData="name='data-type_._type_._member_._1:Object' baseType='data-type_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDataTypeTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2 <em>Data Type Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember2"
	 *        extendedMetaData="name='data-type_._type_._member_._2:Object' baseType='data-type_._type_._member_._2'"
	 * @generated
	 */
	EDataType getDataTypeTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3 <em>Data Type Type Member3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Type Member3 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeTypeMember3"
	 *        extendedMetaData="name='data-type_._type_._member_._3:Object' baseType='data-type_._type_._member_._3'"
	 * @generated
	 */
	EDataType getDataTypeTypeMember3Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1 <em>Data Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1"
	 *        extendedMetaData="name='data-type_._1_._type:Object' baseType='data-type_._1_._type'"
	 * @generated
	 */
	EDataType getDataTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date End Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='date-end_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#dateOrDateTime date-end_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDateEndType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1 <em>Date End Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date End Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DateEndTypeMember1"
	 *        extendedMetaData="name='date-end_._type_._member_._1:Object' baseType='date-end_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDateEndTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Start Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='date-start_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#dateOrDateTime date-start_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDateStartType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1 <em>Date Start Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Start Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DateStartTypeMember1"
	 *        extendedMetaData="name='date-start_._type_._member_._1:Object' baseType='date-start_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDateStartTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Default Cell Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Cell Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='default-cell-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef default-cell-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getDefaultCellStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Default Cell Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Cell Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='default-cell-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getDefaultCellStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType <em>Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType"
	 *        extendedMetaData="name='direction_._type:Object' baseType='direction_._type'"
	 * @generated
	 */
	EDataType getDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType <em>Display List Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display List Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType"
	 *        extendedMetaData="name='display-list_._type:Object' baseType='display-list_._type'"
	 * @generated
	 */
	EDataType getDisplayListTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType <em>Display Member Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Member Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType"
	 *        extendedMetaData="name='display-member-mode_._type:Object' baseType='display-member-mode_._type'"
	 * @generated
	 */
	EDataType getDisplayMemberModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>End Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='end_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double end_._type_._member_._1'"
	 * @generated
	 */
	EDataType getEndType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1 <em>End Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>End Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.EndTypeMember1"
	 *        extendedMetaData="name='end_._type_._member_._1:Object' baseType='end_._type_._member_._1'"
	 * @generated
	 */
	EDataType getEndTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='function_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string function_._type_._member_._1 function_._type_._member_._2 function_._type_._member_._3 function_._type_._member_._4 function_._type_._member_._5 function_._type_._member_._6 function_._type_._member_._7 function_._type_._member_._8 function_._type_._member_._9 function_._type_._member_._10 function_._type_._member_._11 function_._type_._member_._12'"
	 * @generated
	 */
	EDataType getFunctionType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10 <em>Function Type Member10 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member10 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember10"
	 *        extendedMetaData="name='function_._type_._member_._10:Object' baseType='function_._type_._member_._10'"
	 * @generated
	 */
	EDataType getFunctionTypeMember10Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11 <em>Function Type Member11 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member11 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember11"
	 *        extendedMetaData="name='function_._type_._member_._11:Object' baseType='function_._type_._member_._11'"
	 * @generated
	 */
	EDataType getFunctionTypeMember11Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12 <em>Function Type Member12 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member12 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember12"
	 *        extendedMetaData="name='function_._type_._member_._12:Object' baseType='function_._type_._member_._12'"
	 * @generated
	 */
	EDataType getFunctionTypeMember12Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1 <em>Function Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember1"
	 *        extendedMetaData="name='function_._type_._member_._1:Object' baseType='function_._type_._member_._1'"
	 * @generated
	 */
	EDataType getFunctionTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2 <em>Function Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember2"
	 *        extendedMetaData="name='function_._type_._member_._2:Object' baseType='function_._type_._member_._2'"
	 * @generated
	 */
	EDataType getFunctionTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3 <em>Function Type Member3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member3 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember3"
	 *        extendedMetaData="name='function_._type_._member_._3:Object' baseType='function_._type_._member_._3'"
	 * @generated
	 */
	EDataType getFunctionTypeMember3Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4 <em>Function Type Member4 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member4 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember4"
	 *        extendedMetaData="name='function_._type_._member_._4:Object' baseType='function_._type_._member_._4'"
	 * @generated
	 */
	EDataType getFunctionTypeMember4Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5 <em>Function Type Member5 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member5 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember5"
	 *        extendedMetaData="name='function_._type_._member_._5:Object' baseType='function_._type_._member_._5'"
	 * @generated
	 */
	EDataType getFunctionTypeMember5Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6 <em>Function Type Member6 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member6 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember6"
	 *        extendedMetaData="name='function_._type_._member_._6:Object' baseType='function_._type_._member_._6'"
	 * @generated
	 */
	EDataType getFunctionTypeMember6Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7 <em>Function Type Member7 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member7 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember7"
	 *        extendedMetaData="name='function_._type_._member_._7:Object' baseType='function_._type_._member_._7'"
	 * @generated
	 */
	EDataType getFunctionTypeMember7Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8 <em>Function Type Member8 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member8 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember8"
	 *        extendedMetaData="name='function_._type_._member_._8:Object' baseType='function_._type_._member_._8'"
	 * @generated
	 */
	EDataType getFunctionTypeMember8Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9 <em>Function Type Member9 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Member9 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionTypeMember9"
	 *        extendedMetaData="name='function_._type_._member_._9:Object' baseType='function_._type_._member_._9'"
	 * @generated
	 */
	EDataType getFunctionTypeMember9Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType <em>Grand Total Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grand Total Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType"
	 *        extendedMetaData="name='grand-total_._type:Object' baseType='grand-total_._type'"
	 * @generated
	 */
	EDataType getGrandTotalTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType <em>Grouped By Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grouped By Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType"
	 *        extendedMetaData="name='grouped-by_._type:Object' baseType='grouped-by_._type'"
	 * @generated
	 */
	EDataType getGroupedByTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType <em>Layout Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Layout Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType"
	 *        extendedMetaData="name='layout-mode_._type:Object' baseType='layout-mode_._type'"
	 * @generated
	 */
	EDataType getLayoutModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType <em>Member Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Member Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType"
	 *        extendedMetaData="name='member-type_._type:Object' baseType='member-type_._type'"
	 * @generated
	 */
	EDataType getMemberTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType <em>Message Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType"
	 *        extendedMetaData="name='message-type_._type:Object' baseType='message-type_._type'"
	 * @generated
	 */
	EDataType getMessageTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ModeType <em>Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.ModeType"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NameType <em>Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.NameType"
	 *        extendedMetaData="name='name_._type:Object' baseType='name_._type'"
	 * @generated
	 */
	EDataType getNameTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrderType <em>Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Order Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.OrderType"
	 *        extendedMetaData="name='order_._type:Object' baseType='order_._type'"
	 * @generated
	 */
	EDataType getOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType <em>Orientation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orientation Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType"
	 *        extendedMetaData="name='orientation_._type:Object' baseType='orientation_._type'"
	 * @generated
	 */
	EDataType getOrientationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1 <em>Orientation Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orientation Type Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1"
	 *        extendedMetaData="name='orientation_._1_._type:Object' baseType='orientation_._1_._type'"
	 * @generated
	 */
	EDataType getOrientationTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Range Usable As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Usable As Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='range-usable-as_._type' memberTypes='range-usable-as_._type_._member_._0 range-usable-as_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRangeUsableAsType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0 <em>Range Usable As Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Usable As Type Member0 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember0"
	 *        extendedMetaData="name='range-usable-as_._type_._member_._0:Object' baseType='range-usable-as_._type_._member_._0'"
	 * @generated
	 */
	EDataType getRangeUsableAsTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Range Usable As Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Usable As Type Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='range-usable-as_._type_._member_._1' minLength='1'"
	 * @generated
	 */
	EDataType getRangeUsableAsTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Range Usable As Type Member1 Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Usable As Type Member1 Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='range-usable-as_._type_._member_._1_._base' itemType='range-usable-as_._type_._member_._1_._base_._item'"
	 * @generated
	 */
	EDataType getRangeUsableAsTypeMember1Base();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem <em>Range Usable As Type Member1 Base Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Usable As Type Member1 Base Item Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsTypeMember1BaseItem"
	 *        extendedMetaData="name='range-usable-as_._type_._member_._1_._base_._item:Object' baseType='range-usable-as_._type_._member_._1_._base_._item'"
	 * @generated
	 */
	EDataType getRangeUsableAsTypeMember1BaseItemObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType <em>Sort Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType"
	 *        extendedMetaData="name='sort-mode_._type:Object' baseType='sort-mode_._type'"
	 * @generated
	 */
	EDataType getSortModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Start Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='start_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#double start_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStartType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1 <em>Start Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Start Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.StartTypeMember1"
	 *        extendedMetaData="name='start_._type_._member_._1:Object' baseType='start_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStartTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.StatusType <em>Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.StatusType"
	 *        extendedMetaData="name='status_._type:Object' baseType='status_._type'"
	 * @generated
	 */
	EDataType getStatusTypeObject();

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
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType <em>Use Labels Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Use Labels Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType"
	 *        extendedMetaData="name='use-labels_._type:Object' baseType='use-labels_._type'"
	 * @generated
	 */
	EDataType getUseLabelsTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableFactory getTableFactory();

} //TablePackage
