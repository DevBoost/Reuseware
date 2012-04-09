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
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastyleFactory;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatastyleFactoryImpl extends EFactoryImpl implements DatastyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatastyleFactory init() {
		try {
			DatastyleFactory theDatastyleFactory = (DatastyleFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0"); 
			if (theDatastyleFactory != null) {
				return theDatastyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatastyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatastylePackage.AM_PM_TYPE: return createAmPmType();
			case DatastylePackage.BOOLEAN_STYLE_TYPE: return createBooleanStyleType();
			case DatastylePackage.BOOLEAN_TYPE: return createBooleanType();
			case DatastylePackage.CURRENCY_STYLE_TYPE: return createCurrencyStyleType();
			case DatastylePackage.CURRENCY_SYMBOL_TYPE: return createCurrencySymbolType();
			case DatastylePackage.DATE_STYLE_TYPE: return createDateStyleType();
			case DatastylePackage.DAY_OF_WEEK_TYPE: return createDayOfWeekType();
			case DatastylePackage.DAY_TYPE: return createDayType();
			case DatastylePackage.EMBEDDED_TEXT_TYPE: return createEmbeddedTextType();
			case DatastylePackage.ERA_TYPE: return createEraType();
			case DatastylePackage.FRACTION_TYPE: return createFractionType();
			case DatastylePackage.HOURS_TYPE: return createHoursType();
			case DatastylePackage.MINUTES_TYPE: return createMinutesType();
			case DatastylePackage.MONTH_TYPE: return createMonthType();
			case DatastylePackage.NUMBER_STYLE_TYPE: return createNumberStyleType();
			case DatastylePackage.NUMBER_TYPE: return createNumberType();
			case DatastylePackage.PERCENTAGE_STYLE_TYPE: return createPercentageStyleType();
			case DatastylePackage.QUARTER_TYPE: return createQuarterType();
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE: return createScientificNumberType();
			case DatastylePackage.SECONDS_TYPE: return createSecondsType();
			case DatastylePackage.TEXT_CONTENT_TYPE: return createTextContentType();
			case DatastylePackage.TEXT_STYLE_TYPE: return createTextStyleType();
			case DatastylePackage.TIME_STYLE_TYPE: return createTimeStyleType();
			case DatastylePackage.WEEK_OF_YEAR_TYPE: return createWeekOfYearType();
			case DatastylePackage.YEAR_TYPE: return createYearType();
			case DatastylePackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatastylePackage.CALENDAR_TYPE_MEMBER1:
				return createCalendarTypeMember1FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2:
				return createCalendarTypeMember2FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3:
				return createCalendarTypeMember3FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4:
				return createCalendarTypeMember4FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5:
				return createCalendarTypeMember5FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6:
				return createCalendarTypeMember6FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7:
				return createCalendarTypeMember7FromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8:
				return createCalendarTypeMember8FromString(eDataType, initialValue);
			case DatastylePackage.FORMAT_SOURCE_TYPE:
				return createFormatSourceTypeFromString(eDataType, initialValue);
			case DatastylePackage.STYLE_TYPE:
				return createStyleTypeFromString(eDataType, initialValue);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE:
				return createTransliterationStyleTypeFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE:
				return createCalendarTypeFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER1_OBJECT:
				return createCalendarTypeMember1ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2_OBJECT:
				return createCalendarTypeMember2ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3_OBJECT:
				return createCalendarTypeMember3ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4_OBJECT:
				return createCalendarTypeMember4ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5_OBJECT:
				return createCalendarTypeMember5ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6_OBJECT:
				return createCalendarTypeMember6ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7_OBJECT:
				return createCalendarTypeMember7ObjectFromString(eDataType, initialValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8_OBJECT:
				return createCalendarTypeMember8ObjectFromString(eDataType, initialValue);
			case DatastylePackage.FORMAT_SOURCE_TYPE_OBJECT:
				return createFormatSourceTypeObjectFromString(eDataType, initialValue);
			case DatastylePackage.STYLE_TYPE_OBJECT:
				return createStyleTypeObjectFromString(eDataType, initialValue);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE_OBJECT:
				return createTransliterationStyleTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatastylePackage.CALENDAR_TYPE_MEMBER1:
				return convertCalendarTypeMember1ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2:
				return convertCalendarTypeMember2ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3:
				return convertCalendarTypeMember3ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4:
				return convertCalendarTypeMember4ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5:
				return convertCalendarTypeMember5ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6:
				return convertCalendarTypeMember6ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7:
				return convertCalendarTypeMember7ToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8:
				return convertCalendarTypeMember8ToString(eDataType, instanceValue);
			case DatastylePackage.FORMAT_SOURCE_TYPE:
				return convertFormatSourceTypeToString(eDataType, instanceValue);
			case DatastylePackage.STYLE_TYPE:
				return convertStyleTypeToString(eDataType, instanceValue);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE:
				return convertTransliterationStyleTypeToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE:
				return convertCalendarTypeToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER1_OBJECT:
				return convertCalendarTypeMember1ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER2_OBJECT:
				return convertCalendarTypeMember2ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER3_OBJECT:
				return convertCalendarTypeMember3ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER4_OBJECT:
				return convertCalendarTypeMember4ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER5_OBJECT:
				return convertCalendarTypeMember5ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER6_OBJECT:
				return convertCalendarTypeMember6ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER7_OBJECT:
				return convertCalendarTypeMember7ObjectToString(eDataType, instanceValue);
			case DatastylePackage.CALENDAR_TYPE_MEMBER8_OBJECT:
				return convertCalendarTypeMember8ObjectToString(eDataType, instanceValue);
			case DatastylePackage.FORMAT_SOURCE_TYPE_OBJECT:
				return convertFormatSourceTypeObjectToString(eDataType, instanceValue);
			case DatastylePackage.STYLE_TYPE_OBJECT:
				return convertStyleTypeObjectToString(eDataType, instanceValue);
			case DatastylePackage.TRANSLITERATION_STYLE_TYPE_OBJECT:
				return convertTransliterationStyleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmPmType createAmPmType() {
		AmPmTypeImpl amPmType = new AmPmTypeImpl();
		return amPmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanStyleType createBooleanStyleType() {
		BooleanStyleTypeImpl booleanStyleType = new BooleanStyleTypeImpl();
		return booleanStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyStyleType createCurrencyStyleType() {
		CurrencyStyleTypeImpl currencyStyleType = new CurrencyStyleTypeImpl();
		return currencyStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolType createCurrencySymbolType() {
		CurrencySymbolTypeImpl currencySymbolType = new CurrencySymbolTypeImpl();
		return currencySymbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateStyleType createDateStyleType() {
		DateStyleTypeImpl dateStyleType = new DateStyleTypeImpl();
		return dateStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeekType createDayOfWeekType() {
		DayOfWeekTypeImpl dayOfWeekType = new DayOfWeekTypeImpl();
		return dayOfWeekType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType createDayType() {
		DayTypeImpl dayType = new DayTypeImpl();
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedTextType createEmbeddedTextType() {
		EmbeddedTextTypeImpl embeddedTextType = new EmbeddedTextTypeImpl();
		return embeddedTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EraType createEraType() {
		EraTypeImpl eraType = new EraTypeImpl();
		return eraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FractionType createFractionType() {
		FractionTypeImpl fractionType = new FractionTypeImpl();
		return fractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoursType createHoursType() {
		HoursTypeImpl hoursType = new HoursTypeImpl();
		return hoursType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinutesType createMinutesType() {
		MinutesTypeImpl minutesType = new MinutesTypeImpl();
		return minutesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthType createMonthType() {
		MonthTypeImpl monthType = new MonthTypeImpl();
		return monthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberStyleType createNumberStyleType() {
		NumberStyleTypeImpl numberStyleType = new NumberStyleTypeImpl();
		return numberStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType createNumberType() {
		NumberTypeImpl numberType = new NumberTypeImpl();
		return numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageStyleType createPercentageStyleType() {
		PercentageStyleTypeImpl percentageStyleType = new PercentageStyleTypeImpl();
		return percentageStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuarterType createQuarterType() {
		QuarterTypeImpl quarterType = new QuarterTypeImpl();
		return quarterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScientificNumberType createScientificNumberType() {
		ScientificNumberTypeImpl scientificNumberType = new ScientificNumberTypeImpl();
		return scientificNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondsType createSecondsType() {
		SecondsTypeImpl secondsType = new SecondsTypeImpl();
		return secondsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextContentType createTextContentType() {
		TextContentTypeImpl textContentType = new TextContentTypeImpl();
		return textContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleType createTextStyleType() {
		TextStyleTypeImpl textStyleType = new TextStyleTypeImpl();
		return textStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStyleType createTimeStyleType() {
		TimeStyleTypeImpl timeStyleType = new TimeStyleTypeImpl();
		return timeStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekOfYearType createWeekOfYearType() {
		WeekOfYearTypeImpl weekOfYearType = new WeekOfYearTypeImpl();
		return weekOfYearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearType createYearType() {
		YearTypeImpl yearType = new YearTypeImpl();
		return yearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember1 createCalendarTypeMember1FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember1 result = CalendarTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember2 createCalendarTypeMember2FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember2 result = CalendarTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember3 createCalendarTypeMember3FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember3 result = CalendarTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember4 createCalendarTypeMember4FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember4 result = CalendarTypeMember4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember5 createCalendarTypeMember5FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember5 result = CalendarTypeMember5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember6 createCalendarTypeMember6FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember6 result = CalendarTypeMember6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember7 createCalendarTypeMember7FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember7 result = CalendarTypeMember7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember8 createCalendarTypeMember8FromString(EDataType eDataType, String initialValue) {
		CalendarTypeMember8 result = CalendarTypeMember8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatSourceType createFormatSourceTypeFromString(EDataType eDataType, String initialValue) {
		FormatSourceType result = FormatSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeFromString(EDataType eDataType, String initialValue) {
		StyleType result = StyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransliterationStyleType createTransliterationStyleTypeFromString(EDataType eDataType, String initialValue) {
		TransliterationStyleType result = TransliterationStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransliterationStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCalendarTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember1FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember2FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember3FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember4FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember5FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember6FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember7FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCalendarTypeMember8FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getString().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember1ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember2ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember3ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember4ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember5ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember6ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember7ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8.isInstance(instanceValue)) {
			try {
				String value = convertCalendarTypeMember8ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember1 createCalendarTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember1FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember1ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember2 createCalendarTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember2FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember2ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember3 createCalendarTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember3FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember3ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember4 createCalendarTypeMember4ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember4FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember4ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember4ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember5 createCalendarTypeMember5ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember5FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember5ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember5ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember6 createCalendarTypeMember6ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember6FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember6ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember6ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember7 createCalendarTypeMember7ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember7FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember7ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember7ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER7, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarTypeMember8 createCalendarTypeMember8ObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarTypeMember8FromString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarTypeMember8ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarTypeMember8ToString(DatastylePackage.Literals.CALENDAR_TYPE_MEMBER8, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatSourceType createFormatSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatSourceTypeFromString(DatastylePackage.Literals.FORMAT_SOURCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatSourceTypeToString(DatastylePackage.Literals.FORMAT_SOURCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleTypeFromString(DatastylePackage.Literals.STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleTypeToString(DatastylePackage.Literals.STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransliterationStyleType createTransliterationStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransliterationStyleTypeFromString(DatastylePackage.Literals.TRANSLITERATION_STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransliterationStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransliterationStyleTypeToString(DatastylePackage.Literals.TRANSLITERATION_STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastylePackage getDatastylePackage() {
		return (DatastylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatastylePackage getPackage() {
		return DatastylePackage.eINSTANCE;
	}

} //DatastyleFactoryImpl
