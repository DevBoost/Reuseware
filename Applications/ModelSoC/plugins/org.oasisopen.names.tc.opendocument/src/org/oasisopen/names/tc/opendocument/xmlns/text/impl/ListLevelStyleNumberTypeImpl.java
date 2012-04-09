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
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Level Style Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getDisplayLevels <em>Display Levels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleNumberTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLevelStyleNumberTypeImpl extends EObjectImpl implements ListLevelStyleNumberType {
	/**
	 * The cached value of the '{@link #getListLevelProperties() <em>List Level Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListLevelProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleListLevelPropertiesContent listLevelProperties;

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
	 * The default value of the '{@link #getDisplayLevels() <em>Display Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLevels()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISPLAY_LEVELS_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getDisplayLevels() <em>Display Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLevels()
	 * @generated
	 * @ordered
	 */
	protected BigInteger displayLevels = DISPLAY_LEVELS_EDEFAULT;

	/**
	 * This is true if the Display Levels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayLevelsESet;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUM_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected Object numFormat = NUM_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean NUM_LETTER_SYNC_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean numLetterSync = NUM_LETTER_SYNC_EDEFAULT;

	/**
	 * This is true if the Num Letter Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numLetterSyncESet;

	/**
	 * The default value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected String numPrefix = NUM_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected String numSuffix = NUM_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_VALUE_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startValue = START_VALUE_EDEFAULT;

	/**
	 * This is true if the Start Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startValueESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListLevelStyleNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getListLevelStyleNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListLevelPropertiesContent getListLevelProperties() {
		return listLevelProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListLevelProperties(StyleListLevelPropertiesContent newListLevelProperties, NotificationChain msgs) {
		StyleListLevelPropertiesContent oldListLevelProperties = listLevelProperties;
		listLevelProperties = newListLevelProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES, oldListLevelProperties, newListLevelProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListLevelProperties(StyleListLevelPropertiesContent newListLevelProperties) {
		if (newListLevelProperties != listLevelProperties) {
			NotificationChain msgs = null;
			if (listLevelProperties != null)
				msgs = ((InternalEObject)listLevelProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			if (newListLevelProperties != null)
				msgs = ((InternalEObject)newListLevelProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			msgs = basicSetListLevelProperties(newListLevelProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES, newListLevelProperties, newListLevelProperties));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
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
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES, newTextProperties, newTextProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDisplayLevels() {
		return displayLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLevels(BigInteger newDisplayLevels) {
		BigInteger oldDisplayLevels = displayLevels;
		displayLevels = newDisplayLevels;
		boolean oldDisplayLevelsESet = displayLevelsESet;
		displayLevelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS, oldDisplayLevels, displayLevels, !oldDisplayLevelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayLevels() {
		BigInteger oldDisplayLevels = displayLevels;
		boolean oldDisplayLevelsESet = displayLevelsESet;
		displayLevels = DISPLAY_LEVELS_EDEFAULT;
		displayLevelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS, oldDisplayLevels, DISPLAY_LEVELS_EDEFAULT, oldDisplayLevelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayLevels() {
		return displayLevelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(BigInteger newLevel) {
		BigInteger oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumFormat() {
		return numFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFormat(Object newNumFormat) {
		Object oldNumFormat = numFormat;
		numFormat = newNumFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_FORMAT, oldNumFormat, numFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync() {
		return numLetterSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newNumLetterSync) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		numLetterSync = newNumLetterSync == null ? NUM_LETTER_SYNC_EDEFAULT : newNumLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumLetterSync() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSync = NUM_LETTER_SYNC_EDEFAULT;
		numLetterSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumLetterSync() {
		return numLetterSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumPrefix() {
		return numPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPrefix(String newNumPrefix) {
		String oldNumPrefix = numPrefix;
		numPrefix = newNumPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_PREFIX, oldNumPrefix, numPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumSuffix() {
		return numSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumSuffix(String newNumSuffix) {
		String oldNumSuffix = numSuffix;
		numSuffix = newNumSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_SUFFIX, oldNumSuffix, numSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(BigInteger newStartValue) {
		BigInteger oldStartValue = startValue;
		startValue = newStartValue;
		boolean oldStartValueESet = startValueESet;
		startValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE, oldStartValue, startValue, !oldStartValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartValue() {
		BigInteger oldStartValue = startValue;
		boolean oldStartValueESet = startValueESet;
		startValue = START_VALUE_EDEFAULT;
		startValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE, oldStartValue, START_VALUE_EDEFAULT, oldStartValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartValue() {
		return startValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES:
				return basicSetListLevelProperties(null, msgs);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
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
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES:
				return getListLevelProperties();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES:
				return getTextProperties();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS:
				return getDisplayLevels();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LEVEL:
				return getLevel();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_PREFIX:
				return getNumPrefix();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_SUFFIX:
				return getNumSuffix();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE:
				return getStartValue();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS:
				setDisplayLevels((BigInteger)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LEVEL:
				setLevel((BigInteger)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_PREFIX:
				setNumPrefix((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_SUFFIX:
				setNumSuffix((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE:
				setStartValue((BigInteger)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)null);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS:
				unsetDisplayLevels();
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_PREFIX:
				setNumPrefix(NUM_PREFIX_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_SUFFIX:
				setNumSuffix(NUM_SUFFIX_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE:
				unsetStartValue();
				return;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LIST_LEVEL_PROPERTIES:
				return listLevelProperties != null;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__TEXT_PROPERTIES:
				return textProperties != null;
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__DISPLAY_LEVELS:
				return isSetDisplayLevels();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_PREFIX:
				return NUM_PREFIX_EDEFAULT == null ? numPrefix != null : !NUM_PREFIX_EDEFAULT.equals(numPrefix);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__NUM_SUFFIX:
				return NUM_SUFFIX_EDEFAULT == null ? numSuffix != null : !NUM_SUFFIX_EDEFAULT.equals(numSuffix);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__START_VALUE:
				return isSetStartValue();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (displayLevels: ");
		if (displayLevelsESet) result.append(displayLevels); else result.append("<unset>");
		result.append(", level: ");
		result.append(level);
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", numPrefix: ");
		result.append(numPrefix);
		result.append(", numSuffix: ");
		result.append(numSuffix);
		result.append(", startValue: ");
		if (startValueESet) result.append(startValue); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //ListLevelStyleNumberTypeImpl
