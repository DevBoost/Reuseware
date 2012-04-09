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
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getAutoUpdate <em>Auto Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getDefaultOutlineLevel <em>Default Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getListStyleName <em>List Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getNextStyleName <em>Next Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.StyleType1Impl#getParentStyleName <em>Parent Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleType1Impl extends StyleStyleContentImpl implements StyleType1 {
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
	 * The default value of the '{@link #getAutoUpdate() <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_UPDATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutoUpdate() <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoUpdate = AUTO_UPDATE_EDEFAULT;

	/**
	 * This is true if the Auto Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoUpdateESet;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected String dataStyleName = DATA_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultOutlineLevel() <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEFAULT_OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultOutlineLevel() <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger defaultOutlineLevel = DEFAULT_OUTLINE_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getListStyleName() <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListStyleName() <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleName()
	 * @generated
	 * @ordered
	 */
	protected String listStyleName = LIST_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected String masterPageName = MASTER_PAGE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String nextStyleName = NEXT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentStyleName() <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentStyleName() <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStyleName()
	 * @generated
	 * @ordered
	 */
	protected String parentStyleName = PARENT_STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getStyleType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapType>(MapType.class, this, StylePackage.STYLE_TYPE1__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoUpdate() {
		return autoUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoUpdate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoUpdate = autoUpdate;
		autoUpdate = newAutoUpdate == null ? AUTO_UPDATE_EDEFAULT : newAutoUpdate;
		boolean oldAutoUpdateESet = autoUpdateESet;
		autoUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__AUTO_UPDATE, oldAutoUpdate, autoUpdate, !oldAutoUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoUpdate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoUpdate = autoUpdate;
		boolean oldAutoUpdateESet = autoUpdateESet;
		autoUpdate = AUTO_UPDATE_EDEFAULT;
		autoUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.STYLE_TYPE1__AUTO_UPDATE, oldAutoUpdate, AUTO_UPDATE_EDEFAULT, oldAutoUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoUpdate() {
		return autoUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataStyleName() {
		return dataStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStyleName(String newDataStyleName) {
		String oldDataStyleName = dataStyleName;
		dataStyleName = newDataStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__DATA_STYLE_NAME, oldDataStyleName, dataStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDefaultOutlineLevel() {
		return defaultOutlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOutlineLevel(BigInteger newDefaultOutlineLevel) {
		BigInteger oldDefaultOutlineLevel = defaultOutlineLevel;
		defaultOutlineLevel = newDefaultOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL, oldDefaultOutlineLevel, defaultOutlineLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListStyleName() {
		return listStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyleName(String newListStyleName) {
		String oldListStyleName = listStyleName;
		listStyleName = newListStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__LIST_STYLE_NAME, oldListStyleName, listStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterPageName() {
		return masterPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPageName(String newMasterPageName) {
		String oldMasterPageName = masterPageName;
		masterPageName = newMasterPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__MASTER_PAGE_NAME, oldMasterPageName, masterPageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextStyleName() {
		return nextStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStyleName(String newNextStyleName) {
		String oldNextStyleName = nextStyleName;
		nextStyleName = newNextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__NEXT_STYLE_NAME, oldNextStyleName, nextStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentStyleName() {
		return parentStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStyleName(String newParentStyleName) {
		String oldParentStyleName = parentStyleName;
		parentStyleName = newParentStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_TYPE1__PARENT_STYLE_NAME, oldParentStyleName, parentStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.STYLE_TYPE1__MAP:
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
			case StylePackage.STYLE_TYPE1__MAP:
				return getMap();
			case StylePackage.STYLE_TYPE1__AUTO_UPDATE:
				return getAutoUpdate();
			case StylePackage.STYLE_TYPE1__CLASS:
				return getClass_();
			case StylePackage.STYLE_TYPE1__DATA_STYLE_NAME:
				return getDataStyleName();
			case StylePackage.STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL:
				return getDefaultOutlineLevel();
			case StylePackage.STYLE_TYPE1__DISPLAY_NAME:
				return getDisplayName();
			case StylePackage.STYLE_TYPE1__LIST_STYLE_NAME:
				return getListStyleName();
			case StylePackage.STYLE_TYPE1__MASTER_PAGE_NAME:
				return getMasterPageName();
			case StylePackage.STYLE_TYPE1__NAME:
				return getName();
			case StylePackage.STYLE_TYPE1__NEXT_STYLE_NAME:
				return getNextStyleName();
			case StylePackage.STYLE_TYPE1__PARENT_STYLE_NAME:
				return getParentStyleName();
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
			case StylePackage.STYLE_TYPE1__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case StylePackage.STYLE_TYPE1__AUTO_UPDATE:
				setAutoUpdate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.STYLE_TYPE1__CLASS:
				setClass((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__DATA_STYLE_NAME:
				setDataStyleName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL:
				setDefaultOutlineLevel((BigInteger)newValue);
				return;
			case StylePackage.STYLE_TYPE1__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__LIST_STYLE_NAME:
				setListStyleName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__MASTER_PAGE_NAME:
				setMasterPageName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__NAME:
				setName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__NEXT_STYLE_NAME:
				setNextStyleName((String)newValue);
				return;
			case StylePackage.STYLE_TYPE1__PARENT_STYLE_NAME:
				setParentStyleName((String)newValue);
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
			case StylePackage.STYLE_TYPE1__MAP:
				getMap().clear();
				return;
			case StylePackage.STYLE_TYPE1__AUTO_UPDATE:
				unsetAutoUpdate();
				return;
			case StylePackage.STYLE_TYPE1__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__DATA_STYLE_NAME:
				setDataStyleName(DATA_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL:
				setDefaultOutlineLevel(DEFAULT_OUTLINE_LEVEL_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__LIST_STYLE_NAME:
				setListStyleName(LIST_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__MASTER_PAGE_NAME:
				setMasterPageName(MASTER_PAGE_NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__NEXT_STYLE_NAME:
				setNextStyleName(NEXT_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.STYLE_TYPE1__PARENT_STYLE_NAME:
				setParentStyleName(PARENT_STYLE_NAME_EDEFAULT);
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
			case StylePackage.STYLE_TYPE1__MAP:
				return map != null && !map.isEmpty();
			case StylePackage.STYLE_TYPE1__AUTO_UPDATE:
				return isSetAutoUpdate();
			case StylePackage.STYLE_TYPE1__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case StylePackage.STYLE_TYPE1__DATA_STYLE_NAME:
				return DATA_STYLE_NAME_EDEFAULT == null ? dataStyleName != null : !DATA_STYLE_NAME_EDEFAULT.equals(dataStyleName);
			case StylePackage.STYLE_TYPE1__DEFAULT_OUTLINE_LEVEL:
				return DEFAULT_OUTLINE_LEVEL_EDEFAULT == null ? defaultOutlineLevel != null : !DEFAULT_OUTLINE_LEVEL_EDEFAULT.equals(defaultOutlineLevel);
			case StylePackage.STYLE_TYPE1__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case StylePackage.STYLE_TYPE1__LIST_STYLE_NAME:
				return LIST_STYLE_NAME_EDEFAULT == null ? listStyleName != null : !LIST_STYLE_NAME_EDEFAULT.equals(listStyleName);
			case StylePackage.STYLE_TYPE1__MASTER_PAGE_NAME:
				return MASTER_PAGE_NAME_EDEFAULT == null ? masterPageName != null : !MASTER_PAGE_NAME_EDEFAULT.equals(masterPageName);
			case StylePackage.STYLE_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StylePackage.STYLE_TYPE1__NEXT_STYLE_NAME:
				return NEXT_STYLE_NAME_EDEFAULT == null ? nextStyleName != null : !NEXT_STYLE_NAME_EDEFAULT.equals(nextStyleName);
			case StylePackage.STYLE_TYPE1__PARENT_STYLE_NAME:
				return PARENT_STYLE_NAME_EDEFAULT == null ? parentStyleName != null : !PARENT_STYLE_NAME_EDEFAULT.equals(parentStyleName);
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
		result.append(" (autoUpdate: ");
		if (autoUpdateESet) result.append(autoUpdate); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", dataStyleName: ");
		result.append(dataStyleName);
		result.append(", defaultOutlineLevel: ");
		result.append(defaultOutlineLevel);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", listStyleName: ");
		result.append(listStyleName);
		result.append(", masterPageName: ");
		result.append(masterPageName);
		result.append(", name: ");
		result.append(name);
		result.append(", nextStyleName: ");
		result.append(nextStyleName);
		result.append(", parentStyleName: ");
		result.append(parentStyleName);
		result.append(')');
		return result.toString();
	}

} //StyleType1Impl
