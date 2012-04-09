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
import org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Level Style Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleImageTypeImpl#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListLevelStyleImageTypeImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLevelStyleImageTypeImpl extends TextListLevelStyleImageAttrImpl implements ListLevelStyleImageType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListLevelStyleImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getListLevelStyleImageType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES, oldListLevelProperties, newListLevelProperties);
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
				msgs = ((InternalEObject)listLevelProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			if (newListLevelProperties != null)
				msgs = ((InternalEObject)newListLevelProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES, null, msgs);
			msgs = basicSetListLevelProperties(newListLevelProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES, newListLevelProperties, newListLevelProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES:
				return basicSetListLevelProperties(null, msgs);
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
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES:
				return getListLevelProperties();
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LEVEL:
				return getLevel();
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
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)newValue);
				return;
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LEVEL:
				setLevel((BigInteger)newValue);
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
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)null);
				return;
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LIST_LEVEL_PROPERTIES:
				return listLevelProperties != null;
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
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
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //ListLevelStyleImageTypeImpl
