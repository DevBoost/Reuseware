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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage
 * @generated
 */
public class DatastyleSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatastylePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastyleSwitch() {
		if (modelPackage == null) {
			modelPackage = DatastylePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatastylePackage.AM_PM_TYPE: {
				AmPmType amPmType = (AmPmType)theEObject;
				T result = caseAmPmType(amPmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.BOOLEAN_STYLE_TYPE: {
				BooleanStyleType booleanStyleType = (BooleanStyleType)theEObject;
				T result = caseBooleanStyleType(booleanStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.CURRENCY_STYLE_TYPE: {
				CurrencyStyleType currencyStyleType = (CurrencyStyleType)theEObject;
				T result = caseCurrencyStyleType(currencyStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.CURRENCY_SYMBOL_TYPE: {
				CurrencySymbolType currencySymbolType = (CurrencySymbolType)theEObject;
				T result = caseCurrencySymbolType(currencySymbolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.DATE_STYLE_TYPE: {
				DateStyleType dateStyleType = (DateStyleType)theEObject;
				T result = caseDateStyleType(dateStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.DAY_OF_WEEK_TYPE: {
				DayOfWeekType dayOfWeekType = (DayOfWeekType)theEObject;
				T result = caseDayOfWeekType(dayOfWeekType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.DAY_TYPE: {
				DayType dayType = (DayType)theEObject;
				T result = caseDayType(dayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.EMBEDDED_TEXT_TYPE: {
				EmbeddedTextType embeddedTextType = (EmbeddedTextType)theEObject;
				T result = caseEmbeddedTextType(embeddedTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.ERA_TYPE: {
				EraType eraType = (EraType)theEObject;
				T result = caseEraType(eraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.FRACTION_TYPE: {
				FractionType fractionType = (FractionType)theEObject;
				T result = caseFractionType(fractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.HOURS_TYPE: {
				HoursType hoursType = (HoursType)theEObject;
				T result = caseHoursType(hoursType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.MINUTES_TYPE: {
				MinutesType minutesType = (MinutesType)theEObject;
				T result = caseMinutesType(minutesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.MONTH_TYPE: {
				MonthType monthType = (MonthType)theEObject;
				T result = caseMonthType(monthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.NUMBER_STYLE_TYPE: {
				NumberStyleType numberStyleType = (NumberStyleType)theEObject;
				T result = caseNumberStyleType(numberStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.NUMBER_TYPE: {
				NumberType numberType = (NumberType)theEObject;
				T result = caseNumberType(numberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.PERCENTAGE_STYLE_TYPE: {
				PercentageStyleType percentageStyleType = (PercentageStyleType)theEObject;
				T result = casePercentageStyleType(percentageStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.QUARTER_TYPE: {
				QuarterType quarterType = (QuarterType)theEObject;
				T result = caseQuarterType(quarterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE: {
				ScientificNumberType scientificNumberType = (ScientificNumberType)theEObject;
				T result = caseScientificNumberType(scientificNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.SECONDS_TYPE: {
				SecondsType secondsType = (SecondsType)theEObject;
				T result = caseSecondsType(secondsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.TEXT_CONTENT_TYPE: {
				TextContentType textContentType = (TextContentType)theEObject;
				T result = caseTextContentType(textContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.TEXT_STYLE_TYPE: {
				TextStyleType textStyleType = (TextStyleType)theEObject;
				T result = caseTextStyleType(textStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.TIME_STYLE_TYPE: {
				TimeStyleType timeStyleType = (TimeStyleType)theEObject;
				T result = caseTimeStyleType(timeStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.WEEK_OF_YEAR_TYPE: {
				WeekOfYearType weekOfYearType = (WeekOfYearType)theEObject;
				T result = caseWeekOfYearType(weekOfYearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.YEAR_TYPE: {
				YearType yearType = (YearType)theEObject;
				T result = caseYearType(yearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatastylePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Am Pm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Am Pm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmPmType(AmPmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanStyleType(BooleanStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyStyleType(CurrencyStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Symbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Symbol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencySymbolType(CurrencySymbolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateStyleType(DateStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Of Week Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Of Week Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayOfWeekType(DayOfWeekType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayType(DayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedTextType(EmbeddedTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Era Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Era Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEraType(EraType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFractionType(FractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hours Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hours Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoursType(HoursType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minutes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minutes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinutesType(MinutesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthType(MonthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberStyleType(NumberStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberType(NumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percentage Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percentage Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentageStyleType(PercentageStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quarter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quarter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuarterType(QuarterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scientific Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scientific Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScientificNumberType(ScientificNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seconds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seconds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondsType(SecondsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContentType(TextContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextStyleType(TextStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStyleType(TimeStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Week Of Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Week Of Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekOfYearType(WeekOfYearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearType(YearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DatastyleSwitch
