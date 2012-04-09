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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getText1 <em>Text1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.BooleanStyleTypeImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanStyleTypeImpl extends EObjectImpl implements BooleanStyleType {
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
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected BooleanType boolean_;

	/**
	 * The default value of the '{@link #getText1() <em>Text1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText1() <em>Text1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText1()
	 * @generated
	 * @ordered
	 */
	protected String text1 = TEXT1_EDEFAULT;

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
	protected BooleanStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.BOOLEAN_STYLE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
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
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES, newTextProperties, newTextProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolean(BooleanType newBoolean, NotificationChain msgs) {
		BooleanType oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN, oldBoolean, newBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(BooleanType newBoolean) {
		if (newBoolean != boolean_) {
			NotificationChain msgs = null;
			if (boolean_ != null)
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN, newBoolean, newBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText1(String newText1) {
		String oldText1 = text1;
		text1 = newText1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT1, oldText1, text1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapType>(MapType.class, this, DatastylePackage.BOOLEAN_STYLE_TYPE__MAP);
		}
		return map;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__COUNTRY, oldCountry, country));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY, oldTransliterationCountry, transliterationCountry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, transliterationFormat, !oldTransliterationFormatESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, TRANSLITERATION_FORMAT_EDEFAULT, oldTransliterationFormatESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE, oldTransliterationLanguage, transliterationLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, transliterationStyle, !oldTransliterationStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, TRANSLITERATION_STYLE_EDEFAULT, oldTransliterationStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
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
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__MAP:
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
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES:
				return getTextProperties();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT:
				return getText();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN:
				return getBoolean();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT1:
				return getText1();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__MAP:
				return getMap();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__COUNTRY:
				return getCountry();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__LANGUAGE:
				return getLanguage();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__NAME:
				return getName();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TITLE:
				return getTitle();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return getTransliterationCountry();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return getTransliterationFormat();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return getTransliterationLanguage();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE:
				return getTransliterationStyle();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE:
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
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT:
				setText((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT1:
				setText1((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT:
				setTransliterationFormat((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage((String)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE:
				setTransliterationStyle((TransliterationStyleType)newValue);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE:
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
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT1:
				setText1(TEXT1_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__MAP:
				getMap().clear();
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry(TRANSLITERATION_COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT:
				unsetTransliterationFormat();
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage(TRANSLITERATION_LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE:
				unsetTransliterationStyle();
				return;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE:
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
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES:
				return textProperties != null;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__BOOLEAN:
				return boolean_ != null;
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TEXT1:
				return TEXT1_EDEFAULT == null ? text1 != null : !TEXT1_EDEFAULT.equals(text1);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__MAP:
				return map != null && !map.isEmpty();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return TRANSLITERATION_COUNTRY_EDEFAULT == null ? transliterationCountry != null : !TRANSLITERATION_COUNTRY_EDEFAULT.equals(transliterationCountry);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return isSetTransliterationFormat();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return TRANSLITERATION_LANGUAGE_EDEFAULT == null ? transliterationLanguage != null : !TRANSLITERATION_LANGUAGE_EDEFAULT.equals(transliterationLanguage);
			case DatastylePackage.BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE:
				return isSetTransliterationStyle();
			case DatastylePackage.BOOLEAN_STYLE_TYPE__VOLATILE:
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
		result.append(", text1: ");
		result.append(text1);
		result.append(", country: ");
		result.append(country);
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

} //BooleanStyleTypeImpl
