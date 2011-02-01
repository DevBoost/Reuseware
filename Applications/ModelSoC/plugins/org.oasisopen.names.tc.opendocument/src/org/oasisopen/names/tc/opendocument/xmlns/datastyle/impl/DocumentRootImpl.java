/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getAmPm <em>Am Pm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getBooleanStyle <em>Boolean Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getCurrencyStyle <em>Currency Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getCurrencySymbol <em>Currency Symbol</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDateStyle <em>Date Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getEmbeddedText <em>Embedded Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getEra <em>Era</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getNumberStyle <em>Number Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getPercentageStyle <em>Percentage Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getQuarter <em>Quarter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getScientificNumber <em>Scientific Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTimeStyle <em>Time Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getWeekOfYear <em>Week Of Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getAutomaticOrder <em>Automatic Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDecimalReplacement <em>Decimal Replacement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDenominatorValue <em>Denominator Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getDisplayFactor <em>Display Factor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getFormatSource <em>Format Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMinDenominatorDigits <em>Min Denominator Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMinExponentDigits <em>Min Exponent Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getMinNumeratorDigits <em>Min Numerator Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getPossessiveForm <em>Possessive Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTextual <em>Textual</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DocumentRootImpl#getTruncateOnOverflow <em>Truncate On Overflow</em>}</li>
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutomaticOrder() <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticOrder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_ORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticOrder() <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticOrder()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticOrder = AUTOMATIC_ORDER_EDEFAULT;

	/**
	 * This is true if the Automatic Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticOrderESet;

	/**
	 * The default value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final Object CALENDAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Object calendar = CALENDAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decimalPlaces = DECIMAL_PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalReplacement() <em>Decimal Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalReplacement()
	 * @generated
	 * @ordered
	 */
	protected static final Object DECIMAL_REPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalReplacement() <em>Decimal Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalReplacement()
	 * @generated
	 * @ordered
	 */
	protected Object decimalReplacement = DECIMAL_REPLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenominatorValue() <em>Denominator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DENOMINATOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenominatorValue() <em>Denominator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger denominatorValue = DENOMINATOR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayFactor() <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLAY_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplayFactor() <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFactor()
	 * @generated
	 * @ordered
	 */
	protected double displayFactor = DISPLAY_FACTOR_EDEFAULT;

	/**
	 * This is true if the Display Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFactorESet;

	/**
	 * The default value of the '{@link #getFormatSource() <em>Format Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatSource()
	 * @generated
	 * @ordered
	 */
	protected static final FormatSourceType FORMAT_SOURCE_EDEFAULT = FormatSourceType.FIXED;

	/**
	 * The cached value of the '{@link #getFormatSource() <em>Format Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatSource()
	 * @generated
	 * @ordered
	 */
	protected FormatSourceType formatSource = FORMAT_SOURCE_EDEFAULT;

	/**
	 * This is true if the Format Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatSourceESet;

	/**
	 * The default value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean GROUPING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean grouping = GROUPING_EDEFAULT;

	/**
	 * This is true if the Grouping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingESet;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDenominatorDigits() <em>Min Denominator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDenominatorDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_DENOMINATOR_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinDenominatorDigits() <em>Min Denominator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDenominatorDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minDenominatorDigits = MIN_DENOMINATOR_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExponentDigits() <em>Min Exponent Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExponentDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_EXPONENT_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExponentDigits() <em>Min Exponent Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExponentDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minExponentDigits = MIN_EXPONENT_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_INTEGER_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minIntegerDigits = MIN_INTEGER_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinNumeratorDigits() <em>Min Numerator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumeratorDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_NUMERATOR_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinNumeratorDigits() <em>Min Numerator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumeratorDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minNumeratorDigits = MIN_NUMERATOR_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPossessiveForm() <em>Possessive Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessiveForm()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean POSSESSIVE_FORM_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPossessiveForm() <em>Possessive Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessiveForm()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean possessiveForm = POSSESSIVE_FORM_EDEFAULT;

	/**
	 * This is true if the Possessive Form attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean possessiveFormESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.SHORT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleType style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * The default value of the '{@link #getTextual() <em>Textual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextual()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXTUAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextual() <em>Textual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextual()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textual = TEXTUAL_EDEFAULT;

	/**
	 * This is true if the Textual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textualESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Object title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationCountry() <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransliterationCountry() <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationCountry()
	 * @generated
	 * @ordered
	 */
	protected String transliterationCountry = TRANSLITERATION_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationFormat() <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransliterationFormat() <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationFormat()
	 * @generated
	 * @ordered
	 */
	protected String transliterationFormat = TRANSLITERATION_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationLanguage() <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransliterationLanguage() <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationLanguage()
	 * @generated
	 * @ordered
	 */
	protected String transliterationLanguage = TRANSLITERATION_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationStyle() <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationStyle()
	 * @generated
	 * @ordered
	 */
	protected static final TransliterationStyleType TRANSLITERATION_STYLE_EDEFAULT = TransliterationStyleType.SHORT;

	/**
	 * The cached value of the '{@link #getTransliterationStyle() <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationStyle()
	 * @generated
	 * @ordered
	 */
	protected TransliterationStyleType transliterationStyle = TRANSLITERATION_STYLE_EDEFAULT;

	/**
	 * This is true if the Transliteration Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transliterationStyleESet;

	/**
	 * The default value of the '{@link #getTruncateOnOverflow() <em>Truncate On Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruncateOnOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TRUNCATE_ON_OVERFLOW_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTruncateOnOverflow() <em>Truncate On Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruncateOnOverflow()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean truncateOnOverflow = TRUNCATE_ON_OVERFLOW_EDEFAULT;

	/**
	 * This is true if the Truncate On Overflow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean truncateOnOverflowESet;

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
		return DatastylePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DatastylePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmPmType getAmPm() {
		return (AmPmType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__AM_PM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmPm(AmPmType newAmPm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__AM_PM, newAmPm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmPm(AmPmType newAmPm) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__AM_PM, newAmPm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getBoolean() {
		return (BooleanType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolean(BooleanType newBoolean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN, newBoolean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(BooleanType newBoolean) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN, newBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanStyleType getBooleanStyle() {
		return (BooleanStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanStyle(BooleanStyleType newBooleanStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN_STYLE, newBooleanStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanStyle(BooleanStyleType newBooleanStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__BOOLEAN_STYLE, newBooleanStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyStyleType getCurrencyStyle() {
		return (CurrencyStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencyStyle(CurrencyStyleType newCurrencyStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_STYLE, newCurrencyStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyStyle(CurrencyStyleType newCurrencyStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_STYLE, newCurrencyStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolType getCurrencySymbol() {
		return (CurrencySymbolType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_SYMBOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencySymbol(CurrencySymbolType newCurrencySymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_SYMBOL, newCurrencySymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencySymbol(CurrencySymbolType newCurrencySymbol) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__CURRENCY_SYMBOL, newCurrencySymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateStyleType getDateStyle() {
		return (DateStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__DATE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateStyle(DateStyleType newDateStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__DATE_STYLE, newDateStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateStyle(DateStyleType newDateStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__DATE_STYLE, newDateStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType getDay() {
		return (DayType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__DAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(DayType newDay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__DAY, newDay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(DayType newDay) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__DAY, newDay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeekType getDayOfWeek() {
		return (DayOfWeekType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__DAY_OF_WEEK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayOfWeek(DayOfWeekType newDayOfWeek, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__DAY_OF_WEEK, newDayOfWeek, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfWeek(DayOfWeekType newDayOfWeek) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__DAY_OF_WEEK, newDayOfWeek);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedTextType getEmbeddedText() {
		return (EmbeddedTextType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__EMBEDDED_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedText(EmbeddedTextType newEmbeddedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__EMBEDDED_TEXT, newEmbeddedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedText(EmbeddedTextType newEmbeddedText) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__EMBEDDED_TEXT, newEmbeddedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EraType getEra() {
		return (EraType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__ERA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEra(EraType newEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__ERA, newEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEra(EraType newEra) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__ERA, newEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FractionType getFraction() {
		return (FractionType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__FRACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFraction(FractionType newFraction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__FRACTION, newFraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(FractionType newFraction) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__FRACTION, newFraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoursType getHours() {
		return (HoursType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__HOURS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHours(HoursType newHours, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__HOURS, newHours, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHours(HoursType newHours) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__HOURS, newHours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinutesType getMinutes() {
		return (MinutesType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__MINUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinutes(MinutesType newMinutes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__MINUTES, newMinutes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes(MinutesType newMinutes) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__MINUTES, newMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthType getMonth() {
		return (MonthType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__MONTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(MonthType newMonth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__MONTH, newMonth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(MonthType newMonth) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__MONTH, newMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType getNumber() {
		return (NumberType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(NumberType newNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER, newNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(NumberType newNumber) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberStyleType getNumberStyle() {
		return (NumberStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberStyle(NumberStyleType newNumberStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER_STYLE, newNumberStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberStyle(NumberStyleType newNumberStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__NUMBER_STYLE, newNumberStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageStyleType getPercentageStyle() {
		return (PercentageStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__PERCENTAGE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageStyle(PercentageStyleType newPercentageStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__PERCENTAGE_STYLE, newPercentageStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageStyle(PercentageStyleType newPercentageStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__PERCENTAGE_STYLE, newPercentageStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuarterType getQuarter() {
		return (QuarterType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__QUARTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuarter(QuarterType newQuarter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__QUARTER, newQuarter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuarter(QuarterType newQuarter) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__QUARTER, newQuarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScientificNumberType getScientificNumber() {
		return (ScientificNumberType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__SCIENTIFIC_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScientificNumber(ScientificNumberType newScientificNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__SCIENTIFIC_NUMBER, newScientificNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScientificNumber(ScientificNumberType newScientificNumber) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__SCIENTIFIC_NUMBER, newScientificNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondsType getSeconds() {
		return (SecondsType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__SECONDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeconds(SecondsType newSeconds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__SECONDS, newSeconds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(SecondsType newSeconds) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__SECONDS, newSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextContentType getTextContent() {
		return (TextContentType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextContent(TextContentType newTextContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_CONTENT, newTextContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextContent(TextContentType newTextContent) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_CONTENT, newTextContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleType getTextStyle() {
		return (TextStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextStyle(TextStyleType newTextStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_STYLE, newTextStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(TextStyleType newTextStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__TEXT_STYLE, newTextStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStyleType getTimeStyle() {
		return (TimeStyleType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__TIME_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStyle(TimeStyleType newTimeStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__TIME_STYLE, newTimeStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStyle(TimeStyleType newTimeStyle) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__TIME_STYLE, newTimeStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekOfYearType getWeekOfYear() {
		return (WeekOfYearType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__WEEK_OF_YEAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeekOfYear(WeekOfYearType newWeekOfYear, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__WEEK_OF_YEAR, newWeekOfYear, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekOfYear(WeekOfYearType newWeekOfYear) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__WEEK_OF_YEAR, newWeekOfYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearType getYear() {
		return (YearType)getMixed().get(DatastylePackage.Literals.DOCUMENT_ROOT__YEAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatastylePackage.Literals.DOCUMENT_ROOT__YEAR, newYear, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(YearType newYear) {
		((FeatureMap.Internal)getMixed()).set(DatastylePackage.Literals.DOCUMENT_ROOT__YEAR, newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticOrder() {
		return automaticOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticOrder) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticOrder = automaticOrder;
		automaticOrder = newAutomaticOrder == null ? AUTOMATIC_ORDER_EDEFAULT : newAutomaticOrder;
		boolean oldAutomaticOrderESet = automaticOrderESet;
		automaticOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER, oldAutomaticOrder, automaticOrder, !oldAutomaticOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticOrder() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticOrder = automaticOrder;
		boolean oldAutomaticOrderESet = automaticOrderESet;
		automaticOrder = AUTOMATIC_ORDER_EDEFAULT;
		automaticOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER, oldAutomaticOrder, AUTOMATIC_ORDER_EDEFAULT, oldAutomaticOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticOrder() {
		return automaticOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendar(Object newCalendar) {
		Object oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__CALENDAR, oldCalendar, calendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDecimalPlaces() {
		return decimalPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPlaces(BigInteger newDecimalPlaces) {
		BigInteger oldDecimalPlaces = decimalPlaces;
		decimalPlaces = newDecimalPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDecimalReplacement() {
		return decimalReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalReplacement(Object newDecimalReplacement) {
		Object oldDecimalReplacement = decimalReplacement;
		decimalReplacement = newDecimalReplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__DECIMAL_REPLACEMENT, oldDecimalReplacement, decimalReplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDenominatorValue() {
		return denominatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominatorValue(BigInteger newDenominatorValue) {
		BigInteger oldDenominatorValue = denominatorValue;
		denominatorValue = newDenominatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__DENOMINATOR_VALUE, oldDenominatorValue, denominatorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplayFactor() {
		return displayFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFactor(double newDisplayFactor) {
		double oldDisplayFactor = displayFactor;
		displayFactor = newDisplayFactor;
		boolean oldDisplayFactorESet = displayFactorESet;
		displayFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR, oldDisplayFactor, displayFactor, !oldDisplayFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFactor() {
		double oldDisplayFactor = displayFactor;
		boolean oldDisplayFactorESet = displayFactorESet;
		displayFactor = DISPLAY_FACTOR_EDEFAULT;
		displayFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR, oldDisplayFactor, DISPLAY_FACTOR_EDEFAULT, oldDisplayFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFactor() {
		return displayFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatSourceType getFormatSource() {
		return formatSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatSource(FormatSourceType newFormatSource) {
		FormatSourceType oldFormatSource = formatSource;
		formatSource = newFormatSource == null ? FORMAT_SOURCE_EDEFAULT : newFormatSource;
		boolean oldFormatSourceESet = formatSourceESet;
		formatSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE, oldFormatSource, formatSource, !oldFormatSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormatSource() {
		FormatSourceType oldFormatSource = formatSource;
		boolean oldFormatSourceESet = formatSourceESet;
		formatSource = FORMAT_SOURCE_EDEFAULT;
		formatSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE, oldFormatSource, FORMAT_SOURCE_EDEFAULT, oldFormatSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormatSource() {
		return formatSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newGrouping) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		grouping = newGrouping == null ? GROUPING_EDEFAULT : newGrouping;
		boolean oldGroupingESet = groupingESet;
		groupingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__GROUPING, oldGrouping, grouping, !oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrouping() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		boolean oldGroupingESet = groupingESet;
		grouping = GROUPING_EDEFAULT;
		groupingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__GROUPING, oldGrouping, GROUPING_EDEFAULT, oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrouping() {
		return groupingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinDenominatorDigits() {
		return minDenominatorDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDenominatorDigits(BigInteger newMinDenominatorDigits) {
		BigInteger oldMinDenominatorDigits = minDenominatorDigits;
		minDenominatorDigits = newMinDenominatorDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS, oldMinDenominatorDigits, minDenominatorDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinExponentDigits() {
		return minExponentDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExponentDigits(BigInteger newMinExponentDigits) {
		BigInteger oldMinExponentDigits = minExponentDigits;
		minExponentDigits = newMinExponentDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__MIN_EXPONENT_DIGITS, oldMinExponentDigits, minExponentDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinIntegerDigits() {
		return minIntegerDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIntegerDigits(BigInteger newMinIntegerDigits) {
		BigInteger oldMinIntegerDigits = minIntegerDigits;
		minIntegerDigits = newMinIntegerDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__MIN_INTEGER_DIGITS, oldMinIntegerDigits, minIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinNumeratorDigits() {
		return minNumeratorDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNumeratorDigits(BigInteger newMinNumeratorDigits) {
		BigInteger oldMinNumeratorDigits = minNumeratorDigits;
		minNumeratorDigits = newMinNumeratorDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS, oldMinNumeratorDigits, minNumeratorDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPossessiveForm() {
		return possessiveForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossessiveForm(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPossessiveForm) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPossessiveForm = possessiveForm;
		possessiveForm = newPossessiveForm == null ? POSSESSIVE_FORM_EDEFAULT : newPossessiveForm;
		boolean oldPossessiveFormESet = possessiveFormESet;
		possessiveFormESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM, oldPossessiveForm, possessiveForm, !oldPossessiveFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPossessiveForm() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPossessiveForm = possessiveForm;
		boolean oldPossessiveFormESet = possessiveFormESet;
		possessiveForm = POSSESSIVE_FORM_EDEFAULT;
		possessiveFormESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM, oldPossessiveForm, POSSESSIVE_FORM_EDEFAULT, oldPossessiveFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPossessiveForm() {
		return possessiveFormESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType newStyle) {
		StyleType oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		StyleType oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextual() {
		return textual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextual) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextual = textual;
		textual = newTextual == null ? TEXTUAL_EDEFAULT : newTextual;
		boolean oldTextualESet = textualESet;
		textualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TEXTUAL, oldTextual, textual, !oldTextualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextual() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextual = textual;
		boolean oldTextualESet = textualESet;
		textual = TEXTUAL_EDEFAULT;
		textualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__TEXTUAL, oldTextual, TEXTUAL_EDEFAULT, oldTextualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextual() {
		return textualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Object newTitle) {
		Object oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationCountry() {
		return transliterationCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationCountry(String newTransliterationCountry) {
		String oldTransliterationCountry = transliterationCountry;
		transliterationCountry = newTransliterationCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_COUNTRY, oldTransliterationCountry, transliterationCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationFormat() {
		return transliterationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationFormat(String newTransliterationFormat) {
		String oldTransliterationFormat = transliterationFormat;
		transliterationFormat = newTransliterationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_FORMAT, oldTransliterationFormat, transliterationFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationLanguage() {
		return transliterationLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationLanguage(String newTransliterationLanguage) {
		String oldTransliterationLanguage = transliterationLanguage;
		transliterationLanguage = newTransliterationLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE, oldTransliterationLanguage, transliterationLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransliterationStyleType getTransliterationStyle() {
		return transliterationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationStyle(TransliterationStyleType newTransliterationStyle) {
		TransliterationStyleType oldTransliterationStyle = transliterationStyle;
		transliterationStyle = newTransliterationStyle == null ? TRANSLITERATION_STYLE_EDEFAULT : newTransliterationStyle;
		boolean oldTransliterationStyleESet = transliterationStyleESet;
		transliterationStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE, oldTransliterationStyle, transliterationStyle, !oldTransliterationStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransliterationStyle() {
		TransliterationStyleType oldTransliterationStyle = transliterationStyle;
		boolean oldTransliterationStyleESet = transliterationStyleESet;
		transliterationStyle = TRANSLITERATION_STYLE_EDEFAULT;
		transliterationStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE, oldTransliterationStyle, TRANSLITERATION_STYLE_EDEFAULT, oldTransliterationStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransliterationStyle() {
		return transliterationStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTruncateOnOverflow() {
		return truncateOnOverflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruncateOnOverflow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTruncateOnOverflow) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTruncateOnOverflow = truncateOnOverflow;
		truncateOnOverflow = newTruncateOnOverflow == null ? TRUNCATE_ON_OVERFLOW_EDEFAULT : newTruncateOnOverflow;
		boolean oldTruncateOnOverflowESet = truncateOnOverflowESet;
		truncateOnOverflowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW, oldTruncateOnOverflow, truncateOnOverflow, !oldTruncateOnOverflowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTruncateOnOverflow() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTruncateOnOverflow = truncateOnOverflow;
		boolean oldTruncateOnOverflowESet = truncateOnOverflowESet;
		truncateOnOverflow = TRUNCATE_ON_OVERFLOW_EDEFAULT;
		truncateOnOverflowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW, oldTruncateOnOverflow, TRUNCATE_ON_OVERFLOW_EDEFAULT, oldTruncateOnOverflowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTruncateOnOverflow() {
		return truncateOnOverflowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatastylePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DOCUMENT_ROOT__AM_PM:
				return basicSetAmPm(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN_STYLE:
				return basicSetBooleanStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_STYLE:
				return basicSetCurrencyStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_SYMBOL:
				return basicSetCurrencySymbol(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__DATE_STYLE:
				return basicSetDateStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__DAY:
				return basicSetDay(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__DAY_OF_WEEK:
				return basicSetDayOfWeek(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__EMBEDDED_TEXT:
				return basicSetEmbeddedText(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__ERA:
				return basicSetEra(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__FRACTION:
				return basicSetFraction(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__HOURS:
				return basicSetHours(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__MINUTES:
				return basicSetMinutes(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__MONTH:
				return basicSetMonth(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__NUMBER:
				return basicSetNumber(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__NUMBER_STYLE:
				return basicSetNumberStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__PERCENTAGE_STYLE:
				return basicSetPercentageStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__QUARTER:
				return basicSetQuarter(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__SCIENTIFIC_NUMBER:
				return basicSetScientificNumber(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__SECONDS:
				return basicSetSeconds(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__TEXT_CONTENT:
				return basicSetTextContent(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__TEXT_STYLE:
				return basicSetTextStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__TIME_STYLE:
				return basicSetTimeStyle(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__WEEK_OF_YEAR:
				return basicSetWeekOfYear(null, msgs);
			case DatastylePackage.DOCUMENT_ROOT__YEAR:
				return basicSetYear(null, msgs);
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
			case DatastylePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DatastylePackage.DOCUMENT_ROOT__AM_PM:
				return getAmPm();
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN:
				return getBoolean();
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN_STYLE:
				return getBooleanStyle();
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_STYLE:
				return getCurrencyStyle();
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_SYMBOL:
				return getCurrencySymbol();
			case DatastylePackage.DOCUMENT_ROOT__DATE_STYLE:
				return getDateStyle();
			case DatastylePackage.DOCUMENT_ROOT__DAY:
				return getDay();
			case DatastylePackage.DOCUMENT_ROOT__DAY_OF_WEEK:
				return getDayOfWeek();
			case DatastylePackage.DOCUMENT_ROOT__EMBEDDED_TEXT:
				return getEmbeddedText();
			case DatastylePackage.DOCUMENT_ROOT__ERA:
				return getEra();
			case DatastylePackage.DOCUMENT_ROOT__FRACTION:
				return getFraction();
			case DatastylePackage.DOCUMENT_ROOT__HOURS:
				return getHours();
			case DatastylePackage.DOCUMENT_ROOT__MINUTES:
				return getMinutes();
			case DatastylePackage.DOCUMENT_ROOT__MONTH:
				return getMonth();
			case DatastylePackage.DOCUMENT_ROOT__NUMBER:
				return getNumber();
			case DatastylePackage.DOCUMENT_ROOT__NUMBER_STYLE:
				return getNumberStyle();
			case DatastylePackage.DOCUMENT_ROOT__PERCENTAGE_STYLE:
				return getPercentageStyle();
			case DatastylePackage.DOCUMENT_ROOT__QUARTER:
				return getQuarter();
			case DatastylePackage.DOCUMENT_ROOT__SCIENTIFIC_NUMBER:
				return getScientificNumber();
			case DatastylePackage.DOCUMENT_ROOT__SECONDS:
				return getSeconds();
			case DatastylePackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case DatastylePackage.DOCUMENT_ROOT__TEXT_CONTENT:
				return getTextContent();
			case DatastylePackage.DOCUMENT_ROOT__TEXT_STYLE:
				return getTextStyle();
			case DatastylePackage.DOCUMENT_ROOT__TIME_STYLE:
				return getTimeStyle();
			case DatastylePackage.DOCUMENT_ROOT__WEEK_OF_YEAR:
				return getWeekOfYear();
			case DatastylePackage.DOCUMENT_ROOT__YEAR:
				return getYear();
			case DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER:
				return getAutomaticOrder();
			case DatastylePackage.DOCUMENT_ROOT__CALENDAR:
				return getCalendar();
			case DatastylePackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return getDecimalPlaces();
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_REPLACEMENT:
				return getDecimalReplacement();
			case DatastylePackage.DOCUMENT_ROOT__DENOMINATOR_VALUE:
				return getDenominatorValue();
			case DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR:
				return new Double(getDisplayFactor());
			case DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE:
				return getFormatSource();
			case DatastylePackage.DOCUMENT_ROOT__GROUPING:
				return getGrouping();
			case DatastylePackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case DatastylePackage.DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS:
				return getMinDenominatorDigits();
			case DatastylePackage.DOCUMENT_ROOT__MIN_EXPONENT_DIGITS:
				return getMinExponentDigits();
			case DatastylePackage.DOCUMENT_ROOT__MIN_INTEGER_DIGITS:
				return getMinIntegerDigits();
			case DatastylePackage.DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS:
				return getMinNumeratorDigits();
			case DatastylePackage.DOCUMENT_ROOT__POSITION:
				return getPosition();
			case DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM:
				return getPossessiveForm();
			case DatastylePackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case DatastylePackage.DOCUMENT_ROOT__TEXTUAL:
				return getTextual();
			case DatastylePackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_COUNTRY:
				return getTransliterationCountry();
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_FORMAT:
				return getTransliterationFormat();
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE:
				return getTransliterationLanguage();
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE:
				return getTransliterationStyle();
			case DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW:
				return getTruncateOnOverflow();
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
			case DatastylePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__AM_PM:
				setAmPm((AmPmType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN_STYLE:
				setBooleanStyle((BooleanStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_STYLE:
				setCurrencyStyle((CurrencyStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_SYMBOL:
				setCurrencySymbol((CurrencySymbolType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DATE_STYLE:
				setDateStyle((DateStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DAY:
				setDay((DayType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DAY_OF_WEEK:
				setDayOfWeek((DayOfWeekType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__EMBEDDED_TEXT:
				setEmbeddedText((EmbeddedTextType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__ERA:
				setEra((EraType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__FRACTION:
				setFraction((FractionType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__HOURS:
				setHours((HoursType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MINUTES:
				setMinutes((MinutesType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MONTH:
				setMonth((MonthType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER_STYLE:
				setNumberStyle((NumberStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__PERCENTAGE_STYLE:
				setPercentageStyle((PercentageStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__QUARTER:
				setQuarter((QuarterType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__SCIENTIFIC_NUMBER:
				setScientificNumber((ScientificNumberType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__SECONDS:
				setSeconds((SecondsType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT:
				setText((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT_CONTENT:
				setTextContent((TextContentType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT_STYLE:
				setTextStyle((TextStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TIME_STYLE:
				setTimeStyle((TimeStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__WEEK_OF_YEAR:
				setWeekOfYear((WeekOfYearType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__YEAR:
				setYear((YearType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER:
				setAutomaticOrder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__CALENDAR:
				setCalendar(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_REPLACEMENT:
				setDecimalReplacement(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DENOMINATOR_VALUE:
				setDenominatorValue((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR:
				setDisplayFactor(((Double)newValue).doubleValue());
				return;
			case DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE:
				setFormatSource((FormatSourceType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__GROUPING:
				setGrouping((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS:
				setMinDenominatorDigits((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_EXPONENT_DIGITS:
				setMinExponentDigits((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_INTEGER_DIGITS:
				setMinIntegerDigits((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS:
				setMinNumeratorDigits((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM:
				setPossessiveForm((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXTUAL:
				setTextual((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TITLE:
				setTitle(newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_COUNTRY:
				setTransliterationCountry((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_FORMAT:
				setTransliterationFormat((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage((String)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE:
				setTransliterationStyle((TransliterationStyleType)newValue);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW:
				setTruncateOnOverflow((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case DatastylePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DatastylePackage.DOCUMENT_ROOT__AM_PM:
				setAmPm((AmPmType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN_STYLE:
				setBooleanStyle((BooleanStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_STYLE:
				setCurrencyStyle((CurrencyStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_SYMBOL:
				setCurrencySymbol((CurrencySymbolType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DATE_STYLE:
				setDateStyle((DateStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DAY:
				setDay((DayType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DAY_OF_WEEK:
				setDayOfWeek((DayOfWeekType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__EMBEDDED_TEXT:
				setEmbeddedText((EmbeddedTextType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__ERA:
				setEra((EraType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__FRACTION:
				setFraction((FractionType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__HOURS:
				setHours((HoursType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MINUTES:
				setMinutes((MinutesType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MONTH:
				setMonth((MonthType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER_STYLE:
				setNumberStyle((NumberStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__PERCENTAGE_STYLE:
				setPercentageStyle((PercentageStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__QUARTER:
				setQuarter((QuarterType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__SCIENTIFIC_NUMBER:
				setScientificNumber((ScientificNumberType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__SECONDS:
				setSeconds((SecondsType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT_CONTENT:
				setTextContent((TextContentType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXT_STYLE:
				setTextStyle((TextStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TIME_STYLE:
				setTimeStyle((TimeStyleType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__WEEK_OF_YEAR:
				setWeekOfYear((WeekOfYearType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__YEAR:
				setYear((YearType)null);
				return;
			case DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER:
				unsetAutomaticOrder();
				return;
			case DatastylePackage.DOCUMENT_ROOT__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces(DECIMAL_PLACES_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_REPLACEMENT:
				setDecimalReplacement(DECIMAL_REPLACEMENT_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DENOMINATOR_VALUE:
				setDenominatorValue(DENOMINATOR_VALUE_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR:
				unsetDisplayFactor();
				return;
			case DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE:
				unsetFormatSource();
				return;
			case DatastylePackage.DOCUMENT_ROOT__GROUPING:
				unsetGrouping();
				return;
			case DatastylePackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS:
				setMinDenominatorDigits(MIN_DENOMINATOR_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_EXPONENT_DIGITS:
				setMinExponentDigits(MIN_EXPONENT_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_INTEGER_DIGITS:
				setMinIntegerDigits(MIN_INTEGER_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS:
				setMinNumeratorDigits(MIN_NUMERATOR_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM:
				unsetPossessiveForm();
				return;
			case DatastylePackage.DOCUMENT_ROOT__STYLE:
				unsetStyle();
				return;
			case DatastylePackage.DOCUMENT_ROOT__TEXTUAL:
				unsetTextual();
				return;
			case DatastylePackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_COUNTRY:
				setTransliterationCountry(TRANSLITERATION_COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_FORMAT:
				setTransliterationFormat(TRANSLITERATION_FORMAT_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage(TRANSLITERATION_LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE:
				unsetTransliterationStyle();
				return;
			case DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW:
				unsetTruncateOnOverflow();
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
			case DatastylePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DatastylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DatastylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DatastylePackage.DOCUMENT_ROOT__AM_PM:
				return getAmPm() != null;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN:
				return getBoolean() != null;
			case DatastylePackage.DOCUMENT_ROOT__BOOLEAN_STYLE:
				return getBooleanStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_STYLE:
				return getCurrencyStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__CURRENCY_SYMBOL:
				return getCurrencySymbol() != null;
			case DatastylePackage.DOCUMENT_ROOT__DATE_STYLE:
				return getDateStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__DAY:
				return getDay() != null;
			case DatastylePackage.DOCUMENT_ROOT__DAY_OF_WEEK:
				return getDayOfWeek() != null;
			case DatastylePackage.DOCUMENT_ROOT__EMBEDDED_TEXT:
				return getEmbeddedText() != null;
			case DatastylePackage.DOCUMENT_ROOT__ERA:
				return getEra() != null;
			case DatastylePackage.DOCUMENT_ROOT__FRACTION:
				return getFraction() != null;
			case DatastylePackage.DOCUMENT_ROOT__HOURS:
				return getHours() != null;
			case DatastylePackage.DOCUMENT_ROOT__MINUTES:
				return getMinutes() != null;
			case DatastylePackage.DOCUMENT_ROOT__MONTH:
				return getMonth() != null;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER:
				return getNumber() != null;
			case DatastylePackage.DOCUMENT_ROOT__NUMBER_STYLE:
				return getNumberStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__PERCENTAGE_STYLE:
				return getPercentageStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__QUARTER:
				return getQuarter() != null;
			case DatastylePackage.DOCUMENT_ROOT__SCIENTIFIC_NUMBER:
				return getScientificNumber() != null;
			case DatastylePackage.DOCUMENT_ROOT__SECONDS:
				return getSeconds() != null;
			case DatastylePackage.DOCUMENT_ROOT__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case DatastylePackage.DOCUMENT_ROOT__TEXT_CONTENT:
				return getTextContent() != null;
			case DatastylePackage.DOCUMENT_ROOT__TEXT_STYLE:
				return getTextStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__TIME_STYLE:
				return getTimeStyle() != null;
			case DatastylePackage.DOCUMENT_ROOT__WEEK_OF_YEAR:
				return getWeekOfYear() != null;
			case DatastylePackage.DOCUMENT_ROOT__YEAR:
				return getYear() != null;
			case DatastylePackage.DOCUMENT_ROOT__AUTOMATIC_ORDER:
				return isSetAutomaticOrder();
			case DatastylePackage.DOCUMENT_ROOT__CALENDAR:
				return CALENDAR_EDEFAULT == null ? calendar != null : !CALENDAR_EDEFAULT.equals(calendar);
			case DatastylePackage.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return DECIMAL_PLACES_EDEFAULT == null ? decimalPlaces != null : !DECIMAL_PLACES_EDEFAULT.equals(decimalPlaces);
			case DatastylePackage.DOCUMENT_ROOT__DECIMAL_REPLACEMENT:
				return DECIMAL_REPLACEMENT_EDEFAULT == null ? decimalReplacement != null : !DECIMAL_REPLACEMENT_EDEFAULT.equals(decimalReplacement);
			case DatastylePackage.DOCUMENT_ROOT__DENOMINATOR_VALUE:
				return DENOMINATOR_VALUE_EDEFAULT == null ? denominatorValue != null : !DENOMINATOR_VALUE_EDEFAULT.equals(denominatorValue);
			case DatastylePackage.DOCUMENT_ROOT__DISPLAY_FACTOR:
				return isSetDisplayFactor();
			case DatastylePackage.DOCUMENT_ROOT__FORMAT_SOURCE:
				return isSetFormatSource();
			case DatastylePackage.DOCUMENT_ROOT__GROUPING:
				return isSetGrouping();
			case DatastylePackage.DOCUMENT_ROOT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DatastylePackage.DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS:
				return MIN_DENOMINATOR_DIGITS_EDEFAULT == null ? minDenominatorDigits != null : !MIN_DENOMINATOR_DIGITS_EDEFAULT.equals(minDenominatorDigits);
			case DatastylePackage.DOCUMENT_ROOT__MIN_EXPONENT_DIGITS:
				return MIN_EXPONENT_DIGITS_EDEFAULT == null ? minExponentDigits != null : !MIN_EXPONENT_DIGITS_EDEFAULT.equals(minExponentDigits);
			case DatastylePackage.DOCUMENT_ROOT__MIN_INTEGER_DIGITS:
				return MIN_INTEGER_DIGITS_EDEFAULT == null ? minIntegerDigits != null : !MIN_INTEGER_DIGITS_EDEFAULT.equals(minIntegerDigits);
			case DatastylePackage.DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS:
				return MIN_NUMERATOR_DIGITS_EDEFAULT == null ? minNumeratorDigits != null : !MIN_NUMERATOR_DIGITS_EDEFAULT.equals(minNumeratorDigits);
			case DatastylePackage.DOCUMENT_ROOT__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case DatastylePackage.DOCUMENT_ROOT__POSSESSIVE_FORM:
				return isSetPossessiveForm();
			case DatastylePackage.DOCUMENT_ROOT__STYLE:
				return isSetStyle();
			case DatastylePackage.DOCUMENT_ROOT__TEXTUAL:
				return isSetTextual();
			case DatastylePackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_COUNTRY:
				return TRANSLITERATION_COUNTRY_EDEFAULT == null ? transliterationCountry != null : !TRANSLITERATION_COUNTRY_EDEFAULT.equals(transliterationCountry);
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_FORMAT:
				return TRANSLITERATION_FORMAT_EDEFAULT == null ? transliterationFormat != null : !TRANSLITERATION_FORMAT_EDEFAULT.equals(transliterationFormat);
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE:
				return TRANSLITERATION_LANGUAGE_EDEFAULT == null ? transliterationLanguage != null : !TRANSLITERATION_LANGUAGE_EDEFAULT.equals(transliterationLanguage);
			case DatastylePackage.DOCUMENT_ROOT__TRANSLITERATION_STYLE:
				return isSetTransliterationStyle();
			case DatastylePackage.DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW:
				return isSetTruncateOnOverflow();
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
		result.append(", automaticOrder: ");
		if (automaticOrderESet) result.append(automaticOrder); else result.append("<unset>");
		result.append(", calendar: ");
		result.append(calendar);
		result.append(", country: ");
		result.append(country);
		result.append(", decimalPlaces: ");
		result.append(decimalPlaces);
		result.append(", decimalReplacement: ");
		result.append(decimalReplacement);
		result.append(", denominatorValue: ");
		result.append(denominatorValue);
		result.append(", displayFactor: ");
		if (displayFactorESet) result.append(displayFactor); else result.append("<unset>");
		result.append(", formatSource: ");
		if (formatSourceESet) result.append(formatSource); else result.append("<unset>");
		result.append(", grouping: ");
		if (groupingESet) result.append(grouping); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", minDenominatorDigits: ");
		result.append(minDenominatorDigits);
		result.append(", minExponentDigits: ");
		result.append(minExponentDigits);
		result.append(", minIntegerDigits: ");
		result.append(minIntegerDigits);
		result.append(", minNumeratorDigits: ");
		result.append(minNumeratorDigits);
		result.append(", position: ");
		result.append(position);
		result.append(", possessiveForm: ");
		if (possessiveFormESet) result.append(possessiveForm); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", textual: ");
		if (textualESet) result.append(textual); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", transliterationCountry: ");
		result.append(transliterationCountry);
		result.append(", transliterationFormat: ");
		result.append(transliterationFormat);
		result.append(", transliterationLanguage: ");
		result.append(transliterationLanguage);
		result.append(", transliterationStyle: ");
		if (transliterationStyleESet) result.append(transliterationStyle); else result.append("<unset>");
		result.append(", truncateOnOverflow: ");
		if (truncateOnOverflowESet) result.append(truncateOnOverflow); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
