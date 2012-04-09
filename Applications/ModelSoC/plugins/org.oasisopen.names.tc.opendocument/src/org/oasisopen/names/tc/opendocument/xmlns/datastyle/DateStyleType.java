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
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDay <em>Day</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMonth <em>Month</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getYear <em>Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getEra <em>Era</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getWeekOfYear <em>Week Of Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getQuarter <em>Quarter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getHours <em>Hours</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAmPm <em>Am Pm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText1 <em>Text1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder <em>Automatic Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource <em>Format Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType()
 * @model extendedMetaData="name='date-style_._type' kind='elementOnly'"
 * @generated
 */
public interface DateStyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties</em>' containment reference.
	 * @see #setTextProperties(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_TextProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Day</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Day()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<DayType> getDay();

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Month()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<MonthType> getMonth();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Year()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<YearType> getYear();

	/**
	 * Returns the value of the '<em><b>Era</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Era</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Era</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Era()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='era' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<EraType> getEra();

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_DayOfWeek()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day-of-week' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<DayOfWeekType> getDayOfWeek();

	/**
	 * Returns the value of the '<em><b>Week Of Year</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Of Year</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Of Year</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_WeekOfYear()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='week-of-year' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<WeekOfYearType> getWeekOfYear();

	/**
	 * Returns the value of the '<em><b>Quarter</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quarter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quarter</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Quarter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quarter' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<QuarterType> getQuarter();

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Hours()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hours' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<HoursType> getHours();

	/**
	 * Returns the value of the '<em><b>Am Pm</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Am Pm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Am Pm</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_AmPm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='am-pm' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<AmPmType> getAmPm();

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Minutes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minutes' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<MinutesType> getMinutes();

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Seconds()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seconds' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<SecondsType> getSeconds();

	/**
	 * Returns the value of the '<em><b>Text1</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text1</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Text1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<String> getText1();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Automatic Order</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticOrder()
	 * @see #unsetAutomaticOrder()
	 * @see #setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_AutomaticOrder()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-order' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticOrder()
	 * @see #unsetAutomaticOrder()
	 * @see #getAutomaticOrder()
	 * @generated
	 */
	void setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticOrder()
	 * @see #getAutomaticOrder()
	 * @see #setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticOrder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getAutomaticOrder <em>Automatic Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Order</em>' attribute is set.
	 * @see #unsetAutomaticOrder()
	 * @see #getAutomaticOrder()
	 * @see #setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticOrder();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Format Source</b></em>' attribute.
	 * The default value is <code>"fixed"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @see #isSetFormatSource()
	 * @see #unsetFormatSource()
	 * @see #setFormatSource(FormatSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_FormatSource()
	 * @model default="fixed" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='format-source' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatSourceType getFormatSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource <em>Format Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType
	 * @see #isSetFormatSource()
	 * @see #unsetFormatSource()
	 * @see #getFormatSource()
	 * @generated
	 */
	void setFormatSource(FormatSourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource <em>Format Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormatSource()
	 * @see #getFormatSource()
	 * @see #setFormatSource(FormatSourceType)
	 * @generated
	 */
	void unsetFormatSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getFormatSource <em>Format Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format Source</em>' attribute is set.
	 * @see #unsetFormatSource()
	 * @see #getFormatSource()
	 * @see #setFormatSource(FormatSourceType)
	 * @generated
	 */
	boolean isSetFormatSource();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Country</em>' attribute.
	 * @see #setTransliterationCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_TransliterationCountry()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='transliteration-country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationCountry <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Country</em>' attribute.
	 * @see #getTransliterationCountry()
	 * @generated
	 */
	void setTransliterationCountry(String value);

	/**
	 * Returns the value of the '<em><b>Transliteration Format</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Format</em>' attribute.
	 * @see #isSetTransliterationFormat()
	 * @see #unsetTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_TransliterationFormat()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='transliteration-format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Format</em>' attribute.
	 * @see #isSetTransliterationFormat()
	 * @see #unsetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @generated
	 */
	void setTransliterationFormat(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @generated
	 */
	void unsetTransliterationFormat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transliteration Format</em>' attribute is set.
	 * @see #unsetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @generated
	 */
	boolean isSetTransliterationFormat();

	/**
	 * Returns the value of the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Language</em>' attribute.
	 * @see #setTransliterationLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_TransliterationLanguage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='transliteration-language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationLanguage <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Language</em>' attribute.
	 * @see #getTransliterationLanguage()
	 * @generated
	 */
	void setTransliterationLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Transliteration Style</b></em>' attribute.
	 * The default value is <code>"short"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see #isSetTransliterationStyle()
	 * @see #unsetTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_TransliterationStyle()
	 * @model default="short" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transliteration-style' namespace='##targetNamespace'"
	 * @generated
	 */
	TransliterationStyleType getTransliterationStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see #isSetTransliterationStyle()
	 * @see #unsetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @generated
	 */
	void setTransliterationStyle(TransliterationStyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @generated
	 */
	void unsetTransliterationStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transliteration Style</em>' attribute is set.
	 * @see #unsetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @generated
	 */
	boolean isSetTransliterationStyle();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getDateStyleType_Volatile()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='volatile' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetVolatile();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType#getVolatile <em>Volatile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile</em>' attribute is set.
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetVolatile();

} // DateStyleType
