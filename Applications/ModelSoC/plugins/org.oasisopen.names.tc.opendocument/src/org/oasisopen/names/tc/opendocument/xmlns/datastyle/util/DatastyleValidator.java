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
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage
 * @generated
 */
public class DatastyleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatastyleValidator INSTANCE = new DatastyleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.datastyle";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextValidator textValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastyleValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DatastylePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DatastylePackage.AM_PM_TYPE:
				return validateAmPmType((AmPmType)value, diagnostics, context);
			case DatastylePackage.BOOLEAN_STYLE_TYPE:
				return validateBooleanStyleType((BooleanStyleType)value, diagnostics, context);
			case DatastylePackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case DatastylePackage.CURRENCY_STYLE_TYPE:
				return validateCurrencyStyleType((CurrencyStyleType)value, diagnostics, context);
			case DatastylePackage.CURRENCY_SYMBOL_TYPE:
				return validateCurrencySymbolType((CurrencySymbolType)value, diagnostics, context);
			case DatastylePackage.DATE_STYLE_TYPE:
				return validateDateStyleType((DateStyleType)value, diagnostics, context);
			case DatastylePackage.DAY_OF_WEEK_TYPE:
				return validateDayOfWeekType((DayOfWeekType)value, diagnostics, context);
			case DatastylePackage.DAY_TYPE:
				return validateDayType((DayType)value, diagnostics, context);
			case DatastylePackage.EMBEDDED_TEXT_TYPE:
				return validateEmbeddedTextType((EmbeddedTextType)value, diagnostics, context);
			case DatastylePackage.ERA_TYPE:
				return validateEraType((EraType)value, diagnostics, context);
			case DatastylePackage.FRACTION_TYPE:
				return validateFractionType((FractionType)value, diagnostics, context);
			case DatastylePackage.HOURS_TYPE:
				return validateHoursType((HoursType)value, diagnostics, context);
			case DatastylePackage.MINUTES_TYPE:
				return validateMinutesType((MinutesType)value, diagnostics, context);
			case DatastylePackage.MONTH_TYPE:
				return validateMonthType((MonthType)value, diagnostics, context);
			case DatastylePackage.NUMBER_STYLE_TYPE:
				return validateNumberStyleType((NumberStyleType)value, diagnostics, context);
			case DatastylePackage.NUMBER_TYPE:
				return validateNumberType((NumberType)value, diagnostics, context);
			case DatastylePackage.PERCENTAGE_STYLE_TYPE:
				return validatePercentageStyleType((PercentageStyleType)value, diagnostics, context);
			case DatastylePackage.QUARTER_TYPE:
				return validateQuarterType((QuarterType)value, diagnostics, context);
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE:
				return validateScientificNumberType((ScientificNumberType)value, diagnostics, context);
			case DatastylePackage.SECONDS_TYPE:
				return validateSecondsType((SecondsType)value, diagnostics, context);
			case DatastylePackage.TEXT_CONTENT_TYPE:
				return validateTextContentType((TextContentType)value, diagnostics, context);
			case DatastylePackage.TEXT_STYLE_TYPE:
				return validateTextStyleType((TextStyleType)value, diagnostics, context);
			case DatastylePackage.TIME_STYLE_TYPE:
				return validateTimeStyleType((TimeStyleType)value, diagnostics, context);
			case DatastylePackage.WEEK_OF_YEAR_TYPE:
				return validateWeekOfYearType((WeekOfYearType)value, diagnostics, context);
			case DatastylePackage.YEAR_TYPE:
				return validateYearType((YearType)value, diagnostics, context);
			case DatastylePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER1:
				return validateCalendarTypeMember1((CalendarTypeMember1)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2:
				return validateCalendarTypeMember2((CalendarTypeMember2)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3:
				return validateCalendarTypeMember3((CalendarTypeMember3)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4:
				return validateCalendarTypeMember4((CalendarTypeMember4)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5:
				return validateCalendarTypeMember5((CalendarTypeMember5)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6:
				return validateCalendarTypeMember6((CalendarTypeMember6)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7:
				return validateCalendarTypeMember7((CalendarTypeMember7)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8:
				return validateCalendarTypeMember8((CalendarTypeMember8)value, diagnostics, context);
			case DatastylePackage.FORMAT_SOURCE_TYPE:
				return validateFormatSourceType((FormatSourceType)value, diagnostics, context);
			case DatastylePackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE:
				return validateTransliterationStyleType((TransliterationStyleType)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE:
				return validateCalendarType(value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER1_OBJECT:
				return validateCalendarTypeMember1Object((CalendarTypeMember1)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2_OBJECT:
				return validateCalendarTypeMember2Object((CalendarTypeMember2)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3_OBJECT:
				return validateCalendarTypeMember3Object((CalendarTypeMember3)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4_OBJECT:
				return validateCalendarTypeMember4Object((CalendarTypeMember4)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5_OBJECT:
				return validateCalendarTypeMember5Object((CalendarTypeMember5)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6_OBJECT:
				return validateCalendarTypeMember6Object((CalendarTypeMember6)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7_OBJECT:
				return validateCalendarTypeMember7Object((CalendarTypeMember7)value, diagnostics, context);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8_OBJECT:
				return validateCalendarTypeMember8Object((CalendarTypeMember8)value, diagnostics, context);
			case DatastylePackage.FORMAT_SOURCE_TYPE_OBJECT:
				return validateFormatSourceTypeObject((FormatSourceType)value, diagnostics, context);
			case DatastylePackage.STYLE_TYPE_OBJECT:
				return validateStyleTypeObject((StyleType)value, diagnostics, context);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE_OBJECT:
				return validateTransliterationStyleTypeObject((TransliterationStyleType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAmPmType(AmPmType amPmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amPmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanStyleType(BooleanStyleType booleanStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyStyleType(CurrencyStyleType currencyStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencyStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencySymbolType(CurrencySymbolType currencySymbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencySymbolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateStyleType(DateStyleType dateStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeekType(DayOfWeekType dayOfWeekType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dayOfWeekType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayType(DayType dayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedTextType(EmbeddedTextType embeddedTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(embeddedTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEraType(EraType eraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eraType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFractionType(FractionType fractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoursType(HoursType hoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoursType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinutesType(MinutesType minutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minutesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthType(MonthType monthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberStyleType(NumberStyleType numberStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberType(NumberType numberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageStyleType(PercentageStyleType percentageStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(percentageStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuarterType(QuarterType quarterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quarterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScientificNumberType(ScientificNumberType scientificNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scientificNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondsType(SecondsType secondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextContentType(TextContentType textContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleType(TextStyleType textStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStyleType(TimeStyleType timeStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekOfYearType(WeekOfYearType weekOfYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weekOfYearType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYearType(YearType yearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yearType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember1(CalendarTypeMember1 calendarTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember2(CalendarTypeMember2 calendarTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember3(CalendarTypeMember3 calendarTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember4(CalendarTypeMember4 calendarTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember5(CalendarTypeMember5 calendarTypeMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember6(CalendarTypeMember6 calendarTypeMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember7(CalendarTypeMember7 calendarTypeMember7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember8(CalendarTypeMember8 calendarTypeMember8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatSourceType(FormatSourceType formatSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransliterationStyleType(TransliterationStyleType transliterationStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarType(Object calendarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCalendarType_MemberTypes(calendarType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Calendar Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarType_MemberTypes(Object calendarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getString().isInstance(calendarType)) {
				if (textValidator.validateString((String)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1.isInstance(calendarType)) {
				if (validateCalendarTypeMember1((CalendarTypeMember1)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2.isInstance(calendarType)) {
				if (validateCalendarTypeMember2((CalendarTypeMember2)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3.isInstance(calendarType)) {
				if (validateCalendarTypeMember3((CalendarTypeMember3)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4.isInstance(calendarType)) {
				if (validateCalendarTypeMember4((CalendarTypeMember4)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5.isInstance(calendarType)) {
				if (validateCalendarTypeMember5((CalendarTypeMember5)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6.isInstance(calendarType)) {
				if (validateCalendarTypeMember6((CalendarTypeMember6)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7.isInstance(calendarType)) {
				if (validateCalendarTypeMember7((CalendarTypeMember7)calendarType, tempDiagnostics, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8.isInstance(calendarType)) {
				if (validateCalendarTypeMember8((CalendarTypeMember8)calendarType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getString().isInstance(calendarType)) {
				if (textValidator.validateString((String)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1.isInstance(calendarType)) {
				if (validateCalendarTypeMember1((CalendarTypeMember1)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2.isInstance(calendarType)) {
				if (validateCalendarTypeMember2((CalendarTypeMember2)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3.isInstance(calendarType)) {
				if (validateCalendarTypeMember3((CalendarTypeMember3)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4.isInstance(calendarType)) {
				if (validateCalendarTypeMember4((CalendarTypeMember4)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5.isInstance(calendarType)) {
				if (validateCalendarTypeMember5((CalendarTypeMember5)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6.isInstance(calendarType)) {
				if (validateCalendarTypeMember6((CalendarTypeMember6)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7.isInstance(calendarType)) {
				if (validateCalendarTypeMember7((CalendarTypeMember7)calendarType, null, context)) return true;
			}
			if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8.isInstance(calendarType)) {
				if (validateCalendarTypeMember8((CalendarTypeMember8)calendarType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember1Object(CalendarTypeMember1 calendarTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember2Object(CalendarTypeMember2 calendarTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember3Object(CalendarTypeMember3 calendarTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember4Object(CalendarTypeMember4 calendarTypeMember4Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember5Object(CalendarTypeMember5 calendarTypeMember5Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember6Object(CalendarTypeMember6 calendarTypeMember6Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember7Object(CalendarTypeMember7 calendarTypeMember7Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarTypeMember8Object(CalendarTypeMember8 calendarTypeMember8Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatSourceTypeObject(FormatSourceType formatSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTypeObject(StyleType styleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransliterationStyleTypeObject(TransliterationStyleType transliterationStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DatastyleValidator
