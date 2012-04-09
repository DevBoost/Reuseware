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
import org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Level Style Bullet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getBulletChar <em>Bullet Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getBulletRelativeSize <em>Bullet Relative Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleBulletTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLevelStyleBulletTypeImpl extends EObjectImpl implements ListLevelStyleBulletType {
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
	 * The default value of the '{@link #getBulletChar() <em>Bullet Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulletChar()
	 * @generated
	 * @ordered
	 */
	protected static final String BULLET_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulletChar() <em>Bullet Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulletChar()
	 * @generated
	 * @ordered
	 */
	protected String bulletChar = BULLET_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBulletRelativeSize() <em>Bullet Relative Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulletRelativeSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BULLET_RELATIVE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulletRelativeSize() <em>Bullet Relative Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulletRelativeSize()
	 * @generated
	 * @ordered
	 */
	protected String bulletRelativeSize = BULLET_RELATIVE_SIZE_EDEFAULT;

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
	protected ListLevelStyleBulletTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getListLevelStyleBulletType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES, oldListLevelProperties, newListLevelProperties);
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
				msgs = ((InternalEObject)listLevelProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			if (newListLevelProperties != null)
				msgs = ((InternalEObject)newListLevelProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			msgs = basicSetListLevelProperties(newListLevelProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES, newListLevelProperties, newListLevelProperties));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
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
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES, newTextProperties, newTextProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBulletChar() {
		return bulletChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulletChar(String newBulletChar) {
		String oldBulletChar = bulletChar;
		bulletChar = newBulletChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_CHAR, oldBulletChar, bulletChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBulletRelativeSize() {
		return bulletRelativeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulletRelativeSize(String newBulletRelativeSize) {
		String oldBulletRelativeSize = bulletRelativeSize;
		bulletRelativeSize = newBulletRelativeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_RELATIVE_SIZE, oldBulletRelativeSize, bulletRelativeSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_PREFIX, oldNumPrefix, numPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_SUFFIX, oldNumSuffix, numSuffix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES:
				return basicSetListLevelProperties(null, msgs);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES:
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
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES:
				return getListLevelProperties();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES:
				return getTextProperties();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_CHAR:
				return getBulletChar();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_RELATIVE_SIZE:
				return getBulletRelativeSize();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LEVEL:
				return getLevel();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_PREFIX:
				return getNumPrefix();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_SUFFIX:
				return getNumSuffix();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__STYLE_NAME:
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
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_CHAR:
				setBulletChar((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_RELATIVE_SIZE:
				setBulletRelativeSize((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LEVEL:
				setLevel((BigInteger)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_PREFIX:
				setNumPrefix((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_SUFFIX:
				setNumSuffix((String)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__STYLE_NAME:
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
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)null);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_CHAR:
				setBulletChar(BULLET_CHAR_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_RELATIVE_SIZE:
				setBulletRelativeSize(BULLET_RELATIVE_SIZE_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_PREFIX:
				setNumPrefix(NUM_PREFIX_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_SUFFIX:
				setNumSuffix(NUM_SUFFIX_EDEFAULT);
				return;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__STYLE_NAME:
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
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LIST_LEVEL_PROPERTIES:
				return listLevelProperties != null;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__TEXT_PROPERTIES:
				return textProperties != null;
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_CHAR:
				return BULLET_CHAR_EDEFAULT == null ? bulletChar != null : !BULLET_CHAR_EDEFAULT.equals(bulletChar);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__BULLET_RELATIVE_SIZE:
				return BULLET_RELATIVE_SIZE_EDEFAULT == null ? bulletRelativeSize != null : !BULLET_RELATIVE_SIZE_EDEFAULT.equals(bulletRelativeSize);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_PREFIX:
				return NUM_PREFIX_EDEFAULT == null ? numPrefix != null : !NUM_PREFIX_EDEFAULT.equals(numPrefix);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__NUM_SUFFIX:
				return NUM_SUFFIX_EDEFAULT == null ? numSuffix != null : !NUM_SUFFIX_EDEFAULT.equals(numSuffix);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE__STYLE_NAME:
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
		result.append(" (bulletChar: ");
		result.append(bulletChar);
		result.append(", bulletRelativeSize: ");
		result.append(bulletRelativeSize);
		result.append(", level: ");
		result.append(level);
		result.append(", numPrefix: ");
		result.append(numPrefix);
		result.append(", numSuffix: ");
		result.append(numSuffix);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //ListLevelStyleBulletTypeImpl
