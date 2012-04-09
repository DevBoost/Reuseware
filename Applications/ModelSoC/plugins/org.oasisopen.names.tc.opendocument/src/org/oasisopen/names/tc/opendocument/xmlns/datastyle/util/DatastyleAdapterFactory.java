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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage
 * @generated
 */
public class DatastyleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatastylePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastyleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatastylePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatastyleSwitch<Adapter> modelSwitch =
		new DatastyleSwitch<Adapter>() {
			@Override
			public Adapter caseAmPmType(AmPmType object) {
				return createAmPmTypeAdapter();
			}
			@Override
			public Adapter caseBooleanStyleType(BooleanStyleType object) {
				return createBooleanStyleTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseCurrencyStyleType(CurrencyStyleType object) {
				return createCurrencyStyleTypeAdapter();
			}
			@Override
			public Adapter caseCurrencySymbolType(CurrencySymbolType object) {
				return createCurrencySymbolTypeAdapter();
			}
			@Override
			public Adapter caseDateStyleType(DateStyleType object) {
				return createDateStyleTypeAdapter();
			}
			@Override
			public Adapter caseDayOfWeekType(DayOfWeekType object) {
				return createDayOfWeekTypeAdapter();
			}
			@Override
			public Adapter caseDayType(DayType object) {
				return createDayTypeAdapter();
			}
			@Override
			public Adapter caseEmbeddedTextType(EmbeddedTextType object) {
				return createEmbeddedTextTypeAdapter();
			}
			@Override
			public Adapter caseEraType(EraType object) {
				return createEraTypeAdapter();
			}
			@Override
			public Adapter caseFractionType(FractionType object) {
				return createFractionTypeAdapter();
			}
			@Override
			public Adapter caseHoursType(HoursType object) {
				return createHoursTypeAdapter();
			}
			@Override
			public Adapter caseMinutesType(MinutesType object) {
				return createMinutesTypeAdapter();
			}
			@Override
			public Adapter caseMonthType(MonthType object) {
				return createMonthTypeAdapter();
			}
			@Override
			public Adapter caseNumberStyleType(NumberStyleType object) {
				return createNumberStyleTypeAdapter();
			}
			@Override
			public Adapter caseNumberType(NumberType object) {
				return createNumberTypeAdapter();
			}
			@Override
			public Adapter casePercentageStyleType(PercentageStyleType object) {
				return createPercentageStyleTypeAdapter();
			}
			@Override
			public Adapter caseQuarterType(QuarterType object) {
				return createQuarterTypeAdapter();
			}
			@Override
			public Adapter caseScientificNumberType(ScientificNumberType object) {
				return createScientificNumberTypeAdapter();
			}
			@Override
			public Adapter caseSecondsType(SecondsType object) {
				return createSecondsTypeAdapter();
			}
			@Override
			public Adapter caseTextContentType(TextContentType object) {
				return createTextContentTypeAdapter();
			}
			@Override
			public Adapter caseTextStyleType(TextStyleType object) {
				return createTextStyleTypeAdapter();
			}
			@Override
			public Adapter caseTimeStyleType(TimeStyleType object) {
				return createTimeStyleTypeAdapter();
			}
			@Override
			public Adapter caseWeekOfYearType(WeekOfYearType object) {
				return createWeekOfYearTypeAdapter();
			}
			@Override
			public Adapter caseYearType(YearType object) {
				return createYearTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType <em>Am Pm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType
	 * @generated
	 */
	public Adapter createAmPmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType <em>Boolean Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType
	 * @generated
	 */
	public Adapter createBooleanStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType <em>Currency Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType
	 * @generated
	 */
	public Adapter createCurrencyStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType <em>Currency Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType
	 * @generated
	 */
	public Adapter createCurrencySymbolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType <em>Date Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType
	 * @generated
	 */
	public Adapter createDateStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType <em>Day Of Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType
	 * @generated
	 */
	public Adapter createDayOfWeekTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType
	 * @generated
	 */
	public Adapter createDayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType <em>Embedded Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType
	 * @generated
	 */
	public Adapter createEmbeddedTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType <em>Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType
	 * @generated
	 */
	public Adapter createEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType <em>Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType
	 * @generated
	 */
	public Adapter createFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType <em>Hours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType
	 * @generated
	 */
	public Adapter createHoursTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType <em>Minutes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType
	 * @generated
	 */
	public Adapter createMinutesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType <em>Month Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType
	 * @generated
	 */
	public Adapter createMonthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType <em>Number Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType
	 * @generated
	 */
	public Adapter createNumberStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType
	 * @generated
	 */
	public Adapter createNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType <em>Percentage Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType
	 * @generated
	 */
	public Adapter createPercentageStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType <em>Quarter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType
	 * @generated
	 */
	public Adapter createQuarterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType <em>Scientific Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType
	 * @generated
	 */
	public Adapter createScientificNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType <em>Seconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType
	 * @generated
	 */
	public Adapter createSecondsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType <em>Text Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType
	 * @generated
	 */
	public Adapter createTextContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType <em>Text Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType
	 * @generated
	 */
	public Adapter createTextStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType <em>Time Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType
	 * @generated
	 */
	public Adapter createTimeStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType <em>Week Of Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType
	 * @generated
	 */
	public Adapter createWeekOfYearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType
	 * @generated
	 */
	public Adapter createYearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatastyleAdapterFactory
