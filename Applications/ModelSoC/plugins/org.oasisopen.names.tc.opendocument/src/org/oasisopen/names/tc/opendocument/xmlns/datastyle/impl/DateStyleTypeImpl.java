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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getEra <em>Era</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getWeekOfYear <em>Week Of Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getQuarter <em>Quarter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getAmPm <em>Am Pm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getText1 <em>Text1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getAutomaticOrder <em>Automatic Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getFormatSource <em>Format Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DateStyleTypeImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateStyleTypeImpl extends EObjectImpl implements DateStyleType {
	/**
	 * The cached value of the '{@link #getTextProperties() <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties;

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
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<MapType> map;

	/**
	 * The default value of the '{@link #getAutomaticOrder() <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticOrder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_ORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected static final String TRANSLITERATION_FORMAT_EDEFAULT = "1";

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
	 * This is true if the Transliteration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transliterationFormatESet;

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
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VOLATILE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * This is true if the Volatile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.DATE_STYLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties() {
		return textProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties(StyleTextPropertiesContent newTextProperties, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties = textProperties;
		textProperties = newTextProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties(StyleTextPropertiesContent newTextProperties) {
		if (newTextProperties != textProperties) {
			NotificationChain msgs = null;
			if (textProperties != null)
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES, newTextProperties, newTextProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DatastylePackage.DATE_STYLE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DayType> getDay() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__DAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonthType> getMonth() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__MONTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YearType> getYear() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__YEAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EraType> getEra() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__ERA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DayOfWeekType> getDayOfWeek() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__DAY_OF_WEEK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WeekOfYearType> getWeekOfYear() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__WEEK_OF_YEAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuarterType> getQuarter() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__QUARTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HoursType> getHours() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__HOURS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmPmType> getAmPm() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__AM_PM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MinutesType> getMinutes() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__MINUTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecondsType> getSeconds() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__SECONDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText1() {
		return getGroup().list(DatastylePackage.Literals.DATE_STYLE_TYPE__TEXT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapType>(MapType.class, this, DatastylePackage.DATE_STYLE_TYPE__MAP);
		}
		return map;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER, oldAutomaticOrder, automaticOrder, !oldAutomaticOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER, oldAutomaticOrder, AUTOMATIC_ORDER_EDEFAULT, oldAutomaticOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__COUNTRY, oldCountry, country));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE, oldFormatSource, formatSource, !oldFormatSourceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE, oldFormatSource, FORMAT_SOURCE_EDEFAULT, oldFormatSourceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY, oldTransliterationCountry, transliterationCountry));
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
		boolean oldTransliterationFormatESet = transliterationFormatESet;
		transliterationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, transliterationFormat, !oldTransliterationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransliterationFormat() {
		String oldTransliterationFormat = transliterationFormat;
		boolean oldTransliterationFormatESet = transliterationFormatESet;
		transliterationFormat = TRANSLITERATION_FORMAT_EDEFAULT;
		transliterationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, TRANSLITERATION_FORMAT_EDEFAULT, oldTransliterationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransliterationFormat() {
		return transliterationFormatESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE, oldTransliterationLanguage, transliterationLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, transliterationStyle, !oldTransliterationStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, TRANSLITERATION_STYLE_EDEFAULT, oldTransliterationStyleESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newVolatile) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		volatile_ = newVolatile == null ? VOLATILE_EDEFAULT : newVolatile;
		boolean oldVolatileESet = volatileESet;
		volatileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DATE_STYLE_TYPE__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatile() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		boolean oldVolatileESet = volatileESet;
		volatile_ = VOLATILE_EDEFAULT;
		volatileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DATE_STYLE_TYPE__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatile() {
		return volatileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__DAY:
				return ((InternalEList<?>)getDay()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__MONTH:
				return ((InternalEList<?>)getMonth()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__YEAR:
				return ((InternalEList<?>)getYear()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__ERA:
				return ((InternalEList<?>)getEra()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__DAY_OF_WEEK:
				return ((InternalEList<?>)getDayOfWeek()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__WEEK_OF_YEAR:
				return ((InternalEList<?>)getWeekOfYear()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__QUARTER:
				return ((InternalEList<?>)getQuarter()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__HOURS:
				return ((InternalEList<?>)getHours()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__AM_PM:
				return ((InternalEList<?>)getAmPm()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__MINUTES:
				return ((InternalEList<?>)getMinutes()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__SECONDS:
				return ((InternalEList<?>)getSeconds()).basicRemove(otherEnd, msgs);
			case DatastylePackage.DATE_STYLE_TYPE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
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
			case DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES:
				return getTextProperties();
			case DatastylePackage.DATE_STYLE_TYPE__TEXT:
				return getText();
			case DatastylePackage.DATE_STYLE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DatastylePackage.DATE_STYLE_TYPE__DAY:
				return getDay();
			case DatastylePackage.DATE_STYLE_TYPE__MONTH:
				return getMonth();
			case DatastylePackage.DATE_STYLE_TYPE__YEAR:
				return getYear();
			case DatastylePackage.DATE_STYLE_TYPE__ERA:
				return getEra();
			case DatastylePackage.DATE_STYLE_TYPE__DAY_OF_WEEK:
				return getDayOfWeek();
			case DatastylePackage.DATE_STYLE_TYPE__WEEK_OF_YEAR:
				return getWeekOfYear();
			case DatastylePackage.DATE_STYLE_TYPE__QUARTER:
				return getQuarter();
			case DatastylePackage.DATE_STYLE_TYPE__HOURS:
				return getHours();
			case DatastylePackage.DATE_STYLE_TYPE__AM_PM:
				return getAmPm();
			case DatastylePackage.DATE_STYLE_TYPE__MINUTES:
				return getMinutes();
			case DatastylePackage.DATE_STYLE_TYPE__SECONDS:
				return getSeconds();
			case DatastylePackage.DATE_STYLE_TYPE__TEXT1:
				return getText1();
			case DatastylePackage.DATE_STYLE_TYPE__MAP:
				return getMap();
			case DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER:
				return getAutomaticOrder();
			case DatastylePackage.DATE_STYLE_TYPE__COUNTRY:
				return getCountry();
			case DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE:
				return getFormatSource();
			case DatastylePackage.DATE_STYLE_TYPE__LANGUAGE:
				return getLanguage();
			case DatastylePackage.DATE_STYLE_TYPE__NAME:
				return getName();
			case DatastylePackage.DATE_STYLE_TYPE__TITLE:
				return getTitle();
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return getTransliterationCountry();
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return getTransliterationFormat();
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return getTransliterationLanguage();
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE:
				return getTransliterationStyle();
			case DatastylePackage.DATE_STYLE_TYPE__VOLATILE:
				return getVolatile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TEXT:
				setText((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends DayType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MONTH:
				getMonth().clear();
				getMonth().addAll((Collection<? extends MonthType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__YEAR:
				getYear().clear();
				getYear().addAll((Collection<? extends YearType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__ERA:
				getEra().clear();
				getEra().addAll((Collection<? extends EraType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__DAY_OF_WEEK:
				getDayOfWeek().clear();
				getDayOfWeek().addAll((Collection<? extends DayOfWeekType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__WEEK_OF_YEAR:
				getWeekOfYear().clear();
				getWeekOfYear().addAll((Collection<? extends WeekOfYearType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__QUARTER:
				getQuarter().clear();
				getQuarter().addAll((Collection<? extends QuarterType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__HOURS:
				getHours().clear();
				getHours().addAll((Collection<? extends HoursType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__AM_PM:
				getAmPm().clear();
				getAmPm().addAll((Collection<? extends AmPmType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MINUTES:
				getMinutes().clear();
				getMinutes().addAll((Collection<? extends MinutesType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__SECONDS:
				getSeconds().clear();
				getSeconds().addAll((Collection<? extends SecondsType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TEXT1:
				getText1().clear();
				getText1().addAll((Collection<? extends String>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER:
				setAutomaticOrder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE:
				setFormatSource((FormatSourceType)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT:
				setTransliterationFormat((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage((String)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE:
				setTransliterationStyle((TransliterationStyleType)newValue);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__VOLATILE:
				setVolatile((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__DAY:
				getDay().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MONTH:
				getMonth().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__YEAR:
				getYear().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__ERA:
				getEra().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__DAY_OF_WEEK:
				getDayOfWeek().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__WEEK_OF_YEAR:
				getWeekOfYear().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__QUARTER:
				getQuarter().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__HOURS:
				getHours().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__AM_PM:
				getAmPm().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MINUTES:
				getMinutes().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__SECONDS:
				getSeconds().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TEXT1:
				getText1().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__MAP:
				getMap().clear();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER:
				unsetAutomaticOrder();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE:
				unsetFormatSource();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry(TRANSLITERATION_COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT:
				unsetTransliterationFormat();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage(TRANSLITERATION_LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE:
				unsetTransliterationStyle();
				return;
			case DatastylePackage.DATE_STYLE_TYPE__VOLATILE:
				unsetVolatile();
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
			case DatastylePackage.DATE_STYLE_TYPE__TEXT_PROPERTIES:
				return textProperties != null;
			case DatastylePackage.DATE_STYLE_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DatastylePackage.DATE_STYLE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__DAY:
				return !getDay().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__MONTH:
				return !getMonth().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__YEAR:
				return !getYear().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__ERA:
				return !getEra().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__DAY_OF_WEEK:
				return !getDayOfWeek().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__WEEK_OF_YEAR:
				return !getWeekOfYear().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__QUARTER:
				return !getQuarter().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__HOURS:
				return !getHours().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__AM_PM:
				return !getAmPm().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__MINUTES:
				return !getMinutes().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__SECONDS:
				return !getSeconds().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__TEXT1:
				return !getText1().isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__MAP:
				return map != null && !map.isEmpty();
			case DatastylePackage.DATE_STYLE_TYPE__AUTOMATIC_ORDER:
				return isSetAutomaticOrder();
			case DatastylePackage.DATE_STYLE_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case DatastylePackage.DATE_STYLE_TYPE__FORMAT_SOURCE:
				return isSetFormatSource();
			case DatastylePackage.DATE_STYLE_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DatastylePackage.DATE_STYLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatastylePackage.DATE_STYLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return TRANSLITERATION_COUNTRY_EDEFAULT == null ? transliterationCountry != null : !TRANSLITERATION_COUNTRY_EDEFAULT.equals(transliterationCountry);
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return isSetTransliterationFormat();
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return TRANSLITERATION_LANGUAGE_EDEFAULT == null ? transliterationLanguage != null : !TRANSLITERATION_LANGUAGE_EDEFAULT.equals(transliterationLanguage);
			case DatastylePackage.DATE_STYLE_TYPE__TRANSLITERATION_STYLE:
				return isSetTransliterationStyle();
			case DatastylePackage.DATE_STYLE_TYPE__VOLATILE:
				return isSetVolatile();
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
		result.append(" (text: ");
		result.append(text);
		result.append(", group: ");
		result.append(group);
		result.append(", automaticOrder: ");
		if (automaticOrderESet) result.append(automaticOrder); else result.append("<unset>");
		result.append(", country: ");
		result.append(country);
		result.append(", formatSource: ");
		if (formatSourceESet) result.append(formatSource); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", transliterationCountry: ");
		result.append(transliterationCountry);
		result.append(", transliterationFormat: ");
		if (transliterationFormatESet) result.append(transliterationFormat); else result.append("<unset>");
		result.append(", transliterationLanguage: ");
		result.append(transliterationLanguage);
		result.append(", transliterationStyle: ");
		if (transliterationStyleESet) result.append(transliterationStyle); else result.append("<unset>");
		result.append(", volatile: ");
		if (volatileESet) result.append(volatile_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateStyleTypeImpl
