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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListStyleTypeImpl#getTextListStyleContentGroup <em>Text List Style Content Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListStyleTypeImpl#getTextListStyleContent <em>Text List Style Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListStyleTypeImpl#getConsecutiveNumbering <em>Consecutive Numbering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListStyleTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListStyleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListStyleTypeImpl extends EObjectImpl implements ListStyleType {
	/**
	 * The cached value of the '{@link #getTextListStyleContentGroup() <em>Text List Style Content Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextListStyleContentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap textListStyleContentGroup;

	/**
	 * The default value of the '{@link #getConsecutiveNumbering() <em>Consecutive Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONSECUTIVE_NUMBERING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsecutiveNumbering() <em>Consecutive Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveNumbering()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean consecutiveNumbering = CONSECUTIVE_NUMBERING_EDEFAULT;

	/**
	 * This is true if the Consecutive Numbering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consecutiveNumberingESet;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getListStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextListStyleContentGroup() {
		if (textListStyleContentGroup == null) {
			textListStyleContentGroup = new BasicFeatureMap(this, TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP);
		}
		return textListStyleContentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTextListStyleContent() {
		return getTextListStyleContentGroup().list(TextPackage.eINSTANCE.getListStyleType_TextListStyleContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConsecutiveNumbering() {
		return consecutiveNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsecutiveNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newConsecutiveNumbering) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConsecutiveNumbering = consecutiveNumbering;
		consecutiveNumbering = newConsecutiveNumbering == null ? CONSECUTIVE_NUMBERING_EDEFAULT : newConsecutiveNumbering;
		boolean oldConsecutiveNumberingESet = consecutiveNumberingESet;
		consecutiveNumberingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING, oldConsecutiveNumbering, consecutiveNumbering, !oldConsecutiveNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsecutiveNumbering() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConsecutiveNumbering = consecutiveNumbering;
		boolean oldConsecutiveNumberingESet = consecutiveNumberingESet;
		consecutiveNumbering = CONSECUTIVE_NUMBERING_EDEFAULT;
		consecutiveNumberingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING, oldConsecutiveNumbering, CONSECUTIVE_NUMBERING_EDEFAULT, oldConsecutiveNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsecutiveNumbering() {
		return consecutiveNumberingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_STYLE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_STYLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP:
				return ((InternalEList<?>)getTextListStyleContentGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT:
				return ((InternalEList<?>)getTextListStyleContent()).basicRemove(otherEnd, msgs);
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
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP:
				if (coreType) return getTextListStyleContentGroup();
				return ((FeatureMap.Internal)getTextListStyleContentGroup()).getWrapper();
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT:
				return getTextListStyleContent();
			case TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING:
				return getConsecutiveNumbering();
			case TextPackage.LIST_STYLE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case TextPackage.LIST_STYLE_TYPE__NAME:
				return getName();
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
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP:
				((FeatureMap.Internal)getTextListStyleContentGroup()).set(newValue);
				return;
			case TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING:
				setConsecutiveNumbering((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LIST_STYLE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case TextPackage.LIST_STYLE_TYPE__NAME:
				setName((String)newValue);
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
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP:
				getTextListStyleContentGroup().clear();
				return;
			case TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING:
				unsetConsecutiveNumbering();
				return;
			case TextPackage.LIST_STYLE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case TextPackage.LIST_STYLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT_GROUP:
				return textListStyleContentGroup != null && !textListStyleContentGroup.isEmpty();
			case TextPackage.LIST_STYLE_TYPE__TEXT_LIST_STYLE_CONTENT:
				return !getTextListStyleContent().isEmpty();
			case TextPackage.LIST_STYLE_TYPE__CONSECUTIVE_NUMBERING:
				return isSetConsecutiveNumbering();
			case TextPackage.LIST_STYLE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case TextPackage.LIST_STYLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (textListStyleContentGroup: ");
		result.append(textListStyleContentGroup);
		result.append(", consecutiveNumbering: ");
		if (consecutiveNumberingESet) result.append(consecutiveNumbering); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ListStyleTypeImpl
