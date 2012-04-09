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
import org.oasisopen.names.tc.opendocument.xmlns.text.ListItemType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextListItemContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListTypeImpl#getListHeader <em>List Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListTypeImpl#getListItem <em>List Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListTypeImpl#getContinueNumbering <em>Continue Numbering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ListTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListTypeImpl extends EObjectImpl implements ListType {
	/**
	 * The cached value of the '{@link #getListHeader() <em>List Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListHeader()
	 * @generated
	 * @ordered
	 */
	protected TextListItemContent listHeader;

	/**
	 * The cached value of the '{@link #getListItem() <em>List Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItemType> listItem;

	/**
	 * The default value of the '{@link #getContinueNumbering() <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTINUE_NUMBERING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContinueNumbering() <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueNumbering()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean continueNumbering = CONTINUE_NUMBERING_EDEFAULT;

	/**
	 * This is true if the Continue Numbering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continueNumberingESet;

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
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListItemContent getListHeader() {
		return listHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListHeader(TextListItemContent newListHeader, NotificationChain msgs) {
		TextListItemContent oldListHeader = listHeader;
		listHeader = newListHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LIST_TYPE__LIST_HEADER, oldListHeader, newListHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListHeader(TextListItemContent newListHeader) {
		if (newListHeader != listHeader) {
			NotificationChain msgs = null;
			if (listHeader != null)
				msgs = ((InternalEObject)listHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_TYPE__LIST_HEADER, null, msgs);
			if (newListHeader != null)
				msgs = ((InternalEObject)newListHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LIST_TYPE__LIST_HEADER, null, msgs);
			msgs = basicSetListHeader(newListHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_TYPE__LIST_HEADER, newListHeader, newListHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListItemType> getListItem() {
		if (listItem == null) {
			listItem = new EObjectContainmentEList<ListItemType>(ListItemType.class, this, TextPackage.LIST_TYPE__LIST_ITEM);
		}
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContinueNumbering() {
		return continueNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContinueNumbering) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContinueNumbering = continueNumbering;
		continueNumbering = newContinueNumbering == null ? CONTINUE_NUMBERING_EDEFAULT : newContinueNumbering;
		boolean oldContinueNumberingESet = continueNumberingESet;
		continueNumberingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_TYPE__CONTINUE_NUMBERING, oldContinueNumbering, continueNumbering, !oldContinueNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinueNumbering() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContinueNumbering = continueNumbering;
		boolean oldContinueNumberingESet = continueNumberingESet;
		continueNumbering = CONTINUE_NUMBERING_EDEFAULT;
		continueNumberingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LIST_TYPE__CONTINUE_NUMBERING, oldContinueNumbering, CONTINUE_NUMBERING_EDEFAULT, oldContinueNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinueNumbering() {
		return continueNumberingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LIST_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LIST_TYPE__LIST_HEADER:
				return basicSetListHeader(null, msgs);
			case TextPackage.LIST_TYPE__LIST_ITEM:
				return ((InternalEList<?>)getListItem()).basicRemove(otherEnd, msgs);
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
			case TextPackage.LIST_TYPE__LIST_HEADER:
				return getListHeader();
			case TextPackage.LIST_TYPE__LIST_ITEM:
				return getListItem();
			case TextPackage.LIST_TYPE__CONTINUE_NUMBERING:
				return getContinueNumbering();
			case TextPackage.LIST_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.LIST_TYPE__LIST_HEADER:
				setListHeader((TextListItemContent)newValue);
				return;
			case TextPackage.LIST_TYPE__LIST_ITEM:
				getListItem().clear();
				getListItem().addAll((Collection<? extends ListItemType>)newValue);
				return;
			case TextPackage.LIST_TYPE__CONTINUE_NUMBERING:
				setContinueNumbering((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LIST_TYPE__STYLE_NAME:
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
			case TextPackage.LIST_TYPE__LIST_HEADER:
				setListHeader((TextListItemContent)null);
				return;
			case TextPackage.LIST_TYPE__LIST_ITEM:
				getListItem().clear();
				return;
			case TextPackage.LIST_TYPE__CONTINUE_NUMBERING:
				unsetContinueNumbering();
				return;
			case TextPackage.LIST_TYPE__STYLE_NAME:
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
			case TextPackage.LIST_TYPE__LIST_HEADER:
				return listHeader != null;
			case TextPackage.LIST_TYPE__LIST_ITEM:
				return listItem != null && !listItem.isEmpty();
			case TextPackage.LIST_TYPE__CONTINUE_NUMBERING:
				return isSetContinueNumbering();
			case TextPackage.LIST_TYPE__STYLE_NAME:
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
		result.append(" (continueNumbering: ");
		if (continueNumberingESet) result.append(continueNumbering); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //ListTypeImpl
