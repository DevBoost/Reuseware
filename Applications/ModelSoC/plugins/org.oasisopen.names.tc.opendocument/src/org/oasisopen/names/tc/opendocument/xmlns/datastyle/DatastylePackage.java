/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastyleFactory
 * @model kind="package"
 * @generated
 */
public interface DatastylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datastyle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfdatastyle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatastylePackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.AmPmTypeImpl <em>Am Pm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.AmPmTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getAmPmType()
	 * @generated
	 */
	int AM_PM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Am Pm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AM_PM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl <em>Boolean Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getBooleanStyleType()
	 * @generated
	 */
	int BOOLEAN_STYLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TEXT1 = 3;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__MAP = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__COUNTRY = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT = 10;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE = 12;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE__VOLATILE = 13;

	/**
	 * The number of structural features of the '<em>Boolean Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_STYLE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl <em>Currency Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCurrencyStyleType()
	 * @generated
	 */
	int CURRENCY_STYLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT1 = 3;

	/**
	 * The feature id for the '<em><b>Currency Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL = 4;

	/**
	 * The feature id for the '<em><b>Text2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT2 = 5;

	/**
	 * The feature id for the '<em><b>Currency Symbol1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1 = 6;

	/**
	 * The feature id for the '<em><b>Text3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT3 = 7;

	/**
	 * The feature id for the '<em><b>Number1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__NUMBER1 = 8;

	/**
	 * The feature id for the '<em><b>Text4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TEXT4 = 9;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__MAP = 10;

	/**
	 * The feature id for the '<em><b>Automatic Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER = 11;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__COUNTRY = 12;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__LANGUAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__NAME = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TITLE = 15;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY = 16;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT = 17;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 18;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE = 19;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE__VOLATILE = 20;

	/**
	 * The number of structural features of the '<em>Currency Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_STYLE_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencySymbolTypeImpl <em>Currency Symbol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencySymbolTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCurrencySymbolType()
	 * @generated
	 */
	int CURRENCY_SYMBOL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SYMBOL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SYMBOL_TYPE__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SYMBOL_TYPE__LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Currency Symbol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SYMBOL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl <em>Date Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDateStyleType()
	 * @generated
	 */
	int DATE_STYLE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__DAY = 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__MONTH = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__YEAR = 5;

	/**
	 * The feature id for the '<em><b>Era</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__ERA = 6;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__DAY_OF_WEEK = 7;

	/**
	 * The feature id for the '<em><b>Week Of Year</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__WEEK_OF_YEAR = 8;

	/**
	 * The feature id for the '<em><b>Quarter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__QUARTER = 9;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__HOURS = 10;

	/**
	 * The feature id for the '<em><b>Am Pm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__AM_PM = 11;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__MINUTES = 12;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__SECONDS = 13;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TEXT1 = 14;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__MAP = 15;

	/**
	 * The feature id for the '<em><b>Automatic Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__AUTOMATIC_ORDER = 16;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__COUNTRY = 17;

	/**
	 * The feature id for the '<em><b>Format Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__FORMAT_SOURCE = 18;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TITLE = 21;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY = 22;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TRANSLITERATION_FORMAT = 23;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 24;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__TRANSLITERATION_STYLE = 25;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE__VOLATILE = 26;

	/**
	 * The number of structural features of the '<em>Date Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_STYLE_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl <em>Day Of Week Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDayOfWeekType()
	 * @generated
	 */
	int DAY_OF_WEEK_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Day Of Week Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayTypeImpl <em>Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EmbeddedTextTypeImpl <em>Embedded Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EmbeddedTextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getEmbeddedTextType()
	 * @generated
	 */
	int EMBEDDED_TEXT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_TEXT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_TEXT_TYPE__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Embedded Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_TEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EraTypeImpl <em>Era Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EraTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getEraType()
	 * @generated
	 */
	int ERA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERA_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERA_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Era Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl <em>Fraction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFractionType()
	 * @generated
	 */
	int FRACTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Denominator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE__DENOMINATOR_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE__GROUPING = 1;

	/**
	 * The feature id for the '<em><b>Min Denominator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE__MIN_DENOMINATOR_DIGITS = 2;

	/**
	 * The feature id for the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE__MIN_INTEGER_DIGITS = 3;

	/**
	 * The feature id for the '<em><b>Min Numerator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE__MIN_NUMERATOR_DIGITS = 4;

	/**
	 * The number of structural features of the '<em>Fraction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.HoursTypeImpl <em>Hours Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.HoursTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getHoursType()
	 * @generated
	 */
	int HOURS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURS_TYPE__STYLE = 0;

	/**
	 * The number of structural features of the '<em>Hours Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MinutesTypeImpl <em>Minutes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MinutesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getMinutesType()
	 * @generated
	 */
	int MINUTES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUTES_TYPE__STYLE = 0;

	/**
	 * The number of structural features of the '<em>Minutes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUTES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MonthTypeImpl <em>Month Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MonthTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getMonthType()
	 * @generated
	 */
	int MONTH_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Possessive Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_TYPE__POSSESSIVE_FORM = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_TYPE__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Textual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_TYPE__TEXTUAL = 3;

	/**
	 * The number of structural features of the '<em>Month Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberStyleTypeImpl <em>Number Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getNumberStyleType()
	 * @generated
	 */
	int NUMBER_STYLE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Any Number Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__ANY_NUMBER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Any Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__ANY_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TEXT1 = 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__MAP = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TRANSLITERATION_COUNTRY = 10;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TRANSLITERATION_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 12;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__TRANSLITERATION_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE__VOLATILE = 14;

	/**
	 * The number of structural features of the '<em>Number Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_STYLE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl <em>Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getNumberType()
	 * @generated
	 */
	int NUMBER_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Embedded Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__EMBEDDED_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__DECIMAL_PLACES = 1;

	/**
	 * The feature id for the '<em><b>Decimal Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__DECIMAL_REPLACEMENT = 2;

	/**
	 * The feature id for the '<em><b>Display Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__DISPLAY_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__GROUPING = 4;

	/**
	 * The feature id for the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MIN_INTEGER_DIGITS = 5;

	/**
	 * The number of structural features of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.PercentageStyleTypeImpl <em>Percentage Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.PercentageStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getPercentageStyleType()
	 * @generated
	 */
	int PERCENTAGE_STYLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TEXT1 = 3;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__MAP = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__COUNTRY = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TRANSLITERATION_COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TRANSLITERATION_FORMAT = 10;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__TRANSLITERATION_STYLE = 12;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE__VOLATILE = 13;

	/**
	 * The number of structural features of the '<em>Percentage Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_STYLE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.QuarterTypeImpl <em>Quarter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.QuarterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getQuarterType()
	 * @generated
	 */
	int QUARTER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTER_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTER_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Quarter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl <em>Scientific Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getScientificNumberType()
	 * @generated
	 */
	int SCIENTIFIC_NUMBER_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES = 0;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCIENTIFIC_NUMBER_TYPE__GROUPING = 1;

	/**
	 * The feature id for the '<em><b>Min Exponent Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS = 2;

	/**
	 * The feature id for the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS = 3;

	/**
	 * The number of structural features of the '<em>Scientific Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCIENTIFIC_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl <em>Seconds Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getSecondsType()
	 * @generated
	 */
	int SECONDS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDS_TYPE__DECIMAL_PLACES = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDS_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Seconds Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextContentTypeImpl <em>Text Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextContentTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTextContentType()
	 * @generated
	 */
	int TEXT_CONTENT_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Text Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextStyleTypeImpl <em>Text Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTextStyleType()
	 * @generated
	 */
	int TEXT_STYLE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TEXT_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TEXT1 = 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__MAP = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TRANSLITERATION_COUNTRY = 10;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TRANSLITERATION_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 12;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__TRANSLITERATION_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE__VOLATILE = 14;

	/**
	 * The number of structural features of the '<em>Text Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TimeStyleTypeImpl <em>Time Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TimeStyleTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTimeStyleType()
	 * @generated
	 */
	int TIME_STYLE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TEXT_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__HOURS = 3;

	/**
	 * The feature id for the '<em><b>Am Pm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__AM_PM = 4;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__MINUTES = 5;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__SECONDS = 6;

	/**
	 * The feature id for the '<em><b>Text1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TEXT1 = 7;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__MAP = 8;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Format Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__FORMAT_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TITLE = 13;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TRANSLITERATION_COUNTRY = 14;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TRANSLITERATION_FORMAT = 15;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TRANSLITERATION_LANGUAGE = 16;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TRANSLITERATION_STYLE = 17;

	/**
	 * The feature id for the '<em><b>Truncate On Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__TRUNCATE_ON_OVERFLOW = 18;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE__VOLATILE = 19;

	/**
	 * The number of structural features of the '<em>Time Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STYLE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.WeekOfYearTypeImpl <em>Week Of Year Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.WeekOfYearTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getWeekOfYearType()
	 * @generated
	 */
	int WEEK_OF_YEAR_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_OF_YEAR_TYPE__CALENDAR = 0;

	/**
	 * The number of structural features of the '<em>Week Of Year Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_OF_YEAR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.YearTypeImpl <em>Year Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.YearTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getYearType()
	 * @generated
	 */
	int YEAR_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_TYPE__CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_TYPE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Year Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 25;

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
	 * The feature id for the '<em><b>Am Pm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AM_PM = 3;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Boolean Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Currency Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Currency Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_SYMBOL = 7;

	/**
	 * The feature id for the '<em><b>Date Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DAY = 9;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DAY_OF_WEEK = 10;

	/**
	 * The feature id for the '<em><b>Embedded Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMBEDDED_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Era</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERA = 12;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRACTION = 13;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOURS = 14;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MINUTES = 15;

	/**
	 * The feature id for the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MONTH = 16;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Number Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_STYLE = 18;

	/**
	 * The feature id for the '<em><b>Percentage Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERCENTAGE_STYLE = 19;

	/**
	 * The feature id for the '<em><b>Quarter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUARTER = 20;

	/**
	 * The feature id for the '<em><b>Scientific Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCIENTIFIC_NUMBER = 21;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECONDS = 22;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 23;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_CONTENT = 24;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_STYLE = 25;

	/**
	 * The feature id for the '<em><b>Time Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_STYLE = 26;

	/**
	 * The feature id for the '<em><b>Week Of Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEEK_OF_YEAR = 27;

	/**
	 * The feature id for the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__YEAR = 28;

	/**
	 * The feature id for the '<em><b>Automatic Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOMATIC_ORDER = 29;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALENDAR = 30;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 31;

	/**
	 * The feature id for the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL_PLACES = 32;

	/**
	 * The feature id for the '<em><b>Decimal Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL_REPLACEMENT = 33;

	/**
	 * The feature id for the '<em><b>Denominator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DENOMINATOR_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Display Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_FACTOR = 35;

	/**
	 * The feature id for the '<em><b>Format Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAT_SOURCE = 36;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUPING = 37;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 38;

	/**
	 * The feature id for the '<em><b>Min Denominator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS = 39;

	/**
	 * The feature id for the '<em><b>Min Exponent Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_EXPONENT_DIGITS = 40;

	/**
	 * The feature id for the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_INTEGER_DIGITS = 41;

	/**
	 * The feature id for the '<em><b>Min Numerator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS = 42;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSITION = 43;

	/**
	 * The feature id for the '<em><b>Possessive Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSSESSIVE_FORM = 44;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 45;

	/**
	 * The feature id for the '<em><b>Textual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTUAL = 46;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 47;

	/**
	 * The feature id for the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSLITERATION_COUNTRY = 48;

	/**
	 * The feature id for the '<em><b>Transliteration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSLITERATION_FORMAT = 49;

	/**
	 * The feature id for the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE = 50;

	/**
	 * The feature id for the '<em><b>Transliteration Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSLITERATION_STYLE = 51;

	/**
	 * The feature id for the '<em><b>Truncate On Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW = 52;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 53;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1 <em>Calendar Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember1()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER1 = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2 <em>Calendar Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember2()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER2 = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3 <em>Calendar Type Member3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember3()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER3 = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4 <em>Calendar Type Member4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember4()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER4 = 29;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5 <em>Calendar Type Member5</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember5()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER5 = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6 <em>Calendar Type Member6</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember6()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER6 = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7 <em>Calendar Type Member7</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember7()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER7 = 32;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8 <em>Calendar Type Member8</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember8()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER8 = 33;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType <em>Format Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFormatSourceType()
	 * @generated
	 */
	int FORMAT_SOURCE_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType <em>Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType <em>Transliteration Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTransliterationStyleType()
	 * @generated
	 */
	int TRANSLITERATION_STYLE_TYPE = 36;

	/**
	 * The meta object id for the '<em>Calendar Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarType()
	 * @generated
	 */
	int CALENDAR_TYPE = 37;

	/**
	 * The meta object id for the '<em>Calendar Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember1Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER1_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Calendar Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember2Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER2_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Calendar Type Member3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember3Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER3_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Calendar Type Member4 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember4Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER4_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Calendar Type Member5 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember5Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER5_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Calendar Type Member6 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember6Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER6_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Calendar Type Member7 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember7Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER7_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Calendar Type Member8 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember8Object()
	 * @generated
	 */
	int CALENDAR_TYPE_MEMBER8_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Format Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFormatSourceTypeObject()
	 * @generated
	 */
	int FORMAT_SOURCE_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getStyleTypeObject()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Transliteration Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTransliterationStyleTypeObject()
	 * @generated
	 */
	int TRANSLITERATION_STYLE_TYPE_OBJECT = 48;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType <em>Am Pm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Am Pm Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType
	 * @generated
	 */
	EClass getAmPmType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType <em>Boolean Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType
	 * @generated
	 */
	EClass getBooleanStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTextProperties()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EReference getBooleanStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getBoolean()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EReference getBooleanStyleType_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText1()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getMap()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EReference getBooleanStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getCountry()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getLanguage()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getName()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTitle()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationCountry()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationLanguage()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile()
	 * @see #getBooleanStyleType()
	 * @generated
	 */
	EAttribute getBooleanStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType <em>Currency Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType
	 * @generated
	 */
	EClass getCurrencyStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTextProperties()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getNumber()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText1()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCurrencySymbol <em>Currency Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Symbol</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCurrencySymbol()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_CurrencySymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText2 <em>Text2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText2()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Text2();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCurrencySymbol1 <em>Currency Symbol1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Symbol1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCurrencySymbol1()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_CurrencySymbol1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText3 <em>Text3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText3()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Text3();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getNumber1 <em>Number1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getNumber1()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_Number1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText4 <em>Text4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text4</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getText4()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Text4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getMap()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EReference getCurrencyStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getAutomaticOrder <em>Automatic Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getAutomaticOrder()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_AutomaticOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getCountry()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getLanguage()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getName()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTitle()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationCountry()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationFormat()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationLanguage()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getTransliterationStyle()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType#getVolatile()
	 * @see #getCurrencyStyleType()
	 * @generated
	 */
	EAttribute getCurrencyStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType <em>Currency Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Symbol Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType
	 * @generated
	 */
	EClass getCurrencySymbolType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getMixed()
	 * @see #getCurrencySymbolType()
	 * @generated
	 */
	EAttribute getCurrencySymbolType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getCountry()
	 * @see #getCurrencySymbolType()
	 * @generated
	 */
	EAttribute getCurrencySymbolType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType#getLanguage()
	 * @see #getCurrencySymbolType()
	 * @generated
	 */
	EAttribute getCurrencySymbolType_Language();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType <em>Date Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType
	 * @generated
	 */
	EClass getDateStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTextProperties()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Text();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getGroup()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Day</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDay()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Day();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Month</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMonth()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Month();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getYear()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getEra <em>Era</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Era</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getEra()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Era();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Day Of Week</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDayOfWeek()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_DayOfWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getWeekOfYear <em>Week Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Week Of Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getWeekOfYear()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_WeekOfYear();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getQuarter <em>Quarter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quarter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getQuarter()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Quarter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hours</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getHours()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Hours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAmPm <em>Am Pm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Am Pm</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAmPm()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_AmPm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minutes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMinutes()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Minutes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seconds</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getSeconds()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Seconds();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText1()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMap()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EReference getDateStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder <em>Automatic Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_AutomaticOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getCountry()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource <em>Format Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_FormatSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getLanguage()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getName()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTitle()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationCountry()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationLanguage()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile()
	 * @see #getDateStyleType()
	 * @generated
	 */
	EAttribute getDateStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType <em>Day Of Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Of Week Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType
	 * @generated
	 */
	EClass getDayOfWeekType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType#getCalendar()
	 * @see #getDayOfWeekType()
	 * @generated
	 */
	EAttribute getDayOfWeekType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType#getStyle()
	 * @see #getDayOfWeekType()
	 * @generated
	 */
	EAttribute getDayOfWeekType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType
	 * @generated
	 */
	EClass getDayType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType#getCalendar()
	 * @see #getDayType()
	 * @generated
	 */
	EAttribute getDayType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType#getStyle()
	 * @see #getDayType()
	 * @generated
	 */
	EAttribute getDayType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType <em>Embedded Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType
	 * @generated
	 */
	EClass getEmbeddedTextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType#getMixed()
	 * @see #getEmbeddedTextType()
	 * @generated
	 */
	EAttribute getEmbeddedTextType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType#getPosition()
	 * @see #getEmbeddedTextType()
	 * @generated
	 */
	EAttribute getEmbeddedTextType_Position();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType <em>Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Era Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType
	 * @generated
	 */
	EClass getEraType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType#getCalendar()
	 * @see #getEraType()
	 * @generated
	 */
	EAttribute getEraType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType#getStyle()
	 * @see #getEraType()
	 * @generated
	 */
	EAttribute getEraType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType <em>Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fraction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType
	 * @generated
	 */
	EClass getFractionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getDenominatorValue <em>Denominator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getDenominatorValue()
	 * @see #getFractionType()
	 * @generated
	 */
	EAttribute getFractionType_DenominatorValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping()
	 * @see #getFractionType()
	 * @generated
	 */
	EAttribute getFractionType_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinDenominatorDigits <em>Min Denominator Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Denominator Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinDenominatorDigits()
	 * @see #getFractionType()
	 * @generated
	 */
	EAttribute getFractionType_MinDenominatorDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinIntegerDigits <em>Min Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Integer Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinIntegerDigits()
	 * @see #getFractionType()
	 * @generated
	 */
	EAttribute getFractionType_MinIntegerDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinNumeratorDigits <em>Min Numerator Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Numerator Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinNumeratorDigits()
	 * @see #getFractionType()
	 * @generated
	 */
	EAttribute getFractionType_MinNumeratorDigits();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType <em>Hours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hours Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType
	 * @generated
	 */
	EClass getHoursType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType#getStyle()
	 * @see #getHoursType()
	 * @generated
	 */
	EAttribute getHoursType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType <em>Minutes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minutes Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType
	 * @generated
	 */
	EClass getMinutesType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType#getStyle()
	 * @see #getMinutesType()
	 * @generated
	 */
	EAttribute getMinutesType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType <em>Month Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType
	 * @generated
	 */
	EClass getMonthType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getCalendar()
	 * @see #getMonthType()
	 * @generated
	 */
	EAttribute getMonthType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getPossessiveForm <em>Possessive Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possessive Form</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getPossessiveForm()
	 * @see #getMonthType()
	 * @generated
	 */
	EAttribute getMonthType_PossessiveForm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getStyle()
	 * @see #getMonthType()
	 * @generated
	 */
	EAttribute getMonthType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getTextual <em>Textual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textual</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType#getTextual()
	 * @see #getMonthType()
	 * @generated
	 */
	EAttribute getMonthType_Textual();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType <em>Number Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType
	 * @generated
	 */
	EClass getNumberStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTextProperties()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EReference getNumberStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getText()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Text();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getAnyNumberGroup <em>Any Number Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Number Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getAnyNumberGroup()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_AnyNumberGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getAnyNumber <em>Any Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getAnyNumber()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EReference getNumberStyleType_AnyNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getText1()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getMap()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EReference getNumberStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getCountry()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getLanguage()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getName()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTitle()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationCountry()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationFormat()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationLanguage()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getTransliterationStyle()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType#getVolatile()
	 * @see #getNumberStyleType()
	 * @generated
	 */
	EAttribute getNumberStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType
	 * @generated
	 */
	EClass getNumberType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getEmbeddedText <em>Embedded Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getEmbeddedText()
	 * @see #getNumberType()
	 * @generated
	 */
	EReference getNumberType_EmbeddedText();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalPlaces()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalReplacement <em>Decimal Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Replacement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalReplacement()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_DecimalReplacement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor <em>Display Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Factor</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_DisplayFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getMinIntegerDigits <em>Min Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Integer Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getMinIntegerDigits()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MinIntegerDigits();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType <em>Percentage Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType
	 * @generated
	 */
	EClass getPercentageStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTextProperties()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EReference getPercentageStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getText()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getNumber()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EReference getPercentageStyleType_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getText1()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getMap()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EReference getPercentageStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getCountry()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getLanguage()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getName()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTitle()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationCountry()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationFormat()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationLanguage()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getTransliterationStyle()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType#getVolatile()
	 * @see #getPercentageStyleType()
	 * @generated
	 */
	EAttribute getPercentageStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType <em>Quarter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quarter Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType
	 * @generated
	 */
	EClass getQuarterType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType#getCalendar()
	 * @see #getQuarterType()
	 * @generated
	 */
	EAttribute getQuarterType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType#getStyle()
	 * @see #getQuarterType()
	 * @generated
	 */
	EAttribute getQuarterType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType <em>Scientific Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scientific Number Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType
	 * @generated
	 */
	EClass getScientificNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getDecimalPlaces()
	 * @see #getScientificNumberType()
	 * @generated
	 */
	EAttribute getScientificNumberType_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping()
	 * @see #getScientificNumberType()
	 * @generated
	 */
	EAttribute getScientificNumberType_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinExponentDigits <em>Min Exponent Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exponent Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinExponentDigits()
	 * @see #getScientificNumberType()
	 * @generated
	 */
	EAttribute getScientificNumberType_MinExponentDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinIntegerDigits <em>Min Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Integer Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinIntegerDigits()
	 * @see #getScientificNumberType()
	 * @generated
	 */
	EAttribute getScientificNumberType_MinIntegerDigits();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType <em>Seconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seconds Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType
	 * @generated
	 */
	EClass getSecondsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces()
	 * @see #getSecondsType()
	 * @generated
	 */
	EAttribute getSecondsType_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle()
	 * @see #getSecondsType()
	 * @generated
	 */
	EAttribute getSecondsType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType <em>Text Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType
	 * @generated
	 */
	EClass getTextContentType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType <em>Text Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType
	 * @generated
	 */
	EClass getTextStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTextProperties()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EReference getTextStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getText()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Text();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getGroup()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTextContent()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EReference getTextStyleType_TextContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getText1()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getMap()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EReference getTextStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getCountry()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getLanguage()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getName()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTitle()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationCountry()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationFormat()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationLanguage()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getTransliterationStyle()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType#getVolatile()
	 * @see #getTextStyleType()
	 * @generated
	 */
	EAttribute getTextStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType <em>Time Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType
	 * @generated
	 */
	EClass getTimeStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTextProperties <em>Text Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTextProperties()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_TextProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getText()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Text();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getGroup()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hours</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getHours()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_Hours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getAmPm <em>Am Pm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Am Pm</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getAmPm()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_AmPm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minutes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getMinutes()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_Minutes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seconds</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getSeconds()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_Seconds();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getText1 <em>Text1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getText1()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Text1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getMap()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EReference getTimeStyleType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getCountry()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getFormatSource <em>Format Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getFormatSource()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_FormatSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getLanguage()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getName()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTitle()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationCountry()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationFormat()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationLanguage()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTransliterationStyle()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTruncateOnOverflow <em>Truncate On Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate On Overflow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getTruncateOnOverflow()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_TruncateOnOverflow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType#getVolatile()
	 * @see #getTimeStyleType()
	 * @generated
	 */
	EAttribute getTimeStyleType_Volatile();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType <em>Week Of Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week Of Year Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType
	 * @generated
	 */
	EClass getWeekOfYearType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType#getCalendar()
	 * @see #getWeekOfYearType()
	 * @generated
	 */
	EAttribute getWeekOfYearType_Calendar();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType
	 * @generated
	 */
	EClass getYearType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType#getCalendar()
	 * @see #getYearType()
	 * @generated
	 */
	EAttribute getYearType_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType#getStyle()
	 * @see #getYearType()
	 * @generated
	 */
	EAttribute getYearType_Style();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getAmPm <em>Am Pm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Am Pm</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getAmPm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AmPm();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getBoolean()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Boolean();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getBooleanStyle <em>Boolean Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getBooleanStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCurrencyStyle <em>Currency Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCurrencyStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CurrencyStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCurrencySymbol <em>Currency Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Symbol</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCurrencySymbol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CurrencySymbol();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDateStyle <em>Date Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDateStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Day</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Day();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Day Of Week</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDayOfWeek()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DayOfWeek();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getEmbeddedText <em>Embedded Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getEmbeddedText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmbeddedText();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getEra <em>Era</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Era</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getEra()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Era();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fraction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getFraction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fraction();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hours</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getHours()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hours();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minutes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinutes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Minutes();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Month</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMonth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Month();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getNumberStyle <em>Number Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getNumberStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NumberStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPercentageStyle <em>Percentage Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentage Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPercentageStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PercentageStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getQuarter <em>Quarter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quarter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getQuarter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Quarter();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getScientificNumber <em>Scientific Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scientific Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getScientificNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScientificNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seconds</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getSeconds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Seconds();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTimeStyle <em>Time Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTimeStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getWeekOfYear <em>Week Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Week Of Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getWeekOfYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WeekOfYear();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getAutomaticOrder <em>Automatic Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getAutomaticOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutomaticOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCalendar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Calendar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Places</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDecimalPlaces()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DecimalPlaces();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDecimalReplacement <em>Decimal Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Replacement</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDecimalReplacement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DecimalReplacement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDenominatorValue <em>Denominator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDenominatorValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DenominatorValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDisplayFactor <em>Display Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Factor</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getDisplayFactor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getFormatSource <em>Format Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getFormatSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FormatSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getGrouping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinDenominatorDigits <em>Min Denominator Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Denominator Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinDenominatorDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinDenominatorDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinExponentDigits <em>Min Exponent Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exponent Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinExponentDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinExponentDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinIntegerDigits <em>Min Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Integer Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinIntegerDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinIntegerDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinNumeratorDigits <em>Min Numerator Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Numerator Digits</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getMinNumeratorDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinNumeratorDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPossessiveForm <em>Possessive Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possessive Form</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getPossessiveForm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PossessiveForm();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextual <em>Textual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textual</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTextual()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Textual();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationCountry <em>Transliteration Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransliterationCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationFormat <em>Transliteration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Format</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransliterationFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationLanguage <em>Transliteration Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransliterationLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationStyle <em>Transliteration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTransliterationStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransliterationStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTruncateOnOverflow <em>Truncate On Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate On Overflow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot#getTruncateOnOverflow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TruncateOnOverflow();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1 <em>Calendar Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
	 * @generated
	 */
	EEnum getCalendarTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2 <em>Calendar Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
	 * @generated
	 */
	EEnum getCalendarTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3 <em>Calendar Type Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
	 * @generated
	 */
	EEnum getCalendarTypeMember3();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4 <em>Calendar Type Member4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member4</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
	 * @generated
	 */
	EEnum getCalendarTypeMember4();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5 <em>Calendar Type Member5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member5</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
	 * @generated
	 */
	EEnum getCalendarTypeMember5();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6 <em>Calendar Type Member6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member6</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
	 * @generated
	 */
	EEnum getCalendarTypeMember6();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7 <em>Calendar Type Member7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member7</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
	 * @generated
	 */
	EEnum getCalendarTypeMember7();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8 <em>Calendar Type Member8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Type Member8</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
	 * @generated
	 */
	EEnum getCalendarTypeMember8();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType <em>Format Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @generated
	 */
	EEnum getFormatSourceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @generated
	 */
	EEnum getStyleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType <em>Transliteration Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transliteration Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @generated
	 */
	EEnum getTransliterationStyleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='calendar_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string calendar_._type_._member_._1 calendar_._type_._member_._2 calendar_._type_._member_._3 calendar_._type_._member_._4 calendar_._type_._member_._5 calendar_._type_._member_._6 calendar_._type_._member_._7 calendar_._type_._member_._8'"
	 * @generated
	 */
	EDataType getCalendarType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1 <em>Calendar Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1"
	 *        extendedMetaData="name='calendar_._type_._member_._1:Object' baseType='calendar_._type_._member_._1'"
	 * @generated
	 */
	EDataType getCalendarTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2 <em>Calendar Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2"
	 *        extendedMetaData="name='calendar_._type_._member_._2:Object' baseType='calendar_._type_._member_._2'"
	 * @generated
	 */
	EDataType getCalendarTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3 <em>Calendar Type Member3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member3 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3"
	 *        extendedMetaData="name='calendar_._type_._member_._3:Object' baseType='calendar_._type_._member_._3'"
	 * @generated
	 */
	EDataType getCalendarTypeMember3Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4 <em>Calendar Type Member4 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member4 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4"
	 *        extendedMetaData="name='calendar_._type_._member_._4:Object' baseType='calendar_._type_._member_._4'"
	 * @generated
	 */
	EDataType getCalendarTypeMember4Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5 <em>Calendar Type Member5 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member5 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5"
	 *        extendedMetaData="name='calendar_._type_._member_._5:Object' baseType='calendar_._type_._member_._5'"
	 * @generated
	 */
	EDataType getCalendarTypeMember5Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6 <em>Calendar Type Member6 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member6 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6"
	 *        extendedMetaData="name='calendar_._type_._member_._6:Object' baseType='calendar_._type_._member_._6'"
	 * @generated
	 */
	EDataType getCalendarTypeMember6Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7 <em>Calendar Type Member7 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member7 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7"
	 *        extendedMetaData="name='calendar_._type_._member_._7:Object' baseType='calendar_._type_._member_._7'"
	 * @generated
	 */
	EDataType getCalendarTypeMember7Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8 <em>Calendar Type Member8 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Type Member8 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8"
	 *        extendedMetaData="name='calendar_._type_._member_._8:Object' baseType='calendar_._type_._member_._8'"
	 * @generated
	 */
	EDataType getCalendarTypeMember8Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType <em>Format Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format Source Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType"
	 *        extendedMetaData="name='format-source_._type:Object' baseType='format-source_._type'"
	 * @generated
	 */
	EDataType getFormatSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType <em>Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType"
	 *        extendedMetaData="name='style_._type:Object' baseType='style_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType <em>Transliteration Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transliteration Style Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType"
	 *        extendedMetaData="name='transliteration-style_._type:Object' baseType='transliteration-style_._type'"
	 * @generated
	 */
	EDataType getTransliterationStyleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatastyleFactory getDatastyleFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.AmPmTypeImpl <em>Am Pm Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.AmPmTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getAmPmType()
		 * @generated
		 */
		EClass AM_PM_TYPE = eINSTANCE.getAmPmType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl <em>Boolean Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getBooleanStyleType()
		 * @generated
		 */
		EClass BOOLEAN_STYLE_TYPE = eINSTANCE.getBooleanStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getBooleanStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TEXT = eINSTANCE.getBooleanStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_STYLE_TYPE__BOOLEAN = eINSTANCE.getBooleanStyleType_Boolean();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TEXT1 = eINSTANCE.getBooleanStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_STYLE_TYPE__MAP = eINSTANCE.getBooleanStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__COUNTRY = eINSTANCE.getBooleanStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__LANGUAGE = eINSTANCE.getBooleanStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__NAME = eINSTANCE.getBooleanStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TITLE = eINSTANCE.getBooleanStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getBooleanStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getBooleanStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getBooleanStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getBooleanStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_STYLE_TYPE__VOLATILE = eINSTANCE.getBooleanStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl <em>Currency Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCurrencyStyleType()
		 * @generated
		 */
		EClass CURRENCY_STYLE_TYPE = eINSTANCE.getCurrencyStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getCurrencyStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TEXT = eINSTANCE.getCurrencyStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__NUMBER = eINSTANCE.getCurrencyStyleType_Number();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TEXT1 = eINSTANCE.getCurrencyStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Currency Symbol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL = eINSTANCE.getCurrencyStyleType_CurrencySymbol();

		/**
		 * The meta object literal for the '<em><b>Text2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TEXT2 = eINSTANCE.getCurrencyStyleType_Text2();

		/**
		 * The meta object literal for the '<em><b>Currency Symbol1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1 = eINSTANCE.getCurrencyStyleType_CurrencySymbol1();

		/**
		 * The meta object literal for the '<em><b>Text3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TEXT3 = eINSTANCE.getCurrencyStyleType_Text3();

		/**
		 * The meta object literal for the '<em><b>Number1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__NUMBER1 = eINSTANCE.getCurrencyStyleType_Number1();

		/**
		 * The meta object literal for the '<em><b>Text4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TEXT4 = eINSTANCE.getCurrencyStyleType_Text4();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_STYLE_TYPE__MAP = eINSTANCE.getCurrencyStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Automatic Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER = eINSTANCE.getCurrencyStyleType_AutomaticOrder();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__COUNTRY = eINSTANCE.getCurrencyStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__LANGUAGE = eINSTANCE.getCurrencyStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__NAME = eINSTANCE.getCurrencyStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TITLE = eINSTANCE.getCurrencyStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getCurrencyStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getCurrencyStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getCurrencyStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getCurrencyStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_STYLE_TYPE__VOLATILE = eINSTANCE.getCurrencyStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencySymbolTypeImpl <em>Currency Symbol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencySymbolTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCurrencySymbolType()
		 * @generated
		 */
		EClass CURRENCY_SYMBOL_TYPE = eINSTANCE.getCurrencySymbolType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_SYMBOL_TYPE__MIXED = eINSTANCE.getCurrencySymbolType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_SYMBOL_TYPE__COUNTRY = eINSTANCE.getCurrencySymbolType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_SYMBOL_TYPE__LANGUAGE = eINSTANCE.getCurrencySymbolType_Language();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl <em>Date Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDateStyleType()
		 * @generated
		 */
		EClass DATE_STYLE_TYPE = eINSTANCE.getDateStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getDateStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TEXT = eINSTANCE.getDateStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__GROUP = eINSTANCE.getDateStyleType_Group();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__DAY = eINSTANCE.getDateStyleType_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__MONTH = eINSTANCE.getDateStyleType_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__YEAR = eINSTANCE.getDateStyleType_Year();

		/**
		 * The meta object literal for the '<em><b>Era</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__ERA = eINSTANCE.getDateStyleType_Era();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__DAY_OF_WEEK = eINSTANCE.getDateStyleType_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Week Of Year</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__WEEK_OF_YEAR = eINSTANCE.getDateStyleType_WeekOfYear();

		/**
		 * The meta object literal for the '<em><b>Quarter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__QUARTER = eINSTANCE.getDateStyleType_Quarter();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__HOURS = eINSTANCE.getDateStyleType_Hours();

		/**
		 * The meta object literal for the '<em><b>Am Pm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__AM_PM = eINSTANCE.getDateStyleType_AmPm();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__MINUTES = eINSTANCE.getDateStyleType_Minutes();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__SECONDS = eINSTANCE.getDateStyleType_Seconds();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TEXT1 = eINSTANCE.getDateStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_STYLE_TYPE__MAP = eINSTANCE.getDateStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Automatic Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__AUTOMATIC_ORDER = eINSTANCE.getDateStyleType_AutomaticOrder();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__COUNTRY = eINSTANCE.getDateStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Format Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__FORMAT_SOURCE = eINSTANCE.getDateStyleType_FormatSource();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__LANGUAGE = eINSTANCE.getDateStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__NAME = eINSTANCE.getDateStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TITLE = eINSTANCE.getDateStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getDateStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getDateStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getDateStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getDateStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_STYLE_TYPE__VOLATILE = eINSTANCE.getDateStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl <em>Day Of Week Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDayOfWeekType()
		 * @generated
		 */
		EClass DAY_OF_WEEK_TYPE = eINSTANCE.getDayOfWeekType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_OF_WEEK_TYPE__CALENDAR = eINSTANCE.getDayOfWeekType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_OF_WEEK_TYPE__STYLE = eINSTANCE.getDayOfWeekType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayTypeImpl <em>Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDayType()
		 * @generated
		 */
		EClass DAY_TYPE = eINSTANCE.getDayType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_TYPE__CALENDAR = eINSTANCE.getDayType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_TYPE__STYLE = eINSTANCE.getDayType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EmbeddedTextTypeImpl <em>Embedded Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EmbeddedTextTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getEmbeddedTextType()
		 * @generated
		 */
		EClass EMBEDDED_TEXT_TYPE = eINSTANCE.getEmbeddedTextType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_TEXT_TYPE__MIXED = eINSTANCE.getEmbeddedTextType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_TEXT_TYPE__POSITION = eINSTANCE.getEmbeddedTextType_Position();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EraTypeImpl <em>Era Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.EraTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getEraType()
		 * @generated
		 */
		EClass ERA_TYPE = eINSTANCE.getEraType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERA_TYPE__CALENDAR = eINSTANCE.getEraType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERA_TYPE__STYLE = eINSTANCE.getEraType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl <em>Fraction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFractionType()
		 * @generated
		 */
		EClass FRACTION_TYPE = eINSTANCE.getFractionType();

		/**
		 * The meta object literal for the '<em><b>Denominator Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTION_TYPE__DENOMINATOR_VALUE = eINSTANCE.getFractionType_DenominatorValue();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTION_TYPE__GROUPING = eINSTANCE.getFractionType_Grouping();

		/**
		 * The meta object literal for the '<em><b>Min Denominator Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTION_TYPE__MIN_DENOMINATOR_DIGITS = eINSTANCE.getFractionType_MinDenominatorDigits();

		/**
		 * The meta object literal for the '<em><b>Min Integer Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTION_TYPE__MIN_INTEGER_DIGITS = eINSTANCE.getFractionType_MinIntegerDigits();

		/**
		 * The meta object literal for the '<em><b>Min Numerator Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTION_TYPE__MIN_NUMERATOR_DIGITS = eINSTANCE.getFractionType_MinNumeratorDigits();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.HoursTypeImpl <em>Hours Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.HoursTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getHoursType()
		 * @generated
		 */
		EClass HOURS_TYPE = eINSTANCE.getHoursType();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOURS_TYPE__STYLE = eINSTANCE.getHoursType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MinutesTypeImpl <em>Minutes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MinutesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getMinutesType()
		 * @generated
		 */
		EClass MINUTES_TYPE = eINSTANCE.getMinutesType();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINUTES_TYPE__STYLE = eINSTANCE.getMinutesType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MonthTypeImpl <em>Month Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.MonthTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getMonthType()
		 * @generated
		 */
		EClass MONTH_TYPE = eINSTANCE.getMonthType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_TYPE__CALENDAR = eINSTANCE.getMonthType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Possessive Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_TYPE__POSSESSIVE_FORM = eINSTANCE.getMonthType_PossessiveForm();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_TYPE__STYLE = eINSTANCE.getMonthType_Style();

		/**
		 * The meta object literal for the '<em><b>Textual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_TYPE__TEXTUAL = eINSTANCE.getMonthType_Textual();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberStyleTypeImpl <em>Number Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getNumberStyleType()
		 * @generated
		 */
		EClass NUMBER_STYLE_TYPE = eINSTANCE.getNumberStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getNumberStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TEXT = eINSTANCE.getNumberStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Any Number Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__ANY_NUMBER_GROUP = eINSTANCE.getNumberStyleType_AnyNumberGroup();

		/**
		 * The meta object literal for the '<em><b>Any Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_STYLE_TYPE__ANY_NUMBER = eINSTANCE.getNumberStyleType_AnyNumber();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TEXT1 = eINSTANCE.getNumberStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_STYLE_TYPE__MAP = eINSTANCE.getNumberStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__COUNTRY = eINSTANCE.getNumberStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__LANGUAGE = eINSTANCE.getNumberStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__NAME = eINSTANCE.getNumberStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TITLE = eINSTANCE.getNumberStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getNumberStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getNumberStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getNumberStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getNumberStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_STYLE_TYPE__VOLATILE = eINSTANCE.getNumberStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl <em>Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getNumberType()
		 * @generated
		 */
		EClass NUMBER_TYPE = eINSTANCE.getNumberType();

		/**
		 * The meta object literal for the '<em><b>Embedded Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_TYPE__EMBEDDED_TEXT = eINSTANCE.getNumberType_EmbeddedText();

		/**
		 * The meta object literal for the '<em><b>Decimal Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_TYPE__DECIMAL_PLACES = eINSTANCE.getNumberType_DecimalPlaces();

		/**
		 * The meta object literal for the '<em><b>Decimal Replacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_TYPE__DECIMAL_REPLACEMENT = eINSTANCE.getNumberType_DecimalReplacement();

		/**
		 * The meta object literal for the '<em><b>Display Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_TYPE__DISPLAY_FACTOR = eINSTANCE.getNumberType_DisplayFactor();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_TYPE__GROUPING = eINSTANCE.getNumberType_Grouping();

		/**
		 * The meta object literal for the '<em><b>Min Integer Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_TYPE__MIN_INTEGER_DIGITS = eINSTANCE.getNumberType_MinIntegerDigits();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.PercentageStyleTypeImpl <em>Percentage Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.PercentageStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getPercentageStyleType()
		 * @generated
		 */
		EClass PERCENTAGE_STYLE_TYPE = eINSTANCE.getPercentageStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCENTAGE_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getPercentageStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TEXT = eINSTANCE.getPercentageStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCENTAGE_STYLE_TYPE__NUMBER = eINSTANCE.getPercentageStyleType_Number();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TEXT1 = eINSTANCE.getPercentageStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCENTAGE_STYLE_TYPE__MAP = eINSTANCE.getPercentageStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__COUNTRY = eINSTANCE.getPercentageStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__LANGUAGE = eINSTANCE.getPercentageStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__NAME = eINSTANCE.getPercentageStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TITLE = eINSTANCE.getPercentageStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getPercentageStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getPercentageStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getPercentageStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getPercentageStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_STYLE_TYPE__VOLATILE = eINSTANCE.getPercentageStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.QuarterTypeImpl <em>Quarter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.QuarterTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getQuarterType()
		 * @generated
		 */
		EClass QUARTER_TYPE = eINSTANCE.getQuarterType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUARTER_TYPE__CALENDAR = eINSTANCE.getQuarterType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUARTER_TYPE__STYLE = eINSTANCE.getQuarterType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl <em>Scientific Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getScientificNumberType()
		 * @generated
		 */
		EClass SCIENTIFIC_NUMBER_TYPE = eINSTANCE.getScientificNumberType();

		/**
		 * The meta object literal for the '<em><b>Decimal Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES = eINSTANCE.getScientificNumberType_DecimalPlaces();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCIENTIFIC_NUMBER_TYPE__GROUPING = eINSTANCE.getScientificNumberType_Grouping();

		/**
		 * The meta object literal for the '<em><b>Min Exponent Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS = eINSTANCE.getScientificNumberType_MinExponentDigits();

		/**
		 * The meta object literal for the '<em><b>Min Integer Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS = eINSTANCE.getScientificNumberType_MinIntegerDigits();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl <em>Seconds Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getSecondsType()
		 * @generated
		 */
		EClass SECONDS_TYPE = eINSTANCE.getSecondsType();

		/**
		 * The meta object literal for the '<em><b>Decimal Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDS_TYPE__DECIMAL_PLACES = eINSTANCE.getSecondsType_DecimalPlaces();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDS_TYPE__STYLE = eINSTANCE.getSecondsType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextContentTypeImpl <em>Text Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextContentTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTextContentType()
		 * @generated
		 */
		EClass TEXT_CONTENT_TYPE = eINSTANCE.getTextContentType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextStyleTypeImpl <em>Text Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TextStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTextStyleType()
		 * @generated
		 */
		EClass TEXT_STYLE_TYPE = eINSTANCE.getTextStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getTextStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TEXT = eINSTANCE.getTextStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__GROUP = eINSTANCE.getTextStyleType_Group();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STYLE_TYPE__TEXT_CONTENT = eINSTANCE.getTextStyleType_TextContent();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TEXT1 = eINSTANCE.getTextStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STYLE_TYPE__MAP = eINSTANCE.getTextStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__COUNTRY = eINSTANCE.getTextStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__LANGUAGE = eINSTANCE.getTextStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__NAME = eINSTANCE.getTextStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TITLE = eINSTANCE.getTextStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getTextStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getTextStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getTextStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getTextStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_TYPE__VOLATILE = eINSTANCE.getTextStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TimeStyleTypeImpl <em>Time Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.TimeStyleTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTimeStyleType()
		 * @generated
		 */
		EClass TIME_STYLE_TYPE = eINSTANCE.getTimeStyleType();

		/**
		 * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__TEXT_PROPERTIES = eINSTANCE.getTimeStyleType_TextProperties();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TEXT = eINSTANCE.getTimeStyleType_Text();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__GROUP = eINSTANCE.getTimeStyleType_Group();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__HOURS = eINSTANCE.getTimeStyleType_Hours();

		/**
		 * The meta object literal for the '<em><b>Am Pm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__AM_PM = eINSTANCE.getTimeStyleType_AmPm();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__MINUTES = eINSTANCE.getTimeStyleType_Minutes();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__SECONDS = eINSTANCE.getTimeStyleType_Seconds();

		/**
		 * The meta object literal for the '<em><b>Text1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TEXT1 = eINSTANCE.getTimeStyleType_Text1();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STYLE_TYPE__MAP = eINSTANCE.getTimeStyleType_Map();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__COUNTRY = eINSTANCE.getTimeStyleType_Country();

		/**
		 * The meta object literal for the '<em><b>Format Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__FORMAT_SOURCE = eINSTANCE.getTimeStyleType_FormatSource();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__LANGUAGE = eINSTANCE.getTimeStyleType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__NAME = eINSTANCE.getTimeStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TITLE = eINSTANCE.getTimeStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TRANSLITERATION_COUNTRY = eINSTANCE.getTimeStyleType_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TRANSLITERATION_FORMAT = eINSTANCE.getTimeStyleType_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TRANSLITERATION_LANGUAGE = eINSTANCE.getTimeStyleType_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TRANSLITERATION_STYLE = eINSTANCE.getTimeStyleType_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Truncate On Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__TRUNCATE_ON_OVERFLOW = eINSTANCE.getTimeStyleType_TruncateOnOverflow();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STYLE_TYPE__VOLATILE = eINSTANCE.getTimeStyleType_Volatile();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.WeekOfYearTypeImpl <em>Week Of Year Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.WeekOfYearTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getWeekOfYearType()
		 * @generated
		 */
		EClass WEEK_OF_YEAR_TYPE = eINSTANCE.getWeekOfYearType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK_OF_YEAR_TYPE__CALENDAR = eINSTANCE.getWeekOfYearType_Calendar();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.YearTypeImpl <em>Year Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.YearTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getYearType()
		 * @generated
		 */
		EClass YEAR_TYPE = eINSTANCE.getYearType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_TYPE__CALENDAR = eINSTANCE.getYearType_Calendar();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_TYPE__STYLE = eINSTANCE.getYearType_Style();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Am Pm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AM_PM = eINSTANCE.getDocumentRoot_AmPm();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN = eINSTANCE.getDocumentRoot_Boolean();

		/**
		 * The meta object literal for the '<em><b>Boolean Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_STYLE = eINSTANCE.getDocumentRoot_BooleanStyle();

		/**
		 * The meta object literal for the '<em><b>Currency Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CURRENCY_STYLE = eINSTANCE.getDocumentRoot_CurrencyStyle();

		/**
		 * The meta object literal for the '<em><b>Currency Symbol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CURRENCY_SYMBOL = eINSTANCE.getDocumentRoot_CurrencySymbol();

		/**
		 * The meta object literal for the '<em><b>Date Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_STYLE = eINSTANCE.getDocumentRoot_DateStyle();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DAY = eINSTANCE.getDocumentRoot_Day();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DAY_OF_WEEK = eINSTANCE.getDocumentRoot_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Embedded Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMBEDDED_TEXT = eINSTANCE.getDocumentRoot_EmbeddedText();

		/**
		 * The meta object literal for the '<em><b>Era</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERA = eINSTANCE.getDocumentRoot_Era();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FRACTION = eINSTANCE.getDocumentRoot_Fraction();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HOURS = eINSTANCE.getDocumentRoot_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MINUTES = eINSTANCE.getDocumentRoot_Minutes();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MONTH = eINSTANCE.getDocumentRoot_Month();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NUMBER = eINSTANCE.getDocumentRoot_Number();

		/**
		 * The meta object literal for the '<em><b>Number Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NUMBER_STYLE = eINSTANCE.getDocumentRoot_NumberStyle();

		/**
		 * The meta object literal for the '<em><b>Percentage Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERCENTAGE_STYLE = eINSTANCE.getDocumentRoot_PercentageStyle();

		/**
		 * The meta object literal for the '<em><b>Quarter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUARTER = eINSTANCE.getDocumentRoot_Quarter();

		/**
		 * The meta object literal for the '<em><b>Scientific Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCIENTIFIC_NUMBER = eINSTANCE.getDocumentRoot_ScientificNumber();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECONDS = eINSTANCE.getDocumentRoot_Seconds();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT = eINSTANCE.getDocumentRoot_Text();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXT_CONTENT = eINSTANCE.getDocumentRoot_TextContent();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXT_STYLE = eINSTANCE.getDocumentRoot_TextStyle();

		/**
		 * The meta object literal for the '<em><b>Time Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIME_STYLE = eINSTANCE.getDocumentRoot_TimeStyle();

		/**
		 * The meta object literal for the '<em><b>Week Of Year</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEEK_OF_YEAR = eINSTANCE.getDocumentRoot_WeekOfYear();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__YEAR = eINSTANCE.getDocumentRoot_Year();

		/**
		 * The meta object literal for the '<em><b>Automatic Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTOMATIC_ORDER = eINSTANCE.getDocumentRoot_AutomaticOrder();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CALENDAR = eINSTANCE.getDocumentRoot_Calendar();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COUNTRY = eINSTANCE.getDocumentRoot_Country();

		/**
		 * The meta object literal for the '<em><b>Decimal Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DECIMAL_PLACES = eINSTANCE.getDocumentRoot_DecimalPlaces();

		/**
		 * The meta object literal for the '<em><b>Decimal Replacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DECIMAL_REPLACEMENT = eINSTANCE.getDocumentRoot_DecimalReplacement();

		/**
		 * The meta object literal for the '<em><b>Denominator Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DENOMINATOR_VALUE = eINSTANCE.getDocumentRoot_DenominatorValue();

		/**
		 * The meta object literal for the '<em><b>Display Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_FACTOR = eINSTANCE.getDocumentRoot_DisplayFactor();

		/**
		 * The meta object literal for the '<em><b>Format Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FORMAT_SOURCE = eINSTANCE.getDocumentRoot_FormatSource();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GROUPING = eINSTANCE.getDocumentRoot_Grouping();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>Min Denominator Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS = eINSTANCE.getDocumentRoot_MinDenominatorDigits();

		/**
		 * The meta object literal for the '<em><b>Min Exponent Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_EXPONENT_DIGITS = eINSTANCE.getDocumentRoot_MinExponentDigits();

		/**
		 * The meta object literal for the '<em><b>Min Integer Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_INTEGER_DIGITS = eINSTANCE.getDocumentRoot_MinIntegerDigits();

		/**
		 * The meta object literal for the '<em><b>Min Numerator Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS = eINSTANCE.getDocumentRoot_MinNumeratorDigits();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POSITION = eINSTANCE.getDocumentRoot_Position();

		/**
		 * The meta object literal for the '<em><b>Possessive Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POSSESSIVE_FORM = eINSTANCE.getDocumentRoot_PossessiveForm();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STYLE = eINSTANCE.getDocumentRoot_Style();

		/**
		 * The meta object literal for the '<em><b>Textual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXTUAL = eINSTANCE.getDocumentRoot_Textual();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Transliteration Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSLITERATION_COUNTRY = eINSTANCE.getDocumentRoot_TransliterationCountry();

		/**
		 * The meta object literal for the '<em><b>Transliteration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSLITERATION_FORMAT = eINSTANCE.getDocumentRoot_TransliterationFormat();

		/**
		 * The meta object literal for the '<em><b>Transliteration Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE = eINSTANCE.getDocumentRoot_TransliterationLanguage();

		/**
		 * The meta object literal for the '<em><b>Transliteration Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSLITERATION_STYLE = eINSTANCE.getDocumentRoot_TransliterationStyle();

		/**
		 * The meta object literal for the '<em><b>Truncate On Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW = eINSTANCE.getDocumentRoot_TruncateOnOverflow();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1 <em>Calendar Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember1()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER1 = eINSTANCE.getCalendarTypeMember1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2 <em>Calendar Type Member2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember2()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER2 = eINSTANCE.getCalendarTypeMember2();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3 <em>Calendar Type Member3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember3()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER3 = eINSTANCE.getCalendarTypeMember3();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4 <em>Calendar Type Member4</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember4()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER4 = eINSTANCE.getCalendarTypeMember4();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5 <em>Calendar Type Member5</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember5()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER5 = eINSTANCE.getCalendarTypeMember5();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6 <em>Calendar Type Member6</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember6()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER6 = eINSTANCE.getCalendarTypeMember6();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7 <em>Calendar Type Member7</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember7()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER7 = eINSTANCE.getCalendarTypeMember7();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8 <em>Calendar Type Member8</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember8()
		 * @generated
		 */
		EEnum CALENDAR_TYPE_MEMBER8 = eINSTANCE.getCalendarTypeMember8();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType <em>Format Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFormatSourceType()
		 * @generated
		 */
		EEnum FORMAT_SOURCE_TYPE = eINSTANCE.getFormatSourceType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType <em>Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getStyleType()
		 * @generated
		 */
		EEnum STYLE_TYPE = eINSTANCE.getStyleType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType <em>Transliteration Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTransliterationStyleType()
		 * @generated
		 */
		EEnum TRANSLITERATION_STYLE_TYPE = eINSTANCE.getTransliterationStyleType();

		/**
		 * The meta object literal for the '<em>Calendar Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarType()
		 * @generated
		 */
		EDataType CALENDAR_TYPE = eINSTANCE.getCalendarType();

		/**
		 * The meta object literal for the '<em>Calendar Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember1Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER1_OBJECT = eINSTANCE.getCalendarTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member2 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember2Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER2_OBJECT = eINSTANCE.getCalendarTypeMember2Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member3 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember3Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER3_OBJECT = eINSTANCE.getCalendarTypeMember3Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member4 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember4Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER4_OBJECT = eINSTANCE.getCalendarTypeMember4Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member5 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember5Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER5_OBJECT = eINSTANCE.getCalendarTypeMember5Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member6 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember6Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER6_OBJECT = eINSTANCE.getCalendarTypeMember6Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member7 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember7Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER7_OBJECT = eINSTANCE.getCalendarTypeMember7Object();

		/**
		 * The meta object literal for the '<em>Calendar Type Member8 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getCalendarTypeMember8Object()
		 * @generated
		 */
		EDataType CALENDAR_TYPE_MEMBER8_OBJECT = eINSTANCE.getCalendarTypeMember8Object();

		/**
		 * The meta object literal for the '<em>Format Source Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getFormatSourceTypeObject()
		 * @generated
		 */
		EDataType FORMAT_SOURCE_TYPE_OBJECT = eINSTANCE.getFormatSourceTypeObject();

		/**
		 * The meta object literal for the '<em>Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getStyleTypeObject()
		 * @generated
		 */
		EDataType STYLE_TYPE_OBJECT = eINSTANCE.getStyleTypeObject();

		/**
		 * The meta object literal for the '<em>Transliteration Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl#getTransliterationStyleTypeObject()
		 * @generated
		 */
		EDataType TRANSLITERATION_STYLE_TYPE_OBJECT = eINSTANCE.getTransliterationStyleTypeObject();

	}

} //DatastylePackage
